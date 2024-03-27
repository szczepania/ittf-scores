package org

import org.analysis.ContinentAssociation._
import org.analysis.DataMetrics._

object Main extends App {

  println(s"Percentage of female players: $womenPercentageCount")
  println(s"Percentage of male players: $menPercentageCount")

  println(s"Percentage of active players: $activePercentageCount")
  println(s"Percentage of inactive players: $inactivePercentageCount")

  println(s"Percentage of left-handed players: $leftHandedPercentageCount")
  println(s"Percentage of right-handed players: $rightHandedPercentageCount")

  println(s"Percentage of attacking players: $attackerPercentageCount")
  println(s"Percentage of defending players: $defenderPercentageCount")

  println(s"Percentage of players using shakehand grip: $shakehandPercentageCount")
  println(s"Percentage of players using penhold grip: $penholdPercentageCount")

  println(s"Number of european male players: $europeanMalePlayers")
  println(s"Number of asian male players: $asianMalePlayers")
  println(s"Number of american male players: $americanMalePlayers")
  println(s"Number of african male players: $africanMalePlayers")
  println(s"Number of oceanian male players: $oceanianMalePlayers")

}

