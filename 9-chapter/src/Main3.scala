/**
  * Created by kamil on 16.12.15.
  */
object Main3 {

  def main(args: Array[String]) {

    println(twice(addFive, 1))

  }

  def twice(op: Double => Double, value: Double) = op(op(value))

  def addFive(value: Double) = value + 5

}
