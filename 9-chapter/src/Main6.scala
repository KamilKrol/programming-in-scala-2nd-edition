/**
  * Created by kamil on 16.12.15.
  */
object Main6 {

  def main(args: Array[String]) {

    normalParameter(calculateParameter())
    byNameParameter(calculateParameter())

  }

  def normalParameter(x: Int) = println("normal parameter")

  def byNameParameter(x: => Int) = println("by name parameter")

  def calculateParameter() = {
    println("Calculating ...")
    Thread sleep 5000
    println("Calculated")
    5
  }

}
