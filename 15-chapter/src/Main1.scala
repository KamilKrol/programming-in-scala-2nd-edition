import expressions._

/**
  * Created by kamil on 23.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    val doubleNegation = UnOp("-", UnOp("-", Num(10)))
    println(doubleNegation + " => " + simplifyTop(doubleNegation) + " => " + simplifyAll(doubleNegation))

    val addingZero = BinOp("+", Num(20), Num(0))
    println(addingZero + " => " + simplifyTop(addingZero) + " => " + simplifyAll(addingZero))

    val multiplyingByOne = BinOp("*", Num(30), Num(1))
    println(multiplyingByOne + " => " + simplifyTop(multiplyingByOne) + " => " + simplifyAll(multiplyingByOne))

    val doubleAbs = UnOp("abs", UnOp("abs", Num(40)))
    println(doubleAbs + " => " + simplifyTop(doubleAbs) + " => " + simplifyAll(doubleAbs))

    val addition = BinOp("+", Num(25), Num(25))
    println(addition + " => " + simplifyAdd(addition) + " => " + simplifyAll(addition))

  }

}
