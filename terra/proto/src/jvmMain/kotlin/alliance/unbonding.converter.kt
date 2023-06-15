// Transform from alliance/unbonding.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object UnbondingDelegationConverter : ProtobufConverter<UnbondingDelegation> by
    UnbondingDelegationJvmConverter
