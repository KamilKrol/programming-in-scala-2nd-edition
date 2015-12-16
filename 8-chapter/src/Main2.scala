/**
  * Created by kamil on 15.12.15.
  */
object Main2 {

  def main(args: Array[String]) {

    val a = sum _
    println("a(1,2,3) = " + a(1, 2, 3))

    val b = sum(1, _: Int, 3)
    println("b(2) = " + b(2))

    val bNew: (Int) => Int = sum(1, _, 3)
    println("bNew(2) = " + bNew(2))

  }

  def sum(a: Int, b: Int, c: Int) = a + b + c

}
