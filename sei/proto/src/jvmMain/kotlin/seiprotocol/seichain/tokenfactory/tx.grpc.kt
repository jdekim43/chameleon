// Transform from tokenfactory/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun createDenom(request: MsgCreateDenom): MsgCreateDenomResponse

    public actual suspend fun mint(request: MsgMint): MsgMintResponse

    public actual suspend fun burn(request: MsgBurn): MsgBurnResponse

    public actual suspend fun changeAdmin(request: MsgChangeAdmin): MsgChangeAdminResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
