/**
  * Created by kamil on 25.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    val nums = 1 :: 2 :: 3 :: 4 :: Nil
    println("nums = " + nums)

    val first :: second :: rest = nums
    println("first = " + first + ", second = " + second + ", rest = " + rest)

  }

}
