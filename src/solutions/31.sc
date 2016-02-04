def isPrime(n:Int):Boolean = {
  def _isPrime(state:Int):Boolean = (n % state) match {
    case _ if state == 1 => true
    case 0 => false
    case _ => _isPrime(state - 1)
  }

  _isPrime(n - 1)
}


isPrime(2)

6 % 4
