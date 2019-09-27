class KtTest(
    val nonNull: String,
    val nullable: String?
) {
}

fun main() {
    val test = JavaTest(null, "string")

    println(test.platform.length)
    println(test.platform?.length)

    println(test.nullable.length) // e: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    println(test.nullable?.length) // ok

    println(test.notNull.length) // ok
    println(test.notNull?.length) // w: Unnecessary safe call on a non-null receiver of type String
}
