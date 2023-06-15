// Transform from cosmos/nft/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter

public actual object EntryConverter : ProtobufConverter<Entry> by EntryJvmConverter
