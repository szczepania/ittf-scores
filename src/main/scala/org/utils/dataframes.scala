package org.utils

import org.schema.schema.{playerInfoSchema, playerSchema}
import org.utils.FileUtils.readFiles
import org.utils.SparkUtils.spark

object dataframes {

  val playerInfoDF = readFiles(
    spark,
    playerInfoSchema,
    "data/csv/ittf_player_info.csv"
  )

  val menIndividualsRankingDF = readFiles(
    spark,
    playerSchema,
    "data/csv/individuals/men/ittf_rankings_mens.csv"
  )
    .drop("previous", "gender", "previousPoints", "weekNum", "monthNum", "yearNum")

  val womenIndividualsRankingDF = readFiles(
    spark,
    playerSchema,
    "data/csv/individuals/women/ittf_rankings_women.csv"
  )
    .drop("previous", "gender", "previousPoints", "weekNum", "monthNum", "yearNum")
}
