def split[T](n:Int, xs:List[T]):(List[T], List[T]) = (n,xs) match {
  case (0, x::xs) => (Nil, xs)
  case (_, Nil) => throw new IllegalArgumentException
  case (n, x::xs) => (x::split(n-1, xs)._1, xs)
}


split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))