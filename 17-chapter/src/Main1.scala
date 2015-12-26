import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  * Created by kamil on 26.12.15.
  */
object Main1 {

  def main(args: Array[String]) {

    val listBuffer = new ListBuffer[Int]
    listBuffer += 1
    listBuffer += 2
    0 +=: listBuffer
    println(listBuffer.toList)

    val arrayBuffer = new ArrayBuffer[Int]
    arrayBuffer += 1
    arrayBuffer += 2
    0 +=: arrayBuffer
    println(arrayBuffer.toArray.mkString("Array(", ", ", ")"))

    val name = "Kamil"
    println(name.exists(_.isUpper))

  }

}
