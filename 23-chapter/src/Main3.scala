/**
  * Created by Kamil on 02.02.2016.
  */
object Main3 {

  def main(args: Array[String]) {

    val list = List(1, 2, 3, 4, 5)

    val withFilter = list.withFilter(_ > 2)
    println(withFilter.map(_ * 2))

    val spannedList = list.span(_ != 3)
    println("spannedList = " + spannedList)

  }

}
