import java.util.NoSuchElementException

def penultimate[T](xs:List[T]):T = xs match {
  case x::_::Nil => x
  case x::xs => penultimate(xs)
}

def penultimateBuiltin[T](xs:List[T]):T = if (xs.isEmpty) throw NoSuchElementException
                                          else xs.init.last

penultimate(List(1,2,3,4,5,6))
