import checksum._

/**
  * Created by kamil on 13.12.15.
  */
object Main2 {

  def main(args: Array[String]): Unit = {

    val text = "Kamil Krol - Scala"
    println("1st checksum = " + ChecksumAccumulator.calculate(text))
    println("2nd checksum = " + ChecksumAccumulator.calculate(text))

  }

}
