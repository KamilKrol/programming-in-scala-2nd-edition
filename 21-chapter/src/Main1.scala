/**
  * Created by Kamil on .01.2016.
  */
object Main1 {

  implicit def intToWrapperNumber(value: Int): WrappedNumber = new WrappedNumber(value)

  def main(args: Array[String]) {

    printWrappedNumber(1)
    printWrappedNumber(2)

  }

  def printWrappedNumber(wrappedNumber: WrappedNumber): Unit = println("wrappedNumber = " + wrappedNumber)

}

case class WrappedNumber(number: Int)
