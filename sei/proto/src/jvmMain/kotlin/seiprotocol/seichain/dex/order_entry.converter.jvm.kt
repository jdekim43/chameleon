// Transform from dex/order_entry.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object OrderEntryJvmConverter :
    ProtobufTypeMapper<OrderEntry, OrderEntryOuterClass.OrderEntry> {
  public override val descriptor: Descriptors.Descriptor =
      OrderEntryOuterClass.OrderEntry.getDescriptor()

  public override val parser: Parser<OrderEntryOuterClass.OrderEntry> =
      OrderEntryOuterClass.OrderEntry.parser()

  public override fun convert(obj: OrderEntryOuterClass.OrderEntry): OrderEntry = OrderEntry(
  	price = obj.getPrice(),
  	quantity = obj.getQuantity(),
  	allocations = obj.getAllocationsList().map { AllocationJvmConverter.convert(it) },
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  )

  public override fun convert(obj: OrderEntry): OrderEntryOuterClass.OrderEntry {
    val builder = OrderEntryOuterClass.OrderEntry.newBuilder()
    builder.setPrice(obj.price)
    builder.setQuantity(obj.quantity)
    builder.addAllAllocations(obj.allocations.map { AllocationJvmConverter.convert(it) })
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    return builder.build()
  }
}

public object AllocationJvmConverter :
    ProtobufTypeMapper<Allocation, OrderEntryOuterClass.Allocation> {
  public override val descriptor: Descriptors.Descriptor =
      OrderEntryOuterClass.Allocation.getDescriptor()

  public override val parser: Parser<OrderEntryOuterClass.Allocation> =
      OrderEntryOuterClass.Allocation.parser()

  public override fun convert(obj: OrderEntryOuterClass.Allocation): Allocation = Allocation(
  	orderId = obj.getOrderId().asKotlinType,
  	quantity = obj.getQuantity(),
  	account = obj.getAccount(),
  )

  public override fun convert(obj: Allocation): OrderEntryOuterClass.Allocation {
    val builder = OrderEntryOuterClass.Allocation.newBuilder()
    builder.setOrderId(obj.orderId.asJavaType)
    builder.setQuantity(obj.quantity)
    builder.setAccount(obj.account)
    return builder.build()
  }
}
