package pattern_matching

object CaseClassExample extends App {

  case class Person(name: String, age: Int)

  val john = new Person("John", 18)
  val jane = new Person("jane", 19)
  val joe  = new Person("Joe", 20)

  def findPerson(person: Person) = {
    for (person <- List(john, jane, joe)) {
      person match {
        case Person("John", 18) => println("Young John")
        case Person("Joe",  20) => println("Old Joe")
        case _                  => println("Some other person")
      }
    }
  }

  findPerson(joe)
}
