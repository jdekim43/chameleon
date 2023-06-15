// Transform from cosmos/params/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.params.v1beta1

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
public data class QueryParamsRequest(
  @ProtobufIndex(index = 1)
  public val subspace: String,
  @ProtobufIndex(index = 2)
  public val key: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.params.v1beta1.QueryParamsRequest"
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
  public val `param`: ParamChange,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.params.v1beta1.QueryParamsResponse"
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

@Serializable(with = QuerySubspacesRequest.KotlinxSerializer::class)
@SerialName(value = QuerySubspacesRequest.TYPE_URL)
public class QuerySubspacesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.params.v1beta1.QuerySubspacesRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySubspacesRequest> {
    private val delegator: KSerializer<QuerySubspacesRequest> = QuerySubspacesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubspacesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubspacesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubspacesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubspacesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubspacesResponse.KotlinxSerializer::class)
@SerialName(value = QuerySubspacesResponse.TYPE_URL)
public data class QuerySubspacesResponse(
  @ProtobufIndex(index = 1)
  public val subspaces: List<Subspace>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.params.v1beta1.QuerySubspacesResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySubspacesResponse> {
    private val delegator: KSerializer<QuerySubspacesResponse> = QuerySubspacesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubspacesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubspacesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubspacesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubspacesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Subspace.KotlinxSerializer::class)
@SerialName(value = Subspace.TYPE_URL)
public data class Subspace(
  @ProtobufIndex(index = 1)
  public val subspace: String,
  @ProtobufIndex(index = 2)
  public val keys: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.params.v1beta1.Subspace"
  }

  public object KotlinxSerializer : KSerializer<Subspace> {
    private val delegator: KSerializer<Subspace> = Subspace.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Subspace): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubspaceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Subspace {
      if (decoder is ProtobufMapperDecoder) {
        return SubspaceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
