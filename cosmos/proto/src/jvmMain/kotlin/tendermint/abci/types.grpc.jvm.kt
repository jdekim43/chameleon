// Transform from tendermint/abci/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.abci

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ServerCalls
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.grpc.ClientOption

public object ABCIApplicationJvm {
  private val descriptor: ServiceDescriptor = ABCIApplicationGrpc.getServiceDescriptor()!!

  private val echoDescriptor: MethodDescriptor<Types.RequestEcho, Types.ResponseEcho> =
      ABCIApplicationGrpc.getEchoMethod()!!

  private val flushDescriptor: MethodDescriptor<Types.RequestFlush, Types.ResponseFlush> =
      ABCIApplicationGrpc.getFlushMethod()!!

  private val infoDescriptor: MethodDescriptor<Types.RequestInfo, Types.ResponseInfo> =
      ABCIApplicationGrpc.getInfoMethod()!!

  private val deliverTxDescriptor: MethodDescriptor<Types.RequestDeliverTx, Types.ResponseDeliverTx>
      = ABCIApplicationGrpc.getDeliverTxMethod()!!

  private val checkTxDescriptor: MethodDescriptor<Types.RequestCheckTx, Types.ResponseCheckTx> =
      ABCIApplicationGrpc.getCheckTxMethod()!!

  private val queryDescriptor: MethodDescriptor<Types.RequestQuery, Types.ResponseQuery> =
      ABCIApplicationGrpc.getQueryMethod()!!

  private val commitDescriptor: MethodDescriptor<Types.RequestCommit, Types.ResponseCommit> =
      ABCIApplicationGrpc.getCommitMethod()!!

  private val initChainDescriptor: MethodDescriptor<Types.RequestInitChain, Types.ResponseInitChain>
      = ABCIApplicationGrpc.getInitChainMethod()!!

  private val beginBlockDescriptor:
      MethodDescriptor<Types.RequestBeginBlock, Types.ResponseBeginBlock> =
      ABCIApplicationGrpc.getBeginBlockMethod()!!

  private val endBlockDescriptor: MethodDescriptor<Types.RequestEndBlock, Types.ResponseEndBlock> =
      ABCIApplicationGrpc.getEndBlockMethod()!!

  private val listSnapshotsDescriptor:
      MethodDescriptor<Types.RequestListSnapshots, Types.ResponseListSnapshots> =
      ABCIApplicationGrpc.getListSnapshotsMethod()!!

  private val offerSnapshotDescriptor:
      MethodDescriptor<Types.RequestOfferSnapshot, Types.ResponseOfferSnapshot> =
      ABCIApplicationGrpc.getOfferSnapshotMethod()!!

  private val loadSnapshotChunkDescriptor:
      MethodDescriptor<Types.RequestLoadSnapshotChunk, Types.ResponseLoadSnapshotChunk> =
      ABCIApplicationGrpc.getLoadSnapshotChunkMethod()!!

  private val applySnapshotChunkDescriptor:
      MethodDescriptor<Types.RequestApplySnapshotChunk, Types.ResponseApplySnapshotChunk> =
      ABCIApplicationGrpc.getApplySnapshotChunkMethod()!!

  private val prepareProposalDescriptor:
      MethodDescriptor<Types.RequestPrepareProposal, Types.ResponsePrepareProposal> =
      ABCIApplicationGrpc.getPrepareProposalMethod()!!

