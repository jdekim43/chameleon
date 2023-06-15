// Transform from cosmos/tx/v1beta1/service.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Service : GrpcService<Service.Interface, Service.Server, Service.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun simulate(request: SimulateRequest): SimulateResponse

    public actual suspend fun getTx(request: GetTxRequest): GetTxResponse

    public actual suspend fun broadcastTx(request: BroadcastTxRequest): BroadcastTxResponse

    public actual suspend fun getTxsEvent(request: GetTxsEventRequest): GetTxsEventResponse

    public actual suspend fun getBlockWithTxs(request: GetBlockWithTxsRequest):
        GetBlockWithTxsResponse

    public actual suspend fun txDecode(request: TxDecodeRequest): TxDecodeResponse

    public actual suspend fun txEncode(request: TxEncodeRequest): TxEncodeResponse

    public actual suspend fun txEncodeAmino(request: TxEncodeAminoRequest): TxEncodeAminoResponse

    public actual suspend fun txDecodeAmino(request: TxDecodeAminoRequest): TxDecodeAminoResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : ServiceJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : ServiceJvm.Client(option), Interface
}
