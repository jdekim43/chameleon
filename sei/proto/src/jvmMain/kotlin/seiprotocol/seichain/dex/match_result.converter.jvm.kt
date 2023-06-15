// Transform from dex/match_result.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MatchResultJvmConverter :
    ProtobufTypeMapper<MatchResult, MatchResultOuterClass.MatchResult> {
  public override val descriptor: Descriptors.Descriptor =
      MatchResultOuterClass.MatchResult.getDescriptor()

  public override val parser: Parser<MatchResultOuterClass.MatchResult> =
      MatchResultOuterClass.MatchResult.parser()

  public override fun convert(obj: MatchResultOuterClass.MatchResult): MatchResult = MatchResult(
  	height = obj.getHeight(),
  	contractAddr = obj.getContractAddr(),
  	orders = obj.getOrdersList().map { OrderJvmConverter.convert(it) },
  	settlements = obj.getSettlementsList().map { SettlementEntryJvmConverter.convert(it) },
  	cancellations = obj.getCancellationsList().map { CancellationJvmConverter.convert(it) },
  )

  public override fun convert(obj: MatchResult): MatchResultOuterClass.MatchResult {
    val builder = MatchResultOuterClass.MatchResult.newBuilder()
    builder.setHeight(obj.height)
    builder.setContractAddr(obj.contractAddr)
    builder.addAllOrders(obj.orders.map { OrderJvmConverter.convert(it) })
    builder.addAllSettlements(obj.settlements.map { SettlementEntryJvmConverter.convert(it) })
    builder.addAllCancellations(obj.cancellations.map { CancellationJvmConverter.convert(it) })
    return builder.build()
  }
}
