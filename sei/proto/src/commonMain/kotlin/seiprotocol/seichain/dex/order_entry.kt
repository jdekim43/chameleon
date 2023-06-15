// Transform from dex/order_entry.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

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

@Serializable(with = OrderEntry.KotlinxSerializer::class)
@SerialName(value = OrderEntry.TYPE_URL)
public data class OrderEntry(
  @ProtobufIndex(index = 1)
  public val price: String,
  @ProtobufIndex(index = 2)
  public val quantity: String,
  @ProtobufIndex(index = 3)
  public val allocations: List<Allocation>,
  @ProtobufIndex(index = 4)
  public val priceDenom: String,
  @ProtobufIndex(index = 5)
  public val assetDenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.OrderEntry"
  }

  public object KotlinxSerializer : KSerializer<OrderEntry> {
    private val delegator: KSerializer<OrderEntry> = OrderEntry.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OrderEntry): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OrderEntryConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OrderEntry {
      if (decoder is ProtobufMapperDecoder) {
        return OrderEntryConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Allocation.KotlinxSerializer::class)
@SerialName(value = Allocation.TYPE_URL)
public data class Allocation(
  @ProtobufIndex(index = 1)
  public val orderId: ULong,
  @ProtobufIndex(index = 2)
  public val quantity: String,
  @ProtobufIndex(index = 3)
  public val account: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.Allocation"
  }

  public object KotlinxSerializer : KSerializer<Allocation> {
    private val delegator: KSerializer<Allocation> = Allocation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Allocation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AllocationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Allocation {
      if (decoder is ProtobufMapperDecoder) {
        return AllocationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
