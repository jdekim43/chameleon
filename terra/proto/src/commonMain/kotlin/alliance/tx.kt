// Transform from alliance/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package alliance

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
    public const val TYPE_URL: String = "/alliance.MsgDelegate"
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
    public const val TYPE_URL: String = "/alliance.MsgDelegateResponse"
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
    public const val TYPE_URL: String = "/alliance.MsgUndelegate"
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
public class MsgUndelegateResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.MsgUndelegateResponse"
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

@Serializable(with = MsgRedelegate.KotlinxSerializer::class)
@SerialName(value = MsgRedelegate.TYPE_URL)
public data class MsgRedelegate(
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
    public const val TYPE_URL: String = "/alliance.MsgRedelegate"
  }

  public object KotlinxSerializer : KSerializer<MsgRedelegate> {
    private val delegator: KSerializer<MsgRedelegate> = MsgRedelegate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRedelegate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRedelegateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRedelegate {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRedelegateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRedelegateResponse.KotlinxSerializer::class)
@SerialName(value = MsgRedelegateResponse.TYPE_URL)
public class MsgRedelegateResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.MsgRedelegateResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRedelegateResponse> {
    private val delegator: KSerializer<MsgRedelegateResponse> = MsgRedelegateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRedelegateResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRedelegateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRedelegateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRedelegateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgClaimDelegationRewards.KotlinxSerializer::class)
@SerialName(value = MsgClaimDelegationRewards.TYPE_URL)
public data class MsgClaimDelegationRewards(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.MsgClaimDelegationRewards"
  }

  public object KotlinxSerializer : KSerializer<MsgClaimDelegationRewards> {
    private val delegator: KSerializer<MsgClaimDelegationRewards> =
        MsgClaimDelegationRewards.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgClaimDelegationRewards): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgClaimDelegationRewardsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgClaimDelegationRewards {
      if (decoder is ProtobufMapperDecoder) {
        return MsgClaimDelegationRewardsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgClaimDelegationRewardsResponse.KotlinxSerializer::class)
@SerialName(value = MsgClaimDelegationRewardsResponse.TYPE_URL)
public class MsgClaimDelegationRewardsResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.MsgClaimDelegationRewardsResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgClaimDelegationRewardsResponse> {
    private val delegator: KSerializer<MsgClaimDelegationRewardsResponse> =
        MsgClaimDelegationRewardsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgClaimDelegationRewardsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgClaimDelegationRewardsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgClaimDelegationRewardsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgClaimDelegationRewardsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
