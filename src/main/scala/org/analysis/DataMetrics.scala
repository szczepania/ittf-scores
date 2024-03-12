package org.analysis

import org.apache.spark.sql.DataFrame
import org.dataframes.dataframes.playerInfoDF

object DataMetrics {

  def calculatePercentageOccurrence(df: DataFrame, col: String, value: String): Double = {
    val totalPlayer = df.count()
    val valueCount = df.where(s"$col == '$value'").count()

    if (totalPlayer > 0) {
      Math.round((valueCount.toDouble / totalPlayer) * 100)
    } else {
      0.0
    }
  }

  val genderColumn = "gender"
  val activityColumn = "activity"
  val handTypeColumn = "playingHand"
  val playingStyleColumn = "playingStyle"
  val gripColumn = "grip"

  // Values for gender column
  val man = "Male"
  val woman = "Female"

  // Values for activity type:
  val active = "Active"
  val inactive = "Inactive"

  // Values for playing hand type:
  val leftHanded = "Left-handed"
  val rightHanded = "Right-handed"

  // Values for playing style:
  val attacker = "Attacker"
  val defender = "Defender"

  // Values for grip type:
  val shakehand = "Shakehand"
  val penhold = "Penhold"

  val womenPercentageCount = calculatePercentageOccurrence(playerInfoDF, genderColumn, woman)
  val menPercentageCount = calculatePercentageOccurrence(playerInfoDF, genderColumn, man)

  val activePercentageCount = calculatePercentageOccurrence(playerInfoDF, activityColumn, active)
  val inactivePercentageCount = calculatePercentageOccurrence(playerInfoDF, activityColumn, inactive)

  val leftHandedPercentageCount = calculatePercentageOccurrence(playerInfoDF, handTypeColumn, leftHanded)
  val rightHandedPercentageCount = calculatePercentageOccurrence(playerInfoDF, handTypeColumn, rightHanded)

  val attackerPercentageCount = calculatePercentageOccurrence(playerInfoDF, playingStyleColumn, attacker)
  val defenderPercentageCount = calculatePercentageOccurrence(playerInfoDF, playingStyleColumn, defender)

  val shakehandPercentageCount = calculatePercentageOccurrence(playerInfoDF, gripColumn, shakehand)
  val penholdPercentageCount = calculatePercentageOccurrence(playerInfoDF, gripColumn, penhold)

}
