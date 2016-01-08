
def compress[T](xs:List[T]):List[T] = xs match {
  case (x::y::xs) => if (x == y) compress(y::xs) else x::compress(y::xs)
  case x::Nil => x::Nil
}

compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
compress(List('a,'a,'a,'a))
//res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)