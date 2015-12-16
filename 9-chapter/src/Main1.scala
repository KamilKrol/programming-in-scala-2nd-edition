/**
  * Created by kamil on 15.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    val list = List("Kamil", "Mateusz", "J-C")

    println(StringMatcher.stringsContaining(list, "a"))
    println(StringMatcher.stringsEnding(list, "C"))

  }

}
