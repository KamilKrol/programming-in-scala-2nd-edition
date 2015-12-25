/**
  * Created by kamil on 25.12.15.
  */
object Main4 {

  def main(args: Array[String]) {

    val list = List(9, 2, 3, 4, 1, 2, 3)
    val sortedList = list sortWith naturalOrder
    println(sortedList)

  }

  def naturalOrder(x: Int, y: Int): Boolean = x < y

}
