// Transform from dex/price.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.String
import kotlin.ULong
import kotlin.Unit
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

@Serializable(with = Price.KotlinxSerializer::class)
@SerialName(value = Price.TYPE_URL)
public data class Price(
  @ProtobufIndex(index = 1)
  public val snapshotTimestampInSeconds: ULong,
  @ProtobufIndex(index = 2)
  public val price: String,
  @ProtobufIndex(index = 3)
  public val pair: Pair,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.Price"
  }

  public object KotlinxSerializer : KSerializer<Price> {
    private val delegator: KSerializer<Price> = Price.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Price): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Price {
      if (decoder is ProtobufMapperDecoder) {
        return PriceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PriceCandlestick.KotlinxSerializer::class)
@SerialName(value = PriceCandlestick.TYPE_URL)
public data class PriceCandlestick(
  @ProtobufIndex(index = 1)
  public val beginTimestamp: ULong,
  @ProtobufIndex(index = 2)
  public val endTimestamp: ULong,
  @ProtobufIndex(index = 3)
  public val `open`: String,
  @ProtobufIndex(index = 4)
  public val high: String,
  @ProtobufIndex(index = 5)
  public val low: String,
  @ProtobufIndex(index = 6)
  public val close: String,
  @ProtobufIndex(index = 7)
  public val volume: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.PriceCandlestick"
  }

  public object KotlinxSerializer : KSerializer<PriceCandlestick> {
    private val delegator: KSerializer<PriceCandlestick> = PriceCandlestick.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PriceCandlestick): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceCandlestickConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PriceCandlestick {
      if (decoder is ProtobufMapperDecoder) {
        return PriceCandlestickConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
