/**
  * Created by kamil on 25.12.15.
  */
object Main2 {

  def main(args: Array[String]) {

    val list = List(1, 2, 3, 4, 5)
    println("head = " + list.head + ", tail = " + list.tail + ", init = " + list.init + ", last = " + list.last)

    println("reversed list = " + reverse(list))

  }

  def reverse(list: List[Int]): List[Int] = list match {
    case List() => list
    case head :: tail => reverse(tail) ::: List(head)
  }

}
