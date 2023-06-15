// Transform from cosmos/distribution/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import cosmos.base.v1beta1.DecCoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

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

public object QueryValidatorDistributionInfoRequestJvmConverter :
    ProtobufTypeMapper<QueryValidatorDistributionInfoRequest, QueryOuterClass.QueryValidatorDistributionInfoRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorDistributionInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorDistributionInfoRequest> =
      QueryOuterClass.QueryValidatorDistributionInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorDistributionInfoRequest):
      QueryValidatorDistributionInfoRequest = QueryValidatorDistributionInfoRequest(
  	validatorAddress = obj.getValidatorAddress(),
  )

  public override fun convert(obj: QueryValidatorDistributionInfoRequest):
      QueryOuterClass.QueryValidatorDistributionInfoRequest {
    val builder = QueryOuterClass.QueryValidatorDistributionInfoRequest.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    return builder.build()
  }
}

public object QueryValidatorDistributionInfoResponseJvmConverter :
    ProtobufTypeMapper<QueryValidatorDistributionInfoResponse, QueryOuterClass.QueryValidatorDistributionInfoResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorDistributionInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorDistributionInfoResponse> =
      QueryOuterClass.QueryValidatorDistributionInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorDistributionInfoResponse):
      QueryValidatorDistributionInfoResponse = QueryValidatorDistributionInfoResponse(
  	operatorAddress = obj.getOperatorAddress(),
  	selfBondRewards = obj.getSelfBondRewardsList().map { DecCoinJvmConverter.convert(it) },
  	commission = obj.getCommissionList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryValidatorDistributionInfoResponse):
      QueryOuterClass.QueryValidatorDistributionInfoResponse {
    val builder = QueryOuterClass.QueryValidatorDistributionInfoResponse.newBuilder()
    builder.setOperatorAddress(obj.operatorAddress)
    builder.addAllSelfBondRewards(obj.selfBondRewards.map { DecCoinJvmConverter.convert(it) })
    builder.addAllCommission(obj.commission.map { DecCoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryValidatorOutstandingRewardsRequestJvmConverter :
    ProtobufTypeMapper<QueryValidatorOutstandingRewardsRequest, QueryOuterClass.QueryValidatorOutstandingRewardsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorOutstandingRewardsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorOutstandingRewardsRequest> =
      QueryOuterClass.QueryValidatorOutstandingRewardsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorOutstandingRewardsRequest):
      QueryValidatorOutstandingRewardsRequest = QueryValidatorOutstandingRewardsRequest(
  	validatorAddress = obj.getValidatorAddress(),
  )

  public override fun convert(obj: QueryValidatorOutstandingRewardsRequest):
      QueryOuterClass.QueryValidatorOutstandingRewardsRequest {
    val builder = QueryOuterClass.QueryValidatorOutstandingRewardsRequest.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    return builder.build()
  }
}

public object QueryValidatorOutstandingRewardsResponseJvmConverter :
    ProtobufTypeMapper<QueryValidatorOutstandingRewardsResponse, QueryOuterClass.QueryValidatorOutstandingRewardsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorOutstandingRewardsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorOutstandingRewardsResponse> =
      QueryOuterClass.QueryValidatorOutstandingRewardsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorOutstandingRewardsResponse):
      QueryValidatorOutstandingRewardsResponse = QueryValidatorOutstandingRewardsResponse(
  	rewards = ValidatorOutstandingRewardsJvmConverter.convert(obj.getRewards()),
  )

  public override fun convert(obj: QueryValidatorOutstandingRewardsResponse):
      QueryOuterClass.QueryValidatorOutstandingRewardsResponse {
    val builder = QueryOuterClass.QueryValidatorOutstandingRewardsResponse.newBuilder()
    builder.setRewards(ValidatorOutstandingRewardsJvmConverter.convert(obj.rewards))
    return builder.build()
  }
}

public object QueryValidatorCommissionRequestJvmConverter :
    ProtobufTypeMapper<QueryValidatorCommissionRequest, QueryOuterClass.QueryValidatorCommissionRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorCommissionRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorCommissionRequest> =
      QueryOuterClass.QueryValidatorCommissionRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorCommissionRequest):
      QueryValidatorCommissionRequest = QueryValidatorCommissionRequest(
  	validatorAddress = obj.getValidatorAddress(),
  )

  public override fun convert(obj: QueryValidatorCommissionRequest):
      QueryOuterClass.QueryValidatorCommissionRequest {
    val builder = QueryOuterClass.QueryValidatorCommissionRequest.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    return builder.build()
  }
}

