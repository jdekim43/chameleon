// Transform from cosmos/staking/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun validators(request: QueryValidatorsRequest): QueryValidatorsResponse

    public actual suspend fun validator(request: QueryValidatorRequest): QueryValidatorResponse

    public actual suspend fun validatorDelegations(request: QueryValidatorDelegationsRequest):
        QueryValidatorDelegationsResponse

    public actual suspend
        fun validatorUnbondingDelegations(request: QueryValidatorUnbondingDelegationsRequest):
        QueryValidatorUnbondingDelegationsResponse

    public actual suspend fun delegation(request: QueryDelegationRequest): QueryDelegationResponse

    public actual suspend fun unbondingDelegation(request: QueryUnbondingDelegationRequest):
        QueryUnbondingDelegationResponse

    public actual suspend fun delegatorDelegations(request: QueryDelegatorDelegationsRequest):
        QueryDelegatorDelegationsResponse

    public actual suspend
        fun delegatorUnbondingDelegations(request: QueryDelegatorUnbondingDelegationsRequest):
        QueryDelegatorUnbondingDelegationsResponse

    public actual suspend fun redelegations(request: QueryRedelegationsRequest):
        QueryRedelegationsResponse

    public actual suspend fun delegatorValidators(request: QueryDelegatorValidatorsRequest):
        QueryDelegatorValidatorsResponse

    public actual suspend fun delegatorValidator(request: QueryDelegatorValidatorRequest):
        QueryDelegatorValidatorResponse

    public actual suspend fun historicalInfo(request: QueryHistoricalInfoRequest):
        QueryHistoricalInfoResponse

    public actual suspend fun pool(request: QueryPoolRequest): QueryPoolResponse

    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
