/**
  * Created by Kamil on 14.02.2016.
  */
object Main2 {

  def main(args: Array[String]) {

    val kamil = Person("Kamil", "Krol")
    val kamilXml = kamil.toXml

    kamilXml match {
      case <person>{contents @ _*}</person> => println("It's a person: " + contents)
      case _ => println("Something else!")
    }

  }

}
