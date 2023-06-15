// Transform from cosmos/staking/v1beta1/staking.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import cosmos.base.v1beta1.Coin
import google.protobuf.Any
import google.protobuf.Duration
import google.protobuf.Timestamp
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
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
import tendermint.abci.ValidatorUpdate
import tendermint.types.Header

@Serializable
@SerialName(value = "/cosmos.staking.v1beta1.BondStatus")
public enum class BondStatus(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  BOND_STATUS_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  BOND_STATUS_UNBONDED(1),
  @ProtobufIndex(index = 2)
  BOND_STATUS_UNBONDING(2),
  @ProtobufIndex(index = 3)
  BOND_STATUS_BONDED(3),
  ;

  public companion object {
    public fun forNumber(number: Int): BondStatus = BondStatus.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/cosmos.staking.v1beta1.Infraction")
public enum class Infraction(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  INFRACTION_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  INFRACTION_DOUBLE_SIGN(1),
  @ProtobufIndex(index = 2)
  INFRACTION_DOWNTIME(2),
  ;

  public companion object {
    public fun forNumber(number: Int): Infraction = Infraction.values()
    	.first { it.number == number }
  }
}

@Serializable(with = HistoricalInfo.KotlinxSerializer::class)
@SerialName(value = HistoricalInfo.TYPE_URL)
public data class HistoricalInfo(
  @ProtobufIndex(index = 1)
  public val `header`: Header,
  @ProtobufIndex(index = 2)
  public val valset: List<Validator>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.HistoricalInfo"
  }

  public object KotlinxSerializer : KSerializer<HistoricalInfo> {
    private val delegator: KSerializer<HistoricalInfo> = HistoricalInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: HistoricalInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(HistoricalInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): HistoricalInfo {
      if (decoder is ProtobufMapperDecoder) {
        return HistoricalInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CommissionRates.KotlinxSerializer::class)
@SerialName(value = CommissionRates.TYPE_URL)
public data class CommissionRates(
  @ProtobufIndex(index = 1)
  public val rate: String,
  @ProtobufIndex(index = 2)
  public val maxRate: String,
  @ProtobufIndex(index = 3)
  public val maxChangeRate: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.CommissionRates"
  }

  public object KotlinxSerializer : KSerializer<CommissionRates> {
    private val delegator: KSerializer<CommissionRates> = CommissionRates.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CommissionRates): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CommissionRatesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CommissionRates {
      if (decoder is ProtobufMapperDecoder) {
        return CommissionRatesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Commission.KotlinxSerializer::class)
@SerialName(value = Commission.TYPE_URL)
public data class Commission(
  @ProtobufIndex(index = 1)
  public val commissionRates: CommissionRates,
  @ProtobufIndex(index = 2)
  public val updateTime: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.Commission"
  }

  public object KotlinxSerializer : KSerializer<Commission> {
    private val delegator: KSerializer<Commission> = Commission.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Commission): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CommissionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Commission {
      if (decoder is ProtobufMapperDecoder) {
        return CommissionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Description.KotlinxSerializer::class)
@SerialName(value = Description.TYPE_URL)
public data class Description(
  @ProtobufIndex(index = 1)
  public val moniker: String,
  @ProtobufIndex(index = 2)
  public val identity: String,
  @ProtobufIndex(index = 3)
  public val website: String,
  @ProtobufIndex(index = 4)
  public val securityContact: String,
  @ProtobufIndex(index = 5)
  public val details: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.Description"
  }

  public object KotlinxSerializer : KSerializer<Description> {
    private val delegator: KSerializer<Description> = Description.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Description): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DescriptionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Description {
      if (decoder is ProtobufMapperDecoder) {
        return DescriptionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Validator.KotlinxSerializer::class)
@SerialName(value = Validator.TYPE_URL)
public data class Validator(
  @ProtobufIndex(index = 1)
  public val operatorAddress: String,
  @ProtobufIndex(index = 2)
  public val consensusPubkey: Any,
  @ProtobufIndex(index = 3)
  public val jailed: Boolean,
  @ProtobufIndex(index = 4)
  public val status: BondStatus,
  @ProtobufIndex(index = 5)
  public val tokens: String,
  @ProtobufIndex(index = 6)
  public val delegatorShares: String,
  @ProtobufIndex(index = 7)
  public val description: Description,
  @ProtobufIndex(index = 8)
  public val unbondingHeight: Long,
  @ProtobufIndex(index = 9)
  public val unbondingTime: Timestamp,
  @ProtobufIndex(index = 10)
  public val commission: Commission,
  @ProtobufIndex(index = 11)
  public val minSelfDelegation: String,
  @ProtobufIndex(index = 12)
  public val unbondingOnHoldRefCount: Long,
  @ProtobufIndex(index = 13)
  public val unbondingIds: List<ULong>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.Validator"
  }

  public object KotlinxSerializer : KSerializer<Validator> {
    private val delegator: KSerializer<Validator> = Validator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Validator): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Validator {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValAddresses.KotlinxSerializer::class)
@SerialName(value = ValAddresses.TYPE_URL)
public data class ValAddresses(
  @ProtobufIndex(index = 1)
  public val addresses: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.ValAddresses"
  }

  public object KotlinxSerializer : KSerializer<ValAddresses> {
    private val delegator: KSerializer<ValAddresses> = ValAddresses.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValAddresses): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValAddressesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValAddresses {
      if (decoder is ProtobufMapperDecoder) {
        return ValAddressesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DVPair.KotlinxSerializer::class)
@SerialName(value = DVPair.TYPE_URL)
public data class DVPair(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.DVPair"
  }

  public object KotlinxSerializer : KSerializer<DVPair> {
    private val delegator: KSerializer<DVPair> = DVPair.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DVPair): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DVPairConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DVPair {
      if (decoder is ProtobufMapperDecoder) {
        return DVPairConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DVPairs.KotlinxSerializer::class)
@SerialName(value = DVPairs.TYPE_URL)
public data class DVPairs(
  @ProtobufIndex(index = 1)
  public val pairs: List<DVPair>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.DVPairs"
  }

  public object KotlinxSerializer : KSerializer<DVPairs> {
    private val delegator: KSerializer<DVPairs> = DVPairs.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DVPairs): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DVPairsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DVPairs {
      if (decoder is ProtobufMapperDecoder) {
        return DVPairsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DVVTriplet.KotlinxSerializer::class)
@SerialName(value = DVVTriplet.TYPE_URL)
public data class DVVTriplet(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorSrcAddress: String,
  @ProtobufIndex(index = 3)
  public val validatorDstAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.DVVTriplet"
  }

  public object KotlinxSerializer : KSerializer<DVVTriplet> {
    private val delegator: KSerializer<DVVTriplet> = DVVTriplet.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DVVTriplet): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DVVTripletConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DVVTriplet {
      if (decoder is ProtobufMapperDecoder) {
        return DVVTripletConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DVVTriplets.KotlinxSerializer::class)
@SerialName(value = DVVTriplets.TYPE_URL)
public data class DVVTriplets(
  @ProtobufIndex(index = 1)
  public val triplets: List<DVVTriplet>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.DVVTriplets"
  }

  public object KotlinxSerializer : KSerializer<DVVTriplets> {
    private val delegator: KSerializer<DVVTriplets> = DVVTriplets.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DVVTriplets): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DVVTripletsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DVVTriplets {
      if (decoder is ProtobufMapperDecoder) {
        return DVVTripletsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Delegation.KotlinxSerializer::class)
@SerialName(value = Delegation.TYPE_URL)
public data class Delegation(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val shares: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.Delegation"
  }

  public object KotlinxSerializer : KSerializer<Delegation> {
    private val delegator: KSerializer<Delegation> = Delegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Delegation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DelegationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Delegation {
      if (decoder is ProtobufMapperDecoder) {
        return DelegationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UnbondingDelegation.KotlinxSerializer::class)
@SerialName(value = UnbondingDelegation.TYPE_URL)
public data class UnbondingDelegation(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val entries: List<UnbondingDelegationEntry>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.UnbondingDelegation"
  }

  public object KotlinxSerializer : KSerializer<UnbondingDelegation> {
    private val delegator: KSerializer<UnbondingDelegation> = UnbondingDelegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UnbondingDelegation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UnbondingDelegationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UnbondingDelegation {
      if (decoder is ProtobufMapperDecoder) {
        return UnbondingDelegationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UnbondingDelegationEntry.KotlinxSerializer::class)
@SerialName(value = UnbondingDelegationEntry.TYPE_URL)
public data class UnbondingDelegationEntry(
  @ProtobufIndex(index = 1)
  public val creationHeight: Long,
  @ProtobufIndex(index = 2)
  public val completionTime: Timestamp,
  @ProtobufIndex(index = 3)
  public val initialBalance: String,
  @ProtobufIndex(index = 4)
  public val balance: String,
  @ProtobufIndex(index = 5)
  public val unbondingId: ULong,
  @ProtobufIndex(index = 6)
  public val unbondingOnHoldRefCount: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.UnbondingDelegationEntry"
  }

  public object KotlinxSerializer : KSerializer<UnbondingDelegationEntry> {
    private val delegator: KSerializer<UnbondingDelegationEntry> =
        UnbondingDelegationEntry.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UnbondingDelegationEntry): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UnbondingDelegationEntryConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UnbondingDelegationEntry {
      if (decoder is ProtobufMapperDecoder) {
        return UnbondingDelegationEntryConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RedelegationEntry.KotlinxSerializer::class)
@SerialName(value = RedelegationEntry.TYPE_URL)
public data class RedelegationEntry(
  @ProtobufIndex(index = 1)
  public val creationHeight: Long,
  @ProtobufIndex(index = 2)
  public val completionTime: Timestamp,
  @ProtobufIndex(index = 3)
  public val initialBalance: String,
  @ProtobufIndex(index = 4)
  public val sharesDst: String,
  @ProtobufIndex(index = 5)
  public val unbondingId: ULong,
  @ProtobufIndex(index = 6)
  public val unbondingOnHoldRefCount: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.RedelegationEntry"
  }

  public object KotlinxSerializer : KSerializer<RedelegationEntry> {
    private val delegator: KSerializer<RedelegationEntry> = RedelegationEntry.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RedelegationEntry): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RedelegationEntryConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RedelegationEntry {
      if (decoder is ProtobufMapperDecoder) {
        return RedelegationEntryConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Redelegation.KotlinxSerializer::class)
@SerialName(value = Redelegation.TYPE_URL)
public data class Redelegation(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorSrcAddress: String,
  @ProtobufIndex(index = 3)
  public val validatorDstAddress: String,
  @ProtobufIndex(index = 4)
  public val entries: List<RedelegationEntry>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.Redelegation"
  }

  public object KotlinxSerializer : KSerializer<Redelegation> {
    private val delegator: KSerializer<Redelegation> = Redelegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Redelegation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RedelegationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Redelegation {
      if (decoder is ProtobufMapperDecoder) {
        return RedelegationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val unbondingTime: Duration,
  @ProtobufIndex(index = 2)
  public val maxValidators: UInt,
  @ProtobufIndex(index = 3)
  public val maxEntries: UInt,
  @ProtobufIndex(index = 4)
  public val historicalEntries: UInt,
  @ProtobufIndex(index = 5)
  public val bondDenom: String,
  @ProtobufIndex(index = 6)
  public val minCommissionRate: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.Params"
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

@Serializable(with = DelegationResponse.KotlinxSerializer::class)
@SerialName(value = DelegationResponse.TYPE_URL)
public data class DelegationResponse(
  @ProtobufIndex(index = 1)
  public val delegation: Delegation,
  @ProtobufIndex(index = 2)
  public val balance: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.DelegationResponse"
  }

  public object KotlinxSerializer : KSerializer<DelegationResponse> {
    private val delegator: KSerializer<DelegationResponse> = DelegationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DelegationResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DelegationResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DelegationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return DelegationResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RedelegationEntryResponse.KotlinxSerializer::class)
@SerialName(value = RedelegationEntryResponse.TYPE_URL)
public data class RedelegationEntryResponse(
  @ProtobufIndex(index = 1)
  public val redelegationEntry: RedelegationEntry,
  @ProtobufIndex(index = 4)
  public val balance: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.RedelegationEntryResponse"
  }

  public object KotlinxSerializer : KSerializer<RedelegationEntryResponse> {
    private val delegator: KSerializer<RedelegationEntryResponse> =
        RedelegationEntryResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RedelegationEntryResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RedelegationEntryResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RedelegationEntryResponse {
      if (decoder is ProtobufMapperDecoder) {
        return RedelegationEntryResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RedelegationResponse.KotlinxSerializer::class)
@SerialName(value = RedelegationResponse.TYPE_URL)
public data class RedelegationResponse(
  @ProtobufIndex(index = 1)
  public val redelegation: Redelegation,
  @ProtobufIndex(index = 2)
  public val entries: List<RedelegationEntryResponse>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.RedelegationResponse"
  }

  public object KotlinxSerializer : KSerializer<RedelegationResponse> {
    private val delegator: KSerializer<RedelegationResponse> = RedelegationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RedelegationResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RedelegationResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RedelegationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return RedelegationResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Pool.KotlinxSerializer::class)
@SerialName(value = Pool.TYPE_URL)
public data class Pool(
  @ProtobufIndex(index = 1)
  public val notBondedTokens: String,
  @ProtobufIndex(index = 2)
  public val bondedTokens: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.Pool"
  }

  public object KotlinxSerializer : KSerializer<Pool> {
    private val delegator: KSerializer<Pool> = Pool.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Pool): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PoolConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Pool {
      if (decoder is ProtobufMapperDecoder) {
        return PoolConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorUpdates.KotlinxSerializer::class)
@SerialName(value = ValidatorUpdates.TYPE_URL)
public data class ValidatorUpdates(
  @ProtobufIndex(index = 1)
  public val updates: List<ValidatorUpdate>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.ValidatorUpdates"
  }

  public object KotlinxSerializer : KSerializer<ValidatorUpdates> {
    private val delegator: KSerializer<ValidatorUpdates> = ValidatorUpdates.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorUpdates): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorUpdatesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorUpdates {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorUpdatesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
