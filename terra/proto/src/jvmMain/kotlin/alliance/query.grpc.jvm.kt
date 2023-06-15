// Transform from alliance/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package alliance

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

  private val alliancesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAlliancesRequest, QueryOuterClass.QueryAlliancesResponse>
      = QueryGrpc.getAlliancesMethod()!!

  private val iBCAllianceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryIBCAllianceRequest, QueryOuterClass.QueryAllianceResponse>
      = QueryGrpc.getIBCAllianceMethod()!!

  private val allAlliancesDelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllAlliancesDelegationsRequest, QueryOuterClass.QueryAlliancesDelegationsResponse>
      = QueryGrpc.getAllAlliancesDelegationsMethod()!!

  private val allianceValidatorDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllianceValidatorRequest, QueryOuterClass.QueryAllianceValidatorResponse>
      = QueryGrpc.getAllianceValidatorMethod()!!

  private val allAllianceValidatorsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllAllianceValidatorsRequest, QueryOuterClass.QueryAllianceValidatorsResponse>
      = QueryGrpc.getAllAllianceValidatorsMethod()!!

  private val alliancesDelegationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAlliancesDelegationsRequest, QueryOuterClass.QueryAlliancesDelegationsResponse>
      = QueryGrpc.getAlliancesDelegationMethod()!!

  private val alliancesDelegationByValidatorDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAlliancesDelegationByValidatorRequest, QueryOuterClass.QueryAlliancesDelegationsResponse>
      = QueryGrpc.getAlliancesDelegationByValidatorMethod()!!

  private val allianceDelegationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllianceDelegationRequest, QueryOuterClass.QueryAllianceDelegationResponse>
      = QueryGrpc.getAllianceDelegationMethod()!!

  private val iBCAllianceDelegationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryIBCAllianceDelegationRequest, QueryOuterClass.QueryAllianceDelegationResponse>
      = QueryGrpc.getIBCAllianceDelegationMethod()!!

  private val allianceDelegationRewardsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllianceDelegationRewardsRequest, QueryOuterClass.QueryAllianceDelegationRewardsResponse>
      = QueryGrpc.getAllianceDelegationRewardsMethod()!!

  private val iBCAllianceDelegationRewardsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryIBCAllianceDelegationRewardsRequest, QueryOuterClass.QueryAllianceDelegationRewardsResponse>
      = QueryGrpc.getIBCAllianceDelegationRewardsMethod()!!

  private val allianceUnbondingsByDenomAndDelegatorDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorRequest, QueryOuterClass.QueryAllianceUnbondingsByDenomAndDelegatorResponse>
      = QueryGrpc.getAllianceUnbondingsByDenomAndDelegatorMethod()!!

  private val allianceUnbondingsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllianceUnbondingsRequest, QueryOuterClass.QueryAllianceUnbondingsResponse>
      = QueryGrpc.getAllianceUnbondingsMethod()!!

  private val allianceRedelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllianceRedelegationsRequest, QueryOuterClass.QueryAllianceRedelegationsResponse>
      = QueryGrpc.getAllianceRedelegationsMethod()!!

  private val allianceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllianceRequest, QueryOuterClass.QueryAllianceResponse>
      = QueryGrpc.getAllianceMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.Params is unimplemented"))

    public open override suspend fun alliances(request: QueryAlliancesRequest):
        QueryAlliancesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.Alliances is unimplemented"))

    public open override suspend fun iBCAlliance(request: QueryIBCAllianceRequest):
        QueryAllianceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.IBCAlliance is unimplemented"))

    public open override suspend
        fun allAlliancesDelegations(request: QueryAllAlliancesDelegationsRequest):
        QueryAlliancesDelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.AllAlliancesDelegations is unimplemented"))

    public open override suspend fun allianceValidator(request: QueryAllianceValidatorRequest):
        QueryAllianceValidatorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.AllianceValidator is unimplemented"))

    public open override suspend
        fun allAllianceValidators(request: QueryAllAllianceValidatorsRequest):
        QueryAllianceValidatorsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.AllAllianceValidators is unimplemented"))

    public open override suspend fun alliancesDelegation(request: QueryAlliancesDelegationsRequest):
        QueryAlliancesDelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.AlliancesDelegation is unimplemented"))

    public open override suspend
        fun alliancesDelegationByValidator(request: QueryAlliancesDelegationByValidatorRequest):
        QueryAlliancesDelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.AlliancesDelegationByValidator is unimplemented"))

    public open override suspend fun allianceDelegation(request: QueryAllianceDelegationRequest):
        QueryAllianceDelegationResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.AllianceDelegation is unimplemented"))

    public open override suspend
        fun iBCAllianceDelegation(request: QueryIBCAllianceDelegationRequest):
        QueryAllianceDelegationResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.IBCAllianceDelegation is unimplemented"))

    public open override suspend
        fun allianceDelegationRewards(request: QueryAllianceDelegationRewardsRequest):
        QueryAllianceDelegationRewardsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.AllianceDelegationRewards is unimplemented"))

    public open override suspend
        fun iBCAllianceDelegationRewards(request: QueryIBCAllianceDelegationRewardsRequest):
        QueryAllianceDelegationRewardsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.IBCAllianceDelegationRewards is unimplemented"))

    public open override suspend
        fun allianceUnbondingsByDenomAndDelegator(request: QueryAllianceUnbondingsByDenomAndDelegatorRequest):
        QueryAllianceUnbondingsByDenomAndDelegatorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.AllianceUnbondingsByDenomAndDelegator is unimplemented"))

    public open override suspend fun allianceUnbondings(request: QueryAllianceUnbondingsRequest):
        QueryAllianceUnbondingsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.AllianceUnbondings is unimplemented"))

    public open override suspend
        fun allianceRedelegations(request: QueryAllianceRedelegationsRequest):
        QueryAllianceRedelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.AllianceRedelegations is unimplemented"))

    public open override suspend fun alliance(request: QueryAllianceRequest): QueryAllianceResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Query.Alliance is unimplemented"))

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
    				descriptor = alliancesDescriptor,
    				implementation = {
        QueryAlliancesResponseJvmConverter.convert(alliances(QueryAlliancesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = iBCAllianceDescriptor,
    				implementation = {
        QueryAllianceResponseJvmConverter.convert(iBCAlliance(QueryIBCAllianceRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allAlliancesDelegationsDescriptor,
    				implementation = {
        QueryAlliancesDelegationsResponseJvmConverter.convert(allAlliancesDelegations(QueryAllAlliancesDelegationsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allianceValidatorDescriptor,
    				implementation = {
        QueryAllianceValidatorResponseJvmConverter.convert(allianceValidator(QueryAllianceValidatorRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allAllianceValidatorsDescriptor,
    				implementation = {
        QueryAllianceValidatorsResponseJvmConverter.convert(allAllianceValidators(QueryAllAllianceValidatorsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = alliancesDelegationDescriptor,
    				implementation = {
        QueryAlliancesDelegationsResponseJvmConverter.convert(alliancesDelegation(QueryAlliancesDelegationsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = alliancesDelegationByValidatorDescriptor,
    				implementation = {
        QueryAlliancesDelegationsResponseJvmConverter.convert(alliancesDelegationByValidator(QueryAlliancesDelegationByValidatorRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allianceDelegationDescriptor,
    				implementation = {
        QueryAllianceDelegationResponseJvmConverter.convert(allianceDelegation(QueryAllianceDelegationRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = iBCAllianceDelegationDescriptor,
    				implementation = {
        QueryAllianceDelegationResponseJvmConverter.convert(iBCAllianceDelegation(QueryIBCAllianceDelegationRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allianceDelegationRewardsDescriptor,
    				implementation = {
        QueryAllianceDelegationRewardsResponseJvmConverter.convert(allianceDelegationRewards(QueryAllianceDelegationRewardsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = iBCAllianceDelegationRewardsDescriptor,
    				implementation = {
        QueryAllianceDelegationRewardsResponseJvmConverter.convert(iBCAllianceDelegationRewards(QueryIBCAllianceDelegationRewardsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allianceUnbondingsByDenomAndDelegatorDescriptor,
    				implementation = {
        QueryAllianceUnbondingsByDenomAndDelegatorResponseJvmConverter.convert(allianceUnbondingsByDenomAndDelegator(QueryAllianceUnbondingsByDenomAndDelegatorRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allianceUnbondingsDescriptor,
    				implementation = {
        QueryAllianceUnbondingsResponseJvmConverter.convert(allianceUnbondings(QueryAllianceUnbondingsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allianceRedelegationsDescriptor,
    				implementation = {
        QueryAllianceRedelegationsResponseJvmConverter.convert(allianceRedelegations(QueryAllianceRedelegationsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allianceDescriptor,
    				implementation = {
        QueryAllianceResponseJvmConverter.convert(alliance(QueryAllianceRequestJvmConverter.convert(it)))
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

    public override suspend fun alliances(request: QueryAlliancesRequest): QueryAlliancesResponse =
        alliances(request, Metadata())

    public suspend fun alliances(request: QueryAlliancesRequest, metadata: Metadata):
        QueryAlliancesResponse = QueryAlliancesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, alliancesDescriptor,
    			QueryAlliancesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun iBCAlliance(request: QueryIBCAllianceRequest): QueryAllianceResponse
        = iBCAlliance(request, Metadata())

    public suspend fun iBCAlliance(request: QueryIBCAllianceRequest, metadata: Metadata):
        QueryAllianceResponse = QueryAllianceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, iBCAllianceDescriptor,
    			QueryIBCAllianceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun allAlliancesDelegations(request: QueryAllAlliancesDelegationsRequest):
        QueryAlliancesDelegationsResponse = allAlliancesDelegations(request, Metadata())

    public suspend fun allAlliancesDelegations(request: QueryAllAlliancesDelegationsRequest,
        metadata: Metadata): QueryAlliancesDelegationsResponse =
        QueryAlliancesDelegationsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allAlliancesDelegationsDescriptor,
    			QueryAllAlliancesDelegationsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun allianceValidator(request: QueryAllianceValidatorRequest):
        QueryAllianceValidatorResponse = allianceValidator(request, Metadata())

    public suspend fun allianceValidator(request: QueryAllianceValidatorRequest,
        metadata: Metadata): QueryAllianceValidatorResponse =
        QueryAllianceValidatorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allianceValidatorDescriptor,
    			QueryAllianceValidatorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun allAllianceValidators(request: QueryAllAllianceValidatorsRequest):
        QueryAllianceValidatorsResponse = allAllianceValidators(request, Metadata())

    public suspend fun allAllianceValidators(request: QueryAllAllianceValidatorsRequest,
        metadata: Metadata): QueryAllianceValidatorsResponse =
        QueryAllianceValidatorsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allAllianceValidatorsDescriptor,
    			QueryAllAllianceValidatorsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun alliancesDelegation(request: QueryAlliancesDelegationsRequest):
        QueryAlliancesDelegationsResponse = alliancesDelegation(request, Metadata())

    public suspend fun alliancesDelegation(request: QueryAlliancesDelegationsRequest,
        metadata: Metadata): QueryAlliancesDelegationsResponse =
        QueryAlliancesDelegationsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, alliancesDelegationDescriptor,
    			QueryAlliancesDelegationsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun alliancesDelegationByValidator(request: QueryAlliancesDelegationByValidatorRequest):
        QueryAlliancesDelegationsResponse = alliancesDelegationByValidator(request, Metadata())

    public suspend
        fun alliancesDelegationByValidator(request: QueryAlliancesDelegationByValidatorRequest,
        metadata: Metadata): QueryAlliancesDelegationsResponse =
        QueryAlliancesDelegationsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, alliancesDelegationByValidatorDescriptor,
    			QueryAlliancesDelegationByValidatorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun allianceDelegation(request: QueryAllianceDelegationRequest):
        QueryAllianceDelegationResponse = allianceDelegation(request, Metadata())

    public suspend fun allianceDelegation(request: QueryAllianceDelegationRequest,
        metadata: Metadata): QueryAllianceDelegationResponse =
        QueryAllianceDelegationResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allianceDelegationDescriptor,
    			QueryAllianceDelegationRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun iBCAllianceDelegation(request: QueryIBCAllianceDelegationRequest):
        QueryAllianceDelegationResponse = iBCAllianceDelegation(request, Metadata())

    public suspend fun iBCAllianceDelegation(request: QueryIBCAllianceDelegationRequest,
        metadata: Metadata): QueryAllianceDelegationResponse =
        QueryAllianceDelegationResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, iBCAllianceDelegationDescriptor,
    			QueryIBCAllianceDelegationRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun allianceDelegationRewards(request: QueryAllianceDelegationRewardsRequest):
        QueryAllianceDelegationRewardsResponse = allianceDelegationRewards(request, Metadata())

    public suspend fun allianceDelegationRewards(request: QueryAllianceDelegationRewardsRequest,
        metadata: Metadata): QueryAllianceDelegationRewardsResponse =
        QueryAllianceDelegationRewardsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allianceDelegationRewardsDescriptor,
    			QueryAllianceDelegationRewardsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun iBCAllianceDelegationRewards(request: QueryIBCAllianceDelegationRewardsRequest):
        QueryAllianceDelegationRewardsResponse = iBCAllianceDelegationRewards(request, Metadata())

    public suspend
        fun iBCAllianceDelegationRewards(request: QueryIBCAllianceDelegationRewardsRequest,
        metadata: Metadata): QueryAllianceDelegationRewardsResponse =
        QueryAllianceDelegationRewardsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, iBCAllianceDelegationRewardsDescriptor,
    			QueryIBCAllianceDelegationRewardsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun allianceUnbondingsByDenomAndDelegator(request: QueryAllianceUnbondingsByDenomAndDelegatorRequest):
        QueryAllianceUnbondingsByDenomAndDelegatorResponse =
        allianceUnbondingsByDenomAndDelegator(request, Metadata())

    public suspend
        fun allianceUnbondingsByDenomAndDelegator(request: QueryAllianceUnbondingsByDenomAndDelegatorRequest,
        metadata: Metadata): QueryAllianceUnbondingsByDenomAndDelegatorResponse =
        QueryAllianceUnbondingsByDenomAndDelegatorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allianceUnbondingsByDenomAndDelegatorDescriptor,
    			QueryAllianceUnbondingsByDenomAndDelegatorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun allianceUnbondings(request: QueryAllianceUnbondingsRequest):
        QueryAllianceUnbondingsResponse = allianceUnbondings(request, Metadata())

    public suspend fun allianceUnbondings(request: QueryAllianceUnbondingsRequest,
        metadata: Metadata): QueryAllianceUnbondingsResponse =
        QueryAllianceUnbondingsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allianceUnbondingsDescriptor,
    			QueryAllianceUnbondingsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun allianceRedelegations(request: QueryAllianceRedelegationsRequest):
        QueryAllianceRedelegationsResponse = allianceRedelegations(request, Metadata())

    public suspend fun allianceRedelegations(request: QueryAllianceRedelegationsRequest,
        metadata: Metadata): QueryAllianceRedelegationsResponse =
        QueryAllianceRedelegationsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allianceRedelegationsDescriptor,
    			QueryAllianceRedelegationsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun alliance(request: QueryAllianceRequest): QueryAllianceResponse =
        alliance(request, Metadata())

    public suspend fun alliance(request: QueryAllianceRequest, metadata: Metadata):
        QueryAllianceResponse = QueryAllianceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allianceDescriptor,
    			QueryAllianceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
