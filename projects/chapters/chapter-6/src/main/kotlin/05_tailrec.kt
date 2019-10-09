fun factorial(n: Int): Int {
    if (n == 0)
        return 1
    return n * factorial(n - 1)
}

private tailrec fun fact(n: Int, res: Int): Int {
    if (n == 0)
        return res
    return fact(n - 1, res * n)
}

fun fact(n: Int) = fact(n, 1)
