// Transform from cosmwasm/wasm/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryContractInfoRequestConverter : ProtobufConverter<QueryContractInfoRequest>
    by QueryContractInfoRequestJvmConverter

public actual object QueryContractInfoResponseConverter :
    ProtobufConverter<QueryContractInfoResponse> by QueryContractInfoResponseJvmConverter

public actual object QueryContractHistoryRequestConverter :
    ProtobufConverter<QueryContractHistoryRequest> by QueryContractHistoryRequestJvmConverter

public actual object QueryContractHistoryResponseConverter :
    ProtobufConverter<QueryContractHistoryResponse> by QueryContractHistoryResponseJvmConverter

public actual object QueryContractsByCodeRequestConverter :
    ProtobufConverter<QueryContractsByCodeRequest> by QueryContractsByCodeRequestJvmConverter

public actual object QueryContractsByCodeResponseConverter :
    ProtobufConverter<QueryContractsByCodeResponse> by QueryContractsByCodeResponseJvmConverter

public actual object QueryAllContractStateRequestConverter :
    ProtobufConverter<QueryAllContractStateRequest> by QueryAllContractStateRequestJvmConverter

public actual object QueryAllContractStateResponseConverter :
    ProtobufConverter<QueryAllContractStateResponse> by QueryAllContractStateResponseJvmConverter

public actual object QueryRawContractStateRequestConverter :
    ProtobufConverter<QueryRawContractStateRequest> by QueryRawContractStateRequestJvmConverter

public actual object QueryRawContractStateResponseConverter :
    ProtobufConverter<QueryRawContractStateResponse> by QueryRawContractStateResponseJvmConverter

public actual object QuerySmartContractStateRequestConverter :
    ProtobufConverter<QuerySmartContractStateRequest> by QuerySmartContractStateRequestJvmConverter

public actual object QuerySmartContractStateResponseConverter :
    ProtobufConverter<QuerySmartContractStateResponse> by
    QuerySmartContractStateResponseJvmConverter

public actual object QueryCodeRequestConverter : ProtobufConverter<QueryCodeRequest> by
    QueryCodeRequestJvmConverter

public actual object CodeInfoResponseConverter : ProtobufConverter<CodeInfoResponse> by
    CodeInfoResponseJvmConverter

public actual object QueryCodeResponseConverter : ProtobufConverter<QueryCodeResponse> by
    QueryCodeResponseJvmConverter

public actual object QueryCodesRequestConverter : ProtobufConverter<QueryCodesRequest> by
    QueryCodesRequestJvmConverter

public actual object QueryCodesResponseConverter : ProtobufConverter<QueryCodesResponse> by
    QueryCodesResponseJvmConverter

public actual object QueryPinnedCodesRequestConverter : ProtobufConverter<QueryPinnedCodesRequest>
    by QueryPinnedCodesRequestJvmConverter

public actual object QueryPinnedCodesResponseConverter : ProtobufConverter<QueryPinnedCodesResponse>
    by QueryPinnedCodesResponseJvmConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryContractsByCreatorRequestConverter :
    ProtobufConverter<QueryContractsByCreatorRequest> by QueryContractsByCreatorRequestJvmConverter

public actual object QueryContractsByCreatorResponseConverter :
    ProtobufConverter<QueryContractsByCreatorResponse> by
    QueryContractsByCreatorResponseJvmConverter
