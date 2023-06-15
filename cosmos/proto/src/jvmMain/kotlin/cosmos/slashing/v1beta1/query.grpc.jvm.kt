// Transform from cosmos/slashing/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

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

  private val signingInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySigningInfoRequest, QueryOuterClass.QuerySigningInfoResponse>
      = QueryGrpc.getSigningInfoMethod()!!

  private val signingInfosDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySigningInfosRequest, QueryOuterClass.QuerySigningInfosResponse>
      = QueryGrpc.getSigningInfosMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.slashing.v1beta1.Query.Params is unimplemented"))

    public open override suspend fun signingInfo(request: QuerySigningInfoRequest):
        QuerySigningInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.slashing.v1beta1.Query.SigningInfo is unimplemented"))

    public open override suspend fun signingInfos(request: QuerySigningInfosRequest):
        QuerySigningInfosResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.slashing.v1beta1.Query.SigningInfos is unimplemented"))

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
    				descriptor = signingInfoDescriptor,
    				implementation = {
        QuerySigningInfoResponseJvmConverter.convert(signingInfo(QuerySigningInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = signingInfosDescriptor,
    				implementation = {
        QuerySigningInfosResponseJvmConverter.convert(signingInfos(QuerySigningInfosRequestJvmConverter.convert(it)))
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

    public override suspend fun signingInfo(request: QuerySigningInfoRequest):
        QuerySigningInfoResponse = signingInfo(request, Metadata())

    public suspend fun signingInfo(request: QuerySigningInfoRequest, metadata: Metadata):
        QuerySigningInfoResponse = QuerySigningInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, signingInfoDescriptor,
    			QuerySigningInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun signingInfos(request: QuerySigningInfosRequest):
        QuerySigningInfosResponse = signingInfos(request, Metadata())

    public suspend fun signingInfos(request: QuerySigningInfosRequest, metadata: Metadata):
        QuerySigningInfosResponse = QuerySigningInfosResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, signingInfosDescriptor,
    			QuerySigningInfosRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
