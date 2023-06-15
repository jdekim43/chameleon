// Transform from dex/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

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
  public val contractState: List<ContractState>,
  @ProtobufIndex(index = 3)
  public val lastEpoch: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.GenesisState"
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

@Serializable(with = ContractState.KotlinxSerializer::class)
@SerialName(value = ContractState.TYPE_URL)
public data class ContractState(
  @ProtobufIndex(index = 1)
  public val contractInfo: ContractInfoV2,
  @ProtobufIndex(index = 2)
  public val longBookList: List<LongBook>,
  @ProtobufIndex(index = 3)
  public val shortBookList: List<ShortBook>,
  @ProtobufIndex(index = 4)
  public val triggeredOrdersList: List<Order>,
  @ProtobufIndex(index = 5)
  public val pairList: List<Pair>,
  @ProtobufIndex(index = 6)
  public val priceList: List<ContractPairPrices>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.ContractState"
  }

  public object KotlinxSerializer : KSerializer<ContractState> {
    private val delegator: KSerializer<ContractState> = ContractState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractState {
      if (decoder is ProtobufMapperDecoder) {
        return ContractStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ContractPairPrices.KotlinxSerializer::class)
@SerialName(value = ContractPairPrices.TYPE_URL)
public data class ContractPairPrices(
  @ProtobufIndex(index = 1)
  public val pricePair: Pair,
  @ProtobufIndex(index = 2)
  public val prices: List<Price>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.ContractPairPrices"
  }

  public object KotlinxSerializer : KSerializer<ContractPairPrices> {
    private val delegator: KSerializer<ContractPairPrices> = ContractPairPrices.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractPairPrices): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractPairPricesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractPairPrices {
      if (decoder is ProtobufMapperDecoder) {
        return ContractPairPricesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
