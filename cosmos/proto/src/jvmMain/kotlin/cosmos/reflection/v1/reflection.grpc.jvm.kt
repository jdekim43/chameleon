// Transform from cosmos/reflection/v1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.reflection.v1

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

  private val fileDescriptorsDescriptor:
      MethodDescriptor<Reflection.FileDescriptorsRequest, Reflection.FileDescriptorsResponse> =
      ReflectionServiceGrpc.getFileDescriptorsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), ReflectionService.Interface {
    public open override suspend fun fileDescriptors(request: FileDescriptorsRequest):
        FileDescriptorsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.reflection.v1.ReflectionService.FileDescriptors is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = fileDescriptorsDescriptor,
    				implementation = {
        FileDescriptorsResponseJvmConverter.convert(fileDescriptors(FileDescriptorsRequestJvmConverter.convert(it)))
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

    public override suspend fun fileDescriptors(request: FileDescriptorsRequest):
        FileDescriptorsResponse = fileDescriptors(request, Metadata())

    public suspend fun fileDescriptors(request: FileDescriptorsRequest, metadata: Metadata):
        FileDescriptorsResponse = FileDescriptorsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, fileDescriptorsDescriptor,
    			FileDescriptorsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
