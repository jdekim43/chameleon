// Transform from cosmwasm/wasm/v1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

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

  private val storeCodeDescriptor: MethodDescriptor<Tx.MsgStoreCode, Tx.MsgStoreCodeResponse> =
      MsgGrpc.getStoreCodeMethod()!!

  private val instantiateContractDescriptor:
      MethodDescriptor<Tx.MsgInstantiateContract, Tx.MsgInstantiateContractResponse> =
      MsgGrpc.getInstantiateContractMethod()!!

  private val instantiateContract2Descriptor:
      MethodDescriptor<Tx.MsgInstantiateContract2, Tx.MsgInstantiateContract2Response> =
      MsgGrpc.getInstantiateContract2Method()!!

  private val executeContractDescriptor:
      MethodDescriptor<Tx.MsgExecuteContract, Tx.MsgExecuteContractResponse> =
      MsgGrpc.getExecuteContractMethod()!!

  private val migrateContractDescriptor:
      MethodDescriptor<Tx.MsgMigrateContract, Tx.MsgMigrateContractResponse> =
      MsgGrpc.getMigrateContractMethod()!!

  private val updateAdminDescriptor: MethodDescriptor<Tx.MsgUpdateAdmin, Tx.MsgUpdateAdminResponse>
      = MsgGrpc.getUpdateAdminMethod()!!

  private val clearAdminDescriptor: MethodDescriptor<Tx.MsgClearAdmin, Tx.MsgClearAdminResponse> =
      MsgGrpc.getClearAdminMethod()!!

  private val updateInstantiateConfigDescriptor:
      MethodDescriptor<Tx.MsgUpdateInstantiateConfig, Tx.MsgUpdateInstantiateConfigResponse> =
      MsgGrpc.getUpdateInstantiateConfigMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  private val sudoContractDescriptor:
      MethodDescriptor<Tx.MsgSudoContract, Tx.MsgSudoContractResponse> =
      MsgGrpc.getSudoContractMethod()!!

  private val pinCodesDescriptor: MethodDescriptor<Tx.MsgPinCodes, Tx.MsgPinCodesResponse> =
      MsgGrpc.getPinCodesMethod()!!

  private val unpinCodesDescriptor: MethodDescriptor<Tx.MsgUnpinCodes, Tx.MsgUnpinCodesResponse> =
      MsgGrpc.getUnpinCodesMethod()!!

  private val storeAndInstantiateContractDescriptor:
      MethodDescriptor<Tx.MsgStoreAndInstantiateContract, Tx.MsgStoreAndInstantiateContractResponse>
      = MsgGrpc.getStoreAndInstantiateContractMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun storeCode(request: MsgStoreCode): MsgStoreCodeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.StoreCode is unimplemented"))

    public open override suspend fun instantiateContract(request: MsgInstantiateContract):
        MsgInstantiateContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.InstantiateContract is unimplemented"))

    public open override suspend fun instantiateContract2(request: MsgInstantiateContract2):
        MsgInstantiateContract2Response = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.InstantiateContract2 is unimplemented"))

    public open override suspend fun executeContract(request: MsgExecuteContract):
        MsgExecuteContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.ExecuteContract is unimplemented"))

    public open override suspend fun migrateContract(request: MsgMigrateContract):
        MsgMigrateContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.MigrateContract is unimplemented"))

    public open override suspend fun updateAdmin(request: MsgUpdateAdmin): MsgUpdateAdminResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.UpdateAdmin is unimplemented"))

    public open override suspend fun clearAdmin(request: MsgClearAdmin): MsgClearAdminResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.ClearAdmin is unimplemented"))

    public open override suspend fun updateInstantiateConfig(request: MsgUpdateInstantiateConfig):
        MsgUpdateInstantiateConfigResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.UpdateInstantiateConfig is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.UpdateParams is unimplemented"))

    public open override suspend fun sudoContract(request: MsgSudoContract): MsgSudoContractResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.SudoContract is unimplemented"))

    public open override suspend fun pinCodes(request: MsgPinCodes): MsgPinCodesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.PinCodes is unimplemented"))

    public open override suspend fun unpinCodes(request: MsgUnpinCodes): MsgUnpinCodesResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.UnpinCodes is unimplemented"))

    public open override suspend
        fun storeAndInstantiateContract(request: MsgStoreAndInstantiateContract):
        MsgStoreAndInstantiateContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Msg.StoreAndInstantiateContract is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = storeCodeDescriptor,
    				implementation = {
        MsgStoreCodeResponseJvmConverter.convert(storeCode(MsgStoreCodeJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = instantiateContractDescriptor,
    				implementation = {
        MsgInstantiateContractResponseJvmConverter.convert(instantiateContract(MsgInstantiateContractJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = instantiateContract2Descriptor,
    				implementation = {
        MsgInstantiateContract2ResponseJvmConverter.convert(instantiateContract2(MsgInstantiateContract2JvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = executeContractDescriptor,
    				implementation = {
        MsgExecuteContractResponseJvmConverter.convert(executeContract(MsgExecuteContractJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = migrateContractDescriptor,
    				implementation = {
        MsgMigrateContractResponseJvmConverter.convert(migrateContract(MsgMigrateContractJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateAdminDescriptor,
    				implementation = {
        MsgUpdateAdminResponseJvmConverter.convert(updateAdmin(MsgUpdateAdminJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = clearAdminDescriptor,
    				implementation = {
        MsgClearAdminResponseJvmConverter.convert(clearAdmin(MsgClearAdminJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateInstantiateConfigDescriptor,
    				implementation = {
        MsgUpdateInstantiateConfigResponseJvmConverter.convert(updateInstantiateConfig(MsgUpdateInstantiateConfigJvmConverter.convert(it)))
        },
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
    				descriptor = sudoContractDescriptor,
    				implementation = {
        MsgSudoContractResponseJvmConverter.convert(sudoContract(MsgSudoContractJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = pinCodesDescriptor,
    				implementation = {
        MsgPinCodesResponseJvmConverter.convert(pinCodes(MsgPinCodesJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = unpinCodesDescriptor,
    				implementation = {
        MsgUnpinCodesResponseJvmConverter.convert(unpinCodes(MsgUnpinCodesJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = storeAndInstantiateContractDescriptor,
    				implementation = {
        MsgStoreAndInstantiateContractResponseJvmConverter.convert(storeAndInstantiateContract(MsgStoreAndInstantiateContractJvmConverter.convert(it)))
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

    public override suspend fun storeCode(request: MsgStoreCode): MsgStoreCodeResponse =
        storeCode(request, Metadata())

    public suspend fun storeCode(request: MsgStoreCode, metadata: Metadata): MsgStoreCodeResponse =
        MsgStoreCodeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, storeCodeDescriptor,
    			MsgStoreCodeJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun instantiateContract(request: MsgInstantiateContract):
        MsgInstantiateContractResponse = instantiateContract(request, Metadata())

    public suspend fun instantiateContract(request: MsgInstantiateContract, metadata: Metadata):
        MsgInstantiateContractResponse = MsgInstantiateContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, instantiateContractDescriptor,
    			MsgInstantiateContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun instantiateContract2(request: MsgInstantiateContract2):
        MsgInstantiateContract2Response = instantiateContract2(request, Metadata())

    public suspend fun instantiateContract2(request: MsgInstantiateContract2, metadata: Metadata):
        MsgInstantiateContract2Response = MsgInstantiateContract2ResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, instantiateContract2Descriptor,
    			MsgInstantiateContract2JvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun executeContract(request: MsgExecuteContract):
        MsgExecuteContractResponse = executeContract(request, Metadata())

    public suspend fun executeContract(request: MsgExecuteContract, metadata: Metadata):
        MsgExecuteContractResponse = MsgExecuteContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, executeContractDescriptor,
    			MsgExecuteContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun migrateContract(request: MsgMigrateContract):
        MsgMigrateContractResponse = migrateContract(request, Metadata())

    public suspend fun migrateContract(request: MsgMigrateContract, metadata: Metadata):
        MsgMigrateContractResponse = MsgMigrateContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, migrateContractDescriptor,
    			MsgMigrateContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateAdmin(request: MsgUpdateAdmin): MsgUpdateAdminResponse =
        updateAdmin(request, Metadata())

    public suspend fun updateAdmin(request: MsgUpdateAdmin, metadata: Metadata):
        MsgUpdateAdminResponse = MsgUpdateAdminResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateAdminDescriptor,
    			MsgUpdateAdminJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun clearAdmin(request: MsgClearAdmin): MsgClearAdminResponse =
        clearAdmin(request, Metadata())

    public suspend fun clearAdmin(request: MsgClearAdmin, metadata: Metadata): MsgClearAdminResponse
        = MsgClearAdminResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, clearAdminDescriptor,
    			MsgClearAdminJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateInstantiateConfig(request: MsgUpdateInstantiateConfig):
        MsgUpdateInstantiateConfigResponse = updateInstantiateConfig(request, Metadata())

    public suspend fun updateInstantiateConfig(request: MsgUpdateInstantiateConfig,
        metadata: Metadata): MsgUpdateInstantiateConfigResponse =
        MsgUpdateInstantiateConfigResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateInstantiateConfigDescriptor,
    			MsgUpdateInstantiateConfigJvmConverter.convert(request),
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

    public override suspend fun sudoContract(request: MsgSudoContract): MsgSudoContractResponse =
        sudoContract(request, Metadata())

    public suspend fun sudoContract(request: MsgSudoContract, metadata: Metadata):
        MsgSudoContractResponse = MsgSudoContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, sudoContractDescriptor,
    			MsgSudoContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun pinCodes(request: MsgPinCodes): MsgPinCodesResponse =
        pinCodes(request, Metadata())

    public suspend fun pinCodes(request: MsgPinCodes, metadata: Metadata): MsgPinCodesResponse =
        MsgPinCodesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, pinCodesDescriptor,
    			MsgPinCodesJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun unpinCodes(request: MsgUnpinCodes): MsgUnpinCodesResponse =
        unpinCodes(request, Metadata())

    public suspend fun unpinCodes(request: MsgUnpinCodes, metadata: Metadata): MsgUnpinCodesResponse
        = MsgUnpinCodesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, unpinCodesDescriptor,
    			MsgUnpinCodesJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun storeAndInstantiateContract(request: MsgStoreAndInstantiateContract):
        MsgStoreAndInstantiateContractResponse = storeAndInstantiateContract(request, Metadata())

    public suspend fun storeAndInstantiateContract(request: MsgStoreAndInstantiateContract,
        metadata: Metadata): MsgStoreAndInstantiateContractResponse =
        MsgStoreAndInstantiateContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, storeAndInstantiateContractDescriptor,
    			MsgStoreAndInstantiateContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
