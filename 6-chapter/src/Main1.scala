/**
  * Created by kamil on 14.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    val half = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)

    println("half = " + half)
    println("half.add(twoThirds) = " + half.add(twoThirds))
    println("half lessThan twoThirds = " + (half lessThan twoThirds))
    println("half max twoThirds = " + (half max twoThirds))

    println

    val one = new Rational(1)
    val two = new Rational(2)

    println("one = " + one)
    println("two = " + two)

  }

}
