// Transform from alliance/query.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public actual suspend fun alliances(request: QueryAlliancesRequest): QueryAlliancesResponse

    public actual suspend fun iBCAlliance(request: QueryIBCAllianceRequest): QueryAllianceResponse

    public actual suspend fun allAlliancesDelegations(request: QueryAllAlliancesDelegationsRequest):
        QueryAlliancesDelegationsResponse

    public actual suspend fun allianceValidator(request: QueryAllianceValidatorRequest):
        QueryAllianceValidatorResponse

    public actual suspend fun allAllianceValidators(request: QueryAllAllianceValidatorsRequest):
        QueryAllianceValidatorsResponse

    public actual suspend fun alliancesDelegation(request: QueryAlliancesDelegationsRequest):
        QueryAlliancesDelegationsResponse

    public actual suspend
        fun alliancesDelegationByValidator(request: QueryAlliancesDelegationByValidatorRequest):
        QueryAlliancesDelegationsResponse

    public actual suspend fun allianceDelegation(request: QueryAllianceDelegationRequest):
        QueryAllianceDelegationResponse

    public actual suspend fun iBCAllianceDelegation(request: QueryIBCAllianceDelegationRequest):
        QueryAllianceDelegationResponse

    public actual suspend
        fun allianceDelegationRewards(request: QueryAllianceDelegationRewardsRequest):
        QueryAllianceDelegationRewardsResponse

    public actual suspend
        fun iBCAllianceDelegationRewards(request: QueryIBCAllianceDelegationRewardsRequest):
        QueryAllianceDelegationRewardsResponse

    public actual suspend
        fun allianceUnbondingsByDenomAndDelegator(request: QueryAllianceUnbondingsByDenomAndDelegatorRequest):
        QueryAllianceUnbondingsByDenomAndDelegatorResponse

    public actual suspend fun allianceUnbondings(request: QueryAllianceUnbondingsRequest):
        QueryAllianceUnbondingsResponse

    public actual suspend fun allianceRedelegations(request: QueryAllianceRedelegationsRequest):
        QueryAllianceRedelegationsResponse

    public actual suspend fun alliance(request: QueryAllianceRequest): QueryAllianceResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
