// Transform from dex/params.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, ParamsOuterClass.Params> {
  public override val descriptor: Descriptors.Descriptor = ParamsOuterClass.Params.getDescriptor()

  public override val parser: Parser<ParamsOuterClass.Params> = ParamsOuterClass.Params.parser()

  public override fun convert(obj: ParamsOuterClass.Params): Params = Params(
  	priceSnapshotRetention = obj.getPriceSnapshotRetention().asKotlinType,
  	sudoCallGasPrice = obj.getSudoCallGasPrice(),
  	beginBlockGasLimit = obj.getBeginBlockGasLimit().asKotlinType,
  	endBlockGasLimit = obj.getEndBlockGasLimit().asKotlinType,
  	defaultGasPerOrder = obj.getDefaultGasPerOrder().asKotlinType,
  	defaultGasPerCancel = obj.getDefaultGasPerCancel().asKotlinType,
  	minRentDeposit = obj.getMinRentDeposit().asKotlinType,
  	gasAllowancePerSettlement = obj.getGasAllowancePerSettlement().asKotlinType,
  	minProcessableRent = obj.getMinProcessableRent().asKotlinType,
  	orderBookEntriesPerLoad = obj.getOrderBookEntriesPerLoad().asKotlinType,
  	contractUnsuspendCost = obj.getContractUnsuspendCost().asKotlinType,
  	maxOrderPerPrice = obj.getMaxOrderPerPrice().asKotlinType,
  	maxPairsPerContract = obj.getMaxPairsPerContract().asKotlinType,
  )

  public override fun convert(obj: Params): ParamsOuterClass.Params {
    val builder = ParamsOuterClass.Params.newBuilder()
    builder.setPriceSnapshotRetention(obj.priceSnapshotRetention.asJavaType)
    builder.setSudoCallGasPrice(obj.sudoCallGasPrice)
    builder.setBeginBlockGasLimit(obj.beginBlockGasLimit.asJavaType)
    builder.setEndBlockGasLimit(obj.endBlockGasLimit.asJavaType)
    builder.setDefaultGasPerOrder(obj.defaultGasPerOrder.asJavaType)
    builder.setDefaultGasPerCancel(obj.defaultGasPerCancel.asJavaType)
    builder.setMinRentDeposit(obj.minRentDeposit.asJavaType)
    builder.setGasAllowancePerSettlement(obj.gasAllowancePerSettlement.asJavaType)
    builder.setMinProcessableRent(obj.minProcessableRent.asJavaType)
    builder.setOrderBookEntriesPerLoad(obj.orderBookEntriesPerLoad.asJavaType)
    builder.setContractUnsuspendCost(obj.contractUnsuspendCost.asJavaType)
    builder.setMaxOrderPerPrice(obj.maxOrderPerPrice.asJavaType)
    builder.setMaxPairsPerContract(obj.maxPairsPerContract.asJavaType)
    return builder.build()
  }
}
