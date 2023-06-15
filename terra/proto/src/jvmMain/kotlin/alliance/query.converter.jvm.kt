// Transform from alliance/query.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import cosmos.base.v1beta1.CoinJvmConverter
import cosmos.base.v1beta1.DecCoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

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

public object QueryAlliancesRequestJvmConverter :
    ProtobufTypeMapper<QueryAlliancesRequest, QueryOuterClass.QueryAlliancesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAlliancesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAlliancesRequest> =
      QueryOuterClass.QueryAlliancesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAlliancesRequest): QueryAlliancesRequest =
      QueryAlliancesRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAlliancesRequest): QueryOuterClass.QueryAlliancesRequest {
    val builder = QueryOuterClass.QueryAlliancesRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAlliancesResponseJvmConverter :
    ProtobufTypeMapper<QueryAlliancesResponse, QueryOuterClass.QueryAlliancesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAlliancesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAlliancesResponse> =
      QueryOuterClass.QueryAlliancesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAlliancesResponse): QueryAlliancesResponse =
      QueryAlliancesResponse(
  	alliances = obj.getAlliancesList().map { AllianceAssetJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAlliancesResponse): QueryOuterClass.QueryAlliancesResponse {
    val builder = QueryOuterClass.QueryAlliancesResponse.newBuilder()
    builder.addAllAlliances(obj.alliances.map { AllianceAssetJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllianceRequestJvmConverter :
    ProtobufTypeMapper<QueryAllianceRequest, QueryOuterClass.QueryAllianceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceRequest> =
      QueryOuterClass.QueryAllianceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceRequest): QueryAllianceRequest =
      QueryAllianceRequest(
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QueryAllianceRequest): QueryOuterClass.QueryAllianceRequest {
    val builder = QueryOuterClass.QueryAllianceRequest.newBuilder()
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QueryAllianceResponseJvmConverter :
    ProtobufTypeMapper<QueryAllianceResponse, QueryOuterClass.QueryAllianceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceResponse> =
      QueryOuterClass.QueryAllianceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceResponse): QueryAllianceResponse =
      QueryAllianceResponse(
  	alliance = AllianceAssetJvmConverter.convert(obj.getAlliance()),
  )

  public override fun convert(obj: QueryAllianceResponse): QueryOuterClass.QueryAllianceResponse {
    val builder = QueryOuterClass.QueryAllianceResponse.newBuilder()
    builder.setAlliance(AllianceAssetJvmConverter.convert(obj.alliance))
    return builder.build()
  }
}

public object QueryIBCAllianceRequestJvmConverter :
    ProtobufTypeMapper<QueryIBCAllianceRequest, QueryOuterClass.QueryIBCAllianceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryIBCAllianceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryIBCAllianceRequest> =
      QueryOuterClass.QueryIBCAllianceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryIBCAllianceRequest): QueryIBCAllianceRequest
      = QueryIBCAllianceRequest(
  	hash = obj.getHash(),
  )

  public override fun convert(obj: QueryIBCAllianceRequest):
      QueryOuterClass.QueryIBCAllianceRequest {
    val builder = QueryOuterClass.QueryIBCAllianceRequest.newBuilder()
    builder.setHash(obj.hash)
    return builder.build()
  }
}

public object QueryAllianceValidatorRequestJvmConverter :
    ProtobufTypeMapper<QueryAllianceValidatorRequest, QueryOuterClass.QueryAllianceValidatorRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceValidatorRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceValidatorRequest> =
      QueryOuterClass.QueryAllianceValidatorRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceValidatorRequest):
      QueryAllianceValidatorRequest = QueryAllianceValidatorRequest(
  	validatorAddr = obj.getValidatorAddr(),
  )

  public override fun convert(obj: QueryAllianceValidatorRequest):
      QueryOuterClass.QueryAllianceValidatorRequest {
    val builder = QueryOuterClass.QueryAllianceValidatorRequest.newBuilder()
    builder.setValidatorAddr(obj.validatorAddr)
    return builder.build()
  }
}

