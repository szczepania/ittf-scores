package org

import org.analysis.CountryAssociation._
import org.analysis.DataMetrics._
import org.dataframes.dataframes.mensIndividualsRankingDF

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

  private val europeanMalePlayers = countPlayersByContinent(mensIndividualsRankingDF, europeanISOcodes)
  private val asianMalePlayers = countPlayersByContinent(mensIndividualsRankingDF, asianISOcodes)
  private val americanMalePlayers = countPlayersByContinent(mensIndividualsRankingDF, americanISOcodes)
  private val africanMalePlayers = countPlayersByContinent(mensIndividualsRankingDF, africanISOcodes)
  private val oceanianMalePlayers = countPlayersByContinent(mensIndividualsRankingDF, oceaniaISOcodes)

  println(s"Number of european male players: $europeanMalePlayers")
  println(s"Number of asian male players: $asianMalePlayers")
  println(s"Number of american male players: $americanMalePlayers")
  println(s"Number of african male players: $africanMalePlayers")
  println(s"Number of oceanian male players: $oceanianMalePlayers")

}

