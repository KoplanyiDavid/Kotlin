import java.math.BigDecimal
import java.math.MathContext

//region Fake Java 9 API supplement
fun BigDecimal.sqrt(mathContext: MathContext): BigDecimal {
    TODO("implement")
}
//endregion

fun solve1(
    a: BigDecimal, b: BigDecimal, c: BigDecimal
): Pair<BigDecimal, BigDecimal> {
    val sqrtD = b.multiply(b).minus(BigDecimal(4).times(a).times(c)).sqrt(MathContext.UNLIMITED)
    val x1 = b.negate().plus(sqrtD).div(BigDecimal(2).times(a))
    val x2 = b.negate().minus(sqrtD).div(BigDecimal(2).times(a))
    return Pair(x1, x2)
}

//region Helpers
fun sqrt(bd: BigDecimal) = bd.sqrt(MathContext.UNLIMITED)
//endregion

fun solve2(
    a: BigDecimal, b: BigDecimal, c: BigDecimal
): Pair<BigDecimal, BigDecimal> {
    val sqrtD = sqrt(b * b - 4.toBigDecimal() * a * c)
    val x1 = (-b + sqrtD) / 2.toBigDecimal() * a
    val x2 = (-b - sqrtD) / 2.toBigDecimal() * a
    return Pair(x1, x2)
}
