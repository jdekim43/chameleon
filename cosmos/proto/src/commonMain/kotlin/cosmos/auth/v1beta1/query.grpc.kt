// Transform from cosmos/auth/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun accounts(request: QueryAccountsRequest): QueryAccountsResponse

    public suspend fun account(request: QueryAccountRequest): QueryAccountResponse

    public suspend fun accountAddressByID(request: QueryAccountAddressByIDRequest):
        QueryAccountAddressByIDResponse

    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public suspend fun moduleAccounts(request: QueryModuleAccountsRequest):
        QueryModuleAccountsResponse

    public suspend fun moduleAccountByName(request: QueryModuleAccountByNameRequest):
        QueryModuleAccountByNameResponse

    public suspend fun bech32Prefix(request: Bech32PrefixRequest): Bech32PrefixResponse

    public suspend fun addressBytesToString(request: AddressBytesToStringRequest):
        AddressBytesToStringResponse

    public suspend fun addressStringToBytes(request: AddressStringToBytesRequest):
        AddressStringToBytesResponse

    public suspend fun accountInfo(request: QueryAccountInfoRequest): QueryAccountInfoResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
