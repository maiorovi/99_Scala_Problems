def pack[T](xs:List[T]):List[List[T]] = {
  def decompose(ys:List[T]):(List[T], List[T]) = ys match {
    case x::Nil => (x::Nil, Nil)
    case x::y::ys if(x!=y) => (x::Nil, y::ys)
    case x::y::ys if (x == y) => {
      val res = decompose(y::ys)
      (x::res._1, res._2)
    }
  }

  def compose(xs:List[T]):List[List[T]] = {
    xs match {
      case Nil => Nil
      case x::xs => {
        val res = decompose(x::xs)
        res._1::compose(res._2)
      }
    }
  }

  compose(xs)
}


pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))