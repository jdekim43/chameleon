// Transform from cosmos/bank/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import cosmos.base.v1beta1.Coin
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

@Serializable(with = MsgSend.KotlinxSerializer::class)
@SerialName(value = MsgSend.TYPE_URL)
public data class MsgSend(
  @ProtobufIndex(index = 1)
  public val fromAddress: String,
  @ProtobufIndex(index = 2)
  public val toAddress: String,
  @ProtobufIndex(index = 3)
  public val amount: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.MsgSend"
  }

  public object KotlinxSerializer : KSerializer<MsgSend> {
    private val delegator: KSerializer<MsgSend> = MsgSend.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSend): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSendConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSend {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSendConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSendResponse.KotlinxSerializer::class)
@SerialName(value = MsgSendResponse.TYPE_URL)
public class MsgSendResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.MsgSendResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSendResponse> {
    private val delegator: KSerializer<MsgSendResponse> = MsgSendResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSendResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSendResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSendResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSendResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgMultiSend.KotlinxSerializer::class)
@SerialName(value = MsgMultiSend.TYPE_URL)
public data class MsgMultiSend(
  @ProtobufIndex(index = 1)
  public val inputs: List<Input>,
  @ProtobufIndex(index = 2)
  public val outputs: List<Output>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.MsgMultiSend"
  }

  public object KotlinxSerializer : KSerializer<MsgMultiSend> {
    private val delegator: KSerializer<MsgMultiSend> = MsgMultiSend.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgMultiSend): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgMultiSendConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgMultiSend {
      if (decoder is ProtobufMapperDecoder) {
        return MsgMultiSendConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgMultiSendResponse.KotlinxSerializer::class)
@SerialName(value = MsgMultiSendResponse.TYPE_URL)
public class MsgMultiSendResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.MsgMultiSendResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgMultiSendResponse> {
    private val delegator: KSerializer<MsgMultiSendResponse> = MsgMultiSendResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgMultiSendResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgMultiSendResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgMultiSendResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgMultiSendResponseConverter.deserialize(decoder.decodeByteArray())
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
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.MsgUpdateParams"
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
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.MsgUpdateParamsResponse"
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

@Serializable(with = MsgSetSendEnabled.KotlinxSerializer::class)
@SerialName(value = MsgSetSendEnabled.TYPE_URL)
public data class MsgSetSendEnabled(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val sendEnabled: List<SendEnabled>,
  @ProtobufIndex(index = 3)
  public val useDefaultFor: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.MsgSetSendEnabled"
  }

  public object KotlinxSerializer : KSerializer<MsgSetSendEnabled> {
    private val delegator: KSerializer<MsgSetSendEnabled> = MsgSetSendEnabled.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetSendEnabled): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSetSendEnabledConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetSendEnabled {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetSendEnabledConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSetSendEnabledResponse.KotlinxSerializer::class)
@SerialName(value = MsgSetSendEnabledResponse.TYPE_URL)
public class MsgSetSendEnabledResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.MsgSetSendEnabledResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSetSendEnabledResponse> {
    private val delegator: KSerializer<MsgSetSendEnabledResponse> =
        MsgSetSendEnabledResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetSendEnabledResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSetSendEnabledResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetSendEnabledResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetSendEnabledResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
