// Transform from alliance/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package alliance

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import cosmos.base.v1beta1.Coin
import cosmos.base.v1beta1.DecCoin
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
    public const val TYPE_URL: String = "/alliance.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/alliance.QueryParamsResponse"
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

@Serializable(with = QueryAlliancesRequest.KotlinxSerializer::class)
@SerialName(value = QueryAlliancesRequest.TYPE_URL)
public data class QueryAlliancesRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAlliancesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAlliancesRequest> {
    private val delegator: KSerializer<QueryAlliancesRequest> = QueryAlliancesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAlliancesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAlliancesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAlliancesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAlliancesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAlliancesResponse.KotlinxSerializer::class)
@SerialName(value = QueryAlliancesResponse.TYPE_URL)
public data class QueryAlliancesResponse(
  @ProtobufIndex(index = 1)
  public val alliances: List<AllianceAsset>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAlliancesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAlliancesResponse> {
    private val delegator: KSerializer<QueryAlliancesResponse> = QueryAlliancesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAlliancesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAlliancesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAlliancesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAlliancesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllianceRequest.TYPE_URL)
public data class QueryAllianceRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceRequest> {
    private val delegator: KSerializer<QueryAllianceRequest> = QueryAllianceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllianceResponse.TYPE_URL)
public data class QueryAllianceResponse(
  @ProtobufIndex(index = 1)
  public val alliance: AllianceAsset,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceResponse> {
    private val delegator: KSerializer<QueryAllianceResponse> = QueryAllianceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryIBCAllianceRequest.KotlinxSerializer::class)
@SerialName(value = QueryIBCAllianceRequest.TYPE_URL)
public data class QueryIBCAllianceRequest(
  @ProtobufIndex(index = 1)
  public val hash: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryIBCAllianceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryIBCAllianceRequest> {
    private val delegator: KSerializer<QueryIBCAllianceRequest> =
        QueryIBCAllianceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryIBCAllianceRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryIBCAllianceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryIBCAllianceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryIBCAllianceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceValidatorRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllianceValidatorRequest.TYPE_URL)
public data class QueryAllianceValidatorRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceValidatorRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceValidatorRequest> {
    private val delegator: KSerializer<QueryAllianceValidatorRequest> =
        QueryAllianceValidatorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceValidatorRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceValidatorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceValidatorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceValidatorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllAllianceValidatorsRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllAllianceValidatorsRequest.TYPE_URL)
public data class QueryAllAllianceValidatorsRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllAllianceValidatorsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllAllianceValidatorsRequest> {
    private val delegator: KSerializer<QueryAllAllianceValidatorsRequest> =
        QueryAllAllianceValidatorsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllAllianceValidatorsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllAllianceValidatorsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllAllianceValidatorsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllAllianceValidatorsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllAlliancesDelegationsRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllAlliancesDelegationsRequest.TYPE_URL)
public data class QueryAllAlliancesDelegationsRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllAlliancesDelegationsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllAlliancesDelegationsRequest> {
    private val delegator: KSerializer<QueryAllAlliancesDelegationsRequest> =
        QueryAllAlliancesDelegationsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllAlliancesDelegationsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllAlliancesDelegationsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllAlliancesDelegationsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllAlliancesDelegationsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAlliancesDelegationsRequest.KotlinxSerializer::class)
@SerialName(value = QueryAlliancesDelegationsRequest.TYPE_URL)
public data class QueryAlliancesDelegationsRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAlliancesDelegationsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAlliancesDelegationsRequest> {
    private val delegator: KSerializer<QueryAlliancesDelegationsRequest> =
        QueryAlliancesDelegationsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAlliancesDelegationsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAlliancesDelegationsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAlliancesDelegationsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAlliancesDelegationsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAlliancesDelegationByValidatorRequest.KotlinxSerializer::class)
@SerialName(value = QueryAlliancesDelegationByValidatorRequest.TYPE_URL)
public data class QueryAlliancesDelegationByValidatorRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val validatorAddr: String,
  @ProtobufIndex(index = 3)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAlliancesDelegationByValidatorRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAlliancesDelegationByValidatorRequest> {
    private val delegator: KSerializer<QueryAlliancesDelegationByValidatorRequest> =
        QueryAlliancesDelegationByValidatorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryAlliancesDelegationByValidatorRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAlliancesDelegationByValidatorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAlliancesDelegationByValidatorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAlliancesDelegationByValidatorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DelegationResponse.KotlinxSerializer::class)
@SerialName(value = DelegationResponse.TYPE_URL)
public data class DelegationResponse(
  @ProtobufIndex(index = 1)
  public val delegation: Delegation,
  @ProtobufIndex(index = 2)
  public val balance: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.DelegationResponse"
  }

  public object KotlinxSerializer : KSerializer<DelegationResponse> {
    private val delegator: KSerializer<DelegationResponse> = DelegationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DelegationResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DelegationResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DelegationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return DelegationResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAlliancesDelegationsResponse.KotlinxSerializer::class)
@SerialName(value = QueryAlliancesDelegationsResponse.TYPE_URL)
public data class QueryAlliancesDelegationsResponse(
  @ProtobufIndex(index = 1)
  public val delegations: List<DelegationResponse>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAlliancesDelegationsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAlliancesDelegationsResponse> {
    private val delegator: KSerializer<QueryAlliancesDelegationsResponse> =
        QueryAlliancesDelegationsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAlliancesDelegationsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAlliancesDelegationsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAlliancesDelegationsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAlliancesDelegationsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceDelegationRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllianceDelegationRequest.TYPE_URL)
public data class QueryAllianceDelegationRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val validatorAddr: String,
  @ProtobufIndex(index = 3)
  public val denom: String,
  @ProtobufIndex(index = 4)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceDelegationRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceDelegationRequest> {
    private val delegator: KSerializer<QueryAllianceDelegationRequest> =
        QueryAllianceDelegationRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceDelegationRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceDelegationRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceDelegationRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceDelegationRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryIBCAllianceDelegationRequest.KotlinxSerializer::class)
@SerialName(value = QueryIBCAllianceDelegationRequest.TYPE_URL)
public data class QueryIBCAllianceDelegationRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val validatorAddr: String,
  @ProtobufIndex(index = 3)
  public val hash: String,
  @ProtobufIndex(index = 4)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryIBCAllianceDelegationRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryIBCAllianceDelegationRequest> {
    private val delegator: KSerializer<QueryIBCAllianceDelegationRequest> =
        QueryIBCAllianceDelegationRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryIBCAllianceDelegationRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryIBCAllianceDelegationRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryIBCAllianceDelegationRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryIBCAllianceDelegationRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceDelegationResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllianceDelegationResponse.TYPE_URL)
public data class QueryAllianceDelegationResponse(
  @ProtobufIndex(index = 1)
  public val delegation: DelegationResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceDelegationResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceDelegationResponse> {
    private val delegator: KSerializer<QueryAllianceDelegationResponse> =
        QueryAllianceDelegationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceDelegationResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceDelegationResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceDelegationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceDelegationResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceDelegationRewardsRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllianceDelegationRewardsRequest.TYPE_URL)
public data class QueryAllianceDelegationRewardsRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val validatorAddr: String,
  @ProtobufIndex(index = 3)
  public val denom: String,
  @ProtobufIndex(index = 4)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceDelegationRewardsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceDelegationRewardsRequest> {
    private val delegator: KSerializer<QueryAllianceDelegationRewardsRequest> =
        QueryAllianceDelegationRewardsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceDelegationRewardsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceDelegationRewardsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceDelegationRewardsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceDelegationRewardsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryIBCAllianceDelegationRewardsRequest.KotlinxSerializer::class)
@SerialName(value = QueryIBCAllianceDelegationRewardsRequest.TYPE_URL)
public data class QueryIBCAllianceDelegationRewardsRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val validatorAddr: String,
  @ProtobufIndex(index = 3)
  public val hash: String,
  @ProtobufIndex(index = 4)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryIBCAllianceDelegationRewardsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryIBCAllianceDelegationRewardsRequest> {
    private val delegator: KSerializer<QueryIBCAllianceDelegationRewardsRequest> =
        QueryIBCAllianceDelegationRewardsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryIBCAllianceDelegationRewardsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryIBCAllianceDelegationRewardsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryIBCAllianceDelegationRewardsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryIBCAllianceDelegationRewardsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceDelegationRewardsResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllianceDelegationRewardsResponse.TYPE_URL)
public data class QueryAllianceDelegationRewardsResponse(
  @ProtobufIndex(index = 1)
  public val rewards: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceDelegationRewardsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceDelegationRewardsResponse> {
    private val delegator: KSerializer<QueryAllianceDelegationRewardsResponse> =
        QueryAllianceDelegationRewardsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryAllianceDelegationRewardsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceDelegationRewardsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceDelegationRewardsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceDelegationRewardsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceValidatorResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllianceValidatorResponse.TYPE_URL)
public data class QueryAllianceValidatorResponse(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
  @ProtobufIndex(index = 2)
  public val totalDelegationShares: List<DecCoin>,
  @ProtobufIndex(index = 3)
  public val validatorShares: List<DecCoin>,
  @ProtobufIndex(index = 4)
  public val totalStaked: List<DecCoin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceValidatorResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceValidatorResponse> {
    private val delegator: KSerializer<QueryAllianceValidatorResponse> =
        QueryAllianceValidatorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceValidatorResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceValidatorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceValidatorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceValidatorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceValidatorsResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllianceValidatorsResponse.TYPE_URL)
public data class QueryAllianceValidatorsResponse(
  @ProtobufIndex(index = 1)
  public val validators: List<QueryAllianceValidatorResponse>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceValidatorsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceValidatorsResponse> {
    private val delegator: KSerializer<QueryAllianceValidatorsResponse> =
        QueryAllianceValidatorsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceValidatorsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceValidatorsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceValidatorsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceValidatorsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceUnbondingsByDenomAndDelegatorRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllianceUnbondingsByDenomAndDelegatorRequest.TYPE_URL)
public data class QueryAllianceUnbondingsByDenomAndDelegatorRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 3)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/alliance.QueryAllianceUnbondingsByDenomAndDelegatorRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceUnbondingsByDenomAndDelegatorRequest> {
    private val delegator: KSerializer<QueryAllianceUnbondingsByDenomAndDelegatorRequest> =
        QueryAllianceUnbondingsByDenomAndDelegatorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryAllianceUnbondingsByDenomAndDelegatorRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceUnbondingsByDenomAndDelegatorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        QueryAllianceUnbondingsByDenomAndDelegatorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceUnbondingsByDenomAndDelegatorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceUnbondingsByDenomAndDelegatorResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllianceUnbondingsByDenomAndDelegatorResponse.TYPE_URL)
public data class QueryAllianceUnbondingsByDenomAndDelegatorResponse(
  @ProtobufIndex(index = 1)
  public val unbondings: List<UnbondingDelegation>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/alliance.QueryAllianceUnbondingsByDenomAndDelegatorResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceUnbondingsByDenomAndDelegatorResponse>
      {
    private val delegator: KSerializer<QueryAllianceUnbondingsByDenomAndDelegatorResponse> =
        QueryAllianceUnbondingsByDenomAndDelegatorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryAllianceUnbondingsByDenomAndDelegatorResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceUnbondingsByDenomAndDelegatorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        QueryAllianceUnbondingsByDenomAndDelegatorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceUnbondingsByDenomAndDelegatorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceUnbondingsRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllianceUnbondingsRequest.TYPE_URL)
public data class QueryAllianceUnbondingsRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 3)
  public val validatorAddr: String,
  @ProtobufIndex(index = 4)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceUnbondingsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceUnbondingsRequest> {
    private val delegator: KSerializer<QueryAllianceUnbondingsRequest> =
        QueryAllianceUnbondingsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceUnbondingsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceUnbondingsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceUnbondingsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceUnbondingsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceUnbondingsResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllianceUnbondingsResponse.TYPE_URL)
public data class QueryAllianceUnbondingsResponse(
  @ProtobufIndex(index = 1)
  public val unbondings: List<UnbondingDelegation>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceUnbondingsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceUnbondingsResponse> {
    private val delegator: KSerializer<QueryAllianceUnbondingsResponse> =
        QueryAllianceUnbondingsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceUnbondingsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceUnbondingsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceUnbondingsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceUnbondingsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceRedelegationsRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllianceRedelegationsRequest.TYPE_URL)
public data class QueryAllianceRedelegationsRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 3)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceRedelegationsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceRedelegationsRequest> {
    private val delegator: KSerializer<QueryAllianceRedelegationsRequest> =
        QueryAllianceRedelegationsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceRedelegationsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceRedelegationsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceRedelegationsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceRedelegationsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllianceRedelegationsResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllianceRedelegationsResponse.TYPE_URL)
public data class QueryAllianceRedelegationsResponse(
  @ProtobufIndex(index = 1)
  public val redelegations: List<RedelegationEntry>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.QueryAllianceRedelegationsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllianceRedelegationsResponse> {
    private val delegator: KSerializer<QueryAllianceRedelegationsResponse> =
        QueryAllianceRedelegationsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllianceRedelegationsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllianceRedelegationsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllianceRedelegationsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllianceRedelegationsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
