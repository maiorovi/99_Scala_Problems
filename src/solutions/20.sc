def removeAt[T](n:Int, xs:List[T]):(List[T], T) = {
  def innerRemoveAt[T](n:Int, head:List[T], tail:List[T]):(List[T], T) = (n,head, tail) match {
    case (0, xs, y::ys) => (xs++ys, y)
    case (n, xs, y::ys) => innerRemoveAt(n-1, y::xs,ys)
  }

  innerRemoveAt(n,Nil,xs)
}

removeAt(1, List('a, 'b, 'c, 'd))
//(List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
