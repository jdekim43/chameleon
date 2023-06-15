// Transform from cosmos/distribution/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

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

@Serializable(with = MsgSetWithdrawAddress.KotlinxSerializer::class)
@SerialName(value = MsgSetWithdrawAddress.TYPE_URL)
public data class MsgSetWithdrawAddress(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val withdrawAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.MsgSetWithdrawAddress"
  }

  public object KotlinxSerializer : KSerializer<MsgSetWithdrawAddress> {
    private val delegator: KSerializer<MsgSetWithdrawAddress> = MsgSetWithdrawAddress.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetWithdrawAddress): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSetWithdrawAddressConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetWithdrawAddress {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetWithdrawAddressConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSetWithdrawAddressResponse.KotlinxSerializer::class)
@SerialName(value = MsgSetWithdrawAddressResponse.TYPE_URL)
public class MsgSetWithdrawAddressResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSetWithdrawAddressResponse> {
    private val delegator: KSerializer<MsgSetWithdrawAddressResponse> =
        MsgSetWithdrawAddressResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetWithdrawAddressResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSetWithdrawAddressResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetWithdrawAddressResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetWithdrawAddressResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawDelegatorReward.KotlinxSerializer::class)
@SerialName(value = MsgWithdrawDelegatorReward.TYPE_URL)
public data class MsgWithdrawDelegatorReward(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward"
  }

  public object KotlinxSerializer : KSerializer<MsgWithdrawDelegatorReward> {
    private val delegator: KSerializer<MsgWithdrawDelegatorReward> =
        MsgWithdrawDelegatorReward.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawDelegatorReward): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgWithdrawDelegatorRewardConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawDelegatorReward {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawDelegatorRewardConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawDelegatorRewardResponse.KotlinxSerializer::class)
@SerialName(value = MsgWithdrawDelegatorRewardResponse.TYPE_URL)
public data class MsgWithdrawDelegatorRewardResponse(
  @ProtobufIndex(index = 1)
  public val amount: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgWithdrawDelegatorRewardResponse> {
    private val delegator: KSerializer<MsgWithdrawDelegatorRewardResponse> =
        MsgWithdrawDelegatorRewardResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawDelegatorRewardResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgWithdrawDelegatorRewardResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawDelegatorRewardResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawDelegatorRewardResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawValidatorCommission.KotlinxSerializer::class)
@SerialName(value = MsgWithdrawValidatorCommission.TYPE_URL)
public data class MsgWithdrawValidatorCommission(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission"
  }

  public object KotlinxSerializer : KSerializer<MsgWithdrawValidatorCommission> {
    private val delegator: KSerializer<MsgWithdrawValidatorCommission> =
        MsgWithdrawValidatorCommission.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawValidatorCommission): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgWithdrawValidatorCommissionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawValidatorCommission {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawValidatorCommissionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawValidatorCommissionResponse.KotlinxSerializer::class)
@SerialName(value = MsgWithdrawValidatorCommissionResponse.TYPE_URL)
public data class MsgWithdrawValidatorCommissionResponse(
  @ProtobufIndex(index = 1)
  public val amount: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgWithdrawValidatorCommissionResponse> {
    private val delegator: KSerializer<MsgWithdrawValidatorCommissionResponse> =
        MsgWithdrawValidatorCommissionResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgWithdrawValidatorCommissionResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgWithdrawValidatorCommissionResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawValidatorCommissionResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawValidatorCommissionResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgFundCommunityPool.KotlinxSerializer::class)
@SerialName(value = MsgFundCommunityPool.TYPE_URL)
public data class MsgFundCommunityPool(
  @ProtobufIndex(index = 1)
  public val amount: List<Coin>,
  @ProtobufIndex(index = 2)
  public val depositor: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.MsgFundCommunityPool"
  }

  public object KotlinxSerializer : KSerializer<MsgFundCommunityPool> {
    private val delegator: KSerializer<MsgFundCommunityPool> = MsgFundCommunityPool.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgFundCommunityPool): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgFundCommunityPoolConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgFundCommunityPool {
      if (decoder is ProtobufMapperDecoder) {
        return MsgFundCommunityPoolConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgFundCommunityPoolResponse.KotlinxSerializer::class)
@SerialName(value = MsgFundCommunityPoolResponse.TYPE_URL)
public class MsgFundCommunityPoolResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgFundCommunityPoolResponse> {
    private val delegator: KSerializer<MsgFundCommunityPoolResponse> =
        MsgFundCommunityPoolResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgFundCommunityPoolResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgFundCommunityPoolResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgFundCommunityPoolResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgFundCommunityPoolResponseConverter.deserialize(decoder.decodeByteArray())
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
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.MsgUpdateParams"
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
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.MsgUpdateParamsResponse"
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

@Serializable(with = MsgCommunityPoolSpend.KotlinxSerializer::class)
@SerialName(value = MsgCommunityPoolSpend.TYPE_URL)
public data class MsgCommunityPoolSpend(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val recipient: String,
  @ProtobufIndex(index = 3)
  public val amount: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.MsgCommunityPoolSpend"
  }

  public object KotlinxSerializer : KSerializer<MsgCommunityPoolSpend> {
    private val delegator: KSerializer<MsgCommunityPoolSpend> = MsgCommunityPoolSpend.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCommunityPoolSpend): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCommunityPoolSpendConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCommunityPoolSpend {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCommunityPoolSpendConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCommunityPoolSpendResponse.KotlinxSerializer::class)
@SerialName(value = MsgCommunityPoolSpendResponse.TYPE_URL)
public class MsgCommunityPoolSpendResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.MsgCommunityPoolSpendResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCommunityPoolSpendResponse> {
    private val delegator: KSerializer<MsgCommunityPoolSpendResponse> =
        MsgCommunityPoolSpendResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCommunityPoolSpendResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCommunityPoolSpendResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCommunityPoolSpendResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCommunityPoolSpendResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
