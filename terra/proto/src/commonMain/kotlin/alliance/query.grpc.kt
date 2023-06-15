// Transform from alliance/query.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public suspend fun alliances(request: QueryAlliancesRequest): QueryAlliancesResponse

    public suspend fun iBCAlliance(request: QueryIBCAllianceRequest): QueryAllianceResponse

    public suspend fun allAlliancesDelegations(request: QueryAllAlliancesDelegationsRequest):
        QueryAlliancesDelegationsResponse

    public suspend fun allianceValidator(request: QueryAllianceValidatorRequest):
        QueryAllianceValidatorResponse

    public suspend fun allAllianceValidators(request: QueryAllAllianceValidatorsRequest):
        QueryAllianceValidatorsResponse

    public suspend fun alliancesDelegation(request: QueryAlliancesDelegationsRequest):
        QueryAlliancesDelegationsResponse

    public suspend
        fun alliancesDelegationByValidator(request: QueryAlliancesDelegationByValidatorRequest):
        QueryAlliancesDelegationsResponse

    public suspend fun allianceDelegation(request: QueryAllianceDelegationRequest):
        QueryAllianceDelegationResponse

    public suspend fun iBCAllianceDelegation(request: QueryIBCAllianceDelegationRequest):
        QueryAllianceDelegationResponse

    public suspend fun allianceDelegationRewards(request: QueryAllianceDelegationRewardsRequest):
        QueryAllianceDelegationRewardsResponse

    public suspend
        fun iBCAllianceDelegationRewards(request: QueryIBCAllianceDelegationRewardsRequest):
        QueryAllianceDelegationRewardsResponse

    public suspend
        fun allianceUnbondingsByDenomAndDelegator(request: QueryAllianceUnbondingsByDenomAndDelegatorRequest):
        QueryAllianceUnbondingsByDenomAndDelegatorResponse

    public suspend fun allianceUnbondings(request: QueryAllianceUnbondingsRequest):
        QueryAllianceUnbondingsResponse

    public suspend fun allianceRedelegations(request: QueryAllianceRedelegationsRequest):
        QueryAllianceRedelegationsResponse

    public suspend fun alliance(request: QueryAllianceRequest): QueryAllianceResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
