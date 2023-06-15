// Transform from cosmos/slashing/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import kotlin.String
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

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.QueryParamsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryParamsRequest> {
    private val delegator: KSerializer<QueryParamsRequest> = QueryParamsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryParamsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryParamsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryParamsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryParamsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsResponse.KotlinxSerializer::class)
@SerialName(value = QueryParamsResponse.TYPE_URL)
public data class QueryParamsResponse(
  @ProtobufIndex(index = 1)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.QueryParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryParamsResponse> {
    private val delegator: KSerializer<QueryParamsResponse> = QueryParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySigningInfoRequest.KotlinxSerializer::class)
@SerialName(value = QuerySigningInfoRequest.TYPE_URL)
public data class QuerySigningInfoRequest(
  @ProtobufIndex(index = 1)
  public val consAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.QuerySigningInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySigningInfoRequest> {
    private val delegator: KSerializer<QuerySigningInfoRequest> =
        QuerySigningInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySigningInfoRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySigningInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySigningInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySigningInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySigningInfoResponse.KotlinxSerializer::class)
@SerialName(value = QuerySigningInfoResponse.TYPE_URL)
public data class QuerySigningInfoResponse(
  @ProtobufIndex(index = 1)
  public val valSigningInfo: ValidatorSigningInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.QuerySigningInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySigningInfoResponse> {
    private val delegator: KSerializer<QuerySigningInfoResponse> =
        QuerySigningInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySigningInfoResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySigningInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySigningInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySigningInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySigningInfosRequest.KotlinxSerializer::class)
@SerialName(value = QuerySigningInfosRequest.TYPE_URL)
public data class QuerySigningInfosRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.QuerySigningInfosRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySigningInfosRequest> {
    private val delegator: KSerializer<QuerySigningInfosRequest> =
        QuerySigningInfosRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySigningInfosRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySigningInfosRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySigningInfosRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySigningInfosRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySigningInfosResponse.KotlinxSerializer::class)
@SerialName(value = QuerySigningInfosResponse.TYPE_URL)
public data class QuerySigningInfosResponse(
  @ProtobufIndex(index = 1)
  public val info: List<ValidatorSigningInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.QuerySigningInfosResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySigningInfosResponse> {
    private val delegator: KSerializer<QuerySigningInfosResponse> =
        QuerySigningInfosResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySigningInfosResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySigningInfosResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySigningInfosResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySigningInfosResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
