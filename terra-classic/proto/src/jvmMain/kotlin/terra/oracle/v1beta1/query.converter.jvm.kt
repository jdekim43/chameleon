// Transform from terra/oracle/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.DecCoinJvmConverter
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
  	exchangeRate = obj.getExchangeRate(),
  )

  public override fun convert(obj: QueryExchangeRateResponse):
      QueryOuterClass.QueryExchangeRateResponse {
    val builder = QueryOuterClass.QueryExchangeRateResponse.newBuilder()
    builder.setExchangeRate(obj.exchangeRate)
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

public object QueryExchangeRatesResponseJvmConverter :
    ProtobufTypeMapper<QueryExchangeRatesResponse, QueryOuterClass.QueryExchangeRatesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryExchangeRatesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryExchangeRatesResponse> =
      QueryOuterClass.QueryExchangeRatesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryExchangeRatesResponse):
      QueryExchangeRatesResponse = QueryExchangeRatesResponse(
  	exchangeRates = obj.getExchangeRatesList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryExchangeRatesResponse):
      QueryOuterClass.QueryExchangeRatesResponse {
    val builder = QueryOuterClass.QueryExchangeRatesResponse.newBuilder()
    builder.addAllExchangeRates(obj.exchangeRates.map { DecCoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryTobinTaxRequestJvmConverter :
    ProtobufTypeMapper<QueryTobinTaxRequest, QueryOuterClass.QueryTobinTaxRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTobinTaxRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTobinTaxRequest> =
      QueryOuterClass.QueryTobinTaxRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTobinTaxRequest): QueryTobinTaxRequest =
      QueryTobinTaxRequest(
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QueryTobinTaxRequest): QueryOuterClass.QueryTobinTaxRequest {
    val builder = QueryOuterClass.QueryTobinTaxRequest.newBuilder()
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QueryTobinTaxResponseJvmConverter :
    ProtobufTypeMapper<QueryTobinTaxResponse, QueryOuterClass.QueryTobinTaxResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTobinTaxResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTobinTaxResponse> =
      QueryOuterClass.QueryTobinTaxResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTobinTaxResponse): QueryTobinTaxResponse =
      QueryTobinTaxResponse(
  	tobinTax = obj.getTobinTax(),
  )

  public override fun convert(obj: QueryTobinTaxResponse): QueryOuterClass.QueryTobinTaxResponse {
    val builder = QueryOuterClass.QueryTobinTaxResponse.newBuilder()
    builder.setTobinTax(obj.tobinTax)
    return builder.build()
  }
}

public object QueryTobinTaxesRequestJvmConverter :
    ProtobufTypeMapper<QueryTobinTaxesRequest, QueryOuterClass.QueryTobinTaxesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTobinTaxesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTobinTaxesRequest> =
      QueryOuterClass.QueryTobinTaxesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTobinTaxesRequest): QueryTobinTaxesRequest =
      QueryTobinTaxesRequest(
  )

  public override fun convert(obj: QueryTobinTaxesRequest): QueryOuterClass.QueryTobinTaxesRequest {
    val builder = QueryOuterClass.QueryTobinTaxesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryTobinTaxesResponseJvmConverter :
    ProtobufTypeMapper<QueryTobinTaxesResponse, QueryOuterClass.QueryTobinTaxesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTobinTaxesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTobinTaxesResponse> =
      QueryOuterClass.QueryTobinTaxesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTobinTaxesResponse): QueryTobinTaxesResponse
      = QueryTobinTaxesResponse(
  	tobinTaxes = obj.getTobinTaxesList().map { DenomJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryTobinTaxesResponse):
      QueryOuterClass.QueryTobinTaxesResponse {
    val builder = QueryOuterClass.QueryTobinTaxesResponse.newBuilder()
    builder.addAllTobinTaxes(obj.tobinTaxes.map { DenomJvmConverter.convert(it) })
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

public object QueryMissCounterRequestJvmConverter :
    ProtobufTypeMapper<QueryMissCounterRequest, QueryOuterClass.QueryMissCounterRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryMissCounterRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryMissCounterRequest> =
      QueryOuterClass.QueryMissCounterRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryMissCounterRequest): QueryMissCounterRequest
      = QueryMissCounterRequest(
  	validatorAddr = obj.getValidatorAddr(),
  )

  public override fun convert(obj: QueryMissCounterRequest):
      QueryOuterClass.QueryMissCounterRequest {
    val builder = QueryOuterClass.QueryMissCounterRequest.newBuilder()
    builder.setValidatorAddr(obj.validatorAddr)
    return builder.build()
  }
}

public object QueryMissCounterResponseJvmConverter :
    ProtobufTypeMapper<QueryMissCounterResponse, QueryOuterClass.QueryMissCounterResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryMissCounterResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryMissCounterResponse> =
      QueryOuterClass.QueryMissCounterResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryMissCounterResponse):
      QueryMissCounterResponse = QueryMissCounterResponse(
  	missCounter = obj.getMissCounter().asKotlinType,
  )

  public override fun convert(obj: QueryMissCounterResponse):
      QueryOuterClass.QueryMissCounterResponse {
    val builder = QueryOuterClass.QueryMissCounterResponse.newBuilder()
    builder.setMissCounter(obj.missCounter.asJavaType)
    return builder.build()
  }
}

public object QueryAggregatePrevoteRequestJvmConverter :
    ProtobufTypeMapper<QueryAggregatePrevoteRequest, QueryOuterClass.QueryAggregatePrevoteRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregatePrevoteRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregatePrevoteRequest> =
      QueryOuterClass.QueryAggregatePrevoteRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregatePrevoteRequest):
      QueryAggregatePrevoteRequest = QueryAggregatePrevoteRequest(
  	validatorAddr = obj.getValidatorAddr(),
  )

  public override fun convert(obj: QueryAggregatePrevoteRequest):
      QueryOuterClass.QueryAggregatePrevoteRequest {
    val builder = QueryOuterClass.QueryAggregatePrevoteRequest.newBuilder()
    builder.setValidatorAddr(obj.validatorAddr)
    return builder.build()
  }
}

