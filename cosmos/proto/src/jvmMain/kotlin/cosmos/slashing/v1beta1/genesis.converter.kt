// Transform from cosmos/slashing/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter

public actual object SigningInfoConverter : ProtobufConverter<SigningInfo> by
    SigningInfoJvmConverter

public actual object ValidatorMissedBlocksConverter : ProtobufConverter<ValidatorMissedBlocks> by
    ValidatorMissedBlocksJvmConverter

public actual object MissedBlockConverter : ProtobufConverter<MissedBlock> by
    MissedBlockJvmConverter
