def isPalindrome[T](xs:List[T]): Boolean = xs == reverse(xs)

def reverse[T](xs:List[T]):List[T] =
            xs.foldLeft(List[T]())((acc,elem) => elem::acc)

isPalindrome(List(1, 2, 3, 2, 1))

isPalindrome(List(1, 2, 3, 2, 13))