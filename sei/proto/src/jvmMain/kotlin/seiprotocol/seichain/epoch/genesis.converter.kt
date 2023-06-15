// Transform from epoch/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.epoch

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter
