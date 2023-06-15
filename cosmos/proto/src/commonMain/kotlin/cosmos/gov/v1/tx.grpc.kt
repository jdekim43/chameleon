// Transform from cosmos/gov/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun submitProposal(request: MsgSubmitProposal): MsgSubmitProposalResponse

    public suspend fun execLegacyContent(request: MsgExecLegacyContent):
        MsgExecLegacyContentResponse

    public suspend fun vote(request: MsgVote): MsgVoteResponse

    public suspend fun voteWeighted(request: MsgVoteWeighted): MsgVoteWeightedResponse

    public suspend fun deposit(request: MsgDeposit): MsgDepositResponse

    public suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
