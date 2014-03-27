package basics

object IterationExample extends App {

  def foreachExample() = {
    val names = Array("John", "Jane", "Joe")
    names.foreach(println)
  }

  def toExample() = {
    for (n <- 0 to 3)
      println(n)

    4.to(6).foreach(println)
  }

  foreachExample()
  toExample()
}
