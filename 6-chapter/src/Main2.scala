/**
  * Created by kamil on 14.12.15.
  */
object Main2 {

  def main(args: Array[String]) {

    val half = new Rational(100, 200)
    val oneThird = new Rational(42, 126)

    println("half = " + half)
    println("oneThird = " + oneThird)

    val sum = half + oneThird
    val mult = half * oneThird

    println("sum = " + sum)
    println("mult = " + mult)

  }

}
