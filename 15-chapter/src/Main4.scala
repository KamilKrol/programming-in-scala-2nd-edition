import expressions._

/**
  * Created by kamil on 23.12.15.
  */
object Main4 {

  def main(args: Array[String]) {

    val (a, b) = (1, 2)
    println("a = " + a + " b = " + b)

    val BinOp(op, left, right) = BinOp("*", Num(5),Num(6))
    println("op = " + op + " left = " + left + " right = " + right)

  }

}
