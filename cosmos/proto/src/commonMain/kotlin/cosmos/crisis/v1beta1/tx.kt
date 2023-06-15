// Transform from cosmos/crisis/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crisis.v1beta1

import cosmos.base.v1beta1.Coin
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

@Serializable(with = MsgVerifyInvariant.KotlinxSerializer::class)
@SerialName(value = MsgVerifyInvariant.TYPE_URL)
public data class MsgVerifyInvariant(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val invariantModuleName: String,
  @ProtobufIndex(index = 3)
  public val invariantRoute: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.crisis.v1beta1.MsgVerifyInvariant"
  }

  public object KotlinxSerializer : KSerializer<MsgVerifyInvariant> {
    private val delegator: KSerializer<MsgVerifyInvariant> = MsgVerifyInvariant.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVerifyInvariant): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgVerifyInvariantConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVerifyInvariant {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVerifyInvariantConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVerifyInvariantResponse.KotlinxSerializer::class)
@SerialName(value = MsgVerifyInvariantResponse.TYPE_URL)
public class MsgVerifyInvariantResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.crisis.v1beta1.MsgVerifyInvariantResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgVerifyInvariantResponse> {
    private val delegator: KSerializer<MsgVerifyInvariantResponse> =
        MsgVerifyInvariantResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVerifyInvariantResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgVerifyInvariantResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVerifyInvariantResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVerifyInvariantResponseConverter.deserialize(decoder.decodeByteArray())
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
  public val constantFee: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.crisis.v1beta1.MsgUpdateParams"
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
    public const val TYPE_URL: String = "/cosmos.crisis.v1beta1.MsgUpdateParamsResponse"
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
