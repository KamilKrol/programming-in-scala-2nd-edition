/**
  * Created by kamil on 14.12.15.
  */
object Main3 {

  def main(args: Array[String]) {

    val half = new Rational(1, 2)
    val oneThird = new Rational(1, 3)
    val calc1 = half + oneThird * oneThird
    val calc2 = (half + oneThird) * oneThird

    println("calc1 = " + calc1)
    println("calc2 = " + calc2)

  }

}
