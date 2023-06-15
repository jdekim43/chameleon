// Transform from dex/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter

public actual object ContractStateConverter : ProtobufConverter<ContractState> by
    ContractStateJvmConverter

public actual object ContractPairPricesConverter : ProtobufConverter<ContractPairPrices> by
    ContractPairPricesJvmConverter
