// Transform from dex/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

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
  	contractState = obj.getContractStateList().map { ContractStateJvmConverter.convert(it) },
  	lastEpoch = obj.getLastEpoch().asKotlinType,
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllContractState(obj.contractState.map { ContractStateJvmConverter.convert(it) })
    builder.setLastEpoch(obj.lastEpoch.asJavaType)
    return builder.build()
  }
}

public object ContractStateJvmConverter : ProtobufTypeMapper<ContractState, Genesis.ContractState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.ContractState.getDescriptor()

  public override val parser: Parser<Genesis.ContractState> = Genesis.ContractState.parser()

  public override fun convert(obj: Genesis.ContractState): ContractState = ContractState(
  	contractInfo = ContractInfoV2JvmConverter.convert(obj.getContractInfo()),
  	longBookList = obj.getLongBookListList().map { LongBookJvmConverter.convert(it) },
  	shortBookList = obj.getShortBookListList().map { ShortBookJvmConverter.convert(it) },
  	triggeredOrdersList = obj.getTriggeredOrdersListList().map { OrderJvmConverter.convert(it) },
  	pairList = obj.getPairListList().map { PairJvmConverter.convert(it) },
  	priceList = obj.getPriceListList().map { ContractPairPricesJvmConverter.convert(it) },
  )

  public override fun convert(obj: ContractState): Genesis.ContractState {
    val builder = Genesis.ContractState.newBuilder()
    builder.setContractInfo(ContractInfoV2JvmConverter.convert(obj.contractInfo))
    builder.addAllLongBookList(obj.longBookList.map { LongBookJvmConverter.convert(it) })
    builder.addAllShortBookList(obj.shortBookList.map { ShortBookJvmConverter.convert(it) })
    builder.addAllTriggeredOrdersList(obj.triggeredOrdersList.map { OrderJvmConverter.convert(it) })
    builder.addAllPairList(obj.pairList.map { PairJvmConverter.convert(it) })
    builder.addAllPriceList(obj.priceList.map { ContractPairPricesJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ContractPairPricesJvmConverter :
    ProtobufTypeMapper<ContractPairPrices, Genesis.ContractPairPrices> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ContractPairPrices.getDescriptor()

  public override val parser: Parser<Genesis.ContractPairPrices> =
      Genesis.ContractPairPrices.parser()

  public override fun convert(obj: Genesis.ContractPairPrices): ContractPairPrices =
      ContractPairPrices(
  	pricePair = PairJvmConverter.convert(obj.getPricePair()),
  	prices = obj.getPricesList().map { PriceJvmConverter.convert(it) },
  )

  public override fun convert(obj: ContractPairPrices): Genesis.ContractPairPrices {
    val builder = Genesis.ContractPairPrices.newBuilder()
    builder.setPricePair(PairJvmConverter.convert(obj.pricePair))
    builder.addAllPrices(obj.prices.map { PriceJvmConverter.convert(it) })
    return builder.build()
  }
}
