def gcd(a:Int, b:Int):Int = if (a % b == 0) b else gcd(b, a % b)


gcd(36, 63)