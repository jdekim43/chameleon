// Transform from oracle/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object QueryExchangeRateRequestJvmConverter :
    ProtobufTypeMapper<QueryExchangeRateRequest, QueryOuterClass.QueryExchangeRateRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryExchangeRateRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryExchangeRateRequest> =
      QueryOuterClass.QueryExchangeRateRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryExchangeRateRequest):
      QueryExchangeRateRequest = QueryExchangeRateRequest(
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QueryExchangeRateRequest):
      QueryOuterClass.QueryExchangeRateRequest {
    val builder = QueryOuterClass.QueryExchangeRateRequest.newBuilder()
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QueryExchangeRateResponseJvmConverter :
    ProtobufTypeMapper<QueryExchangeRateResponse, QueryOuterClass.QueryExchangeRateResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryExchangeRateResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryExchangeRateResponse> =
      QueryOuterClass.QueryExchangeRateResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryExchangeRateResponse):
      QueryExchangeRateResponse = QueryExchangeRateResponse(
  	oracleExchangeRate = OracleExchangeRateJvmConverter.convert(obj.getOracleExchangeRate()),
  )

  public override fun convert(obj: QueryExchangeRateResponse):
      QueryOuterClass.QueryExchangeRateResponse {
    val builder = QueryOuterClass.QueryExchangeRateResponse.newBuilder()
    builder.setOracleExchangeRate(OracleExchangeRateJvmConverter.convert(obj.oracleExchangeRate))
    return builder.build()
  }
}

public object QueryExchangeRatesRequestJvmConverter :
    ProtobufTypeMapper<QueryExchangeRatesRequest, QueryOuterClass.QueryExchangeRatesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryExchangeRatesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryExchangeRatesRequest> =
      QueryOuterClass.QueryExchangeRatesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryExchangeRatesRequest):
      QueryExchangeRatesRequest = QueryExchangeRatesRequest(
  )

  public override fun convert(obj: QueryExchangeRatesRequest):
      QueryOuterClass.QueryExchangeRatesRequest {
    val builder = QueryOuterClass.QueryExchangeRatesRequest.newBuilder()
    return builder.build()
  }
}

public object DenomOracleExchangeRatePairJvmConverter :
    ProtobufTypeMapper<DenomOracleExchangeRatePair, QueryOuterClass.DenomOracleExchangeRatePair> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.DenomOracleExchangeRatePair.getDescriptor()

  public override val parser: Parser<QueryOuterClass.DenomOracleExchangeRatePair> =
      QueryOuterClass.DenomOracleExchangeRatePair.parser()

  public override fun convert(obj: QueryOuterClass.DenomOracleExchangeRatePair):
      DenomOracleExchangeRatePair = DenomOracleExchangeRatePair(
  	denom = obj.getDenom(),
  	oracleExchangeRate = OracleExchangeRateJvmConverter.convert(obj.getOracleExchangeRate()),
  )

  public override fun convert(obj: DenomOracleExchangeRatePair):
      QueryOuterClass.DenomOracleExchangeRatePair {
    val builder = QueryOuterClass.DenomOracleExchangeRatePair.newBuilder()
    builder.setDenom(obj.denom)
    builder.setOracleExchangeRate(OracleExchangeRateJvmConverter.convert(obj.oracleExchangeRate))
    return builder.build()
  }
}

public object QueryExchangeRatesResponseJvmConverter :
    ProtobufTypeMapper<QueryExchangeRatesResponse, QueryOuterClass.QueryExchangeRatesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryExchangeRatesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryExchangeRatesResponse> =
      QueryOuterClass.QueryExchangeRatesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryExchangeRatesResponse):
      QueryExchangeRatesResponse = QueryExchangeRatesResponse(
  	denomOracleExchangeRatePairs = obj.getDenomOracleExchangeRatePairsList().map {
      DenomOracleExchangeRatePairJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryExchangeRatesResponse):
      QueryOuterClass.QueryExchangeRatesResponse {
    val builder = QueryOuterClass.QueryExchangeRatesResponse.newBuilder()
    builder.addAllDenomOracleExchangeRatePairs(obj.denomOracleExchangeRatePairs.map {
        DenomOracleExchangeRatePairJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryActivesRequestJvmConverter :
    ProtobufTypeMapper<QueryActivesRequest, QueryOuterClass.QueryActivesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryActivesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryActivesRequest> =
      QueryOuterClass.QueryActivesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryActivesRequest): QueryActivesRequest =
      QueryActivesRequest(
  )

  public override fun convert(obj: QueryActivesRequest): QueryOuterClass.QueryActivesRequest {
    val builder = QueryOuterClass.QueryActivesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryActivesResponseJvmConverter :
    ProtobufTypeMapper<QueryActivesResponse, QueryOuterClass.QueryActivesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryActivesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryActivesResponse> =
      QueryOuterClass.QueryActivesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryActivesResponse): QueryActivesResponse =
      QueryActivesResponse(
  	actives = obj.getActivesList().map { it },
  )

  public override fun convert(obj: QueryActivesResponse): QueryOuterClass.QueryActivesResponse {
    val builder = QueryOuterClass.QueryActivesResponse.newBuilder()
    builder.addAllActives(obj.actives.map { it })
    return builder.build()
  }
}

public object QueryVoteTargetsRequestJvmConverter :
    ProtobufTypeMapper<QueryVoteTargetsRequest, QueryOuterClass.QueryVoteTargetsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVoteTargetsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVoteTargetsRequest> =
      QueryOuterClass.QueryVoteTargetsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryVoteTargetsRequest): QueryVoteTargetsRequest
      = QueryVoteTargetsRequest(
  )

  public override fun convert(obj: QueryVoteTargetsRequest):
      QueryOuterClass.QueryVoteTargetsRequest {
    val builder = QueryOuterClass.QueryVoteTargetsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryVoteTargetsResponseJvmConverter :
    ProtobufTypeMapper<QueryVoteTargetsResponse, QueryOuterClass.QueryVoteTargetsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVoteTargetsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVoteTargetsResponse> =
      QueryOuterClass.QueryVoteTargetsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryVoteTargetsResponse):
      QueryVoteTargetsResponse = QueryVoteTargetsResponse(
  	voteTargets = obj.getVoteTargetsList().map { it },
  )

  public override fun convert(obj: QueryVoteTargetsResponse):
      QueryOuterClass.QueryVoteTargetsResponse {
    val builder = QueryOuterClass.QueryVoteTargetsResponse.newBuilder()
    builder.addAllVoteTargets(obj.voteTargets.map { it })
    return builder.build()
  }
}

