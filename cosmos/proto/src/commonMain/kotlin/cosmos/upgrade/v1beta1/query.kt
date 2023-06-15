// Transform from cosmos/upgrade/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import kotlin.ByteArray
import kotlin.Long
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

@Serializable(with = QueryCurrentPlanRequest.KotlinxSerializer::class)
@SerialName(value = QueryCurrentPlanRequest.TYPE_URL)
public class QueryCurrentPlanRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.QueryCurrentPlanRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryCurrentPlanRequest> {
    private val delegator: KSerializer<QueryCurrentPlanRequest> =
        QueryCurrentPlanRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCurrentPlanRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCurrentPlanRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCurrentPlanRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCurrentPlanRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCurrentPlanResponse.KotlinxSerializer::class)
@SerialName(value = QueryCurrentPlanResponse.TYPE_URL)
public data class QueryCurrentPlanResponse(
  @ProtobufIndex(index = 1)
  public val plan: Plan,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.QueryCurrentPlanResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryCurrentPlanResponse> {
    private val delegator: KSerializer<QueryCurrentPlanResponse> =
        QueryCurrentPlanResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCurrentPlanResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCurrentPlanResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCurrentPlanResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCurrentPlanResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAppliedPlanRequest.KotlinxSerializer::class)
@SerialName(value = QueryAppliedPlanRequest.TYPE_URL)
public data class QueryAppliedPlanRequest(
  @ProtobufIndex(index = 1)
  public val name: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.QueryAppliedPlanRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAppliedPlanRequest> {
    private val delegator: KSerializer<QueryAppliedPlanRequest> =
        QueryAppliedPlanRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAppliedPlanRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAppliedPlanRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAppliedPlanRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAppliedPlanRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAppliedPlanResponse.KotlinxSerializer::class)
@SerialName(value = QueryAppliedPlanResponse.TYPE_URL)
public data class QueryAppliedPlanResponse(
  @ProtobufIndex(index = 1)
  public val height: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.QueryAppliedPlanResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAppliedPlanResponse> {
    private val delegator: KSerializer<QueryAppliedPlanResponse> =
        QueryAppliedPlanResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAppliedPlanResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAppliedPlanResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAppliedPlanResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAppliedPlanResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryUpgradedConsensusStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryUpgradedConsensusStateRequest.TYPE_URL)
public data class QueryUpgradedConsensusStateRequest(
  @ProtobufIndex(index = 1)
  public val lastHeight: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.QueryUpgradedConsensusStateRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryUpgradedConsensusStateRequest> {
    private val delegator: KSerializer<QueryUpgradedConsensusStateRequest> =
        QueryUpgradedConsensusStateRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryUpgradedConsensusStateRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryUpgradedConsensusStateRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryUpgradedConsensusStateRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryUpgradedConsensusStateRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryUpgradedConsensusStateResponse.KotlinxSerializer::class)
@SerialName(value = QueryUpgradedConsensusStateResponse.TYPE_URL)
public data class QueryUpgradedConsensusStateResponse(
  @ProtobufIndex(index = 2)
  public val upgradedConsensusState: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.upgrade.v1beta1.QueryUpgradedConsensusStateResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryUpgradedConsensusStateResponse> {
    private val delegator: KSerializer<QueryUpgradedConsensusStateResponse> =
        QueryUpgradedConsensusStateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryUpgradedConsensusStateResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryUpgradedConsensusStateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryUpgradedConsensusStateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryUpgradedConsensusStateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleVersionsRequest.KotlinxSerializer::class)
@SerialName(value = QueryModuleVersionsRequest.TYPE_URL)
public data class QueryModuleVersionsRequest(
  @ProtobufIndex(index = 1)
  public val moduleName: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.QueryModuleVersionsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryModuleVersionsRequest> {
    private val delegator: KSerializer<QueryModuleVersionsRequest> =
        QueryModuleVersionsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleVersionsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryModuleVersionsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleVersionsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleVersionsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleVersionsResponse.KotlinxSerializer::class)
@SerialName(value = QueryModuleVersionsResponse.TYPE_URL)
public data class QueryModuleVersionsResponse(
  @ProtobufIndex(index = 1)
  public val moduleVersions: List<ModuleVersion>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.QueryModuleVersionsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryModuleVersionsResponse> {
    private val delegator: KSerializer<QueryModuleVersionsResponse> =
        QueryModuleVersionsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleVersionsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryModuleVersionsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleVersionsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleVersionsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAuthorityRequest.KotlinxSerializer::class)
@SerialName(value = QueryAuthorityRequest.TYPE_URL)
public class QueryAuthorityRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.QueryAuthorityRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAuthorityRequest> {
    private val delegator: KSerializer<QueryAuthorityRequest> = QueryAuthorityRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAuthorityRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAuthorityRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAuthorityRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAuthorityRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAuthorityResponse.KotlinxSerializer::class)
@SerialName(value = QueryAuthorityResponse.TYPE_URL)
public data class QueryAuthorityResponse(
  @ProtobufIndex(index = 1)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.QueryAuthorityResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAuthorityResponse> {
    private val delegator: KSerializer<QueryAuthorityResponse> = QueryAuthorityResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAuthorityResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAuthorityResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAuthorityResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAuthorityResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
