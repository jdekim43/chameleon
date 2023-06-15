// Transform from cosmos/bank/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

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

  private val sendDescriptor: MethodDescriptor<Tx.MsgSend, Tx.MsgSendResponse> =
      MsgGrpc.getSendMethod()!!

  private val multiSendDescriptor: MethodDescriptor<Tx.MsgMultiSend, Tx.MsgMultiSendResponse> =
      MsgGrpc.getMultiSendMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  private val setSendEnabledDescriptor:
      MethodDescriptor<Tx.MsgSetSendEnabled, Tx.MsgSetSendEnabledResponse> =
      MsgGrpc.getSetSendEnabledMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun send(request: MsgSend): MsgSendResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Msg.Send is unimplemented"))

    public open override suspend fun multiSend(request: MsgMultiSend): MsgMultiSendResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Msg.MultiSend is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Msg.UpdateParams is unimplemented"))

    public open override suspend fun setSendEnabled(request: MsgSetSendEnabled):
        MsgSetSendEnabledResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Msg.SetSendEnabled is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = sendDescriptor,
    				implementation = {
        MsgSendResponseJvmConverter.convert(send(MsgSendJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = multiSendDescriptor,
    				implementation = {
        MsgMultiSendResponseJvmConverter.convert(multiSend(MsgMultiSendJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateParamsDescriptor,
    				implementation = {
        MsgUpdateParamsResponseJvmConverter.convert(updateParams(MsgUpdateParamsJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = setSendEnabledDescriptor,
    				implementation = {
        MsgSetSendEnabledResponseJvmConverter.convert(setSendEnabled(MsgSetSendEnabledJvmConverter.convert(it)))
        },
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

    public override suspend fun send(request: MsgSend): MsgSendResponse = send(request, Metadata())

    public suspend fun send(request: MsgSend, metadata: Metadata): MsgSendResponse =
        MsgSendResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, sendDescriptor,
    			MsgSendJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun multiSend(request: MsgMultiSend): MsgMultiSendResponse =
        multiSend(request, Metadata())

    public suspend fun multiSend(request: MsgMultiSend, metadata: Metadata): MsgMultiSendResponse =
        MsgMultiSendResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, multiSendDescriptor,
    			MsgMultiSendJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse =
        updateParams(request, Metadata())

    public suspend fun updateParams(request: MsgUpdateParams, metadata: Metadata):
        MsgUpdateParamsResponse = MsgUpdateParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateParamsDescriptor,
    			MsgUpdateParamsJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun setSendEnabled(request: MsgSetSendEnabled):
        MsgSetSendEnabledResponse = setSendEnabled(request, Metadata())

    public suspend fun setSendEnabled(request: MsgSetSendEnabled, metadata: Metadata):
        MsgSetSendEnabledResponse = MsgSetSendEnabledResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, setSendEnabledDescriptor,
    			MsgSetSendEnabledJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
