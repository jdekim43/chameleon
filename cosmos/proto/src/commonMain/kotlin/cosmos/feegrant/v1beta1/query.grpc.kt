// Transform from cosmos/feegrant/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun allowance(request: QueryAllowanceRequest): QueryAllowanceResponse

    public suspend fun allowances(request: QueryAllowancesRequest): QueryAllowancesResponse

    public suspend fun allowancesByGranter(request: QueryAllowancesByGranterRequest):
        QueryAllowancesByGranterResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
