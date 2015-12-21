
/**
  * Created by kamil on 21.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    val value = {
      import java.util.Random
      new Random().nextInt(10)
    }
    println("value = " + value)

  }

}
