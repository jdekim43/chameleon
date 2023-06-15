// Transform from cosmos_proto/cosmos.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos_proto

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object InterfaceDescriptorConverter : ProtobufConverter<InterfaceDescriptor> by
    InterfaceDescriptorJvmConverter

public actual object ScalarDescriptorConverter : ProtobufConverter<ScalarDescriptor> by
    ScalarDescriptorJvmConverter
