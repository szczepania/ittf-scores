import org.apache.spark.sql.{DataFrame, SparkSession}

object Main extends App {

  val spark = SparkSession.builder().master("local[*]").getOrCreate()

  def readFiles(file: String): DataFrame = {
    spark
      .read
      .option("inferSchema", "true")
      .option("header", "true")
      .csv(file)
  }

}
