// Transform from tokenfactory/authorityMetadata.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

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

@Serializable(with = DenomAuthorityMetadata.KotlinxSerializer::class)
@SerialName(value = DenomAuthorityMetadata.TYPE_URL)
public data class DenomAuthorityMetadata(
  @ProtobufIndex(index = 1)
  public val admin: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.tokenfactory.DenomAuthorityMetadata"
  }

  public object KotlinxSerializer : KSerializer<DenomAuthorityMetadata> {
    private val delegator: KSerializer<DenomAuthorityMetadata> = DenomAuthorityMetadata.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DenomAuthorityMetadata): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DenomAuthorityMetadataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DenomAuthorityMetadata {
      if (decoder is ProtobufMapperDecoder) {
        return DenomAuthorityMetadataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
