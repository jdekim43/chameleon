package kr.jadekim.chameleon.core.type

import java.math.RoundingMode
import java.math.BigDecimal as JvmType

actual class BigDecimal constructor(internal val origin: JvmType) : Number(), Comparable<BigDecimal> {

    actual companion object {
        actual val ZERO: BigDecimal = BigDecimal(JvmType.ZERO)
        actual val ONE: BigDecimal = BigDecimal(JvmType.ONE)
    }

    actual constructor(value: String) : this(JvmType(value))

    override fun compareTo(other: BigDecimal): Int = origin.compareTo(other.origin)

    override fun toByte(): Byte = origin.toByte()

    override fun toChar(): Char = origin.toChar()

    override fun toDouble(): Double = origin.toDouble()

    override fun toFloat(): Float = origin.toFloat()

    override fun toInt(): Int = origin.toInt()

    override fun toLong(): Long = origin.toLong()

    override fun toShort(): Short = origin.toShort()

    override fun toString(): String = origin.toPlainString()

    override fun equals(other: Any?): Boolean = origin.equals(other)

    override fun hashCode(): Int = origin.hashCode()

    actual operator fun plus(other: BigDecimal): BigDecimal = BigDecimal(origin + other.origin)

    actual operator fun minus(other: BigDecimal): BigDecimal = BigDecimal(origin - other.origin)

    actual operator fun times(other: BigDecimal): BigDecimal = BigDecimal(origin * other.origin)

    actual operator fun div(other: BigDecimal): BigDecimal = BigDecimal(origin / other.origin)

    actual operator fun rem(other: BigDecimal): BigDecimal = BigDecimal(origin % other.origin)
    actual operator fun plus(other: BigInteger): BigDecimal =
        origin.plus(other.origin.toBigDecimal()).toCompatibleType()

    actual operator fun minus(other: BigInteger): BigDecimal =
        origin.minus(other.origin.toBigDecimal()).toCompatibleType()

    actual operator fun times(other: BigInteger): BigDecimal =
        origin.multiply(other.origin.toBigDecimal()).toCompatibleType()

    actual operator fun div(other: BigInteger): BigDecimal = origin.div(other.origin.toBigDecimal()).toCompatibleType()

    actual operator fun rem(other: BigInteger): BigDecimal = origin.rem(other.origin.toBigDecimal()).toCompatibleType()
}

fun JvmType.toCompatibleType() = BigDecimal(this)

fun BigDecimal.toPlatformType() = origin

actual fun BigDecimal.ceil(): BigDecimal = origin.setScale(0, RoundingMode.CEILING).toCompatibleType()

actual fun BigDecimal.toBigInteger(): BigInteger = origin.toBigInteger().toCompatibleType()

actual fun BigDecimal.unscaled(scale: Int): BigInteger = origin.setScale(scale).unscaledValue().toCompatibleType()
