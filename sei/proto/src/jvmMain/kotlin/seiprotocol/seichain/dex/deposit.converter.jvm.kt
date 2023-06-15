// Transform from dex/deposit.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object DepositInfoEntryJvmConverter :
    ProtobufTypeMapper<DepositInfoEntry, Deposit.DepositInfoEntry> {
  public override val descriptor: Descriptors.Descriptor = Deposit.DepositInfoEntry.getDescriptor()

  public override val parser: Parser<Deposit.DepositInfoEntry> = Deposit.DepositInfoEntry.parser()

  public override fun convert(obj: Deposit.DepositInfoEntry): DepositInfoEntry = DepositInfoEntry(
  	creator = obj.getCreator(),
  	denom = obj.getDenom(),
  	amount = obj.getAmount(),
  )

  public override fun convert(obj: DepositInfoEntry): Deposit.DepositInfoEntry {
    val builder = Deposit.DepositInfoEntry.newBuilder()
    builder.setCreator(obj.creator)
    builder.setDenom(obj.denom)
    builder.setAmount(obj.amount)
    return builder.build()
  }
}
