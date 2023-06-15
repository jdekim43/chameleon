// Transform from cosmwasm/wasm/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun storeCode(request: MsgStoreCode): MsgStoreCodeResponse

    public suspend fun instantiateContract(request: MsgInstantiateContract):
        MsgInstantiateContractResponse

    public suspend fun instantiateContract2(request: MsgInstantiateContract2):
        MsgInstantiateContract2Response

    public suspend fun executeContract(request: MsgExecuteContract): MsgExecuteContractResponse

    public suspend fun migrateContract(request: MsgMigrateContract): MsgMigrateContractResponse

    public suspend fun updateAdmin(request: MsgUpdateAdmin): MsgUpdateAdminResponse

    public suspend fun clearAdmin(request: MsgClearAdmin): MsgClearAdminResponse

    public suspend fun updateInstantiateConfig(request: MsgUpdateInstantiateConfig):
        MsgUpdateInstantiateConfigResponse

    public suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse

    public suspend fun sudoContract(request: MsgSudoContract): MsgSudoContractResponse

    public suspend fun pinCodes(request: MsgPinCodes): MsgPinCodesResponse

    public suspend fun unpinCodes(request: MsgUnpinCodes): MsgUnpinCodesResponse

    public suspend fun storeAndInstantiateContract(request: MsgStoreAndInstantiateContract):
        MsgStoreAndInstantiateContractResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
