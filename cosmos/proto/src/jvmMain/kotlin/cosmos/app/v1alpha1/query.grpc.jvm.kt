// Transform from cosmos/app/v1alpha1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.v1alpha1

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

  private val configDescriptor:
      MethodDescriptor<QueryOuterClass.QueryConfigRequest, QueryOuterClass.QueryConfigResponse> =
      QueryGrpc.getConfigMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun config(request: QueryConfigRequest): QueryConfigResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.app.v1alpha1.Query.Config is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = configDescriptor,
    				implementation = {
        QueryConfigResponseJvmConverter.convert(config(QueryConfigRequestJvmConverter.convert(it)))
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

    public override suspend fun config(request: QueryConfigRequest): QueryConfigResponse =
        config(request, Metadata())

    public suspend fun config(request: QueryConfigRequest, metadata: Metadata): QueryConfigResponse
        = QueryConfigResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, configDescriptor,
    			QueryConfigRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
