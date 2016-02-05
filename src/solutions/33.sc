def isCoprime(a:Int, b:Int):Boolean = {
  def gcd(a:Int, b:Int):Int = if (a % b == 0) b else gcd(b, a % b)

  gcd(a,b) == 1
}

isCoprime(64,35)