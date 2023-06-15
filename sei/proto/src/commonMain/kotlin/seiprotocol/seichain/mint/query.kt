// Transform from mint/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

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

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.mint.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/seiprotocol.seichain.mint.QueryParamsResponse"
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

@Serializable(with = QueryMinterRequest.KotlinxSerializer::class)
@SerialName(value = QueryMinterRequest.TYPE_URL)
public class QueryMinterRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.mint.QueryMinterRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryMinterRequest> {
    private val delegator: KSerializer<QueryMinterRequest> = QueryMinterRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryMinterRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryMinterRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryMinterRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMinterRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryMinterResponse.KotlinxSerializer::class)
@SerialName(value = QueryMinterResponse.TYPE_URL)
public data class QueryMinterResponse(
  @ProtobufIndex(index = 1)
  public val startDate: String,
  @ProtobufIndex(index = 2)
  public val endDate: String,
  @ProtobufIndex(index = 3)
  public val denom: String,
  @ProtobufIndex(index = 4)
  public val totalMintAmount: ULong,
  @ProtobufIndex(index = 5)
  public val remainingMintAmount: ULong,
  @ProtobufIndex(index = 6)
  public val lastMintAmount: ULong,
  @ProtobufIndex(index = 7)
  public val lastMintDate: String,
  @ProtobufIndex(index = 8)
  public val lastMintHeight: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.mint.QueryMinterResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryMinterResponse> {
    private val delegator: KSerializer<QueryMinterResponse> = QueryMinterResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryMinterResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryMinterResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryMinterResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMinterResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
