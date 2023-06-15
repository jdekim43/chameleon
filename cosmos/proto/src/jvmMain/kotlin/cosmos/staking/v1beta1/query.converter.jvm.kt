// Transform from cosmos/staking/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryValidatorsRequestJvmConverter :
    ProtobufTypeMapper<QueryValidatorsRequest, QueryOuterClass.QueryValidatorsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorsRequest> =
      QueryOuterClass.QueryValidatorsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorsRequest): QueryValidatorsRequest =
      QueryValidatorsRequest(
  	status = obj.getStatus(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryValidatorsRequest): QueryOuterClass.QueryValidatorsRequest {
    val builder = QueryOuterClass.QueryValidatorsRequest.newBuilder()
    builder.setStatus(obj.status)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryValidatorsResponseJvmConverter :
    ProtobufTypeMapper<QueryValidatorsResponse, QueryOuterClass.QueryValidatorsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorsResponse> =
      QueryOuterClass.QueryValidatorsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorsResponse): QueryValidatorsResponse
      = QueryValidatorsResponse(
  	validators = obj.getValidatorsList().map { ValidatorJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryValidatorsResponse):
      QueryOuterClass.QueryValidatorsResponse {
    val builder = QueryOuterClass.QueryValidatorsResponse.newBuilder()
    builder.addAllValidators(obj.validators.map { ValidatorJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryValidatorRequestJvmConverter :
    ProtobufTypeMapper<QueryValidatorRequest, QueryOuterClass.QueryValidatorRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorRequest> =
      QueryOuterClass.QueryValidatorRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorRequest): QueryValidatorRequest =
      QueryValidatorRequest(
  	validatorAddr = obj.getValidatorAddr(),
  )

  public override fun convert(obj: QueryValidatorRequest): QueryOuterClass.QueryValidatorRequest {
    val builder = QueryOuterClass.QueryValidatorRequest.newBuilder()
    builder.setValidatorAddr(obj.validatorAddr)
    return builder.build()
  }
}

public object QueryValidatorResponseJvmConverter :
    ProtobufTypeMapper<QueryValidatorResponse, QueryOuterClass.QueryValidatorResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorResponse> =
      QueryOuterClass.QueryValidatorResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorResponse): QueryValidatorResponse =
      QueryValidatorResponse(
  	validator = ValidatorJvmConverter.convert(obj.getValidator()),
  )

  public override fun convert(obj: QueryValidatorResponse): QueryOuterClass.QueryValidatorResponse {
    val builder = QueryOuterClass.QueryValidatorResponse.newBuilder()
    builder.setValidator(ValidatorJvmConverter.convert(obj.validator))
    return builder.build()
  }
}

public object QueryValidatorDelegationsRequestJvmConverter :
    ProtobufTypeMapper<QueryValidatorDelegationsRequest, QueryOuterClass.QueryValidatorDelegationsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorDelegationsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorDelegationsRequest> =
      QueryOuterClass.QueryValidatorDelegationsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorDelegationsRequest):
      QueryValidatorDelegationsRequest = QueryValidatorDelegationsRequest(
  	validatorAddr = obj.getValidatorAddr(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryValidatorDelegationsRequest):
      QueryOuterClass.QueryValidatorDelegationsRequest {
    val builder = QueryOuterClass.QueryValidatorDelegationsRequest.newBuilder()
    builder.setValidatorAddr(obj.validatorAddr)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryValidatorDelegationsResponseJvmConverter :
    ProtobufTypeMapper<QueryValidatorDelegationsResponse, QueryOuterClass.QueryValidatorDelegationsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorDelegationsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorDelegationsResponse> =
      QueryOuterClass.QueryValidatorDelegationsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorDelegationsResponse):
      QueryValidatorDelegationsResponse = QueryValidatorDelegationsResponse(
  	delegationResponses = obj.getDelegationResponsesList().map {
      DelegationResponseJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryValidatorDelegationsResponse):
      QueryOuterClass.QueryValidatorDelegationsResponse {
    val builder = QueryOuterClass.QueryValidatorDelegationsResponse.newBuilder()
    builder.addAllDelegationResponses(obj.delegationResponses.map {
        DelegationResponseJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryValidatorUnbondingDelegationsRequestJvmConverter :
    ProtobufTypeMapper<QueryValidatorUnbondingDelegationsRequest, QueryOuterClass.QueryValidatorUnbondingDelegationsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorUnbondingDelegationsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorUnbondingDelegationsRequest> =
      QueryOuterClass.QueryValidatorUnbondingDelegationsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorUnbondingDelegationsRequest):
      QueryValidatorUnbondingDelegationsRequest = QueryValidatorUnbondingDelegationsRequest(
  	validatorAddr = obj.getValidatorAddr(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryValidatorUnbondingDelegationsRequest):
      QueryOuterClass.QueryValidatorUnbondingDelegationsRequest {
    val builder = QueryOuterClass.QueryValidatorUnbondingDelegationsRequest.newBuilder()
    builder.setValidatorAddr(obj.validatorAddr)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryValidatorUnbondingDelegationsResponseJvmConverter :
    ProtobufTypeMapper<QueryValidatorUnbondingDelegationsResponse, QueryOuterClass.QueryValidatorUnbondingDelegationsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorUnbondingDelegationsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorUnbondingDelegationsResponse> =
      QueryOuterClass.QueryValidatorUnbondingDelegationsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorUnbondingDelegationsResponse):
      QueryValidatorUnbondingDelegationsResponse = QueryValidatorUnbondingDelegationsResponse(
  	unbondingResponses = obj.getUnbondingResponsesList().map {
      UnbondingDelegationJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryValidatorUnbondingDelegationsResponse):
      QueryOuterClass.QueryValidatorUnbondingDelegationsResponse {
    val builder = QueryOuterClass.QueryValidatorUnbondingDelegationsResponse.newBuilder()
    builder.addAllUnbondingResponses(obj.unbondingResponses.map {
        UnbondingDelegationJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryDelegationRequestJvmConverter :
    ProtobufTypeMapper<QueryDelegationRequest, QueryOuterClass.QueryDelegationRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegationRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegationRequest> =
      QueryOuterClass.QueryDelegationRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegationRequest): QueryDelegationRequest =
      QueryDelegationRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	validatorAddr = obj.getValidatorAddr(),
  )

  public override fun convert(obj: QueryDelegationRequest): QueryOuterClass.QueryDelegationRequest {
    val builder = QueryOuterClass.QueryDelegationRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setValidatorAddr(obj.validatorAddr)
    return builder.build()
  }
}

public object QueryDelegationResponseJvmConverter :
    ProtobufTypeMapper<QueryDelegationResponse, QueryOuterClass.QueryDelegationResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegationResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegationResponse> =
      QueryOuterClass.QueryDelegationResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegationResponse): QueryDelegationResponse
      = QueryDelegationResponse(
  	delegationResponse = DelegationResponseJvmConverter.convert(obj.getDelegationResponse()),
  )

  public override fun convert(obj: QueryDelegationResponse):
      QueryOuterClass.QueryDelegationResponse {
    val builder = QueryOuterClass.QueryDelegationResponse.newBuilder()
    builder.setDelegationResponse(DelegationResponseJvmConverter.convert(obj.delegationResponse))
    return builder.build()
  }
}

public object QueryUnbondingDelegationRequestJvmConverter :
    ProtobufTypeMapper<QueryUnbondingDelegationRequest, QueryOuterClass.QueryUnbondingDelegationRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryUnbondingDelegationRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryUnbondingDelegationRequest> =
      QueryOuterClass.QueryUnbondingDelegationRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryUnbondingDelegationRequest):
      QueryUnbondingDelegationRequest = QueryUnbondingDelegationRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	validatorAddr = obj.getValidatorAddr(),
  )

  public override fun convert(obj: QueryUnbondingDelegationRequest):
      QueryOuterClass.QueryUnbondingDelegationRequest {
    val builder = QueryOuterClass.QueryUnbondingDelegationRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setValidatorAddr(obj.validatorAddr)
    return builder.build()
  }
}

public object QueryUnbondingDelegationResponseJvmConverter :
    ProtobufTypeMapper<QueryUnbondingDelegationResponse, QueryOuterClass.QueryUnbondingDelegationResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryUnbondingDelegationResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryUnbondingDelegationResponse> =
      QueryOuterClass.QueryUnbondingDelegationResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryUnbondingDelegationResponse):
      QueryUnbondingDelegationResponse = QueryUnbondingDelegationResponse(
  	unbond = UnbondingDelegationJvmConverter.convert(obj.getUnbond()),
  )

  public override fun convert(obj: QueryUnbondingDelegationResponse):
      QueryOuterClass.QueryUnbondingDelegationResponse {
    val builder = QueryOuterClass.QueryUnbondingDelegationResponse.newBuilder()
    builder.setUnbond(UnbondingDelegationJvmConverter.convert(obj.unbond))
    return builder.build()
  }
}

