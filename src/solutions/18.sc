def slice[T](start:Int, end:Int, xs:List[T]):List[T] = {
  def innerSlice(st: Int, en: Int, xs: List[T]): List[T] = (st, en, xs) match {
    case (0, 0, x :: xs) => Nil
    case (0, e, x :: xs) => x :: innerSlice(0, e - 1, xs)
    case (s, e, x :: xs) => innerSlice(s - 1, e, xs)
  }

  innerSlice(start, end-start, xs)
}


slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))