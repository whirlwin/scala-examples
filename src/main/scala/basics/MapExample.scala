package basics

object MapExample extends App {

  class Person(name: String, age: Int) {
    val _name = name
  }

  def printNames() = {
    val people = Array(
      new Person(name = "John", age = 18),
      new Person(name = "Jane", age = 19),
      new Person(name = "Joe",  age = 20)
    )

    val names = people.map(p => p._name)
    names.foreach(println)
  }

  printNames()
}
