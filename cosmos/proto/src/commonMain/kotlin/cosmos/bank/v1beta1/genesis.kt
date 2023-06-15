// Transform from cosmos/bank/v1beta1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import cosmos.base.v1beta1.Coin
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
  public val balances: List<Balance>,
  @ProtobufIndex(index = 3)
  public val supply: List<Coin>,
  @ProtobufIndex(index = 4)
  public val denomMetadata: List<Metadata>,
  @ProtobufIndex(index = 5)
  public val sendEnabled: List<SendEnabled>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.GenesisState"
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

@Serializable(with = Balance.KotlinxSerializer::class)
@SerialName(value = Balance.TYPE_URL)
public data class Balance(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val coins: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.Balance"
  }

  public object KotlinxSerializer : KSerializer<Balance> {
    private val delegator: KSerializer<Balance> = Balance.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Balance): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BalanceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Balance {
      if (decoder is ProtobufMapperDecoder) {
        return BalanceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
