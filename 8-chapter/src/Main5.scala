/**
  * Created by kamil on 15.12.15.
  */
object Main5 {

  def main(args: Array[String]) {

    val increaser10 = makeIncreaser(10)
    val increaser15 = makeIncreaser(15)

    println("increaser10(10) = " + increaser10(10))
    println("increaser15(10) = " + increaser15(10))

  }

  def makeIncreaser(more: Int) = (value: Int) => value + more

}
