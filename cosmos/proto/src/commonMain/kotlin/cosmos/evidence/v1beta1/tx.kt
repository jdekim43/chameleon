// Transform from cosmos/evidence/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

import google.protobuf.Any
import kotlin.ByteArray
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

@Serializable(with = MsgSubmitEvidence.KotlinxSerializer::class)
@SerialName(value = MsgSubmitEvidence.TYPE_URL)
public data class MsgSubmitEvidence(
  @ProtobufIndex(index = 1)
  public val submitter: String,
  @ProtobufIndex(index = 2)
  public val evidence: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.evidence.v1beta1.MsgSubmitEvidence"
  }

  public object KotlinxSerializer : KSerializer<MsgSubmitEvidence> {
    private val delegator: KSerializer<MsgSubmitEvidence> = MsgSubmitEvidence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubmitEvidence): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSubmitEvidenceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubmitEvidence {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubmitEvidenceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSubmitEvidenceResponse.KotlinxSerializer::class)
@SerialName(value = MsgSubmitEvidenceResponse.TYPE_URL)
public data class MsgSubmitEvidenceResponse(
  @ProtobufIndex(index = 4)
  public val hash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSubmitEvidenceResponse> {
    private val delegator: KSerializer<MsgSubmitEvidenceResponse> =
        MsgSubmitEvidenceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubmitEvidenceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSubmitEvidenceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubmitEvidenceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubmitEvidenceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
