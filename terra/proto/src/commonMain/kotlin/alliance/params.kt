// Transform from alliance/params.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Duration
import google.protobuf.Timestamp
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

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val rewardDelayTime: Duration,
  @ProtobufIndex(index = 2)
  public val takeRateClaimInterval: Duration,
  @ProtobufIndex(index = 3)
  public val lastTakeRateClaimTime: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.Params"
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

@Serializable(with = RewardHistory.KotlinxSerializer::class)
@SerialName(value = RewardHistory.TYPE_URL)
public data class RewardHistory(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val index: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.RewardHistory"
  }

  public object KotlinxSerializer : KSerializer<RewardHistory> {
    private val delegator: KSerializer<RewardHistory> = RewardHistory.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RewardHistory): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RewardHistoryConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RewardHistory {
      if (decoder is ProtobufMapperDecoder) {
        return RewardHistoryConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
