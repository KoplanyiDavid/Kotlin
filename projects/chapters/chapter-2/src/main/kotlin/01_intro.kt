
class Person(val name: String, var age: Int)

fun main() {
    val person = Person("Mandy", 41)
    println(person.name)
    person.age = 42
}