public object QueryDelegatorDelegationsRequestJvmConverter :
    ProtobufTypeMapper<QueryDelegatorDelegationsRequest, QueryOuterClass.QueryDelegatorDelegationsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegatorDelegationsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegatorDelegationsRequest> =
      QueryOuterClass.QueryDelegatorDelegationsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegatorDelegationsRequest):
      QueryDelegatorDelegationsRequest = QueryDelegatorDelegationsRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryDelegatorDelegationsRequest):
      QueryOuterClass.QueryDelegatorDelegationsRequest {
    val builder = QueryOuterClass.QueryDelegatorDelegationsRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryDelegatorDelegationsResponseJvmConverter :
    ProtobufTypeMapper<QueryDelegatorDelegationsResponse, QueryOuterClass.QueryDelegatorDelegationsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegatorDelegationsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegatorDelegationsResponse> =
      QueryOuterClass.QueryDelegatorDelegationsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegatorDelegationsResponse):
      QueryDelegatorDelegationsResponse = QueryDelegatorDelegationsResponse(
  	delegationResponses = obj.getDelegationResponsesList().map {
      DelegationResponseJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryDelegatorDelegationsResponse):
      QueryOuterClass.QueryDelegatorDelegationsResponse {
    val builder = QueryOuterClass.QueryDelegatorDelegationsResponse.newBuilder()
    builder.addAllDelegationResponses(obj.delegationResponses.map {
        DelegationResponseJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryDelegatorUnbondingDelegationsRequestJvmConverter :
    ProtobufTypeMapper<QueryDelegatorUnbondingDelegationsRequest, QueryOuterClass.QueryDelegatorUnbondingDelegationsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegatorUnbondingDelegationsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegatorUnbondingDelegationsRequest> =
      QueryOuterClass.QueryDelegatorUnbondingDelegationsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegatorUnbondingDelegationsRequest):
      QueryDelegatorUnbondingDelegationsRequest = QueryDelegatorUnbondingDelegationsRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryDelegatorUnbondingDelegationsRequest):
      QueryOuterClass.QueryDelegatorUnbondingDelegationsRequest {
    val builder = QueryOuterClass.QueryDelegatorUnbondingDelegationsRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryDelegatorUnbondingDelegationsResponseJvmConverter :
    ProtobufTypeMapper<QueryDelegatorUnbondingDelegationsResponse, QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse> =
      QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse):
      QueryDelegatorUnbondingDelegationsResponse = QueryDelegatorUnbondingDelegationsResponse(
  	unbondingResponses = obj.getUnbondingResponsesList().map {
      UnbondingDelegationJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryDelegatorUnbondingDelegationsResponse):
      QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse {
    val builder = QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse.newBuilder()
    builder.addAllUnbondingResponses(obj.unbondingResponses.map {
        UnbondingDelegationJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryRedelegationsRequestJvmConverter :
    ProtobufTypeMapper<QueryRedelegationsRequest, QueryOuterClass.QueryRedelegationsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryRedelegationsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryRedelegationsRequest> =
      QueryOuterClass.QueryRedelegationsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryRedelegationsRequest):
      QueryRedelegationsRequest = QueryRedelegationsRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	srcValidatorAddr = obj.getSrcValidatorAddr(),
  	dstValidatorAddr = obj.getDstValidatorAddr(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryRedelegationsRequest):
      QueryOuterClass.QueryRedelegationsRequest {
    val builder = QueryOuterClass.QueryRedelegationsRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setSrcValidatorAddr(obj.srcValidatorAddr)
    builder.setDstValidatorAddr(obj.dstValidatorAddr)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryRedelegationsResponseJvmConverter :
    ProtobufTypeMapper<QueryRedelegationsResponse, QueryOuterClass.QueryRedelegationsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryRedelegationsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryRedelegationsResponse> =
      QueryOuterClass.QueryRedelegationsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryRedelegationsResponse):
      QueryRedelegationsResponse = QueryRedelegationsResponse(
  	redelegationResponses = obj.getRedelegationResponsesList().map {
      RedelegationResponseJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryRedelegationsResponse):
      QueryOuterClass.QueryRedelegationsResponse {
    val builder = QueryOuterClass.QueryRedelegationsResponse.newBuilder()
    builder.addAllRedelegationResponses(obj.redelegationResponses.map {
        RedelegationResponseJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryDelegatorValidatorsRequestJvmConverter :
    ProtobufTypeMapper<QueryDelegatorValidatorsRequest, QueryOuterClass.QueryDelegatorValidatorsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegatorValidatorsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegatorValidatorsRequest> =
      QueryOuterClass.QueryDelegatorValidatorsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegatorValidatorsRequest):
      QueryDelegatorValidatorsRequest = QueryDelegatorValidatorsRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryDelegatorValidatorsRequest):
      QueryOuterClass.QueryDelegatorValidatorsRequest {
    val builder = QueryOuterClass.QueryDelegatorValidatorsRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryDelegatorValidatorsResponseJvmConverter :
    ProtobufTypeMapper<QueryDelegatorValidatorsResponse, QueryOuterClass.QueryDelegatorValidatorsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegatorValidatorsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegatorValidatorsResponse> =
      QueryOuterClass.QueryDelegatorValidatorsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegatorValidatorsResponse):
      QueryDelegatorValidatorsResponse = QueryDelegatorValidatorsResponse(
  	validators = obj.getValidatorsList().map { ValidatorJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryDelegatorValidatorsResponse):
      QueryOuterClass.QueryDelegatorValidatorsResponse {
    val builder = QueryOuterClass.QueryDelegatorValidatorsResponse.newBuilder()
    builder.addAllValidators(obj.validators.map { ValidatorJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryDelegatorValidatorRequestJvmConverter :
    ProtobufTypeMapper<QueryDelegatorValidatorRequest, QueryOuterClass.QueryDelegatorValidatorRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegatorValidatorRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegatorValidatorRequest> =
      QueryOuterClass.QueryDelegatorValidatorRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegatorValidatorRequest):
      QueryDelegatorValidatorRequest = QueryDelegatorValidatorRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	validatorAddr = obj.getValidatorAddr(),
  )

  public override fun convert(obj: QueryDelegatorValidatorRequest):
      QueryOuterClass.QueryDelegatorValidatorRequest {
    val builder = QueryOuterClass.QueryDelegatorValidatorRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setValidatorAddr(obj.validatorAddr)
    return builder.build()
  }
}

public object QueryDelegatorValidatorResponseJvmConverter :
    ProtobufTypeMapper<QueryDelegatorValidatorResponse, QueryOuterClass.QueryDelegatorValidatorResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegatorValidatorResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegatorValidatorResponse> =
      QueryOuterClass.QueryDelegatorValidatorResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegatorValidatorResponse):
      QueryDelegatorValidatorResponse = QueryDelegatorValidatorResponse(
  	validator = ValidatorJvmConverter.convert(obj.getValidator()),
  )

  public override fun convert(obj: QueryDelegatorValidatorResponse):
      QueryOuterClass.QueryDelegatorValidatorResponse {
    val builder = QueryOuterClass.QueryDelegatorValidatorResponse.newBuilder()
    builder.setValidator(ValidatorJvmConverter.convert(obj.validator))
    return builder.build()
  }
}

public object QueryHistoricalInfoRequestJvmConverter :
    ProtobufTypeMapper<QueryHistoricalInfoRequest, QueryOuterClass.QueryHistoricalInfoRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryHistoricalInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryHistoricalInfoRequest> =
      QueryOuterClass.QueryHistoricalInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryHistoricalInfoRequest):
      QueryHistoricalInfoRequest = QueryHistoricalInfoRequest(
  	height = obj.getHeight(),
  )

  public override fun convert(obj: QueryHistoricalInfoRequest):
      QueryOuterClass.QueryHistoricalInfoRequest {
    val builder = QueryOuterClass.QueryHistoricalInfoRequest.newBuilder()
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object QueryHistoricalInfoResponseJvmConverter :
    ProtobufTypeMapper<QueryHistoricalInfoResponse, QueryOuterClass.QueryHistoricalInfoResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryHistoricalInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryHistoricalInfoResponse> =
      QueryOuterClass.QueryHistoricalInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryHistoricalInfoResponse):
      QueryHistoricalInfoResponse = QueryHistoricalInfoResponse(
  	hist = HistoricalInfoJvmConverter.convert(obj.getHist()),
  )

  public override fun convert(obj: QueryHistoricalInfoResponse):
      QueryOuterClass.QueryHistoricalInfoResponse {
    val builder = QueryOuterClass.QueryHistoricalInfoResponse.newBuilder()
    builder.setHist(HistoricalInfoJvmConverter.convert(obj.hist))
    return builder.build()
  }
}

public object QueryPoolRequestJvmConverter :
    ProtobufTypeMapper<QueryPoolRequest, QueryOuterClass.QueryPoolRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPoolRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPoolRequest> =
      QueryOuterClass.QueryPoolRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryPoolRequest): QueryPoolRequest =
      QueryPoolRequest(
  )

  public override fun convert(obj: QueryPoolRequest): QueryOuterClass.QueryPoolRequest {
    val builder = QueryOuterClass.QueryPoolRequest.newBuilder()
    return builder.build()
  }
}

public object QueryPoolResponseJvmConverter :
    ProtobufTypeMapper<QueryPoolResponse, QueryOuterClass.QueryPoolResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPoolResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPoolResponse> =
      QueryOuterClass.QueryPoolResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryPoolResponse): QueryPoolResponse =
      QueryPoolResponse(
  	pool = PoolJvmConverter.convert(obj.getPool()),
  )

  public override fun convert(obj: QueryPoolResponse): QueryOuterClass.QueryPoolResponse {
    val builder = QueryOuterClass.QueryPoolResponse.newBuilder()
    builder.setPool(PoolJvmConverter.convert(obj.pool))
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
