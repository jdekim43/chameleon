// Transform from cosmos/nft/v1beta1/event.proto
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

@Serializable(with = EventSend.KotlinxSerializer::class)
@SerialName(value = EventSend.TYPE_URL)
public data class EventSend(
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
    public const val TYPE_URL: String = "/cosmos.nft.v1beta1.EventSend"
  }

  public object KotlinxSerializer : KSerializer<EventSend> {
    private val delegator: KSerializer<EventSend> = EventSend.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSend): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventSendConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSend {
      if (decoder is ProtobufMapperDecoder) {
        return EventSendConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventMint.KotlinxSerializer::class)
@SerialName(value = EventMint.TYPE_URL)
public data class EventMint(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val id: String,
  @ProtobufIndex(index = 3)
  public val owner: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.nft.v1beta1.EventMint"
  }

  public object KotlinxSerializer : KSerializer<EventMint> {
    private val delegator: KSerializer<EventMint> = EventMint.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventMint): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventMintConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventMint {
      if (decoder is ProtobufMapperDecoder) {
        return EventMintConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBurn.KotlinxSerializer::class)
@SerialName(value = EventBurn.TYPE_URL)
public data class EventBurn(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val id: String,
  @ProtobufIndex(index = 3)
  public val owner: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.nft.v1beta1.EventBurn"
  }

  public object KotlinxSerializer : KSerializer<EventBurn> {
    private val delegator: KSerializer<EventBurn> = EventBurn.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBurn): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBurnConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBurn {
      if (decoder is ProtobufMapperDecoder) {
        return EventBurnConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
