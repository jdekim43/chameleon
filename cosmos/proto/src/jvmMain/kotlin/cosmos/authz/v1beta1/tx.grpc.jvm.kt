// Transform from cosmos/authz/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

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

  private val grantDescriptor: MethodDescriptor<Tx.MsgGrant, Tx.MsgGrantResponse> =
      MsgGrpc.getGrantMethod()!!

  private val execDescriptor: MethodDescriptor<Tx.MsgExec, Tx.MsgExecResponse> =
      MsgGrpc.getExecMethod()!!

  private val revokeDescriptor: MethodDescriptor<Tx.MsgRevoke, Tx.MsgRevokeResponse> =
      MsgGrpc.getRevokeMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun grant(request: MsgGrant): MsgGrantResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Msg.Grant is unimplemented"))

    public open override suspend fun exec(request: MsgExec): MsgExecResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Msg.Exec is unimplemented"))

    public open override suspend fun revoke(request: MsgRevoke): MsgRevokeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Msg.Revoke is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = grantDescriptor,
    				implementation = {
        MsgGrantResponseJvmConverter.convert(grant(MsgGrantJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = execDescriptor,
    				implementation = {
        MsgExecResponseJvmConverter.convert(exec(MsgExecJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = revokeDescriptor,
    				implementation = {
        MsgRevokeResponseJvmConverter.convert(revoke(MsgRevokeJvmConverter.convert(it))) },
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

    public override suspend fun grant(request: MsgGrant): MsgGrantResponse = grant(request,
        Metadata())

    public suspend fun grant(request: MsgGrant, metadata: Metadata): MsgGrantResponse =
        MsgGrantResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, grantDescriptor,
    			MsgGrantJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun exec(request: MsgExec): MsgExecResponse = exec(request, Metadata())

    public suspend fun exec(request: MsgExec, metadata: Metadata): MsgExecResponse =
        MsgExecResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, execDescriptor,
    			MsgExecJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun revoke(request: MsgRevoke): MsgRevokeResponse = revoke(request,
        Metadata())

    public suspend fun revoke(request: MsgRevoke, metadata: Metadata): MsgRevokeResponse =
        MsgRevokeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, revokeDescriptor,
    			MsgRevokeJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
