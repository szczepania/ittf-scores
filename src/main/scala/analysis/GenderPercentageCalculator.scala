package analysis

import org.apache.spark.sql.DataFrame

object GenderPercentageCalculator {

  def calculateGenderPercentage(df: DataFrame, col: String, gender: String): Double = {
    val totalPlayer = df.count()
    val femaleCount = df.where(s"$col == '$gender'").count()

    if (totalPlayer > 0) {
      Math.round((femaleCount.toDouble / totalPlayer) * 100)
    } else {
      0.0
    }
  }

}
