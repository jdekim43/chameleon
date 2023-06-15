// Transform from dex/order.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object OrderConverter : ProtobufConverter<Order> by OrderJvmConverter

public actual object CancellationConverter : ProtobufConverter<Cancellation> by
    CancellationJvmConverter

public actual object ActiveOrdersConverter : ProtobufConverter<ActiveOrders> by
    ActiveOrdersJvmConverter
