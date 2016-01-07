/**
  * Created by kkrol on 07/01/2016.
  */
trait Abstract {
  type T

  def transform(x: T): T

  val initial: T
  var current: T

}
