// Transform from terra/tx/v1beta1/service.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.tx.v1beta1

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

  private val computeTaxDescriptor:
      MethodDescriptor<ServiceOuterClass.ComputeTaxRequest, ServiceOuterClass.ComputeTaxResponse> =
      ServiceGrpc.getComputeTaxMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Service.Interface {
    public open override suspend fun computeTax(request: ComputeTaxRequest): ComputeTaxResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.tx.v1beta1.Service.ComputeTax is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = computeTaxDescriptor,
    				implementation = {
        ComputeTaxResponseJvmConverter.convert(computeTax(ComputeTaxRequestJvmConverter.convert(it)))
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

    public override suspend fun computeTax(request: ComputeTaxRequest): ComputeTaxResponse =
        computeTax(request, Metadata())

    public suspend fun computeTax(request: ComputeTaxRequest, metadata: Metadata):
        ComputeTaxResponse = ComputeTaxResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, computeTaxDescriptor,
    			ComputeTaxRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
