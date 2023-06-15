// Transform from alliance/redelegations.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueuedRedelegationConverter : ProtobufConverter<QueuedRedelegation> by
    QueuedRedelegationJvmConverter

public actual object RedelegationConverter : ProtobufConverter<Redelegation> by
    RedelegationJvmConverter

public actual object RedelegationEntryConverter : ProtobufConverter<RedelegationEntry> by
    RedelegationEntryJvmConverter
