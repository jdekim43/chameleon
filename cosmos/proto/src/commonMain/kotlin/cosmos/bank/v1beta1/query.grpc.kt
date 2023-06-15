// Transform from cosmos/bank/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun balance(request: QueryBalanceRequest): QueryBalanceResponse

    public suspend fun allBalances(request: QueryAllBalancesRequest): QueryAllBalancesResponse

    public suspend fun spendableBalances(request: QuerySpendableBalancesRequest):
        QuerySpendableBalancesResponse

    public suspend fun spendableBalanceByDenom(request: QuerySpendableBalanceByDenomRequest):
        QuerySpendableBalanceByDenomResponse

    public suspend fun totalSupply(request: QueryTotalSupplyRequest): QueryTotalSupplyResponse

    public suspend fun supplyOf(request: QuerySupplyOfRequest): QuerySupplyOfResponse

    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public suspend fun denomMetadata(request: QueryDenomMetadataRequest): QueryDenomMetadataResponse

    public suspend fun denomsMetadata(request: QueryDenomsMetadataRequest):
        QueryDenomsMetadataResponse

    public suspend fun denomOwners(request: QueryDenomOwnersRequest): QueryDenomOwnersResponse

    public suspend fun sendEnabled(request: QuerySendEnabledRequest): QuerySendEnabledResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
