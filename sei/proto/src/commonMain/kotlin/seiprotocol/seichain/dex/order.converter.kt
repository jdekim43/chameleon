// Transform from dex/order.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object OrderConverter : ProtobufConverter<Order>

public fun Order.toAny(): Any = Any(Order.TYPE_URL, with(OrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Order>): Order {
  if (typeUrl != Order.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CancellationConverter : ProtobufConverter<Cancellation>

public fun Cancellation.toAny(): Any = Any(Cancellation.TYPE_URL, with(CancellationConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Cancellation>): Cancellation {
  if (typeUrl != Cancellation.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ActiveOrdersConverter : ProtobufConverter<ActiveOrders>

public fun ActiveOrders.toAny(): Any = Any(ActiveOrders.TYPE_URL, with(ActiveOrdersConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ActiveOrders>): ActiveOrders {
  if (typeUrl != ActiveOrders.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
