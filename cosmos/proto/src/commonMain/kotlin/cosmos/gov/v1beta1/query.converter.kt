// Transform from cosmos/gov/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryProposalRequestConverter : ProtobufConverter<QueryProposalRequest>

public fun QueryProposalRequest.toAny(): Any = Any(QueryProposalRequest.TYPE_URL,
    with(QueryProposalRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryProposalRequest>): QueryProposalRequest {
  if (typeUrl != QueryProposalRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryProposalResponseConverter : ProtobufConverter<QueryProposalResponse>

public fun QueryProposalResponse.toAny(): Any = Any(QueryProposalResponse.TYPE_URL,
    with(QueryProposalResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryProposalResponse>): QueryProposalResponse {
  if (typeUrl != QueryProposalResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryProposalsRequestConverter : ProtobufConverter<QueryProposalsRequest>

public fun QueryProposalsRequest.toAny(): Any = Any(QueryProposalsRequest.TYPE_URL,
    with(QueryProposalsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryProposalsRequest>): QueryProposalsRequest {
  if (typeUrl != QueryProposalsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryProposalsResponseConverter : ProtobufConverter<QueryProposalsResponse>

public fun QueryProposalsResponse.toAny(): Any = Any(QueryProposalsResponse.TYPE_URL,
    with(QueryProposalsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryProposalsResponse>): QueryProposalsResponse {
  if (typeUrl != QueryProposalsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVoteRequestConverter : ProtobufConverter<QueryVoteRequest>

public fun QueryVoteRequest.toAny(): Any = Any(QueryVoteRequest.TYPE_URL,
    with(QueryVoteRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVoteRequest>): QueryVoteRequest {
  if (typeUrl != QueryVoteRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVoteResponseConverter : ProtobufConverter<QueryVoteResponse>

public fun QueryVoteResponse.toAny(): Any = Any(QueryVoteResponse.TYPE_URL,
    with(QueryVoteResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVoteResponse>): QueryVoteResponse {
  if (typeUrl != QueryVoteResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVotesRequestConverter : ProtobufConverter<QueryVotesRequest>

public fun QueryVotesRequest.toAny(): Any = Any(QueryVotesRequest.TYPE_URL,
    with(QueryVotesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVotesRequest>): QueryVotesRequest {
  if (typeUrl != QueryVotesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVotesResponseConverter : ProtobufConverter<QueryVotesResponse>

public fun QueryVotesResponse.toAny(): Any = Any(QueryVotesResponse.TYPE_URL,
    with(QueryVotesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVotesResponse>): QueryVotesResponse {
  if (typeUrl != QueryVotesResponse.TYPE_URL) throw
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

public expect object QueryDepositRequestConverter : ProtobufConverter<QueryDepositRequest>

public fun QueryDepositRequest.toAny(): Any = Any(QueryDepositRequest.TYPE_URL,
    with(QueryDepositRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDepositRequest>): QueryDepositRequest {
  if (typeUrl != QueryDepositRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDepositResponseConverter : ProtobufConverter<QueryDepositResponse>

public fun QueryDepositResponse.toAny(): Any = Any(QueryDepositResponse.TYPE_URL,
    with(QueryDepositResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDepositResponse>): QueryDepositResponse {
  if (typeUrl != QueryDepositResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDepositsRequestConverter : ProtobufConverter<QueryDepositsRequest>

public fun QueryDepositsRequest.toAny(): Any = Any(QueryDepositsRequest.TYPE_URL,
    with(QueryDepositsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDepositsRequest>): QueryDepositsRequest {
  if (typeUrl != QueryDepositsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDepositsResponseConverter : ProtobufConverter<QueryDepositsResponse>

public fun QueryDepositsResponse.toAny(): Any = Any(QueryDepositsResponse.TYPE_URL,
    with(QueryDepositsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDepositsResponse>): QueryDepositsResponse {
  if (typeUrl != QueryDepositsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTallyResultRequestConverter : ProtobufConverter<QueryTallyResultRequest>

public fun QueryTallyResultRequest.toAny(): Any = Any(QueryTallyResultRequest.TYPE_URL,
    with(QueryTallyResultRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTallyResultRequest>):
    QueryTallyResultRequest {
  if (typeUrl != QueryTallyResultRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTallyResultResponseConverter : ProtobufConverter<QueryTallyResultResponse>

public fun QueryTallyResultResponse.toAny(): Any = Any(QueryTallyResultResponse.TYPE_URL,
    with(QueryTallyResultResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTallyResultResponse>):
    QueryTallyResultResponse {
  if (typeUrl != QueryTallyResultResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
