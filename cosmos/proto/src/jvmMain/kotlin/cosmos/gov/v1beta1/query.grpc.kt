// Transform from cosmos/gov/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun proposal(request: QueryProposalRequest): QueryProposalResponse

    public actual suspend fun proposals(request: QueryProposalsRequest): QueryProposalsResponse

    public actual suspend fun vote(request: QueryVoteRequest): QueryVoteResponse

    public actual suspend fun votes(request: QueryVotesRequest): QueryVotesResponse

    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public actual suspend fun deposit(request: QueryDepositRequest): QueryDepositResponse

    public actual suspend fun deposits(request: QueryDepositsRequest): QueryDepositsResponse

    public actual suspend fun tallyResult(request: QueryTallyResultRequest):
        QueryTallyResultResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
