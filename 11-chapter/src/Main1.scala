/**
  * Created by kamil on 16.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    val a: String = null
    println(a)
    println(a == null)

    try {
      printInt(error("Error"))
    } catch {
      case exc: RuntimeException => println("Exception caught!")
    }

  }

  def printInt(value: Int) = println("value = " + value)

  def error(message: String): Nothing =
    throw new RuntimeException(message)

}
