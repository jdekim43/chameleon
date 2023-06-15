// Transform from cosmos/params/v1beta1/params.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.params.v1beta1

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

@Serializable(with = ParameterChangeProposal.KotlinxSerializer::class)
@SerialName(value = ParameterChangeProposal.TYPE_URL)
public data class ParameterChangeProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val changes: List<ParamChange>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.params.v1beta1.ParameterChangeProposal"
  }

  public object KotlinxSerializer : KSerializer<ParameterChangeProposal> {
    private val delegator: KSerializer<ParameterChangeProposal> =
        ParameterChangeProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ParameterChangeProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ParameterChangeProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ParameterChangeProposal {
      if (decoder is ProtobufMapperDecoder) {
        return ParameterChangeProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ParamChange.KotlinxSerializer::class)
@SerialName(value = ParamChange.TYPE_URL)
public data class ParamChange(
  @ProtobufIndex(index = 1)
  public val subspace: String,
  @ProtobufIndex(index = 2)
  public val key: String,
  @ProtobufIndex(index = 3)
  public val `value`: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.params.v1beta1.ParamChange"
  }

  public object KotlinxSerializer : KSerializer<ParamChange> {
    private val delegator: KSerializer<ParamChange> = ParamChange.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ParamChange): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ParamChangeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ParamChange {
      if (decoder is ProtobufMapperDecoder) {
        return ParamChangeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
