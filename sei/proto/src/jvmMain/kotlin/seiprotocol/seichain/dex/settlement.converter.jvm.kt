// Transform from dex/settlement.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object SettlementEntryJvmConverter :
    ProtobufTypeMapper<SettlementEntry, Settlement.SettlementEntry> {
  public override val descriptor: Descriptors.Descriptor =
      Settlement.SettlementEntry.getDescriptor()

  public override val parser: Parser<Settlement.SettlementEntry> =
      Settlement.SettlementEntry.parser()

  public override fun convert(obj: Settlement.SettlementEntry): SettlementEntry = SettlementEntry(
  	account = obj.getAccount(),
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  	quantity = obj.getQuantity(),
  	executionCostOrProceed = obj.getExecutionCostOrProceed(),
  	expectedCostOrProceed = obj.getExpectedCostOrProceed(),
  	positionDirection = obj.getPositionDirection(),
  	orderType = obj.getOrderType(),
  	orderId = obj.getOrderId().asKotlinType,
  	timestamp = obj.getTimestamp().asKotlinType,
  	height = obj.getHeight().asKotlinType,
  	settlementId = obj.getSettlementId().asKotlinType,
  )

  public override fun convert(obj: SettlementEntry): Settlement.SettlementEntry {
    val builder = Settlement.SettlementEntry.newBuilder()
    builder.setAccount(obj.account)
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    builder.setQuantity(obj.quantity)
    builder.setExecutionCostOrProceed(obj.executionCostOrProceed)
    builder.setExpectedCostOrProceed(obj.expectedCostOrProceed)
    builder.setPositionDirection(obj.positionDirection)
    builder.setOrderType(obj.orderType)
    builder.setOrderId(obj.orderId.asJavaType)
    builder.setTimestamp(obj.timestamp.asJavaType)
    builder.setHeight(obj.height.asJavaType)
    builder.setSettlementId(obj.settlementId.asJavaType)
    return builder.build()
  }
}

public object SettlementsJvmConverter : ProtobufTypeMapper<Settlements, Settlement.Settlements> {
  public override val descriptor: Descriptors.Descriptor = Settlement.Settlements.getDescriptor()

  public override val parser: Parser<Settlement.Settlements> = Settlement.Settlements.parser()

  public override fun convert(obj: Settlement.Settlements): Settlements = Settlements(
  	epoch = obj.getEpoch(),
  	entries = obj.getEntriesList().map { SettlementEntryJvmConverter.convert(it) },
  )

  public override fun convert(obj: Settlements): Settlement.Settlements {
    val builder = Settlement.Settlements.newBuilder()
    builder.setEpoch(obj.epoch)
    builder.addAllEntries(obj.entries.map { SettlementEntryJvmConverter.convert(it) })
    return builder.build()
  }
}
