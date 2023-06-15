// Transform from tokenfactory/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

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
    public const val TYPE_URL: String = "/seiprotocol.seichain.tokenfactory.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/seiprotocol.seichain.tokenfactory.QueryParamsResponse"
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

@Serializable(with = QueryDenomAuthorityMetadataRequest.KotlinxSerializer::class)
@SerialName(value = QueryDenomAuthorityMetadataRequest.TYPE_URL)
public data class QueryDenomAuthorityMetadataRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/seiprotocol.seichain.tokenfactory.QueryDenomAuthorityMetadataRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomAuthorityMetadataRequest> {
    private val delegator: KSerializer<QueryDenomAuthorityMetadataRequest> =
        QueryDenomAuthorityMetadataRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomAuthorityMetadataRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomAuthorityMetadataRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomAuthorityMetadataRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomAuthorityMetadataRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomAuthorityMetadataResponse.KotlinxSerializer::class)
@SerialName(value = QueryDenomAuthorityMetadataResponse.TYPE_URL)
public data class QueryDenomAuthorityMetadataResponse(
  @ProtobufIndex(index = 1)
  public val authorityMetadata: DenomAuthorityMetadata,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/seiprotocol.seichain.tokenfactory.QueryDenomAuthorityMetadataResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomAuthorityMetadataResponse> {
    private val delegator: KSerializer<QueryDenomAuthorityMetadataResponse> =
        QueryDenomAuthorityMetadataResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomAuthorityMetadataResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomAuthorityMetadataResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomAuthorityMetadataResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomAuthorityMetadataResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomsFromCreatorRequest.KotlinxSerializer::class)
@SerialName(value = QueryDenomsFromCreatorRequest.TYPE_URL)
public data class QueryDenomsFromCreatorRequest(
  @ProtobufIndex(index = 1)
  public val creator: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/seiprotocol.seichain.tokenfactory.QueryDenomsFromCreatorRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomsFromCreatorRequest> {
    private val delegator: KSerializer<QueryDenomsFromCreatorRequest> =
        QueryDenomsFromCreatorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomsFromCreatorRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomsFromCreatorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomsFromCreatorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomsFromCreatorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomsFromCreatorResponse.KotlinxSerializer::class)
@SerialName(value = QueryDenomsFromCreatorResponse.TYPE_URL)
public data class QueryDenomsFromCreatorResponse(
  @ProtobufIndex(index = 1)
  public val denoms: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/seiprotocol.seichain.tokenfactory.QueryDenomsFromCreatorResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomsFromCreatorResponse> {
    private val delegator: KSerializer<QueryDenomsFromCreatorResponse> =
        QueryDenomsFromCreatorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomsFromCreatorResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomsFromCreatorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomsFromCreatorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomsFromCreatorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
