// Transform from cosmos/bank/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryBalanceRequestConverter : ProtobufConverter<QueryBalanceRequest>

public fun QueryBalanceRequest.toAny(): Any = Any(QueryBalanceRequest.TYPE_URL,
    with(QueryBalanceRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBalanceRequest>): QueryBalanceRequest {
  if (typeUrl != QueryBalanceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBalanceResponseConverter : ProtobufConverter<QueryBalanceResponse>

public fun QueryBalanceResponse.toAny(): Any = Any(QueryBalanceResponse.TYPE_URL,
    with(QueryBalanceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBalanceResponse>): QueryBalanceResponse {
  if (typeUrl != QueryBalanceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllBalancesRequestConverter : ProtobufConverter<QueryAllBalancesRequest>

public fun QueryAllBalancesRequest.toAny(): Any = Any(QueryAllBalancesRequest.TYPE_URL,
    with(QueryAllBalancesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllBalancesRequest>):
    QueryAllBalancesRequest {
  if (typeUrl != QueryAllBalancesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllBalancesResponseConverter : ProtobufConverter<QueryAllBalancesResponse>

public fun QueryAllBalancesResponse.toAny(): Any = Any(QueryAllBalancesResponse.TYPE_URL,
    with(QueryAllBalancesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllBalancesResponse>):
    QueryAllBalancesResponse {
  if (typeUrl != QueryAllBalancesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpendableBalancesRequestConverter :
    ProtobufConverter<QuerySpendableBalancesRequest>

public fun QuerySpendableBalancesRequest.toAny(): Any = Any(QuerySpendableBalancesRequest.TYPE_URL,
    with(QuerySpendableBalancesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpendableBalancesRequest>):
    QuerySpendableBalancesRequest {
  if (typeUrl != QuerySpendableBalancesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpendableBalancesResponseConverter :
    ProtobufConverter<QuerySpendableBalancesResponse>

public fun QuerySpendableBalancesResponse.toAny(): Any =
    Any(QuerySpendableBalancesResponse.TYPE_URL, with(QuerySpendableBalancesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpendableBalancesResponse>):
    QuerySpendableBalancesResponse {
  if (typeUrl != QuerySpendableBalancesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpendableBalanceByDenomRequestConverter :
    ProtobufConverter<QuerySpendableBalanceByDenomRequest>

public fun QuerySpendableBalanceByDenomRequest.toAny(): Any =
    Any(QuerySpendableBalanceByDenomRequest.TYPE_URL,
    with(QuerySpendableBalanceByDenomRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpendableBalanceByDenomRequest>):
    QuerySpendableBalanceByDenomRequest {
  if (typeUrl != QuerySpendableBalanceByDenomRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpendableBalanceByDenomResponseConverter :
    ProtobufConverter<QuerySpendableBalanceByDenomResponse>

public fun QuerySpendableBalanceByDenomResponse.toAny(): Any =
    Any(QuerySpendableBalanceByDenomResponse.TYPE_URL,
    with(QuerySpendableBalanceByDenomResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpendableBalanceByDenomResponse>):
    QuerySpendableBalanceByDenomResponse {
  if (typeUrl != QuerySpendableBalanceByDenomResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTotalSupplyRequestConverter : ProtobufConverter<QueryTotalSupplyRequest>

public fun QueryTotalSupplyRequest.toAny(): Any = Any(QueryTotalSupplyRequest.TYPE_URL,
    with(QueryTotalSupplyRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTotalSupplyRequest>):
    QueryTotalSupplyRequest {
  if (typeUrl != QueryTotalSupplyRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTotalSupplyResponseConverter : ProtobufConverter<QueryTotalSupplyResponse>

public fun QueryTotalSupplyResponse.toAny(): Any = Any(QueryTotalSupplyResponse.TYPE_URL,
    with(QueryTotalSupplyResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTotalSupplyResponse>):
    QueryTotalSupplyResponse {
  if (typeUrl != QueryTotalSupplyResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySupplyOfRequestConverter : ProtobufConverter<QuerySupplyOfRequest>

public fun QuerySupplyOfRequest.toAny(): Any = Any(QuerySupplyOfRequest.TYPE_URL,
    with(QuerySupplyOfRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySupplyOfRequest>): QuerySupplyOfRequest {
  if (typeUrl != QuerySupplyOfRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySupplyOfResponseConverter : ProtobufConverter<QuerySupplyOfResponse>

public fun QuerySupplyOfResponse.toAny(): Any = Any(QuerySupplyOfResponse.TYPE_URL,
    with(QuerySupplyOfResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySupplyOfResponse>): QuerySupplyOfResponse {
  if (typeUrl != QuerySupplyOfResponse.TYPE_URL) throw
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

public expect object QueryDenomsMetadataRequestConverter :
    ProtobufConverter<QueryDenomsMetadataRequest>

public fun QueryDenomsMetadataRequest.toAny(): Any = Any(QueryDenomsMetadataRequest.TYPE_URL,
    with(QueryDenomsMetadataRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomsMetadataRequest>):
    QueryDenomsMetadataRequest {
  if (typeUrl != QueryDenomsMetadataRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomsMetadataResponseConverter :
    ProtobufConverter<QueryDenomsMetadataResponse>

public fun QueryDenomsMetadataResponse.toAny(): Any = Any(QueryDenomsMetadataResponse.TYPE_URL,
    with(QueryDenomsMetadataResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomsMetadataResponse>):
    QueryDenomsMetadataResponse {
  if (typeUrl != QueryDenomsMetadataResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomMetadataRequestConverter :
    ProtobufConverter<QueryDenomMetadataRequest>

public fun QueryDenomMetadataRequest.toAny(): Any = Any(QueryDenomMetadataRequest.TYPE_URL,
    with(QueryDenomMetadataRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomMetadataRequest>):
    QueryDenomMetadataRequest {
  if (typeUrl != QueryDenomMetadataRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomMetadataResponseConverter :
    ProtobufConverter<QueryDenomMetadataResponse>

public fun QueryDenomMetadataResponse.toAny(): Any = Any(QueryDenomMetadataResponse.TYPE_URL,
    with(QueryDenomMetadataResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomMetadataResponse>):
    QueryDenomMetadataResponse {
  if (typeUrl != QueryDenomMetadataResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomOwnersRequestConverter : ProtobufConverter<QueryDenomOwnersRequest>

public fun QueryDenomOwnersRequest.toAny(): Any = Any(QueryDenomOwnersRequest.TYPE_URL,
    with(QueryDenomOwnersRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomOwnersRequest>):
    QueryDenomOwnersRequest {
  if (typeUrl != QueryDenomOwnersRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DenomOwnerConverter : ProtobufConverter<DenomOwner>

public fun DenomOwner.toAny(): Any = Any(DenomOwner.TYPE_URL, with(DenomOwnerConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DenomOwner>): DenomOwner {
  if (typeUrl != DenomOwner.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomOwnersResponseConverter : ProtobufConverter<QueryDenomOwnersResponse>

public fun QueryDenomOwnersResponse.toAny(): Any = Any(QueryDenomOwnersResponse.TYPE_URL,
    with(QueryDenomOwnersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomOwnersResponse>):
    QueryDenomOwnersResponse {
  if (typeUrl != QueryDenomOwnersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySendEnabledRequestConverter : ProtobufConverter<QuerySendEnabledRequest>

public fun QuerySendEnabledRequest.toAny(): Any = Any(QuerySendEnabledRequest.TYPE_URL,
    with(QuerySendEnabledRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySendEnabledRequest>):
    QuerySendEnabledRequest {
  if (typeUrl != QuerySendEnabledRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySendEnabledResponseConverter : ProtobufConverter<QuerySendEnabledResponse>

public fun QuerySendEnabledResponse.toAny(): Any = Any(QuerySendEnabledResponse.TYPE_URL,
    with(QuerySendEnabledResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySendEnabledResponse>):
    QuerySendEnabledResponse {
  if (typeUrl != QuerySendEnabledResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
