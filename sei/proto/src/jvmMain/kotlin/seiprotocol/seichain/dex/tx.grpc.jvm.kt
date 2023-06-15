// Transform from dex/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

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

  private val placeOrdersDescriptor: MethodDescriptor<Tx.MsgPlaceOrders, Tx.MsgPlaceOrdersResponse>
      = MsgGrpc.getPlaceOrdersMethod()!!

  private val cancelOrdersDescriptor:
      MethodDescriptor<Tx.MsgCancelOrders, Tx.MsgCancelOrdersResponse> =
      MsgGrpc.getCancelOrdersMethod()!!

  private val registerContractDescriptor:
      MethodDescriptor<Tx.MsgRegisterContract, Tx.MsgRegisterContractResponse> =
      MsgGrpc.getRegisterContractMethod()!!

  private val contractDepositRentDescriptor:
      MethodDescriptor<Tx.MsgContractDepositRent, Tx.MsgContractDepositRentResponse> =
      MsgGrpc.getContractDepositRentMethod()!!

  private val unregisterContractDescriptor:
      MethodDescriptor<Tx.MsgUnregisterContract, Tx.MsgUnregisterContractResponse> =
      MsgGrpc.getUnregisterContractMethod()!!

  private val registerPairsDescriptor:
      MethodDescriptor<Tx.MsgRegisterPairs, Tx.MsgRegisterPairsResponse> =
      MsgGrpc.getRegisterPairsMethod()!!

  private val updatePriceTickSizeDescriptor:
      MethodDescriptor<Tx.MsgUpdatePriceTickSize, Tx.MsgUpdateTickSizeResponse> =
      MsgGrpc.getUpdatePriceTickSizeMethod()!!

  private val updateQuantityTickSizeDescriptor:
      MethodDescriptor<Tx.MsgUpdateQuantityTickSize, Tx.MsgUpdateTickSizeResponse> =
      MsgGrpc.getUpdateQuantityTickSizeMethod()!!

  private val unsuspendContractDescriptor:
      MethodDescriptor<Tx.MsgUnsuspendContract, Tx.MsgUnsuspendContractResponse> =
      MsgGrpc.getUnsuspendContractMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun placeOrders(request: MsgPlaceOrders): MsgPlaceOrdersResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Msg.PlaceOrders is unimplemented"))

    public open override suspend fun cancelOrders(request: MsgCancelOrders): MsgCancelOrdersResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Msg.CancelOrders is unimplemented"))

    public open override suspend fun registerContract(request: MsgRegisterContract):
        MsgRegisterContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Msg.RegisterContract is unimplemented"))

    public open override suspend fun contractDepositRent(request: MsgContractDepositRent):
        MsgContractDepositRentResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Msg.ContractDepositRent is unimplemented"))

    public open override suspend fun unregisterContract(request: MsgUnregisterContract):
        MsgUnregisterContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Msg.UnregisterContract is unimplemented"))

    public open override suspend fun registerPairs(request: MsgRegisterPairs):
        MsgRegisterPairsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Msg.RegisterPairs is unimplemented"))

    public open override suspend fun updatePriceTickSize(request: MsgUpdatePriceTickSize):
        MsgUpdateTickSizeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Msg.UpdatePriceTickSize is unimplemented"))

    public open override suspend fun updateQuantityTickSize(request: MsgUpdateQuantityTickSize):
        MsgUpdateTickSizeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Msg.UpdateQuantityTickSize is unimplemented"))

    public open override suspend fun unsuspendContract(request: MsgUnsuspendContract):
        MsgUnsuspendContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Msg.UnsuspendContract is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = placeOrdersDescriptor,
    				implementation = {
        MsgPlaceOrdersResponseJvmConverter.convert(placeOrders(MsgPlaceOrdersJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = cancelOrdersDescriptor,
    				implementation = {
        MsgCancelOrdersResponseJvmConverter.convert(cancelOrders(MsgCancelOrdersJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = registerContractDescriptor,
    				implementation = {
        MsgRegisterContractResponseJvmConverter.convert(registerContract(MsgRegisterContractJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = contractDepositRentDescriptor,
    				implementation = {
        MsgContractDepositRentResponseJvmConverter.convert(contractDepositRent(MsgContractDepositRentJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = unregisterContractDescriptor,
    				implementation = {
        MsgUnregisterContractResponseJvmConverter.convert(unregisterContract(MsgUnregisterContractJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = registerPairsDescriptor,
    				implementation = {
        MsgRegisterPairsResponseJvmConverter.convert(registerPairs(MsgRegisterPairsJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updatePriceTickSizeDescriptor,
    				implementation = {
        MsgUpdateTickSizeResponseJvmConverter.convert(updatePriceTickSize(MsgUpdatePriceTickSizeJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateQuantityTickSizeDescriptor,
    				implementation = {
        MsgUpdateTickSizeResponseJvmConverter.convert(updateQuantityTickSize(MsgUpdateQuantityTickSizeJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = unsuspendContractDescriptor,
    				implementation = {
        MsgUnsuspendContractResponseJvmConverter.convert(unsuspendContract(MsgUnsuspendContractJvmConverter.convert(it)))
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

    public override suspend fun placeOrders(request: MsgPlaceOrders): MsgPlaceOrdersResponse =
        placeOrders(request, Metadata())

    public suspend fun placeOrders(request: MsgPlaceOrders, metadata: Metadata):
        MsgPlaceOrdersResponse = MsgPlaceOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, placeOrdersDescriptor,
    			MsgPlaceOrdersJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun cancelOrders(request: MsgCancelOrders): MsgCancelOrdersResponse =
        cancelOrders(request, Metadata())

    public suspend fun cancelOrders(request: MsgCancelOrders, metadata: Metadata):
        MsgCancelOrdersResponse = MsgCancelOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, cancelOrdersDescriptor,
    			MsgCancelOrdersJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun registerContract(request: MsgRegisterContract):
        MsgRegisterContractResponse = registerContract(request, Metadata())

    public suspend fun registerContract(request: MsgRegisterContract, metadata: Metadata):
        MsgRegisterContractResponse = MsgRegisterContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, registerContractDescriptor,
    			MsgRegisterContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun contractDepositRent(request: MsgContractDepositRent):
        MsgContractDepositRentResponse = contractDepositRent(request, Metadata())

    public suspend fun contractDepositRent(request: MsgContractDepositRent, metadata: Metadata):
        MsgContractDepositRentResponse = MsgContractDepositRentResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, contractDepositRentDescriptor,
    			MsgContractDepositRentJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun unregisterContract(request: MsgUnregisterContract):
        MsgUnregisterContractResponse = unregisterContract(request, Metadata())

    public suspend fun unregisterContract(request: MsgUnregisterContract, metadata: Metadata):
        MsgUnregisterContractResponse = MsgUnregisterContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, unregisterContractDescriptor,
    			MsgUnregisterContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun registerPairs(request: MsgRegisterPairs): MsgRegisterPairsResponse =
        registerPairs(request, Metadata())

    public suspend fun registerPairs(request: MsgRegisterPairs, metadata: Metadata):
        MsgRegisterPairsResponse = MsgRegisterPairsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, registerPairsDescriptor,
    			MsgRegisterPairsJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updatePriceTickSize(request: MsgUpdatePriceTickSize):
        MsgUpdateTickSizeResponse = updatePriceTickSize(request, Metadata())

    public suspend fun updatePriceTickSize(request: MsgUpdatePriceTickSize, metadata: Metadata):
        MsgUpdateTickSizeResponse = MsgUpdateTickSizeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updatePriceTickSizeDescriptor,
    			MsgUpdatePriceTickSizeJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateQuantityTickSize(request: MsgUpdateQuantityTickSize):
        MsgUpdateTickSizeResponse = updateQuantityTickSize(request, Metadata())

    public suspend fun updateQuantityTickSize(request: MsgUpdateQuantityTickSize,
        metadata: Metadata): MsgUpdateTickSizeResponse =
        MsgUpdateTickSizeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateQuantityTickSizeDescriptor,
    			MsgUpdateQuantityTickSizeJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun unsuspendContract(request: MsgUnsuspendContract):
        MsgUnsuspendContractResponse = unsuspendContract(request, Metadata())

    public suspend fun unsuspendContract(request: MsgUnsuspendContract, metadata: Metadata):
        MsgUnsuspendContractResponse = MsgUnsuspendContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, unsuspendContractDescriptor,
    			MsgUnsuspendContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
