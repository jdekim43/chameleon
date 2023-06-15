// Transform from cosmos/app/v1alpha1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.v1alpha1

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

@Serializable(with = QueryConfigRequest.KotlinxSerializer::class)
@SerialName(value = QueryConfigRequest.TYPE_URL)
public class QueryConfigRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.app.v1alpha1.QueryConfigRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryConfigRequest> {
    private val delegator: KSerializer<QueryConfigRequest> = QueryConfigRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryConfigRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryConfigRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryConfigRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryConfigRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryConfigResponse.KotlinxSerializer::class)
@SerialName(value = QueryConfigResponse.TYPE_URL)
public data class QueryConfigResponse(
  @ProtobufIndex(index = 1)
  public val config: Config,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.app.v1alpha1.QueryConfigResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryConfigResponse> {
    private val delegator: KSerializer<QueryConfigResponse> = QueryConfigResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryConfigResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryConfigResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryConfigResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryConfigResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
