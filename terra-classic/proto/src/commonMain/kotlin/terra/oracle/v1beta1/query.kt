// Transform from terra/oracle/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

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

@Serializable(with = QueryExchangeRateRequest.KotlinxSerializer::class)
@SerialName(value = QueryExchangeRateRequest.TYPE_URL)
public data class QueryExchangeRateRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryExchangeRateRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryExchangeRateRequest> {
    private val delegator: KSerializer<QueryExchangeRateRequest> =
        QueryExchangeRateRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryExchangeRateRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryExchangeRateRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryExchangeRateRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryExchangeRateRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryExchangeRateResponse.KotlinxSerializer::class)
@SerialName(value = QueryExchangeRateResponse.TYPE_URL)
public data class QueryExchangeRateResponse(
  @ProtobufIndex(index = 1)
  public val exchangeRate: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryExchangeRateResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryExchangeRateResponse> {
    private val delegator: KSerializer<QueryExchangeRateResponse> =
        QueryExchangeRateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryExchangeRateResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryExchangeRateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryExchangeRateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryExchangeRateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryExchangeRatesRequest.KotlinxSerializer::class)
@SerialName(value = QueryExchangeRatesRequest.TYPE_URL)
public class QueryExchangeRatesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryExchangeRatesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryExchangeRatesRequest> {
    private val delegator: KSerializer<QueryExchangeRatesRequest> =
        QueryExchangeRatesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryExchangeRatesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryExchangeRatesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryExchangeRatesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryExchangeRatesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryExchangeRatesResponse.KotlinxSerializer::class)
@SerialName(value = QueryExchangeRatesResponse.TYPE_URL)
public data class QueryExchangeRatesResponse(
  @ProtobufIndex(index = 1)
  public val exchangeRates: List<DecCoin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryExchangeRatesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryExchangeRatesResponse> {
    private val delegator: KSerializer<QueryExchangeRatesResponse> =
        QueryExchangeRatesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryExchangeRatesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryExchangeRatesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryExchangeRatesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryExchangeRatesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTobinTaxRequest.KotlinxSerializer::class)
@SerialName(value = QueryTobinTaxRequest.TYPE_URL)
public data class QueryTobinTaxRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryTobinTaxRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTobinTaxRequest> {
    private val delegator: KSerializer<QueryTobinTaxRequest> = QueryTobinTaxRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTobinTaxRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTobinTaxRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTobinTaxRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTobinTaxRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTobinTaxResponse.KotlinxSerializer::class)
@SerialName(value = QueryTobinTaxResponse.TYPE_URL)
public data class QueryTobinTaxResponse(
  @ProtobufIndex(index = 1)
  public val tobinTax: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryTobinTaxResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTobinTaxResponse> {
    private val delegator: KSerializer<QueryTobinTaxResponse> = QueryTobinTaxResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTobinTaxResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTobinTaxResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTobinTaxResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTobinTaxResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTobinTaxesRequest.KotlinxSerializer::class)
@SerialName(value = QueryTobinTaxesRequest.TYPE_URL)
public class QueryTobinTaxesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryTobinTaxesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTobinTaxesRequest> {
    private val delegator: KSerializer<QueryTobinTaxesRequest> = QueryTobinTaxesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTobinTaxesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTobinTaxesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTobinTaxesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTobinTaxesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTobinTaxesResponse.KotlinxSerializer::class)
@SerialName(value = QueryTobinTaxesResponse.TYPE_URL)
public data class QueryTobinTaxesResponse(
  @ProtobufIndex(index = 1)
  public val tobinTaxes: List<Denom>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryTobinTaxesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTobinTaxesResponse> {
    private val delegator: KSerializer<QueryTobinTaxesResponse> =
        QueryTobinTaxesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTobinTaxesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTobinTaxesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTobinTaxesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTobinTaxesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryActivesRequest.KotlinxSerializer::class)
@SerialName(value = QueryActivesRequest.TYPE_URL)
public class QueryActivesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryActivesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryActivesRequest> {
    private val delegator: KSerializer<QueryActivesRequest> = QueryActivesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryActivesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryActivesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryActivesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryActivesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryActivesResponse.KotlinxSerializer::class)
@SerialName(value = QueryActivesResponse.TYPE_URL)
public data class QueryActivesResponse(
  @ProtobufIndex(index = 1)
  public val actives: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryActivesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryActivesResponse> {
    private val delegator: KSerializer<QueryActivesResponse> = QueryActivesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryActivesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryActivesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryActivesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryActivesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVoteTargetsRequest.KotlinxSerializer::class)
@SerialName(value = QueryVoteTargetsRequest.TYPE_URL)
public class QueryVoteTargetsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryVoteTargetsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryVoteTargetsRequest> {
    private val delegator: KSerializer<QueryVoteTargetsRequest> =
        QueryVoteTargetsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVoteTargetsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVoteTargetsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVoteTargetsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVoteTargetsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVoteTargetsResponse.KotlinxSerializer::class)
@SerialName(value = QueryVoteTargetsResponse.TYPE_URL)
public data class QueryVoteTargetsResponse(
  @ProtobufIndex(index = 1)
  public val voteTargets: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryVoteTargetsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryVoteTargetsResponse> {
    private val delegator: KSerializer<QueryVoteTargetsResponse> =
        QueryVoteTargetsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVoteTargetsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVoteTargetsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVoteTargetsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVoteTargetsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeederDelegationRequest.KotlinxSerializer::class)
@SerialName(value = QueryFeederDelegationRequest.TYPE_URL)
public data class QueryFeederDelegationRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryFeederDelegationRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryFeederDelegationRequest> {
    private val delegator: KSerializer<QueryFeederDelegationRequest> =
        QueryFeederDelegationRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFeederDelegationRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeederDelegationRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeederDelegationRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeederDelegationRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeederDelegationResponse.KotlinxSerializer::class)
@SerialName(value = QueryFeederDelegationResponse.TYPE_URL)
public data class QueryFeederDelegationResponse(
  @ProtobufIndex(index = 1)
  public val feederAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryFeederDelegationResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryFeederDelegationResponse> {
    private val delegator: KSerializer<QueryFeederDelegationResponse> =
        QueryFeederDelegationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFeederDelegationResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeederDelegationResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeederDelegationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeederDelegationResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryMissCounterRequest.KotlinxSerializer::class)
@SerialName(value = QueryMissCounterRequest.TYPE_URL)
public data class QueryMissCounterRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryMissCounterRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryMissCounterRequest> {
    private val delegator: KSerializer<QueryMissCounterRequest> =
        QueryMissCounterRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryMissCounterRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryMissCounterRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryMissCounterRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMissCounterRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryMissCounterResponse.KotlinxSerializer::class)
@SerialName(value = QueryMissCounterResponse.TYPE_URL)
public data class QueryMissCounterResponse(
  @ProtobufIndex(index = 1)
  public val missCounter: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryMissCounterResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryMissCounterResponse> {
    private val delegator: KSerializer<QueryMissCounterResponse> =
        QueryMissCounterResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryMissCounterResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryMissCounterResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryMissCounterResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMissCounterResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregatePrevoteRequest.KotlinxSerializer::class)
@SerialName(value = QueryAggregatePrevoteRequest.TYPE_URL)
public data class QueryAggregatePrevoteRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryAggregatePrevoteRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregatePrevoteRequest> {
    private val delegator: KSerializer<QueryAggregatePrevoteRequest> =
        QueryAggregatePrevoteRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregatePrevoteRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregatePrevoteRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregatePrevoteRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregatePrevoteRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregatePrevoteResponse.KotlinxSerializer::class)
@SerialName(value = QueryAggregatePrevoteResponse.TYPE_URL)
public data class QueryAggregatePrevoteResponse(
  @ProtobufIndex(index = 1)
  public val aggregatePrevote: AggregateExchangeRatePrevote,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryAggregatePrevoteResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregatePrevoteResponse> {
    private val delegator: KSerializer<QueryAggregatePrevoteResponse> =
        QueryAggregatePrevoteResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregatePrevoteResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregatePrevoteResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregatePrevoteResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregatePrevoteResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregatePrevotesRequest.KotlinxSerializer::class)
@SerialName(value = QueryAggregatePrevotesRequest.TYPE_URL)
public class QueryAggregatePrevotesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryAggregatePrevotesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregatePrevotesRequest> {
    private val delegator: KSerializer<QueryAggregatePrevotesRequest> =
        QueryAggregatePrevotesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregatePrevotesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregatePrevotesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregatePrevotesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregatePrevotesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregatePrevotesResponse.KotlinxSerializer::class)
@SerialName(value = QueryAggregatePrevotesResponse.TYPE_URL)
public data class QueryAggregatePrevotesResponse(
  @ProtobufIndex(index = 1)
  public val aggregatePrevotes: List<AggregateExchangeRatePrevote>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryAggregatePrevotesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregatePrevotesResponse> {
    private val delegator: KSerializer<QueryAggregatePrevotesResponse> =
        QueryAggregatePrevotesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregatePrevotesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregatePrevotesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregatePrevotesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregatePrevotesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateVoteRequest.KotlinxSerializer::class)
@SerialName(value = QueryAggregateVoteRequest.TYPE_URL)
public data class QueryAggregateVoteRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryAggregateVoteRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateVoteRequest> {
    private val delegator: KSerializer<QueryAggregateVoteRequest> =
        QueryAggregateVoteRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateVoteRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateVoteRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateVoteRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateVoteRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateVoteResponse.KotlinxSerializer::class)
@SerialName(value = QueryAggregateVoteResponse.TYPE_URL)
public data class QueryAggregateVoteResponse(
  @ProtobufIndex(index = 1)
  public val aggregateVote: AggregateExchangeRateVote,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryAggregateVoteResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateVoteResponse> {
    private val delegator: KSerializer<QueryAggregateVoteResponse> =
        QueryAggregateVoteResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateVoteResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateVoteResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateVoteResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateVoteResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateVotesRequest.KotlinxSerializer::class)
@SerialName(value = QueryAggregateVotesRequest.TYPE_URL)
public class QueryAggregateVotesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryAggregateVotesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateVotesRequest> {
    private val delegator: KSerializer<QueryAggregateVotesRequest> =
        QueryAggregateVotesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateVotesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateVotesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateVotesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateVotesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateVotesResponse.KotlinxSerializer::class)
@SerialName(value = QueryAggregateVotesResponse.TYPE_URL)
public data class QueryAggregateVotesResponse(
  @ProtobufIndex(index = 1)
  public val aggregateVotes: List<AggregateExchangeRateVote>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryAggregateVotesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateVotesResponse> {
    private val delegator: KSerializer<QueryAggregateVotesResponse> =
        QueryAggregateVotesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateVotesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateVotesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateVotesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateVotesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/terra.oracle.v1beta1.QueryParamsResponse"
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
