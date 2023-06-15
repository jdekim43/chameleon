// Transform from cosmwasm/wasm/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

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

  private val contractInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryContractInfoRequest, QueryOuterClass.QueryContractInfoResponse>
      = QueryGrpc.getContractInfoMethod()!!

  private val contractHistoryDescriptor:
      MethodDescriptor<QueryOuterClass.QueryContractHistoryRequest, QueryOuterClass.QueryContractHistoryResponse>
      = QueryGrpc.getContractHistoryMethod()!!

  private val contractsByCodeDescriptor:
      MethodDescriptor<QueryOuterClass.QueryContractsByCodeRequest, QueryOuterClass.QueryContractsByCodeResponse>
      = QueryGrpc.getContractsByCodeMethod()!!

  private val allContractStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllContractStateRequest, QueryOuterClass.QueryAllContractStateResponse>
      = QueryGrpc.getAllContractStateMethod()!!

  private val rawContractStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryRawContractStateRequest, QueryOuterClass.QueryRawContractStateResponse>
      = QueryGrpc.getRawContractStateMethod()!!

  private val smartContractStateDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySmartContractStateRequest, QueryOuterClass.QuerySmartContractStateResponse>
      = QueryGrpc.getSmartContractStateMethod()!!

  private val codeDescriptor:
      MethodDescriptor<QueryOuterClass.QueryCodeRequest, QueryOuterClass.QueryCodeResponse> =
      QueryGrpc.getCodeMethod()!!

  private val codesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryCodesRequest, QueryOuterClass.QueryCodesResponse> =
      QueryGrpc.getCodesMethod()!!

  private val pinnedCodesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPinnedCodesRequest, QueryOuterClass.QueryPinnedCodesResponse>
      = QueryGrpc.getPinnedCodesMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val contractsByCreatorDescriptor:
      MethodDescriptor<QueryOuterClass.QueryContractsByCreatorRequest, QueryOuterClass.QueryContractsByCreatorResponse>
      = QueryGrpc.getContractsByCreatorMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun contractInfo(request: QueryContractInfoRequest):
        QueryContractInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Query.ContractInfo is unimplemented"))

    public open override suspend fun contractHistory(request: QueryContractHistoryRequest):
        QueryContractHistoryResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Query.ContractHistory is unimplemented"))

    public open override suspend fun contractsByCode(request: QueryContractsByCodeRequest):
        QueryContractsByCodeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Query.ContractsByCode is unimplemented"))

    public open override suspend fun allContractState(request: QueryAllContractStateRequest):
        QueryAllContractStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Query.AllContractState is unimplemented"))

    public open override suspend fun rawContractState(request: QueryRawContractStateRequest):
        QueryRawContractStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Query.RawContractState is unimplemented"))

    public open override suspend fun smartContractState(request: QuerySmartContractStateRequest):
        QuerySmartContractStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Query.SmartContractState is unimplemented"))

    public open override suspend fun code(request: QueryCodeRequest): QueryCodeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Query.Code is unimplemented"))

    public open override suspend fun codes(request: QueryCodesRequest): QueryCodesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Query.Codes is unimplemented"))

    public open override suspend fun pinnedCodes(request: QueryPinnedCodesRequest):
        QueryPinnedCodesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Query.PinnedCodes is unimplemented"))

    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Query.Params is unimplemented"))

    public open override suspend fun contractsByCreator(request: QueryContractsByCreatorRequest):
        QueryContractsByCreatorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmwasm.wasm.v1.Query.ContractsByCreator is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = contractInfoDescriptor,
    				implementation = {
        QueryContractInfoResponseJvmConverter.convert(contractInfo(QueryContractInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = contractHistoryDescriptor,
    				implementation = {
        QueryContractHistoryResponseJvmConverter.convert(contractHistory(QueryContractHistoryRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = contractsByCodeDescriptor,
    				implementation = {
        QueryContractsByCodeResponseJvmConverter.convert(contractsByCode(QueryContractsByCodeRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allContractStateDescriptor,
    				implementation = {
        QueryAllContractStateResponseJvmConverter.convert(allContractState(QueryAllContractStateRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = rawContractStateDescriptor,
    				implementation = {
        QueryRawContractStateResponseJvmConverter.convert(rawContractState(QueryRawContractStateRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = smartContractStateDescriptor,
    				implementation = {
        QuerySmartContractStateResponseJvmConverter.convert(smartContractState(QuerySmartContractStateRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = codeDescriptor,
    				implementation = {
        QueryCodeResponseJvmConverter.convert(code(QueryCodeRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = codesDescriptor,
    				implementation = {
        QueryCodesResponseJvmConverter.convert(codes(QueryCodesRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = pinnedCodesDescriptor,
    				implementation = {
        QueryPinnedCodesResponseJvmConverter.convert(pinnedCodes(QueryPinnedCodesRequestJvmConverter.convert(it)))
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
    				descriptor = contractsByCreatorDescriptor,
    				implementation = {
        QueryContractsByCreatorResponseJvmConverter.convert(contractsByCreator(QueryContractsByCreatorRequestJvmConverter.convert(it)))
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

    public override suspend fun contractInfo(request: QueryContractInfoRequest):
        QueryContractInfoResponse = contractInfo(request, Metadata())

    public suspend fun contractInfo(request: QueryContractInfoRequest, metadata: Metadata):
        QueryContractInfoResponse = QueryContractInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, contractInfoDescriptor,
    			QueryContractInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun contractHistory(request: QueryContractHistoryRequest):
        QueryContractHistoryResponse = contractHistory(request, Metadata())

    public suspend fun contractHistory(request: QueryContractHistoryRequest, metadata: Metadata):
        QueryContractHistoryResponse = QueryContractHistoryResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, contractHistoryDescriptor,
    			QueryContractHistoryRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun contractsByCode(request: QueryContractsByCodeRequest):
        QueryContractsByCodeResponse = contractsByCode(request, Metadata())

    public suspend fun contractsByCode(request: QueryContractsByCodeRequest, metadata: Metadata):
        QueryContractsByCodeResponse = QueryContractsByCodeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, contractsByCodeDescriptor,
    			QueryContractsByCodeRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun allContractState(request: QueryAllContractStateRequest):
        QueryAllContractStateResponse = allContractState(request, Metadata())

    public suspend fun allContractState(request: QueryAllContractStateRequest, metadata: Metadata):
        QueryAllContractStateResponse = QueryAllContractStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allContractStateDescriptor,
    			QueryAllContractStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun rawContractState(request: QueryRawContractStateRequest):
        QueryRawContractStateResponse = rawContractState(request, Metadata())

    public suspend fun rawContractState(request: QueryRawContractStateRequest, metadata: Metadata):
        QueryRawContractStateResponse = QueryRawContractStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, rawContractStateDescriptor,
    			QueryRawContractStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun smartContractState(request: QuerySmartContractStateRequest):
        QuerySmartContractStateResponse = smartContractState(request, Metadata())

    public suspend fun smartContractState(request: QuerySmartContractStateRequest,
        metadata: Metadata): QuerySmartContractStateResponse =
        QuerySmartContractStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, smartContractStateDescriptor,
    			QuerySmartContractStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun code(request: QueryCodeRequest): QueryCodeResponse = code(request,
        Metadata())

    public suspend fun code(request: QueryCodeRequest, metadata: Metadata): QueryCodeResponse =
        QueryCodeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, codeDescriptor,
    			QueryCodeRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun codes(request: QueryCodesRequest): QueryCodesResponse =
        codes(request, Metadata())

    public suspend fun codes(request: QueryCodesRequest, metadata: Metadata): QueryCodesResponse =
        QueryCodesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, codesDescriptor,
    			QueryCodesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun pinnedCodes(request: QueryPinnedCodesRequest):
        QueryPinnedCodesResponse = pinnedCodes(request, Metadata())

    public suspend fun pinnedCodes(request: QueryPinnedCodesRequest, metadata: Metadata):
        QueryPinnedCodesResponse = QueryPinnedCodesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, pinnedCodesDescriptor,
    			QueryPinnedCodesRequestJvmConverter.convert(request),
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

    public override suspend fun contractsByCreator(request: QueryContractsByCreatorRequest):
        QueryContractsByCreatorResponse = contractsByCreator(request, Metadata())

    public suspend fun contractsByCreator(request: QueryContractsByCreatorRequest,
        metadata: Metadata): QueryContractsByCreatorResponse =
        QueryContractsByCreatorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, contractsByCreatorDescriptor,
    			QueryContractsByCreatorRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
