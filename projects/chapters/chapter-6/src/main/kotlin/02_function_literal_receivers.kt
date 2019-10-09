fun String.lastChar(): Char {
    return this[this.length - 1]
}

val ref: String.() -> Char = String::lastChar


