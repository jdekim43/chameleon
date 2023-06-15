// Transform from dex/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun placeOrders(request: MsgPlaceOrders): MsgPlaceOrdersResponse

    public suspend fun cancelOrders(request: MsgCancelOrders): MsgCancelOrdersResponse

    public suspend fun registerContract(request: MsgRegisterContract): MsgRegisterContractResponse

    public suspend fun contractDepositRent(request: MsgContractDepositRent):
        MsgContractDepositRentResponse

    public suspend fun unregisterContract(request: MsgUnregisterContract):
        MsgUnregisterContractResponse

    public suspend fun registerPairs(request: MsgRegisterPairs): MsgRegisterPairsResponse

    public suspend fun updatePriceTickSize(request: MsgUpdatePriceTickSize):
        MsgUpdateTickSizeResponse

    public suspend fun updateQuantityTickSize(request: MsgUpdateQuantityTickSize):
        MsgUpdateTickSizeResponse

    public suspend fun unsuspendContract(request: MsgUnsuspendContract):
        MsgUnsuspendContractResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
