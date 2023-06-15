// Transform from cosmos/base/tendermint/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.tendermint.v1beta1

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

public object ServiceJvm {
  private val descriptor: ServiceDescriptor = ServiceGrpc.getServiceDescriptor()!!

  private val getNodeInfoDescriptor:
      MethodDescriptor<Query.GetNodeInfoRequest, Query.GetNodeInfoResponse> =
      ServiceGrpc.getGetNodeInfoMethod()!!

  private val getSyncingDescriptor:
      MethodDescriptor<Query.GetSyncingRequest, Query.GetSyncingResponse> =
      ServiceGrpc.getGetSyncingMethod()!!

  private val getLatestBlockDescriptor:
      MethodDescriptor<Query.GetLatestBlockRequest, Query.GetLatestBlockResponse> =
      ServiceGrpc.getGetLatestBlockMethod()!!

  private val getBlockByHeightDescriptor:
      MethodDescriptor<Query.GetBlockByHeightRequest, Query.GetBlockByHeightResponse> =
      ServiceGrpc.getGetBlockByHeightMethod()!!

  private val getLatestValidatorSetDescriptor:
      MethodDescriptor<Query.GetLatestValidatorSetRequest, Query.GetLatestValidatorSetResponse> =
      ServiceGrpc.getGetLatestValidatorSetMethod()!!

  private val getValidatorSetByHeightDescriptor:
      MethodDescriptor<Query.GetValidatorSetByHeightRequest, Query.GetValidatorSetByHeightResponse>
      = ServiceGrpc.getGetValidatorSetByHeightMethod()!!

  private val aBCIQueryDescriptor: MethodDescriptor<Query.ABCIQueryRequest, Query.ABCIQueryResponse>
      = ServiceGrpc.getABCIQueryMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Service.Interface {
    public open override suspend fun getNodeInfo(request: GetNodeInfoRequest): GetNodeInfoResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetNodeInfo is unimplemented"))

    public open override suspend fun getSyncing(request: GetSyncingRequest): GetSyncingResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetSyncing is unimplemented"))

    public open override suspend fun getLatestBlock(request: GetLatestBlockRequest):
        GetLatestBlockResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetLatestBlock is unimplemented"))

    public open override suspend fun getBlockByHeight(request: GetBlockByHeightRequest):
        GetBlockByHeightResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetBlockByHeight is unimplemented"))

    public open override suspend fun getLatestValidatorSet(request: GetLatestValidatorSetRequest):
        GetLatestValidatorSetResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetLatestValidatorSet is unimplemented"))

    public open override suspend
        fun getValidatorSetByHeight(request: GetValidatorSetByHeightRequest):
        GetValidatorSetByHeightResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetValidatorSetByHeight is unimplemented"))

    public open override suspend fun aBCIQuery(request: ABCIQueryRequest): ABCIQueryResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.ABCIQuery is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getNodeInfoDescriptor,
    				implementation = {
        GetNodeInfoResponseJvmConverter.convert(getNodeInfo(GetNodeInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getSyncingDescriptor,
    				implementation = {
        GetSyncingResponseJvmConverter.convert(getSyncing(GetSyncingRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getLatestBlockDescriptor,
    				implementation = {
        GetLatestBlockResponseJvmConverter.convert(getLatestBlock(GetLatestBlockRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getBlockByHeightDescriptor,
    				implementation = {
        GetBlockByHeightResponseJvmConverter.convert(getBlockByHeight(GetBlockByHeightRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getLatestValidatorSetDescriptor,
    				implementation = {
        GetLatestValidatorSetResponseJvmConverter.convert(getLatestValidatorSet(GetLatestValidatorSetRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getValidatorSetByHeightDescriptor,
    				implementation = {
        GetValidatorSetByHeightResponseJvmConverter.convert(getValidatorSetByHeight(GetValidatorSetByHeightRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = aBCIQueryDescriptor,
    				implementation = {
        ABCIQueryResponseJvmConverter.convert(aBCIQuery(ABCIQueryRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Service.Client>(channel = option.channel, callOptions =
      option.callOptions), Service.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Service.Client =
        Service.Client(ClientOption(channel, callOptions))

    public override suspend fun getNodeInfo(request: GetNodeInfoRequest): GetNodeInfoResponse =
        getNodeInfo(request, Metadata())

    public suspend fun getNodeInfo(request: GetNodeInfoRequest, metadata: Metadata):
        GetNodeInfoResponse = GetNodeInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getNodeInfoDescriptor,
    			GetNodeInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getSyncing(request: GetSyncingRequest): GetSyncingResponse =
        getSyncing(request, Metadata())

    public suspend fun getSyncing(request: GetSyncingRequest, metadata: Metadata):
        GetSyncingResponse = GetSyncingResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getSyncingDescriptor,
    			GetSyncingRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getLatestBlock(request: GetLatestBlockRequest):
        GetLatestBlockResponse = getLatestBlock(request, Metadata())

    public suspend fun getLatestBlock(request: GetLatestBlockRequest, metadata: Metadata):
        GetLatestBlockResponse = GetLatestBlockResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getLatestBlockDescriptor,
    			GetLatestBlockRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getBlockByHeight(request: GetBlockByHeightRequest):
        GetBlockByHeightResponse = getBlockByHeight(request, Metadata())

    public suspend fun getBlockByHeight(request: GetBlockByHeightRequest, metadata: Metadata):
        GetBlockByHeightResponse = GetBlockByHeightResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getBlockByHeightDescriptor,
    			GetBlockByHeightRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getLatestValidatorSet(request: GetLatestValidatorSetRequest):
        GetLatestValidatorSetResponse = getLatestValidatorSet(request, Metadata())

    public suspend fun getLatestValidatorSet(request: GetLatestValidatorSetRequest,
        metadata: Metadata): GetLatestValidatorSetResponse =
        GetLatestValidatorSetResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getLatestValidatorSetDescriptor,
    			GetLatestValidatorSetRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getValidatorSetByHeight(request: GetValidatorSetByHeightRequest):
        GetValidatorSetByHeightResponse = getValidatorSetByHeight(request, Metadata())

    public suspend fun getValidatorSetByHeight(request: GetValidatorSetByHeightRequest,
        metadata: Metadata): GetValidatorSetByHeightResponse =
        GetValidatorSetByHeightResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getValidatorSetByHeightDescriptor,
    			GetValidatorSetByHeightRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun aBCIQuery(request: ABCIQueryRequest): ABCIQueryResponse =
        aBCIQuery(request, Metadata())

    public suspend fun aBCIQuery(request: ABCIQueryRequest, metadata: Metadata): ABCIQueryResponse =
        ABCIQueryResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, aBCIQueryDescriptor,
    			ABCIQueryRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
