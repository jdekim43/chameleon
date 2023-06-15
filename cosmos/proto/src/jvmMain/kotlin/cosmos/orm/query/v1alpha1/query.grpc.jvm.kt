// Transform from cosmos/orm/query/v1alpha1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.orm.query.v1alpha1

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

  private val getDescriptor:
      MethodDescriptor<QueryOuterClass.GetRequest, QueryOuterClass.GetResponse> =
      QueryGrpc.getGetMethod()!!

  private val listDescriptor:
      MethodDescriptor<QueryOuterClass.ListRequest, QueryOuterClass.ListResponse> =
      QueryGrpc.getListMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun `get`(request: GetRequest): GetResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.orm.query.v1alpha1.Query.Get is unimplemented"))

    public open override suspend fun list(request: ListRequest): ListResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.orm.query.v1alpha1.Query.List is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getDescriptor,
    				implementation = {
        GetResponseJvmConverter.convert(`get`(GetRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = listDescriptor,
    				implementation = {
        ListResponseJvmConverter.convert(list(ListRequestJvmConverter.convert(it))) },
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

    public override suspend fun `get`(request: GetRequest): GetResponse = `get`(request, Metadata())

    public suspend fun `get`(request: GetRequest, metadata: Metadata): GetResponse =
        GetResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getDescriptor,
    			GetRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun list(request: ListRequest): ListResponse = list(request, Metadata())

    public suspend fun list(request: ListRequest, metadata: Metadata): ListResponse =
        ListResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, listDescriptor,
    			ListRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
