import scala.util.Random

def randomPermute[A](xs:List[A]):List[A] = randomSelect(xs.length, xs)


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

randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))


// canonical way of implementing random permutation alogrithm is
// mutable one

def randomPermuteMutual[A](ls:List[A]): List[A] = {
  val rand = new Random()
  val a = ls.toArray

  for (i <- a.length - 1 to 1 by -1) {
    val i1 = rand.nextInt(i+1)
    val t = a(i)
    a.update(i, a(i1))
    a.update(i1, t)
  }

  a.toList
}



//def randomPermute[A](ls: List[A]): List[A] = {
//  val rand = new util.Random
//  val a = ls.toArray
//  for (i <- a.length - 1 to 1 by -1) {
//    val i1 = rand.nextInt(i + 1)
//    val t = a(i)
//    a.update(i, a(i1))
//    a.update(i1, t)
//  }
//  a.toList
//}