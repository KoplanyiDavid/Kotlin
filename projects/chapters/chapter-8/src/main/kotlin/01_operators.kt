class MyInt(private val value: Int) : Comparable<MyInt> {
    fun toInt(): Int = value
    override fun toString() = value.toString()

    operator fun plus(other: MyInt): MyInt {
        return MyInt(this.value + other.value)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is MyInt)
            return false
        return value == other.value
    }

    override fun hashCode(): Int {
        return value
    }

    override operator fun compareTo(other: MyInt): Int {
        return this.value.compareTo(other.value)
    }
}

operator fun MyInt.unaryMinus(): MyInt {
    return MyInt(-this.toInt())
}
