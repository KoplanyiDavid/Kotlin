package com.example.something

data class Person(val name: String, val age: Int)

fun getAge(person: Person): Int {
    return person.age
}

val ageGetter: (Person) -> Int = ::getAge

val ageGetter2: (Person) -> Int = fun(person: Person): Int {
    return person.age
}

val ageGetter3 = { person: Person -> person.age }

val ageGetter4 = { person: Person ->
    println("Getting the age of ${person.name}...")
    person.age
}

val ageGetter5: (Person) -> Int = { person -> person.age }

val ageGetter6: (Person) -> Int = { it.age }

fun main() {
    val julie = Person("Julie", 36)

    println(ageGetter(julie)) // 36
    println(ageGetter2(julie)) // 36
    println(ageGetter3(julie)) // 36
    println(ageGetter4(julie)) // 36
    println(ageGetter5(julie)) // 36
    println(ageGetter6(julie)) // 36
}


