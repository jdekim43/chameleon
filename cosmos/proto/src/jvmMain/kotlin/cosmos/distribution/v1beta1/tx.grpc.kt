// Transform from cosmos/distribution/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun setWithdrawAddress(request: MsgSetWithdrawAddress):
        MsgSetWithdrawAddressResponse

    public actual suspend fun withdrawDelegatorReward(request: MsgWithdrawDelegatorReward):
        MsgWithdrawDelegatorRewardResponse

    public actual suspend fun withdrawValidatorCommission(request: MsgWithdrawValidatorCommission):
        MsgWithdrawValidatorCommissionResponse

    public actual suspend fun fundCommunityPool(request: MsgFundCommunityPool):
        MsgFundCommunityPoolResponse

    public actual suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse

    public actual suspend fun communityPoolSpend(request: MsgCommunityPoolSpend):
        MsgCommunityPoolSpendResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
