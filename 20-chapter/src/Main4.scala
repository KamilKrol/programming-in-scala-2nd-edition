/**
  * Created by kamil on 07.01.16.
  */
object Main4 {

  def main(args: Array[String]) {

    println(Color.values)
    println(Color.Blue)

    println

    println(Direction.values)
    println(Direction.N)

    println

    println(Direction.S.id)
    println(Direction(3))

  }

  object Color extends Enumeration {
    val Red = Value
    val Blue = Value
    val Yellow = Value
  }

  object Direction extends Enumeration {
    val N = Value("North")
    val S = Value("South")
    val W = Value("West")
    val E = Value("East")
  }

}
