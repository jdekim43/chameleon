// Transform from cosmos/base/node/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.node.v1beta1

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

  private val configDescriptor: MethodDescriptor<Query.ConfigRequest, Query.ConfigResponse> =
      ServiceGrpc.getConfigMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Service.Interface {
    public open override suspend fun config(request: ConfigRequest): ConfigResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.node.v1beta1.Service.Config is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = configDescriptor,
    				implementation = {
        ConfigResponseJvmConverter.convert(config(ConfigRequestJvmConverter.convert(it))) },
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

    public override suspend fun config(request: ConfigRequest): ConfigResponse = config(request,
        Metadata())

    public suspend fun config(request: ConfigRequest, metadata: Metadata): ConfigResponse =
        ConfigResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, configDescriptor,
    			ConfigRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
