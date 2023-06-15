// Transform from cosmos/authz/v1beta1/event.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

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

@Serializable(with = EventGrant.KotlinxSerializer::class)
@SerialName(value = EventGrant.TYPE_URL)
public data class EventGrant(
  @ProtobufIndex(index = 2)
  public val msgTypeUrl: String,
  @ProtobufIndex(index = 3)
  public val granter: String,
  @ProtobufIndex(index = 4)
  public val grantee: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.authz.v1beta1.EventGrant"
  }

  public object KotlinxSerializer : KSerializer<EventGrant> {
    private val delegator: KSerializer<EventGrant> = EventGrant.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventGrant): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventGrantConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventGrant {
      if (decoder is ProtobufMapperDecoder) {
        return EventGrantConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventRevoke.KotlinxSerializer::class)
@SerialName(value = EventRevoke.TYPE_URL)
public data class EventRevoke(
  @ProtobufIndex(index = 2)
  public val msgTypeUrl: String,
  @ProtobufIndex(index = 3)
  public val granter: String,
  @ProtobufIndex(index = 4)
  public val grantee: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.authz.v1beta1.EventRevoke"
  }

  public object KotlinxSerializer : KSerializer<EventRevoke> {
    private val delegator: KSerializer<EventRevoke> = EventRevoke.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventRevoke): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventRevokeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventRevoke {
      if (decoder is ProtobufMapperDecoder) {
        return EventRevokeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
