// Transform from cosmos/tx/v1beta1/service.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Service : GrpcService<Service.Interface, Service.Server, Service.Client> {
  public interface Interface {
    public suspend fun simulate(request: SimulateRequest): SimulateResponse

    public suspend fun getTx(request: GetTxRequest): GetTxResponse

    public suspend fun broadcastTx(request: BroadcastTxRequest): BroadcastTxResponse

    public suspend fun getTxsEvent(request: GetTxsEventRequest): GetTxsEventResponse

    public suspend fun getBlockWithTxs(request: GetBlockWithTxsRequest): GetBlockWithTxsResponse

    public suspend fun txDecode(request: TxDecodeRequest): TxDecodeResponse

    public suspend fun txEncode(request: TxEncodeRequest): TxEncodeResponse

    public suspend fun txEncodeAmino(request: TxEncodeAminoRequest): TxEncodeAminoResponse

    public suspend fun txDecodeAmino(request: TxDecodeAminoRequest): TxDecodeAminoResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
