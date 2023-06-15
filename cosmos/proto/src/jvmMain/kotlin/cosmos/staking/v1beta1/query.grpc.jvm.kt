// Transform from cosmos/staking/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

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

  private val validatorsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorsRequest, QueryOuterClass.QueryValidatorsResponse>
      = QueryGrpc.getValidatorsMethod()!!

  private val validatorDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorRequest, QueryOuterClass.QueryValidatorResponse>
      = QueryGrpc.getValidatorMethod()!!

  private val validatorDelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorDelegationsRequest, QueryOuterClass.QueryValidatorDelegationsResponse>
      = QueryGrpc.getValidatorDelegationsMethod()!!

  private val validatorUnbondingDelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorUnbondingDelegationsRequest, QueryOuterClass.QueryValidatorUnbondingDelegationsResponse>
      = QueryGrpc.getValidatorUnbondingDelegationsMethod()!!

  private val delegationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegationRequest, QueryOuterClass.QueryDelegationResponse>
      = QueryGrpc.getDelegationMethod()!!

  private val unbondingDelegationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryUnbondingDelegationRequest, QueryOuterClass.QueryUnbondingDelegationResponse>
      = QueryGrpc.getUnbondingDelegationMethod()!!

  private val delegatorDelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorDelegationsRequest, QueryOuterClass.QueryDelegatorDelegationsResponse>
      = QueryGrpc.getDelegatorDelegationsMethod()!!

  private val delegatorUnbondingDelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorUnbondingDelegationsRequest, QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse>
      = QueryGrpc.getDelegatorUnbondingDelegationsMethod()!!

  private val redelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryRedelegationsRequest, QueryOuterClass.QueryRedelegationsResponse>
      = QueryGrpc.getRedelegationsMethod()!!

  private val delegatorValidatorsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorValidatorsRequest, QueryOuterClass.QueryDelegatorValidatorsResponse>
      = QueryGrpc.getDelegatorValidatorsMethod()!!

  private val delegatorValidatorDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorValidatorRequest, QueryOuterClass.QueryDelegatorValidatorResponse>
      = QueryGrpc.getDelegatorValidatorMethod()!!

  private val historicalInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryHistoricalInfoRequest, QueryOuterClass.QueryHistoricalInfoResponse>
      = QueryGrpc.getHistoricalInfoMethod()!!

  private val poolDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPoolRequest, QueryOuterClass.QueryPoolResponse> =
      QueryGrpc.getPoolMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun validators(request: QueryValidatorsRequest):
        QueryValidatorsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Validators is unimplemented"))

    public open override suspend fun validator(request: QueryValidatorRequest):
        QueryValidatorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Validator is unimplemented"))

    public open override suspend
        fun validatorDelegations(request: QueryValidatorDelegationsRequest):
        QueryValidatorDelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.ValidatorDelegations is unimplemented"))

    public open override suspend
        fun validatorUnbondingDelegations(request: QueryValidatorUnbondingDelegationsRequest):
        QueryValidatorUnbondingDelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.ValidatorUnbondingDelegations is unimplemented"))

    public open override suspend fun delegation(request: QueryDelegationRequest):
        QueryDelegationResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Delegation is unimplemented"))

    public open override suspend fun unbondingDelegation(request: QueryUnbondingDelegationRequest):
        QueryUnbondingDelegationResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.UnbondingDelegation is unimplemented"))

    public open override suspend
        fun delegatorDelegations(request: QueryDelegatorDelegationsRequest):
        QueryDelegatorDelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.DelegatorDelegations is unimplemented"))

    public open override suspend
        fun delegatorUnbondingDelegations(request: QueryDelegatorUnbondingDelegationsRequest):
        QueryDelegatorUnbondingDelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.DelegatorUnbondingDelegations is unimplemented"))

    public open override suspend fun redelegations(request: QueryRedelegationsRequest):
        QueryRedelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Redelegations is unimplemented"))

    public open override suspend fun delegatorValidators(request: QueryDelegatorValidatorsRequest):
        QueryDelegatorValidatorsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.DelegatorValidators is unimplemented"))

    public open override suspend fun delegatorValidator(request: QueryDelegatorValidatorRequest):
        QueryDelegatorValidatorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.DelegatorValidator is unimplemented"))

    public open override suspend fun historicalInfo(request: QueryHistoricalInfoRequest):
        QueryHistoricalInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.HistoricalInfo is unimplemented"))

    public open override suspend fun pool(request: QueryPoolRequest): QueryPoolResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Pool is unimplemented"))

    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Params is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorsDescriptor,
    				implementation = {
        QueryValidatorsResponseJvmConverter.convert(validators(QueryValidatorsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorDescriptor,
    				implementation = {
        QueryValidatorResponseJvmConverter.convert(validator(QueryValidatorRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorDelegationsDescriptor,
    				implementation = {
        QueryValidatorDelegationsResponseJvmConverter.convert(validatorDelegations(QueryValidatorDelegationsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorUnbondingDelegationsDescriptor,
    				implementation = {
        QueryValidatorUnbondingDelegationsResponseJvmConverter.convert(validatorUnbondingDelegations(QueryValidatorUnbondingDelegationsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegationDescriptor,
    				implementation = {
        QueryDelegationResponseJvmConverter.convert(delegation(QueryDelegationRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = unbondingDelegationDescriptor,
    				implementation = {
        QueryUnbondingDelegationResponseJvmConverter.convert(unbondingDelegation(QueryUnbondingDelegationRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegatorDelegationsDescriptor,
    				implementation = {
        QueryDelegatorDelegationsResponseJvmConverter.convert(delegatorDelegations(QueryDelegatorDelegationsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegatorUnbondingDelegationsDescriptor,
    				implementation = {
        QueryDelegatorUnbondingDelegationsResponseJvmConverter.convert(delegatorUnbondingDelegations(QueryDelegatorUnbondingDelegationsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = redelegationsDescriptor,
    				implementation = {
        QueryRedelegationsResponseJvmConverter.convert(redelegations(QueryRedelegationsRequestJvmConverter.convert(it)))
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
    				descriptor = delegatorValidatorDescriptor,
    				implementation = {
        QueryDelegatorValidatorResponseJvmConverter.convert(delegatorValidator(QueryDelegatorValidatorRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = historicalInfoDescriptor,
    				implementation = {
        QueryHistoricalInfoResponseJvmConverter.convert(historicalInfo(QueryHistoricalInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = poolDescriptor,
    				implementation = {
        QueryPoolResponseJvmConverter.convert(pool(QueryPoolRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = paramsDescriptor,
    				implementation = {
        QueryParamsResponseJvmConverter.convert(params(QueryParamsRequestJvmConverter.convert(it)))
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

    public override suspend fun validators(request: QueryValidatorsRequest): QueryValidatorsResponse
        = validators(request, Metadata())

    public suspend fun validators(request: QueryValidatorsRequest, metadata: Metadata):
        QueryValidatorsResponse = QueryValidatorsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, validatorsDescriptor,
    			QueryValidatorsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun validator(request: QueryValidatorRequest): QueryValidatorResponse =
        validator(request, Metadata())

    public suspend fun validator(request: QueryValidatorRequest, metadata: Metadata):
        QueryValidatorResponse = QueryValidatorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, validatorDescriptor,
    			QueryValidatorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun validatorDelegations(request: QueryValidatorDelegationsRequest):
        QueryValidatorDelegationsResponse = validatorDelegations(request, Metadata())

    public suspend fun validatorDelegations(request: QueryValidatorDelegationsRequest,
        metadata: Metadata): QueryValidatorDelegationsResponse =
        QueryValidatorDelegationsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, validatorDelegationsDescriptor,
    			QueryValidatorDelegationsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun validatorUnbondingDelegations(request: QueryValidatorUnbondingDelegationsRequest):
        QueryValidatorUnbondingDelegationsResponse = validatorUnbondingDelegations(request,
        Metadata())

    public suspend
        fun validatorUnbondingDelegations(request: QueryValidatorUnbondingDelegationsRequest,
        metadata: Metadata): QueryValidatorUnbondingDelegationsResponse =
        QueryValidatorUnbondingDelegationsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, validatorUnbondingDelegationsDescriptor,
    			QueryValidatorUnbondingDelegationsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun delegation(request: QueryDelegationRequest): QueryDelegationResponse
        = delegation(request, Metadata())

    public suspend fun delegation(request: QueryDelegationRequest, metadata: Metadata):
        QueryDelegationResponse = QueryDelegationResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, delegationDescriptor,
    			QueryDelegationRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun unbondingDelegation(request: QueryUnbondingDelegationRequest):
        QueryUnbondingDelegationResponse = unbondingDelegation(request, Metadata())

    public suspend fun unbondingDelegation(request: QueryUnbondingDelegationRequest,
        metadata: Metadata): QueryUnbondingDelegationResponse =
        QueryUnbondingDelegationResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, unbondingDelegationDescriptor,
    			QueryUnbondingDelegationRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun delegatorDelegations(request: QueryDelegatorDelegationsRequest):
        QueryDelegatorDelegationsResponse = delegatorDelegations(request, Metadata())

    public suspend fun delegatorDelegations(request: QueryDelegatorDelegationsRequest,
        metadata: Metadata): QueryDelegatorDelegationsResponse =
        QueryDelegatorDelegationsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, delegatorDelegationsDescriptor,
    			QueryDelegatorDelegationsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun delegatorUnbondingDelegations(request: QueryDelegatorUnbondingDelegationsRequest):
        QueryDelegatorUnbondingDelegationsResponse = delegatorUnbondingDelegations(request,
        Metadata())

    public suspend
        fun delegatorUnbondingDelegations(request: QueryDelegatorUnbondingDelegationsRequest,
        metadata: Metadata): QueryDelegatorUnbondingDelegationsResponse =
        QueryDelegatorUnbondingDelegationsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, delegatorUnbondingDelegationsDescriptor,
    			QueryDelegatorUnbondingDelegationsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun redelegations(request: QueryRedelegationsRequest):
        QueryRedelegationsResponse = redelegations(request, Metadata())

    public suspend fun redelegations(request: QueryRedelegationsRequest, metadata: Metadata):
        QueryRedelegationsResponse = QueryRedelegationsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, redelegationsDescriptor,
    			QueryRedelegationsRequestJvmConverter.convert(request),
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

    public override suspend fun delegatorValidator(request: QueryDelegatorValidatorRequest):
        QueryDelegatorValidatorResponse = delegatorValidator(request, Metadata())

    public suspend fun delegatorValidator(request: QueryDelegatorValidatorRequest,
        metadata: Metadata): QueryDelegatorValidatorResponse =
        QueryDelegatorValidatorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, delegatorValidatorDescriptor,
    			QueryDelegatorValidatorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun historicalInfo(request: QueryHistoricalInfoRequest):
        QueryHistoricalInfoResponse = historicalInfo(request, Metadata())

    public suspend fun historicalInfo(request: QueryHistoricalInfoRequest, metadata: Metadata):
        QueryHistoricalInfoResponse = QueryHistoricalInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, historicalInfoDescriptor,
    			QueryHistoricalInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun pool(request: QueryPoolRequest): QueryPoolResponse = pool(request,
        Metadata())

    public suspend fun pool(request: QueryPoolRequest, metadata: Metadata): QueryPoolResponse =
        QueryPoolResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, poolDescriptor,
    			QueryPoolRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

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
  }
}
