def decode[T](xs:List[(Int, T)]):List[T] = xs match {
  case Nil => Nil
  case x::xs => decodeTuple(x)++decode(xs)
}

def decodeTuple[T](tuple: (Int, T)): List[T] = tuple match {
  case (0, value) => Nil
  case (amount, value) => value::decodeTuple((amount-1, value))
}

decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))