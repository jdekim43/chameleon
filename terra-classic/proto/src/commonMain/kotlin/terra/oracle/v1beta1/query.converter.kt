// Transform from terra/oracle/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

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

public expect object QueryTobinTaxRequestConverter : ProtobufConverter<QueryTobinTaxRequest>

public fun QueryTobinTaxRequest.toAny(): Any = Any(QueryTobinTaxRequest.TYPE_URL,
    with(QueryTobinTaxRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTobinTaxRequest>): QueryTobinTaxRequest {
  if (typeUrl != QueryTobinTaxRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTobinTaxResponseConverter : ProtobufConverter<QueryTobinTaxResponse>

public fun QueryTobinTaxResponse.toAny(): Any = Any(QueryTobinTaxResponse.TYPE_URL,
    with(QueryTobinTaxResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTobinTaxResponse>): QueryTobinTaxResponse {
  if (typeUrl != QueryTobinTaxResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTobinTaxesRequestConverter : ProtobufConverter<QueryTobinTaxesRequest>

public fun QueryTobinTaxesRequest.toAny(): Any = Any(QueryTobinTaxesRequest.TYPE_URL,
    with(QueryTobinTaxesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTobinTaxesRequest>): QueryTobinTaxesRequest {
  if (typeUrl != QueryTobinTaxesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTobinTaxesResponseConverter : ProtobufConverter<QueryTobinTaxesResponse>

public fun QueryTobinTaxesResponse.toAny(): Any = Any(QueryTobinTaxesResponse.TYPE_URL,
    with(QueryTobinTaxesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTobinTaxesResponse>):
    QueryTobinTaxesResponse {
  if (typeUrl != QueryTobinTaxesResponse.TYPE_URL) throw
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

public expect object QueryMissCounterRequestConverter : ProtobufConverter<QueryMissCounterRequest>

public fun QueryMissCounterRequest.toAny(): Any = Any(QueryMissCounterRequest.TYPE_URL,
    with(QueryMissCounterRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryMissCounterRequest>):
    QueryMissCounterRequest {
  if (typeUrl != QueryMissCounterRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryMissCounterResponseConverter : ProtobufConverter<QueryMissCounterResponse>

public fun QueryMissCounterResponse.toAny(): Any = Any(QueryMissCounterResponse.TYPE_URL,
    with(QueryMissCounterResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryMissCounterResponse>):
    QueryMissCounterResponse {
  if (typeUrl != QueryMissCounterResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregatePrevoteRequestConverter :
    ProtobufConverter<QueryAggregatePrevoteRequest>

public fun QueryAggregatePrevoteRequest.toAny(): Any = Any(QueryAggregatePrevoteRequest.TYPE_URL,
    with(QueryAggregatePrevoteRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregatePrevoteRequest>):
    QueryAggregatePrevoteRequest {
  if (typeUrl != QueryAggregatePrevoteRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregatePrevoteResponseConverter :
    ProtobufConverter<QueryAggregatePrevoteResponse>

public fun QueryAggregatePrevoteResponse.toAny(): Any = Any(QueryAggregatePrevoteResponse.TYPE_URL,
    with(QueryAggregatePrevoteResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregatePrevoteResponse>):
    QueryAggregatePrevoteResponse {
  if (typeUrl != QueryAggregatePrevoteResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregatePrevotesRequestConverter :
    ProtobufConverter<QueryAggregatePrevotesRequest>

public fun QueryAggregatePrevotesRequest.toAny(): Any = Any(QueryAggregatePrevotesRequest.TYPE_URL,
    with(QueryAggregatePrevotesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregatePrevotesRequest>):
    QueryAggregatePrevotesRequest {
  if (typeUrl != QueryAggregatePrevotesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregatePrevotesResponseConverter :
    ProtobufConverter<QueryAggregatePrevotesResponse>

public fun QueryAggregatePrevotesResponse.toAny(): Any =
    Any(QueryAggregatePrevotesResponse.TYPE_URL, with(QueryAggregatePrevotesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregatePrevotesResponse>):
    QueryAggregatePrevotesResponse {
  if (typeUrl != QueryAggregatePrevotesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateVoteRequestConverter :
    ProtobufConverter<QueryAggregateVoteRequest>

public fun QueryAggregateVoteRequest.toAny(): Any = Any(QueryAggregateVoteRequest.TYPE_URL,
    with(QueryAggregateVoteRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateVoteRequest>):
    QueryAggregateVoteRequest {
  if (typeUrl != QueryAggregateVoteRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateVoteResponseConverter :
    ProtobufConverter<QueryAggregateVoteResponse>

public fun QueryAggregateVoteResponse.toAny(): Any = Any(QueryAggregateVoteResponse.TYPE_URL,
    with(QueryAggregateVoteResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateVoteResponse>):
    QueryAggregateVoteResponse {
  if (typeUrl != QueryAggregateVoteResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateVotesRequestConverter :
    ProtobufConverter<QueryAggregateVotesRequest>

public fun QueryAggregateVotesRequest.toAny(): Any = Any(QueryAggregateVotesRequest.TYPE_URL,
    with(QueryAggregateVotesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateVotesRequest>):
    QueryAggregateVotesRequest {
  if (typeUrl != QueryAggregateVotesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateVotesResponseConverter :
    ProtobufConverter<QueryAggregateVotesResponse>

public fun QueryAggregateVotesResponse.toAny(): Any = Any(QueryAggregateVotesResponse.TYPE_URL,
    with(QueryAggregateVotesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateVotesResponse>):
    QueryAggregateVotesResponse {
  if (typeUrl != QueryAggregateVotesResponse.TYPE_URL) throw
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
