// Transform from cosmos/nft/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

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

public expect object QueryOwnerRequestConverter : ProtobufConverter<QueryOwnerRequest>

public fun QueryOwnerRequest.toAny(): Any = Any(QueryOwnerRequest.TYPE_URL,
    with(QueryOwnerRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOwnerRequest>): QueryOwnerRequest {
  if (typeUrl != QueryOwnerRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOwnerResponseConverter : ProtobufConverter<QueryOwnerResponse>

public fun QueryOwnerResponse.toAny(): Any = Any(QueryOwnerResponse.TYPE_URL,
    with(QueryOwnerResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOwnerResponse>): QueryOwnerResponse {
  if (typeUrl != QueryOwnerResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySupplyRequestConverter : ProtobufConverter<QuerySupplyRequest>

public fun QuerySupplyRequest.toAny(): Any = Any(QuerySupplyRequest.TYPE_URL,
    with(QuerySupplyRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySupplyRequest>): QuerySupplyRequest {
  if (typeUrl != QuerySupplyRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySupplyResponseConverter : ProtobufConverter<QuerySupplyResponse>

public fun QuerySupplyResponse.toAny(): Any = Any(QuerySupplyResponse.TYPE_URL,
    with(QuerySupplyResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySupplyResponse>): QuerySupplyResponse {
  if (typeUrl != QuerySupplyResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryNFTsRequestConverter : ProtobufConverter<QueryNFTsRequest>

public fun QueryNFTsRequest.toAny(): Any = Any(QueryNFTsRequest.TYPE_URL,
    with(QueryNFTsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryNFTsRequest>): QueryNFTsRequest {
  if (typeUrl != QueryNFTsRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryNFTsResponseConverter : ProtobufConverter<QueryNFTsResponse>

public fun QueryNFTsResponse.toAny(): Any = Any(QueryNFTsResponse.TYPE_URL,
    with(QueryNFTsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryNFTsResponse>): QueryNFTsResponse {
  if (typeUrl != QueryNFTsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryNFTRequestConverter : ProtobufConverter<QueryNFTRequest>

public fun QueryNFTRequest.toAny(): Any = Any(QueryNFTRequest.TYPE_URL,
    with(QueryNFTRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryNFTRequest>): QueryNFTRequest {
  if (typeUrl != QueryNFTRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryNFTResponseConverter : ProtobufConverter<QueryNFTResponse>

public fun QueryNFTResponse.toAny(): Any = Any(QueryNFTResponse.TYPE_URL,
    with(QueryNFTResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryNFTResponse>): QueryNFTResponse {
  if (typeUrl != QueryNFTResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryClassRequestConverter : ProtobufConverter<QueryClassRequest>

public fun QueryClassRequest.toAny(): Any = Any(QueryClassRequest.TYPE_URL,
    with(QueryClassRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryClassRequest>): QueryClassRequest {
  if (typeUrl != QueryClassRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryClassResponseConverter : ProtobufConverter<QueryClassResponse>

public fun QueryClassResponse.toAny(): Any = Any(QueryClassResponse.TYPE_URL,
    with(QueryClassResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryClassResponse>): QueryClassResponse {
  if (typeUrl != QueryClassResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryClassesRequestConverter : ProtobufConverter<QueryClassesRequest>

public fun QueryClassesRequest.toAny(): Any = Any(QueryClassesRequest.TYPE_URL,
    with(QueryClassesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryClassesRequest>): QueryClassesRequest {
  if (typeUrl != QueryClassesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryClassesResponseConverter : ProtobufConverter<QueryClassesResponse>

public fun QueryClassesResponse.toAny(): Any = Any(QueryClassesResponse.TYPE_URL,
    with(QueryClassesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryClassesResponse>): QueryClassesResponse {
  if (typeUrl != QueryClassesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
