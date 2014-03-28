package pattern_matching

object BasicExample extends App {

  def matchNumberLiteral(num: Int): String = num match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case _ => "Some other number"
  }

  def matchType(x: Any): Any = x match {
    case x: Int    => "Integer"
    case x: String => "String"
    case _         => "Other type"
  }

  println(matchNumberLiteral(10))

  println(matchType("foobar"))
}
