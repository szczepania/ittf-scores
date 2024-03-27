package org.jobs

import org.analysis.DataMetrics
import org.apache.logging.log4j.scala.Logging
import org.apache.spark.sql.SparkSession
import org.utils.columns.{active, activityColumn, attacker, defender, genderColumn, gripColumn, handTypeColumn, inactive, leftHanded, man, penhold, playingStyleColumn, rightHanded, shakehand, woman}
import org.utils.dataframes.playerInfoDF

object CountPlayersJob extends Logging {

  def runCountPlayersJob(spark: SparkSession): Double = {
    val metrics = new DataMetrics

    logger.info("Calculating percentage of women in the game")
    metrics.calculatePercentageOccurrence(playerInfoDF, genderColumn, woman)

    logger.info("Calculating percentage of men in the game")
    metrics.calculatePercentageOccurrence(playerInfoDF, genderColumn, man)

    logger.info("Calculating active players")
    metrics.calculatePercentageOccurrence(playerInfoDF, activityColumn, active)

    logger.info("Calculating inactive players")
    metrics.calculatePercentageOccurrence(playerInfoDF, activityColumn, inactive)

    logger.info("Calculating left handers")
    metrics.calculatePercentageOccurrence(playerInfoDF, handTypeColumn, leftHanded)

    logger.info("Calculating right handers")
    metrics.calculatePercentageOccurrence(playerInfoDF, handTypeColumn, rightHanded)

    logger.info("Calculating number of attackers in the game")
    metrics.calculatePercentageOccurrence(playerInfoDF, playingStyleColumn, attacker)

    logger.info("Calculating number of defenders in the game")
    metrics.calculatePercentageOccurrence(playerInfoDF, playingStyleColumn, defender)

    logger.info("Calculating number of players using shakehand grip play style")
    metrics.calculatePercentageOccurrence(playerInfoDF, gripColumn, shakehand)

    logger.info("Calculating number of players using penhold grip play style")
    metrics.calculatePercentageOccurrence(playerInfoDF, gripColumn, penhold)
  }
}
