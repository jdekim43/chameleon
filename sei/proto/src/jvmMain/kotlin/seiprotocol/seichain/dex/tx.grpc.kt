// Transform from dex/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun placeOrders(request: MsgPlaceOrders): MsgPlaceOrdersResponse

    public actual suspend fun cancelOrders(request: MsgCancelOrders): MsgCancelOrdersResponse

    public actual suspend fun registerContract(request: MsgRegisterContract):
        MsgRegisterContractResponse

    public actual suspend fun contractDepositRent(request: MsgContractDepositRent):
        MsgContractDepositRentResponse

    public actual suspend fun unregisterContract(request: MsgUnregisterContract):
        MsgUnregisterContractResponse

    public actual suspend fun registerPairs(request: MsgRegisterPairs): MsgRegisterPairsResponse

    public actual suspend fun updatePriceTickSize(request: MsgUpdatePriceTickSize):
        MsgUpdateTickSizeResponse

    public actual suspend fun updateQuantityTickSize(request: MsgUpdateQuantityTickSize):
        MsgUpdateTickSizeResponse

    public actual suspend fun unsuspendContract(request: MsgUnsuspendContract):
        MsgUnsuspendContractResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
