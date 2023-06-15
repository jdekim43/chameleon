// Transform from terra/oracle/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun aggregateExchangeRatePrevote(request: MsgAggregateExchangeRatePrevote):
        MsgAggregateExchangeRatePrevoteResponse

    public suspend fun aggregateExchangeRateVote(request: MsgAggregateExchangeRateVote):
        MsgAggregateExchangeRateVoteResponse

    public suspend fun delegateFeedConsent(request: MsgDelegateFeedConsent):
        MsgDelegateFeedConsentResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
