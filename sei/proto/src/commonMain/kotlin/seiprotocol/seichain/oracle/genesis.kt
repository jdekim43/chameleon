// Transform from oracle/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

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

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = GenesisState.TYPE_URL)
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val params: Params,
  @ProtobufIndex(index = 2)
  public val feederDelegations: List<FeederDelegation>,
  @ProtobufIndex(index = 3)
  public val exchangeRates: List<ExchangeRateTuple>,
  @ProtobufIndex(index = 4)
  public val penaltyCounters: List<PenaltyCounter>,
  @ProtobufIndex(index = 6)
  public val aggregateExchangeRateVotes: List<AggregateExchangeRateVote>,
  @ProtobufIndex(index = 7)
  public val priceSnapshots: List<PriceSnapshot>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.GenesisState"
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

@Serializable(with = FeederDelegation.KotlinxSerializer::class)
@SerialName(value = FeederDelegation.TYPE_URL)
public data class FeederDelegation(
  @ProtobufIndex(index = 1)
  public val feederAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.FeederDelegation"
  }

  public object KotlinxSerializer : KSerializer<FeederDelegation> {
    private val delegator: KSerializer<FeederDelegation> = FeederDelegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeederDelegation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeederDelegationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeederDelegation {
      if (decoder is ProtobufMapperDecoder) {
        return FeederDelegationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PenaltyCounter.KotlinxSerializer::class)
@SerialName(value = PenaltyCounter.TYPE_URL)
public data class PenaltyCounter(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val votePenaltyCounter: VotePenaltyCounter,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.PenaltyCounter"
  }

  public object KotlinxSerializer : KSerializer<PenaltyCounter> {
    private val delegator: KSerializer<PenaltyCounter> = PenaltyCounter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PenaltyCounter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PenaltyCounterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PenaltyCounter {
      if (decoder is ProtobufMapperDecoder) {
        return PenaltyCounterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
