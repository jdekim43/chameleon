// Transform from cosmos/feegrant/v1beta1/feegrant.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

import cosmos.base.v1beta1.Coin
import google.protobuf.Any
import google.protobuf.Duration
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

@Serializable(with = BasicAllowance.KotlinxSerializer::class)
@SerialName(value = BasicAllowance.TYPE_URL)
public data class BasicAllowance(
  @ProtobufIndex(index = 1)
  public val spendLimit: List<Coin>,
  @ProtobufIndex(index = 2)
  public val expiration: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.BasicAllowance"
  }

  public object KotlinxSerializer : KSerializer<BasicAllowance> {
    private val delegator: KSerializer<BasicAllowance> = BasicAllowance.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BasicAllowance): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BasicAllowanceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BasicAllowance {
      if (decoder is ProtobufMapperDecoder) {
        return BasicAllowanceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PeriodicAllowance.KotlinxSerializer::class)
@SerialName(value = PeriodicAllowance.TYPE_URL)
public data class PeriodicAllowance(
  @ProtobufIndex(index = 1)
  public val basic: BasicAllowance,
  @ProtobufIndex(index = 2)
  public val period: Duration,
  @ProtobufIndex(index = 3)
  public val periodSpendLimit: List<Coin>,
  @ProtobufIndex(index = 4)
  public val periodCanSpend: List<Coin>,
  @ProtobufIndex(index = 5)
  public val periodReset: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.PeriodicAllowance"
  }

  public object KotlinxSerializer : KSerializer<PeriodicAllowance> {
    private val delegator: KSerializer<PeriodicAllowance> = PeriodicAllowance.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PeriodicAllowance): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PeriodicAllowanceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PeriodicAllowance {
      if (decoder is ProtobufMapperDecoder) {
        return PeriodicAllowanceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AllowedMsgAllowance.KotlinxSerializer::class)
@SerialName(value = AllowedMsgAllowance.TYPE_URL)
public data class AllowedMsgAllowance(
  @ProtobufIndex(index = 1)
  public val allowance: Any,
  @ProtobufIndex(index = 2)
  public val allowedMessages: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.AllowedMsgAllowance"
  }

  public object KotlinxSerializer : KSerializer<AllowedMsgAllowance> {
    private val delegator: KSerializer<AllowedMsgAllowance> = AllowedMsgAllowance.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AllowedMsgAllowance): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AllowedMsgAllowanceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AllowedMsgAllowance {
      if (decoder is ProtobufMapperDecoder) {
        return AllowedMsgAllowanceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Grant.KotlinxSerializer::class)
@SerialName(value = Grant.TYPE_URL)
public data class Grant(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
  @ProtobufIndex(index = 3)
  public val allowance: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.Grant"
  }

  public object KotlinxSerializer : KSerializer<Grant> {
    private val delegator: KSerializer<Grant> = Grant.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Grant): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GrantConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Grant {
      if (decoder is ProtobufMapperDecoder) {
        return GrantConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
