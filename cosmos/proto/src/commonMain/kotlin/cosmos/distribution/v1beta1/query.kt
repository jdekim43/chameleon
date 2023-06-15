// Transform from cosmos/distribution/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import cosmos.base.v1beta1.DecCoin
import kotlin.String
import kotlin.ULong
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
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.QueryParamsResponse"
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

@Serializable(with = QueryValidatorDistributionInfoRequest.KotlinxSerializer::class)
@SerialName(value = QueryValidatorDistributionInfoRequest.TYPE_URL)
public data class QueryValidatorDistributionInfoRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryValidatorDistributionInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryValidatorDistributionInfoRequest> {
    private val delegator: KSerializer<QueryValidatorDistributionInfoRequest> =
        QueryValidatorDistributionInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValidatorDistributionInfoRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValidatorDistributionInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorDistributionInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorDistributionInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorDistributionInfoResponse.KotlinxSerializer::class)
@SerialName(value = QueryValidatorDistributionInfoResponse.TYPE_URL)
public data class QueryValidatorDistributionInfoResponse(
  @ProtobufIndex(index = 1)
  public val operatorAddress: String,
  @ProtobufIndex(index = 2)
  public val selfBondRewards: List<DecCoin>,
  @ProtobufIndex(index = 3)
  public val commission: List<DecCoin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryValidatorDistributionInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryValidatorDistributionInfoResponse> {
    private val delegator: KSerializer<QueryValidatorDistributionInfoResponse> =
        QueryValidatorDistributionInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryValidatorDistributionInfoResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValidatorDistributionInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorDistributionInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorDistributionInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorOutstandingRewardsRequest.KotlinxSerializer::class)
@SerialName(value = QueryValidatorOutstandingRewardsRequest.TYPE_URL)
public data class QueryValidatorOutstandingRewardsRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryValidatorOutstandingRewardsRequest> {
    private val delegator: KSerializer<QueryValidatorOutstandingRewardsRequest> =
        QueryValidatorOutstandingRewardsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryValidatorOutstandingRewardsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValidatorOutstandingRewardsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorOutstandingRewardsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorOutstandingRewardsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorOutstandingRewardsResponse.KotlinxSerializer::class)
@SerialName(value = QueryValidatorOutstandingRewardsResponse.TYPE_URL)
public data class QueryValidatorOutstandingRewardsResponse(
  @ProtobufIndex(index = 1)
  public val rewards: ValidatorOutstandingRewards,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryValidatorOutstandingRewardsResponse> {
    private val delegator: KSerializer<QueryValidatorOutstandingRewardsResponse> =
        QueryValidatorOutstandingRewardsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryValidatorOutstandingRewardsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValidatorOutstandingRewardsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorOutstandingRewardsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorOutstandingRewardsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorCommissionRequest.KotlinxSerializer::class)
@SerialName(value = QueryValidatorCommissionRequest.TYPE_URL)
public data class QueryValidatorCommissionRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryValidatorCommissionRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryValidatorCommissionRequest> {
    private val delegator: KSerializer<QueryValidatorCommissionRequest> =
        QueryValidatorCommissionRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValidatorCommissionRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValidatorCommissionRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorCommissionRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorCommissionRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorCommissionResponse.KotlinxSerializer::class)
@SerialName(value = QueryValidatorCommissionResponse.TYPE_URL)
public data class QueryValidatorCommissionResponse(
  @ProtobufIndex(index = 1)
  public val commission: ValidatorAccumulatedCommission,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryValidatorCommissionResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryValidatorCommissionResponse> {
    private val delegator: KSerializer<QueryValidatorCommissionResponse> =
        QueryValidatorCommissionResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValidatorCommissionResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValidatorCommissionResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorCommissionResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorCommissionResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorSlashesRequest.KotlinxSerializer::class)
@SerialName(value = QueryValidatorSlashesRequest.TYPE_URL)
public data class QueryValidatorSlashesRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val startingHeight: ULong,
  @ProtobufIndex(index = 3)
  public val endingHeight: ULong,
  @ProtobufIndex(index = 4)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.QueryValidatorSlashesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryValidatorSlashesRequest> {
    private val delegator: KSerializer<QueryValidatorSlashesRequest> =
        QueryValidatorSlashesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValidatorSlashesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValidatorSlashesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorSlashesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorSlashesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorSlashesResponse.KotlinxSerializer::class)
@SerialName(value = QueryValidatorSlashesResponse.TYPE_URL)
public data class QueryValidatorSlashesResponse(
  @ProtobufIndex(index = 1)
  public val slashes: List<ValidatorSlashEvent>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.QueryValidatorSlashesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryValidatorSlashesResponse> {
    private val delegator: KSerializer<QueryValidatorSlashesResponse> =
        QueryValidatorSlashesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValidatorSlashesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValidatorSlashesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorSlashesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorSlashesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegationRewardsRequest.KotlinxSerializer::class)
@SerialName(value = QueryDelegationRewardsRequest.TYPE_URL)
public data class QueryDelegationRewardsRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.QueryDelegationRewardsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegationRewardsRequest> {
    private val delegator: KSerializer<QueryDelegationRewardsRequest> =
        QueryDelegationRewardsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegationRewardsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegationRewardsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegationRewardsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegationRewardsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegationRewardsResponse.KotlinxSerializer::class)
@SerialName(value = QueryDelegationRewardsResponse.TYPE_URL)
public data class QueryDelegationRewardsResponse(
  @ProtobufIndex(index = 1)
  public val rewards: List<DecCoin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryDelegationRewardsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegationRewardsResponse> {
    private val delegator: KSerializer<QueryDelegationRewardsResponse> =
        QueryDelegationRewardsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegationRewardsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegationRewardsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegationRewardsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegationRewardsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegationTotalRewardsRequest.KotlinxSerializer::class)
@SerialName(value = QueryDelegationTotalRewardsRequest.TYPE_URL)
public data class QueryDelegationTotalRewardsRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryDelegationTotalRewardsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegationTotalRewardsRequest> {
    private val delegator: KSerializer<QueryDelegationTotalRewardsRequest> =
        QueryDelegationTotalRewardsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegationTotalRewardsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegationTotalRewardsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegationTotalRewardsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegationTotalRewardsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegationTotalRewardsResponse.KotlinxSerializer::class)
@SerialName(value = QueryDelegationTotalRewardsResponse.TYPE_URL)
public data class QueryDelegationTotalRewardsResponse(
  @ProtobufIndex(index = 1)
  public val rewards: List<DelegationDelegatorReward>,
  @ProtobufIndex(index = 2)
  public val total: List<DecCoin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryDelegationTotalRewardsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegationTotalRewardsResponse> {
    private val delegator: KSerializer<QueryDelegationTotalRewardsResponse> =
        QueryDelegationTotalRewardsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegationTotalRewardsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegationTotalRewardsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegationTotalRewardsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegationTotalRewardsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorValidatorsRequest.KotlinxSerializer::class)
@SerialName(value = QueryDelegatorValidatorsRequest.TYPE_URL)
public data class QueryDelegatorValidatorsRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryDelegatorValidatorsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegatorValidatorsRequest> {
    private val delegator: KSerializer<QueryDelegatorValidatorsRequest> =
        QueryDelegatorValidatorsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegatorValidatorsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegatorValidatorsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorValidatorsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorValidatorsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorValidatorsResponse.KotlinxSerializer::class)
@SerialName(value = QueryDelegatorValidatorsResponse.TYPE_URL)
public data class QueryDelegatorValidatorsResponse(
  @ProtobufIndex(index = 1)
  public val validators: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryDelegatorValidatorsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegatorValidatorsResponse> {
    private val delegator: KSerializer<QueryDelegatorValidatorsResponse> =
        QueryDelegatorValidatorsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegatorValidatorsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegatorValidatorsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorValidatorsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorValidatorsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorWithdrawAddressRequest.KotlinxSerializer::class)
@SerialName(value = QueryDelegatorWithdrawAddressRequest.TYPE_URL)
public data class QueryDelegatorWithdrawAddressRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegatorWithdrawAddressRequest> {
    private val delegator: KSerializer<QueryDelegatorWithdrawAddressRequest> =
        QueryDelegatorWithdrawAddressRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegatorWithdrawAddressRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegatorWithdrawAddressRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorWithdrawAddressRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorWithdrawAddressRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorWithdrawAddressResponse.KotlinxSerializer::class)
@SerialName(value = QueryDelegatorWithdrawAddressResponse.TYPE_URL)
public data class QueryDelegatorWithdrawAddressResponse(
  @ProtobufIndex(index = 1)
  public val withdrawAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegatorWithdrawAddressResponse> {
    private val delegator: KSerializer<QueryDelegatorWithdrawAddressResponse> =
        QueryDelegatorWithdrawAddressResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegatorWithdrawAddressResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegatorWithdrawAddressResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorWithdrawAddressResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorWithdrawAddressResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCommunityPoolRequest.KotlinxSerializer::class)
@SerialName(value = QueryCommunityPoolRequest.TYPE_URL)
public class QueryCommunityPoolRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.QueryCommunityPoolRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryCommunityPoolRequest> {
    private val delegator: KSerializer<QueryCommunityPoolRequest> =
        QueryCommunityPoolRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCommunityPoolRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCommunityPoolRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCommunityPoolRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCommunityPoolRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCommunityPoolResponse.KotlinxSerializer::class)
@SerialName(value = QueryCommunityPoolResponse.TYPE_URL)
public data class QueryCommunityPoolResponse(
  @ProtobufIndex(index = 1)
  public val pool: List<DecCoin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.distribution.v1beta1.QueryCommunityPoolResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryCommunityPoolResponse> {
    private val delegator: KSerializer<QueryCommunityPoolResponse> =
        QueryCommunityPoolResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCommunityPoolResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCommunityPoolResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCommunityPoolResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCommunityPoolResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
