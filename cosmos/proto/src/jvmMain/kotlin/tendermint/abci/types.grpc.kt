// Transform from tendermint/abci/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.abci

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object ABCIApplication :
    GrpcService<ABCIApplication.Interface, ABCIApplication.Server, ABCIApplication.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun echo(request: RequestEcho): ResponseEcho

    public actual suspend fun flush(request: RequestFlush): ResponseFlush

    public actual suspend fun info(request: RequestInfo): ResponseInfo

    public actual suspend fun deliverTx(request: RequestDeliverTx): ResponseDeliverTx

    public actual suspend fun checkTx(request: RequestCheckTx): ResponseCheckTx

    public actual suspend fun query(request: RequestQuery): ResponseQuery

    public actual suspend fun commit(request: RequestCommit): ResponseCommit

    public actual suspend fun initChain(request: RequestInitChain): ResponseInitChain

    public actual suspend fun beginBlock(request: RequestBeginBlock): ResponseBeginBlock

    public actual suspend fun endBlock(request: RequestEndBlock): ResponseEndBlock

    public actual suspend fun listSnapshots(request: RequestListSnapshots): ResponseListSnapshots

    public actual suspend fun offerSnapshot(request: RequestOfferSnapshot): ResponseOfferSnapshot

    public actual suspend fun loadSnapshotChunk(request: RequestLoadSnapshotChunk):
        ResponseLoadSnapshotChunk

    public actual suspend fun applySnapshotChunk(request: RequestApplySnapshotChunk):
        ResponseApplySnapshotChunk

    public actual suspend fun prepareProposal(request: RequestPrepareProposal):
        ResponsePrepareProposal

    public actual suspend fun processProposal(request: RequestProcessProposal):
        ResponseProcessProposal
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : ABCIApplicationJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : ABCIApplicationJvm.Client(option), Interface
}
