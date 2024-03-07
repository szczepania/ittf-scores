package org.utils

import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.{DataFrame, SparkSession}

object FileUtils {

  def readFiles(spark: SparkSession, schema: StructType, file: String): DataFrame = {
    spark
      .read
      .schema(schema)
      .option("header", "true")
      .csv(file)
  }

}
