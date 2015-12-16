/**
  * Created by kamil on 16.12.15.
  */
object Main2 {

  def main(args: Array[String]) {

    println(plainOldSum(1, 3))
    println(curriedSum(1)(3))

    println

    val addTwo = curriedSum(2) _
    println(addTwo(1))

    println

    def first(x: Int) = (y: Int) => x + y
    val second = first(2)
    println(second(1))

  }

  def plainOldSum(a: Int, b: Int) = a + b

  def curriedSum(a: Int)(b: Int) = a + b


}
