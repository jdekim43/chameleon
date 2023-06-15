// Transform from cosmos/distribution/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public actual suspend
        fun validatorDistributionInfo(request: QueryValidatorDistributionInfoRequest):
        QueryValidatorDistributionInfoResponse

    public actual suspend
        fun validatorOutstandingRewards(request: QueryValidatorOutstandingRewardsRequest):
        QueryValidatorOutstandingRewardsResponse

    public actual suspend fun validatorCommission(request: QueryValidatorCommissionRequest):
        QueryValidatorCommissionResponse

    public actual suspend fun validatorSlashes(request: QueryValidatorSlashesRequest):
        QueryValidatorSlashesResponse

    public actual suspend fun delegationRewards(request: QueryDelegationRewardsRequest):
        QueryDelegationRewardsResponse

    public actual suspend fun delegationTotalRewards(request: QueryDelegationTotalRewardsRequest):
        QueryDelegationTotalRewardsResponse

    public actual suspend fun delegatorValidators(request: QueryDelegatorValidatorsRequest):
        QueryDelegatorValidatorsResponse

    public actual suspend
        fun delegatorWithdrawAddress(request: QueryDelegatorWithdrawAddressRequest):
        QueryDelegatorWithdrawAddressResponse

    public actual suspend fun communityPool(request: QueryCommunityPoolRequest):
        QueryCommunityPoolResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
