/**
  * Created by kkrol on 07/01/2016.
  */
class Concrete extends Abstract {
  override type T = String

  override def transform(x: String) = x + " + transformed"

  override val initial: T = "hi"
  override var current: T = initial
}
