// Transform from terra/market/v1beta1/tx.proto
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

public object MsgJvm {
  private val descriptor: ServiceDescriptor = MsgGrpc.getServiceDescriptor()!!

  private val swapDescriptor: MethodDescriptor<Tx.MsgSwap, Tx.MsgSwapResponse> =
      MsgGrpc.getSwapMethod()!!

  private val swapSendDescriptor: MethodDescriptor<Tx.MsgSwapSend, Tx.MsgSwapSendResponse> =
      MsgGrpc.getSwapSendMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun swap(request: MsgSwap): MsgSwapResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.market.v1beta1.Msg.Swap is unimplemented"))

    public open override suspend fun swapSend(request: MsgSwapSend): MsgSwapSendResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.market.v1beta1.Msg.SwapSend is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = swapDescriptor,
    				implementation = {
        MsgSwapResponseJvmConverter.convert(swap(MsgSwapJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = swapSendDescriptor,
    				implementation = {
        MsgSwapSendResponseJvmConverter.convert(swapSend(MsgSwapSendJvmConverter.convert(it))) },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Msg.Client>(channel = option.channel, callOptions = option.callOptions),
      Msg.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Msg.Client =
        Msg.Client(ClientOption(channel, callOptions))

    public override suspend fun swap(request: MsgSwap): MsgSwapResponse = swap(request, Metadata())

    public suspend fun swap(request: MsgSwap, metadata: Metadata): MsgSwapResponse =
        MsgSwapResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, swapDescriptor,
    			MsgSwapJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun swapSend(request: MsgSwapSend): MsgSwapSendResponse =
        swapSend(request, Metadata())

    public suspend fun swapSend(request: MsgSwapSend, metadata: Metadata): MsgSwapSendResponse =
        MsgSwapSendResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, swapSendDescriptor,
    			MsgSwapSendJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
