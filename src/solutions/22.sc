def range(start:Int, end:Int): List[Int] = (start, end) match {
  case (start, end) if (start > end) => Nil
  case (start,end) if (start <= end) => start::range(start+1, end)
}

range(4, 9)