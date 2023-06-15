// Transform from dex/pair.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.String
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

@Serializable(with = Pair.KotlinxSerializer::class)
@SerialName(value = Pair.TYPE_URL)
public data class Pair(
  @ProtobufIndex(index = 1)
  public val priceDenom: String,
  @ProtobufIndex(index = 2)
  public val assetDenom: String,
  @ProtobufIndex(index = 3)
  public val priceTicksize: String,
  @ProtobufIndex(index = 4)
  public val quantityTicksize: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.Pair"
  }

  public object KotlinxSerializer : KSerializer<Pair> {
    private val delegator: KSerializer<Pair> = Pair.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Pair): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PairConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Pair {
      if (decoder is ProtobufMapperDecoder) {
        return PairConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchContractPair.KotlinxSerializer::class)
@SerialName(value = BatchContractPair.TYPE_URL)
public data class BatchContractPair(
  @ProtobufIndex(index = 1)
  public val contractAddr: String,
  @ProtobufIndex(index = 2)
  public val pairs: List<Pair>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.BatchContractPair"
  }

  public object KotlinxSerializer : KSerializer<BatchContractPair> {
    private val delegator: KSerializer<BatchContractPair> = BatchContractPair.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BatchContractPair): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchContractPairConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchContractPair {
      if (decoder is ProtobufMapperDecoder) {
        return BatchContractPairConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
