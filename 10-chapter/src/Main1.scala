/**
  * Created by kamil on 16.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    val list1 = List(1, 2, 3)
    val list2 = List("a", "b", "c")

    println(list1 zip list2)

    val yieldedList = for ((i, j) <- list1 zip list2) yield ("0"+i, j)
    println(yieldedList)

  }

}