public object QueryAggregatePrevoteResponseJvmConverter :
    ProtobufTypeMapper<QueryAggregatePrevoteResponse, QueryOuterClass.QueryAggregatePrevoteResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregatePrevoteResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregatePrevoteResponse> =
      QueryOuterClass.QueryAggregatePrevoteResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregatePrevoteResponse):
      QueryAggregatePrevoteResponse = QueryAggregatePrevoteResponse(
  	aggregatePrevote = AggregateExchangeRatePrevoteJvmConverter.convert(obj.getAggregatePrevote()),
  )

  public override fun convert(obj: QueryAggregatePrevoteResponse):
      QueryOuterClass.QueryAggregatePrevoteResponse {
    val builder = QueryOuterClass.QueryAggregatePrevoteResponse.newBuilder()
    builder.setAggregatePrevote(AggregateExchangeRatePrevoteJvmConverter.convert(obj.aggregatePrevote))
    return builder.build()
  }
}

public object QueryAggregatePrevotesRequestJvmConverter :
    ProtobufTypeMapper<QueryAggregatePrevotesRequest, QueryOuterClass.QueryAggregatePrevotesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregatePrevotesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregatePrevotesRequest> =
      QueryOuterClass.QueryAggregatePrevotesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregatePrevotesRequest):
      QueryAggregatePrevotesRequest = QueryAggregatePrevotesRequest(
  )

  public override fun convert(obj: QueryAggregatePrevotesRequest):
      QueryOuterClass.QueryAggregatePrevotesRequest {
    val builder = QueryOuterClass.QueryAggregatePrevotesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryAggregatePrevotesResponseJvmConverter :
    ProtobufTypeMapper<QueryAggregatePrevotesResponse, QueryOuterClass.QueryAggregatePrevotesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregatePrevotesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregatePrevotesResponse> =
      QueryOuterClass.QueryAggregatePrevotesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregatePrevotesResponse):
      QueryAggregatePrevotesResponse = QueryAggregatePrevotesResponse(
  	aggregatePrevotes = obj.getAggregatePrevotesList().map {
      AggregateExchangeRatePrevoteJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryAggregatePrevotesResponse):
      QueryOuterClass.QueryAggregatePrevotesResponse {
    val builder = QueryOuterClass.QueryAggregatePrevotesResponse.newBuilder()
    builder.addAllAggregatePrevotes(obj.aggregatePrevotes.map {
        AggregateExchangeRatePrevoteJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryAggregateVoteRequestJvmConverter :
    ProtobufTypeMapper<QueryAggregateVoteRequest, QueryOuterClass.QueryAggregateVoteRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateVoteRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateVoteRequest> =
      QueryOuterClass.QueryAggregateVoteRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateVoteRequest):
      QueryAggregateVoteRequest = QueryAggregateVoteRequest(
  	validatorAddr = obj.getValidatorAddr(),
  )

  public override fun convert(obj: QueryAggregateVoteRequest):
      QueryOuterClass.QueryAggregateVoteRequest {
    val builder = QueryOuterClass.QueryAggregateVoteRequest.newBuilder()
    builder.setValidatorAddr(obj.validatorAddr)
    return builder.build()
  }
}

public object QueryAggregateVoteResponseJvmConverter :
    ProtobufTypeMapper<QueryAggregateVoteResponse, QueryOuterClass.QueryAggregateVoteResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateVoteResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateVoteResponse> =
      QueryOuterClass.QueryAggregateVoteResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateVoteResponse):
      QueryAggregateVoteResponse = QueryAggregateVoteResponse(
  	aggregateVote = AggregateExchangeRateVoteJvmConverter.convert(obj.getAggregateVote()),
  )

  public override fun convert(obj: QueryAggregateVoteResponse):
      QueryOuterClass.QueryAggregateVoteResponse {
    val builder = QueryOuterClass.QueryAggregateVoteResponse.newBuilder()
    builder.setAggregateVote(AggregateExchangeRateVoteJvmConverter.convert(obj.aggregateVote))
    return builder.build()
  }
}

public object QueryAggregateVotesRequestJvmConverter :
    ProtobufTypeMapper<QueryAggregateVotesRequest, QueryOuterClass.QueryAggregateVotesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateVotesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateVotesRequest> =
      QueryOuterClass.QueryAggregateVotesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateVotesRequest):
      QueryAggregateVotesRequest = QueryAggregateVotesRequest(
  )

  public override fun convert(obj: QueryAggregateVotesRequest):
      QueryOuterClass.QueryAggregateVotesRequest {
    val builder = QueryOuterClass.QueryAggregateVotesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryAggregateVotesResponseJvmConverter :
    ProtobufTypeMapper<QueryAggregateVotesResponse, QueryOuterClass.QueryAggregateVotesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateVotesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateVotesResponse> =
      QueryOuterClass.QueryAggregateVotesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateVotesResponse):
      QueryAggregateVotesResponse = QueryAggregateVotesResponse(
  	aggregateVotes = obj.getAggregateVotesList().map {
      AggregateExchangeRateVoteJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryAggregateVotesResponse):
      QueryOuterClass.QueryAggregateVotesResponse {
    val builder = QueryOuterClass.QueryAggregateVotesResponse.newBuilder()
    builder.addAllAggregateVotes(obj.aggregateVotes.map {
        AggregateExchangeRateVoteJvmConverter.convert(it) })
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
