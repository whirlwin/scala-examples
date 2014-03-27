package basics

object FunctionExample extends App {

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  override def main(args: Array[String]) = {
    println(max(1, 2))
  }
}
