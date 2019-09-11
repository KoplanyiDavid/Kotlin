package delegatedprops

import kotlin.math.sqrt
import kotlin.properties.Delegates

class Constants {

    private var pi_: Double? = null
    val pi: Double
        get() {
            if (pi_ == null) {
                // Some expensive computation
                val sum = (1..50_000).sumByDouble { 1.0 / (it * it) }
                pi_ = sqrt(sum * 6.0)
            }
            return pi_!!
        }

    private var e_: Double? = null
    val e: Double
        get() {
            if (e_ == null) {
                // Again, complex, expensive computation
                val sum = (0..20).sumByDouble { 1.0 / (1..it).fold(1, { a, x -> a * x }) }
                e_ = sum
            }
            return e_!!
        }

}

class DelegatedConstants {

    val pi: Double by lazy {
        val sum = (1..50_000).sumByDouble { 1.0 / (it * it) }
        sqrt(sum * 6.0)
    }

}

class Person {
    var name: String by Delegates.observable("Megan") { property, oldValue, newValue ->
        println("Name changed from $oldValue to $newValue")
    }

    var age: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        newValue > oldValue
    }
}
