// Transform from cosmwasm/wasm/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object QueryContractInfoRequestJvmConverter :
    ProtobufTypeMapper<QueryContractInfoRequest, QueryOuterClass.QueryContractInfoRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryContractInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryContractInfoRequest> =
      QueryOuterClass.QueryContractInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryContractInfoRequest):
      QueryContractInfoRequest = QueryContractInfoRequest(
  	address = obj.getAddress(),
  )

  public override fun convert(obj: QueryContractInfoRequest):
      QueryOuterClass.QueryContractInfoRequest {
    val builder = QueryOuterClass.QueryContractInfoRequest.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryContractInfoResponseJvmConverter :
    ProtobufTypeMapper<QueryContractInfoResponse, QueryOuterClass.QueryContractInfoResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryContractInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryContractInfoResponse> =
      QueryOuterClass.QueryContractInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryContractInfoResponse):
      QueryContractInfoResponse = QueryContractInfoResponse(
  	address = obj.getAddress(),
  	contractInfo = ContractInfoJvmConverter.convert(obj.getContractInfo()),
  )

  public override fun convert(obj: QueryContractInfoResponse):
      QueryOuterClass.QueryContractInfoResponse {
    val builder = QueryOuterClass.QueryContractInfoResponse.newBuilder()
    builder.setAddress(obj.address)
    builder.setContractInfo(ContractInfoJvmConverter.convert(obj.contractInfo))
    return builder.build()
  }
}

