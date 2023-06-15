// Transform from alliance/redelegations.proto
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

@Serializable(with = QueuedRedelegation.KotlinxSerializer::class)
@SerialName(value = QueuedRedelegation.TYPE_URL)
public data class QueuedRedelegation(
  @ProtobufIndex(index = 1)
  public val entries: List<Redelegation>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueuedRedelegation"
  }

  public object KotlinxSerializer : KSerializer<QueuedRedelegation> {
    private val delegator: KSerializer<QueuedRedelegation> = QueuedRedelegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueuedRedelegation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueuedRedelegationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueuedRedelegation {
      if (decoder is ProtobufMapperDecoder) {
        return QueuedRedelegationConverter.deserialize(decoder.decodeByteArray())
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
  public val srcValidatorAddress: String,
  @ProtobufIndex(index = 3)
  public val dstValidatorAddress: String,
  @ProtobufIndex(index = 4)
  public val balance: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.Redelegation"
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

@Serializable(with = RedelegationEntry.KotlinxSerializer::class)
@SerialName(value = RedelegationEntry.TYPE_URL)
public data class RedelegationEntry(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val srcValidatorAddress: String,
  @ProtobufIndex(index = 3)
  public val dstValidatorAddress: String,
  @ProtobufIndex(index = 4)
  public val balance: Coin,
  @ProtobufIndex(index = 5)
  public val completionTime: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.RedelegationEntry"
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
