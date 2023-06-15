// Transform from cosmos/distribution/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ServerCalls
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.grpc.ClientOption

public object QueryJvm {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val validatorDistributionInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorDistributionInfoRequest, QueryOuterClass.QueryValidatorDistributionInfoResponse>
      = QueryGrpc.getValidatorDistributionInfoMethod()!!

  private val validatorOutstandingRewardsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorOutstandingRewardsRequest, QueryOuterClass.QueryValidatorOutstandingRewardsResponse>
      = QueryGrpc.getValidatorOutstandingRewardsMethod()!!

  private val validatorCommissionDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorCommissionRequest, QueryOuterClass.QueryValidatorCommissionResponse>
      = QueryGrpc.getValidatorCommissionMethod()!!

  private val validatorSlashesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorSlashesRequest, QueryOuterClass.QueryValidatorSlashesResponse>
      = QueryGrpc.getValidatorSlashesMethod()!!

  private val delegationRewardsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegationRewardsRequest, QueryOuterClass.QueryDelegationRewardsResponse>
      = QueryGrpc.getDelegationRewardsMethod()!!

  private val delegationTotalRewardsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegationTotalRewardsRequest, QueryOuterClass.QueryDelegationTotalRewardsResponse>
      = QueryGrpc.getDelegationTotalRewardsMethod()!!

  private val delegatorValidatorsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorValidatorsRequest, QueryOuterClass.QueryDelegatorValidatorsResponse>
      = QueryGrpc.getDelegatorValidatorsMethod()!!

  private val delegatorWithdrawAddressDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorWithdrawAddressRequest, QueryOuterClass.QueryDelegatorWithdrawAddressResponse>
      = QueryGrpc.getDelegatorWithdrawAddressMethod()!!

  private val communityPoolDescriptor:
      MethodDescriptor<QueryOuterClass.QueryCommunityPoolRequest, QueryOuterClass.QueryCommunityPoolResponse>
      = QueryGrpc.getCommunityPoolMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.Params is unimplemented"))

    public open override suspend
        fun validatorDistributionInfo(request: QueryValidatorDistributionInfoRequest):
        QueryValidatorDistributionInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.ValidatorDistributionInfo is unimplemented"))

    public open override suspend
        fun validatorOutstandingRewards(request: QueryValidatorOutstandingRewardsRequest):
        QueryValidatorOutstandingRewardsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.ValidatorOutstandingRewards is unimplemented"))

    public open override suspend fun validatorCommission(request: QueryValidatorCommissionRequest):
        QueryValidatorCommissionResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.ValidatorCommission is unimplemented"))

    public open override suspend fun validatorSlashes(request: QueryValidatorSlashesRequest):
        QueryValidatorSlashesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.ValidatorSlashes is unimplemented"))

    public open override suspend fun delegationRewards(request: QueryDelegationRewardsRequest):
        QueryDelegationRewardsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.DelegationRewards is unimplemented"))

    public open override suspend
        fun delegationTotalRewards(request: QueryDelegationTotalRewardsRequest):
        QueryDelegationTotalRewardsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.DelegationTotalRewards is unimplemented"))

    public open override suspend fun delegatorValidators(request: QueryDelegatorValidatorsRequest):
        QueryDelegatorValidatorsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.DelegatorValidators is unimplemented"))

    public open override suspend
        fun delegatorWithdrawAddress(request: QueryDelegatorWithdrawAddressRequest):
        QueryDelegatorWithdrawAddressResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.DelegatorWithdrawAddress is unimplemented"))

