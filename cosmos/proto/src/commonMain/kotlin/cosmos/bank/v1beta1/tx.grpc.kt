// Transform from cosmos/bank/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun send(request: MsgSend): MsgSendResponse

    public suspend fun multiSend(request: MsgMultiSend): MsgMultiSendResponse

    public suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse

    public suspend fun setSendEnabled(request: MsgSetSendEnabled): MsgSetSendEnabledResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
