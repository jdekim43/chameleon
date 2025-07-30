package kr.jadekim.chameleon.core.type

expect class BigDecimal(value: String) : Number, Comparable<BigDecimal> {

    companion object {
        val ZERO: BigDecimal
        val ONE: BigDecimal
    }

    operator fun plus(other: BigDecimal): BigDecimal

    operator fun minus(other: BigDecimal): BigDecimal

    operator fun times(other: BigDecimal): BigDecimal

    operator fun div(other: BigDecimal): BigDecimal

    operator fun rem(other: BigDecimal): BigDecimal

    operator fun plus(other: BigInteger): BigDecimal

    operator fun minus(other: BigInteger): BigDecimal

    operator fun times(other: BigInteger): BigDecimal

    operator fun div(other: BigInteger): BigDecimal

    operator fun rem(other: BigInteger): BigDecimal
}

expect fun BigDecimal.ceil(scale: Int = 0): BigDecimal

expect fun BigDecimal.roundUp(scale: Int = 0): BigDecimal

expect fun BigDecimal.toBigInteger(): BigInteger

expect fun BigDecimal.unscaled(scale: Int): BigInteger

fun Int.toBigDecimal(): BigDecimal = BigDecimal(toString())

fun UInt.toBigDecimal(): BigDecimal = BigDecimal(toString())

fun Long.toBigDecimal(): BigDecimal = BigDecimal(toString())

fun ULong.toBigDecimal(): BigDecimal = BigDecimal(toString())

fun Float.toBigDecimal(): BigDecimal = BigDecimal(toString())

fun Double.toBigDecimal(): BigDecimal = BigDecimal(toString())
