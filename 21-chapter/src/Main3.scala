/**
  * Created by Kamil on 13.01.2016.
  */
object Main3 {

  implicit def stringToBetterString(string: String): BetterString = new BetterString(string)

  def main(args: Array[String]) {

    "abc".printString()

  }

  class BetterString(string: String) {
    def printString(): Unit = {
      println("BetterString = " + string + "(" + string.length + ")")
    }
  }

}
