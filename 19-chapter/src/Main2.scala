/**
  * Created by kkrol on 04/01/2016.
  */
object Main2 {

  def main(args: Array[String]) {

    val anyChannel : OutputChannel[AnyRef] = new OutputChannel[AnyRef]
    val stringChannel : OutputChannel[String] = anyChannel

    println("stringChannel = " + stringChannel)

  }

}

class OutputChannel[-T]