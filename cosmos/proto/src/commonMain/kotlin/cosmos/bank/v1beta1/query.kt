// Transform from cosmos/bank/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import cosmos.base.v1beta1.Coin
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

@Serializable(with = QueryBalanceRequest.KotlinxSerializer::class)
@SerialName(value = QueryBalanceRequest.TYPE_URL)
public data class QueryBalanceRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryBalanceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryBalanceRequest> {
    private val delegator: KSerializer<QueryBalanceRequest> = QueryBalanceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBalanceRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBalanceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBalanceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBalanceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBalanceResponse.KotlinxSerializer::class)
@SerialName(value = QueryBalanceResponse.TYPE_URL)
public data class QueryBalanceResponse(
  @ProtobufIndex(index = 1)
  public val balance: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryBalanceResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryBalanceResponse> {
    private val delegator: KSerializer<QueryBalanceResponse> = QueryBalanceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBalanceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBalanceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBalanceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBalanceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllBalancesRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllBalancesRequest.TYPE_URL)
public data class QueryAllBalancesRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryAllBalancesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllBalancesRequest> {
    private val delegator: KSerializer<QueryAllBalancesRequest> =
        QueryAllBalancesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllBalancesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllBalancesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllBalancesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllBalancesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllBalancesResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllBalancesResponse.TYPE_URL)
public data class QueryAllBalancesResponse(
  @ProtobufIndex(index = 1)
  public val balances: List<Coin>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryAllBalancesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllBalancesResponse> {
    private val delegator: KSerializer<QueryAllBalancesResponse> =
        QueryAllBalancesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllBalancesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllBalancesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllBalancesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllBalancesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpendableBalancesRequest.KotlinxSerializer::class)
@SerialName(value = QuerySpendableBalancesRequest.TYPE_URL)
public data class QuerySpendableBalancesRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QuerySpendableBalancesRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySpendableBalancesRequest> {
    private val delegator: KSerializer<QuerySpendableBalancesRequest> =
        QuerySpendableBalancesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpendableBalancesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpendableBalancesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpendableBalancesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpendableBalancesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpendableBalancesResponse.KotlinxSerializer::class)
@SerialName(value = QuerySpendableBalancesResponse.TYPE_URL)
public data class QuerySpendableBalancesResponse(
  @ProtobufIndex(index = 1)
  public val balances: List<Coin>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QuerySpendableBalancesResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySpendableBalancesResponse> {
    private val delegator: KSerializer<QuerySpendableBalancesResponse> =
        QuerySpendableBalancesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpendableBalancesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpendableBalancesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpendableBalancesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpendableBalancesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpendableBalanceByDenomRequest.KotlinxSerializer::class)
@SerialName(value = QuerySpendableBalanceByDenomRequest.TYPE_URL)
public data class QuerySpendableBalanceByDenomRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QuerySpendableBalanceByDenomRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySpendableBalanceByDenomRequest> {
    private val delegator: KSerializer<QuerySpendableBalanceByDenomRequest> =
        QuerySpendableBalanceByDenomRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpendableBalanceByDenomRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpendableBalanceByDenomRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpendableBalanceByDenomRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpendableBalanceByDenomRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpendableBalanceByDenomResponse.KotlinxSerializer::class)
@SerialName(value = QuerySpendableBalanceByDenomResponse.TYPE_URL)
public data class QuerySpendableBalanceByDenomResponse(
  @ProtobufIndex(index = 1)
  public val balance: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySpendableBalanceByDenomResponse> {
    private val delegator: KSerializer<QuerySpendableBalanceByDenomResponse> =
        QuerySpendableBalanceByDenomResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpendableBalanceByDenomResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpendableBalanceByDenomResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpendableBalanceByDenomResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpendableBalanceByDenomResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTotalSupplyRequest.KotlinxSerializer::class)
@SerialName(value = QueryTotalSupplyRequest.TYPE_URL)
public data class QueryTotalSupplyRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryTotalSupplyRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTotalSupplyRequest> {
    private val delegator: KSerializer<QueryTotalSupplyRequest> =
        QueryTotalSupplyRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTotalSupplyRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTotalSupplyRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTotalSupplyRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTotalSupplyRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTotalSupplyResponse.KotlinxSerializer::class)
@SerialName(value = QueryTotalSupplyResponse.TYPE_URL)
public data class QueryTotalSupplyResponse(
  @ProtobufIndex(index = 1)
  public val supply: List<Coin>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryTotalSupplyResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTotalSupplyResponse> {
    private val delegator: KSerializer<QueryTotalSupplyResponse> =
        QueryTotalSupplyResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTotalSupplyResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTotalSupplyResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTotalSupplyResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTotalSupplyResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySupplyOfRequest.KotlinxSerializer::class)
@SerialName(value = QuerySupplyOfRequest.TYPE_URL)
public data class QuerySupplyOfRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QuerySupplyOfRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySupplyOfRequest> {
    private val delegator: KSerializer<QuerySupplyOfRequest> = QuerySupplyOfRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySupplyOfRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySupplyOfRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySupplyOfRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySupplyOfRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySupplyOfResponse.KotlinxSerializer::class)
@SerialName(value = QuerySupplyOfResponse.TYPE_URL)
public data class QuerySupplyOfResponse(
  @ProtobufIndex(index = 1)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QuerySupplyOfResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySupplyOfResponse> {
    private val delegator: KSerializer<QuerySupplyOfResponse> = QuerySupplyOfResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySupplyOfResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySupplyOfResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySupplyOfResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySupplyOfResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryParamsResponse"
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

@Serializable(with = QueryDenomsMetadataRequest.KotlinxSerializer::class)
@SerialName(value = QueryDenomsMetadataRequest.TYPE_URL)
public data class QueryDenomsMetadataRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryDenomsMetadataRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomsMetadataRequest> {
    private val delegator: KSerializer<QueryDenomsMetadataRequest> =
        QueryDenomsMetadataRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomsMetadataRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomsMetadataRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomsMetadataRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomsMetadataRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomsMetadataResponse.KotlinxSerializer::class)
@SerialName(value = QueryDenomsMetadataResponse.TYPE_URL)
public data class QueryDenomsMetadataResponse(
  @ProtobufIndex(index = 1)
  public val metadatas: List<Metadata>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryDenomsMetadataResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomsMetadataResponse> {
    private val delegator: KSerializer<QueryDenomsMetadataResponse> =
        QueryDenomsMetadataResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomsMetadataResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomsMetadataResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomsMetadataResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomsMetadataResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomMetadataRequest.KotlinxSerializer::class)
@SerialName(value = QueryDenomMetadataRequest.TYPE_URL)
public data class QueryDenomMetadataRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryDenomMetadataRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomMetadataRequest> {
    private val delegator: KSerializer<QueryDenomMetadataRequest> =
        QueryDenomMetadataRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomMetadataRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomMetadataRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomMetadataRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomMetadataRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomMetadataResponse.KotlinxSerializer::class)
@SerialName(value = QueryDenomMetadataResponse.TYPE_URL)
public data class QueryDenomMetadataResponse(
  @ProtobufIndex(index = 1)
  public val metadata: Metadata,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryDenomMetadataResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomMetadataResponse> {
    private val delegator: KSerializer<QueryDenomMetadataResponse> =
        QueryDenomMetadataResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomMetadataResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomMetadataResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomMetadataResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomMetadataResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomOwnersRequest.KotlinxSerializer::class)
@SerialName(value = QueryDenomOwnersRequest.TYPE_URL)
public data class QueryDenomOwnersRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryDenomOwnersRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomOwnersRequest> {
    private val delegator: KSerializer<QueryDenomOwnersRequest> =
        QueryDenomOwnersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomOwnersRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomOwnersRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomOwnersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomOwnersRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DenomOwner.KotlinxSerializer::class)
@SerialName(value = DenomOwner.TYPE_URL)
public data class DenomOwner(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val balance: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.DenomOwner"
  }

  public object KotlinxSerializer : KSerializer<DenomOwner> {
    private val delegator: KSerializer<DenomOwner> = DenomOwner.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DenomOwner): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DenomOwnerConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DenomOwner {
      if (decoder is ProtobufMapperDecoder) {
        return DenomOwnerConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomOwnersResponse.KotlinxSerializer::class)
@SerialName(value = QueryDenomOwnersResponse.TYPE_URL)
public data class QueryDenomOwnersResponse(
  @ProtobufIndex(index = 1)
  public val denomOwners: List<DenomOwner>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QueryDenomOwnersResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomOwnersResponse> {
    private val delegator: KSerializer<QueryDenomOwnersResponse> =
        QueryDenomOwnersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomOwnersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomOwnersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomOwnersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomOwnersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySendEnabledRequest.KotlinxSerializer::class)
@SerialName(value = QuerySendEnabledRequest.TYPE_URL)
public data class QuerySendEnabledRequest(
  @ProtobufIndex(index = 1)
  public val denoms: List<String>,
  @ProtobufIndex(index = 99)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QuerySendEnabledRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySendEnabledRequest> {
    private val delegator: KSerializer<QuerySendEnabledRequest> =
        QuerySendEnabledRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySendEnabledRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySendEnabledRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySendEnabledRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySendEnabledRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySendEnabledResponse.KotlinxSerializer::class)
@SerialName(value = QuerySendEnabledResponse.TYPE_URL)
public data class QuerySendEnabledResponse(
  @ProtobufIndex(index = 1)
  public val sendEnabled: List<SendEnabled>,
  @ProtobufIndex(index = 99)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.QuerySendEnabledResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySendEnabledResponse> {
    private val delegator: KSerializer<QuerySendEnabledResponse> =
        QuerySendEnabledResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySendEnabledResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySendEnabledResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySendEnabledResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySendEnabledResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
