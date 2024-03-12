package analysisTest

import org.analysis.CountryAssociation
import org.analysis.CountryAssociation._
import utils.SparkSessionWrapperTest

class CountryAssociationTest extends SparkSessionWrapperTest {
  val countryAssociation = CountryAssociation

  "countPlayersByCountry" should "count number of players from specified continent" in {
    val result = countryAssociation.countPlayersByContinent(testDF, europeanISOcodes)

    result shouldEqual 3
  }

  it should "return 0 if total players count is equal to 0" in {
    val result = countryAssociation.countPlayersByContinent(emptyDF, europeanISOcodes)

    result shouldEqual 0
  }

}