public object QueryContractHistoryRequestJvmConverter :
    ProtobufTypeMapper<QueryContractHistoryRequest, QueryOuterClass.QueryContractHistoryRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryContractHistoryRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryContractHistoryRequest> =
      QueryOuterClass.QueryContractHistoryRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryContractHistoryRequest):
      QueryContractHistoryRequest = QueryContractHistoryRequest(
  	address = obj.getAddress(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryContractHistoryRequest):
      QueryOuterClass.QueryContractHistoryRequest {
    val builder = QueryOuterClass.QueryContractHistoryRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryContractHistoryResponseJvmConverter :
    ProtobufTypeMapper<QueryContractHistoryResponse, QueryOuterClass.QueryContractHistoryResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryContractHistoryResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryContractHistoryResponse> =
      QueryOuterClass.QueryContractHistoryResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryContractHistoryResponse):
      QueryContractHistoryResponse = QueryContractHistoryResponse(
  	entries = obj.getEntriesList().map { ContractCodeHistoryEntryJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryContractHistoryResponse):
      QueryOuterClass.QueryContractHistoryResponse {
    val builder = QueryOuterClass.QueryContractHistoryResponse.newBuilder()
    builder.addAllEntries(obj.entries.map { ContractCodeHistoryEntryJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryContractsByCodeRequestJvmConverter :
    ProtobufTypeMapper<QueryContractsByCodeRequest, QueryOuterClass.QueryContractsByCodeRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryContractsByCodeRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryContractsByCodeRequest> =
      QueryOuterClass.QueryContractsByCodeRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryContractsByCodeRequest):
      QueryContractsByCodeRequest = QueryContractsByCodeRequest(
  	codeId = obj.getCodeId().asKotlinType,
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryContractsByCodeRequest):
      QueryOuterClass.QueryContractsByCodeRequest {
    val builder = QueryOuterClass.QueryContractsByCodeRequest.newBuilder()
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryContractsByCodeResponseJvmConverter :
    ProtobufTypeMapper<QueryContractsByCodeResponse, QueryOuterClass.QueryContractsByCodeResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryContractsByCodeResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryContractsByCodeResponse> =
      QueryOuterClass.QueryContractsByCodeResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryContractsByCodeResponse):
      QueryContractsByCodeResponse = QueryContractsByCodeResponse(
  	contracts = obj.getContractsList().map { it },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryContractsByCodeResponse):
      QueryOuterClass.QueryContractsByCodeResponse {
    val builder = QueryOuterClass.QueryContractsByCodeResponse.newBuilder()
    builder.addAllContracts(obj.contracts.map { it })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllContractStateRequestJvmConverter :
    ProtobufTypeMapper<QueryAllContractStateRequest, QueryOuterClass.QueryAllContractStateRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllContractStateRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllContractStateRequest> =
      QueryOuterClass.QueryAllContractStateRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllContractStateRequest):
      QueryAllContractStateRequest = QueryAllContractStateRequest(
  	address = obj.getAddress(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllContractStateRequest):
      QueryOuterClass.QueryAllContractStateRequest {
    val builder = QueryOuterClass.QueryAllContractStateRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllContractStateResponseJvmConverter :
    ProtobufTypeMapper<QueryAllContractStateResponse, QueryOuterClass.QueryAllContractStateResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllContractStateResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllContractStateResponse> =
      QueryOuterClass.QueryAllContractStateResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllContractStateResponse):
      QueryAllContractStateResponse = QueryAllContractStateResponse(
  	models = obj.getModelsList().map { ModelJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllContractStateResponse):
      QueryOuterClass.QueryAllContractStateResponse {
    val builder = QueryOuterClass.QueryAllContractStateResponse.newBuilder()
    builder.addAllModels(obj.models.map { ModelJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryRawContractStateRequestJvmConverter :
    ProtobufTypeMapper<QueryRawContractStateRequest, QueryOuterClass.QueryRawContractStateRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryRawContractStateRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryRawContractStateRequest> =
      QueryOuterClass.QueryRawContractStateRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryRawContractStateRequest):
      QueryRawContractStateRequest = QueryRawContractStateRequest(
  	address = obj.getAddress(),
  	queryData = obj.getQueryData().toByteArray(),
  )

  public override fun convert(obj: QueryRawContractStateRequest):
      QueryOuterClass.QueryRawContractStateRequest {
    val builder = QueryOuterClass.QueryRawContractStateRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setQueryData(ByteString.copyFrom(obj.queryData))
    return builder.build()
  }
}

public object QueryRawContractStateResponseJvmConverter :
    ProtobufTypeMapper<QueryRawContractStateResponse, QueryOuterClass.QueryRawContractStateResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryRawContractStateResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryRawContractStateResponse> =
      QueryOuterClass.QueryRawContractStateResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryRawContractStateResponse):
      QueryRawContractStateResponse = QueryRawContractStateResponse(
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: QueryRawContractStateResponse):
      QueryOuterClass.QueryRawContractStateResponse {
    val builder = QueryOuterClass.QueryRawContractStateResponse.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object QuerySmartContractStateRequestJvmConverter :
    ProtobufTypeMapper<QuerySmartContractStateRequest, QueryOuterClass.QuerySmartContractStateRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySmartContractStateRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySmartContractStateRequest> =
      QueryOuterClass.QuerySmartContractStateRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySmartContractStateRequest):
      QuerySmartContractStateRequest = QuerySmartContractStateRequest(
  	address = obj.getAddress(),
  	queryData = obj.getQueryData().toByteArray(),
  )

  public override fun convert(obj: QuerySmartContractStateRequest):
      QueryOuterClass.QuerySmartContractStateRequest {
    val builder = QueryOuterClass.QuerySmartContractStateRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setQueryData(ByteString.copyFrom(obj.queryData))
    return builder.build()
  }
}

public object QuerySmartContractStateResponseJvmConverter :
    ProtobufTypeMapper<QuerySmartContractStateResponse, QueryOuterClass.QuerySmartContractStateResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySmartContractStateResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySmartContractStateResponse> =
      QueryOuterClass.QuerySmartContractStateResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySmartContractStateResponse):
      QuerySmartContractStateResponse = QuerySmartContractStateResponse(
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: QuerySmartContractStateResponse):
      QueryOuterClass.QuerySmartContractStateResponse {
    val builder = QueryOuterClass.QuerySmartContractStateResponse.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object QueryCodeRequestJvmConverter :
    ProtobufTypeMapper<QueryCodeRequest, QueryOuterClass.QueryCodeRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCodeRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCodeRequest> =
      QueryOuterClass.QueryCodeRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryCodeRequest): QueryCodeRequest =
      QueryCodeRequest(
  	codeId = obj.getCodeId().asKotlinType,
  )

  public override fun convert(obj: QueryCodeRequest): QueryOuterClass.QueryCodeRequest {
    val builder = QueryOuterClass.QueryCodeRequest.newBuilder()
    builder.setCodeId(obj.codeId.asJavaType)
    return builder.build()
  }
}

public object CodeInfoResponseJvmConverter :
    ProtobufTypeMapper<CodeInfoResponse, QueryOuterClass.CodeInfoResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.CodeInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.CodeInfoResponse> =
      QueryOuterClass.CodeInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.CodeInfoResponse): CodeInfoResponse =
      CodeInfoResponse(
  	codeId = obj.getCodeId().asKotlinType,
  	creator = obj.getCreator(),
  	dataHash = obj.getDataHash().toByteArray(),
  	instantiatePermission = AccessConfigJvmConverter.convert(obj.getInstantiatePermission()),
  )

  public override fun convert(obj: CodeInfoResponse): QueryOuterClass.CodeInfoResponse {
    val builder = QueryOuterClass.CodeInfoResponse.newBuilder()
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setCreator(obj.creator)
    builder.setDataHash(ByteString.copyFrom(obj.dataHash))
    builder.setInstantiatePermission(AccessConfigJvmConverter.convert(obj.instantiatePermission))
    return builder.build()
  }
}

public object QueryCodeResponseJvmConverter :
    ProtobufTypeMapper<QueryCodeResponse, QueryOuterClass.QueryCodeResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCodeResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCodeResponse> =
      QueryOuterClass.QueryCodeResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryCodeResponse): QueryCodeResponse =
      QueryCodeResponse(
  	codeInfo = CodeInfoResponseJvmConverter.convert(obj.getCodeInfo()),
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: QueryCodeResponse): QueryOuterClass.QueryCodeResponse {
    val builder = QueryOuterClass.QueryCodeResponse.newBuilder()
    builder.setCodeInfo(CodeInfoResponseJvmConverter.convert(obj.codeInfo))
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object QueryCodesRequestJvmConverter :
    ProtobufTypeMapper<QueryCodesRequest, QueryOuterClass.QueryCodesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCodesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCodesRequest> =
      QueryOuterClass.QueryCodesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryCodesRequest): QueryCodesRequest =
      QueryCodesRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryCodesRequest): QueryOuterClass.QueryCodesRequest {
    val builder = QueryOuterClass.QueryCodesRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryCodesResponseJvmConverter :
    ProtobufTypeMapper<QueryCodesResponse, QueryOuterClass.QueryCodesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCodesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCodesResponse> =
      QueryOuterClass.QueryCodesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryCodesResponse): QueryCodesResponse =
      QueryCodesResponse(
  	codeInfos = obj.getCodeInfosList().map { CodeInfoResponseJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryCodesResponse): QueryOuterClass.QueryCodesResponse {
    val builder = QueryOuterClass.QueryCodesResponse.newBuilder()
    builder.addAllCodeInfos(obj.codeInfos.map { CodeInfoResponseJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryPinnedCodesRequestJvmConverter :
    ProtobufTypeMapper<QueryPinnedCodesRequest, QueryOuterClass.QueryPinnedCodesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPinnedCodesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPinnedCodesRequest> =
      QueryOuterClass.QueryPinnedCodesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryPinnedCodesRequest): QueryPinnedCodesRequest
      = QueryPinnedCodesRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryPinnedCodesRequest):
      QueryOuterClass.QueryPinnedCodesRequest {
    val builder = QueryOuterClass.QueryPinnedCodesRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryPinnedCodesResponseJvmConverter :
    ProtobufTypeMapper<QueryPinnedCodesResponse, QueryOuterClass.QueryPinnedCodesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPinnedCodesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPinnedCodesResponse> =
      QueryOuterClass.QueryPinnedCodesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryPinnedCodesResponse):
      QueryPinnedCodesResponse = QueryPinnedCodesResponse(
  	codeIds = obj.getCodeIdsList().map { it.asKotlinType },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryPinnedCodesResponse):
      QueryOuterClass.QueryPinnedCodesResponse {
    val builder = QueryOuterClass.QueryPinnedCodesResponse.newBuilder()
    builder.addAllCodeIds(obj.codeIds.map { it.asJavaType })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryParamsRequestJvmConverter :
    ProtobufTypeMapper<QueryParamsRequest, QueryOuterClass.QueryParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsRequest> =
      QueryOuterClass.QueryParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsRequest): QueryParamsRequest =
      QueryParamsRequest(
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryParamsResponseJvmConverter :
    ProtobufTypeMapper<QueryParamsResponse, QueryOuterClass.QueryParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsResponse> =
      QueryOuterClass.QueryParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsResponse): QueryParamsResponse =
      QueryParamsResponse(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object QueryContractsByCreatorRequestJvmConverter :
    ProtobufTypeMapper<QueryContractsByCreatorRequest, QueryOuterClass.QueryContractsByCreatorRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryContractsByCreatorRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryContractsByCreatorRequest> =
      QueryOuterClass.QueryContractsByCreatorRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryContractsByCreatorRequest):
      QueryContractsByCreatorRequest = QueryContractsByCreatorRequest(
  	creatorAddress = obj.getCreatorAddress(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryContractsByCreatorRequest):
      QueryOuterClass.QueryContractsByCreatorRequest {
    val builder = QueryOuterClass.QueryContractsByCreatorRequest.newBuilder()
    builder.setCreatorAddress(obj.creatorAddress)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryContractsByCreatorResponseJvmConverter :
    ProtobufTypeMapper<QueryContractsByCreatorResponse, QueryOuterClass.QueryContractsByCreatorResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryContractsByCreatorResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryContractsByCreatorResponse> =
      QueryOuterClass.QueryContractsByCreatorResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryContractsByCreatorResponse):
      QueryContractsByCreatorResponse = QueryContractsByCreatorResponse(
  	contractAddresses = obj.getContractAddressesList().map { it },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryContractsByCreatorResponse):
      QueryOuterClass.QueryContractsByCreatorResponse {
    val builder = QueryOuterClass.QueryContractsByCreatorResponse.newBuilder()
    builder.addAllContractAddresses(obj.contractAddresses.map { it })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}
