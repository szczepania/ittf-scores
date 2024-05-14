package org.jobs

import org.analysis.ContinentAssociation
import org.apache.logging.log4j.scala.Logging
import org.apache.spark.sql.SparkSession
import org.utils.dataframes._

object CountPlayersByContinentJob extends Logging {

  def runCountMalePlayersByContinentJob(spark: SparkSession): Long = {
    val continentAssociation = new ContinentAssociation

    logger.info("Calculating male players associated to Europe")
    continentAssociation.countPlayersByContinent(menIndividualsRankingDF, continentAssociation.europeanISOcodes)

    logger.info("Calculating male players associated to Asia")
    continentAssociation.countPlayersByContinent(menIndividualsRankingDF, continentAssociation.asianISOcodes)

    logger.info("Calculating male players associated to America")
    continentAssociation.countPlayersByContinent(menIndividualsRankingDF, continentAssociation.americanISOcodes)

    logger.info("Calculating male players associated to Africa")
    continentAssociation.countPlayersByContinent(menIndividualsRankingDF, continentAssociation.africanISOcodes)

    logger.info("Calculating male players associated to Oceania")
    continentAssociation.countPlayersByContinent(menIndividualsRankingDF, continentAssociation.oceaniaISOcodes)

  }

  def runCountFemalePlayersByContinentJob(spark: SparkSession): Long = {
    val continentAssociation = new ContinentAssociation

    logger.info("Calculating female players associated to Europe")
    continentAssociation.countPlayersByContinent(womenIndividualsRankingDF, continentAssociation.europeanISOcodes)

    logger.info("Calculating female players associated to Asia")
    continentAssociation.countPlayersByContinent(womenIndividualsRankingDF, continentAssociation.asianISOcodes)

    logger.info("Calculating female players associated to America")
    continentAssociation.countPlayersByContinent(womenIndividualsRankingDF, continentAssociation.americanISOcodes)

    logger.info("Calculating female players associated to Africa")
    continentAssociation.countPlayersByContinent(womenIndividualsRankingDF, continentAssociation.africanISOcodes)

    logger.info("Calculating female players associated to Oceania")
    continentAssociation.countPlayersByContinent(womenIndividualsRankingDF, continentAssociation.oceaniaISOcodes)

  }
}