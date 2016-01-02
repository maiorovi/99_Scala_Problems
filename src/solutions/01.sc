import java.util.NoSuchElementException

import scala.annotation.tailrec

@tailrec
def last[T](xs:List[T]) : T = xs match {
  case x::Nil => x
  case x :: xs => last(xs)
  case _       => throw NoSuchElementException
}

last(List(1,2,3,4,5,6))