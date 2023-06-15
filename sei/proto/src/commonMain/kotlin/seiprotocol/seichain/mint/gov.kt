// Transform from mint/v1beta1/gov.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

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

@Serializable(with = UpdateMinterProposal.KotlinxSerializer::class)
@SerialName(value = UpdateMinterProposal.TYPE_URL)
public data class UpdateMinterProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val minter: Minter,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.mint.UpdateMinterProposal"
  }

  public object KotlinxSerializer : KSerializer<UpdateMinterProposal> {
    private val delegator: KSerializer<UpdateMinterProposal> = UpdateMinterProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UpdateMinterProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UpdateMinterProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UpdateMinterProposal {
      if (decoder is ProtobufMapperDecoder) {
        return UpdateMinterProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
