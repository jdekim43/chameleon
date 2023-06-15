// Transform from oracle/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

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

@Serializable(with = MsgAggregateExchangeRateVote.KotlinxSerializer::class)
@SerialName(value = MsgAggregateExchangeRateVote.TYPE_URL)
public data class MsgAggregateExchangeRateVote(
  @ProtobufIndex(index = 2)
  public val exchangeRates: String,
  @ProtobufIndex(index = 3)
  public val feeder: String,
  @ProtobufIndex(index = 4)
  public val validator: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.MsgAggregateExchangeRateVote"
  }

  public object KotlinxSerializer : KSerializer<MsgAggregateExchangeRateVote> {
    private val delegator: KSerializer<MsgAggregateExchangeRateVote> =
        MsgAggregateExchangeRateVote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgAggregateExchangeRateVote): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgAggregateExchangeRateVoteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgAggregateExchangeRateVote {
      if (decoder is ProtobufMapperDecoder) {
        return MsgAggregateExchangeRateVoteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgAggregateExchangeRateVoteResponse.KotlinxSerializer::class)
@SerialName(value = MsgAggregateExchangeRateVoteResponse.TYPE_URL)
public class MsgAggregateExchangeRateVoteResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/seiprotocol.seichain.oracle.MsgAggregateExchangeRateVoteResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgAggregateExchangeRateVoteResponse> {
    private val delegator: KSerializer<MsgAggregateExchangeRateVoteResponse> =
        MsgAggregateExchangeRateVoteResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgAggregateExchangeRateVoteResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgAggregateExchangeRateVoteResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgAggregateExchangeRateVoteResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgAggregateExchangeRateVoteResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDelegateFeedConsent.KotlinxSerializer::class)
@SerialName(value = MsgDelegateFeedConsent.TYPE_URL)
public data class MsgDelegateFeedConsent(
  @ProtobufIndex(index = 1)
  public val `operator`: String,
  @ProtobufIndex(index = 2)
  public val `delegate`: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.MsgDelegateFeedConsent"
  }

  public object KotlinxSerializer : KSerializer<MsgDelegateFeedConsent> {
    private val delegator: KSerializer<MsgDelegateFeedConsent> = MsgDelegateFeedConsent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDelegateFeedConsent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDelegateFeedConsentConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDelegateFeedConsent {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDelegateFeedConsentConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDelegateFeedConsentResponse.KotlinxSerializer::class)
@SerialName(value = MsgDelegateFeedConsentResponse.TYPE_URL)
public class MsgDelegateFeedConsentResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/seiprotocol.seichain.oracle.MsgDelegateFeedConsentResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgDelegateFeedConsentResponse> {
    private val delegator: KSerializer<MsgDelegateFeedConsentResponse> =
        MsgDelegateFeedConsentResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDelegateFeedConsentResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDelegateFeedConsentResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDelegateFeedConsentResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDelegateFeedConsentResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
