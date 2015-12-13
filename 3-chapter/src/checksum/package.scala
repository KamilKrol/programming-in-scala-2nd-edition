import scala.collection.mutable.HashMap

/**
  * Created by kamil on 13.12.15.
  */
package object checksum {

  class ChecksumAccumulator {
    private var sum = 0

    def add(b: Byte) {
      /* Adding takes time - to simulate proper cache usage. */
      Thread sleep 500
      sum += b
    }

    def checksum() = ~(sum & 0xFF) + 1
  }

  object ChecksumAccumulator {
    private val cache = HashMap[String, Int]()

    def calculate(text: String): Int =
      if (cache.contains(text))
        cache(text)
      else {
        val acc = new ChecksumAccumulator
        for (c <- text)
          acc.add(c.toByte)
        val cs = acc.checksum()
        cache += (text -> cs)
        cs
      }
  }

}
