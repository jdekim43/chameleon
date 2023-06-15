// Transform from cosmwasm/wasm/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun contractInfo(request: QueryContractInfoRequest):
        QueryContractInfoResponse

    public actual suspend fun contractHistory(request: QueryContractHistoryRequest):
        QueryContractHistoryResponse

    public actual suspend fun contractsByCode(request: QueryContractsByCodeRequest):
        QueryContractsByCodeResponse

    public actual suspend fun allContractState(request: QueryAllContractStateRequest):
        QueryAllContractStateResponse

    public actual suspend fun rawContractState(request: QueryRawContractStateRequest):
        QueryRawContractStateResponse

    public actual suspend fun smartContractState(request: QuerySmartContractStateRequest):
        QuerySmartContractStateResponse

    public actual suspend fun code(request: QueryCodeRequest): QueryCodeResponse

    public actual suspend fun codes(request: QueryCodesRequest): QueryCodesResponse

    public actual suspend fun pinnedCodes(request: QueryPinnedCodesRequest):
        QueryPinnedCodesResponse

    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public actual suspend fun contractsByCreator(request: QueryContractsByCreatorRequest):
        QueryContractsByCreatorResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
