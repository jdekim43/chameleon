// Transform from dex/tick_size.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.String
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

@Serializable(with = TickSize.KotlinxSerializer::class)
@SerialName(value = TickSize.TYPE_URL)
public data class TickSize(
  @ProtobufIndex(index = 1)
  public val pair: Pair,
  @ProtobufIndex(index = 2)
  public val ticksize: String,
  @ProtobufIndex(index = 3)
  public val contractAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.TickSize"
  }

  public object KotlinxSerializer : KSerializer<TickSize> {
    private val delegator: KSerializer<TickSize> = TickSize.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TickSize): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TickSizeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TickSize {
      if (decoder is ProtobufMapperDecoder) {
        return TickSizeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
