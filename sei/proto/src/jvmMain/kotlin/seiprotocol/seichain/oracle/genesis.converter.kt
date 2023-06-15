// Transform from oracle/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter

public actual object FeederDelegationConverter : ProtobufConverter<FeederDelegation> by
    FeederDelegationJvmConverter

public actual object PenaltyCounterConverter : ProtobufConverter<PenaltyCounter> by
    PenaltyCounterJvmConverter
