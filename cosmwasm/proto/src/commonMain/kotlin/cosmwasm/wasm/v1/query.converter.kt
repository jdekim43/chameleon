// Transform from cosmwasm/wasm/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryContractInfoRequestConverter : ProtobufConverter<QueryContractInfoRequest>

public fun QueryContractInfoRequest.toAny(): Any = Any(QueryContractInfoRequest.TYPE_URL,
    with(QueryContractInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryContractInfoRequest>):
    QueryContractInfoRequest {
  if (typeUrl != QueryContractInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryContractInfoResponseConverter :
    ProtobufConverter<QueryContractInfoResponse>

public fun QueryContractInfoResponse.toAny(): Any = Any(QueryContractInfoResponse.TYPE_URL,
    with(QueryContractInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryContractInfoResponse>):
    QueryContractInfoResponse {
  if (typeUrl != QueryContractInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryContractHistoryRequestConverter :
    ProtobufConverter<QueryContractHistoryRequest>

public fun QueryContractHistoryRequest.toAny(): Any = Any(QueryContractHistoryRequest.TYPE_URL,
    with(QueryContractHistoryRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryContractHistoryRequest>):
    QueryContractHistoryRequest {
  if (typeUrl != QueryContractHistoryRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryContractHistoryResponseConverter :
    ProtobufConverter<QueryContractHistoryResponse>

public fun QueryContractHistoryResponse.toAny(): Any = Any(QueryContractHistoryResponse.TYPE_URL,
    with(QueryContractHistoryResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryContractHistoryResponse>):
    QueryContractHistoryResponse {
  if (typeUrl != QueryContractHistoryResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryContractsByCodeRequestConverter :
    ProtobufConverter<QueryContractsByCodeRequest>

public fun QueryContractsByCodeRequest.toAny(): Any = Any(QueryContractsByCodeRequest.TYPE_URL,
    with(QueryContractsByCodeRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryContractsByCodeRequest>):
    QueryContractsByCodeRequest {
  if (typeUrl != QueryContractsByCodeRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryContractsByCodeResponseConverter :
    ProtobufConverter<QueryContractsByCodeResponse>

public fun QueryContractsByCodeResponse.toAny(): Any = Any(QueryContractsByCodeResponse.TYPE_URL,
    with(QueryContractsByCodeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryContractsByCodeResponse>):
    QueryContractsByCodeResponse {
  if (typeUrl != QueryContractsByCodeResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllContractStateRequestConverter :
    ProtobufConverter<QueryAllContractStateRequest>

public fun QueryAllContractStateRequest.toAny(): Any = Any(QueryAllContractStateRequest.TYPE_URL,
    with(QueryAllContractStateRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllContractStateRequest>):
    QueryAllContractStateRequest {
  if (typeUrl != QueryAllContractStateRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllContractStateResponseConverter :
    ProtobufConverter<QueryAllContractStateResponse>

public fun QueryAllContractStateResponse.toAny(): Any = Any(QueryAllContractStateResponse.TYPE_URL,
    with(QueryAllContractStateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllContractStateResponse>):
    QueryAllContractStateResponse {
  if (typeUrl != QueryAllContractStateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryRawContractStateRequestConverter :
    ProtobufConverter<QueryRawContractStateRequest>

public fun QueryRawContractStateRequest.toAny(): Any = Any(QueryRawContractStateRequest.TYPE_URL,
    with(QueryRawContractStateRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryRawContractStateRequest>):
    QueryRawContractStateRequest {
  if (typeUrl != QueryRawContractStateRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryRawContractStateResponseConverter :
    ProtobufConverter<QueryRawContractStateResponse>

public fun QueryRawContractStateResponse.toAny(): Any = Any(QueryRawContractStateResponse.TYPE_URL,
    with(QueryRawContractStateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryRawContractStateResponse>):
    QueryRawContractStateResponse {
  if (typeUrl != QueryRawContractStateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySmartContractStateRequestConverter :
    ProtobufConverter<QuerySmartContractStateRequest>

public fun QuerySmartContractStateRequest.toAny(): Any =
    Any(QuerySmartContractStateRequest.TYPE_URL, with(QuerySmartContractStateRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySmartContractStateRequest>):
    QuerySmartContractStateRequest {
  if (typeUrl != QuerySmartContractStateRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySmartContractStateResponseConverter :
    ProtobufConverter<QuerySmartContractStateResponse>

public fun QuerySmartContractStateResponse.toAny(): Any =
    Any(QuerySmartContractStateResponse.TYPE_URL, with(QuerySmartContractStateResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySmartContractStateResponse>):
    QuerySmartContractStateResponse {
  if (typeUrl != QuerySmartContractStateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCodeRequestConverter : ProtobufConverter<QueryCodeRequest>

public fun QueryCodeRequest.toAny(): Any = Any(QueryCodeRequest.TYPE_URL,
    with(QueryCodeRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCodeRequest>): QueryCodeRequest {
  if (typeUrl != QueryCodeRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CodeInfoResponseConverter : ProtobufConverter<CodeInfoResponse>

public fun CodeInfoResponse.toAny(): Any = Any(CodeInfoResponse.TYPE_URL,
    with(CodeInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CodeInfoResponse>): CodeInfoResponse {
  if (typeUrl != CodeInfoResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCodeResponseConverter : ProtobufConverter<QueryCodeResponse>

public fun QueryCodeResponse.toAny(): Any = Any(QueryCodeResponse.TYPE_URL,
    with(QueryCodeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCodeResponse>): QueryCodeResponse {
  if (typeUrl != QueryCodeResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCodesRequestConverter : ProtobufConverter<QueryCodesRequest>

public fun QueryCodesRequest.toAny(): Any = Any(QueryCodesRequest.TYPE_URL,
    with(QueryCodesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCodesRequest>): QueryCodesRequest {
  if (typeUrl != QueryCodesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCodesResponseConverter : ProtobufConverter<QueryCodesResponse>

public fun QueryCodesResponse.toAny(): Any = Any(QueryCodesResponse.TYPE_URL,
    with(QueryCodesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCodesResponse>): QueryCodesResponse {
  if (typeUrl != QueryCodesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPinnedCodesRequestConverter : ProtobufConverter<QueryPinnedCodesRequest>

public fun QueryPinnedCodesRequest.toAny(): Any = Any(QueryPinnedCodesRequest.TYPE_URL,
    with(QueryPinnedCodesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPinnedCodesRequest>):
    QueryPinnedCodesRequest {
  if (typeUrl != QueryPinnedCodesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPinnedCodesResponseConverter : ProtobufConverter<QueryPinnedCodesResponse>

public fun QueryPinnedCodesResponse.toAny(): Any = Any(QueryPinnedCodesResponse.TYPE_URL,
    with(QueryPinnedCodesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPinnedCodesResponse>):
    QueryPinnedCodesResponse {
  if (typeUrl != QueryPinnedCodesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public fun QueryParamsRequest.toAny(): Any = Any(QueryParamsRequest.TYPE_URL,
    with(QueryParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsRequest>): QueryParamsRequest {
  if (typeUrl != QueryParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public fun QueryParamsResponse.toAny(): Any = Any(QueryParamsResponse.TYPE_URL,
    with(QueryParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsResponse>): QueryParamsResponse {
  if (typeUrl != QueryParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryContractsByCreatorRequestConverter :
    ProtobufConverter<QueryContractsByCreatorRequest>

public fun QueryContractsByCreatorRequest.toAny(): Any =
    Any(QueryContractsByCreatorRequest.TYPE_URL, with(QueryContractsByCreatorRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryContractsByCreatorRequest>):
    QueryContractsByCreatorRequest {
  if (typeUrl != QueryContractsByCreatorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryContractsByCreatorResponseConverter :
    ProtobufConverter<QueryContractsByCreatorResponse>

public fun QueryContractsByCreatorResponse.toAny(): Any =
    Any(QueryContractsByCreatorResponse.TYPE_URL, with(QueryContractsByCreatorResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryContractsByCreatorResponse>):
    QueryContractsByCreatorResponse {
  if (typeUrl != QueryContractsByCreatorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
