// Transform from cosmos/consensus/v1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.consensus.v1

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
import tendermint.types.BlockParams
import tendermint.types.EvidenceParams
import tendermint.types.ValidatorParams

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParams.TYPE_URL)
public data class MsgUpdateParams(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val block: BlockParams,
  @ProtobufIndex(index = 3)
  public val evidence: EvidenceParams,
  @ProtobufIndex(index = 4)
  public val validator: ValidatorParams,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.consensus.v1.MsgUpdateParams"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateParams> {
    private val delegator: KSerializer<MsgUpdateParams> = MsgUpdateParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParams {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParamsResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParamsResponse.TYPE_URL)
public class MsgUpdateParamsResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.consensus.v1.MsgUpdateParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateParamsResponse> {
    private val delegator: KSerializer<MsgUpdateParamsResponse> =
        MsgUpdateParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
