import java.util.{Random => Generator}
/* Import everything from java.sql._ except from the Clob. */
import java.sql.{Clob => _, _}

/**
  * Created by kamil on 21.12.15.
  */
object Main3 {

  def main(args: Array[String]) {

    println(new Generator().nextInt(10))
    println(new java.util.Random().nextInt(10))

  }

  abstract class BlobExt extends Blob
//  abstract class ClobExt extends Clob

}
