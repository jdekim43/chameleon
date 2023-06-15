// Transform from terra/oracle/v1beta1/oracle.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

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

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val votePeriod: ULong,
  @ProtobufIndex(index = 2)
  public val voteThreshold: String,
  @ProtobufIndex(index = 3)
  public val rewardBand: String,
  @ProtobufIndex(index = 4)
  public val rewardDistributionWindow: ULong,
  @ProtobufIndex(index = 5)
  public val whitelist: List<Denom>,
  @ProtobufIndex(index = 6)
  public val slashFraction: String,
  @ProtobufIndex(index = 7)
  public val slashWindow: ULong,
  @ProtobufIndex(index = 8)
  public val minValidPerWindow: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.Params"
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

@Serializable(with = Denom.KotlinxSerializer::class)
@SerialName(value = Denom.TYPE_URL)
public data class Denom(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val tobinTax: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.Denom"
  }

  public object KotlinxSerializer : KSerializer<Denom> {
    private val delegator: KSerializer<Denom> = Denom.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Denom): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DenomConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Denom {
      if (decoder is ProtobufMapperDecoder) {
        return DenomConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AggregateExchangeRatePrevote.KotlinxSerializer::class)
@SerialName(value = AggregateExchangeRatePrevote.TYPE_URL)
public data class AggregateExchangeRatePrevote(
  @ProtobufIndex(index = 1)
  public val hash: String,
  @ProtobufIndex(index = 2)
  public val voter: String,
  @ProtobufIndex(index = 3)
  public val submitBlock: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.AggregateExchangeRatePrevote"
  }

  public object KotlinxSerializer : KSerializer<AggregateExchangeRatePrevote> {
    private val delegator: KSerializer<AggregateExchangeRatePrevote> =
        AggregateExchangeRatePrevote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AggregateExchangeRatePrevote): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AggregateExchangeRatePrevoteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AggregateExchangeRatePrevote {
      if (decoder is ProtobufMapperDecoder) {
        return AggregateExchangeRatePrevoteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AggregateExchangeRateVote.KotlinxSerializer::class)
@SerialName(value = AggregateExchangeRateVote.TYPE_URL)
public data class AggregateExchangeRateVote(
  @ProtobufIndex(index = 1)
  public val exchangeRateTuples: List<ExchangeRateTuple>,
  @ProtobufIndex(index = 2)
  public val voter: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.AggregateExchangeRateVote"
  }

  public object KotlinxSerializer : KSerializer<AggregateExchangeRateVote> {
    private val delegator: KSerializer<AggregateExchangeRateVote> =
        AggregateExchangeRateVote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AggregateExchangeRateVote): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AggregateExchangeRateVoteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AggregateExchangeRateVote {
      if (decoder is ProtobufMapperDecoder) {
        return AggregateExchangeRateVoteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ExchangeRateTuple.KotlinxSerializer::class)
@SerialName(value = ExchangeRateTuple.TYPE_URL)
public data class ExchangeRateTuple(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val exchangeRate: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.ExchangeRateTuple"
  }

  public object KotlinxSerializer : KSerializer<ExchangeRateTuple> {
    private val delegator: KSerializer<ExchangeRateTuple> = ExchangeRateTuple.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ExchangeRateTuple): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ExchangeRateTupleConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ExchangeRateTuple {
      if (decoder is ProtobufMapperDecoder) {
        return ExchangeRateTupleConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
