// Transform from oracle/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	feederDelegations = obj.getFeederDelegationsList().map { FeederDelegationJvmConverter.convert(it)
      },
  	exchangeRates = obj.getExchangeRatesList().map { ExchangeRateTupleJvmConverter.convert(it) },
  	penaltyCounters = obj.getPenaltyCountersList().map { PenaltyCounterJvmConverter.convert(it) },
  	aggregateExchangeRateVotes = obj.getAggregateExchangeRateVotesList().map {
      AggregateExchangeRateVoteJvmConverter.convert(it) },
  	priceSnapshots = obj.getPriceSnapshotsList().map { PriceSnapshotJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllFeederDelegations(obj.feederDelegations.map {
        FeederDelegationJvmConverter.convert(it) })
    builder.addAllExchangeRates(obj.exchangeRates.map { ExchangeRateTupleJvmConverter.convert(it) })
    builder.addAllPenaltyCounters(obj.penaltyCounters.map { PenaltyCounterJvmConverter.convert(it)
        })
    builder.addAllAggregateExchangeRateVotes(obj.aggregateExchangeRateVotes.map {
        AggregateExchangeRateVoteJvmConverter.convert(it) })
    builder.addAllPriceSnapshots(obj.priceSnapshots.map { PriceSnapshotJvmConverter.convert(it) })
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

public object PenaltyCounterJvmConverter :
    ProtobufTypeMapper<PenaltyCounter, Genesis.PenaltyCounter> {
  public override val descriptor: Descriptors.Descriptor = Genesis.PenaltyCounter.getDescriptor()

  public override val parser: Parser<Genesis.PenaltyCounter> = Genesis.PenaltyCounter.parser()

  public override fun convert(obj: Genesis.PenaltyCounter): PenaltyCounter = PenaltyCounter(
  	validatorAddress = obj.getValidatorAddress(),
  	votePenaltyCounter = VotePenaltyCounterJvmConverter.convert(obj.getVotePenaltyCounter()),
  )

  public override fun convert(obj: PenaltyCounter): Genesis.PenaltyCounter {
    val builder = Genesis.PenaltyCounter.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setVotePenaltyCounter(VotePenaltyCounterJvmConverter.convert(obj.votePenaltyCounter))
    return builder.build()
  }
}
