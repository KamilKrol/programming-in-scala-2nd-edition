/**
  * Created by kamil on 15.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    val list = List(1, 2, 3, 4, 5)

    list.foreach(println)

    println

    list.foreach(println _)

  }

}
