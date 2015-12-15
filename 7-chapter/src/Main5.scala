/**
  * Created by kamil on 15.12.15.
  */
object Main5 {

  def main(args: Array[String]) {

    println(multiTable())

  }

  def multiTable() = {

    def makeRowSeq(row: Int) =
      for (col <- 1 to 10) yield {
        val prod = (row * col).toString
        val padding = " " * (4 - prod.length)
        padding + prod
      }

    def makeRow(row: Int) = makeRowSeq(row).mkString

    val tableSeq = for (row <- 1 to 10) yield makeRow(row)
    tableSeq.mkString("\n")
  }

}
