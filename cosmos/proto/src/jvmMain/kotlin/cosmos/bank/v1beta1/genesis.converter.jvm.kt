// Transform from cosmos/bank/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	balances = obj.getBalancesList().map { BalanceJvmConverter.convert(it) },
  	supply = obj.getSupplyList().map { CoinJvmConverter.convert(it) },
  	denomMetadata = obj.getDenomMetadataList().map { MetadataJvmConverter.convert(it) },
  	sendEnabled = obj.getSendEnabledList().map { SendEnabledJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllBalances(obj.balances.map { BalanceJvmConverter.convert(it) })
    builder.addAllSupply(obj.supply.map { CoinJvmConverter.convert(it) })
    builder.addAllDenomMetadata(obj.denomMetadata.map { MetadataJvmConverter.convert(it) })
    builder.addAllSendEnabled(obj.sendEnabled.map { SendEnabledJvmConverter.convert(it) })
    return builder.build()
  }
}

public object BalanceJvmConverter : ProtobufTypeMapper<Balance, Genesis.Balance> {
  public override val descriptor: Descriptors.Descriptor = Genesis.Balance.getDescriptor()

  public override val parser: Parser<Genesis.Balance> = Genesis.Balance.parser()

  public override fun convert(obj: Genesis.Balance): Balance = Balance(
  	address = obj.getAddress(),
  	coins = obj.getCoinsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: Balance): Genesis.Balance {
    val builder = Genesis.Balance.newBuilder()
    builder.setAddress(obj.address)
    builder.addAllCoins(obj.coins.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}
