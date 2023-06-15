// Transform from cosmos/vesting/v1beta1/vesting.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.vesting.v1beta1

import cosmos.auth.v1beta1.BaseAccount
import cosmos.base.v1beta1.Coin
import kotlin.Long
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

@Serializable(with = BaseVestingAccount.KotlinxSerializer::class)
@SerialName(value = BaseVestingAccount.TYPE_URL)
public data class BaseVestingAccount(
  @ProtobufIndex(index = 1)
  public val baseAccount: BaseAccount,
  @ProtobufIndex(index = 2)
  public val originalVesting: List<Coin>,
  @ProtobufIndex(index = 3)
  public val delegatedFree: List<Coin>,
  @ProtobufIndex(index = 4)
  public val delegatedVesting: List<Coin>,
  @ProtobufIndex(index = 5)
  public val endTime: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.vesting.v1beta1.BaseVestingAccount"
  }

  public object KotlinxSerializer : KSerializer<BaseVestingAccount> {
    private val delegator: KSerializer<BaseVestingAccount> = BaseVestingAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BaseVestingAccount): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BaseVestingAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BaseVestingAccount {
      if (decoder is ProtobufMapperDecoder) {
        return BaseVestingAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ContinuousVestingAccount.KotlinxSerializer::class)
@SerialName(value = ContinuousVestingAccount.TYPE_URL)
public data class ContinuousVestingAccount(
  @ProtobufIndex(index = 1)
  public val baseVestingAccount: BaseVestingAccount,
  @ProtobufIndex(index = 2)
  public val startTime: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.vesting.v1beta1.ContinuousVestingAccount"
  }

  public object KotlinxSerializer : KSerializer<ContinuousVestingAccount> {
    private val delegator: KSerializer<ContinuousVestingAccount> =
        ContinuousVestingAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContinuousVestingAccount): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContinuousVestingAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContinuousVestingAccount {
      if (decoder is ProtobufMapperDecoder) {
        return ContinuousVestingAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DelayedVestingAccount.KotlinxSerializer::class)
@SerialName(value = DelayedVestingAccount.TYPE_URL)
public data class DelayedVestingAccount(
  @ProtobufIndex(index = 1)
  public val baseVestingAccount: BaseVestingAccount,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.vesting.v1beta1.DelayedVestingAccount"
  }

  public object KotlinxSerializer : KSerializer<DelayedVestingAccount> {
    private val delegator: KSerializer<DelayedVestingAccount> = DelayedVestingAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DelayedVestingAccount): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DelayedVestingAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DelayedVestingAccount {
      if (decoder is ProtobufMapperDecoder) {
        return DelayedVestingAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Period.KotlinxSerializer::class)
@SerialName(value = Period.TYPE_URL)
public data class Period(
  @ProtobufIndex(index = 1)
  public val length: Long,
  @ProtobufIndex(index = 2)
  public val amount: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.vesting.v1beta1.Period"
  }

  public object KotlinxSerializer : KSerializer<Period> {
    private val delegator: KSerializer<Period> = Period.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Period): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PeriodConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Period {
      if (decoder is ProtobufMapperDecoder) {
        return PeriodConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PeriodicVestingAccount.KotlinxSerializer::class)
@SerialName(value = PeriodicVestingAccount.TYPE_URL)
public data class PeriodicVestingAccount(
  @ProtobufIndex(index = 1)
  public val baseVestingAccount: BaseVestingAccount,
  @ProtobufIndex(index = 2)
  public val startTime: Long,
  @ProtobufIndex(index = 3)
  public val vestingPeriods: List<Period>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.vesting.v1beta1.PeriodicVestingAccount"
  }

  public object KotlinxSerializer : KSerializer<PeriodicVestingAccount> {
    private val delegator: KSerializer<PeriodicVestingAccount> = PeriodicVestingAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PeriodicVestingAccount): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PeriodicVestingAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PeriodicVestingAccount {
      if (decoder is ProtobufMapperDecoder) {
        return PeriodicVestingAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PermanentLockedAccount.KotlinxSerializer::class)
@SerialName(value = PermanentLockedAccount.TYPE_URL)
public data class PermanentLockedAccount(
  @ProtobufIndex(index = 1)
  public val baseVestingAccount: BaseVestingAccount,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.vesting.v1beta1.PermanentLockedAccount"
  }

  public object KotlinxSerializer : KSerializer<PermanentLockedAccount> {
    private val delegator: KSerializer<PermanentLockedAccount> = PermanentLockedAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PermanentLockedAccount): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PermanentLockedAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PermanentLockedAccount {
      if (decoder is ProtobufMapperDecoder) {
        return PermanentLockedAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
