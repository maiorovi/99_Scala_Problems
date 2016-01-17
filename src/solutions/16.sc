def drop[T](n:Int, xs:List[T]):List[T] = {
  def dropN(cur:Int, xs:List[T]):List[T] = (cur,xs) match {
    case (_, Nil) => Nil
    case (0, x :: xs) => dropN(n-1, xs)
    case (n, x :: xs) => x :: dropN(n-1, xs)
  }

  dropN(n-1, xs)
}

drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

//List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)