  private val processProposalDescriptor:
      MethodDescriptor<Types.RequestProcessProposal, Types.ResponseProcessProposal> =
      ABCIApplicationGrpc.getProcessProposalMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), ABCIApplication.Interface {
    public open override suspend fun echo(request: RequestEcho): ResponseEcho = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.Echo is unimplemented"))

    public open override suspend fun flush(request: RequestFlush): ResponseFlush = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.Flush is unimplemented"))

    public open override suspend fun info(request: RequestInfo): ResponseInfo = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.Info is unimplemented"))

    public open override suspend fun deliverTx(request: RequestDeliverTx): ResponseDeliverTx = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.DeliverTx is unimplemented"))

    public open override suspend fun checkTx(request: RequestCheckTx): ResponseCheckTx = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.CheckTx is unimplemented"))

    public open override suspend fun query(request: RequestQuery): ResponseQuery = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.Query is unimplemented"))

    public open override suspend fun commit(request: RequestCommit): ResponseCommit = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.Commit is unimplemented"))

    public open override suspend fun initChain(request: RequestInitChain): ResponseInitChain = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.InitChain is unimplemented"))

    public open override suspend fun beginBlock(request: RequestBeginBlock): ResponseBeginBlock =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.BeginBlock is unimplemented"))

    public open override suspend fun endBlock(request: RequestEndBlock): ResponseEndBlock = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.EndBlock is unimplemented"))

    public open override suspend fun listSnapshots(request: RequestListSnapshots):
        ResponseListSnapshots = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.ListSnapshots is unimplemented"))

    public open override suspend fun offerSnapshot(request: RequestOfferSnapshot):
        ResponseOfferSnapshot = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.OfferSnapshot is unimplemented"))

    public open override suspend fun loadSnapshotChunk(request: RequestLoadSnapshotChunk):
        ResponseLoadSnapshotChunk = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.LoadSnapshotChunk is unimplemented"))

    public open override suspend fun applySnapshotChunk(request: RequestApplySnapshotChunk):
        ResponseApplySnapshotChunk = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.ApplySnapshotChunk is unimplemented"))

    public open override suspend fun prepareProposal(request: RequestPrepareProposal):
        ResponsePrepareProposal = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.PrepareProposal is unimplemented"))

    public open override suspend fun processProposal(request: RequestProcessProposal):
        ResponseProcessProposal = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.ProcessProposal is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = echoDescriptor,
    				implementation = {
        ResponseEchoJvmConverter.convert(echo(RequestEchoJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = flushDescriptor,
    				implementation = {
        ResponseFlushJvmConverter.convert(flush(RequestFlushJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = infoDescriptor,
    				implementation = {
        ResponseInfoJvmConverter.convert(info(RequestInfoJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = deliverTxDescriptor,
    				implementation = {
        ResponseDeliverTxJvmConverter.convert(deliverTx(RequestDeliverTxJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = checkTxDescriptor,
    				implementation = {
        ResponseCheckTxJvmConverter.convert(checkTx(RequestCheckTxJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = queryDescriptor,
    				implementation = {
        ResponseQueryJvmConverter.convert(query(RequestQueryJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = commitDescriptor,
    				implementation = {
        ResponseCommitJvmConverter.convert(commit(RequestCommitJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = initChainDescriptor,
    				implementation = {
        ResponseInitChainJvmConverter.convert(initChain(RequestInitChainJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = beginBlockDescriptor,
    				implementation = {
        ResponseBeginBlockJvmConverter.convert(beginBlock(RequestBeginBlockJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = endBlockDescriptor,
    				implementation = {
        ResponseEndBlockJvmConverter.convert(endBlock(RequestEndBlockJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = listSnapshotsDescriptor,
    				implementation = {
        ResponseListSnapshotsJvmConverter.convert(listSnapshots(RequestListSnapshotsJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = offerSnapshotDescriptor,
    				implementation = {
        ResponseOfferSnapshotJvmConverter.convert(offerSnapshot(RequestOfferSnapshotJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = loadSnapshotChunkDescriptor,
    				implementation = {
        ResponseLoadSnapshotChunkJvmConverter.convert(loadSnapshotChunk(RequestLoadSnapshotChunkJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = applySnapshotChunkDescriptor,
    				implementation = {
        ResponseApplySnapshotChunkJvmConverter.convert(applySnapshotChunk(RequestApplySnapshotChunkJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = prepareProposalDescriptor,
    				implementation = {
        ResponsePrepareProposalJvmConverter.convert(prepareProposal(RequestPrepareProposalJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = processProposalDescriptor,
    				implementation = {
        ResponseProcessProposalJvmConverter.convert(processProposal(RequestProcessProposalJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<ABCIApplication.Client>(channel = option.channel, callOptions =
      option.callOptions), ABCIApplication.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): ABCIApplication.Client =
        ABCIApplication.Client(ClientOption(channel, callOptions))

    public override suspend fun echo(request: RequestEcho): ResponseEcho = echo(request, Metadata())

    public suspend fun echo(request: RequestEcho, metadata: Metadata): ResponseEcho =
        ResponseEchoJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, echoDescriptor,
    			RequestEchoJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun flush(request: RequestFlush): ResponseFlush = flush(request,
        Metadata())

    public suspend fun flush(request: RequestFlush, metadata: Metadata): ResponseFlush =
        ResponseFlushJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, flushDescriptor,
    			RequestFlushJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun info(request: RequestInfo): ResponseInfo = info(request, Metadata())

    public suspend fun info(request: RequestInfo, metadata: Metadata): ResponseInfo =
        ResponseInfoJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, infoDescriptor,
    			RequestInfoJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun deliverTx(request: RequestDeliverTx): ResponseDeliverTx =
        deliverTx(request, Metadata())

    public suspend fun deliverTx(request: RequestDeliverTx, metadata: Metadata): ResponseDeliverTx =
        ResponseDeliverTxJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, deliverTxDescriptor,
    			RequestDeliverTxJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun checkTx(request: RequestCheckTx): ResponseCheckTx = checkTx(request,
        Metadata())

    public suspend fun checkTx(request: RequestCheckTx, metadata: Metadata): ResponseCheckTx =
        ResponseCheckTxJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, checkTxDescriptor,
    			RequestCheckTxJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun query(request: RequestQuery): ResponseQuery = query(request,
        Metadata())

    public suspend fun query(request: RequestQuery, metadata: Metadata): ResponseQuery =
        ResponseQueryJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, queryDescriptor,
    			RequestQueryJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun commit(request: RequestCommit): ResponseCommit = commit(request,
        Metadata())

    public suspend fun commit(request: RequestCommit, metadata: Metadata): ResponseCommit =
        ResponseCommitJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, commitDescriptor,
    			RequestCommitJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun initChain(request: RequestInitChain): ResponseInitChain =
        initChain(request, Metadata())

    public suspend fun initChain(request: RequestInitChain, metadata: Metadata): ResponseInitChain =
        ResponseInitChainJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, initChainDescriptor,
    			RequestInitChainJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun beginBlock(request: RequestBeginBlock): ResponseBeginBlock =
        beginBlock(request, Metadata())

    public suspend fun beginBlock(request: RequestBeginBlock, metadata: Metadata):
        ResponseBeginBlock = ResponseBeginBlockJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, beginBlockDescriptor,
    			RequestBeginBlockJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun endBlock(request: RequestEndBlock): ResponseEndBlock =
        endBlock(request, Metadata())

    public suspend fun endBlock(request: RequestEndBlock, metadata: Metadata): ResponseEndBlock =
        ResponseEndBlockJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, endBlockDescriptor,
    			RequestEndBlockJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun listSnapshots(request: RequestListSnapshots): ResponseListSnapshots
        = listSnapshots(request, Metadata())

    public suspend fun listSnapshots(request: RequestListSnapshots, metadata: Metadata):
        ResponseListSnapshots = ResponseListSnapshotsJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, listSnapshotsDescriptor,
    			RequestListSnapshotsJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun offerSnapshot(request: RequestOfferSnapshot): ResponseOfferSnapshot
        = offerSnapshot(request, Metadata())

    public suspend fun offerSnapshot(request: RequestOfferSnapshot, metadata: Metadata):
        ResponseOfferSnapshot = ResponseOfferSnapshotJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, offerSnapshotDescriptor,
    			RequestOfferSnapshotJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun loadSnapshotChunk(request: RequestLoadSnapshotChunk):
        ResponseLoadSnapshotChunk = loadSnapshotChunk(request, Metadata())

    public suspend fun loadSnapshotChunk(request: RequestLoadSnapshotChunk, metadata: Metadata):
        ResponseLoadSnapshotChunk = ResponseLoadSnapshotChunkJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, loadSnapshotChunkDescriptor,
    			RequestLoadSnapshotChunkJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun applySnapshotChunk(request: RequestApplySnapshotChunk):
        ResponseApplySnapshotChunk = applySnapshotChunk(request, Metadata())

    public suspend fun applySnapshotChunk(request: RequestApplySnapshotChunk, metadata: Metadata):
        ResponseApplySnapshotChunk = ResponseApplySnapshotChunkJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, applySnapshotChunkDescriptor,
    			RequestApplySnapshotChunkJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun prepareProposal(request: RequestPrepareProposal):
        ResponsePrepareProposal = prepareProposal(request, Metadata())

    public suspend fun prepareProposal(request: RequestPrepareProposal, metadata: Metadata):
        ResponsePrepareProposal = ResponsePrepareProposalJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, prepareProposalDescriptor,
    			RequestPrepareProposalJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun processProposal(request: RequestProcessProposal):
        ResponseProcessProposal = processProposal(request, Metadata())

    public suspend fun processProposal(request: RequestProcessProposal, metadata: Metadata):
        ResponseProcessProposal = ResponseProcessProposalJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, processProposalDescriptor,
    			RequestProcessProposalJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
