// Transform from cosmos/orm/v1/orm.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.orm.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object TableDescriptorConverter : ProtobufConverter<TableDescriptor> by
    TableDescriptorJvmConverter

public actual object PrimaryKeyDescriptorConverter : ProtobufConverter<PrimaryKeyDescriptor> by
    PrimaryKeyDescriptorJvmConverter

public actual object SecondaryIndexDescriptorConverter : ProtobufConverter<SecondaryIndexDescriptor>
    by SecondaryIndexDescriptorJvmConverter

public actual object SingletonDescriptorConverter : ProtobufConverter<SingletonDescriptor> by
    SingletonDescriptorJvmConverter
