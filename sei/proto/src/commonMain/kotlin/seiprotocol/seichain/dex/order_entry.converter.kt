// Transform from dex/order_entry.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object OrderEntryConverter : ProtobufConverter<OrderEntry>

public fun OrderEntry.toAny(): Any = Any(OrderEntry.TYPE_URL, with(OrderEntryConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OrderEntry>): OrderEntry {
  if (typeUrl != OrderEntry.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AllocationConverter : ProtobufConverter<Allocation>

public fun Allocation.toAny(): Any = Any(Allocation.TYPE_URL, with(AllocationConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Allocation>): Allocation {
  if (typeUrl != Allocation.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
