// Transform from terra/treasury/v1beta1/treasury.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Treasury.Params> {
  public override val descriptor: Descriptors.Descriptor = Treasury.Params.getDescriptor()

  public override val parser: Parser<Treasury.Params> = Treasury.Params.parser()

  public override fun convert(obj: Treasury.Params): Params = Params(
  	taxPolicy = PolicyConstraintsJvmConverter.convert(obj.getTaxPolicy()),
  	rewardPolicy = PolicyConstraintsJvmConverter.convert(obj.getRewardPolicy()),
  	seigniorageBurdenTarget = obj.getSeigniorageBurdenTarget(),
  	miningIncrement = obj.getMiningIncrement(),
  	windowShort = obj.getWindowShort().asKotlinType,
  	windowLong = obj.getWindowLong().asKotlinType,
  	windowProbation = obj.getWindowProbation().asKotlinType,
  	burnTaxSplit = obj.getBurnTaxSplit(),
  	minInitialDepositRatio = obj.getMinInitialDepositRatio(),
  )

  public override fun convert(obj: Params): Treasury.Params {
    val builder = Treasury.Params.newBuilder()
    builder.setTaxPolicy(PolicyConstraintsJvmConverter.convert(obj.taxPolicy))
    builder.setRewardPolicy(PolicyConstraintsJvmConverter.convert(obj.rewardPolicy))
    builder.setSeigniorageBurdenTarget(obj.seigniorageBurdenTarget)
    builder.setMiningIncrement(obj.miningIncrement)
    builder.setWindowShort(obj.windowShort.asJavaType)
    builder.setWindowLong(obj.windowLong.asJavaType)
    builder.setWindowProbation(obj.windowProbation.asJavaType)
    builder.setBurnTaxSplit(obj.burnTaxSplit)
    builder.setMinInitialDepositRatio(obj.minInitialDepositRatio)
    return builder.build()
  }
}

public object PolicyConstraintsJvmConverter :
    ProtobufTypeMapper<PolicyConstraints, Treasury.PolicyConstraints> {
  public override val descriptor: Descriptors.Descriptor =
      Treasury.PolicyConstraints.getDescriptor()

  public override val parser: Parser<Treasury.PolicyConstraints> =
      Treasury.PolicyConstraints.parser()

  public override fun convert(obj: Treasury.PolicyConstraints): PolicyConstraints =
      PolicyConstraints(
  	rateMin = obj.getRateMin(),
  	rateMax = obj.getRateMax(),
  	cap = CoinJvmConverter.convert(obj.getCap()),
  	changeRateMax = obj.getChangeRateMax(),
  )

  public override fun convert(obj: PolicyConstraints): Treasury.PolicyConstraints {
    val builder = Treasury.PolicyConstraints.newBuilder()
    builder.setRateMin(obj.rateMin)
    builder.setRateMax(obj.rateMax)
    builder.setCap(CoinJvmConverter.convert(obj.cap))
    builder.setChangeRateMax(obj.changeRateMax)
    return builder.build()
  }
}

public object EpochTaxProceedsJvmConverter :
    ProtobufTypeMapper<EpochTaxProceeds, Treasury.EpochTaxProceeds> {
  public override val descriptor: Descriptors.Descriptor = Treasury.EpochTaxProceeds.getDescriptor()

  public override val parser: Parser<Treasury.EpochTaxProceeds> = Treasury.EpochTaxProceeds.parser()

  public override fun convert(obj: Treasury.EpochTaxProceeds): EpochTaxProceeds = EpochTaxProceeds(
  	taxProceeds = obj.getTaxProceedsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: EpochTaxProceeds): Treasury.EpochTaxProceeds {
    val builder = Treasury.EpochTaxProceeds.newBuilder()
    builder.addAllTaxProceeds(obj.taxProceeds.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EpochInitialIssuanceJvmConverter :
    ProtobufTypeMapper<EpochInitialIssuance, Treasury.EpochInitialIssuance> {
  public override val descriptor: Descriptors.Descriptor =
      Treasury.EpochInitialIssuance.getDescriptor()

  public override val parser: Parser<Treasury.EpochInitialIssuance> =
      Treasury.EpochInitialIssuance.parser()

  public override fun convert(obj: Treasury.EpochInitialIssuance): EpochInitialIssuance =
      EpochInitialIssuance(
  	issuance = obj.getIssuanceList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: EpochInitialIssuance): Treasury.EpochInitialIssuance {
    val builder = Treasury.EpochInitialIssuance.newBuilder()
    builder.addAllIssuance(obj.issuance.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}
