// Transform from cosmwasm/wasm/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun contractInfo(request: QueryContractInfoRequest): QueryContractInfoResponse

    public suspend fun contractHistory(request: QueryContractHistoryRequest):
        QueryContractHistoryResponse

    public suspend fun contractsByCode(request: QueryContractsByCodeRequest):
        QueryContractsByCodeResponse

    public suspend fun allContractState(request: QueryAllContractStateRequest):
        QueryAllContractStateResponse

    public suspend fun rawContractState(request: QueryRawContractStateRequest):
        QueryRawContractStateResponse

    public suspend fun smartContractState(request: QuerySmartContractStateRequest):
        QuerySmartContractStateResponse

    public suspend fun code(request: QueryCodeRequest): QueryCodeResponse

    public suspend fun codes(request: QueryCodesRequest): QueryCodesResponse

    public suspend fun pinnedCodes(request: QueryPinnedCodesRequest): QueryPinnedCodesResponse

    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public suspend fun contractsByCreator(request: QueryContractsByCreatorRequest):
        QueryContractsByCreatorResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
