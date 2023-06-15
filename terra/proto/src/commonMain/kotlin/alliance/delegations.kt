// Transform from alliance/delegations.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package alliance

import cosmos.base.v1beta1.Coin
import cosmos.base.v1beta1.DecCoin
import kotlin.String
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

@Serializable(with = Delegation.KotlinxSerializer::class)
@SerialName(value = Delegation.TYPE_URL)
public data class Delegation(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val denom: String,
  @ProtobufIndex(index = 4)
  public val shares: String,
  @ProtobufIndex(index = 5)
  public val rewardHistory: List<RewardHistory>,
  @ProtobufIndex(index = 6)
  public val lastRewardClaimHeight: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.Delegation"
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

@Serializable(with = Undelegation.KotlinxSerializer::class)
@SerialName(value = Undelegation.TYPE_URL)
public data class Undelegation(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val balance: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.Undelegation"
  }

  public object KotlinxSerializer : KSerializer<Undelegation> {
    private val delegator: KSerializer<Undelegation> = Undelegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Undelegation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UndelegationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Undelegation {
      if (decoder is ProtobufMapperDecoder) {
        return UndelegationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueuedUndelegation.KotlinxSerializer::class)
@SerialName(value = QueuedUndelegation.TYPE_URL)
public data class QueuedUndelegation(
  @ProtobufIndex(index = 1)
  public val entries: List<Undelegation>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueuedUndelegation"
  }

  public object KotlinxSerializer : KSerializer<QueuedUndelegation> {
    private val delegator: KSerializer<QueuedUndelegation> = QueuedUndelegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueuedUndelegation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueuedUndelegationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueuedUndelegation {
      if (decoder is ProtobufMapperDecoder) {
        return QueuedUndelegationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AllianceValidatorInfo.KotlinxSerializer::class)
@SerialName(value = AllianceValidatorInfo.TYPE_URL)
public data class AllianceValidatorInfo(
  @ProtobufIndex(index = 1)
  public val globalRewardHistory: List<RewardHistory>,
  @ProtobufIndex(index = 2)
  public val totalDelegatorShares: List<DecCoin>,
  @ProtobufIndex(index = 3)
  public val validatorShares: List<DecCoin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.AllianceValidatorInfo"
  }

  public object KotlinxSerializer : KSerializer<AllianceValidatorInfo> {
    private val delegator: KSerializer<AllianceValidatorInfo> = AllianceValidatorInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AllianceValidatorInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AllianceValidatorInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AllianceValidatorInfo {
      if (decoder is ProtobufMapperDecoder) {
        return AllianceValidatorInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
