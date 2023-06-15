// Transform from terra/oracle/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	feederDelegations = obj.getFeederDelegationsList().map { FeederDelegationJvmConverter.convert(it)
      },
  	exchangeRates = obj.getExchangeRatesList().map { ExchangeRateTupleJvmConverter.convert(it) },
  	missCounters = obj.getMissCountersList().map { MissCounterJvmConverter.convert(it) },
  	aggregateExchangeRatePrevotes = obj.getAggregateExchangeRatePrevotesList().map {
      AggregateExchangeRatePrevoteJvmConverter.convert(it) },
  	aggregateExchangeRateVotes = obj.getAggregateExchangeRateVotesList().map {
      AggregateExchangeRateVoteJvmConverter.convert(it) },
  	tobinTaxes = obj.getTobinTaxesList().map { TobinTaxJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllFeederDelegations(obj.feederDelegations.map {
        FeederDelegationJvmConverter.convert(it) })
    builder.addAllExchangeRates(obj.exchangeRates.map { ExchangeRateTupleJvmConverter.convert(it) })
    builder.addAllMissCounters(obj.missCounters.map { MissCounterJvmConverter.convert(it) })
    builder.addAllAggregateExchangeRatePrevotes(obj.aggregateExchangeRatePrevotes.map {
        AggregateExchangeRatePrevoteJvmConverter.convert(it) })
    builder.addAllAggregateExchangeRateVotes(obj.aggregateExchangeRateVotes.map {
        AggregateExchangeRateVoteJvmConverter.convert(it) })
    builder.addAllTobinTaxes(obj.tobinTaxes.map { TobinTaxJvmConverter.convert(it) })
    return builder.build()
  }
}

public object FeederDelegationJvmConverter :
    ProtobufTypeMapper<FeederDelegation, Genesis.FeederDelegation> {
  public override val descriptor: Descriptors.Descriptor = Genesis.FeederDelegation.getDescriptor()

  public override val parser: Parser<Genesis.FeederDelegation> = Genesis.FeederDelegation.parser()

  public override fun convert(obj: Genesis.FeederDelegation): FeederDelegation = FeederDelegation(
  	feederAddress = obj.getFeederAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  )

  public override fun convert(obj: FeederDelegation): Genesis.FeederDelegation {
    val builder = Genesis.FeederDelegation.newBuilder()
    builder.setFeederAddress(obj.feederAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    return builder.build()
  }
}

public object MissCounterJvmConverter : ProtobufTypeMapper<MissCounter, Genesis.MissCounter> {
  public override val descriptor: Descriptors.Descriptor = Genesis.MissCounter.getDescriptor()

  public override val parser: Parser<Genesis.MissCounter> = Genesis.MissCounter.parser()

  public override fun convert(obj: Genesis.MissCounter): MissCounter = MissCounter(
  	validatorAddress = obj.getValidatorAddress(),
  	missCounter = obj.getMissCounter().asKotlinType,
  )

  public override fun convert(obj: MissCounter): Genesis.MissCounter {
    val builder = Genesis.MissCounter.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setMissCounter(obj.missCounter.asJavaType)
    return builder.build()
  }
}

public object TobinTaxJvmConverter : ProtobufTypeMapper<TobinTax, Genesis.TobinTax> {
  public override val descriptor: Descriptors.Descriptor = Genesis.TobinTax.getDescriptor()

  public override val parser: Parser<Genesis.TobinTax> = Genesis.TobinTax.parser()

  public override fun convert(obj: Genesis.TobinTax): TobinTax = TobinTax(
  	denom = obj.getDenom(),
  	tobinTax = obj.getTobinTax(),
  )

  public override fun convert(obj: TobinTax): Genesis.TobinTax {
    val builder = Genesis.TobinTax.newBuilder()
    builder.setDenom(obj.denom)
    builder.setTobinTax(obj.tobinTax)
    return builder.build()
  }
}
