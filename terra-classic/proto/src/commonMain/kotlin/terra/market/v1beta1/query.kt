// Transform from terra/market/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.market.v1beta1

import cosmos.base.v1beta1.Coin
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

@Serializable(with = QuerySwapRequest.KotlinxSerializer::class)
@SerialName(value = QuerySwapRequest.TYPE_URL)
public data class QuerySwapRequest(
  @ProtobufIndex(index = 1)
  public val offerCoin: String,
  @ProtobufIndex(index = 2)
  public val askDenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.market.v1beta1.QuerySwapRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySwapRequest> {
    private val delegator: KSerializer<QuerySwapRequest> = QuerySwapRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySwapRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySwapRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySwapRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySwapRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySwapResponse.KotlinxSerializer::class)
@SerialName(value = QuerySwapResponse.TYPE_URL)
public data class QuerySwapResponse(
  @ProtobufIndex(index = 1)
  public val returnCoin: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.market.v1beta1.QuerySwapResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySwapResponse> {
    private val delegator: KSerializer<QuerySwapResponse> = QuerySwapResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySwapResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySwapResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySwapResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySwapResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTerraPoolDeltaRequest.KotlinxSerializer::class)
@SerialName(value = QueryTerraPoolDeltaRequest.TYPE_URL)
public class QueryTerraPoolDeltaRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.market.v1beta1.QueryTerraPoolDeltaRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTerraPoolDeltaRequest> {
    private val delegator: KSerializer<QueryTerraPoolDeltaRequest> =
        QueryTerraPoolDeltaRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTerraPoolDeltaRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTerraPoolDeltaRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTerraPoolDeltaRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTerraPoolDeltaRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTerraPoolDeltaResponse.KotlinxSerializer::class)
@SerialName(value = QueryTerraPoolDeltaResponse.TYPE_URL)
public data class QueryTerraPoolDeltaResponse(
  @ProtobufIndex(index = 1)
  public val terraPoolDelta: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.market.v1beta1.QueryTerraPoolDeltaResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTerraPoolDeltaResponse> {
    private val delegator: KSerializer<QueryTerraPoolDeltaResponse> =
        QueryTerraPoolDeltaResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTerraPoolDeltaResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTerraPoolDeltaResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTerraPoolDeltaResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTerraPoolDeltaResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.market.v1beta1.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/terra.market.v1beta1.QueryParamsResponse"
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
