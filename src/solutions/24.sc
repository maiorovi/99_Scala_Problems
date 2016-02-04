import scala.annotation.tailrec
import scala.util.Random


def lotto(amt:Int, set:Int):List[Int] = {

  val rnd = new Random()

  @tailrec
  def _lotto(result:List[Int], curAmt:Int):List[Int] = (curAmt, rnd.nextInt(set))  match {
    case (0, _) => result
    case (n, value) if result.contains(value) => _lotto(result, curAmt)
    case (n,value) => _lotto(value::result, n - 1)
  }
  _lotto(Nil, amt)
}
lotto(6, 49)
//res0: List[Int] = List(23, 1, 17, 33, 21, 37)