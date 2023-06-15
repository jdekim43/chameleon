// Transform from alliance/events.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object DelegateAllianceEventConverter : ProtobufConverter<DelegateAllianceEvent>

public fun DelegateAllianceEvent.toAny(): Any = Any(DelegateAllianceEvent.TYPE_URL,
    with(DelegateAllianceEventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DelegateAllianceEvent>): DelegateAllianceEvent {
  if (typeUrl != DelegateAllianceEvent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object UndelegateAllianceEventConverter : ProtobufConverter<UndelegateAllianceEvent>

public fun UndelegateAllianceEvent.toAny(): Any = Any(UndelegateAllianceEvent.TYPE_URL,
    with(UndelegateAllianceEventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UndelegateAllianceEvent>):
    UndelegateAllianceEvent {
  if (typeUrl != UndelegateAllianceEvent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RedelegateAllianceEventConverter : ProtobufConverter<RedelegateAllianceEvent>

public fun RedelegateAllianceEvent.toAny(): Any = Any(RedelegateAllianceEvent.TYPE_URL,
    with(RedelegateAllianceEventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RedelegateAllianceEvent>):
    RedelegateAllianceEvent {
  if (typeUrl != RedelegateAllianceEvent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ClaimAllianceRewardsEventConverter :
    ProtobufConverter<ClaimAllianceRewardsEvent>

public fun ClaimAllianceRewardsEvent.toAny(): Any = Any(ClaimAllianceRewardsEvent.TYPE_URL,
    with(ClaimAllianceRewardsEventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ClaimAllianceRewardsEvent>):
    ClaimAllianceRewardsEvent {
  if (typeUrl != ClaimAllianceRewardsEvent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
