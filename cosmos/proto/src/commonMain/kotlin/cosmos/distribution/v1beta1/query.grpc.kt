// Transform from cosmos/distribution/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public suspend fun validatorDistributionInfo(request: QueryValidatorDistributionInfoRequest):
        QueryValidatorDistributionInfoResponse

    public suspend
        fun validatorOutstandingRewards(request: QueryValidatorOutstandingRewardsRequest):
        QueryValidatorOutstandingRewardsResponse

    public suspend fun validatorCommission(request: QueryValidatorCommissionRequest):
        QueryValidatorCommissionResponse

    public suspend fun validatorSlashes(request: QueryValidatorSlashesRequest):
        QueryValidatorSlashesResponse

    public suspend fun delegationRewards(request: QueryDelegationRewardsRequest):
        QueryDelegationRewardsResponse

    public suspend fun delegationTotalRewards(request: QueryDelegationTotalRewardsRequest):
        QueryDelegationTotalRewardsResponse

    public suspend fun delegatorValidators(request: QueryDelegatorValidatorsRequest):
        QueryDelegatorValidatorsResponse

    public suspend fun delegatorWithdrawAddress(request: QueryDelegatorWithdrawAddressRequest):
        QueryDelegatorWithdrawAddressResponse

    public suspend fun communityPool(request: QueryCommunityPoolRequest): QueryCommunityPoolResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
