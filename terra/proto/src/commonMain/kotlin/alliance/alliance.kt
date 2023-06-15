// Transform from alliance/alliance.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Duration
import google.protobuf.Timestamp
import kotlin.Boolean
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

@Serializable(with = RewardWeightRange.KotlinxSerializer::class)
@SerialName(value = RewardWeightRange.TYPE_URL)
public data class RewardWeightRange(
  @ProtobufIndex(index = 1)
  public val min: String,
  @ProtobufIndex(index = 2)
  public val max: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.RewardWeightRange"
  }

  public object KotlinxSerializer : KSerializer<RewardWeightRange> {
    private val delegator: KSerializer<RewardWeightRange> = RewardWeightRange.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RewardWeightRange): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RewardWeightRangeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RewardWeightRange {
      if (decoder is ProtobufMapperDecoder) {
        return RewardWeightRangeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AllianceAsset.KotlinxSerializer::class)
@SerialName(value = AllianceAsset.TYPE_URL)
public data class AllianceAsset(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val rewardWeight: String,
  @ProtobufIndex(index = 3)
  public val takeRate: String,
  @ProtobufIndex(index = 4)
  public val totalTokens: String,
  @ProtobufIndex(index = 5)
  public val totalValidatorShares: String,
  @ProtobufIndex(index = 6)
  public val rewardStartTime: Timestamp,
  @ProtobufIndex(index = 7)
  public val rewardChangeRate: String,
  @ProtobufIndex(index = 8)
  public val rewardChangeInterval: Duration,
  @ProtobufIndex(index = 9)
  public val lastRewardChangeTime: Timestamp,
  @ProtobufIndex(index = 10)
  public val rewardWeightRange: RewardWeightRange,
  @ProtobufIndex(index = 11)
  public val isInitialized: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.AllianceAsset"
  }

  public object KotlinxSerializer : KSerializer<AllianceAsset> {
    private val delegator: KSerializer<AllianceAsset> = AllianceAsset.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AllianceAsset): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AllianceAssetConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AllianceAsset {
      if (decoder is ProtobufMapperDecoder) {
        return AllianceAssetConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RewardWeightChangeSnapshot.KotlinxSerializer::class)
@SerialName(value = RewardWeightChangeSnapshot.TYPE_URL)
public data class RewardWeightChangeSnapshot(
  @ProtobufIndex(index = 1)
  public val prevRewardWeight: String,
  @ProtobufIndex(index = 2)
  public val rewardHistories: List<RewardHistory>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.RewardWeightChangeSnapshot"
  }

  public object KotlinxSerializer : KSerializer<RewardWeightChangeSnapshot> {
    private val delegator: KSerializer<RewardWeightChangeSnapshot> =
        RewardWeightChangeSnapshot.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RewardWeightChangeSnapshot): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RewardWeightChangeSnapshotConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RewardWeightChangeSnapshot {
      if (decoder is ProtobufMapperDecoder) {
        return RewardWeightChangeSnapshotConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
