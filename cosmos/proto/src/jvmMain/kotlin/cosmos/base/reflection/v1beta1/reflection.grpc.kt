// Transform from cosmos/base/reflection/v1beta1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object ReflectionService :
    GrpcService<ReflectionService.Interface, ReflectionService.Server, ReflectionService.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun listAllInterfaces(request: ListAllInterfacesRequest):
        ListAllInterfacesResponse

    public actual suspend fun listImplementations(request: ListImplementationsRequest):
        ListImplementationsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : ReflectionServiceJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : ReflectionServiceJvm.Client(option), Interface
}
