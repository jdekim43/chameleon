// Transform from terra/tx/v1beta1/service.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.tx.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Service : GrpcService<Service.Interface, Service.Server, Service.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun computeTax(request: ComputeTaxRequest): ComputeTaxResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : ServiceJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : ServiceJvm.Client(option), Interface
}
