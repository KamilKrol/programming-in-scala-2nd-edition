/**
  * Created by kamil on 25.12.15.
  */
object Main5 {

  def main(args: Array[String]) {

    val list = List.fill(5)("Kamil")
    println(list)

    val squares = List.tabulate(5)(n => n * n)
    println(squares)

  }

}
