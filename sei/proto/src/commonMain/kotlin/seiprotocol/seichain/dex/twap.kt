// Transform from dex/twap.proto
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

@Serializable(with = Twap.KotlinxSerializer::class)
@SerialName(value = Twap.TYPE_URL)
public data class Twap(
  @ProtobufIndex(index = 1)
  public val pair: Pair,
  @ProtobufIndex(index = 2)
  public val twap: String,
  @ProtobufIndex(index = 3)
  public val lookbackSeconds: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.Twap"
  }

  public object KotlinxSerializer : KSerializer<Twap> {
    private val delegator: KSerializer<Twap> = Twap.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Twap): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TwapConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Twap {
      if (decoder is ProtobufMapperDecoder) {
        return TwapConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
