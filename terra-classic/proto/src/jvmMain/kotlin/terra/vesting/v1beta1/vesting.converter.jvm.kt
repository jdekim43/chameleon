// Transform from terra/vesting/v1beta1/vesting.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.vesting.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.vesting.v1beta1.BaseVestingAccountJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object LazyGradedVestingAccountJvmConverter :
    ProtobufTypeMapper<LazyGradedVestingAccount, Vesting.LazyGradedVestingAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Vesting.LazyGradedVestingAccount.getDescriptor()

  public override val parser: Parser<Vesting.LazyGradedVestingAccount> =
      Vesting.LazyGradedVestingAccount.parser()

  public override fun convert(obj: Vesting.LazyGradedVestingAccount): LazyGradedVestingAccount =
      LazyGradedVestingAccount(
  	baseVestingAccount = BaseVestingAccountJvmConverter.convert(obj.getBaseVestingAccount()),
  	vestingSchedules = obj.getVestingSchedulesList().map { VestingScheduleJvmConverter.convert(it) },
  )

  public override fun convert(obj: LazyGradedVestingAccount): Vesting.LazyGradedVestingAccount {
    val builder = Vesting.LazyGradedVestingAccount.newBuilder()
    builder.setBaseVestingAccount(BaseVestingAccountJvmConverter.convert(obj.baseVestingAccount))
    builder.addAllVestingSchedules(obj.vestingSchedules.map {
        VestingScheduleJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ScheduleJvmConverter : ProtobufTypeMapper<Schedule, Vesting.Schedule> {
  public override val descriptor: Descriptors.Descriptor = Vesting.Schedule.getDescriptor()

  public override val parser: Parser<Vesting.Schedule> = Vesting.Schedule.parser()

  public override fun convert(obj: Vesting.Schedule): Schedule = Schedule(
  	startTime = obj.getStartTime(),
  	endTime = obj.getEndTime(),
  	ratio = obj.getRatio(),
  )

  public override fun convert(obj: Schedule): Vesting.Schedule {
    val builder = Vesting.Schedule.newBuilder()
    builder.setStartTime(obj.startTime)
    builder.setEndTime(obj.endTime)
    builder.setRatio(obj.ratio)
    return builder.build()
  }
}

public object VestingScheduleJvmConverter :
    ProtobufTypeMapper<VestingSchedule, Vesting.VestingSchedule> {
  public override val descriptor: Descriptors.Descriptor = Vesting.VestingSchedule.getDescriptor()

  public override val parser: Parser<Vesting.VestingSchedule> = Vesting.VestingSchedule.parser()

  public override fun convert(obj: Vesting.VestingSchedule): VestingSchedule = VestingSchedule(
  	denom = obj.getDenom(),
  	schedules = obj.getSchedulesList().map { ScheduleJvmConverter.convert(it) },
  )

  public override fun convert(obj: VestingSchedule): Vesting.VestingSchedule {
    val builder = Vesting.VestingSchedule.newBuilder()
    builder.setDenom(obj.denom)
    builder.addAllSchedules(obj.schedules.map { ScheduleJvmConverter.convert(it) })
    return builder.build()
  }
}
