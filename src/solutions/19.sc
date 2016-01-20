def rotate[T](n:Int, xs:List[T]):List[T] = {
  def innerRotate(n:Int, head:List[T], tail:List[T]):List[T] = (n, tail) match {
    case (0, tail) => tail ++ head.reverse
    case (n, x::xs) if n > 0 => innerRotate(n-1,x::head, xs)
  }

  innerRotate(n, Nil, xs)
}





rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
//res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)