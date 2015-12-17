import traits._

/**
  * Created by kamil on 17.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    val frog = new Frog
    val philosophical : Philosophical = frog

    frog.philosophize()
    philosophical.philosophize()

    println(frog)
    println(philosophical)

  }

}