public object QueryValidatorCommissionResponseJvmConverter :
    ProtobufTypeMapper<QueryValidatorCommissionResponse, QueryOuterClass.QueryValidatorCommissionResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorCommissionResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorCommissionResponse> =
      QueryOuterClass.QueryValidatorCommissionResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorCommissionResponse):
      QueryValidatorCommissionResponse = QueryValidatorCommissionResponse(
  	commission = ValidatorAccumulatedCommissionJvmConverter.convert(obj.getCommission()),
  )

  public override fun convert(obj: QueryValidatorCommissionResponse):
      QueryOuterClass.QueryValidatorCommissionResponse {
    val builder = QueryOuterClass.QueryValidatorCommissionResponse.newBuilder()
    builder.setCommission(ValidatorAccumulatedCommissionJvmConverter.convert(obj.commission))
    return builder.build()
  }
}

public object QueryValidatorSlashesRequestJvmConverter :
    ProtobufTypeMapper<QueryValidatorSlashesRequest, QueryOuterClass.QueryValidatorSlashesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorSlashesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorSlashesRequest> =
      QueryOuterClass.QueryValidatorSlashesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorSlashesRequest):
      QueryValidatorSlashesRequest = QueryValidatorSlashesRequest(
  	validatorAddress = obj.getValidatorAddress(),
  	startingHeight = obj.getStartingHeight().asKotlinType,
  	endingHeight = obj.getEndingHeight().asKotlinType,
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryValidatorSlashesRequest):
      QueryOuterClass.QueryValidatorSlashesRequest {
    val builder = QueryOuterClass.QueryValidatorSlashesRequest.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setStartingHeight(obj.startingHeight.asJavaType)
    builder.setEndingHeight(obj.endingHeight.asJavaType)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryValidatorSlashesResponseJvmConverter :
    ProtobufTypeMapper<QueryValidatorSlashesResponse, QueryOuterClass.QueryValidatorSlashesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValidatorSlashesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValidatorSlashesResponse> =
      QueryOuterClass.QueryValidatorSlashesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryValidatorSlashesResponse):
      QueryValidatorSlashesResponse = QueryValidatorSlashesResponse(
  	slashes = obj.getSlashesList().map { ValidatorSlashEventJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryValidatorSlashesResponse):
      QueryOuterClass.QueryValidatorSlashesResponse {
    val builder = QueryOuterClass.QueryValidatorSlashesResponse.newBuilder()
    builder.addAllSlashes(obj.slashes.map { ValidatorSlashEventJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryDelegationRewardsRequestJvmConverter :
    ProtobufTypeMapper<QueryDelegationRewardsRequest, QueryOuterClass.QueryDelegationRewardsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegationRewardsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegationRewardsRequest> =
      QueryOuterClass.QueryDelegationRewardsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegationRewardsRequest):
      QueryDelegationRewardsRequest = QueryDelegationRewardsRequest(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  )

  public override fun convert(obj: QueryDelegationRewardsRequest):
      QueryOuterClass.QueryDelegationRewardsRequest {
    val builder = QueryOuterClass.QueryDelegationRewardsRequest.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    return builder.build()
  }
}

public object QueryDelegationRewardsResponseJvmConverter :
    ProtobufTypeMapper<QueryDelegationRewardsResponse, QueryOuterClass.QueryDelegationRewardsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegationRewardsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegationRewardsResponse> =
      QueryOuterClass.QueryDelegationRewardsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegationRewardsResponse):
      QueryDelegationRewardsResponse = QueryDelegationRewardsResponse(
  	rewards = obj.getRewardsList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryDelegationRewardsResponse):
      QueryOuterClass.QueryDelegationRewardsResponse {
    val builder = QueryOuterClass.QueryDelegationRewardsResponse.newBuilder()
    builder.addAllRewards(obj.rewards.map { DecCoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryDelegationTotalRewardsRequestJvmConverter :
    ProtobufTypeMapper<QueryDelegationTotalRewardsRequest, QueryOuterClass.QueryDelegationTotalRewardsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegationTotalRewardsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegationTotalRewardsRequest> =
      QueryOuterClass.QueryDelegationTotalRewardsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegationTotalRewardsRequest):
      QueryDelegationTotalRewardsRequest = QueryDelegationTotalRewardsRequest(
  	delegatorAddress = obj.getDelegatorAddress(),
  )

  public override fun convert(obj: QueryDelegationTotalRewardsRequest):
      QueryOuterClass.QueryDelegationTotalRewardsRequest {
    val builder = QueryOuterClass.QueryDelegationTotalRewardsRequest.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    return builder.build()
  }
}

public object QueryDelegationTotalRewardsResponseJvmConverter :
    ProtobufTypeMapper<QueryDelegationTotalRewardsResponse, QueryOuterClass.QueryDelegationTotalRewardsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegationTotalRewardsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegationTotalRewardsResponse> =
      QueryOuterClass.QueryDelegationTotalRewardsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegationTotalRewardsResponse):
      QueryDelegationTotalRewardsResponse = QueryDelegationTotalRewardsResponse(
  	rewards = obj.getRewardsList().map { DelegationDelegatorRewardJvmConverter.convert(it) },
  	total = obj.getTotalList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryDelegationTotalRewardsResponse):
      QueryOuterClass.QueryDelegationTotalRewardsResponse {
    val builder = QueryOuterClass.QueryDelegationTotalRewardsResponse.newBuilder()
    builder.addAllRewards(obj.rewards.map { DelegationDelegatorRewardJvmConverter.convert(it) })
    builder.addAllTotal(obj.total.map { DecCoinJvmConverter.convert(it) })
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
  	delegatorAddress = obj.getDelegatorAddress(),
  )

  public override fun convert(obj: QueryDelegatorValidatorsRequest):
      QueryOuterClass.QueryDelegatorValidatorsRequest {
    val builder = QueryOuterClass.QueryDelegatorValidatorsRequest.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
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
  	validators = obj.getValidatorsList().map { it },
  )

  public override fun convert(obj: QueryDelegatorValidatorsResponse):
      QueryOuterClass.QueryDelegatorValidatorsResponse {
    val builder = QueryOuterClass.QueryDelegatorValidatorsResponse.newBuilder()
    builder.addAllValidators(obj.validators.map { it })
    return builder.build()
  }
}

