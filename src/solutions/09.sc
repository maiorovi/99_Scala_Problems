def pack[T](xs:List[T]):List[List[T]] = {
  def innerPack(ys:List[T]):List[T] = ys match {
    case x::y::ys if(x!=y) => x::Nil
    case x::y::ys if (x == y) => x::innerPack(y::ys)
  }

//  xs match {
//    case x::xs => innerPack(xs) :: pack(xs)
//  }
  List(innerPack(xs))

}


pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))