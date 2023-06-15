// Transform from cosmos/base/reflection/v1beta1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object ReflectionService :
    GrpcService<ReflectionService.Interface, ReflectionService.Server, ReflectionService.Client> {
  public interface Interface {
    public suspend fun listAllInterfaces(request: ListAllInterfacesRequest):
        ListAllInterfacesResponse

    public suspend fun listImplementations(request: ListImplementationsRequest):
        ListImplementationsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
