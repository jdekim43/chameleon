// Transform from cosmos/vesting/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.vesting.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun createVestingAccount(request: MsgCreateVestingAccount):
        MsgCreateVestingAccountResponse

    public suspend fun createPermanentLockedAccount(request: MsgCreatePermanentLockedAccount):
        MsgCreatePermanentLockedAccountResponse

    public suspend fun createPeriodicVestingAccount(request: MsgCreatePeriodicVestingAccount):
        MsgCreatePeriodicVestingAccountResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
