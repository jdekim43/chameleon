// Transform from cosmos/bank/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryBalanceRequestConverter : ProtobufConverter<QueryBalanceRequest> by
    QueryBalanceRequestJvmConverter

public actual object QueryBalanceResponseConverter : ProtobufConverter<QueryBalanceResponse> by
    QueryBalanceResponseJvmConverter

public actual object QueryAllBalancesRequestConverter : ProtobufConverter<QueryAllBalancesRequest>
    by QueryAllBalancesRequestJvmConverter

public actual object QueryAllBalancesResponseConverter : ProtobufConverter<QueryAllBalancesResponse>
    by QueryAllBalancesResponseJvmConverter

public actual object QuerySpendableBalancesRequestConverter :
    ProtobufConverter<QuerySpendableBalancesRequest> by QuerySpendableBalancesRequestJvmConverter

public actual object QuerySpendableBalancesResponseConverter :
    ProtobufConverter<QuerySpendableBalancesResponse> by QuerySpendableBalancesResponseJvmConverter

public actual object QuerySpendableBalanceByDenomRequestConverter :
    ProtobufConverter<QuerySpendableBalanceByDenomRequest> by
    QuerySpendableBalanceByDenomRequestJvmConverter

public actual object QuerySpendableBalanceByDenomResponseConverter :
    ProtobufConverter<QuerySpendableBalanceByDenomResponse> by
    QuerySpendableBalanceByDenomResponseJvmConverter

public actual object QueryTotalSupplyRequestConverter : ProtobufConverter<QueryTotalSupplyRequest>
    by QueryTotalSupplyRequestJvmConverter

public actual object QueryTotalSupplyResponseConverter : ProtobufConverter<QueryTotalSupplyResponse>
    by QueryTotalSupplyResponseJvmConverter

public actual object QuerySupplyOfRequestConverter : ProtobufConverter<QuerySupplyOfRequest> by
    QuerySupplyOfRequestJvmConverter

public actual object QuerySupplyOfResponseConverter : ProtobufConverter<QuerySupplyOfResponse> by
    QuerySupplyOfResponseJvmConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryDenomsMetadataRequestConverter :
    ProtobufConverter<QueryDenomsMetadataRequest> by QueryDenomsMetadataRequestJvmConverter

public actual object QueryDenomsMetadataResponseConverter :
    ProtobufConverter<QueryDenomsMetadataResponse> by QueryDenomsMetadataResponseJvmConverter

public actual object QueryDenomMetadataRequestConverter :
    ProtobufConverter<QueryDenomMetadataRequest> by QueryDenomMetadataRequestJvmConverter

public actual object QueryDenomMetadataResponseConverter :
    ProtobufConverter<QueryDenomMetadataResponse> by QueryDenomMetadataResponseJvmConverter

public actual object QueryDenomOwnersRequestConverter : ProtobufConverter<QueryDenomOwnersRequest>
    by QueryDenomOwnersRequestJvmConverter

public actual object DenomOwnerConverter : ProtobufConverter<DenomOwner> by DenomOwnerJvmConverter

public actual object QueryDenomOwnersResponseConverter : ProtobufConverter<QueryDenomOwnersResponse>
    by QueryDenomOwnersResponseJvmConverter

public actual object QuerySendEnabledRequestConverter : ProtobufConverter<QuerySendEnabledRequest>
    by QuerySendEnabledRequestJvmConverter

public actual object QuerySendEnabledResponseConverter : ProtobufConverter<QuerySendEnabledResponse>
    by QuerySendEnabledResponseJvmConverter
