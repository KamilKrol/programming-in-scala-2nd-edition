/**
  * Created by kamil on 16.12.15.
  */
object Main4 {

  def main(args: Array[String]) {

    println {
      "Hello, world!"
    }

    val text = "Hello, world!"
    val substring = text.substring({
      1
    }, {
      5
    })

    val substring2 = text.substring {
      1
    } {
      2
    }

    println(substring)
    println(substring2)

  }

}
