/**
  * Created by kamil on 14.12.15.
  */
class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gdc(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  override def toString = numer + "/" + denom

  def +(that: Rational) = add(that)

  def +(i: Int) =
    new Rational(numer + i * denom, denom)

  def -(that: Rational) =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def -(i: Int) =
    new Rational(numer - i * denom, denom)

  def *(that: Rational) =
    new Rational(
      this.numer * that.numer,
      this.denom * that.denom
    )

  def *(i: Int) =
    new Rational(i * numer, denom)

  def /(that: Rational) =
    new Rational(
      this.numer * that.denom,
      this.denom * that.numer
    )

  def /(i: Int) =
    new Rational(numer, denom * i)

  def add(that: Rational) =
    new Rational(
      this.numer * that.denom + that.numer * this.denom,
      this.denom * that.denom
    )

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this lessThan that) that else this

  private def gdc(a: Int, b: Int): Int =
    if (b == 0) a else gdc(b, a % b)
}
