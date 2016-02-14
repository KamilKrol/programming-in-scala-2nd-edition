/**
  * Created by Kamil on 14.02.2016.
  */
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
