// Transform from tendermint/abci/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.abci

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object ABCIApplication :
    GrpcService<ABCIApplication.Interface, ABCIApplication.Server, ABCIApplication.Client> {
  public interface Interface {
    public suspend fun echo(request: RequestEcho): ResponseEcho

    public suspend fun flush(request: RequestFlush): ResponseFlush

    public suspend fun info(request: RequestInfo): ResponseInfo

    public suspend fun deliverTx(request: RequestDeliverTx): ResponseDeliverTx

    public suspend fun checkTx(request: RequestCheckTx): ResponseCheckTx

    public suspend fun query(request: RequestQuery): ResponseQuery

    public suspend fun commit(request: RequestCommit): ResponseCommit

    public suspend fun initChain(request: RequestInitChain): ResponseInitChain

    public suspend fun beginBlock(request: RequestBeginBlock): ResponseBeginBlock

    public suspend fun endBlock(request: RequestEndBlock): ResponseEndBlock

    public suspend fun listSnapshots(request: RequestListSnapshots): ResponseListSnapshots

    public suspend fun offerSnapshot(request: RequestOfferSnapshot): ResponseOfferSnapshot

    public suspend fun loadSnapshotChunk(request: RequestLoadSnapshotChunk):
        ResponseLoadSnapshotChunk

    public suspend fun applySnapshotChunk(request: RequestApplySnapshotChunk):
        ResponseApplySnapshotChunk

    public suspend fun prepareProposal(request: RequestPrepareProposal): ResponsePrepareProposal

    public suspend fun processProposal(request: RequestProcessProposal): ResponseProcessProposal
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
