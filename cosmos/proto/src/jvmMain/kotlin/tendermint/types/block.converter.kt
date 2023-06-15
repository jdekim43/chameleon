// Transform from tendermint/types/block.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object BlockConverter : ProtobufConverter<Block> by BlockJvmConverter
