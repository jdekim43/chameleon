// Transform from cosmos/base/reflection/v1beta1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v1beta1

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

public object ReflectionServiceJvm {
  private val descriptor: ServiceDescriptor = ReflectionServiceGrpc.getServiceDescriptor()!!

  private val listAllInterfacesDescriptor:
      MethodDescriptor<Reflection.ListAllInterfacesRequest, Reflection.ListAllInterfacesResponse> =
      ReflectionServiceGrpc.getListAllInterfacesMethod()!!

  private val listImplementationsDescriptor:
      MethodDescriptor<Reflection.ListImplementationsRequest, Reflection.ListImplementationsResponse>
      = ReflectionServiceGrpc.getListImplementationsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), ReflectionService.Interface {
    public open override suspend fun listAllInterfaces(request: ListAllInterfacesRequest):
        ListAllInterfacesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v1beta1.ReflectionService.ListAllInterfaces is unimplemented"))

    public open override suspend fun listImplementations(request: ListImplementationsRequest):
        ListImplementationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v1beta1.ReflectionService.ListImplementations is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = listAllInterfacesDescriptor,
    				implementation = {
        ListAllInterfacesResponseJvmConverter.convert(listAllInterfaces(ListAllInterfacesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = listImplementationsDescriptor,
    				implementation = {
        ListImplementationsResponseJvmConverter.convert(listImplementations(ListImplementationsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<ReflectionService.Client>(channel = option.channel, callOptions =
      option.callOptions), ReflectionService.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): ReflectionService.Client
        = ReflectionService.Client(ClientOption(channel, callOptions))

    public override suspend fun listAllInterfaces(request: ListAllInterfacesRequest):
        ListAllInterfacesResponse = listAllInterfaces(request, Metadata())

    public suspend fun listAllInterfaces(request: ListAllInterfacesRequest, metadata: Metadata):
        ListAllInterfacesResponse = ListAllInterfacesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, listAllInterfacesDescriptor,
    			ListAllInterfacesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun listImplementations(request: ListImplementationsRequest):
        ListImplementationsResponse = listImplementations(request, Metadata())

    public suspend fun listImplementations(request: ListImplementationsRequest, metadata: Metadata):
        ListImplementationsResponse = ListImplementationsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, listImplementationsDescriptor,
    			ListImplementationsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
