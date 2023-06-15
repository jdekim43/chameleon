// Transform from cosmos/base/tendermint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.tendermint.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Service : GrpcService<Service.Interface, Service.Server, Service.Client> {
  public interface Interface {
    public suspend fun getNodeInfo(request: GetNodeInfoRequest): GetNodeInfoResponse

    public suspend fun getSyncing(request: GetSyncingRequest): GetSyncingResponse

    public suspend fun getLatestBlock(request: GetLatestBlockRequest): GetLatestBlockResponse

    public suspend fun getBlockByHeight(request: GetBlockByHeightRequest): GetBlockByHeightResponse

    public suspend fun getLatestValidatorSet(request: GetLatestValidatorSetRequest):
        GetLatestValidatorSetResponse

    public suspend fun getValidatorSetByHeight(request: GetValidatorSetByHeightRequest):
        GetValidatorSetByHeightResponse

    public suspend fun aBCIQuery(request: ABCIQueryRequest): ABCIQueryResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
