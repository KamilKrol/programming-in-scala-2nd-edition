/**
  * Created by Kamil on 02.02.2016.
  */
object Main7 {

  def main(args: Array[String]) {

    val list = List(1, 2, 3, 4, 5)

    val listView = list.view

    val mappedOnce = listView.map(_ + 2)
    println("mappedOnce = " + mappedOnce)

    val mappedTwice = mappedOnce.map(_ * 3)
    println("mappedTwice = " + mappedTwice)

    println("mappedTwice.force = " + mappedTwice.force)

  }

}
