/**
  * Created by Kamil on 13.01.2016.
  */
package object currencies {

  abstract class Currency(amount: Double, symbol: String) {
    def getAmount = amount

    override def toString = amount + " " + symbol
  }

  class Dollar(amount: Double) extends Currency(amount, "USD")

  object Dollar {
    implicit def dollarToEuro(dollar: Dollar): Euro = new Euro(0.95 * dollar.getAmount)
  }

  class Euro(amount: Double) extends Currency(amount, "EUR")

}
