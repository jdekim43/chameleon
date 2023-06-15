// Transform from cosmos/feegrant/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

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

@Serializable(with = QueryAllowanceRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllowanceRequest.TYPE_URL)
public data class QueryAllowanceRequest(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.QueryAllowanceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllowanceRequest> {
    private val delegator: KSerializer<QueryAllowanceRequest> = QueryAllowanceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowanceRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllowanceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowanceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowanceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllowanceResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllowanceResponse.TYPE_URL)
public data class QueryAllowanceResponse(
  @ProtobufIndex(index = 1)
  public val allowance: Grant,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.QueryAllowanceResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllowanceResponse> {
    private val delegator: KSerializer<QueryAllowanceResponse> = QueryAllowanceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowanceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllowanceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowanceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowanceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllowancesRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllowancesRequest.TYPE_URL)
public data class QueryAllowancesRequest(
  @ProtobufIndex(index = 1)
  public val grantee: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.QueryAllowancesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllowancesRequest> {
    private val delegator: KSerializer<QueryAllowancesRequest> = QueryAllowancesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowancesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllowancesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowancesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowancesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllowancesResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllowancesResponse.TYPE_URL)
public data class QueryAllowancesResponse(
  @ProtobufIndex(index = 1)
  public val allowances: List<Grant>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.QueryAllowancesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllowancesResponse> {
    private val delegator: KSerializer<QueryAllowancesResponse> =
        QueryAllowancesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowancesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllowancesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowancesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowancesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllowancesByGranterRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllowancesByGranterRequest.TYPE_URL)
public data class QueryAllowancesByGranterRequest(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.QueryAllowancesByGranterRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllowancesByGranterRequest> {
    private val delegator: KSerializer<QueryAllowancesByGranterRequest> =
        QueryAllowancesByGranterRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowancesByGranterRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllowancesByGranterRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowancesByGranterRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowancesByGranterRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllowancesByGranterResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllowancesByGranterResponse.TYPE_URL)
public data class QueryAllowancesByGranterResponse(
  @ProtobufIndex(index = 1)
  public val allowances: List<Grant>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.QueryAllowancesByGranterResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllowancesByGranterResponse> {
    private val delegator: KSerializer<QueryAllowancesByGranterResponse> =
        QueryAllowancesByGranterResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowancesByGranterResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllowancesByGranterResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowancesByGranterResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowancesByGranterResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
