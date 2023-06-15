// Transform from cosmos/evidence/v1beta1/evidence.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object EquivocationConverter : ProtobufConverter<Equivocation> by
    EquivocationJvmConverter
