def totient(number:Int):Int = {
  def isCoprime(a:Int, b:Int):Boolean = {
    def gcd(a:Int, b:Int):Int = if (a % b == 0) b else gcd(b, a % b)

    gcd(a,b) == 1
  }

  (1 to number - 1).filter( isCoprime(_, number)).length
}

totient(10)

