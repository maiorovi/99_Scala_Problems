def insertAt[T](elem:T, pos:Int, xs:List[T]): List[T] = (pos,xs) match {
    case (0, x::xs) => elem::x::xs
    case (n, x::xs) => x::insertAt(elem, n - 1, xs)
  }



insertAt('new, 1, List('a, 'b, 'c, 'd))
//res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)