public object QueryDelegatorWithdrawAddressRequestJvmConverter :
    ProtobufTypeMapper<QueryDelegatorWithdrawAddressRequest, QueryOuterClass.QueryDelegatorWithdrawAddressRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegatorWithdrawAddressRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegatorWithdrawAddressRequest> =
      QueryOuterClass.QueryDelegatorWithdrawAddressRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegatorWithdrawAddressRequest):
      QueryDelegatorWithdrawAddressRequest = QueryDelegatorWithdrawAddressRequest(
  	delegatorAddress = obj.getDelegatorAddress(),
  )

  public override fun convert(obj: QueryDelegatorWithdrawAddressRequest):
      QueryOuterClass.QueryDelegatorWithdrawAddressRequest {
    val builder = QueryOuterClass.QueryDelegatorWithdrawAddressRequest.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    return builder.build()
  }
}

public object QueryDelegatorWithdrawAddressResponseJvmConverter :
    ProtobufTypeMapper<QueryDelegatorWithdrawAddressResponse, QueryOuterClass.QueryDelegatorWithdrawAddressResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegatorWithdrawAddressResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegatorWithdrawAddressResponse> =
      QueryOuterClass.QueryDelegatorWithdrawAddressResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegatorWithdrawAddressResponse):
      QueryDelegatorWithdrawAddressResponse = QueryDelegatorWithdrawAddressResponse(
  	withdrawAddress = obj.getWithdrawAddress(),
  )

  public override fun convert(obj: QueryDelegatorWithdrawAddressResponse):
      QueryOuterClass.QueryDelegatorWithdrawAddressResponse {
    val builder = QueryOuterClass.QueryDelegatorWithdrawAddressResponse.newBuilder()
    builder.setWithdrawAddress(obj.withdrawAddress)
    return builder.build()
  }
}

public object QueryCommunityPoolRequestJvmConverter :
    ProtobufTypeMapper<QueryCommunityPoolRequest, QueryOuterClass.QueryCommunityPoolRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCommunityPoolRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCommunityPoolRequest> =
      QueryOuterClass.QueryCommunityPoolRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryCommunityPoolRequest):
      QueryCommunityPoolRequest = QueryCommunityPoolRequest(
  )

  public override fun convert(obj: QueryCommunityPoolRequest):
      QueryOuterClass.QueryCommunityPoolRequest {
    val builder = QueryOuterClass.QueryCommunityPoolRequest.newBuilder()
    return builder.build()
  }
}

public object QueryCommunityPoolResponseJvmConverter :
    ProtobufTypeMapper<QueryCommunityPoolResponse, QueryOuterClass.QueryCommunityPoolResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCommunityPoolResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCommunityPoolResponse> =
      QueryOuterClass.QueryCommunityPoolResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryCommunityPoolResponse):
      QueryCommunityPoolResponse = QueryCommunityPoolResponse(
  	pool = obj.getPoolList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryCommunityPoolResponse):
      QueryOuterClass.QueryCommunityPoolResponse {
    val builder = QueryOuterClass.QueryCommunityPoolResponse.newBuilder()
    builder.addAllPool(obj.pool.map { DecCoinJvmConverter.convert(it) })
    return builder.build()
  }
}
