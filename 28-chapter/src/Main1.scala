import scala.xml._
/**
  * Created by Kamil on 14.02.2016.
  */
object Main1 {

  def main(args: Array[String]) {

    val kamil = Person("Kamil", "Krol")
    println(kamil)
    println(kamil.toXml)

    println

    println(kamil.toXml \ "name")

  }

}

case class Person(name: String, surname: String) {

  def toXml = <person>
    <name>
      {name}
    </name>
    <surname>
      {surname}
    </surname>
  </person>

}
