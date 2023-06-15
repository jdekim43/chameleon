// Transform from cosmos/feegrant/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

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

  private val grantAllowanceDescriptor:
      MethodDescriptor<Tx.MsgGrantAllowance, Tx.MsgGrantAllowanceResponse> =
      MsgGrpc.getGrantAllowanceMethod()!!

  private val revokeAllowanceDescriptor:
      MethodDescriptor<Tx.MsgRevokeAllowance, Tx.MsgRevokeAllowanceResponse> =
      MsgGrpc.getRevokeAllowanceMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun grantAllowance(request: MsgGrantAllowance):
        MsgGrantAllowanceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.feegrant.v1beta1.Msg.GrantAllowance is unimplemented"))

    public open override suspend fun revokeAllowance(request: MsgRevokeAllowance):
        MsgRevokeAllowanceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.feegrant.v1beta1.Msg.RevokeAllowance is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = grantAllowanceDescriptor,
    				implementation = {
        MsgGrantAllowanceResponseJvmConverter.convert(grantAllowance(MsgGrantAllowanceJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = revokeAllowanceDescriptor,
    				implementation = {
        MsgRevokeAllowanceResponseJvmConverter.convert(revokeAllowance(MsgRevokeAllowanceJvmConverter.convert(it)))
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

    public override suspend fun grantAllowance(request: MsgGrantAllowance):
        MsgGrantAllowanceResponse = grantAllowance(request, Metadata())

    public suspend fun grantAllowance(request: MsgGrantAllowance, metadata: Metadata):
        MsgGrantAllowanceResponse = MsgGrantAllowanceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, grantAllowanceDescriptor,
    			MsgGrantAllowanceJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun revokeAllowance(request: MsgRevokeAllowance):
        MsgRevokeAllowanceResponse = revokeAllowance(request, Metadata())

    public suspend fun revokeAllowance(request: MsgRevokeAllowance, metadata: Metadata):
        MsgRevokeAllowanceResponse = MsgRevokeAllowanceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, revokeAllowanceDescriptor,
    			MsgRevokeAllowanceJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
