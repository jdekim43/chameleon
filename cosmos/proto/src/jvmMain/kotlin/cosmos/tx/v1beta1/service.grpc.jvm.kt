// Transform from cosmos/tx/v1beta1/service.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.v1beta1

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

  private val simulateDescriptor:
      MethodDescriptor<ServiceOuterClass.SimulateRequest, ServiceOuterClass.SimulateResponse> =
      ServiceGrpc.getSimulateMethod()!!

  private val getTxDescriptor:
      MethodDescriptor<ServiceOuterClass.GetTxRequest, ServiceOuterClass.GetTxResponse> =
      ServiceGrpc.getGetTxMethod()!!

  private val broadcastTxDescriptor:
      MethodDescriptor<ServiceOuterClass.BroadcastTxRequest, ServiceOuterClass.BroadcastTxResponse>
      = ServiceGrpc.getBroadcastTxMethod()!!

  private val getTxsEventDescriptor:
      MethodDescriptor<ServiceOuterClass.GetTxsEventRequest, ServiceOuterClass.GetTxsEventResponse>
      = ServiceGrpc.getGetTxsEventMethod()!!

  private val getBlockWithTxsDescriptor:
      MethodDescriptor<ServiceOuterClass.GetBlockWithTxsRequest, ServiceOuterClass.GetBlockWithTxsResponse>
      = ServiceGrpc.getGetBlockWithTxsMethod()!!

  private val txDecodeDescriptor:
      MethodDescriptor<ServiceOuterClass.TxDecodeRequest, ServiceOuterClass.TxDecodeResponse> =
      ServiceGrpc.getTxDecodeMethod()!!

  private val txEncodeDescriptor:
      MethodDescriptor<ServiceOuterClass.TxEncodeRequest, ServiceOuterClass.TxEncodeResponse> =
      ServiceGrpc.getTxEncodeMethod()!!

  private val txEncodeAminoDescriptor:
      MethodDescriptor<ServiceOuterClass.TxEncodeAminoRequest, ServiceOuterClass.TxEncodeAminoResponse>
      = ServiceGrpc.getTxEncodeAminoMethod()!!

  private val txDecodeAminoDescriptor:
      MethodDescriptor<ServiceOuterClass.TxDecodeAminoRequest, ServiceOuterClass.TxDecodeAminoResponse>
      = ServiceGrpc.getTxDecodeAminoMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Service.Interface {
    public open override suspend fun simulate(request: SimulateRequest): SimulateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.Simulate is unimplemented"))

    public open override suspend fun getTx(request: GetTxRequest): GetTxResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.GetTx is unimplemented"))

    public open override suspend fun broadcastTx(request: BroadcastTxRequest): BroadcastTxResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.BroadcastTx is unimplemented"))

    public open override suspend fun getTxsEvent(request: GetTxsEventRequest): GetTxsEventResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.GetTxsEvent is unimplemented"))

    public open override suspend fun getBlockWithTxs(request: GetBlockWithTxsRequest):
        GetBlockWithTxsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.GetBlockWithTxs is unimplemented"))

    public open override suspend fun txDecode(request: TxDecodeRequest): TxDecodeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.TxDecode is unimplemented"))

    public open override suspend fun txEncode(request: TxEncodeRequest): TxEncodeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.TxEncode is unimplemented"))

    public open override suspend fun txEncodeAmino(request: TxEncodeAminoRequest):
        TxEncodeAminoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.TxEncodeAmino is unimplemented"))

    public open override suspend fun txDecodeAmino(request: TxDecodeAminoRequest):
        TxDecodeAminoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.TxDecodeAmino is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = simulateDescriptor,
    				implementation = {
        SimulateResponseJvmConverter.convert(simulate(SimulateRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getTxDescriptor,
    				implementation = {
        GetTxResponseJvmConverter.convert(getTx(GetTxRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = broadcastTxDescriptor,
    				implementation = {
        BroadcastTxResponseJvmConverter.convert(broadcastTx(BroadcastTxRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getTxsEventDescriptor,
    				implementation = {
        GetTxsEventResponseJvmConverter.convert(getTxsEvent(GetTxsEventRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getBlockWithTxsDescriptor,
    				implementation = {
        GetBlockWithTxsResponseJvmConverter.convert(getBlockWithTxs(GetBlockWithTxsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = txDecodeDescriptor,
    				implementation = {
        TxDecodeResponseJvmConverter.convert(txDecode(TxDecodeRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = txEncodeDescriptor,
    				implementation = {
        TxEncodeResponseJvmConverter.convert(txEncode(TxEncodeRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = txEncodeAminoDescriptor,
    				implementation = {
        TxEncodeAminoResponseJvmConverter.convert(txEncodeAmino(TxEncodeAminoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = txDecodeAminoDescriptor,
    				implementation = {
        TxDecodeAminoResponseJvmConverter.convert(txDecodeAmino(TxDecodeAminoRequestJvmConverter.convert(it)))
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

    public override suspend fun simulate(request: SimulateRequest): SimulateResponse =
        simulate(request, Metadata())

    public suspend fun simulate(request: SimulateRequest, metadata: Metadata): SimulateResponse =
        SimulateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, simulateDescriptor,
    			SimulateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getTx(request: GetTxRequest): GetTxResponse = getTx(request,
        Metadata())

    public suspend fun getTx(request: GetTxRequest, metadata: Metadata): GetTxResponse =
        GetTxResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getTxDescriptor,
    			GetTxRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun broadcastTx(request: BroadcastTxRequest): BroadcastTxResponse =
        broadcastTx(request, Metadata())

    public suspend fun broadcastTx(request: BroadcastTxRequest, metadata: Metadata):
        BroadcastTxResponse = BroadcastTxResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, broadcastTxDescriptor,
    			BroadcastTxRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getTxsEvent(request: GetTxsEventRequest): GetTxsEventResponse =
        getTxsEvent(request, Metadata())

    public suspend fun getTxsEvent(request: GetTxsEventRequest, metadata: Metadata):
        GetTxsEventResponse = GetTxsEventResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getTxsEventDescriptor,
    			GetTxsEventRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getBlockWithTxs(request: GetBlockWithTxsRequest):
        GetBlockWithTxsResponse = getBlockWithTxs(request, Metadata())

    public suspend fun getBlockWithTxs(request: GetBlockWithTxsRequest, metadata: Metadata):
        GetBlockWithTxsResponse = GetBlockWithTxsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getBlockWithTxsDescriptor,
    			GetBlockWithTxsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun txDecode(request: TxDecodeRequest): TxDecodeResponse =
        txDecode(request, Metadata())

    public suspend fun txDecode(request: TxDecodeRequest, metadata: Metadata): TxDecodeResponse =
        TxDecodeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, txDecodeDescriptor,
    			TxDecodeRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun txEncode(request: TxEncodeRequest): TxEncodeResponse =
        txEncode(request, Metadata())

    public suspend fun txEncode(request: TxEncodeRequest, metadata: Metadata): TxEncodeResponse =
        TxEncodeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, txEncodeDescriptor,
    			TxEncodeRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun txEncodeAmino(request: TxEncodeAminoRequest): TxEncodeAminoResponse
        = txEncodeAmino(request, Metadata())

    public suspend fun txEncodeAmino(request: TxEncodeAminoRequest, metadata: Metadata):
        TxEncodeAminoResponse = TxEncodeAminoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, txEncodeAminoDescriptor,
    			TxEncodeAminoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun txDecodeAmino(request: TxDecodeAminoRequest): TxDecodeAminoResponse
        = txDecodeAmino(request, Metadata())

    public suspend fun txDecodeAmino(request: TxDecodeAminoRequest, metadata: Metadata):
        TxDecodeAminoResponse = TxDecodeAminoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, txDecodeAminoDescriptor,
    			TxDecodeAminoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
