// Transform from cosmos/evidence/v1beta1/evidence.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

import google.protobuf.Timestamp
import kotlin.Long
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

@Serializable(with = Equivocation.KotlinxSerializer::class)
@SerialName(value = Equivocation.TYPE_URL)
public data class Equivocation(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val time: Timestamp,
  @ProtobufIndex(index = 3)
  public val power: Long,
  @ProtobufIndex(index = 4)
  public val consensusAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.evidence.v1beta1.Equivocation"
  }

  public object KotlinxSerializer : KSerializer<Equivocation> {
    private val delegator: KSerializer<Equivocation> = Equivocation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Equivocation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EquivocationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Equivocation {
      if (decoder is ProtobufMapperDecoder) {
        return EquivocationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
