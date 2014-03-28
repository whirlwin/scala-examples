package pattern_matching

object BasicExample extends App {

  def matchNumberLiteral(num: Int): String = num match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case _ => "Some other number"
  }

  

  println(matchNumberLiteral(10))
}
