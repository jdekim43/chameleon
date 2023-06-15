// Transform from dex/enums.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.Int
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax

@Serializable
@SerialName(value = "/seiprotocol.seichain.dex.PositionDirection")
public enum class PositionDirection(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  LONG(0),
  @ProtobufIndex(index = 1)
  SHORT(1),
  ;

  public companion object {
    public fun forNumber(number: Int): PositionDirection = PositionDirection.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/seiprotocol.seichain.dex.PositionEffect")
public enum class PositionEffect(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  OPEN(0),
  @ProtobufIndex(index = 1)
  CLOSE(1),
  ;

  public companion object {
    public fun forNumber(number: Int): PositionEffect = PositionEffect.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/seiprotocol.seichain.dex.OrderType")
public enum class OrderType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  LIMIT(0),
  @ProtobufIndex(index = 1)
  MARKET(1),
  @ProtobufIndex(index = 3)
  FOKMARKET(3),
  @ProtobufIndex(index = 4)
  FOKMARKETBYVALUE(4),
  @ProtobufIndex(index = 5)
  STOPLOSS(5),
  @ProtobufIndex(index = 6)
  STOPLIMIT(6),
  ;

  public companion object {
    public fun forNumber(number: Int): OrderType = OrderType.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/seiprotocol.seichain.dex.Unit")
public enum class Unit(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  STANDARD(0),
  @ProtobufIndex(index = 1)
  MILLI(1),
  @ProtobufIndex(index = 2)
  MICRO(2),
  @ProtobufIndex(index = 3)
  NANO(3),
  ;

  public companion object {
    public fun forNumber(number: Int): Unit = Unit.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/seiprotocol.seichain.dex.OrderStatus")
public enum class OrderStatus(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  PLACED(0),
  @ProtobufIndex(index = 1)
  FAILED_TO_PLACE(1),
  @ProtobufIndex(index = 2)
  CANCELLED(2),
  @ProtobufIndex(index = 3)
  FULFILLED(3),
  ;

  public companion object {
    public fun forNumber(number: Int): OrderStatus = OrderStatus.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/seiprotocol.seichain.dex.CancellationInitiator")
public enum class CancellationInitiator(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  USER(0),
  @ProtobufIndex(index = 1)
  LIQUIDATED(1),
  ;

  public companion object {
    public fun forNumber(number: Int): CancellationInitiator = CancellationInitiator.values()
    	.first { it.number == number }
  }
}
