package nested


class Address(val building: String?)

class Company(val address: Address?)

class Person(val company: Company?)

fun main() {
    val person: Person? = null

    println(person?.company?.address?.building)
}
