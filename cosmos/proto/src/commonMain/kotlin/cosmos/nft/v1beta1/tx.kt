// Transform from cosmos/nft/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

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

@Serializable(with = MsgSend.KotlinxSerializer::class)
@SerialName(value = MsgSend.TYPE_URL)
public data class MsgSend(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val id: String,
  @ProtobufIndex(index = 3)
  public val sender: String,
  @ProtobufIndex(index = 4)
  public val `receiver`: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.nft.v1beta1.MsgSend"
  }

  public object KotlinxSerializer : KSerializer<MsgSend> {
    private val delegator: KSerializer<MsgSend> = MsgSend.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSend): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSendConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSend {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSendConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSendResponse.KotlinxSerializer::class)
@SerialName(value = MsgSendResponse.TYPE_URL)
public class MsgSendResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.nft.v1beta1.MsgSendResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSendResponse> {
    private val delegator: KSerializer<MsgSendResponse> = MsgSendResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSendResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSendResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSendResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSendResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
