// Transform from cosmos/mint/v1beta1/mint.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.mint.v1beta1

import kotlin.String
import kotlin.ULong
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

@Serializable(with = Minter.KotlinxSerializer::class)
@SerialName(value = Minter.TYPE_URL)
public data class Minter(
  @ProtobufIndex(index = 1)
  public val inflation: String,
  @ProtobufIndex(index = 2)
  public val annualProvisions: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.mint.v1beta1.Minter"
  }

  public object KotlinxSerializer : KSerializer<Minter> {
    private val delegator: KSerializer<Minter> = Minter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Minter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MinterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Minter {
      if (decoder is ProtobufMapperDecoder) {
        return MinterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val mintDenom: String,
  @ProtobufIndex(index = 2)
  public val inflationRateChange: String,
  @ProtobufIndex(index = 3)
  public val inflationMax: String,
  @ProtobufIndex(index = 4)
  public val inflationMin: String,
  @ProtobufIndex(index = 5)
  public val goalBonded: String,
  @ProtobufIndex(index = 6)
  public val blocksPerYear: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.mint.v1beta1.Params"
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
