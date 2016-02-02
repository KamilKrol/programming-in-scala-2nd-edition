/**
  * Created by Kamil on 02.02.2016.
  */
object Main5 {

  def main(args: Array[String]) {

    val list1 = List(1, 2, 3, 4, 5)
    val list2 = List("a", "b", "c", "d", "e")

    val zippedList = list1.zip(list2)
    println("zippedList = " + zippedList)

    val zippedWithIndex = list2.zipWithIndex
    println("zippedWithIndex = " + zippedWithIndex)

  }

}
