// Transform from cosmos/base/v1beta1/coin.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.v1beta1

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

@Serializable(with = Coin.KotlinxSerializer::class)
@SerialName(value = Coin.TYPE_URL)
public data class Coin(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val amount: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.v1beta1.Coin"
  }

  public object KotlinxSerializer : KSerializer<Coin> {
    private val delegator: KSerializer<Coin> = Coin.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Coin): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CoinConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Coin {
      if (decoder is ProtobufMapperDecoder) {
        return CoinConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DecCoin.KotlinxSerializer::class)
@SerialName(value = DecCoin.TYPE_URL)
public data class DecCoin(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val amount: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.v1beta1.DecCoin"
  }

  public object KotlinxSerializer : KSerializer<DecCoin> {
    private val delegator: KSerializer<DecCoin> = DecCoin.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DecCoin): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DecCoinConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DecCoin {
      if (decoder is ProtobufMapperDecoder) {
        return DecCoinConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = IntProto.KotlinxSerializer::class)
@SerialName(value = IntProto.TYPE_URL)
public data class IntProto(
  @ProtobufIndex(index = 1)
  public val int: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.v1beta1.IntProto"
  }

  public object KotlinxSerializer : KSerializer<IntProto> {
    private val delegator: KSerializer<IntProto> = IntProto.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: IntProto): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(IntProtoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): IntProto {
      if (decoder is ProtobufMapperDecoder) {
        return IntProtoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DecProto.KotlinxSerializer::class)
@SerialName(value = DecProto.TYPE_URL)
public data class DecProto(
  @ProtobufIndex(index = 1)
  public val dec: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.v1beta1.DecProto"
  }

  public object KotlinxSerializer : KSerializer<DecProto> {
    private val delegator: KSerializer<DecProto> = DecProto.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DecProto): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DecProtoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DecProto {
      if (decoder is ProtobufMapperDecoder) {
        return DecProtoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
