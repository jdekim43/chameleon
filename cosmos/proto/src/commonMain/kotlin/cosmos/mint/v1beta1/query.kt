// Transform from cosmos/mint/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.mint.v1beta1

import kotlin.ByteArray
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

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.mint.v1beta1.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/cosmos.mint.v1beta1.QueryParamsResponse"
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

@Serializable(with = QueryInflationRequest.KotlinxSerializer::class)
@SerialName(value = QueryInflationRequest.TYPE_URL)
public class QueryInflationRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.mint.v1beta1.QueryInflationRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryInflationRequest> {
    private val delegator: KSerializer<QueryInflationRequest> = QueryInflationRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryInflationRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryInflationRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryInflationRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryInflationRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryInflationResponse.KotlinxSerializer::class)
@SerialName(value = QueryInflationResponse.TYPE_URL)
public data class QueryInflationResponse(
  @ProtobufIndex(index = 1)
  public val inflation: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.mint.v1beta1.QueryInflationResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryInflationResponse> {
    private val delegator: KSerializer<QueryInflationResponse> = QueryInflationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryInflationResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryInflationResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryInflationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryInflationResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAnnualProvisionsRequest.KotlinxSerializer::class)
@SerialName(value = QueryAnnualProvisionsRequest.TYPE_URL)
public class QueryAnnualProvisionsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.mint.v1beta1.QueryAnnualProvisionsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAnnualProvisionsRequest> {
    private val delegator: KSerializer<QueryAnnualProvisionsRequest> =
        QueryAnnualProvisionsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAnnualProvisionsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAnnualProvisionsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAnnualProvisionsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAnnualProvisionsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAnnualProvisionsResponse.KotlinxSerializer::class)
@SerialName(value = QueryAnnualProvisionsResponse.TYPE_URL)
public data class QueryAnnualProvisionsResponse(
  @ProtobufIndex(index = 1)
  public val annualProvisions: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.mint.v1beta1.QueryAnnualProvisionsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAnnualProvisionsResponse> {
    private val delegator: KSerializer<QueryAnnualProvisionsResponse> =
        QueryAnnualProvisionsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAnnualProvisionsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAnnualProvisionsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAnnualProvisionsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAnnualProvisionsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
