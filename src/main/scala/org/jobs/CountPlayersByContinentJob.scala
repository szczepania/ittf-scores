package org.jobs

import org.analysis.ContinentAssociation
import org.apache.logging.log4j.scala.Logging
import org.apache.spark.sql.SparkSession
import org.utils.dataframes.mensIndividualsRankingDF

object CountPlayersByContinentJob extends Logging {

  def runCountPlayersByContinentJob(spark: SparkSession): Long = {
    val continentAssociation = new ContinentAssociation

    logger.info("Calculating players associated to Europe")
    continentAssociation.countPlayersByContinent(mensIndividualsRankingDF, continentAssociation.europeanISOcodes)

    logger.info("Calculating players associated to Asia")
    continentAssociation.countPlayersByContinent(mensIndividualsRankingDF, continentAssociation.asianISOcodes)

    logger.info("Calculating players associated to America")
    continentAssociation.countPlayersByContinent(mensIndividualsRankingDF, continentAssociation.americanISOcodes)

    logger.info("Calculating players associated to Africa")
    continentAssociation.countPlayersByContinent(mensIndividualsRankingDF, continentAssociation.africanISOcodes)

    logger.info("Calculating players associated to Oceania")
    continentAssociation.countPlayersByContinent(mensIndividualsRankingDF, continentAssociation.oceaniaISOcodes)

  }
}