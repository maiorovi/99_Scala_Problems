import scala.util.Random

def randomSelect[T](amount:Int, xs:List[T]):List[T] = {
  def _randomSelect[T](amount: Int, xs: List[T]): List[T] = (amount, xs) match {
    case (amt, Nil) => throw new IllegalArgumentException
    case (0, x :: xs) => x :: Nil
    case (amt, xs) => {
      val (lst, elem) = removeAt(new Random().nextInt(xs.length), xs)
      elem :: _randomSelect(amt - 1, lst)
    }
  }

  _randomSelect(amount - 1, xs)
}

def removeAt[T](n:Int, xs:List[T]):(List[T], T) = {
  def innerRemoveAt[T](n:Int, head:List[T], tail:List[T]):(List[T], T) = (n,head, tail) match {
    case (0, xs, y::ys) => (xs++ys, y)
    case (n, xs, y::ys) => innerRemoveAt(n-1, y::xs,ys)
  }

  innerRemoveAt(n,Nil,xs)
}

randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))