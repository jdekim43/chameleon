// Transform from cosmos/staking/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun createValidator(request: MsgCreateValidator): MsgCreateValidatorResponse

    public suspend fun editValidator(request: MsgEditValidator): MsgEditValidatorResponse

    public suspend fun `delegate`(request: MsgDelegate): MsgDelegateResponse

    public suspend fun beginRedelegate(request: MsgBeginRedelegate): MsgBeginRedelegateResponse

    public suspend fun undelegate(request: MsgUndelegate): MsgUndelegateResponse

    public suspend fun cancelUnbondingDelegation(request: MsgCancelUnbondingDelegation):
        MsgCancelUnbondingDelegationResponse

    public suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
