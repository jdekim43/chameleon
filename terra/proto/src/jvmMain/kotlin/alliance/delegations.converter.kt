// Transform from alliance/delegations.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object DelegationConverter : ProtobufConverter<Delegation> by DelegationJvmConverter

public actual object UndelegationConverter : ProtobufConverter<Undelegation> by
    UndelegationJvmConverter

public actual object QueuedUndelegationConverter : ProtobufConverter<QueuedUndelegation> by
    QueuedUndelegationJvmConverter

public actual object AllianceValidatorInfoConverter : ProtobufConverter<AllianceValidatorInfo> by
    AllianceValidatorInfoJvmConverter
