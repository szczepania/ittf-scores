package analysisTest

import org.analysis.GenderPercentageCalculator
import utils.SparkSessionWrapperTest

class CalculatorsTest extends SparkSessionWrapperTest {
  val genderCalculator = GenderPercentageCalculator

  "calculateGenderPercentage" should "return 50 for a balanced gender distribution" in {
    val result = genderCalculator.calculateGenderPercentage(testDF, "gender", "Female")

    result shouldEqual 50
  }

  it should "return 0 if total players count is equal to 0" in {
    val result = genderCalculator.calculateGenderPercentage(emptyDF, "gender", "Female")

    result shouldEqual 0
  }

  it should "return 0 if specified gender is not presented in DataFrame" in {
    val result = genderCalculator.calculateGenderPercentage(testDF, "gender", "Non-binary")

    result shouldEqual 0
  }

}
