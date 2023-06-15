// Transform from dex/order_entry.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object OrderEntryConverter : ProtobufConverter<OrderEntry> by OrderEntryJvmConverter

public actual object AllocationConverter : ProtobufConverter<Allocation> by AllocationJvmConverter
