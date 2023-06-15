// Transform from cosmos/auth/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.v1beta1

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ServerCalls
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.grpc.ClientOption

public object QueryJvm {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val accountsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAccountsRequest, QueryOuterClass.QueryAccountsResponse>
      = QueryGrpc.getAccountsMethod()!!

  private val accountDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAccountRequest, QueryOuterClass.QueryAccountResponse> =
      QueryGrpc.getAccountMethod()!!

  private val accountAddressByIDDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAccountAddressByIDRequest, QueryOuterClass.QueryAccountAddressByIDResponse>
      = QueryGrpc.getAccountAddressByIDMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val moduleAccountsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleAccountsRequest, QueryOuterClass.QueryModuleAccountsResponse>
      = QueryGrpc.getModuleAccountsMethod()!!

  private val moduleAccountByNameDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleAccountByNameRequest, QueryOuterClass.QueryModuleAccountByNameResponse>
      = QueryGrpc.getModuleAccountByNameMethod()!!

  private val bech32PrefixDescriptor:
      MethodDescriptor<QueryOuterClass.Bech32PrefixRequest, QueryOuterClass.Bech32PrefixResponse> =
      QueryGrpc.getBech32PrefixMethod()!!

  private val addressBytesToStringDescriptor:
      MethodDescriptor<QueryOuterClass.AddressBytesToStringRequest, QueryOuterClass.AddressBytesToStringResponse>
      = QueryGrpc.getAddressBytesToStringMethod()!!

  private val addressStringToBytesDescriptor:
      MethodDescriptor<QueryOuterClass.AddressStringToBytesRequest, QueryOuterClass.AddressStringToBytesResponse>
      = QueryGrpc.getAddressStringToBytesMethod()!!

  private val accountInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAccountInfoRequest, QueryOuterClass.QueryAccountInfoResponse>
      = QueryGrpc.getAccountInfoMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun accounts(request: QueryAccountsRequest): QueryAccountsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.Accounts is unimplemented"))

    public open override suspend fun account(request: QueryAccountRequest): QueryAccountResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.Account is unimplemented"))

    public open override suspend fun accountAddressByID(request: QueryAccountAddressByIDRequest):
        QueryAccountAddressByIDResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.AccountAddressByID is unimplemented"))

    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.Params is unimplemented"))

    public open override suspend fun moduleAccounts(request: QueryModuleAccountsRequest):
        QueryModuleAccountsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.ModuleAccounts is unimplemented"))

    public open override suspend fun moduleAccountByName(request: QueryModuleAccountByNameRequest):
        QueryModuleAccountByNameResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.ModuleAccountByName is unimplemented"))

    public open override suspend fun bech32Prefix(request: Bech32PrefixRequest):
        Bech32PrefixResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.Bech32Prefix is unimplemented"))

    public open override suspend fun addressBytesToString(request: AddressBytesToStringRequest):
        AddressBytesToStringResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.AddressBytesToString is unimplemented"))

    public open override suspend fun addressStringToBytes(request: AddressStringToBytesRequest):
        AddressStringToBytesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.AddressStringToBytes is unimplemented"))

