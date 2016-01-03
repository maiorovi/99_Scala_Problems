def reverse[T](xs:List[T]):List[T] = {
  def reverseR(result: List[T], tail:List[T]):List[T] = tail match {
    case Nil => result
    case x::xs => reverseR(x::result, xs)
  }

  reverseR(Nil, xs)
}

def functionalReverse[T](xs:List[T]):List[T] =
  xs.foldLeft(List[T]())((acc, elem) => elem::acc)

reverse(List(1, 1, 2, 3, 5, 8))

functionalReverse(List(1, 1, 2, 3, 5, 8))