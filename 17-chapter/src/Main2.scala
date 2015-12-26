import scala.collection.immutable.TreeSet

/**
  * Created by kamil on 26.12.15.
  */
object Main2 {

  def main(args: Array[String]) {

    var numbers = TreeSet(1, 2, 3)
    println(numbers)

    numbers += 4
    println(numbers)

    numbers ++= List(5, 6)
    println(numbers)

    numbers -= 4
    println(numbers)

    numbers --= List(5,6)
    println(numbers)

  }

}
