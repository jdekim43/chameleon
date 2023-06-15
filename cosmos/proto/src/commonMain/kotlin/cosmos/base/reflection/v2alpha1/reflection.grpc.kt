// Transform from cosmos/base/reflection/v2alpha1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v2alpha1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object ReflectionService :
    GrpcService<ReflectionService.Interface, ReflectionService.Server, ReflectionService.Client> {
  public interface Interface {
    public suspend fun getAuthnDescriptor(request: GetAuthnDescriptorRequest):
        GetAuthnDescriptorResponse

    public suspend fun getChainDescriptor(request: GetChainDescriptorRequest):
        GetChainDescriptorResponse

    public suspend fun getCodecDescriptor(request: GetCodecDescriptorRequest):
        GetCodecDescriptorResponse

    public suspend fun getConfigurationDescriptor(request: GetConfigurationDescriptorRequest):
        GetConfigurationDescriptorResponse

    public suspend fun getQueryServicesDescriptor(request: GetQueryServicesDescriptorRequest):
        GetQueryServicesDescriptorResponse

    public suspend fun getTxDescriptor(request: GetTxDescriptorRequest): GetTxDescriptorResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
