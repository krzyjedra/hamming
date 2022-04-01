object Hamming extends App {
  def distance(s: String, ss: String): Int = {
    if (s.length == ss.length) {
      s.zip(ss).count { case (x, y) => x != y }
    }
    else 0
  }

  val x = "CAGTTATG"
  val y = "CGATGTAT"
  println(distance(x, y))
}
