/**
  * Created by kamil on 06.01.16.
  */
package object queue {

  trait Queue[T] {
    def head: T

    def tail: Queue[T]

    def enqueue(x: T): Queue[T]
  }

  object Queue {
    def apply[T](elems: T*): Queue[T] = new QueueImpl[T](elems.toList, Nil)

    private class QueueImpl[T](
                                private val leading: List[T],
                                private val trailing: List[T]
                              ) extends Queue[T] {
      def mirror =
        if (leading.isEmpty) new QueueImpl[T](trailing.reverse, Nil)
        else this

      def head: T = mirror.leading.head

      def tail: Queue[T] = {
        val q = mirror
        new QueueImpl[T](q.leading.tail, trailing)
      }

      def enqueue(x: T): Queue[T] = new QueueImpl(leading, x :: trailing)

    }

  }

}
