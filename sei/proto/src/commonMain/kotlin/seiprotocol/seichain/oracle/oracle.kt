// Transform from oracle/oracle.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

import kotlin.Long
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
  public val whitelist: List<Denom>,
  @ProtobufIndex(index = 5)
  public val slashFraction: String,
  @ProtobufIndex(index = 6)
  public val slashWindow: ULong,
  @ProtobufIndex(index = 7)
  public val minValidPerWindow: String,
  @ProtobufIndex(index = 9)
  public val lookbackDuration: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.Params"
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
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.Denom"
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

@Serializable(with = AggregateExchangeRateVote.KotlinxSerializer::class)
@SerialName(value = AggregateExchangeRateVote.TYPE_URL)
public data class AggregateExchangeRateVote(
  @ProtobufIndex(index = 1)
  public val exchangeRateTuples: List<ExchangeRateTuple>,
  @ProtobufIndex(index = 2)
  public val voter: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.AggregateExchangeRateVote"
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
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.ExchangeRateTuple"
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

@Serializable(with = OracleExchangeRate.KotlinxSerializer::class)
@SerialName(value = OracleExchangeRate.TYPE_URL)
public data class OracleExchangeRate(
  @ProtobufIndex(index = 1)
  public val exchangeRate: String,
  @ProtobufIndex(index = 2)
  public val lastUpdate: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.OracleExchangeRate"
  }

  public object KotlinxSerializer : KSerializer<OracleExchangeRate> {
    private val delegator: KSerializer<OracleExchangeRate> = OracleExchangeRate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OracleExchangeRate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OracleExchangeRateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OracleExchangeRate {
      if (decoder is ProtobufMapperDecoder) {
        return OracleExchangeRateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PriceSnapshotItem.KotlinxSerializer::class)
@SerialName(value = PriceSnapshotItem.TYPE_URL)
public data class PriceSnapshotItem(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val oracleExchangeRate: OracleExchangeRate,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.PriceSnapshotItem"
  }

  public object KotlinxSerializer : KSerializer<PriceSnapshotItem> {
    private val delegator: KSerializer<PriceSnapshotItem> = PriceSnapshotItem.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PriceSnapshotItem): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceSnapshotItemConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PriceSnapshotItem {
      if (decoder is ProtobufMapperDecoder) {
        return PriceSnapshotItemConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PriceSnapshot.KotlinxSerializer::class)
@SerialName(value = PriceSnapshot.TYPE_URL)
public data class PriceSnapshot(
  @ProtobufIndex(index = 1)
  public val snapshotTimestamp: Long,
  @ProtobufIndex(index = 2)
  public val priceSnapshotItems: List<PriceSnapshotItem>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.PriceSnapshot"
  }

  public object KotlinxSerializer : KSerializer<PriceSnapshot> {
    private val delegator: KSerializer<PriceSnapshot> = PriceSnapshot.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PriceSnapshot): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceSnapshotConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PriceSnapshot {
      if (decoder is ProtobufMapperDecoder) {
        return PriceSnapshotConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OracleTwap.KotlinxSerializer::class)
@SerialName(value = OracleTwap.TYPE_URL)
public data class OracleTwap(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val twap: String,
  @ProtobufIndex(index = 3)
  public val lookbackSeconds: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.OracleTwap"
  }

  public object KotlinxSerializer : KSerializer<OracleTwap> {
    private val delegator: KSerializer<OracleTwap> = OracleTwap.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OracleTwap): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OracleTwapConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OracleTwap {
      if (decoder is ProtobufMapperDecoder) {
        return OracleTwapConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = VotePenaltyCounter.KotlinxSerializer::class)
@SerialName(value = VotePenaltyCounter.TYPE_URL)
public data class VotePenaltyCounter(
  @ProtobufIndex(index = 1)
  public val missCount: ULong,
  @ProtobufIndex(index = 2)
  public val abstainCount: ULong,
  @ProtobufIndex(index = 3)
  public val successCount: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.VotePenaltyCounter"
  }

  public object KotlinxSerializer : KSerializer<VotePenaltyCounter> {
    private val delegator: KSerializer<VotePenaltyCounter> = VotePenaltyCounter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: VotePenaltyCounter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VotePenaltyCounterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): VotePenaltyCounter {
      if (decoder is ProtobufMapperDecoder) {
        return VotePenaltyCounterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
