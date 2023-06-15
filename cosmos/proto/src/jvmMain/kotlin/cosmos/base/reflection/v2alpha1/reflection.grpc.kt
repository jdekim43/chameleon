// Transform from cosmos/base/reflection/v2alpha1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v2alpha1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object ReflectionService :
    GrpcService<ReflectionService.Interface, ReflectionService.Server, ReflectionService.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun getAuthnDescriptor(request: GetAuthnDescriptorRequest):
        GetAuthnDescriptorResponse

    public actual suspend fun getChainDescriptor(request: GetChainDescriptorRequest):
        GetChainDescriptorResponse

    public actual suspend fun getCodecDescriptor(request: GetCodecDescriptorRequest):
        GetCodecDescriptorResponse

    public actual suspend
        fun getConfigurationDescriptor(request: GetConfigurationDescriptorRequest):
        GetConfigurationDescriptorResponse

    public actual suspend
        fun getQueryServicesDescriptor(request: GetQueryServicesDescriptorRequest):
        GetQueryServicesDescriptorResponse

    public actual suspend fun getTxDescriptor(request: GetTxDescriptorRequest):
        GetTxDescriptorResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : ReflectionServiceJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : ReflectionServiceJvm.Client(option), Interface
}
