data class Vector3(var x: Int, var y: Int, var z: Int) {
    operator fun get(index: Int): Int {
        return when (index) {
            0 -> x
            1 -> y
            2 -> z
            else -> throw IllegalArgumentException("Invalid index")
        }
    }

    operator fun set(index: Int, value: Int) {
        when (index) {
            0 -> x = value
            1 -> y = value
            2 -> z = value
            else -> throw IllegalArgumentException("Invalid index")
        }
    }
}

fun main() {
    val v = Vector3(0, 0, 0)
    v[2] = 42
    v[0] = 169
    println(v[2])
    println(v)
}
