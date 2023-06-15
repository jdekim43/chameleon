// Transform from cosmos/base/query/v1beta1/pagination.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.query.v1beta1

import kotlin.Boolean
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

@Serializable(with = PageRequest.KotlinxSerializer::class)
@SerialName(value = PageRequest.TYPE_URL)
public data class PageRequest(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
  @ProtobufIndex(index = 2)
  public val offset: ULong,
  @ProtobufIndex(index = 3)
  public val limit: ULong,
  @ProtobufIndex(index = 4)
  public val countTotal: Boolean,
  @ProtobufIndex(index = 5)
  public val reverse: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.query.v1beta1.PageRequest"
  }

  public object KotlinxSerializer : KSerializer<PageRequest> {
    private val delegator: KSerializer<PageRequest> = PageRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PageRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PageRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PageRequest {
      if (decoder is ProtobufMapperDecoder) {
        return PageRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PageResponse.KotlinxSerializer::class)
@SerialName(value = PageResponse.TYPE_URL)
public data class PageResponse(
  @ProtobufIndex(index = 1)
  public val nextKey: ByteArray,
  @ProtobufIndex(index = 2)
  public val total: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.query.v1beta1.PageResponse"
  }

  public object KotlinxSerializer : KSerializer<PageResponse> {
    private val delegator: KSerializer<PageResponse> = PageResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PageResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PageResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PageResponse {
      if (decoder is ProtobufMapperDecoder) {
        return PageResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
