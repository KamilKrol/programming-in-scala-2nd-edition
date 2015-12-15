/**
  * Created by kamil on 15.12.15.
  */
object Main3 {

  def main(args: Array[String]) {

    try {
      val halfOf4 = half(4)
      println(halfOf4)
      val halfOf3 = half(3)
      println(halfOf3)
    } catch {
      case exc: RuntimeException => println("Runtime catched!")
    } finally println("Finally")

    println

    println("calculate1 = " + calculate1)
    println("calculate2 = " + calculate2)

  }

  def half(value: Int) =
    if (value % 2 == 0) value / 2
    else throw new RuntimeException("value needs to be even!")

  def calculate1(): Int = try {
    2
  } finally {
    3
  }

  def calculate2(): Int = try {
    return 2
  } finally {
    return 3
  }

}
