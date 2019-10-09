interface Database {
    fun beginTransaction()
    fun commitTransaction()
    fun rollbackTransaction()
    fun insert(item: Int)
    fun delete(item: Int)
}

inline fun Database.inTransaction(block: Database.() -> Unit) {
    beginTransaction()
    try {
        block()
        commitTransaction()
    } catch (e: IllegalStateException) {
        rollbackTransaction()
    }
}

fun `example of inTransaction`(database: Database) {

    database.inTransaction {
        insert(11)
        delete(12)
    }

}
