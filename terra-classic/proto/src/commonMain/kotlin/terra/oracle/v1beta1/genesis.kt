// Transform from terra/oracle/v1beta1/genesis.proto
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
  public val missCounters: List<MissCounter>,
  @ProtobufIndex(index = 5)
  public val aggregateExchangeRatePrevotes: List<AggregateExchangeRatePrevote>,
  @ProtobufIndex(index = 6)
  public val aggregateExchangeRateVotes: List<AggregateExchangeRateVote>,
  @ProtobufIndex(index = 7)
  public val tobinTaxes: List<TobinTax>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.GenesisState"
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
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.FeederDelegation"
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

@Serializable(with = MissCounter.KotlinxSerializer::class)
@SerialName(value = MissCounter.TYPE_URL)
public data class MissCounter(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val missCounter: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.MissCounter"
  }

  public object KotlinxSerializer : KSerializer<MissCounter> {
    private val delegator: KSerializer<MissCounter> = MissCounter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MissCounter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MissCounterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MissCounter {
      if (decoder is ProtobufMapperDecoder) {
        return MissCounterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TobinTax.KotlinxSerializer::class)
@SerialName(value = TobinTax.TYPE_URL)
public data class TobinTax(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val tobinTax: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.TobinTax"
  }

  public object KotlinxSerializer : KSerializer<TobinTax> {
    private val delegator: KSerializer<TobinTax> = TobinTax.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TobinTax): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TobinTaxConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TobinTax {
      if (decoder is ProtobufMapperDecoder) {
        return TobinTaxConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
