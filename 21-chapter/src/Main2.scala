import currencies.{Dollar, Euro}

/**
  * Created by Kamil on 13.01.2016.
  */
object Main2 {

  def main(args: Array[String]) {

    val euro = new Euro(1000)
    val dollar = new Dollar(1000)

    euroMethod(euro)
    euroMethod(dollar)

  }

  def euroMethod(euro: Euro): Unit = {
    println("euroMethod = " + euro)
  }

}
