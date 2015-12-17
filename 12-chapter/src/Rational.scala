/**
  * Created by kamil on 17.12.15.
  */
class Rational(n: Int, d: Int) extends SimpleRational(n, d) with Ordered[Rational] {

  override def compare(that: Rational): Int = this.numer * that.denom - that.numer * this.denom

}

