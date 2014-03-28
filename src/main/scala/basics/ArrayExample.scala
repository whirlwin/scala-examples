package basics

object ArrayExample extends App {

  val numbers = Array[Int](1,2,3)

  numbers.update(1, 10)
  println(numbers.apply(1))
}
