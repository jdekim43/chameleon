// Transform from terra/treasury/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	taxRate = obj.getTaxRate(),
  	rewardWeight = obj.getRewardWeight(),
  	taxCaps = obj.getTaxCapsList().map { TaxCapJvmConverter.convert(it) },
  	taxProceeds = obj.getTaxProceedsList().map { CoinJvmConverter.convert(it) },
  	epochInitialIssuance = obj.getEpochInitialIssuanceList().map { CoinJvmConverter.convert(it) },
  	epochStates = obj.getEpochStatesList().map { EpochStateJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.setTaxRate(obj.taxRate)
    builder.setRewardWeight(obj.rewardWeight)
    builder.addAllTaxCaps(obj.taxCaps.map { TaxCapJvmConverter.convert(it) })
    builder.addAllTaxProceeds(obj.taxProceeds.map { CoinJvmConverter.convert(it) })
    builder.addAllEpochInitialIssuance(obj.epochInitialIssuance.map { CoinJvmConverter.convert(it)
        })
    builder.addAllEpochStates(obj.epochStates.map { EpochStateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object TaxCapJvmConverter : ProtobufTypeMapper<TaxCap, Genesis.TaxCap> {
  public override val descriptor: Descriptors.Descriptor = Genesis.TaxCap.getDescriptor()

  public override val parser: Parser<Genesis.TaxCap> = Genesis.TaxCap.parser()

  public override fun convert(obj: Genesis.TaxCap): TaxCap = TaxCap(
  	denom = obj.getDenom(),
  	taxCap = obj.getTaxCap(),
  )

  public override fun convert(obj: TaxCap): Genesis.TaxCap {
    val builder = Genesis.TaxCap.newBuilder()
    builder.setDenom(obj.denom)
    builder.setTaxCap(obj.taxCap)
    return builder.build()
  }
}

public object EpochStateJvmConverter : ProtobufTypeMapper<EpochState, Genesis.EpochState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.EpochState.getDescriptor()

  public override val parser: Parser<Genesis.EpochState> = Genesis.EpochState.parser()

  public override fun convert(obj: Genesis.EpochState): EpochState = EpochState(
  	epoch = obj.getEpoch().asKotlinType,
  	taxReward = obj.getTaxReward(),
  	seigniorageReward = obj.getSeigniorageReward(),
  	totalStakedLuna = obj.getTotalStakedLuna(),
  )

  public override fun convert(obj: EpochState): Genesis.EpochState {
    val builder = Genesis.EpochState.newBuilder()
    builder.setEpoch(obj.epoch.asJavaType)
    builder.setTaxReward(obj.taxReward)
    builder.setSeigniorageReward(obj.seigniorageReward)
    builder.setTotalStakedLuna(obj.totalStakedLuna)
    return builder.build()
  }
}
