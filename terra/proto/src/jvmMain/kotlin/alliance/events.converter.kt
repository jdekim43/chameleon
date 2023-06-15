// Transform from alliance/events.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object DelegateAllianceEventConverter : ProtobufConverter<DelegateAllianceEvent> by
    DelegateAllianceEventJvmConverter

public actual object UndelegateAllianceEventConverter : ProtobufConverter<UndelegateAllianceEvent>
    by UndelegateAllianceEventJvmConverter

public actual object RedelegateAllianceEventConverter : ProtobufConverter<RedelegateAllianceEvent>
    by RedelegateAllianceEventJvmConverter

public actual object ClaimAllianceRewardsEventConverter :
    ProtobufConverter<ClaimAllianceRewardsEvent> by ClaimAllianceRewardsEventJvmConverter