public object QueryAllAllianceValidatorsRequestJvmConverter :
    ProtobufTypeMapper<QueryAllAllianceValidatorsRequest, QueryOuterClass.QueryAllAllianceValidatorsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllAllianceValidatorsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllAllianceValidatorsRequest> =
      QueryOuterClass.QueryAllAllianceValidatorsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllAllianceValidatorsRequest):
      QueryAllAllianceValidatorsRequest = QueryAllAllianceValidatorsRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllAllianceValidatorsRequest):
      QueryOuterClass.QueryAllAllianceValidatorsRequest {
    val builder = QueryOuterClass.QueryAllAllianceValidatorsRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllAlliancesDelegationsRequestJvmConverter :
    ProtobufTypeMapper<QueryAllAlliancesDelegationsRequest, QueryOuterClass.QueryAllAlliancesDelegationsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllAlliancesDelegationsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllAlliancesDelegationsRequest> =
      QueryOuterClass.QueryAllAlliancesDelegationsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllAlliancesDelegationsRequest):
      QueryAllAlliancesDelegationsRequest = QueryAllAlliancesDelegationsRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllAlliancesDelegationsRequest):
      QueryOuterClass.QueryAllAlliancesDelegationsRequest {
    val builder = QueryOuterClass.QueryAllAlliancesDelegationsRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAlliancesDelegationsRequestJvmConverter :
    ProtobufTypeMapper<QueryAlliancesDelegationsRequest, QueryOuterClass.QueryAlliancesDelegationsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAlliancesDelegationsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAlliancesDelegationsRequest> =
      QueryOuterClass.QueryAlliancesDelegationsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAlliancesDelegationsRequest):
      QueryAlliancesDelegationsRequest = QueryAlliancesDelegationsRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAlliancesDelegationsRequest):
      QueryOuterClass.QueryAlliancesDelegationsRequest {
    val builder = QueryOuterClass.QueryAlliancesDelegationsRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAlliancesDelegationByValidatorRequestJvmConverter :
    ProtobufTypeMapper<QueryAlliancesDelegationByValidatorRequest, QueryOuterClass.QueryAlliancesDelegationByValidatorRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAlliancesDelegationByValidatorRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAlliancesDelegationByValidatorRequest> =
      QueryOuterClass.QueryAlliancesDelegationByValidatorRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAlliancesDelegationByValidatorRequest):
      QueryAlliancesDelegationByValidatorRequest = QueryAlliancesDelegationByValidatorRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	validatorAddr = obj.getValidatorAddr(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAlliancesDelegationByValidatorRequest):
      QueryOuterClass.QueryAlliancesDelegationByValidatorRequest {
    val builder = QueryOuterClass.QueryAlliancesDelegationByValidatorRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setValidatorAddr(obj.validatorAddr)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object DelegationResponseJvmConverter :
    ProtobufTypeMapper<DelegationResponse, QueryOuterClass.DelegationResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.DelegationResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.DelegationResponse> =
      QueryOuterClass.DelegationResponse.parser()

  public override fun convert(obj: QueryOuterClass.DelegationResponse): DelegationResponse =
      DelegationResponse(
  	delegation = DelegationJvmConverter.convert(obj.getDelegation()),
  	balance = CoinJvmConverter.convert(obj.getBalance()),
  )

  public override fun convert(obj: DelegationResponse): QueryOuterClass.DelegationResponse {
    val builder = QueryOuterClass.DelegationResponse.newBuilder()
    builder.setDelegation(DelegationJvmConverter.convert(obj.delegation))
    builder.setBalance(CoinJvmConverter.convert(obj.balance))
    return builder.build()
  }
}

