/**
  * Created by kkrol on 04/01/2016.
  */
object Main3 {

  def main(args: Array[String]) {

    val functionGeneric: Function1[AnyRef, Integer] = (ref: AnyRef) => ref.hashCode()
    val functionConcrete: Function1[String, Integer] = functionGeneric
    println(functionConcrete)

  }

}
