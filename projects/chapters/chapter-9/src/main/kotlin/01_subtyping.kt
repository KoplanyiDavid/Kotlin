package subtyping


open class Car {
    open fun drive(miles: Int): Number {
        require(miles >= 0)
        TODO("Compute & return some default consumption value...")
    }
}
class Tesla : Car() {
    override fun drive(miles: Int): Int {
        return 0 // No gallons consumed, duh!
    }
}

fun drive(car: Car) {
    println("Driving $car, vroom vroom")
}

fun main() {
    drive(Tesla())
}
