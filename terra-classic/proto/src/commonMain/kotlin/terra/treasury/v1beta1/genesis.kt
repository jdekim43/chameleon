// Transform from terra/treasury/v1beta1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import cosmos.base.v1beta1.Coin
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
  public val taxRate: String,
  @ProtobufIndex(index = 3)
  public val rewardWeight: String,
  @ProtobufIndex(index = 4)
  public val taxCaps: List<TaxCap>,
  @ProtobufIndex(index = 5)
  public val taxProceeds: List<Coin>,
  @ProtobufIndex(index = 6)
  public val epochInitialIssuance: List<Coin>,
  @ProtobufIndex(index = 7)
  public val epochStates: List<EpochState>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.GenesisState"
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

@Serializable(with = TaxCap.KotlinxSerializer::class)
@SerialName(value = TaxCap.TYPE_URL)
public data class TaxCap(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val taxCap: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.TaxCap"
  }

  public object KotlinxSerializer : KSerializer<TaxCap> {
    private val delegator: KSerializer<TaxCap> = TaxCap.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TaxCap): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TaxCapConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TaxCap {
      if (decoder is ProtobufMapperDecoder) {
        return TaxCapConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EpochState.KotlinxSerializer::class)
@SerialName(value = EpochState.TYPE_URL)
public data class EpochState(
  @ProtobufIndex(index = 1)
  public val epoch: ULong,
  @ProtobufIndex(index = 2)
  public val taxReward: String,
  @ProtobufIndex(index = 3)
  public val seigniorageReward: String,
  @ProtobufIndex(index = 4)
  public val totalStakedLuna: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.EpochState"
  }

  public object KotlinxSerializer : KSerializer<EpochState> {
    private val delegator: KSerializer<EpochState> = EpochState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EpochState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EpochStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EpochState {
      if (decoder is ProtobufMapperDecoder) {
        return EpochStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
