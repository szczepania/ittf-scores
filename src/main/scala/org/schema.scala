package org

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

}
