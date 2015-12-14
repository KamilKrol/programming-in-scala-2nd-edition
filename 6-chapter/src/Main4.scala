/**
  * Created by kamil on 14.12.15.
  */
object Main4 {

  implicit def intToRational(value: Int): Rational = new Rational(value)

  def main(args: Array[String]) {

    val half = new Rational(1, 2)

    println(half + 2)
    println(half - 1)
    println(half * 2)
    println(half / 2)

    println

    println(2 + half)
    println(2 * half)

  }

}
