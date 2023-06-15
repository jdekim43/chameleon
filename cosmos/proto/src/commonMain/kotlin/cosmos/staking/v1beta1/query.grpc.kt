// Transform from cosmos/staking/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun validators(request: QueryValidatorsRequest): QueryValidatorsResponse

    public suspend fun validator(request: QueryValidatorRequest): QueryValidatorResponse

    public suspend fun validatorDelegations(request: QueryValidatorDelegationsRequest):
        QueryValidatorDelegationsResponse

    public suspend
        fun validatorUnbondingDelegations(request: QueryValidatorUnbondingDelegationsRequest):
        QueryValidatorUnbondingDelegationsResponse

    public suspend fun delegation(request: QueryDelegationRequest): QueryDelegationResponse

    public suspend fun unbondingDelegation(request: QueryUnbondingDelegationRequest):
        QueryUnbondingDelegationResponse

    public suspend fun delegatorDelegations(request: QueryDelegatorDelegationsRequest):
        QueryDelegatorDelegationsResponse

    public suspend
        fun delegatorUnbondingDelegations(request: QueryDelegatorUnbondingDelegationsRequest):
        QueryDelegatorUnbondingDelegationsResponse

    public suspend fun redelegations(request: QueryRedelegationsRequest): QueryRedelegationsResponse

    public suspend fun delegatorValidators(request: QueryDelegatorValidatorsRequest):
        QueryDelegatorValidatorsResponse

    public suspend fun delegatorValidator(request: QueryDelegatorValidatorRequest):
        QueryDelegatorValidatorResponse

    public suspend fun historicalInfo(request: QueryHistoricalInfoRequest):
        QueryHistoricalInfoResponse

    public suspend fun pool(request: QueryPoolRequest): QueryPoolResponse

    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
