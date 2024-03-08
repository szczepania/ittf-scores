package org.model

object Model {

  case class PlayerInfo(
                         playerId: Int,
                         name: String,
                         assoc: String,
                         gender: String,
                         birthYear: Option[Int],
                         activity: Option[String],
                         playingHand: Option[String],
                         playingStyle: Option[String],
                         grip: Option[String]
                       )

  case class SinglesRanking(
                          rank: Int,
                          previous: Double,
                          id: Int,
                          assoc: String,
                          gender: String,
                          name: String,
                          points: Int,
                          previousPoints: Int,
                          weekNum: Int,
                          monthNum: Int,
                          yearNum: Int
                        )

  case class DoublesRanking(
                             rankOnly: Int,
                             rankChange: String,
                             name: String,
                             assoc: String,
                             points: Int
                           )
}
