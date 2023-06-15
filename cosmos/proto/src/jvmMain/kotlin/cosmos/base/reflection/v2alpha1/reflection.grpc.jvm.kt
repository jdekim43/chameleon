// Transform from cosmos/base/reflection/v2alpha1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v2alpha1

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

  private val getAuthnDescriptorDescriptor:
      MethodDescriptor<Reflection.GetAuthnDescriptorRequest, Reflection.GetAuthnDescriptorResponse>
      = ReflectionServiceGrpc.getGetAuthnDescriptorMethod()!!

  private val getChainDescriptorDescriptor:
      MethodDescriptor<Reflection.GetChainDescriptorRequest, Reflection.GetChainDescriptorResponse>
      = ReflectionServiceGrpc.getGetChainDescriptorMethod()!!

  private val getCodecDescriptorDescriptor:
      MethodDescriptor<Reflection.GetCodecDescriptorRequest, Reflection.GetCodecDescriptorResponse>
      = ReflectionServiceGrpc.getGetCodecDescriptorMethod()!!

  private val getConfigurationDescriptorDescriptor:
      MethodDescriptor<Reflection.GetConfigurationDescriptorRequest, Reflection.GetConfigurationDescriptorResponse>
      = ReflectionServiceGrpc.getGetConfigurationDescriptorMethod()!!

  private val getQueryServicesDescriptorDescriptor:
      MethodDescriptor<Reflection.GetQueryServicesDescriptorRequest, Reflection.GetQueryServicesDescriptorResponse>
      = ReflectionServiceGrpc.getGetQueryServicesDescriptorMethod()!!

  private val getTxDescriptorDescriptor:
      MethodDescriptor<Reflection.GetTxDescriptorRequest, Reflection.GetTxDescriptorResponse> =
      ReflectionServiceGrpc.getGetTxDescriptorMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), ReflectionService.Interface {
    public open override suspend fun getAuthnDescriptor(request: GetAuthnDescriptorRequest):
        GetAuthnDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetAuthnDescriptor is unimplemented"))

    public open override suspend fun getChainDescriptor(request: GetChainDescriptorRequest):
        GetChainDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetChainDescriptor is unimplemented"))

    public open override suspend fun getCodecDescriptor(request: GetCodecDescriptorRequest):
        GetCodecDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetCodecDescriptor is unimplemented"))

    public open override suspend
        fun getConfigurationDescriptor(request: GetConfigurationDescriptorRequest):
        GetConfigurationDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetConfigurationDescriptor is unimplemented"))

    public open override suspend
        fun getQueryServicesDescriptor(request: GetQueryServicesDescriptorRequest):
        GetQueryServicesDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetQueryServicesDescriptor is unimplemented"))

    public open override suspend fun getTxDescriptor(request: GetTxDescriptorRequest):
        GetTxDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetTxDescriptor is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getAuthnDescriptorDescriptor,
    				implementation = {
        GetAuthnDescriptorResponseJvmConverter.convert(getAuthnDescriptor(GetAuthnDescriptorRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getChainDescriptorDescriptor,
    				implementation = {
        GetChainDescriptorResponseJvmConverter.convert(getChainDescriptor(GetChainDescriptorRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getCodecDescriptorDescriptor,
    				implementation = {
        GetCodecDescriptorResponseJvmConverter.convert(getCodecDescriptor(GetCodecDescriptorRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getConfigurationDescriptorDescriptor,
    				implementation = {
        GetConfigurationDescriptorResponseJvmConverter.convert(getConfigurationDescriptor(GetConfigurationDescriptorRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getQueryServicesDescriptorDescriptor,
    				implementation = {
        GetQueryServicesDescriptorResponseJvmConverter.convert(getQueryServicesDescriptor(GetQueryServicesDescriptorRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getTxDescriptorDescriptor,
    				implementation = {
        GetTxDescriptorResponseJvmConverter.convert(getTxDescriptor(GetTxDescriptorRequestJvmConverter.convert(it)))
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

    public override suspend fun getAuthnDescriptor(request: GetAuthnDescriptorRequest):
        GetAuthnDescriptorResponse = getAuthnDescriptor(request, Metadata())

    public suspend fun getAuthnDescriptor(request: GetAuthnDescriptorRequest, metadata: Metadata):
        GetAuthnDescriptorResponse = GetAuthnDescriptorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getAuthnDescriptorDescriptor,
    			GetAuthnDescriptorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getChainDescriptor(request: GetChainDescriptorRequest):
        GetChainDescriptorResponse = getChainDescriptor(request, Metadata())

    public suspend fun getChainDescriptor(request: GetChainDescriptorRequest, metadata: Metadata):
        GetChainDescriptorResponse = GetChainDescriptorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getChainDescriptorDescriptor,
    			GetChainDescriptorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getCodecDescriptor(request: GetCodecDescriptorRequest):
        GetCodecDescriptorResponse = getCodecDescriptor(request, Metadata())

    public suspend fun getCodecDescriptor(request: GetCodecDescriptorRequest, metadata: Metadata):
        GetCodecDescriptorResponse = GetCodecDescriptorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getCodecDescriptorDescriptor,
    			GetCodecDescriptorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun getConfigurationDescriptor(request: GetConfigurationDescriptorRequest):
        GetConfigurationDescriptorResponse = getConfigurationDescriptor(request, Metadata())

    public suspend fun getConfigurationDescriptor(request: GetConfigurationDescriptorRequest,
        metadata: Metadata): GetConfigurationDescriptorResponse =
        GetConfigurationDescriptorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getConfigurationDescriptorDescriptor,
    			GetConfigurationDescriptorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun getQueryServicesDescriptor(request: GetQueryServicesDescriptorRequest):
        GetQueryServicesDescriptorResponse = getQueryServicesDescriptor(request, Metadata())

    public suspend fun getQueryServicesDescriptor(request: GetQueryServicesDescriptorRequest,
        metadata: Metadata): GetQueryServicesDescriptorResponse =
        GetQueryServicesDescriptorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getQueryServicesDescriptorDescriptor,
    			GetQueryServicesDescriptorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getTxDescriptor(request: GetTxDescriptorRequest):
        GetTxDescriptorResponse = getTxDescriptor(request, Metadata())

    public suspend fun getTxDescriptor(request: GetTxDescriptorRequest, metadata: Metadata):
        GetTxDescriptorResponse = GetTxDescriptorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getTxDescriptorDescriptor,
    			GetTxDescriptorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
