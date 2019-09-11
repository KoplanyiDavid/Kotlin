
class InstrumentedSet<E>(
    private val set: MutableSet<E> = HashSet()
) : MutableSet<E> by set {
    var addCount = 0

    override fun add(element: E): Boolean {
        addCount++
        return set.add(element)
    }

    override fun addAll(elements: Collection<E>): Boolean {
        addCount += elements.size
        return set.addAll(elements)
    }
}

fun main() {
    val badSet = BadInstrumentedHashSet<Int>()
    badSet.addAll(listOf(1, 2, 3, 4, 5))
    println(badSet.addCount) // 10

    val set = InstrumentedSet<Int>(HashSet())
    set.addAll(listOf(1, 2, 3, 4, 5))
    println(set.addCount) // 5
}
