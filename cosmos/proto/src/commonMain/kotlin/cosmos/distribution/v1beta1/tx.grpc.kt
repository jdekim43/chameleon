// Transform from cosmos/distribution/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun setWithdrawAddress(request: MsgSetWithdrawAddress):
        MsgSetWithdrawAddressResponse

    public suspend fun withdrawDelegatorReward(request: MsgWithdrawDelegatorReward):
        MsgWithdrawDelegatorRewardResponse

    public suspend fun withdrawValidatorCommission(request: MsgWithdrawValidatorCommission):
        MsgWithdrawValidatorCommissionResponse

    public suspend fun fundCommunityPool(request: MsgFundCommunityPool):
        MsgFundCommunityPoolResponse

    public suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse

    public suspend fun communityPoolSpend(request: MsgCommunityPoolSpend):
        MsgCommunityPoolSpendResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
