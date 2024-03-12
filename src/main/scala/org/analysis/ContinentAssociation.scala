package org.analysis

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.col

object ContinentAssociation {

  val europeanISOcodes = List("ALB", "AND", "AUT", "BEL", "BLR", "BIH", "BGR", "HRV", "CRO", "MNE", "CZE", "DNK", "EST", "ENG", "FIN", "FRA", "GER", "GRC", "NLD", "NED", "ESP", "IRL", "ISL", "LIE", "LVA", "LIE", "LUX", "LTU", "MKD", "MLT", "MCO", "MDA", "DEU", "NOR", "POL", "PRT", "ROU", "SRB", "SMR", "SVK", "SVN", "SWE", "CHE", "UKR", "VAT", "HUN", "GBR", "ITA", "SLO", "KOS", "SCO", "POR", "DEN", "GGY", "MON", "SUI", "WAL", "ESA", "BUL", "GRE", "LAT", "JEY", "IMN", "COK", "GRN", "FRO")

  val asianISOcodes = List("AFG", "ARM", "AZE", "BHR", "BGD", "BTN", "BRN", "KHM", "CHN", "CYP", "GEO", "HKG", "IND", "IDN", "IRN", "IRQ", "ISR", "INA", "JPN", "JOR", "KAZ", "KWT", "KGZ", "LAO", "LBN", "MAS", "MYS", "MDV", "MNG", "MMR", "NPL", "KOR", "OMN", "PAK", "PSE", "PRK", "PHL", "QAT", "RUS", "SAU", "SGP", "LKA", "SYR", "TWN", "TJK", "THA", "TLS", "TUR", "TKM", "TPE", "ARE", "UZB", "VNM", "VIE", "YEM", "SRI", "BAN", "PLE", "UAE", "MAC", "PHI", "KSA", "MGL", "KUW", "IRI", "MYA", "CAM", "OMA")

  val africanISOcodes = List("ALG", "DZA", "AGO", "BEN", "BWA", "BFA", "BDI", "CMR", "CPV", "CAF", "TCD", "COM", "COG", "COD", "CIV", "DJI", "EGY", "GNQ", "ERI", "ETH", "GAB", "GMB", "GHA", "GIN", "GNB", "KEN", "LSO", "LBR", "LBY", "MDG", "MLI", "MWI", "MRT", "MUS", "MYT", "MAR", "MOZ", "NAM", "NER", "NEP", "NGA", "RSA", "REU", "RWA", "STP", "SEN", "SYC", "SLE", "SOM", "ZAF", "SSD", "SDN", "SWZ", "TZA", "TGO", "TOG", "TUN", "UGA", "ESH", "ZMB", "ZWE", "SUD", "SEY", "MRI", "LBA", "ANG", "NGR", "CGO", "MAD", "ZAM", "TAN", "MAW", "GUI")

  val americanISOcodes = List("CAN", "GRL", "MEX", "USA", "ARG", "BOL", "BRA", "CHL", "COL", "ECU", "GUY", "PRY", "PER", "SUR", "URY", "VEN", "ATG", "BHS", "BRB", "CUB", "DMA", "DOM", "GRD", "GUA", "HTI", "JAM", "KNA", "LCA", "VCT", "TTO", "BLZ", "CRI", "SLV", "GTM", "HND", "NIC", "PAN", "PUR", "FGU", "PAR", "URU", "ARU", "CRC", "BAR", "NCA", "HON", "CHI", "BIZ", "BAH", "SKN", "VIN", "HAI")

  val oceaniaISOcodes = List("AUS", "PNG", "NZL", "FJI", "FIJ", "SLB", "FSM", "VUT", "VAN", "WSM", "KIR", "TON", "MHL", "PLW", "NRU", "TUV", "NCL", "PYF", "SOL", "SAM")

  def countPlayersByContinent(df: DataFrame, isoCodes: List[String]): Long = {
    df.
      filter(
        col("assoc").isin(isoCodes: _*)
      )
      .count()
  }

}
