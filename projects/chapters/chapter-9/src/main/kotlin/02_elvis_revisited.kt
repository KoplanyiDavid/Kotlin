

abstract class Plant
abstract class Animal
class Dog: Animal()
class Cat: Animal()
class Horse : Animal()


fun example1(dog: Dog?, horse: Horse?) {
    val result = dog ?: horse
}

fun example2(dog: Dog, horse: Horse?) {
    val result = dog ?: horse
}

fun example3(dog: Dog?, horse: Horse) {
    val result = dog ?: horse
}
