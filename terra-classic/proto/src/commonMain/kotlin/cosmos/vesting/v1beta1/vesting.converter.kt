// Transform from cosmos/vesting/v1beta1/vesting.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.vesting.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object BaseVestingAccountConverter : ProtobufConverter<BaseVestingAccount>

public fun BaseVestingAccount.toAny(): Any = Any(BaseVestingAccount.TYPE_URL,
    with(BaseVestingAccountConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BaseVestingAccount>): BaseVestingAccount {
  if (typeUrl != BaseVestingAccount.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ContinuousVestingAccountConverter : ProtobufConverter<ContinuousVestingAccount>

public fun ContinuousVestingAccount.toAny(): Any = Any(ContinuousVestingAccount.TYPE_URL,
    with(ContinuousVestingAccountConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContinuousVestingAccount>):
    ContinuousVestingAccount {
  if (typeUrl != ContinuousVestingAccount.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DelayedVestingAccountConverter : ProtobufConverter<DelayedVestingAccount>

public fun DelayedVestingAccount.toAny(): Any = Any(DelayedVestingAccount.TYPE_URL,
    with(DelayedVestingAccountConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DelayedVestingAccount>): DelayedVestingAccount {
  if (typeUrl != DelayedVestingAccount.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PeriodConverter : ProtobufConverter<Period>

public fun Period.toAny(): Any = Any(Period.TYPE_URL, with(PeriodConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Period>): Period {
  if (typeUrl != Period.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PeriodicVestingAccountConverter : ProtobufConverter<PeriodicVestingAccount>

public fun PeriodicVestingAccount.toAny(): Any = Any(PeriodicVestingAccount.TYPE_URL,
    with(PeriodicVestingAccountConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PeriodicVestingAccount>): PeriodicVestingAccount {
  if (typeUrl != PeriodicVestingAccount.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PermanentLockedAccountConverter : ProtobufConverter<PermanentLockedAccount>

public fun PermanentLockedAccount.toAny(): Any = Any(PermanentLockedAccount.TYPE_URL,
    with(PermanentLockedAccountConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PermanentLockedAccount>): PermanentLockedAccount {
  if (typeUrl != PermanentLockedAccount.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
