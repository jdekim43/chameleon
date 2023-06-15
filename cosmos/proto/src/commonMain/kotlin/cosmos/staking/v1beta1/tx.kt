// Transform from cosmos/staking/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import cosmos.base.v1beta1.Coin
import google.protobuf.Any
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

@Serializable(with = MsgCreateValidator.KotlinxSerializer::class)
@SerialName(value = MsgCreateValidator.TYPE_URL)
public data class MsgCreateValidator(
  @ProtobufIndex(index = 1)
  public val description: Description,
  @ProtobufIndex(index = 2)
  public val commission: CommissionRates,
  @ProtobufIndex(index = 3)
  public val minSelfDelegation: String,
  @ProtobufIndex(index = 4)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 5)
  public val validatorAddress: String,
  @ProtobufIndex(index = 6)
  public val pubkey: Any,
  @ProtobufIndex(index = 7)
  public val `value`: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgCreateValidator"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateValidator> {
    private val delegator: KSerializer<MsgCreateValidator> = MsgCreateValidator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateValidator): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateValidatorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateValidator {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateValidatorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateValidatorResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateValidatorResponse.TYPE_URL)
public class MsgCreateValidatorResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgCreateValidatorResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateValidatorResponse> {
    private val delegator: KSerializer<MsgCreateValidatorResponse> =
        MsgCreateValidatorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateValidatorResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateValidatorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateValidatorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateValidatorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgEditValidator.KotlinxSerializer::class)
@SerialName(value = MsgEditValidator.TYPE_URL)
public data class MsgEditValidator(
  @ProtobufIndex(index = 1)
  public val description: Description,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val commissionRate: String,
  @ProtobufIndex(index = 4)
  public val minSelfDelegation: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgEditValidator"
  }

  public object KotlinxSerializer : KSerializer<MsgEditValidator> {
    private val delegator: KSerializer<MsgEditValidator> = MsgEditValidator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgEditValidator): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgEditValidatorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgEditValidator {
      if (decoder is ProtobufMapperDecoder) {
        return MsgEditValidatorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgEditValidatorResponse.KotlinxSerializer::class)
@SerialName(value = MsgEditValidatorResponse.TYPE_URL)
public class MsgEditValidatorResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgEditValidatorResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgEditValidatorResponse> {
    private val delegator: KSerializer<MsgEditValidatorResponse> =
        MsgEditValidatorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgEditValidatorResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgEditValidatorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgEditValidatorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgEditValidatorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDelegate.KotlinxSerializer::class)
@SerialName(value = MsgDelegate.TYPE_URL)
public data class MsgDelegate(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgDelegate"
  }

  public object KotlinxSerializer : KSerializer<MsgDelegate> {
    private val delegator: KSerializer<MsgDelegate> = MsgDelegate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDelegate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDelegateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDelegate {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDelegateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDelegateResponse.KotlinxSerializer::class)
@SerialName(value = MsgDelegateResponse.TYPE_URL)
public class MsgDelegateResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgDelegateResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgDelegateResponse> {
    private val delegator: KSerializer<MsgDelegateResponse> = MsgDelegateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDelegateResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDelegateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDelegateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDelegateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBeginRedelegate.KotlinxSerializer::class)
@SerialName(value = MsgBeginRedelegate.TYPE_URL)
public data class MsgBeginRedelegate(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorSrcAddress: String,
  @ProtobufIndex(index = 3)
  public val validatorDstAddress: String,
  @ProtobufIndex(index = 4)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgBeginRedelegate"
  }

  public object KotlinxSerializer : KSerializer<MsgBeginRedelegate> {
    private val delegator: KSerializer<MsgBeginRedelegate> = MsgBeginRedelegate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBeginRedelegate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBeginRedelegateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBeginRedelegate {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBeginRedelegateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBeginRedelegateResponse.KotlinxSerializer::class)
@SerialName(value = MsgBeginRedelegateResponse.TYPE_URL)
public data class MsgBeginRedelegateResponse(
  @ProtobufIndex(index = 1)
  public val completionTime: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgBeginRedelegateResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgBeginRedelegateResponse> {
    private val delegator: KSerializer<MsgBeginRedelegateResponse> =
        MsgBeginRedelegateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBeginRedelegateResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBeginRedelegateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBeginRedelegateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBeginRedelegateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUndelegate.KotlinxSerializer::class)
@SerialName(value = MsgUndelegate.TYPE_URL)
public data class MsgUndelegate(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgUndelegate"
  }

  public object KotlinxSerializer : KSerializer<MsgUndelegate> {
    private val delegator: KSerializer<MsgUndelegate> = MsgUndelegate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUndelegate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUndelegateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUndelegate {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUndelegateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUndelegateResponse.KotlinxSerializer::class)
@SerialName(value = MsgUndelegateResponse.TYPE_URL)
public data class MsgUndelegateResponse(
  @ProtobufIndex(index = 1)
  public val completionTime: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgUndelegateResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUndelegateResponse> {
    private val delegator: KSerializer<MsgUndelegateResponse> = MsgUndelegateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUndelegateResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUndelegateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUndelegateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUndelegateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelUnbondingDelegation.KotlinxSerializer::class)
@SerialName(value = MsgCancelUnbondingDelegation.TYPE_URL)
public data class MsgCancelUnbondingDelegation(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
  @ProtobufIndex(index = 4)
  public val creationHeight: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgCancelUnbondingDelegation"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelUnbondingDelegation> {
    private val delegator: KSerializer<MsgCancelUnbondingDelegation> =
        MsgCancelUnbondingDelegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelUnbondingDelegation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelUnbondingDelegationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelUnbondingDelegation {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelUnbondingDelegationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelUnbondingDelegationResponse.KotlinxSerializer::class)
@SerialName(value = MsgCancelUnbondingDelegationResponse.TYPE_URL)
public class MsgCancelUnbondingDelegationResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.staking.v1beta1.MsgCancelUnbondingDelegationResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelUnbondingDelegationResponse> {
    private val delegator: KSerializer<MsgCancelUnbondingDelegationResponse> =
        MsgCancelUnbondingDelegationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelUnbondingDelegationResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelUnbondingDelegationResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelUnbondingDelegationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelUnbondingDelegationResponseConverter.deserialize(decoder.decodeByteArray())
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
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgUpdateParams"
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
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.MsgUpdateParamsResponse"
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
