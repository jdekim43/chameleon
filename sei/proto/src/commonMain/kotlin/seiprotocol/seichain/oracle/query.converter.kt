// Transform from oracle/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryExchangeRateRequestConverter : ProtobufConverter<QueryExchangeRateRequest>

public fun QueryExchangeRateRequest.toAny(): Any = Any(QueryExchangeRateRequest.TYPE_URL,
    with(QueryExchangeRateRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryExchangeRateRequest>):
    QueryExchangeRateRequest {
  if (typeUrl != QueryExchangeRateRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryExchangeRateResponseConverter :
    ProtobufConverter<QueryExchangeRateResponse>

public fun QueryExchangeRateResponse.toAny(): Any = Any(QueryExchangeRateResponse.TYPE_URL,
    with(QueryExchangeRateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryExchangeRateResponse>):
    QueryExchangeRateResponse {
  if (typeUrl != QueryExchangeRateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryExchangeRatesRequestConverter :
    ProtobufConverter<QueryExchangeRatesRequest>

public fun QueryExchangeRatesRequest.toAny(): Any = Any(QueryExchangeRatesRequest.TYPE_URL,
    with(QueryExchangeRatesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryExchangeRatesRequest>):
    QueryExchangeRatesRequest {
  if (typeUrl != QueryExchangeRatesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DenomOracleExchangeRatePairConverter :
    ProtobufConverter<DenomOracleExchangeRatePair>

public fun DenomOracleExchangeRatePair.toAny(): Any = Any(DenomOracleExchangeRatePair.TYPE_URL,
    with(DenomOracleExchangeRatePairConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DenomOracleExchangeRatePair>):
    DenomOracleExchangeRatePair {
  if (typeUrl != DenomOracleExchangeRatePair.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryExchangeRatesResponseConverter :
    ProtobufConverter<QueryExchangeRatesResponse>

public fun QueryExchangeRatesResponse.toAny(): Any = Any(QueryExchangeRatesResponse.TYPE_URL,
    with(QueryExchangeRatesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryExchangeRatesResponse>):
    QueryExchangeRatesResponse {
  if (typeUrl != QueryExchangeRatesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryActivesRequestConverter : ProtobufConverter<QueryActivesRequest>

public fun QueryActivesRequest.toAny(): Any = Any(QueryActivesRequest.TYPE_URL,
    with(QueryActivesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryActivesRequest>): QueryActivesRequest {
  if (typeUrl != QueryActivesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryActivesResponseConverter : ProtobufConverter<QueryActivesResponse>

public fun QueryActivesResponse.toAny(): Any = Any(QueryActivesResponse.TYPE_URL,
    with(QueryActivesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryActivesResponse>): QueryActivesResponse {
  if (typeUrl != QueryActivesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVoteTargetsRequestConverter : ProtobufConverter<QueryVoteTargetsRequest>

public fun QueryVoteTargetsRequest.toAny(): Any = Any(QueryVoteTargetsRequest.TYPE_URL,
    with(QueryVoteTargetsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVoteTargetsRequest>):
    QueryVoteTargetsRequest {
  if (typeUrl != QueryVoteTargetsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVoteTargetsResponseConverter : ProtobufConverter<QueryVoteTargetsResponse>

public fun QueryVoteTargetsResponse.toAny(): Any = Any(QueryVoteTargetsResponse.TYPE_URL,
    with(QueryVoteTargetsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVoteTargetsResponse>):
    QueryVoteTargetsResponse {
  if (typeUrl != QueryVoteTargetsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPriceSnapshotHistoryRequestConverter :
    ProtobufConverter<QueryPriceSnapshotHistoryRequest>

public fun QueryPriceSnapshotHistoryRequest.toAny(): Any =
    Any(QueryPriceSnapshotHistoryRequest.TYPE_URL, with(QueryPriceSnapshotHistoryRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPriceSnapshotHistoryRequest>):
    QueryPriceSnapshotHistoryRequest {
  if (typeUrl != QueryPriceSnapshotHistoryRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPriceSnapshotHistoryResponseConverter :
    ProtobufConverter<QueryPriceSnapshotHistoryResponse>

public fun QueryPriceSnapshotHistoryResponse.toAny(): Any =
    Any(QueryPriceSnapshotHistoryResponse.TYPE_URL, with(QueryPriceSnapshotHistoryResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPriceSnapshotHistoryResponse>):
    QueryPriceSnapshotHistoryResponse {
  if (typeUrl != QueryPriceSnapshotHistoryResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTwapsRequestConverter : ProtobufConverter<QueryTwapsRequest>

public fun QueryTwapsRequest.toAny(): Any = Any(QueryTwapsRequest.TYPE_URL,
    with(QueryTwapsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTwapsRequest>): QueryTwapsRequest {
  if (typeUrl != QueryTwapsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTwapsResponseConverter : ProtobufConverter<QueryTwapsResponse>

public fun QueryTwapsResponse.toAny(): Any = Any(QueryTwapsResponse.TYPE_URL,
    with(QueryTwapsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTwapsResponse>): QueryTwapsResponse {
  if (typeUrl != QueryTwapsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeederDelegationRequestConverter :
    ProtobufConverter<QueryFeederDelegationRequest>

public fun QueryFeederDelegationRequest.toAny(): Any = Any(QueryFeederDelegationRequest.TYPE_URL,
    with(QueryFeederDelegationRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeederDelegationRequest>):
    QueryFeederDelegationRequest {
  if (typeUrl != QueryFeederDelegationRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeederDelegationResponseConverter :
    ProtobufConverter<QueryFeederDelegationResponse>

public fun QueryFeederDelegationResponse.toAny(): Any = Any(QueryFeederDelegationResponse.TYPE_URL,
    with(QueryFeederDelegationResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeederDelegationResponse>):
    QueryFeederDelegationResponse {
  if (typeUrl != QueryFeederDelegationResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVotePenaltyCounterRequestConverter :
    ProtobufConverter<QueryVotePenaltyCounterRequest>

public fun QueryVotePenaltyCounterRequest.toAny(): Any =
    Any(QueryVotePenaltyCounterRequest.TYPE_URL, with(QueryVotePenaltyCounterRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVotePenaltyCounterRequest>):
    QueryVotePenaltyCounterRequest {
  if (typeUrl != QueryVotePenaltyCounterRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVotePenaltyCounterResponseConverter :
    ProtobufConverter<QueryVotePenaltyCounterResponse>

public fun QueryVotePenaltyCounterResponse.toAny(): Any =
    Any(QueryVotePenaltyCounterResponse.TYPE_URL, with(QueryVotePenaltyCounterResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVotePenaltyCounterResponse>):
    QueryVotePenaltyCounterResponse {
  if (typeUrl != QueryVotePenaltyCounterResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySlashWindowRequestConverter : ProtobufConverter<QuerySlashWindowRequest>

public fun QuerySlashWindowRequest.toAny(): Any = Any(QuerySlashWindowRequest.TYPE_URL,
    with(QuerySlashWindowRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySlashWindowRequest>):
    QuerySlashWindowRequest {
  if (typeUrl != QuerySlashWindowRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySlashWindowResponseConverter : ProtobufConverter<QuerySlashWindowResponse>

public fun QuerySlashWindowResponse.toAny(): Any = Any(QuerySlashWindowResponse.TYPE_URL,
    with(QuerySlashWindowResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySlashWindowResponse>):
    QuerySlashWindowResponse {
  if (typeUrl != QuerySlashWindowResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public fun QueryParamsRequest.toAny(): Any = Any(QueryParamsRequest.TYPE_URL,
    with(QueryParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsRequest>): QueryParamsRequest {
  if (typeUrl != QueryParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public fun QueryParamsResponse.toAny(): Any = Any(QueryParamsResponse.TYPE_URL,
    with(QueryParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsResponse>): QueryParamsResponse {
  if (typeUrl != QueryParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
