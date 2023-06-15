// Transform from tokenfactory/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun createDenom(request: MsgCreateDenom): MsgCreateDenomResponse

    public suspend fun mint(request: MsgMint): MsgMintResponse

    public suspend fun burn(request: MsgBurn): MsgBurnResponse

    public suspend fun changeAdmin(request: MsgChangeAdmin): MsgChangeAdminResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
