package org.analysis

import org.apache.spark.sql.DataFrame

import org.apache.logging.log4j.scala.Logging

class DataMetrics extends Logging {

  def calculatePercentageOccurrence(df: DataFrame, col: String, value: String): Double = {
    val totalPlayer = df.count()
    val valueCount = df.where(s"$col == '$value'").count()

    logger.info(s"Number of total players: $totalPlayer")
    logger.info(s"Counting for column name: $col")
    logger.info(s"Value counted: $value")

    if (totalPlayer > 0) {
      val calculatedNumberOfPlayers = Math.round((valueCount.toDouble / totalPlayer) * 100)

      logger.info(s"Calculated percentage number of players is $calculatedNumberOfPlayers")
      calculatedNumberOfPlayers
    } else {
      logger.error("There are no players")
      0.0
    }
  }

}
