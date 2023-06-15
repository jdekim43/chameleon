// Transform from cosmos/authz/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun grants(request: QueryGrantsRequest): QueryGrantsResponse

    public suspend fun granterGrants(request: QueryGranterGrantsRequest): QueryGranterGrantsResponse

    public suspend fun granteeGrants(request: QueryGranteeGrantsRequest): QueryGranteeGrantsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
