// Transform from cosmos/auth/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryAccountsRequestConverter : ProtobufConverter<QueryAccountsRequest> by
    QueryAccountsRequestJvmConverter

public actual object QueryAccountsResponseConverter : ProtobufConverter<QueryAccountsResponse> by
    QueryAccountsResponseJvmConverter

public actual object QueryAccountRequestConverter : ProtobufConverter<QueryAccountRequest> by
    QueryAccountRequestJvmConverter

public actual object QueryAccountResponseConverter : ProtobufConverter<QueryAccountResponse> by
    QueryAccountResponseJvmConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryModuleAccountsRequestConverter :
    ProtobufConverter<QueryModuleAccountsRequest> by QueryModuleAccountsRequestJvmConverter

public actual object QueryModuleAccountsResponseConverter :
    ProtobufConverter<QueryModuleAccountsResponse> by QueryModuleAccountsResponseJvmConverter

public actual object QueryModuleAccountByNameRequestConverter :
    ProtobufConverter<QueryModuleAccountByNameRequest> by
    QueryModuleAccountByNameRequestJvmConverter

public actual object QueryModuleAccountByNameResponseConverter :
    ProtobufConverter<QueryModuleAccountByNameResponse> by
    QueryModuleAccountByNameResponseJvmConverter

public actual object Bech32PrefixRequestConverter : ProtobufConverter<Bech32PrefixRequest> by
    Bech32PrefixRequestJvmConverter

public actual object Bech32PrefixResponseConverter : ProtobufConverter<Bech32PrefixResponse> by
    Bech32PrefixResponseJvmConverter

public actual object AddressBytesToStringRequestConverter :
    ProtobufConverter<AddressBytesToStringRequest> by AddressBytesToStringRequestJvmConverter

public actual object AddressBytesToStringResponseConverter :
    ProtobufConverter<AddressBytesToStringResponse> by AddressBytesToStringResponseJvmConverter

public actual object AddressStringToBytesRequestConverter :
    ProtobufConverter<AddressStringToBytesRequest> by AddressStringToBytesRequestJvmConverter

public actual object AddressStringToBytesResponseConverter :
    ProtobufConverter<AddressStringToBytesResponse> by AddressStringToBytesResponseJvmConverter

public actual object QueryAccountAddressByIDRequestConverter :
    ProtobufConverter<QueryAccountAddressByIDRequest> by QueryAccountAddressByIDRequestJvmConverter

public actual object QueryAccountAddressByIDResponseConverter :
    ProtobufConverter<QueryAccountAddressByIDResponse> by
    QueryAccountAddressByIDResponseJvmConverter

public actual object QueryAccountInfoRequestConverter : ProtobufConverter<QueryAccountInfoRequest>
    by QueryAccountInfoRequestJvmConverter

public actual object QueryAccountInfoResponseConverter : ProtobufConverter<QueryAccountInfoResponse>
    by QueryAccountInfoResponseJvmConverter
