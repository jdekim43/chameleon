// Transform from terra/market/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.market.v1beta1

import cosmos.base.v1beta1.Coin
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

@Serializable(with = MsgSwap.KotlinxSerializer::class)
@SerialName(value = MsgSwap.TYPE_URL)
public data class MsgSwap(
  @ProtobufIndex(index = 1)
  public val trader: String,
  @ProtobufIndex(index = 2)
  public val offerCoin: Coin,
  @ProtobufIndex(index = 3)
  public val askDenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.market.v1beta1.MsgSwap"
  }

  public object KotlinxSerializer : KSerializer<MsgSwap> {
    private val delegator: KSerializer<MsgSwap> = MsgSwap.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSwap): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSwapConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSwap {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSwapConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSwapResponse.KotlinxSerializer::class)
@SerialName(value = MsgSwapResponse.TYPE_URL)
public data class MsgSwapResponse(
  @ProtobufIndex(index = 1)
  public val swapCoin: Coin,
  @ProtobufIndex(index = 2)
  public val swapFee: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.market.v1beta1.MsgSwapResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSwapResponse> {
    private val delegator: KSerializer<MsgSwapResponse> = MsgSwapResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSwapResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSwapResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSwapResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSwapResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSwapSend.KotlinxSerializer::class)
@SerialName(value = MsgSwapSend.TYPE_URL)
public data class MsgSwapSend(
  @ProtobufIndex(index = 1)
  public val fromAddress: String,
  @ProtobufIndex(index = 2)
  public val toAddress: String,
  @ProtobufIndex(index = 3)
  public val offerCoin: Coin,
  @ProtobufIndex(index = 4)
  public val askDenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.market.v1beta1.MsgSwapSend"
  }

  public object KotlinxSerializer : KSerializer<MsgSwapSend> {
    private val delegator: KSerializer<MsgSwapSend> = MsgSwapSend.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSwapSend): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSwapSendConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSwapSend {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSwapSendConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSwapSendResponse.KotlinxSerializer::class)
@SerialName(value = MsgSwapSendResponse.TYPE_URL)
public data class MsgSwapSendResponse(
  @ProtobufIndex(index = 1)
  public val swapCoin: Coin,
  @ProtobufIndex(index = 2)
  public val swapFee: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.market.v1beta1.MsgSwapSendResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSwapSendResponse> {
    private val delegator: KSerializer<MsgSwapSendResponse> = MsgSwapSendResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSwapSendResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSwapSendResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSwapSendResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSwapSendResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
