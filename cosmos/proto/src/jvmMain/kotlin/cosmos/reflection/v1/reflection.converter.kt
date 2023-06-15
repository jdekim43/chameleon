// Transform from cosmos/reflection/v1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.reflection.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object FileDescriptorsRequestConverter : ProtobufConverter<FileDescriptorsRequest> by
    FileDescriptorsRequestJvmConverter

public actual object FileDescriptorsResponseConverter : ProtobufConverter<FileDescriptorsResponse>
    by FileDescriptorsResponseJvmConverter
