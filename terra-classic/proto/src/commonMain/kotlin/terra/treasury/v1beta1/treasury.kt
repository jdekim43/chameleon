// Transform from terra/treasury/v1beta1/treasury.proto
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

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val taxPolicy: PolicyConstraints,
  @ProtobufIndex(index = 2)
  public val rewardPolicy: PolicyConstraints,
  @ProtobufIndex(index = 3)
  public val seigniorageBurdenTarget: String,
  @ProtobufIndex(index = 4)
  public val miningIncrement: String,
  @ProtobufIndex(index = 5)
  public val windowShort: ULong,
  @ProtobufIndex(index = 6)
  public val windowLong: ULong,
  @ProtobufIndex(index = 7)
  public val windowProbation: ULong,
  @ProtobufIndex(index = 8)
  public val burnTaxSplit: String,
  @ProtobufIndex(index = 9)
  public val minInitialDepositRatio: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.Params"
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

@Serializable(with = PolicyConstraints.KotlinxSerializer::class)
@SerialName(value = PolicyConstraints.TYPE_URL)
public data class PolicyConstraints(
  @ProtobufIndex(index = 1)
  public val rateMin: String,
  @ProtobufIndex(index = 2)
  public val rateMax: String,
  @ProtobufIndex(index = 3)
  public val cap: Coin,
  @ProtobufIndex(index = 4)
  public val changeRateMax: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.PolicyConstraints"
  }

  public object KotlinxSerializer : KSerializer<PolicyConstraints> {
    private val delegator: KSerializer<PolicyConstraints> = PolicyConstraints.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PolicyConstraints): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PolicyConstraintsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PolicyConstraints {
      if (decoder is ProtobufMapperDecoder) {
        return PolicyConstraintsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EpochTaxProceeds.KotlinxSerializer::class)
@SerialName(value = EpochTaxProceeds.TYPE_URL)
public data class EpochTaxProceeds(
  @ProtobufIndex(index = 1)
  public val taxProceeds: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.EpochTaxProceeds"
  }

  public object KotlinxSerializer : KSerializer<EpochTaxProceeds> {
    private val delegator: KSerializer<EpochTaxProceeds> = EpochTaxProceeds.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EpochTaxProceeds): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EpochTaxProceedsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EpochTaxProceeds {
      if (decoder is ProtobufMapperDecoder) {
        return EpochTaxProceedsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EpochInitialIssuance.KotlinxSerializer::class)
@SerialName(value = EpochInitialIssuance.TYPE_URL)
public data class EpochInitialIssuance(
  @ProtobufIndex(index = 1)
  public val issuance: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.EpochInitialIssuance"
  }

  public object KotlinxSerializer : KSerializer<EpochInitialIssuance> {
    private val delegator: KSerializer<EpochInitialIssuance> = EpochInitialIssuance.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EpochInitialIssuance): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EpochInitialIssuanceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EpochInitialIssuance {
      if (decoder is ProtobufMapperDecoder) {
        return EpochInitialIssuanceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
