// Transform from cosmos/distribution/v1beta1/distribution.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import cosmos.base.v1beta1.Coin
import cosmos.base.v1beta1.DecCoin
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.ReplaceWith
import kotlin.String
import kotlin.UInt
import kotlin.ULong
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

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val communityTax: String,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 2)
  public val baseProposerReward: String,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 3)
  public val bonusProposerReward: String,
  @ProtobufIndex(index = 4)
  public val withdrawAddrEnabled: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.Params"
  }

  public object KotlinxSerializer : KSerializer<Params> {
    private val delegator: KSerializer<Params> = Params.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Params): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Params {
      if (decoder is ProtobufMapperDecoder) {
        return ParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorHistoricalRewards.KotlinxSerializer::class)
@SerialName(value = ValidatorHistoricalRewards.TYPE_URL)
public data class ValidatorHistoricalRewards(
  @ProtobufIndex(index = 1)
  public val cumulativeRewardRatio: List<DecCoin>,
  @ProtobufIndex(index = 2)
  public val referenceCount: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.ValidatorHistoricalRewards"
  }

  public object KotlinxSerializer : KSerializer<ValidatorHistoricalRewards> {
    private val delegator: KSerializer<ValidatorHistoricalRewards> =
        ValidatorHistoricalRewards.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorHistoricalRewards): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorHistoricalRewardsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorHistoricalRewards {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorHistoricalRewardsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorCurrentRewards.KotlinxSerializer::class)
@SerialName(value = ValidatorCurrentRewards.TYPE_URL)
public data class ValidatorCurrentRewards(
  @ProtobufIndex(index = 1)
  public val rewards: List<DecCoin>,
  @ProtobufIndex(index = 2)
  public val period: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.ValidatorCurrentRewards"
  }

  public object KotlinxSerializer : KSerializer<ValidatorCurrentRewards> {
    private val delegator: KSerializer<ValidatorCurrentRewards> =
        ValidatorCurrentRewards.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorCurrentRewards): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorCurrentRewardsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorCurrentRewards {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorCurrentRewardsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorAccumulatedCommission.KotlinxSerializer::class)
@SerialName(value = ValidatorAccumulatedCommission.TYPE_URL)
public data class ValidatorAccumulatedCommission(
  @ProtobufIndex(index = 1)
  public val commission: List<DecCoin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.ValidatorAccumulatedCommission"
  }

  public object KotlinxSerializer : KSerializer<ValidatorAccumulatedCommission> {
    private val delegator: KSerializer<ValidatorAccumulatedCommission> =
        ValidatorAccumulatedCommission.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorAccumulatedCommission): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorAccumulatedCommissionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorAccumulatedCommission {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorAccumulatedCommissionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorOutstandingRewards.KotlinxSerializer::class)
@SerialName(value = ValidatorOutstandingRewards.TYPE_URL)
public data class ValidatorOutstandingRewards(
  @ProtobufIndex(index = 1)
  public val rewards: List<DecCoin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.ValidatorOutstandingRewards"
  }

  public object KotlinxSerializer : KSerializer<ValidatorOutstandingRewards> {
    private val delegator: KSerializer<ValidatorOutstandingRewards> =
        ValidatorOutstandingRewards.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorOutstandingRewards): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorOutstandingRewardsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorOutstandingRewards {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorOutstandingRewardsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorSlashEvent.KotlinxSerializer::class)
@SerialName(value = ValidatorSlashEvent.TYPE_URL)
public data class ValidatorSlashEvent(
  @ProtobufIndex(index = 1)
  public val validatorPeriod: ULong,
  @ProtobufIndex(index = 2)
  public val fraction: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.ValidatorSlashEvent"
  }

  public object KotlinxSerializer : KSerializer<ValidatorSlashEvent> {
    private val delegator: KSerializer<ValidatorSlashEvent> = ValidatorSlashEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorSlashEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorSlashEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorSlashEvent {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorSlashEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorSlashEvents.KotlinxSerializer::class)
@SerialName(value = ValidatorSlashEvents.TYPE_URL)
public data class ValidatorSlashEvents(
  @ProtobufIndex(index = 1)
  public val validatorSlashEvents: List<ValidatorSlashEvent>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.ValidatorSlashEvents"
  }

  public object KotlinxSerializer : KSerializer<ValidatorSlashEvents> {
    private val delegator: KSerializer<ValidatorSlashEvents> = ValidatorSlashEvents.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorSlashEvents): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorSlashEventsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorSlashEvents {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorSlashEventsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeePool.KotlinxSerializer::class)
@SerialName(value = FeePool.TYPE_URL)
public data class FeePool(
  @ProtobufIndex(index = 1)
  public val communityPool: List<DecCoin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.FeePool"
  }

  public object KotlinxSerializer : KSerializer<FeePool> {
    private val delegator: KSerializer<FeePool> = FeePool.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeePool): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeePoolConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeePool {
      if (decoder is ProtobufMapperDecoder) {
        return FeePoolConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CommunityPoolSpendProposal.KotlinxSerializer::class)
@SerialName(value = CommunityPoolSpendProposal.TYPE_URL)
public data class CommunityPoolSpendProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val recipient: String,
  @ProtobufIndex(index = 4)
  public val amount: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.CommunityPoolSpendProposal"
  }

  public object KotlinxSerializer : KSerializer<CommunityPoolSpendProposal> {
    private val delegator: KSerializer<CommunityPoolSpendProposal> =
        CommunityPoolSpendProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CommunityPoolSpendProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CommunityPoolSpendProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CommunityPoolSpendProposal {
      if (decoder is ProtobufMapperDecoder) {
        return CommunityPoolSpendProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DelegatorStartingInfo.KotlinxSerializer::class)
@SerialName(value = DelegatorStartingInfo.TYPE_URL)
public data class DelegatorStartingInfo(
  @ProtobufIndex(index = 1)
  public val previousPeriod: ULong,
  @ProtobufIndex(index = 2)
  public val stake: String,
  @ProtobufIndex(index = 3)
  public val height: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.DelegatorStartingInfo"
  }

  public object KotlinxSerializer : KSerializer<DelegatorStartingInfo> {
    private val delegator: KSerializer<DelegatorStartingInfo> = DelegatorStartingInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DelegatorStartingInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DelegatorStartingInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DelegatorStartingInfo {
      if (decoder is ProtobufMapperDecoder) {
        return DelegatorStartingInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DelegationDelegatorReward.KotlinxSerializer::class)
@SerialName(value = DelegationDelegatorReward.TYPE_URL)
public data class DelegationDelegatorReward(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val reward: List<DecCoin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.DelegationDelegatorReward"
  }

  public object KotlinxSerializer : KSerializer<DelegationDelegatorReward> {
    private val delegator: KSerializer<DelegationDelegatorReward> =
        DelegationDelegatorReward.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DelegationDelegatorReward): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DelegationDelegatorRewardConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DelegationDelegatorReward {
      if (decoder is ProtobufMapperDecoder) {
        return DelegationDelegatorRewardConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CommunityPoolSpendProposalWithDeposit.KotlinxSerializer::class)
@SerialName(value = CommunityPoolSpendProposalWithDeposit.TYPE_URL)
public data class CommunityPoolSpendProposalWithDeposit(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val recipient: String,
  @ProtobufIndex(index = 4)
  public val amount: String,
  @ProtobufIndex(index = 5)
  public val deposit: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.CommunityPoolSpendProposalWithDeposit"
  }

  public object KotlinxSerializer : KSerializer<CommunityPoolSpendProposalWithDeposit> {
    private val delegator: KSerializer<CommunityPoolSpendProposalWithDeposit> =
        CommunityPoolSpendProposalWithDeposit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CommunityPoolSpendProposalWithDeposit):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CommunityPoolSpendProposalWithDepositConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CommunityPoolSpendProposalWithDeposit {
      if (decoder is ProtobufMapperDecoder) {
        return CommunityPoolSpendProposalWithDepositConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
