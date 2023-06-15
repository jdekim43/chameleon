// Transform from cosmos/slashing/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

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

@Serializable(with = MsgUnjail.KotlinxSerializer::class)
@SerialName(value = MsgUnjail.TYPE_URL)
public data class MsgUnjail(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.MsgUnjail"
  }

  public object KotlinxSerializer : KSerializer<MsgUnjail> {
    private val delegator: KSerializer<MsgUnjail> = MsgUnjail.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnjail): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUnjailConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnjail {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnjailConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUnjailResponse.KotlinxSerializer::class)
@SerialName(value = MsgUnjailResponse.TYPE_URL)
public class MsgUnjailResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.MsgUnjailResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUnjailResponse> {
    private val delegator: KSerializer<MsgUnjailResponse> = MsgUnjailResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnjailResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUnjailResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnjailResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnjailResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParams.TYPE_URL)
public data class MsgUpdateParams(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.MsgUpdateParams"
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
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.MsgUpdateParamsResponse"
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
