// Transform from cosmos/base/reflection/v1beta1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ListAllInterfacesRequestConverter : ProtobufConverter<ListAllInterfacesRequest>

public fun ListAllInterfacesRequest.toAny(): Any = Any(ListAllInterfacesRequest.TYPE_URL,
    with(ListAllInterfacesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ListAllInterfacesRequest>):
    ListAllInterfacesRequest {
  if (typeUrl != ListAllInterfacesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ListAllInterfacesResponseConverter :
    ProtobufConverter<ListAllInterfacesResponse>

public fun ListAllInterfacesResponse.toAny(): Any = Any(ListAllInterfacesResponse.TYPE_URL,
    with(ListAllInterfacesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ListAllInterfacesResponse>):
    ListAllInterfacesResponse {
  if (typeUrl != ListAllInterfacesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ListImplementationsRequestConverter :
    ProtobufConverter<ListImplementationsRequest>

public fun ListImplementationsRequest.toAny(): Any = Any(ListImplementationsRequest.TYPE_URL,
    with(ListImplementationsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ListImplementationsRequest>):
    ListImplementationsRequest {
  if (typeUrl != ListImplementationsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ListImplementationsResponseConverter :
    ProtobufConverter<ListImplementationsResponse>

public fun ListImplementationsResponse.toAny(): Any = Any(ListImplementationsResponse.TYPE_URL,
    with(ListImplementationsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ListImplementationsResponse>):
    ListImplementationsResponse {
  if (typeUrl != ListImplementationsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
