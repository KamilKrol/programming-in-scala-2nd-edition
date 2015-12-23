import expressions._
/**
  * Created by kamil on 23.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    val doubleNegation = UnOp("-", UnOp("-", Num(10)))
    println(doubleNegation)
    println(simplifyTop(doubleNegation))

    val addingZero = BinOp("+", Num(20), Num(0))
    println(addingZero)
    println(simplifyTop(addingZero))

    val multiplyingByOne = BinOp("*", Num(30), Num(1))
    println(multiplyingByOne)
    println(simplifyTop(multiplyingByOne))

  }

}
