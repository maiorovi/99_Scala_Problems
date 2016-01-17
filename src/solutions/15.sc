def duplicateN[T](n:Int,xs:List[T]):List[T] = xs match {
  case Nil => Nil
  case x::xs => duplicateElem(n, x)++duplicateN(n, xs)
}

def duplicateElem[T](n:Int, elem:T):List[T] = n match {
  case 0 => Nil
  case n => elem::duplicateElem(n-1, elem)
}


duplicateN(3, List('a, 'b, 'c, 'c, 'd))