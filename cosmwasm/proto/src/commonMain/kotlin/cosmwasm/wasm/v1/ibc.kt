// Transform from cosmwasm/wasm/v1/ibc.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kotlin.ByteArray
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

@Serializable(with = MsgIBCSend.KotlinxSerializer::class)
@SerialName(value = MsgIBCSend.TYPE_URL)
public data class MsgIBCSend(
  @ProtobufIndex(index = 2)
  public val channel: String,
  @ProtobufIndex(index = 4)
  public val timeoutHeight: ULong,
  @ProtobufIndex(index = 5)
  public val timeoutTimestamp: ULong,
  @ProtobufIndex(index = 6)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgIBCSend"
  }

  public object KotlinxSerializer : KSerializer<MsgIBCSend> {
    private val delegator: KSerializer<MsgIBCSend> = MsgIBCSend.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgIBCSend): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgIBCSendConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgIBCSend {
      if (decoder is ProtobufMapperDecoder) {
        return MsgIBCSendConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgIBCSendResponse.KotlinxSerializer::class)
@SerialName(value = MsgIBCSendResponse.TYPE_URL)
public data class MsgIBCSendResponse(
  @ProtobufIndex(index = 1)
  public val sequence: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgIBCSendResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgIBCSendResponse> {
    private val delegator: KSerializer<MsgIBCSendResponse> = MsgIBCSendResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgIBCSendResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgIBCSendResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgIBCSendResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgIBCSendResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgIBCCloseChannel.KotlinxSerializer::class)
@SerialName(value = MsgIBCCloseChannel.TYPE_URL)
public data class MsgIBCCloseChannel(
  @ProtobufIndex(index = 2)
  public val channel: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgIBCCloseChannel"
  }

  public object KotlinxSerializer : KSerializer<MsgIBCCloseChannel> {
    private val delegator: KSerializer<MsgIBCCloseChannel> = MsgIBCCloseChannel.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgIBCCloseChannel): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgIBCCloseChannelConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgIBCCloseChannel {
      if (decoder is ProtobufMapperDecoder) {
        return MsgIBCCloseChannelConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
