// Transform from cosmos/authz/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun grant(request: MsgGrant): MsgGrantResponse

    public actual suspend fun exec(request: MsgExec): MsgExecResponse

    public actual suspend fun revoke(request: MsgRevoke): MsgRevokeResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
