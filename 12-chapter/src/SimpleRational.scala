/**
  * Created by kamil on 14.12.15.
  */
class SimpleRational(n: Int, d: Int) {
  require(d != 0)

  private val g = gdc(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  override def toString = numer + "/" + denom

  private def gdc(a: Int, b: Int): Int =
    if (b == 0) a else gdc(b, a % b)
}