public object QueryPriceSnapshotHistoryRequestJvmConverter :
    ProtobufTypeMapper<QueryPriceSnapshotHistoryRequest, QueryOuterClass.QueryPriceSnapshotHistoryRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPriceSnapshotHistoryRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPriceSnapshotHistoryRequest> =
      QueryOuterClass.QueryPriceSnapshotHistoryRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryPriceSnapshotHistoryRequest):
      QueryPriceSnapshotHistoryRequest = QueryPriceSnapshotHistoryRequest(
  )

  public override fun convert(obj: QueryPriceSnapshotHistoryRequest):
      QueryOuterClass.QueryPriceSnapshotHistoryRequest {
    val builder = QueryOuterClass.QueryPriceSnapshotHistoryRequest.newBuilder()
    return builder.build()
  }
}

public object QueryPriceSnapshotHistoryResponseJvmConverter :
    ProtobufTypeMapper<QueryPriceSnapshotHistoryResponse, QueryOuterClass.QueryPriceSnapshotHistoryResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPriceSnapshotHistoryResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPriceSnapshotHistoryResponse> =
      QueryOuterClass.QueryPriceSnapshotHistoryResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryPriceSnapshotHistoryResponse):
      QueryPriceSnapshotHistoryResponse = QueryPriceSnapshotHistoryResponse(
  	priceSnapshots = obj.getPriceSnapshotsList().map { PriceSnapshotJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryPriceSnapshotHistoryResponse):
      QueryOuterClass.QueryPriceSnapshotHistoryResponse {
    val builder = QueryOuterClass.QueryPriceSnapshotHistoryResponse.newBuilder()
    builder.addAllPriceSnapshots(obj.priceSnapshots.map { PriceSnapshotJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryTwapsRequestJvmConverter :
    ProtobufTypeMapper<QueryTwapsRequest, QueryOuterClass.QueryTwapsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTwapsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTwapsRequest> =
      QueryOuterClass.QueryTwapsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTwapsRequest): QueryTwapsRequest =
      QueryTwapsRequest(
  	lookbackSeconds = obj.getLookbackSeconds().asKotlinType,
  )

  public override fun convert(obj: QueryTwapsRequest): QueryOuterClass.QueryTwapsRequest {
    val builder = QueryOuterClass.QueryTwapsRequest.newBuilder()
    builder.setLookbackSeconds(obj.lookbackSeconds.asJavaType)
    return builder.build()
  }
}

public object QueryTwapsResponseJvmConverter :
    ProtobufTypeMapper<QueryTwapsResponse, QueryOuterClass.QueryTwapsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTwapsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTwapsResponse> =
      QueryOuterClass.QueryTwapsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTwapsResponse): QueryTwapsResponse =
      QueryTwapsResponse(
  	oracleTwaps = obj.getOracleTwapsList().map { OracleTwapJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryTwapsResponse): QueryOuterClass.QueryTwapsResponse {
    val builder = QueryOuterClass.QueryTwapsResponse.newBuilder()
    builder.addAllOracleTwaps(obj.oracleTwaps.map { OracleTwapJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryFeederDelegationRequestJvmConverter :
    ProtobufTypeMapper<QueryFeederDelegationRequest, QueryOuterClass.QueryFeederDelegationRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeederDelegationRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeederDelegationRequest> =
      QueryOuterClass.QueryFeederDelegationRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeederDelegationRequest):
      QueryFeederDelegationRequest = QueryFeederDelegationRequest(
  	validatorAddr = obj.getValidatorAddr(),
  )

  public override fun convert(obj: QueryFeederDelegationRequest):
      QueryOuterClass.QueryFeederDelegationRequest {
    val builder = QueryOuterClass.QueryFeederDelegationRequest.newBuilder()
    builder.setValidatorAddr(obj.validatorAddr)
    return builder.build()
  }
}

public object QueryFeederDelegationResponseJvmConverter :
    ProtobufTypeMapper<QueryFeederDelegationResponse, QueryOuterClass.QueryFeederDelegationResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeederDelegationResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeederDelegationResponse> =
      QueryOuterClass.QueryFeederDelegationResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeederDelegationResponse):
      QueryFeederDelegationResponse = QueryFeederDelegationResponse(
  	feederAddr = obj.getFeederAddr(),
  )

  public override fun convert(obj: QueryFeederDelegationResponse):
      QueryOuterClass.QueryFeederDelegationResponse {
    val builder = QueryOuterClass.QueryFeederDelegationResponse.newBuilder()
    builder.setFeederAddr(obj.feederAddr)
    return builder.build()
  }
}

public object QueryVotePenaltyCounterRequestJvmConverter :
    ProtobufTypeMapper<QueryVotePenaltyCounterRequest, QueryOuterClass.QueryVotePenaltyCounterRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVotePenaltyCounterRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVotePenaltyCounterRequest> =
      QueryOuterClass.QueryVotePenaltyCounterRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryVotePenaltyCounterRequest):
      QueryVotePenaltyCounterRequest = QueryVotePenaltyCounterRequest(
  	validatorAddr = obj.getValidatorAddr(),
  )

  public override fun convert(obj: QueryVotePenaltyCounterRequest):
      QueryOuterClass.QueryVotePenaltyCounterRequest {
    val builder = QueryOuterClass.QueryVotePenaltyCounterRequest.newBuilder()
    builder.setValidatorAddr(obj.validatorAddr)
    return builder.build()
  }
}

