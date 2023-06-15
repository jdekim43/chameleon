// Transform from terra/market/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.market.v1beta1

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

  private val swapDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySwapRequest, QueryOuterClass.QuerySwapResponse> =
      QueryGrpc.getSwapMethod()!!

  private val terraPoolDeltaDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTerraPoolDeltaRequest, QueryOuterClass.QueryTerraPoolDeltaResponse>
      = QueryGrpc.getTerraPoolDeltaMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun swap(request: QuerySwapRequest): QuerySwapResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.market.v1beta1.Query.Swap is unimplemented"))

    public open override suspend fun terraPoolDelta(request: QueryTerraPoolDeltaRequest):
        QueryTerraPoolDeltaResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.market.v1beta1.Query.TerraPoolDelta is unimplemented"))

    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.market.v1beta1.Query.Params is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = swapDescriptor,
    				implementation = {
        QuerySwapResponseJvmConverter.convert(swap(QuerySwapRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = terraPoolDeltaDescriptor,
    				implementation = {
        QueryTerraPoolDeltaResponseJvmConverter.convert(terraPoolDelta(QueryTerraPoolDeltaRequestJvmConverter.convert(it)))
        },
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

    public override suspend fun swap(request: QuerySwapRequest): QuerySwapResponse = swap(request,
        Metadata())

    public suspend fun swap(request: QuerySwapRequest, metadata: Metadata): QuerySwapResponse =
        QuerySwapResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, swapDescriptor,
    			QuerySwapRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun terraPoolDelta(request: QueryTerraPoolDeltaRequest):
        QueryTerraPoolDeltaResponse = terraPoolDelta(request, Metadata())

    public suspend fun terraPoolDelta(request: QueryTerraPoolDeltaRequest, metadata: Metadata):
        QueryTerraPoolDeltaResponse = QueryTerraPoolDeltaResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, terraPoolDeltaDescriptor,
    			QueryTerraPoolDeltaRequestJvmConverter.convert(request),
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
