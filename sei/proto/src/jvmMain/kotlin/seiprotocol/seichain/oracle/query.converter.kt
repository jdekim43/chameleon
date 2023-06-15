// Transform from oracle/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryExchangeRateRequestConverter : ProtobufConverter<QueryExchangeRateRequest>
    by QueryExchangeRateRequestJvmConverter

public actual object QueryExchangeRateResponseConverter :
    ProtobufConverter<QueryExchangeRateResponse> by QueryExchangeRateResponseJvmConverter

public actual object QueryExchangeRatesRequestConverter :
    ProtobufConverter<QueryExchangeRatesRequest> by QueryExchangeRatesRequestJvmConverter

public actual object DenomOracleExchangeRatePairConverter :
    ProtobufConverter<DenomOracleExchangeRatePair> by DenomOracleExchangeRatePairJvmConverter

public actual object QueryExchangeRatesResponseConverter :
    ProtobufConverter<QueryExchangeRatesResponse> by QueryExchangeRatesResponseJvmConverter

public actual object QueryActivesRequestConverter : ProtobufConverter<QueryActivesRequest> by
    QueryActivesRequestJvmConverter

public actual object QueryActivesResponseConverter : ProtobufConverter<QueryActivesResponse> by
    QueryActivesResponseJvmConverter

public actual object QueryVoteTargetsRequestConverter : ProtobufConverter<QueryVoteTargetsRequest>
    by QueryVoteTargetsRequestJvmConverter

public actual object QueryVoteTargetsResponseConverter : ProtobufConverter<QueryVoteTargetsResponse>
    by QueryVoteTargetsResponseJvmConverter

public actual object QueryPriceSnapshotHistoryRequestConverter :
    ProtobufConverter<QueryPriceSnapshotHistoryRequest> by
    QueryPriceSnapshotHistoryRequestJvmConverter

public actual object QueryPriceSnapshotHistoryResponseConverter :
    ProtobufConverter<QueryPriceSnapshotHistoryResponse> by
    QueryPriceSnapshotHistoryResponseJvmConverter

public actual object QueryTwapsRequestConverter : ProtobufConverter<QueryTwapsRequest> by
    QueryTwapsRequestJvmConverter

public actual object QueryTwapsResponseConverter : ProtobufConverter<QueryTwapsResponse> by
    QueryTwapsResponseJvmConverter

public actual object QueryFeederDelegationRequestConverter :
    ProtobufConverter<QueryFeederDelegationRequest> by QueryFeederDelegationRequestJvmConverter

public actual object QueryFeederDelegationResponseConverter :
    ProtobufConverter<QueryFeederDelegationResponse> by QueryFeederDelegationResponseJvmConverter

public actual object QueryVotePenaltyCounterRequestConverter :
    ProtobufConverter<QueryVotePenaltyCounterRequest> by QueryVotePenaltyCounterRequestJvmConverter

public actual object QueryVotePenaltyCounterResponseConverter :
    ProtobufConverter<QueryVotePenaltyCounterResponse> by
    QueryVotePenaltyCounterResponseJvmConverter

public actual object QuerySlashWindowRequestConverter : ProtobufConverter<QuerySlashWindowRequest>
    by QuerySlashWindowRequestJvmConverter

public actual object QuerySlashWindowResponseConverter : ProtobufConverter<QuerySlashWindowResponse>
    by QuerySlashWindowResponseJvmConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter
