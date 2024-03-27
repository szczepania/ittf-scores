package analysisTest

import org.analysis.{ContinentAssociation}
import utils.SparkSessionWrapperTest

class ContinentAssociationTest extends SparkSessionWrapperTest {
  val countryAssociation = new ContinentAssociation

  "countPlayersByCountry" should "count number of players from specified continent" in {
    val result = countryAssociation.countPlayersByContinent(testDF, countryAssociation.europeanISOcodes)

    result shouldEqual 3
  }

  it should "return 0 if total players count is equal to 0" in {
    val result = countryAssociation.countPlayersByContinent(emptyDF, countryAssociation.europeanISOcodes)

    result shouldEqual 0
  }

}
