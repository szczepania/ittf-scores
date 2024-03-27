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

  val mensIndividualsRankingDF = readFiles(
    spark,
    playerSchema,
    "data/csv/individuals/mens/ittf_rankings_mens.csv"
  )
    .drop("previous", "gender", "previousPoints", "weekNum", "monthNum", "yearNum")

}
