// Transform from dex/order.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.type.ProtobufMessage

@Serializable(with = Order.KotlinxSerializer::class)
@SerialName(value = Order.TYPE_URL)
public data class Order(
  @ProtobufIndex(index = 1)
  public val id: ULong,
  @ProtobufIndex(index = 2)
  public val status: OrderStatus,
  @ProtobufIndex(index = 3)
  public val account: String,
  @ProtobufIndex(index = 4)
  public val contractAddr: String,
  @ProtobufIndex(index = 5)
  public val price: String,
  @ProtobufIndex(index = 6)
  public val quantity: String,
  @ProtobufIndex(index = 7)
  public val priceDenom: String,
  @ProtobufIndex(index = 8)
  public val assetDenom: String,
  @ProtobufIndex(index = 9)
  public val orderType: OrderType,
  @ProtobufIndex(index = 10)
  public val positionDirection: PositionDirection,
  @ProtobufIndex(index = 11)
  public val `data`: String,
  @ProtobufIndex(index = 12)
  public val statusDescription: String,
  @ProtobufIndex(index = 13)
  public val nominal: String,
  @ProtobufIndex(index = 14)
  public val triggerPrice: String,
  @ProtobufIndex(index = 15)
  public val triggerStatus: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.Order"
  }

  public object KotlinxSerializer : KSerializer<Order> {
    private val delegator: KSerializer<Order> = Order.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Order): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Order {
      if (decoder is ProtobufMapperDecoder) {
        return OrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Cancellation.KotlinxSerializer::class)
@SerialName(value = Cancellation.TYPE_URL)
public data class Cancellation(
  @ProtobufIndex(index = 1)
  public val id: ULong,
  @ProtobufIndex(index = 2)
  public val initiator: CancellationInitiator,
  @ProtobufIndex(index = 3)
  public val creator: String,
  @ProtobufIndex(index = 4)
  public val contractAddr: String,
  @ProtobufIndex(index = 5)
  public val priceDenom: String,
  @ProtobufIndex(index = 6)
  public val assetDenom: String,
  @ProtobufIndex(index = 7)
  public val positionDirection: PositionDirection,
  @ProtobufIndex(index = 8)
  public val price: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.Cancellation"
  }

  public object KotlinxSerializer : KSerializer<Cancellation> {
    private val delegator: KSerializer<Cancellation> = Cancellation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Cancellation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CancellationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Cancellation {
      if (decoder is ProtobufMapperDecoder) {
        return CancellationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ActiveOrders.KotlinxSerializer::class)
@SerialName(value = ActiveOrders.TYPE_URL)
public data class ActiveOrders(
  @ProtobufIndex(index = 1)
  public val ids: List<ULong>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.ActiveOrders"
  }

  public object KotlinxSerializer : KSerializer<ActiveOrders> {
    private val delegator: KSerializer<ActiveOrders> = ActiveOrders.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ActiveOrders): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ActiveOrdersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ActiveOrders {
      if (decoder is ProtobufMapperDecoder) {
        return ActiveOrdersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
