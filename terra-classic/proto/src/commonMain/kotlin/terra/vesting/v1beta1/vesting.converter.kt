// Transform from terra/vesting/v1beta1/vesting.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.vesting.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object LazyGradedVestingAccountConverter : ProtobufConverter<LazyGradedVestingAccount>

public fun LazyGradedVestingAccount.toAny(): Any = Any(LazyGradedVestingAccount.TYPE_URL,
    with(LazyGradedVestingAccountConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<LazyGradedVestingAccount>):
    LazyGradedVestingAccount {
  if (typeUrl != LazyGradedVestingAccount.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ScheduleConverter : ProtobufConverter<Schedule>

public fun Schedule.toAny(): Any = Any(Schedule.TYPE_URL, with(ScheduleConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Schedule>): Schedule {
  if (typeUrl != Schedule.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VestingScheduleConverter : ProtobufConverter<VestingSchedule>

public fun VestingSchedule.toAny(): Any = Any(VestingSchedule.TYPE_URL,
    with(VestingScheduleConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<VestingSchedule>): VestingSchedule {
  if (typeUrl != VestingSchedule.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
