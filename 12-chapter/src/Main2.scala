/**
  * Created by kamil on 17.12.15.
  */
object Main2 {

  def main(args: Array[String]) {

    val twoThird = new Rational(2, 3)
    val half = new Rational(1, 2)

    println(twoThird < half)
    println(twoThird <= half)
    println(twoThird >= half)

  }

}