    public open override suspend fun accountInfo(request: QueryAccountInfoRequest):
        QueryAccountInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.AccountInfo is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = accountsDescriptor,
    				implementation = {
        QueryAccountsResponseJvmConverter.convert(accounts(QueryAccountsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = accountDescriptor,
    				implementation = {
        QueryAccountResponseJvmConverter.convert(account(QueryAccountRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = accountAddressByIDDescriptor,
    				implementation = {
        QueryAccountAddressByIDResponseJvmConverter.convert(accountAddressByID(QueryAccountAddressByIDRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = paramsDescriptor,
    				implementation = {
        QueryParamsResponseJvmConverter.convert(params(QueryParamsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = moduleAccountsDescriptor,
    				implementation = {
        QueryModuleAccountsResponseJvmConverter.convert(moduleAccounts(QueryModuleAccountsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = moduleAccountByNameDescriptor,
    				implementation = {
        QueryModuleAccountByNameResponseJvmConverter.convert(moduleAccountByName(QueryModuleAccountByNameRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = bech32PrefixDescriptor,
    				implementation = {
        Bech32PrefixResponseJvmConverter.convert(bech32Prefix(Bech32PrefixRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = addressBytesToStringDescriptor,
    				implementation = {
        AddressBytesToStringResponseJvmConverter.convert(addressBytesToString(AddressBytesToStringRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = addressStringToBytesDescriptor,
    				implementation = {
        AddressStringToBytesResponseJvmConverter.convert(addressStringToBytes(AddressStringToBytesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = accountInfoDescriptor,
    				implementation = {
        QueryAccountInfoResponseJvmConverter.convert(accountInfo(QueryAccountInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Query.Client>(channel = option.channel, callOptions =
      option.callOptions), Query.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Query.Client =
        Query.Client(ClientOption(channel, callOptions))

    public override suspend fun accounts(request: QueryAccountsRequest): QueryAccountsResponse =
        accounts(request, Metadata())

    public suspend fun accounts(request: QueryAccountsRequest, metadata: Metadata):
        QueryAccountsResponse = QueryAccountsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, accountsDescriptor,
    			QueryAccountsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun account(request: QueryAccountRequest): QueryAccountResponse =
        account(request, Metadata())

    public suspend fun account(request: QueryAccountRequest, metadata: Metadata):
        QueryAccountResponse = QueryAccountResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, accountDescriptor,
    			QueryAccountRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun accountAddressByID(request: QueryAccountAddressByIDRequest):
        QueryAccountAddressByIDResponse = accountAddressByID(request, Metadata())

    public suspend fun accountAddressByID(request: QueryAccountAddressByIDRequest,
        metadata: Metadata): QueryAccountAddressByIDResponse =
        QueryAccountAddressByIDResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, accountAddressByIDDescriptor,
    			QueryAccountAddressByIDRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        params(request, Metadata())

    public suspend fun params(request: QueryParamsRequest, metadata: Metadata): QueryParamsResponse
        = QueryParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, paramsDescriptor,
    			QueryParamsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun moduleAccounts(request: QueryModuleAccountsRequest):
        QueryModuleAccountsResponse = moduleAccounts(request, Metadata())

    public suspend fun moduleAccounts(request: QueryModuleAccountsRequest, metadata: Metadata):
        QueryModuleAccountsResponse = QueryModuleAccountsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, moduleAccountsDescriptor,
    			QueryModuleAccountsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun moduleAccountByName(request: QueryModuleAccountByNameRequest):
        QueryModuleAccountByNameResponse = moduleAccountByName(request, Metadata())

    public suspend fun moduleAccountByName(request: QueryModuleAccountByNameRequest,
        metadata: Metadata): QueryModuleAccountByNameResponse =
        QueryModuleAccountByNameResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, moduleAccountByNameDescriptor,
    			QueryModuleAccountByNameRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun bech32Prefix(request: Bech32PrefixRequest): Bech32PrefixResponse =
        bech32Prefix(request, Metadata())

    public suspend fun bech32Prefix(request: Bech32PrefixRequest, metadata: Metadata):
        Bech32PrefixResponse = Bech32PrefixResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, bech32PrefixDescriptor,
    			Bech32PrefixRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun addressBytesToString(request: AddressBytesToStringRequest):
        AddressBytesToStringResponse = addressBytesToString(request, Metadata())

    public suspend fun addressBytesToString(request: AddressBytesToStringRequest,
        metadata: Metadata): AddressBytesToStringResponse =
        AddressBytesToStringResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, addressBytesToStringDescriptor,
    			AddressBytesToStringRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun addressStringToBytes(request: AddressStringToBytesRequest):
        AddressStringToBytesResponse = addressStringToBytes(request, Metadata())

    public suspend fun addressStringToBytes(request: AddressStringToBytesRequest,
        metadata: Metadata): AddressStringToBytesResponse =
        AddressStringToBytesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, addressStringToBytesDescriptor,
    			AddressStringToBytesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun accountInfo(request: QueryAccountInfoRequest):
        QueryAccountInfoResponse = accountInfo(request, Metadata())

    public suspend fun accountInfo(request: QueryAccountInfoRequest, metadata: Metadata):
        QueryAccountInfoResponse = QueryAccountInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, accountInfoDescriptor,
    			QueryAccountInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
