// Transform from dex/tick_size.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object TickSizeConverter : ProtobufConverter<TickSize> by TickSizeJvmConverter
