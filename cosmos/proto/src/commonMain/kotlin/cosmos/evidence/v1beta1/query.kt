// Transform from cosmos/evidence/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import google.protobuf.Any
import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.ReplaceWith
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

@Serializable(with = QueryEvidenceRequest.KotlinxSerializer::class)
@SerialName(value = QueryEvidenceRequest.TYPE_URL)
public data class QueryEvidenceRequest(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val evidenceHash: ByteArray,
  @ProtobufIndex(index = 2)
  public val hash: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.evidence.v1beta1.QueryEvidenceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryEvidenceRequest> {
    private val delegator: KSerializer<QueryEvidenceRequest> = QueryEvidenceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryEvidenceRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryEvidenceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryEvidenceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryEvidenceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryEvidenceResponse.KotlinxSerializer::class)
@SerialName(value = QueryEvidenceResponse.TYPE_URL)
public data class QueryEvidenceResponse(
  @ProtobufIndex(index = 1)
  public val evidence: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.evidence.v1beta1.QueryEvidenceResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryEvidenceResponse> {
    private val delegator: KSerializer<QueryEvidenceResponse> = QueryEvidenceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryEvidenceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryEvidenceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryEvidenceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryEvidenceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllEvidenceRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllEvidenceRequest.TYPE_URL)
public data class QueryAllEvidenceRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.evidence.v1beta1.QueryAllEvidenceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllEvidenceRequest> {
    private val delegator: KSerializer<QueryAllEvidenceRequest> =
        QueryAllEvidenceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllEvidenceRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllEvidenceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllEvidenceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllEvidenceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllEvidenceResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllEvidenceResponse.TYPE_URL)
public data class QueryAllEvidenceResponse(
  @ProtobufIndex(index = 1)
  public val evidence: List<Any>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.evidence.v1beta1.QueryAllEvidenceResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllEvidenceResponse> {
    private val delegator: KSerializer<QueryAllEvidenceResponse> =
        QueryAllEvidenceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllEvidenceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllEvidenceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllEvidenceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllEvidenceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
