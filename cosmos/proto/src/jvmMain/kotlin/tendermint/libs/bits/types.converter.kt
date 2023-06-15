// Transform from tendermint/libs/bits/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.libs.bits

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object BitArrayConverter : ProtobufConverter<BitArray> by BitArrayJvmConverter
