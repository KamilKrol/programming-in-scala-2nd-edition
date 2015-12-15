import scala.util.control.Breaks._

/**
  * Created by kamil on 15.12.15.
  */
object Main4 {

  def main(args: Array[String]) {

    breakable {
      var i = 0
      while (true) {
        i += 1
        println(i)
        if (i == 5) break()
      }
    }

  }

}
