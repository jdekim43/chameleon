// Transform from oracle/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

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
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryExchangeRateRequest"
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
  public val oracleExchangeRate: OracleExchangeRate,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryExchangeRateResponse"
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
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryExchangeRatesRequest"
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

@Serializable(with = DenomOracleExchangeRatePair.KotlinxSerializer::class)
@SerialName(value = DenomOracleExchangeRatePair.TYPE_URL)
public data class DenomOracleExchangeRatePair(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val oracleExchangeRate: OracleExchangeRate,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.DenomOracleExchangeRatePair"
  }

  public object KotlinxSerializer : KSerializer<DenomOracleExchangeRatePair> {
    private val delegator: KSerializer<DenomOracleExchangeRatePair> =
        DenomOracleExchangeRatePair.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DenomOracleExchangeRatePair): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DenomOracleExchangeRatePairConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DenomOracleExchangeRatePair {
      if (decoder is ProtobufMapperDecoder) {
        return DenomOracleExchangeRatePairConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryExchangeRatesResponse.KotlinxSerializer::class)
@SerialName(value = QueryExchangeRatesResponse.TYPE_URL)
public data class QueryExchangeRatesResponse(
  @ProtobufIndex(index = 1)
  public val denomOracleExchangeRatePairs: List<DenomOracleExchangeRatePair>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryExchangeRatesResponse"
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

@Serializable(with = QueryActivesRequest.KotlinxSerializer::class)
@SerialName(value = QueryActivesRequest.TYPE_URL)
public class QueryActivesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryActivesRequest"
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
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryActivesResponse"
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
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryVoteTargetsRequest"
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
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryVoteTargetsResponse"
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

@Serializable(with = QueryPriceSnapshotHistoryRequest.KotlinxSerializer::class)
@SerialName(value = QueryPriceSnapshotHistoryRequest.TYPE_URL)
public class QueryPriceSnapshotHistoryRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/seiprotocol.seichain.oracle.QueryPriceSnapshotHistoryRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryPriceSnapshotHistoryRequest> {
    private val delegator: KSerializer<QueryPriceSnapshotHistoryRequest> =
        QueryPriceSnapshotHistoryRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPriceSnapshotHistoryRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPriceSnapshotHistoryRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPriceSnapshotHistoryRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPriceSnapshotHistoryRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPriceSnapshotHistoryResponse.KotlinxSerializer::class)
@SerialName(value = QueryPriceSnapshotHistoryResponse.TYPE_URL)
public data class QueryPriceSnapshotHistoryResponse(
  @ProtobufIndex(index = 1)
  public val priceSnapshots: List<PriceSnapshot>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/seiprotocol.seichain.oracle.QueryPriceSnapshotHistoryResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryPriceSnapshotHistoryResponse> {
    private val delegator: KSerializer<QueryPriceSnapshotHistoryResponse> =
        QueryPriceSnapshotHistoryResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPriceSnapshotHistoryResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPriceSnapshotHistoryResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPriceSnapshotHistoryResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPriceSnapshotHistoryResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTwapsRequest.KotlinxSerializer::class)
@SerialName(value = QueryTwapsRequest.TYPE_URL)
public data class QueryTwapsRequest(
  @ProtobufIndex(index = 1)
  public val lookbackSeconds: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryTwapsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTwapsRequest> {
    private val delegator: KSerializer<QueryTwapsRequest> = QueryTwapsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTwapsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTwapsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTwapsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTwapsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTwapsResponse.KotlinxSerializer::class)
@SerialName(value = QueryTwapsResponse.TYPE_URL)
public data class QueryTwapsResponse(
  @ProtobufIndex(index = 1)
  public val oracleTwaps: List<OracleTwap>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryTwapsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTwapsResponse> {
    private val delegator: KSerializer<QueryTwapsResponse> = QueryTwapsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTwapsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTwapsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTwapsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTwapsResponseConverter.deserialize(decoder.decodeByteArray())
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
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryFeederDelegationRequest"
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
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryFeederDelegationResponse"
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

@Serializable(with = QueryVotePenaltyCounterRequest.KotlinxSerializer::class)
@SerialName(value = QueryVotePenaltyCounterRequest.TYPE_URL)
public data class QueryVotePenaltyCounterRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/seiprotocol.seichain.oracle.QueryVotePenaltyCounterRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryVotePenaltyCounterRequest> {
    private val delegator: KSerializer<QueryVotePenaltyCounterRequest> =
        QueryVotePenaltyCounterRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotePenaltyCounterRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVotePenaltyCounterRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotePenaltyCounterRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotePenaltyCounterRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotePenaltyCounterResponse.KotlinxSerializer::class)
@SerialName(value = QueryVotePenaltyCounterResponse.TYPE_URL)
public data class QueryVotePenaltyCounterResponse(
  @ProtobufIndex(index = 1)
  public val votePenaltyCounter: VotePenaltyCounter,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/seiprotocol.seichain.oracle.QueryVotePenaltyCounterResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryVotePenaltyCounterResponse> {
    private val delegator: KSerializer<QueryVotePenaltyCounterResponse> =
        QueryVotePenaltyCounterResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotePenaltyCounterResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVotePenaltyCounterResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotePenaltyCounterResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotePenaltyCounterResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySlashWindowRequest.KotlinxSerializer::class)
@SerialName(value = QuerySlashWindowRequest.TYPE_URL)
public class QuerySlashWindowRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QuerySlashWindowRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySlashWindowRequest> {
    private val delegator: KSerializer<QuerySlashWindowRequest> =
        QuerySlashWindowRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySlashWindowRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySlashWindowRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySlashWindowRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySlashWindowRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySlashWindowResponse.KotlinxSerializer::class)
@SerialName(value = QuerySlashWindowResponse.TYPE_URL)
public data class QuerySlashWindowResponse(
  @ProtobufIndex(index = 1)
  public val windowProgress: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QuerySlashWindowResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySlashWindowResponse> {
    private val delegator: KSerializer<QuerySlashWindowResponse> =
        QuerySlashWindowResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySlashWindowResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySlashWindowResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySlashWindowResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySlashWindowResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/seiprotocol.seichain.oracle.QueryParamsResponse"
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
