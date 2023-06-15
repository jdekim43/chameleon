// Transform from cosmos/bank/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun balance(request: QueryBalanceRequest): QueryBalanceResponse

    public actual suspend fun allBalances(request: QueryAllBalancesRequest):
        QueryAllBalancesResponse

    public actual suspend fun spendableBalances(request: QuerySpendableBalancesRequest):
        QuerySpendableBalancesResponse

    public actual suspend fun spendableBalanceByDenom(request: QuerySpendableBalanceByDenomRequest):
        QuerySpendableBalanceByDenomResponse

    public actual suspend fun totalSupply(request: QueryTotalSupplyRequest):
        QueryTotalSupplyResponse

    public actual suspend fun supplyOf(request: QuerySupplyOfRequest): QuerySupplyOfResponse

    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public actual suspend fun denomMetadata(request: QueryDenomMetadataRequest):
        QueryDenomMetadataResponse

    public actual suspend fun denomsMetadata(request: QueryDenomsMetadataRequest):
        QueryDenomsMetadataResponse

    public actual suspend fun denomOwners(request: QueryDenomOwnersRequest):
        QueryDenomOwnersResponse

    public actual suspend fun sendEnabled(request: QuerySendEnabledRequest):
        QuerySendEnabledResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
