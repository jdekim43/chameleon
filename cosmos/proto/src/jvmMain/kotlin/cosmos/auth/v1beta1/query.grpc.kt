// Transform from cosmos/auth/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun accounts(request: QueryAccountsRequest): QueryAccountsResponse

    public actual suspend fun account(request: QueryAccountRequest): QueryAccountResponse

    public actual suspend fun accountAddressByID(request: QueryAccountAddressByIDRequest):
        QueryAccountAddressByIDResponse

    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public actual suspend fun moduleAccounts(request: QueryModuleAccountsRequest):
        QueryModuleAccountsResponse

    public actual suspend fun moduleAccountByName(request: QueryModuleAccountByNameRequest):
        QueryModuleAccountByNameResponse

    public actual suspend fun bech32Prefix(request: Bech32PrefixRequest): Bech32PrefixResponse

    public actual suspend fun addressBytesToString(request: AddressBytesToStringRequest):
        AddressBytesToStringResponse

    public actual suspend fun addressStringToBytes(request: AddressStringToBytesRequest):
        AddressStringToBytesResponse

    public actual suspend fun accountInfo(request: QueryAccountInfoRequest):
        QueryAccountInfoResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