    public open override suspend fun communityPool(request: QueryCommunityPoolRequest):
        QueryCommunityPoolResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.CommunityPool is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = paramsDescriptor,
    				implementation = {
        QueryParamsResponseJvmConverter.convert(params(QueryParamsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorDistributionInfoDescriptor,
    				implementation = {
        QueryValidatorDistributionInfoResponseJvmConverter.convert(validatorDistributionInfo(QueryValidatorDistributionInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorOutstandingRewardsDescriptor,
    				implementation = {
        QueryValidatorOutstandingRewardsResponseJvmConverter.convert(validatorOutstandingRewards(QueryValidatorOutstandingRewardsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorCommissionDescriptor,
    				implementation = {
        QueryValidatorCommissionResponseJvmConverter.convert(validatorCommission(QueryValidatorCommissionRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorSlashesDescriptor,
    				implementation = {
        QueryValidatorSlashesResponseJvmConverter.convert(validatorSlashes(QueryValidatorSlashesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegationRewardsDescriptor,
    				implementation = {
        QueryDelegationRewardsResponseJvmConverter.convert(delegationRewards(QueryDelegationRewardsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegationTotalRewardsDescriptor,
    				implementation = {
        QueryDelegationTotalRewardsResponseJvmConverter.convert(delegationTotalRewards(QueryDelegationTotalRewardsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegatorValidatorsDescriptor,
    				implementation = {
        QueryDelegatorValidatorsResponseJvmConverter.convert(delegatorValidators(QueryDelegatorValidatorsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegatorWithdrawAddressDescriptor,
    				implementation = {
        QueryDelegatorWithdrawAddressResponseJvmConverter.convert(delegatorWithdrawAddress(QueryDelegatorWithdrawAddressRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = communityPoolDescriptor,
    				implementation = {
        QueryCommunityPoolResponseJvmConverter.convert(communityPool(QueryCommunityPoolRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Query.Client>(channel = option.channel, callOptions =
      option.callOptions), Query.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Query.Client =
        Query.Client(ClientOption(channel, callOptions))

    public override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        params(request, Metadata())

    public suspend fun params(request: QueryParamsRequest, metadata: Metadata): QueryParamsResponse
        = QueryParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, paramsDescriptor,
    			QueryParamsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun validatorDistributionInfo(request: QueryValidatorDistributionInfoRequest):
        QueryValidatorDistributionInfoResponse = validatorDistributionInfo(request, Metadata())

    public suspend fun validatorDistributionInfo(request: QueryValidatorDistributionInfoRequest,
        metadata: Metadata): QueryValidatorDistributionInfoResponse =
        QueryValidatorDistributionInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, validatorDistributionInfoDescriptor,
    			QueryValidatorDistributionInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun validatorOutstandingRewards(request: QueryValidatorOutstandingRewardsRequest):
        QueryValidatorOutstandingRewardsResponse = validatorOutstandingRewards(request, Metadata())

    public suspend fun validatorOutstandingRewards(request: QueryValidatorOutstandingRewardsRequest,
        metadata: Metadata): QueryValidatorOutstandingRewardsResponse =
        QueryValidatorOutstandingRewardsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, validatorOutstandingRewardsDescriptor,
    			QueryValidatorOutstandingRewardsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun validatorCommission(request: QueryValidatorCommissionRequest):
        QueryValidatorCommissionResponse = validatorCommission(request, Metadata())

    public suspend fun validatorCommission(request: QueryValidatorCommissionRequest,
        metadata: Metadata): QueryValidatorCommissionResponse =
        QueryValidatorCommissionResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, validatorCommissionDescriptor,
    			QueryValidatorCommissionRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun validatorSlashes(request: QueryValidatorSlashesRequest):
        QueryValidatorSlashesResponse = validatorSlashes(request, Metadata())

    public suspend fun validatorSlashes(request: QueryValidatorSlashesRequest, metadata: Metadata):
        QueryValidatorSlashesResponse = QueryValidatorSlashesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, validatorSlashesDescriptor,
    			QueryValidatorSlashesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun delegationRewards(request: QueryDelegationRewardsRequest):
        QueryDelegationRewardsResponse = delegationRewards(request, Metadata())

    public suspend fun delegationRewards(request: QueryDelegationRewardsRequest,
        metadata: Metadata): QueryDelegationRewardsResponse =
        QueryDelegationRewardsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, delegationRewardsDescriptor,
    			QueryDelegationRewardsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun delegationTotalRewards(request: QueryDelegationTotalRewardsRequest):
        QueryDelegationTotalRewardsResponse = delegationTotalRewards(request, Metadata())

    public suspend fun delegationTotalRewards(request: QueryDelegationTotalRewardsRequest,
        metadata: Metadata): QueryDelegationTotalRewardsResponse =
        QueryDelegationTotalRewardsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, delegationTotalRewardsDescriptor,
    			QueryDelegationTotalRewardsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun delegatorValidators(request: QueryDelegatorValidatorsRequest):
        QueryDelegatorValidatorsResponse = delegatorValidators(request, Metadata())

    public suspend fun delegatorValidators(request: QueryDelegatorValidatorsRequest,
        metadata: Metadata): QueryDelegatorValidatorsResponse =
        QueryDelegatorValidatorsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, delegatorValidatorsDescriptor,
    			QueryDelegatorValidatorsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun delegatorWithdrawAddress(request: QueryDelegatorWithdrawAddressRequest):
        QueryDelegatorWithdrawAddressResponse = delegatorWithdrawAddress(request, Metadata())

    public suspend fun delegatorWithdrawAddress(request: QueryDelegatorWithdrawAddressRequest,
        metadata: Metadata): QueryDelegatorWithdrawAddressResponse =
        QueryDelegatorWithdrawAddressResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, delegatorWithdrawAddressDescriptor,
    			QueryDelegatorWithdrawAddressRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun communityPool(request: QueryCommunityPoolRequest):
        QueryCommunityPoolResponse = communityPool(request, Metadata())

    public suspend fun communityPool(request: QueryCommunityPoolRequest, metadata: Metadata):
        QueryCommunityPoolResponse = QueryCommunityPoolResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, communityPoolDescriptor,
    			QueryCommunityPoolRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
