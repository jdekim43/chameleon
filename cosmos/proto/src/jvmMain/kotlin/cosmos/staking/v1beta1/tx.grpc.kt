// Transform from cosmos/staking/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun createValidator(request: MsgCreateValidator):
        MsgCreateValidatorResponse

    public actual suspend fun editValidator(request: MsgEditValidator): MsgEditValidatorResponse

    public actual suspend fun `delegate`(request: MsgDelegate): MsgDelegateResponse

    public actual suspend fun beginRedelegate(request: MsgBeginRedelegate):
        MsgBeginRedelegateResponse

    public actual suspend fun undelegate(request: MsgUndelegate): MsgUndelegateResponse

    public actual suspend fun cancelUnbondingDelegation(request: MsgCancelUnbondingDelegation):
        MsgCancelUnbondingDelegationResponse

    public actual suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
