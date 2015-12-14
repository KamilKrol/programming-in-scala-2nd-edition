/**
  * Created by kamil on 14.12.15.
  */
object Main2 {

  def main(args: Array[String]) {

    val s = 'symbol
    println(s)

    update(s, 1)

  }

  def update(symbol: Symbol, value: Any): Unit = {
    println("symbol = " + symbol + " symbol.name = " + symbol.name + " value = " + value)
  }

}
