/**
  * Created by kamil on 23.12.15.
  */
object Main3 {

  def main(args: Array[String]) {

    val map = Map("Poland" -> "Warsaw", "France" -> "Paris")
    val polishCapital = map get "Poland"
    val usCapital = map get "USA"

    printCapital(polishCapital)
    printCapital(usCapital)

  }

  def printCapital(capital: Option[String]): Unit = {
    capital match {
      case Some(x) => println("Capital = " + x)
      case None => println("No capital")
    }
  }

}
