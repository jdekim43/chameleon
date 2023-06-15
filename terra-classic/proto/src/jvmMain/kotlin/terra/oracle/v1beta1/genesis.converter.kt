// Transform from terra/oracle/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter

public actual object FeederDelegationConverter : ProtobufConverter<FeederDelegation> by
    FeederDelegationJvmConverter

public actual object MissCounterConverter : ProtobufConverter<MissCounter> by
    MissCounterJvmConverter

public actual object TobinTaxConverter : ProtobufConverter<TobinTax> by TobinTaxJvmConverter
