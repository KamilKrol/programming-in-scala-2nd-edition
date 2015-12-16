/**
  * Created by kamil on 15.12.15.
  */
object Main7 {

  def main(args: Array[String]) {

    print(1, 2, 3)
    print(c = 3, b = 2, a = 1)

    printWithDefaults("normal a", "normal b")
    printWithDefaults("normal a")
    printWithDefaults(b = "normal b")

  }

  def print(a: Int, b: Int, c: Int) = println("a = " + a + " b = " + b + " c = " + c)

  def printWithDefaults(a: String = "default a", b: String = "default b") = println("a = '" + a + "' b = '" + b + "'")

}
