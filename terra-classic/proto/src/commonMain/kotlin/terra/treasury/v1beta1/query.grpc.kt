// Transform from terra/treasury/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun taxRate(request: QueryTaxRateRequest): QueryTaxRateResponse

    public suspend fun taxCap(request: QueryTaxCapRequest): QueryTaxCapResponse

    public suspend fun taxCaps(request: QueryTaxCapsRequest): QueryTaxCapsResponse

    public suspend fun rewardWeight(request: QueryRewardWeightRequest): QueryRewardWeightResponse

    public suspend fun seigniorageProceeds(request: QuerySeigniorageProceedsRequest):
        QuerySeigniorageProceedsResponse

    public suspend fun taxProceeds(request: QueryTaxProceedsRequest): QueryTaxProceedsResponse

    public suspend fun indicators(request: QueryIndicatorsRequest): QueryIndicatorsResponse

    public suspend fun burnTaxExemptionList(request: QueryBurnTaxExemptionListRequest):
        QueryBurnTaxExemptionListResponse

    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
