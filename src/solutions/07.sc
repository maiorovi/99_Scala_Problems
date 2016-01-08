def flatten[T](xs:List[T]):List[T] = xs match {
  case Nil => Nil
  case x::xs => x match {
    case x:List[T] => flatten(x) ++ flatten(xs)
    case x:T => x::flatten(xs)
  }
}

println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))));