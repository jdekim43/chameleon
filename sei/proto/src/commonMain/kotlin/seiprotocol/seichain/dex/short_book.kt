// Transform from dex/short_book.proto
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

@Serializable(with = ShortBook.KotlinxSerializer::class)
@SerialName(value = ShortBook.TYPE_URL)
public data class ShortBook(
  @ProtobufIndex(index = 1)
  public val price: String,
  @ProtobufIndex(index = 2)
  public val entry: OrderEntry,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.ShortBook"
  }

  public object KotlinxSerializer : KSerializer<ShortBook> {
    private val delegator: KSerializer<ShortBook> = ShortBook.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ShortBook): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ShortBookConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ShortBook {
      if (decoder is ProtobufMapperDecoder) {
        return ShortBookConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
