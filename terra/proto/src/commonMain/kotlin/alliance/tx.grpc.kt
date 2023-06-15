// Transform from alliance/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun `delegate`(request: MsgDelegate): MsgDelegateResponse

    public suspend fun redelegate(request: MsgRedelegate): MsgRedelegateResponse

    public suspend fun undelegate(request: MsgUndelegate): MsgUndelegateResponse

    public suspend fun claimDelegationRewards(request: MsgClaimDelegationRewards):
        MsgClaimDelegationRewardsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
