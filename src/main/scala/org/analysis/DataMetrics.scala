package org.analysis

import org.apache.spark.sql.DataFrame
import org.schema.playerInfoSchema
import org.utils.FileUtils.readFiles
import org.utils.SparkUtils.spark

object DataMetrics {

  def calculatePercentageOccurrence(df: DataFrame, col: String, gender: String): Double = {
    val totalPlayer = df.count()
    val femaleCount = df.where(s"$col == '$gender'").count()

    if (totalPlayer > 0) {
      Math.round((femaleCount.toDouble / totalPlayer) * 100)
    } else {
      0.0
    }
  }

  val playerInfoDF = readFiles(spark, playerInfoSchema, "data/csv/ittf_player_info.csv")

  val genderColumn = "gender"
  val man = "Male"
  val woman = "Female"

  val womenPercentage = calculatePercentageOccurrence(playerInfoDF, genderColumn, woman)
  val menPercentage = calculatePercentageOccurrence(playerInfoDF, genderColumn, man)

}
