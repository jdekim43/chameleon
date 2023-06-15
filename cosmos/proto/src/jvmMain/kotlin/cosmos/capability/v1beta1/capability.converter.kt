// Transform from cosmos/capability/v1beta1/capability.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.capability.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object CapabilityConverter : ProtobufConverter<Capability> by CapabilityJvmConverter

public actual object OwnerConverter : ProtobufConverter<Owner> by OwnerJvmConverter

public actual object CapabilityOwnersConverter : ProtobufConverter<CapabilityOwners> by
    CapabilityOwnersJvmConverter
