// Transform from terra/vesting/v1beta1/vesting.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.vesting.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object LazyGradedVestingAccountConverter : ProtobufConverter<LazyGradedVestingAccount>
    by LazyGradedVestingAccountJvmConverter

public actual object ScheduleConverter : ProtobufConverter<Schedule> by ScheduleJvmConverter

public actual object VestingScheduleConverter : ProtobufConverter<VestingSchedule> by
    VestingScheduleJvmConverter
