// Transform from dex/order.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object OrderJvmConverter : ProtobufTypeMapper<Order, OrderOuterClass.Order> {
  public override val descriptor: Descriptors.Descriptor = OrderOuterClass.Order.getDescriptor()

  public override val parser: Parser<OrderOuterClass.Order> = OrderOuterClass.Order.parser()

  public override fun convert(obj: OrderOuterClass.Order): Order = Order(
  	id = obj.getId().asKotlinType,
  	status = OrderStatus.forNumber(obj.getStatus().number),
  	account = obj.getAccount(),
  	contractAddr = obj.getContractAddr(),
  	price = obj.getPrice(),
  	quantity = obj.getQuantity(),
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  	orderType = OrderType.forNumber(obj.getOrderType().number),
  	positionDirection = PositionDirection.forNumber(obj.getPositionDirection().number),
  	`data` = obj.getData(),
  	statusDescription = obj.getStatusDescription(),
  	nominal = obj.getNominal(),
  	triggerPrice = obj.getTriggerPrice(),
  	triggerStatus = obj.getTriggerStatus(),
  )

  public override fun convert(obj: Order): OrderOuterClass.Order {
    val builder = OrderOuterClass.Order.newBuilder()
    builder.setId(obj.id.asJavaType)
    builder.setStatus(Enums.OrderStatus.forNumber(obj.status.number))
    builder.setAccount(obj.account)
    builder.setContractAddr(obj.contractAddr)
    builder.setPrice(obj.price)
    builder.setQuantity(obj.quantity)
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    builder.setOrderType(Enums.OrderType.forNumber(obj.orderType.number))
    builder.setPositionDirection(Enums.PositionDirection.forNumber(obj.positionDirection.number))
    builder.setData(obj.`data`)
    builder.setStatusDescription(obj.statusDescription)
    builder.setNominal(obj.nominal)
    builder.setTriggerPrice(obj.triggerPrice)
    builder.setTriggerStatus(obj.triggerStatus)
    return builder.build()
  }
}

public object CancellationJvmConverter :
    ProtobufTypeMapper<Cancellation, OrderOuterClass.Cancellation> {
  public override val descriptor: Descriptors.Descriptor =
      OrderOuterClass.Cancellation.getDescriptor()

  public override val parser: Parser<OrderOuterClass.Cancellation> =
      OrderOuterClass.Cancellation.parser()

  public override fun convert(obj: OrderOuterClass.Cancellation): Cancellation = Cancellation(
  	id = obj.getId().asKotlinType,
  	initiator = CancellationInitiator.forNumber(obj.getInitiator().number),
  	creator = obj.getCreator(),
  	contractAddr = obj.getContractAddr(),
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  	positionDirection = PositionDirection.forNumber(obj.getPositionDirection().number),
  	price = obj.getPrice(),
  )

  public override fun convert(obj: Cancellation): OrderOuterClass.Cancellation {
    val builder = OrderOuterClass.Cancellation.newBuilder()
    builder.setId(obj.id.asJavaType)
    builder.setInitiator(Enums.CancellationInitiator.forNumber(obj.initiator.number))
    builder.setCreator(obj.creator)
    builder.setContractAddr(obj.contractAddr)
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    builder.setPositionDirection(Enums.PositionDirection.forNumber(obj.positionDirection.number))
    builder.setPrice(obj.price)
    return builder.build()
  }
}

public object ActiveOrdersJvmConverter :
    ProtobufTypeMapper<ActiveOrders, OrderOuterClass.ActiveOrders> {
  public override val descriptor: Descriptors.Descriptor =
      OrderOuterClass.ActiveOrders.getDescriptor()

  public override val parser: Parser<OrderOuterClass.ActiveOrders> =
      OrderOuterClass.ActiveOrders.parser()

  public override fun convert(obj: OrderOuterClass.ActiveOrders): ActiveOrders = ActiveOrders(
  	ids = obj.getIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: ActiveOrders): OrderOuterClass.ActiveOrders {
    val builder = OrderOuterClass.ActiveOrders.newBuilder()
    builder.addAllIds(obj.ids.map { it.asJavaType })
    return builder.build()
  }
}
