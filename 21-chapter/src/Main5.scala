/**
  * Created by Kamil on 14.01.2016.
  */
object Main5 {

  implicit def wrapString(string: String): StringWrapper = StringWrapper(string)

  def main(args: Array[String]) {

    stringWrapperMethod("Kamil")

  }

  def stringWrapperMethod[T <% StringWrapper](wrapper: T): Unit = {
    println("Wrapped string = " + wrapper.string)
  }

}

case class StringWrapper(string: String)
