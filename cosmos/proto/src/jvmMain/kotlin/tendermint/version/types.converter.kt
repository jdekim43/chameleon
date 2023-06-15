// Transform from tendermint/version/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.version

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object AppConverter : ProtobufConverter<App> by AppJvmConverter

public actual object ConsensusConverter : ProtobufConverter<Consensus> by ConsensusJvmConverter
