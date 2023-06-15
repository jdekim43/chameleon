// Transform from tendermint/types/params.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ConsensusParamsConverter : ProtobufConverter<ConsensusParams> by
    ConsensusParamsJvmConverter

public actual object BlockParamsConverter : ProtobufConverter<BlockParams> by
    BlockParamsJvmConverter

public actual object EvidenceParamsConverter : ProtobufConverter<EvidenceParams> by
    EvidenceParamsJvmConverter

public actual object ValidatorParamsConverter : ProtobufConverter<ValidatorParams> by
    ValidatorParamsJvmConverter

public actual object VersionParamsConverter : ProtobufConverter<VersionParams> by
    VersionParamsJvmConverter

public actual object HashedParamsConverter : ProtobufConverter<HashedParams> by
    HashedParamsJvmConverter
