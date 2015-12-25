/**
  * Created by kamil on 25.12.15.
  */
object Main3 {

  def main(args: Array[String]) {

    val keys = List(1, 2, 3)
    val names = List("Kamil", "Andrzej", "Mateusz")

    val zippedList = keys zip names
    println(zippedList)
    println(zippedList.unzip._1 + " " + zippedList.unzip._2)

    println(names.mkString("[", ", ", "]"))

    val sb = new StringBuilder("Names = ")
    names.addString(sb, "[", ", ", "]")
    println(sb.toString())

  }

}
