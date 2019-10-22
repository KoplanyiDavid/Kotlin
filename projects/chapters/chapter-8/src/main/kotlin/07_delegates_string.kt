import java.io.File
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class PersistentString(private val key: String) : ReadWriteProperty<Any?, String> {
    private var cachedValue: String

    init {
        cachedValue = File("${key}.txt")
            .takeIf { it.exists() }
            ?.readText()
            ?: ""
    }

    override operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return cachedValue
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        cachedValue = value
        val file = File("${property.name}.txt")
        file.writeText(value)
    }
}

object PersistentStringFactory {
    private val keys = mutableSetOf<String>()

    operator fun provideDelegate(
        thisRef: Any?,
        prop: KProperty<*>
    ): ReadWriteProperty<Any?, String> {
        require(prop.name !in keys) { "No duplicates allowed in PersistentStrings" }
        keys += prop.name
        return PersistentString(prop.name)
    }
}

fun persistentString(): PersistentStringFactory = PersistentStringFactory

fun main() {
    var str by persistentString()
    println("str is: $str")
    str = "hello"
}
