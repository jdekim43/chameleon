// Transform from tokenfactory/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

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

  private val createDenomDescriptor: MethodDescriptor<Tx.MsgCreateDenom, Tx.MsgCreateDenomResponse>
      = MsgGrpc.getCreateDenomMethod()!!

  private val mintDescriptor: MethodDescriptor<Tx.MsgMint, Tx.MsgMintResponse> =
      MsgGrpc.getMintMethod()!!

  private val burnDescriptor: MethodDescriptor<Tx.MsgBurn, Tx.MsgBurnResponse> =
      MsgGrpc.getBurnMethod()!!

  private val changeAdminDescriptor: MethodDescriptor<Tx.MsgChangeAdmin, Tx.MsgChangeAdminResponse>
      = MsgGrpc.getChangeAdminMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun createDenom(request: MsgCreateDenom): MsgCreateDenomResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.tokenfactory.Msg.CreateDenom is unimplemented"))

    public open override suspend fun mint(request: MsgMint): MsgMintResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.tokenfactory.Msg.Mint is unimplemented"))

    public open override suspend fun burn(request: MsgBurn): MsgBurnResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.tokenfactory.Msg.Burn is unimplemented"))

    public open override suspend fun changeAdmin(request: MsgChangeAdmin): MsgChangeAdminResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.tokenfactory.Msg.ChangeAdmin is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createDenomDescriptor,
    				implementation = {
        MsgCreateDenomResponseJvmConverter.convert(createDenom(MsgCreateDenomJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = mintDescriptor,
    				implementation = {
        MsgMintResponseJvmConverter.convert(mint(MsgMintJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = burnDescriptor,
    				implementation = {
        MsgBurnResponseJvmConverter.convert(burn(MsgBurnJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = changeAdminDescriptor,
    				implementation = {
        MsgChangeAdminResponseJvmConverter.convert(changeAdmin(MsgChangeAdminJvmConverter.convert(it)))
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

    public override suspend fun createDenom(request: MsgCreateDenom): MsgCreateDenomResponse =
        createDenom(request, Metadata())

    public suspend fun createDenom(request: MsgCreateDenom, metadata: Metadata):
        MsgCreateDenomResponse = MsgCreateDenomResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createDenomDescriptor,
    			MsgCreateDenomJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun mint(request: MsgMint): MsgMintResponse = mint(request, Metadata())

    public suspend fun mint(request: MsgMint, metadata: Metadata): MsgMintResponse =
        MsgMintResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, mintDescriptor,
    			MsgMintJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun burn(request: MsgBurn): MsgBurnResponse = burn(request, Metadata())

    public suspend fun burn(request: MsgBurn, metadata: Metadata): MsgBurnResponse =
        MsgBurnResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, burnDescriptor,
    			MsgBurnJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun changeAdmin(request: MsgChangeAdmin): MsgChangeAdminResponse =
        changeAdmin(request, Metadata())

    public suspend fun changeAdmin(request: MsgChangeAdmin, metadata: Metadata):
        MsgChangeAdminResponse = MsgChangeAdminResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, changeAdminDescriptor,
    			MsgChangeAdminJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
