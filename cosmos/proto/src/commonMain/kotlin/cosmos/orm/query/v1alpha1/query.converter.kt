// Transform from cosmos/orm/query/v1alpha1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.orm.query.v1alpha1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object GetRequestConverter : ProtobufConverter<GetRequest>

public fun GetRequest.toAny(): Any = Any(GetRequest.TYPE_URL, with(GetRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetRequest>): GetRequest {
  if (typeUrl != GetRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetResponseConverter : ProtobufConverter<GetResponse>

public fun GetResponse.toAny(): Any = Any(GetResponse.TYPE_URL, with(GetResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetResponse>): GetResponse {
  if (typeUrl != GetResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ListRequestConverter : ProtobufConverter<ListRequest> {
  public object PrefixConverter : ProtobufConverter<ListRequest.Prefix>

  public object RangeConverter : ProtobufConverter<ListRequest.Range>
}

public fun ListRequest.toAny(): Any = Any(ListRequest.TYPE_URL, with(ListRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ListRequest>): ListRequest {
  if (typeUrl != ListRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ListResponseConverter : ProtobufConverter<ListResponse>

public fun ListResponse.toAny(): Any = Any(ListResponse.TYPE_URL, with(ListResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ListResponse>): ListResponse {
  if (typeUrl != ListResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object IndexValueConverter : ProtobufConverter<IndexValue>

public fun IndexValue.toAny(): Any = Any(IndexValue.TYPE_URL, with(IndexValueConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<IndexValue>): IndexValue {
  if (typeUrl != IndexValue.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
