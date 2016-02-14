/**
  * Created by Kamil on 14.02.2016.
  */
object Main2 {

  val Decimal = """(-)?(\d+)(\.\d*)?""".r

  def main(args: Array[String]) {

    printDecimal("-1.25")
    printDecimal("2.5")

  }

  def printDecimal(dec: String): Unit = {
    val Decimal(sign, integerPart, decimalPart) = dec
    println("Sign = " + sign + ", integerPart = " + integerPart + ", decimalPart = " + decimalPart)
  }


}
