// Transform from cosmos/reflection/v1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.reflection.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object FileDescriptorsRequestConverter : ProtobufConverter<FileDescriptorsRequest>

public fun FileDescriptorsRequest.toAny(): Any = Any(FileDescriptorsRequest.TYPE_URL,
    with(FileDescriptorsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FileDescriptorsRequest>): FileDescriptorsRequest {
  if (typeUrl != FileDescriptorsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FileDescriptorsResponseConverter : ProtobufConverter<FileDescriptorsResponse>

public fun FileDescriptorsResponse.toAny(): Any = Any(FileDescriptorsResponse.TYPE_URL,
    with(FileDescriptorsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FileDescriptorsResponse>):
    FileDescriptorsResponse {
  if (typeUrl != FileDescriptorsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
