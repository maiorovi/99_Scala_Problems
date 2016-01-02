def length[T](xs:List[T]):Int = {
  def counter(acc:Int, xs:List[T]):Int = xs match {
    case Nil => acc
    case x::xs => counter(acc+1, xs)
  }

  counter(0, xs)
}

length(List(1, 1, 2, 3, 5, 8))

def lengthFunctional[T](xs:List[T]):Int =
  xs.foldLeft(0)( (acc, _) => acc + 1 )


lengthFunctional(List(1, 1, 2, 3, 5, 8))