public object QueryVotePenaltyCounterResponseJvmConverter :
    ProtobufTypeMapper<QueryVotePenaltyCounterResponse, QueryOuterClass.QueryVotePenaltyCounterResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVotePenaltyCounterResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVotePenaltyCounterResponse> =
      QueryOuterClass.QueryVotePenaltyCounterResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryVotePenaltyCounterResponse):
      QueryVotePenaltyCounterResponse = QueryVotePenaltyCounterResponse(
  	votePenaltyCounter = VotePenaltyCounterJvmConverter.convert(obj.getVotePenaltyCounter()),
  )

  public override fun convert(obj: QueryVotePenaltyCounterResponse):
      QueryOuterClass.QueryVotePenaltyCounterResponse {
    val builder = QueryOuterClass.QueryVotePenaltyCounterResponse.newBuilder()
    builder.setVotePenaltyCounter(VotePenaltyCounterJvmConverter.convert(obj.votePenaltyCounter))
    return builder.build()
  }
}

public object QuerySlashWindowRequestJvmConverter :
    ProtobufTypeMapper<QuerySlashWindowRequest, QueryOuterClass.QuerySlashWindowRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySlashWindowRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySlashWindowRequest> =
      QueryOuterClass.QuerySlashWindowRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySlashWindowRequest): QuerySlashWindowRequest
      = QuerySlashWindowRequest(
  )

  public override fun convert(obj: QuerySlashWindowRequest):
      QueryOuterClass.QuerySlashWindowRequest {
    val builder = QueryOuterClass.QuerySlashWindowRequest.newBuilder()
    return builder.build()
  }
}

public object QuerySlashWindowResponseJvmConverter :
    ProtobufTypeMapper<QuerySlashWindowResponse, QueryOuterClass.QuerySlashWindowResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySlashWindowResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySlashWindowResponse> =
      QueryOuterClass.QuerySlashWindowResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySlashWindowResponse):
      QuerySlashWindowResponse = QuerySlashWindowResponse(
  	windowProgress = obj.getWindowProgress().asKotlinType,
  )

  public override fun convert(obj: QuerySlashWindowResponse):
      QueryOuterClass.QuerySlashWindowResponse {
    val builder = QueryOuterClass.QuerySlashWindowResponse.newBuilder()
    builder.setWindowProgress(obj.windowProgress.asJavaType)
    return builder.build()
  }
}

public object QueryParamsRequestJvmConverter :
    ProtobufTypeMapper<QueryParamsRequest, QueryOuterClass.QueryParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsRequest> =
      QueryOuterClass.QueryParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsRequest): QueryParamsRequest =
      QueryParamsRequest(
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryParamsResponseJvmConverter :
    ProtobufTypeMapper<QueryParamsResponse, QueryOuterClass.QueryParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsResponse> =
      QueryOuterClass.QueryParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsResponse): QueryParamsResponse =
      QueryParamsResponse(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}
