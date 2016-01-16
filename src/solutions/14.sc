def duplicate[T](xs:List[T]):List[T] = xs match {
  case Nil => Nil
  case x::xs => x::x::duplicate(xs)
}

duplicate(List('a, 'b, 'c, 'c, 'd))