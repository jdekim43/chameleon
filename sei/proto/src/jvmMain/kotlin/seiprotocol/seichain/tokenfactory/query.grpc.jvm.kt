// Transform from tokenfactory/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

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

  private val denomAuthorityMetadataDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDenomAuthorityMetadataRequest, QueryOuterClass.QueryDenomAuthorityMetadataResponse>
      = QueryGrpc.getDenomAuthorityMetadataMethod()!!

  private val denomsFromCreatorDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDenomsFromCreatorRequest, QueryOuterClass.QueryDenomsFromCreatorResponse>
      = QueryGrpc.getDenomsFromCreatorMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.tokenfactory.Query.Params is unimplemented"))

    public open override suspend
        fun denomAuthorityMetadata(request: QueryDenomAuthorityMetadataRequest):
        QueryDenomAuthorityMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.tokenfactory.Query.DenomAuthorityMetadata is unimplemented"))

    public open override suspend fun denomsFromCreator(request: QueryDenomsFromCreatorRequest):
        QueryDenomsFromCreatorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.tokenfactory.Query.DenomsFromCreator is unimplemented"))

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
    				descriptor = denomAuthorityMetadataDescriptor,
    				implementation = {
        QueryDenomAuthorityMetadataResponseJvmConverter.convert(denomAuthorityMetadata(QueryDenomAuthorityMetadataRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = denomsFromCreatorDescriptor,
    				implementation = {
        QueryDenomsFromCreatorResponseJvmConverter.convert(denomsFromCreator(QueryDenomsFromCreatorRequestJvmConverter.convert(it)))
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

    public override suspend fun denomAuthorityMetadata(request: QueryDenomAuthorityMetadataRequest):
        QueryDenomAuthorityMetadataResponse = denomAuthorityMetadata(request, Metadata())

    public suspend fun denomAuthorityMetadata(request: QueryDenomAuthorityMetadataRequest,
        metadata: Metadata): QueryDenomAuthorityMetadataResponse =
        QueryDenomAuthorityMetadataResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, denomAuthorityMetadataDescriptor,
    			QueryDenomAuthorityMetadataRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun denomsFromCreator(request: QueryDenomsFromCreatorRequest):
        QueryDenomsFromCreatorResponse = denomsFromCreator(request, Metadata())

    public suspend fun denomsFromCreator(request: QueryDenomsFromCreatorRequest,
        metadata: Metadata): QueryDenomsFromCreatorResponse =
        QueryDenomsFromCreatorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, denomsFromCreatorDescriptor,
    			QueryDenomsFromCreatorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
