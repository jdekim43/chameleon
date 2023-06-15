// Transform from alliance/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Timestamp
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

@Serializable(with = ValidatorInfoState.KotlinxSerializer::class)
@SerialName(value = ValidatorInfoState.TYPE_URL)
public data class ValidatorInfoState(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validator: AllianceValidatorInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.ValidatorInfoState"
  }

  public object KotlinxSerializer : KSerializer<ValidatorInfoState> {
    private val delegator: KSerializer<ValidatorInfoState> = ValidatorInfoState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorInfoState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorInfoStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorInfoState {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorInfoStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RedelegationState.KotlinxSerializer::class)
@SerialName(value = RedelegationState.TYPE_URL)
public data class RedelegationState(
  @ProtobufIndex(index = 1)
  public val completionTime: Timestamp,
  @ProtobufIndex(index = 2)
  public val redelegation: Redelegation,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.RedelegationState"
  }

  public object KotlinxSerializer : KSerializer<RedelegationState> {
    private val delegator: KSerializer<RedelegationState> = RedelegationState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RedelegationState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RedelegationStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RedelegationState {
      if (decoder is ProtobufMapperDecoder) {
        return RedelegationStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UndelegationState.KotlinxSerializer::class)
@SerialName(value = UndelegationState.TYPE_URL)
public data class UndelegationState(
  @ProtobufIndex(index = 1)
  public val completionTime: Timestamp,
  @ProtobufIndex(index = 2)
  public val undelegation: QueuedUndelegation,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.UndelegationState"
  }

  public object KotlinxSerializer : KSerializer<UndelegationState> {
    private val delegator: KSerializer<UndelegationState> = UndelegationState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UndelegationState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UndelegationStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UndelegationState {
      if (decoder is ProtobufMapperDecoder) {
        return UndelegationStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RewardWeightChangeSnapshotState.KotlinxSerializer::class)
@SerialName(value = RewardWeightChangeSnapshotState.TYPE_URL)
public data class RewardWeightChangeSnapshotState(
  @ProtobufIndex(index = 1)
  public val height: ULong,
  @ProtobufIndex(index = 2)
  public val validator: String,
  @ProtobufIndex(index = 3)
  public val denom: String,
  @ProtobufIndex(index = 4)
  public val snapshot: RewardWeightChangeSnapshot,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.RewardWeightChangeSnapshotState"
  }

  public object KotlinxSerializer : KSerializer<RewardWeightChangeSnapshotState> {
    private val delegator: KSerializer<RewardWeightChangeSnapshotState> =
        RewardWeightChangeSnapshotState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RewardWeightChangeSnapshotState):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RewardWeightChangeSnapshotStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RewardWeightChangeSnapshotState {
      if (decoder is ProtobufMapperDecoder) {
        return RewardWeightChangeSnapshotStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = GenesisState.TYPE_URL)
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val params: Params,
  @ProtobufIndex(index = 2)
  public val assets: List<AllianceAsset>,
  @ProtobufIndex(index = 3)
  public val validatorInfos: List<ValidatorInfoState>,
  @ProtobufIndex(index = 4)
  public val rewardWeightChangeSnaphots: List<RewardWeightChangeSnapshotState>,
  @ProtobufIndex(index = 5)
  public val delegations: List<Delegation>,
  @ProtobufIndex(index = 6)
  public val redelegations: List<RedelegationState>,
  @ProtobufIndex(index = 7)
  public val undelegations: List<UndelegationState>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.GenesisState"
  }

  public object KotlinxSerializer : KSerializer<GenesisState> {
    private val delegator: KSerializer<GenesisState> = GenesisState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenesisState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GenesisStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenesisState {
      if (decoder is ProtobufMapperDecoder) {
        return GenesisStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
