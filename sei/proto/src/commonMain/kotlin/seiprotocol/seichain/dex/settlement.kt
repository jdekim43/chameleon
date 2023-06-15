// Transform from dex/settlement.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.Long
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

@Serializable(with = SettlementEntry.KotlinxSerializer::class)
@SerialName(value = SettlementEntry.TYPE_URL)
public data class SettlementEntry(
  @ProtobufIndex(index = 1)
  public val account: String,
  @ProtobufIndex(index = 2)
  public val priceDenom: String,
  @ProtobufIndex(index = 3)
  public val assetDenom: String,
  @ProtobufIndex(index = 4)
  public val quantity: String,
  @ProtobufIndex(index = 5)
  public val executionCostOrProceed: String,
  @ProtobufIndex(index = 6)
  public val expectedCostOrProceed: String,
  @ProtobufIndex(index = 7)
  public val positionDirection: String,
  @ProtobufIndex(index = 8)
  public val orderType: String,
  @ProtobufIndex(index = 9)
  public val orderId: ULong,
  @ProtobufIndex(index = 10)
  public val timestamp: ULong,
  @ProtobufIndex(index = 11)
  public val height: ULong,
  @ProtobufIndex(index = 12)
  public val settlementId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.SettlementEntry"
  }

  public object KotlinxSerializer : KSerializer<SettlementEntry> {
    private val delegator: KSerializer<SettlementEntry> = SettlementEntry.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SettlementEntry): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SettlementEntryConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SettlementEntry {
      if (decoder is ProtobufMapperDecoder) {
        return SettlementEntryConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Settlements.KotlinxSerializer::class)
@SerialName(value = Settlements.TYPE_URL)
public data class Settlements(
  @ProtobufIndex(index = 1)
  public val epoch: Long,
  @ProtobufIndex(index = 2)
  public val entries: List<SettlementEntry>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.Settlements"
  }

  public object KotlinxSerializer : KSerializer<Settlements> {
    private val delegator: KSerializer<Settlements> = Settlements.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Settlements): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SettlementsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Settlements {
      if (decoder is ProtobufMapperDecoder) {
        return SettlementsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
