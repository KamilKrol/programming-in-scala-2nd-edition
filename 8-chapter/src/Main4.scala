/**
  * Created by kamil on 15.12.15.
  */
object Main4 {

  def main(args: Array[String]) {

    val list = List(-10, -5, 0, 5)
    var sum = 0

    list.foreach(sum += _)

    println("sum = " + sum)

  }

}
