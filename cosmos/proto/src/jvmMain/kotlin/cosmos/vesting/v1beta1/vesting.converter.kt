// Transform from cosmos/vesting/v1beta1/vesting.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.vesting.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object BaseVestingAccountConverter : ProtobufConverter<BaseVestingAccount> by
    BaseVestingAccountJvmConverter

public actual object ContinuousVestingAccountConverter : ProtobufConverter<ContinuousVestingAccount>
    by ContinuousVestingAccountJvmConverter

public actual object DelayedVestingAccountConverter : ProtobufConverter<DelayedVestingAccount> by
    DelayedVestingAccountJvmConverter

public actual object PeriodConverter : ProtobufConverter<Period> by PeriodJvmConverter

public actual object PeriodicVestingAccountConverter : ProtobufConverter<PeriodicVestingAccount> by
    PeriodicVestingAccountJvmConverter

public actual object PermanentLockedAccountConverter : ProtobufConverter<PermanentLockedAccount> by
    PermanentLockedAccountJvmConverter
