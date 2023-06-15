// Transform from cosmos/gov/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryProposalRequestConverter : ProtobufConverter<QueryProposalRequest> by
    QueryProposalRequestJvmConverter

public actual object QueryProposalResponseConverter : ProtobufConverter<QueryProposalResponse> by
    QueryProposalResponseJvmConverter

public actual object QueryProposalsRequestConverter : ProtobufConverter<QueryProposalsRequest> by
    QueryProposalsRequestJvmConverter

public actual object QueryProposalsResponseConverter : ProtobufConverter<QueryProposalsResponse> by
    QueryProposalsResponseJvmConverter

public actual object QueryVoteRequestConverter : ProtobufConverter<QueryVoteRequest> by
    QueryVoteRequestJvmConverter

public actual object QueryVoteResponseConverter : ProtobufConverter<QueryVoteResponse> by
    QueryVoteResponseJvmConverter

public actual object QueryVotesRequestConverter : ProtobufConverter<QueryVotesRequest> by
    QueryVotesRequestJvmConverter

public actual object QueryVotesResponseConverter : ProtobufConverter<QueryVotesResponse> by
    QueryVotesResponseJvmConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryDepositRequestConverter : ProtobufConverter<QueryDepositRequest> by
    QueryDepositRequestJvmConverter

public actual object QueryDepositResponseConverter : ProtobufConverter<QueryDepositResponse> by
    QueryDepositResponseJvmConverter

public actual object QueryDepositsRequestConverter : ProtobufConverter<QueryDepositsRequest> by
    QueryDepositsRequestJvmConverter

public actual object QueryDepositsResponseConverter : ProtobufConverter<QueryDepositsResponse> by
    QueryDepositsResponseJvmConverter

public actual object QueryTallyResultRequestConverter : ProtobufConverter<QueryTallyResultRequest>
    by QueryTallyResultRequestJvmConverter

public actual object QueryTallyResultResponseConverter : ProtobufConverter<QueryTallyResultResponse>
    by QueryTallyResultResponseJvmConverter
