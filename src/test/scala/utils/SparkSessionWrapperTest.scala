package utils

import org.apache.spark.sql.{DataFrame, Row, SparkSession}
import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.schema.playerInfoSchema

class SparkSessionWrapperTest extends AnyFlatSpec with Matchers with BeforeAndAfterAll {

  val spark = SparkSession
    .builder()
    .appName("Test")
    .master("local[*]")
    .getOrCreate()

  val testData = Seq(
    Row(1, "AAMAN Erik", "SWE", "Male", "1994", "Active", "Right-handed", "Attacker", "Shakehand"),
    Row(2, "AASEBO Anna", "NOR", "Female", "1997", "Active", "Right-handed", "Attacker", "Shakehand"),
    Row(3, "AAS Ali", "ESP", "Male", "1988", "Inactive", "Left-handed", "Attacker", "Shakehand"),
    Row(4, "ABAIBEE Elena", "RUS", "Female", "1997", "Active", "Right-handed", "Defender", "Penhold")
  )

  val emptyDF: DataFrame = spark.createDataFrame(spark.sparkContext.emptyRDD[Row], playerInfoSchema)

  val testDF: DataFrame = spark.createDataFrame(spark.sparkContext.parallelize(testData), playerInfoSchema)

  override def beforeAll(): Unit = {
    spark.sparkContext.setLogLevel("ERROR")
  }

}
