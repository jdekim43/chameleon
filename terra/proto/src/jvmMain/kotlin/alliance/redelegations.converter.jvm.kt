// Transform from alliance/redelegations.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueuedRedelegationJvmConverter :
    ProtobufTypeMapper<QueuedRedelegation, Redelegations.QueuedRedelegation> {
  public override val descriptor: Descriptors.Descriptor =
      Redelegations.QueuedRedelegation.getDescriptor()

  public override val parser: Parser<Redelegations.QueuedRedelegation> =
      Redelegations.QueuedRedelegation.parser()

  public override fun convert(obj: Redelegations.QueuedRedelegation): QueuedRedelegation =
      QueuedRedelegation(
  	entries = obj.getEntriesList().map { RedelegationJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueuedRedelegation): Redelegations.QueuedRedelegation {
    val builder = Redelegations.QueuedRedelegation.newBuilder()
    builder.addAllEntries(obj.entries.map { RedelegationJvmConverter.convert(it) })
    return builder.build()
  }
}

public object RedelegationJvmConverter :
    ProtobufTypeMapper<Redelegation, Redelegations.Redelegation> {
  public override val descriptor: Descriptors.Descriptor =
      Redelegations.Redelegation.getDescriptor()

  public override val parser: Parser<Redelegations.Redelegation> =
      Redelegations.Redelegation.parser()

  public override fun convert(obj: Redelegations.Redelegation): Redelegation = Redelegation(
  	delegatorAddress = obj.getDelegatorAddress(),
  	srcValidatorAddress = obj.getSrcValidatorAddress(),
  	dstValidatorAddress = obj.getDstValidatorAddress(),
  	balance = CoinJvmConverter.convert(obj.getBalance()),
  )

  public override fun convert(obj: Redelegation): Redelegations.Redelegation {
    val builder = Redelegations.Redelegation.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setSrcValidatorAddress(obj.srcValidatorAddress)
    builder.setDstValidatorAddress(obj.dstValidatorAddress)
    builder.setBalance(CoinJvmConverter.convert(obj.balance))
    return builder.build()
  }
}

public object RedelegationEntryJvmConverter :
    ProtobufTypeMapper<RedelegationEntry, Redelegations.RedelegationEntry> {
  public override val descriptor: Descriptors.Descriptor =
      Redelegations.RedelegationEntry.getDescriptor()

  public override val parser: Parser<Redelegations.RedelegationEntry> =
      Redelegations.RedelegationEntry.parser()

  public override fun convert(obj: Redelegations.RedelegationEntry): RedelegationEntry =
      RedelegationEntry(
  	delegatorAddress = obj.getDelegatorAddress(),
  	srcValidatorAddress = obj.getSrcValidatorAddress(),
  	dstValidatorAddress = obj.getDstValidatorAddress(),
  	balance = CoinJvmConverter.convert(obj.getBalance()),
  	completionTime = TimestampJvmConverter.convert(obj.getCompletionTime()),
  )

  public override fun convert(obj: RedelegationEntry): Redelegations.RedelegationEntry {
    val builder = Redelegations.RedelegationEntry.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setSrcValidatorAddress(obj.srcValidatorAddress)
    builder.setDstValidatorAddress(obj.dstValidatorAddress)
    builder.setBalance(CoinJvmConverter.convert(obj.balance))
    builder.setCompletionTime(TimestampJvmConverter.convert(obj.completionTime))
    return builder.build()
  }
}
