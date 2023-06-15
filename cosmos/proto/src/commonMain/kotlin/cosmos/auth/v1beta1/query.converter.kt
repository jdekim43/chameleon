// Transform from cosmos/auth/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryAccountsRequestConverter : ProtobufConverter<QueryAccountsRequest>

public fun QueryAccountsRequest.toAny(): Any = Any(QueryAccountsRequest.TYPE_URL,
    with(QueryAccountsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountsRequest>): QueryAccountsRequest {
  if (typeUrl != QueryAccountsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAccountsResponseConverter : ProtobufConverter<QueryAccountsResponse>

public fun QueryAccountsResponse.toAny(): Any = Any(QueryAccountsResponse.TYPE_URL,
    with(QueryAccountsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountsResponse>): QueryAccountsResponse {
  if (typeUrl != QueryAccountsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAccountRequestConverter : ProtobufConverter<QueryAccountRequest>

public fun QueryAccountRequest.toAny(): Any = Any(QueryAccountRequest.TYPE_URL,
    with(QueryAccountRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountRequest>): QueryAccountRequest {
  if (typeUrl != QueryAccountRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAccountResponseConverter : ProtobufConverter<QueryAccountResponse>

public fun QueryAccountResponse.toAny(): Any = Any(QueryAccountResponse.TYPE_URL,
    with(QueryAccountResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountResponse>): QueryAccountResponse {
  if (typeUrl != QueryAccountResponse.TYPE_URL) throw
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

public expect object QueryModuleAccountsRequestConverter :
    ProtobufConverter<QueryModuleAccountsRequest>

public fun QueryModuleAccountsRequest.toAny(): Any = Any(QueryModuleAccountsRequest.TYPE_URL,
    with(QueryModuleAccountsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleAccountsRequest>):
    QueryModuleAccountsRequest {
  if (typeUrl != QueryModuleAccountsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryModuleAccountsResponseConverter :
    ProtobufConverter<QueryModuleAccountsResponse>

public fun QueryModuleAccountsResponse.toAny(): Any = Any(QueryModuleAccountsResponse.TYPE_URL,
    with(QueryModuleAccountsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleAccountsResponse>):
    QueryModuleAccountsResponse {
  if (typeUrl != QueryModuleAccountsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryModuleAccountByNameRequestConverter :
    ProtobufConverter<QueryModuleAccountByNameRequest>

public fun QueryModuleAccountByNameRequest.toAny(): Any =
    Any(QueryModuleAccountByNameRequest.TYPE_URL, with(QueryModuleAccountByNameRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleAccountByNameRequest>):
    QueryModuleAccountByNameRequest {
  if (typeUrl != QueryModuleAccountByNameRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryModuleAccountByNameResponseConverter :
    ProtobufConverter<QueryModuleAccountByNameResponse>

public fun QueryModuleAccountByNameResponse.toAny(): Any =
    Any(QueryModuleAccountByNameResponse.TYPE_URL, with(QueryModuleAccountByNameResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleAccountByNameResponse>):
    QueryModuleAccountByNameResponse {
  if (typeUrl != QueryModuleAccountByNameResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object Bech32PrefixRequestConverter : ProtobufConverter<Bech32PrefixRequest>

public fun Bech32PrefixRequest.toAny(): Any = Any(Bech32PrefixRequest.TYPE_URL,
    with(Bech32PrefixRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Bech32PrefixRequest>): Bech32PrefixRequest {
  if (typeUrl != Bech32PrefixRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object Bech32PrefixResponseConverter : ProtobufConverter<Bech32PrefixResponse>

public fun Bech32PrefixResponse.toAny(): Any = Any(Bech32PrefixResponse.TYPE_URL,
    with(Bech32PrefixResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Bech32PrefixResponse>): Bech32PrefixResponse {
  if (typeUrl != Bech32PrefixResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AddressBytesToStringRequestConverter :
    ProtobufConverter<AddressBytesToStringRequest>

public fun AddressBytesToStringRequest.toAny(): Any = Any(AddressBytesToStringRequest.TYPE_URL,
    with(AddressBytesToStringRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AddressBytesToStringRequest>):
    AddressBytesToStringRequest {
  if (typeUrl != AddressBytesToStringRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AddressBytesToStringResponseConverter :
    ProtobufConverter<AddressBytesToStringResponse>

public fun AddressBytesToStringResponse.toAny(): Any = Any(AddressBytesToStringResponse.TYPE_URL,
    with(AddressBytesToStringResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AddressBytesToStringResponse>):
    AddressBytesToStringResponse {
  if (typeUrl != AddressBytesToStringResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AddressStringToBytesRequestConverter :
    ProtobufConverter<AddressStringToBytesRequest>

public fun AddressStringToBytesRequest.toAny(): Any = Any(AddressStringToBytesRequest.TYPE_URL,
    with(AddressStringToBytesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AddressStringToBytesRequest>):
    AddressStringToBytesRequest {
  if (typeUrl != AddressStringToBytesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AddressStringToBytesResponseConverter :
    ProtobufConverter<AddressStringToBytesResponse>

public fun AddressStringToBytesResponse.toAny(): Any = Any(AddressStringToBytesResponse.TYPE_URL,
    with(AddressStringToBytesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AddressStringToBytesResponse>):
    AddressStringToBytesResponse {
  if (typeUrl != AddressStringToBytesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAccountAddressByIDRequestConverter :
    ProtobufConverter<QueryAccountAddressByIDRequest>

public fun QueryAccountAddressByIDRequest.toAny(): Any =
    Any(QueryAccountAddressByIDRequest.TYPE_URL, with(QueryAccountAddressByIDRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountAddressByIDRequest>):
    QueryAccountAddressByIDRequest {
  if (typeUrl != QueryAccountAddressByIDRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAccountAddressByIDResponseConverter :
    ProtobufConverter<QueryAccountAddressByIDResponse>

public fun QueryAccountAddressByIDResponse.toAny(): Any =
    Any(QueryAccountAddressByIDResponse.TYPE_URL, with(QueryAccountAddressByIDResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountAddressByIDResponse>):
    QueryAccountAddressByIDResponse {
  if (typeUrl != QueryAccountAddressByIDResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAccountInfoRequestConverter : ProtobufConverter<QueryAccountInfoRequest>

public fun QueryAccountInfoRequest.toAny(): Any = Any(QueryAccountInfoRequest.TYPE_URL,
    with(QueryAccountInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountInfoRequest>):
    QueryAccountInfoRequest {
  if (typeUrl != QueryAccountInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAccountInfoResponseConverter : ProtobufConverter<QueryAccountInfoResponse>

public fun QueryAccountInfoResponse.toAny(): Any = Any(QueryAccountInfoResponse.TYPE_URL,
    with(QueryAccountInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountInfoResponse>):
    QueryAccountInfoResponse {
  if (typeUrl != QueryAccountInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
