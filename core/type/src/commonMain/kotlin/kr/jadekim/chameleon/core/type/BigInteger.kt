package kr.jadekim.chameleon.core.type

expect class BigInteger(value: String) : Number, Comparable<BigInteger> {

    companion object {
        val ZERO: BigInteger
        val ONE: BigInteger
    }

    operator fun plus(other: BigInteger): BigInteger

    operator fun minus(other: BigInteger): BigInteger

    operator fun times(other: BigInteger): BigInteger

    operator fun div(other: BigInteger): BigInteger

    operator fun rem(other: BigInteger): BigInteger
}

operator fun BigInteger.times(other: BigDecimal): BigDecimal = other * this

expect fun BigInteger.toBigDecimal(): BigDecimal

expect fun BigInteger.scaled(scale: Int): BigDecimal

fun Int.toBigInteger(): BigInteger = BigInteger(toString())

fun UInt.toBigInteger(): BigInteger = BigInteger(toString())

fun Long.toBigInteger(): BigInteger = BigInteger(toString())

fun ULong.toBigInteger(): BigInteger = BigInteger(toString())
