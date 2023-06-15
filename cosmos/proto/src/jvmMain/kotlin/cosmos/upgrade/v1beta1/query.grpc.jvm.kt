// Transform from cosmos/upgrade/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

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

  private val currentPlanDescriptor:
      MethodDescriptor<QueryOuterClass.QueryCurrentPlanRequest, QueryOuterClass.QueryCurrentPlanResponse>
      = QueryGrpc.getCurrentPlanMethod()!!

  private val appliedPlanDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAppliedPlanRequest, QueryOuterClass.QueryAppliedPlanResponse>
      = QueryGrpc.getAppliedPlanMethod()!!

  private val upgradedConsensusStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryUpgradedConsensusStateRequest, QueryOuterClass.QueryUpgradedConsensusStateResponse>
      = QueryGrpc.getUpgradedConsensusStateMethod()!!

  private val moduleVersionsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleVersionsRequest, QueryOuterClass.QueryModuleVersionsResponse>
      = QueryGrpc.getModuleVersionsMethod()!!

  private val authorityDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAuthorityRequest, QueryOuterClass.QueryAuthorityResponse>
      = QueryGrpc.getAuthorityMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun currentPlan(request: QueryCurrentPlanRequest):
        QueryCurrentPlanResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Query.CurrentPlan is unimplemented"))

    public open override suspend fun appliedPlan(request: QueryAppliedPlanRequest):
        QueryAppliedPlanResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Query.AppliedPlan is unimplemented"))

    public open override suspend
        fun upgradedConsensusState(request: QueryUpgradedConsensusStateRequest):
        QueryUpgradedConsensusStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Query.UpgradedConsensusState is unimplemented"))

    public open override suspend fun moduleVersions(request: QueryModuleVersionsRequest):
        QueryModuleVersionsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Query.ModuleVersions is unimplemented"))

    public open override suspend fun authority(request: QueryAuthorityRequest):
        QueryAuthorityResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Query.Authority is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = currentPlanDescriptor,
    				implementation = {
        QueryCurrentPlanResponseJvmConverter.convert(currentPlan(QueryCurrentPlanRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = appliedPlanDescriptor,
    				implementation = {
        QueryAppliedPlanResponseJvmConverter.convert(appliedPlan(QueryAppliedPlanRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = upgradedConsensusStateDescriptor,
    				implementation = {
        QueryUpgradedConsensusStateResponseJvmConverter.convert(upgradedConsensusState(QueryUpgradedConsensusStateRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = moduleVersionsDescriptor,
    				implementation = {
        QueryModuleVersionsResponseJvmConverter.convert(moduleVersions(QueryModuleVersionsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = authorityDescriptor,
    				implementation = {
        QueryAuthorityResponseJvmConverter.convert(authority(QueryAuthorityRequestJvmConverter.convert(it)))
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

    public override suspend fun currentPlan(request: QueryCurrentPlanRequest):
        QueryCurrentPlanResponse = currentPlan(request, Metadata())

    public suspend fun currentPlan(request: QueryCurrentPlanRequest, metadata: Metadata):
        QueryCurrentPlanResponse = QueryCurrentPlanResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, currentPlanDescriptor,
    			QueryCurrentPlanRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun appliedPlan(request: QueryAppliedPlanRequest):
        QueryAppliedPlanResponse = appliedPlan(request, Metadata())

    public suspend fun appliedPlan(request: QueryAppliedPlanRequest, metadata: Metadata):
        QueryAppliedPlanResponse = QueryAppliedPlanResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, appliedPlanDescriptor,
    			QueryAppliedPlanRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun upgradedConsensusState(request: QueryUpgradedConsensusStateRequest):
        QueryUpgradedConsensusStateResponse = upgradedConsensusState(request, Metadata())

    public suspend fun upgradedConsensusState(request: QueryUpgradedConsensusStateRequest,
        metadata: Metadata): QueryUpgradedConsensusStateResponse =
        QueryUpgradedConsensusStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, upgradedConsensusStateDescriptor,
    			QueryUpgradedConsensusStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun moduleVersions(request: QueryModuleVersionsRequest):
        QueryModuleVersionsResponse = moduleVersions(request, Metadata())

    public suspend fun moduleVersions(request: QueryModuleVersionsRequest, metadata: Metadata):
        QueryModuleVersionsResponse = QueryModuleVersionsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, moduleVersionsDescriptor,
    			QueryModuleVersionsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun authority(request: QueryAuthorityRequest): QueryAuthorityResponse =
        authority(request, Metadata())

    public suspend fun authority(request: QueryAuthorityRequest, metadata: Metadata):
        QueryAuthorityResponse = QueryAuthorityResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, authorityDescriptor,
    			QueryAuthorityRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
