// Transform from cosmos/upgrade/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun currentPlan(request: QueryCurrentPlanRequest):
        QueryCurrentPlanResponse

    public actual suspend fun appliedPlan(request: QueryAppliedPlanRequest):
        QueryAppliedPlanResponse

    public actual suspend fun upgradedConsensusState(request: QueryUpgradedConsensusStateRequest):
        QueryUpgradedConsensusStateResponse

    public actual suspend fun moduleVersions(request: QueryModuleVersionsRequest):
        QueryModuleVersionsResponse

    public actual suspend fun authority(request: QueryAuthorityRequest): QueryAuthorityResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
