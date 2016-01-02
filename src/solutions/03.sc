def nth[T](n:Int, xs:List[T]):T = xs match {
  case Nil => throw new NoSuchElementException
  case _ if (n < 0) => throw new IllegalArgumentException()
  case x::xs => if (n == 0) x else nth(n-1, xs)
}


nth(4, List(1, 1, 2, 3, 5, 8))