public object QueryAlliancesDelegationsResponseJvmConverter :
    ProtobufTypeMapper<QueryAlliancesDelegationsResponse, QueryOuterClass.QueryAlliancesDelegationsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAlliancesDelegationsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAlliancesDelegationsResponse> =
      QueryOuterClass.QueryAlliancesDelegationsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAlliancesDelegationsResponse):
      QueryAlliancesDelegationsResponse = QueryAlliancesDelegationsResponse(
  	delegations = obj.getDelegationsList().map { DelegationResponseJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAlliancesDelegationsResponse):
      QueryOuterClass.QueryAlliancesDelegationsResponse {
    val builder = QueryOuterClass.QueryAlliancesDelegationsResponse.newBuilder()
    builder.addAllDelegations(obj.delegations.map { DelegationResponseJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllianceDelegationRequestJvmConverter :
    ProtobufTypeMapper<QueryAllianceDelegationRequest, QueryOuterClass.QueryAllianceDelegationRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceDelegationRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceDelegationRequest> =
      QueryOuterClass.QueryAllianceDelegationRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceDelegationRequest):
      QueryAllianceDelegationRequest = QueryAllianceDelegationRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	validatorAddr = obj.getValidatorAddr(),
  	denom = obj.getDenom(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllianceDelegationRequest):
      QueryOuterClass.QueryAllianceDelegationRequest {
    val builder = QueryOuterClass.QueryAllianceDelegationRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setValidatorAddr(obj.validatorAddr)
    builder.setDenom(obj.denom)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryIBCAllianceDelegationRequestJvmConverter :
    ProtobufTypeMapper<QueryIBCAllianceDelegationRequest, QueryOuterClass.QueryIBCAllianceDelegationRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryIBCAllianceDelegationRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryIBCAllianceDelegationRequest> =
      QueryOuterClass.QueryIBCAllianceDelegationRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryIBCAllianceDelegationRequest):
      QueryIBCAllianceDelegationRequest = QueryIBCAllianceDelegationRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	validatorAddr = obj.getValidatorAddr(),
  	hash = obj.getHash(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryIBCAllianceDelegationRequest):
      QueryOuterClass.QueryIBCAllianceDelegationRequest {
    val builder = QueryOuterClass.QueryIBCAllianceDelegationRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setValidatorAddr(obj.validatorAddr)
    builder.setHash(obj.hash)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllianceDelegationResponseJvmConverter :
    ProtobufTypeMapper<QueryAllianceDelegationResponse, QueryOuterClass.QueryAllianceDelegationResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceDelegationResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceDelegationResponse> =
      QueryOuterClass.QueryAllianceDelegationResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceDelegationResponse):
      QueryAllianceDelegationResponse = QueryAllianceDelegationResponse(
  	delegation = DelegationResponseJvmConverter.convert(obj.getDelegation()),
  )

  public override fun convert(obj: QueryAllianceDelegationResponse):
      QueryOuterClass.QueryAllianceDelegationResponse {
    val builder = QueryOuterClass.QueryAllianceDelegationResponse.newBuilder()
    builder.setDelegation(DelegationResponseJvmConverter.convert(obj.delegation))
    return builder.build()
  }
}

public object QueryAllianceDelegationRewardsRequestJvmConverter :
    ProtobufTypeMapper<QueryAllianceDelegationRewardsRequest, QueryOuterClass.QueryAllianceDelegationRewardsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceDelegationRewardsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceDelegationRewardsRequest> =
      QueryOuterClass.QueryAllianceDelegationRewardsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceDelegationRewardsRequest):
      QueryAllianceDelegationRewardsRequest = QueryAllianceDelegationRewardsRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	validatorAddr = obj.getValidatorAddr(),
  	denom = obj.getDenom(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllianceDelegationRewardsRequest):
      QueryOuterClass.QueryAllianceDelegationRewardsRequest {
    val builder = QueryOuterClass.QueryAllianceDelegationRewardsRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setValidatorAddr(obj.validatorAddr)
    builder.setDenom(obj.denom)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryIBCAllianceDelegationRewardsRequestJvmConverter :
    ProtobufTypeMapper<QueryIBCAllianceDelegationRewardsRequest, QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest> =
      QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest):
      QueryIBCAllianceDelegationRewardsRequest = QueryIBCAllianceDelegationRewardsRequest(
  	delegatorAddr = obj.getDelegatorAddr(),
  	validatorAddr = obj.getValidatorAddr(),
  	hash = obj.getHash(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryIBCAllianceDelegationRewardsRequest):
      QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest {
    val builder = QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest.newBuilder()
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setValidatorAddr(obj.validatorAddr)
    builder.setHash(obj.hash)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllianceDelegationRewardsResponseJvmConverter :
    ProtobufTypeMapper<QueryAllianceDelegationRewardsResponse, QueryOuterClass.QueryAllianceDelegationRewardsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceDelegationRewardsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceDelegationRewardsResponse> =
      QueryOuterClass.QueryAllianceDelegationRewardsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceDelegationRewardsResponse):
      QueryAllianceDelegationRewardsResponse = QueryAllianceDelegationRewardsResponse(
  	rewards = obj.getRewardsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryAllianceDelegationRewardsResponse):
      QueryOuterClass.QueryAllianceDelegationRewardsResponse {
    val builder = QueryOuterClass.QueryAllianceDelegationRewardsResponse.newBuilder()
    builder.addAllRewards(obj.rewards.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryAllianceValidatorResponseJvmConverter :
    ProtobufTypeMapper<QueryAllianceValidatorResponse, QueryOuterClass.QueryAllianceValidatorResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceValidatorResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceValidatorResponse> =
      QueryOuterClass.QueryAllianceValidatorResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceValidatorResponse):
      QueryAllianceValidatorResponse = QueryAllianceValidatorResponse(
  	validatorAddr = obj.getValidatorAddr(),
  	totalDelegationShares = obj.getTotalDelegationSharesList().map { DecCoinJvmConverter.convert(it)
      },
  	validatorShares = obj.getValidatorSharesList().map { DecCoinJvmConverter.convert(it) },
  	totalStaked = obj.getTotalStakedList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryAllianceValidatorResponse):
      QueryOuterClass.QueryAllianceValidatorResponse {
    val builder = QueryOuterClass.QueryAllianceValidatorResponse.newBuilder()
    builder.setValidatorAddr(obj.validatorAddr)
    builder.addAllTotalDelegationShares(obj.totalDelegationShares.map {
        DecCoinJvmConverter.convert(it) })
    builder.addAllValidatorShares(obj.validatorShares.map { DecCoinJvmConverter.convert(it) })
    builder.addAllTotalStaked(obj.totalStaked.map { DecCoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryAllianceValidatorsResponseJvmConverter :
    ProtobufTypeMapper<QueryAllianceValidatorsResponse, QueryOuterClass.QueryAllianceValidatorsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceValidatorsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceValidatorsResponse> =
      QueryOuterClass.QueryAllianceValidatorsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceValidatorsResponse):
      QueryAllianceValidatorsResponse = QueryAllianceValidatorsResponse(
  	validators = obj.getValidatorsList().map { QueryAllianceValidatorResponseJvmConverter.convert(it)
      },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllianceValidatorsResponse):
      QueryOuterClass.QueryAllianceValidatorsResponse {
    val builder = QueryOuterClass.QueryAllianceValidatorsResponse.newBuilder()
    builder.addAllValidators(obj.validators.map {
        QueryAllianceValidatorResponseJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllianceUnbondingsByDenomAndDelegatorRequestJvmConverter :
    ProtobufTypeMapper<QueryAllianceUnbondingsByDenomAndDelegatorRequest, QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest.getDescriptor()

  public override val parser:
      Parser<QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest> =
      QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest.parser()

  public override
      fun convert(obj: QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest):
      QueryAllianceUnbondingsByDenomAndDelegatorRequest =
      QueryAllianceUnbondingsByDenomAndDelegatorRequest(
  	denom = obj.getDenom(),
  	delegatorAddr = obj.getDelegatorAddr(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllianceUnbondingsByDenomAndDelegatorRequest):
      QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest {
    val builder = QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest.newBuilder()
    builder.setDenom(obj.denom)
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllianceUnbondingsByDenomAndDelegatorResponseJvmConverter :
    ProtobufTypeMapper<QueryAllianceUnbondingsByDenomAndDelegatorResponse, QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse.getDescriptor()

  public override val parser:
      Parser<QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse> =
      QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse.parser()

  public override
      fun convert(obj: QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse):
      QueryAllianceUnbondingsByDenomAndDelegatorResponse =
      QueryAllianceUnbondingsByDenomAndDelegatorResponse(
  	unbondings = obj.getUnbondingsList().map { UnbondingDelegationJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllianceUnbondingsByDenomAndDelegatorResponse):
      QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse {
    val builder = QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse.newBuilder()
    builder.addAllUnbondings(obj.unbondings.map { UnbondingDelegationJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllianceUnbondingsRequestJvmConverter :
    ProtobufTypeMapper<QueryAllianceUnbondingsRequest, QueryOuterClass.QueryAllianceUnbondingsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceUnbondingsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceUnbondingsRequest> =
      QueryOuterClass.QueryAllianceUnbondingsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceUnbondingsRequest):
      QueryAllianceUnbondingsRequest = QueryAllianceUnbondingsRequest(
  	denom = obj.getDenom(),
  	delegatorAddr = obj.getDelegatorAddr(),
  	validatorAddr = obj.getValidatorAddr(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllianceUnbondingsRequest):
      QueryOuterClass.QueryAllianceUnbondingsRequest {
    val builder = QueryOuterClass.QueryAllianceUnbondingsRequest.newBuilder()
    builder.setDenom(obj.denom)
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setValidatorAddr(obj.validatorAddr)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllianceUnbondingsResponseJvmConverter :
    ProtobufTypeMapper<QueryAllianceUnbondingsResponse, QueryOuterClass.QueryAllianceUnbondingsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceUnbondingsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceUnbondingsResponse> =
      QueryOuterClass.QueryAllianceUnbondingsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceUnbondingsResponse):
      QueryAllianceUnbondingsResponse = QueryAllianceUnbondingsResponse(
  	unbondings = obj.getUnbondingsList().map { UnbondingDelegationJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllianceUnbondingsResponse):
      QueryOuterClass.QueryAllianceUnbondingsResponse {
    val builder = QueryOuterClass.QueryAllianceUnbondingsResponse.newBuilder()
    builder.addAllUnbondings(obj.unbondings.map { UnbondingDelegationJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllianceRedelegationsRequestJvmConverter :
    ProtobufTypeMapper<QueryAllianceRedelegationsRequest, QueryOuterClass.QueryAllianceRedelegationsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceRedelegationsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceRedelegationsRequest> =
      QueryOuterClass.QueryAllianceRedelegationsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceRedelegationsRequest):
      QueryAllianceRedelegationsRequest = QueryAllianceRedelegationsRequest(
  	denom = obj.getDenom(),
  	delegatorAddr = obj.getDelegatorAddr(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllianceRedelegationsRequest):
      QueryOuterClass.QueryAllianceRedelegationsRequest {
    val builder = QueryOuterClass.QueryAllianceRedelegationsRequest.newBuilder()
    builder.setDenom(obj.denom)
    builder.setDelegatorAddr(obj.delegatorAddr)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllianceRedelegationsResponseJvmConverter :
    ProtobufTypeMapper<QueryAllianceRedelegationsResponse, QueryOuterClass.QueryAllianceRedelegationsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllianceRedelegationsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllianceRedelegationsResponse> =
      QueryOuterClass.QueryAllianceRedelegationsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllianceRedelegationsResponse):
      QueryAllianceRedelegationsResponse = QueryAllianceRedelegationsResponse(
  	redelegations = obj.getRedelegationsList().map { RedelegationEntryJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllianceRedelegationsResponse):
      QueryOuterClass.QueryAllianceRedelegationsResponse {
    val builder = QueryOuterClass.QueryAllianceRedelegationsResponse.newBuilder()
    builder.addAllRedelegations(obj.redelegations.map { RedelegationEntryJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}
