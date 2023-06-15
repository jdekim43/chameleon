// Transform from tendermint/abci/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.abci

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object RequestConverter : ProtobufConverter<Request> by RequestJvmConverter

public actual object RequestEchoConverter : ProtobufConverter<RequestEcho> by
    RequestEchoJvmConverter

public actual object RequestFlushConverter : ProtobufConverter<RequestFlush> by
    RequestFlushJvmConverter

public actual object RequestInfoConverter : ProtobufConverter<RequestInfo> by
    RequestInfoJvmConverter

public actual object RequestInitChainConverter : ProtobufConverter<RequestInitChain> by
    RequestInitChainJvmConverter

public actual object RequestQueryConverter : ProtobufConverter<RequestQuery> by
    RequestQueryJvmConverter

public actual object RequestBeginBlockConverter : ProtobufConverter<RequestBeginBlock> by
    RequestBeginBlockJvmConverter

public actual object RequestCheckTxConverter : ProtobufConverter<RequestCheckTx> by
    RequestCheckTxJvmConverter

public actual object RequestDeliverTxConverter : ProtobufConverter<RequestDeliverTx> by
    RequestDeliverTxJvmConverter

public actual object RequestEndBlockConverter : ProtobufConverter<RequestEndBlock> by
    RequestEndBlockJvmConverter

public actual object RequestCommitConverter : ProtobufConverter<RequestCommit> by
    RequestCommitJvmConverter

public actual object RequestListSnapshotsConverter : ProtobufConverter<RequestListSnapshots> by
    RequestListSnapshotsJvmConverter

public actual object RequestOfferSnapshotConverter : ProtobufConverter<RequestOfferSnapshot> by
    RequestOfferSnapshotJvmConverter

public actual object RequestLoadSnapshotChunkConverter : ProtobufConverter<RequestLoadSnapshotChunk>
    by RequestLoadSnapshotChunkJvmConverter

public actual object RequestApplySnapshotChunkConverter :
    ProtobufConverter<RequestApplySnapshotChunk> by RequestApplySnapshotChunkJvmConverter

public actual object RequestPrepareProposalConverter : ProtobufConverter<RequestPrepareProposal> by
    RequestPrepareProposalJvmConverter

public actual object RequestProcessProposalConverter : ProtobufConverter<RequestProcessProposal> by
    RequestProcessProposalJvmConverter

public actual object ResponseConverter : ProtobufConverter<Response> by ResponseJvmConverter

public actual object ResponseExceptionConverter : ProtobufConverter<ResponseException> by
    ResponseExceptionJvmConverter

public actual object ResponseEchoConverter : ProtobufConverter<ResponseEcho> by
    ResponseEchoJvmConverter

public actual object ResponseFlushConverter : ProtobufConverter<ResponseFlush> by
    ResponseFlushJvmConverter

public actual object ResponseInfoConverter : ProtobufConverter<ResponseInfo> by
    ResponseInfoJvmConverter

public actual object ResponseInitChainConverter : ProtobufConverter<ResponseInitChain> by
    ResponseInitChainJvmConverter

public actual object ResponseQueryConverter : ProtobufConverter<ResponseQuery> by
    ResponseQueryJvmConverter

public actual object ResponseBeginBlockConverter : ProtobufConverter<ResponseBeginBlock> by
    ResponseBeginBlockJvmConverter

public actual object ResponseCheckTxConverter : ProtobufConverter<ResponseCheckTx> by
    ResponseCheckTxJvmConverter

public actual object ResponseDeliverTxConverter : ProtobufConverter<ResponseDeliverTx> by
    ResponseDeliverTxJvmConverter

public actual object ResponseEndBlockConverter : ProtobufConverter<ResponseEndBlock> by
    ResponseEndBlockJvmConverter

public actual object ResponseCommitConverter : ProtobufConverter<ResponseCommit> by
    ResponseCommitJvmConverter

public actual object ResponseListSnapshotsConverter : ProtobufConverter<ResponseListSnapshots> by
    ResponseListSnapshotsJvmConverter

public actual object ResponseOfferSnapshotConverter : ProtobufConverter<ResponseOfferSnapshot> by
    ResponseOfferSnapshotJvmConverter

public actual object ResponseLoadSnapshotChunkConverter :
    ProtobufConverter<ResponseLoadSnapshotChunk> by ResponseLoadSnapshotChunkJvmConverter

public actual object ResponseApplySnapshotChunkConverter :
    ProtobufConverter<ResponseApplySnapshotChunk> by ResponseApplySnapshotChunkJvmConverter

public actual object ResponsePrepareProposalConverter : ProtobufConverter<ResponsePrepareProposal>
    by ResponsePrepareProposalJvmConverter

public actual object ResponseProcessProposalConverter : ProtobufConverter<ResponseProcessProposal>
    by ResponseProcessProposalJvmConverter

public actual object CommitInfoConverter : ProtobufConverter<CommitInfo> by CommitInfoJvmConverter

public actual object ExtendedCommitInfoConverter : ProtobufConverter<ExtendedCommitInfo> by
    ExtendedCommitInfoJvmConverter

public actual object EventConverter : ProtobufConverter<Event> by EventJvmConverter

public actual object EventAttributeConverter : ProtobufConverter<EventAttribute> by
    EventAttributeJvmConverter

public actual object TxResultConverter : ProtobufConverter<TxResult> by TxResultJvmConverter

public actual object ValidatorConverter : ProtobufConverter<Validator> by ValidatorJvmConverter

public actual object ValidatorUpdateConverter : ProtobufConverter<ValidatorUpdate> by
    ValidatorUpdateJvmConverter

public actual object VoteInfoConverter : ProtobufConverter<VoteInfo> by VoteInfoJvmConverter

public actual object ExtendedVoteInfoConverter : ProtobufConverter<ExtendedVoteInfo> by
    ExtendedVoteInfoJvmConverter

public actual object MisbehaviorConverter : ProtobufConverter<Misbehavior> by
    MisbehaviorJvmConverter

public actual object SnapshotConverter : ProtobufConverter<Snapshot> by SnapshotJvmConverter
