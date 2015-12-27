/**
  * Created by kamil on 26.12.15.
  */
class Time(_hour: Int, _minute: Int) {

  private[this] var h = _hour
  var minute = _minute

  def hour_=(_hour: Int) {
    println("hour setter invoked!")
    h = _hour
  }

  def hour = h

  override def toString = h + ":" + minute

}
