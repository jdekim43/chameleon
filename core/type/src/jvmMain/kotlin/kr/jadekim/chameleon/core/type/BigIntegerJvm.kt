package kr.jadekim.chameleon.core.type

import java.math.BigInteger as JvmType

actual class BigInteger constructor(internal val origin: JvmType) : Number(), Comparable<BigInteger> {

    actual companion object {
        actual val ZERO: BigInteger = BigInteger(JvmType.ZERO)
        actual val ONE: BigInteger = BigInteger(JvmType.ONE)
    }

    actual constructor(value: String) : this(JvmType(value))

    init {
        if (origin.signum() == -1) {
            throw IllegalArgumentException("Can't be negative")
        }
    }

    override fun compareTo(other: BigInteger): Int = origin.compareTo(other.origin)

    override fun toByte(): Byte = origin.toByte()

    override fun toChar(): Char = origin.toChar()

    override fun toDouble(): Double = origin.toDouble()

    override fun toFloat(): Float = origin.toFloat()

    override fun toInt(): Int = origin.toInt()

    override fun toLong(): Long = origin.toLong()

    override fun toShort(): Short = origin.toShort()

    override fun toString(): String = origin.toString()

    override fun equals(other: Any?): Boolean = origin.equals(other)

    override fun hashCode(): Int = origin.hashCode()

    actual operator fun plus(other: BigInteger): BigInteger = BigInteger(origin + other.origin)

    actual operator fun minus(other: BigInteger): BigInteger = BigInteger(origin - other.origin)

    actual operator fun times(other: BigInteger): BigInteger = BigInteger(origin * other.origin)

    actual operator fun div(other: BigInteger): BigInteger = BigInteger(origin / other.origin)

    actual operator fun rem(other: BigInteger): BigInteger = BigInteger(origin % other.origin)
}

fun JvmType.toCompatibleType() = BigInteger(this)

fun BigInteger.toPlatformType() = origin

actual fun BigInteger.toBigDecimal(): BigDecimal = origin.toBigDecimal().toCompatibleType()

actual fun BigInteger.scaled(scale: Int): BigDecimal = origin.toBigDecimal(scale).toCompatibleType()
