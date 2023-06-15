// Transform from terra/treasury/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun taxRate(request: QueryTaxRateRequest): QueryTaxRateResponse

    public actual suspend fun taxCap(request: QueryTaxCapRequest): QueryTaxCapResponse

    public actual suspend fun taxCaps(request: QueryTaxCapsRequest): QueryTaxCapsResponse

    public actual suspend fun rewardWeight(request: QueryRewardWeightRequest):
        QueryRewardWeightResponse

    public actual suspend fun seigniorageProceeds(request: QuerySeigniorageProceedsRequest):
        QuerySeigniorageProceedsResponse

    public actual suspend fun taxProceeds(request: QueryTaxProceedsRequest):
        QueryTaxProceedsResponse

    public actual suspend fun indicators(request: QueryIndicatorsRequest): QueryIndicatorsResponse

    public actual suspend fun burnTaxExemptionList(request: QueryBurnTaxExemptionListRequest):
        QueryBurnTaxExemptionListResponse

    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
