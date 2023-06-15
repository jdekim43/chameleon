// Transform from alliance/events.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package alliance

import cosmos.base.v1beta1.Coin
import google.protobuf.Timestamp
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

@Serializable(with = DelegateAllianceEvent.KotlinxSerializer::class)
@SerialName(value = DelegateAllianceEvent.TYPE_URL)
public data class DelegateAllianceEvent(
  @ProtobufIndex(index = 1)
  public val allianceSender: String,
  @ProtobufIndex(index = 2)
  public val validator: String,
  @ProtobufIndex(index = 3)
  public val coin: Coin,
  @ProtobufIndex(index = 4)
  public val newShares: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.DelegateAllianceEvent"
  }

  public object KotlinxSerializer : KSerializer<DelegateAllianceEvent> {
    private val delegator: KSerializer<DelegateAllianceEvent> = DelegateAllianceEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DelegateAllianceEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DelegateAllianceEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DelegateAllianceEvent {
      if (decoder is ProtobufMapperDecoder) {
        return DelegateAllianceEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UndelegateAllianceEvent.KotlinxSerializer::class)
@SerialName(value = UndelegateAllianceEvent.TYPE_URL)
public data class UndelegateAllianceEvent(
  @ProtobufIndex(index = 1)
  public val allianceSender: String,
  @ProtobufIndex(index = 2)
  public val validator: String,
  @ProtobufIndex(index = 3)
  public val coin: Coin,
  @ProtobufIndex(index = 4)
  public val completionTime: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.UndelegateAllianceEvent"
  }

  public object KotlinxSerializer : KSerializer<UndelegateAllianceEvent> {
    private val delegator: KSerializer<UndelegateAllianceEvent> =
        UndelegateAllianceEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UndelegateAllianceEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UndelegateAllianceEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UndelegateAllianceEvent {
      if (decoder is ProtobufMapperDecoder) {
        return UndelegateAllianceEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RedelegateAllianceEvent.KotlinxSerializer::class)
@SerialName(value = RedelegateAllianceEvent.TYPE_URL)
public data class RedelegateAllianceEvent(
  @ProtobufIndex(index = 1)
  public val allianceSender: String,
  @ProtobufIndex(index = 2)
  public val sourceValidator: String,
  @ProtobufIndex(index = 3)
  public val destinationValidator: String,
  @ProtobufIndex(index = 4)
  public val coin: Coin,
  @ProtobufIndex(index = 5)
  public val completionTime: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.RedelegateAllianceEvent"
  }

  public object KotlinxSerializer : KSerializer<RedelegateAllianceEvent> {
    private val delegator: KSerializer<RedelegateAllianceEvent> =
        RedelegateAllianceEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RedelegateAllianceEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RedelegateAllianceEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RedelegateAllianceEvent {
      if (decoder is ProtobufMapperDecoder) {
        return RedelegateAllianceEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ClaimAllianceRewardsEvent.KotlinxSerializer::class)
@SerialName(value = ClaimAllianceRewardsEvent.TYPE_URL)
public data class ClaimAllianceRewardsEvent(
  @ProtobufIndex(index = 1)
  public val allianceSender: String,
  @ProtobufIndex(index = 2)
  public val validator: String,
  @ProtobufIndex(index = 3)
  public val coins: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.ClaimAllianceRewardsEvent"
  }

  public object KotlinxSerializer : KSerializer<ClaimAllianceRewardsEvent> {
    private val delegator: KSerializer<ClaimAllianceRewardsEvent> =
        ClaimAllianceRewardsEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ClaimAllianceRewardsEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ClaimAllianceRewardsEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ClaimAllianceRewardsEvent {
      if (decoder is ProtobufMapperDecoder) {
        return ClaimAllianceRewardsEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
