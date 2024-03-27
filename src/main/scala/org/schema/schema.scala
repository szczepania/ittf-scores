package org.schema

import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}

object schema {

  val playerInfoSchema: StructType = StructType(
    StructField("playerId", IntegerType) ::
      StructField("name", StringType) ::
      StructField("assoc", StringType) ::
      StructField("gender", StringType) ::
      StructField("birthYear", StringType, nullable = true) ::
      StructField("activity", StringType, nullable = true) ::
      StructField("playingHand", StringType, nullable = true) ::
      StructField("playingStyle", StringType, nullable = true) ::
      StructField("grip", StringType, nullable = true) :: Nil
  )

  val playerSchema: StructType = StructType(
    StructField("rank", IntegerType) ::
      StructField("previous", IntegerType) ::
      StructField("id", IntegerType) ::
      StructField("assoc", StringType) ::
      StructField("gender", StringType) ::
      StructField("name", StringType) ::
      StructField("points", IntegerType) ::
      StructField("previousPoints", IntegerType) ::
      StructField("weekNum", IntegerType) ::
      StructField("monthNum", IntegerType) ::
      StructField("yearNum", IntegerType) :: Nil
  )

}
