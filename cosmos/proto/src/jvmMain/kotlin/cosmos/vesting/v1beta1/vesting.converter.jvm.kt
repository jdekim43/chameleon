// Transform from cosmos/vesting/v1beta1/vesting.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.vesting.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.auth.v1beta1.BaseAccountJvmConverter
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object BaseVestingAccountJvmConverter :
    ProtobufTypeMapper<BaseVestingAccount, Vesting.BaseVestingAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Vesting.BaseVestingAccount.getDescriptor()

  public override val parser: Parser<Vesting.BaseVestingAccount> =
      Vesting.BaseVestingAccount.parser()

  public override fun convert(obj: Vesting.BaseVestingAccount): BaseVestingAccount =
      BaseVestingAccount(
  	baseAccount = BaseAccountJvmConverter.convert(obj.getBaseAccount()),
  	originalVesting = obj.getOriginalVestingList().map { CoinJvmConverter.convert(it) },
  	delegatedFree = obj.getDelegatedFreeList().map { CoinJvmConverter.convert(it) },
  	delegatedVesting = obj.getDelegatedVestingList().map { CoinJvmConverter.convert(it) },
  	endTime = obj.getEndTime(),
  )

  public override fun convert(obj: BaseVestingAccount): Vesting.BaseVestingAccount {
    val builder = Vesting.BaseVestingAccount.newBuilder()
    builder.setBaseAccount(BaseAccountJvmConverter.convert(obj.baseAccount))
    builder.addAllOriginalVesting(obj.originalVesting.map { CoinJvmConverter.convert(it) })
    builder.addAllDelegatedFree(obj.delegatedFree.map { CoinJvmConverter.convert(it) })
    builder.addAllDelegatedVesting(obj.delegatedVesting.map { CoinJvmConverter.convert(it) })
    builder.setEndTime(obj.endTime)
    return builder.build()
  }
}

public object ContinuousVestingAccountJvmConverter :
    ProtobufTypeMapper<ContinuousVestingAccount, Vesting.ContinuousVestingAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Vesting.ContinuousVestingAccount.getDescriptor()

  public override val parser: Parser<Vesting.ContinuousVestingAccount> =
      Vesting.ContinuousVestingAccount.parser()

  public override fun convert(obj: Vesting.ContinuousVestingAccount): ContinuousVestingAccount =
      ContinuousVestingAccount(
  	baseVestingAccount = BaseVestingAccountJvmConverter.convert(obj.getBaseVestingAccount()),
  	startTime = obj.getStartTime(),
  )

  public override fun convert(obj: ContinuousVestingAccount): Vesting.ContinuousVestingAccount {
    val builder = Vesting.ContinuousVestingAccount.newBuilder()
    builder.setBaseVestingAccount(BaseVestingAccountJvmConverter.convert(obj.baseVestingAccount))
    builder.setStartTime(obj.startTime)
    return builder.build()
  }
}

public object DelayedVestingAccountJvmConverter :
    ProtobufTypeMapper<DelayedVestingAccount, Vesting.DelayedVestingAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Vesting.DelayedVestingAccount.getDescriptor()

  public override val parser: Parser<Vesting.DelayedVestingAccount> =
      Vesting.DelayedVestingAccount.parser()

  public override fun convert(obj: Vesting.DelayedVestingAccount): DelayedVestingAccount =
      DelayedVestingAccount(
  	baseVestingAccount = BaseVestingAccountJvmConverter.convert(obj.getBaseVestingAccount()),
  )

  public override fun convert(obj: DelayedVestingAccount): Vesting.DelayedVestingAccount {
    val builder = Vesting.DelayedVestingAccount.newBuilder()
    builder.setBaseVestingAccount(BaseVestingAccountJvmConverter.convert(obj.baseVestingAccount))
    return builder.build()
  }
}

public object PeriodJvmConverter : ProtobufTypeMapper<Period, Vesting.Period> {
  public override val descriptor: Descriptors.Descriptor = Vesting.Period.getDescriptor()

  public override val parser: Parser<Vesting.Period> = Vesting.Period.parser()

  public override fun convert(obj: Vesting.Period): Period = Period(
  	length = obj.getLength(),
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: Period): Vesting.Period {
    val builder = Vesting.Period.newBuilder()
    builder.setLength(obj.length)
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object PeriodicVestingAccountJvmConverter :
    ProtobufTypeMapper<PeriodicVestingAccount, Vesting.PeriodicVestingAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Vesting.PeriodicVestingAccount.getDescriptor()

  public override val parser: Parser<Vesting.PeriodicVestingAccount> =
      Vesting.PeriodicVestingAccount.parser()

  public override fun convert(obj: Vesting.PeriodicVestingAccount): PeriodicVestingAccount =
      PeriodicVestingAccount(
  	baseVestingAccount = BaseVestingAccountJvmConverter.convert(obj.getBaseVestingAccount()),
  	startTime = obj.getStartTime(),
  	vestingPeriods = obj.getVestingPeriodsList().map { PeriodJvmConverter.convert(it) },
  )

  public override fun convert(obj: PeriodicVestingAccount): Vesting.PeriodicVestingAccount {
    val builder = Vesting.PeriodicVestingAccount.newBuilder()
    builder.setBaseVestingAccount(BaseVestingAccountJvmConverter.convert(obj.baseVestingAccount))
    builder.setStartTime(obj.startTime)
    builder.addAllVestingPeriods(obj.vestingPeriods.map { PeriodJvmConverter.convert(it) })
    return builder.build()
  }
}

public object PermanentLockedAccountJvmConverter :
    ProtobufTypeMapper<PermanentLockedAccount, Vesting.PermanentLockedAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Vesting.PermanentLockedAccount.getDescriptor()

  public override val parser: Parser<Vesting.PermanentLockedAccount> =
      Vesting.PermanentLockedAccount.parser()

  public override fun convert(obj: Vesting.PermanentLockedAccount): PermanentLockedAccount =
      PermanentLockedAccount(
  	baseVestingAccount = BaseVestingAccountJvmConverter.convert(obj.getBaseVestingAccount()),
  )

  public override fun convert(obj: PermanentLockedAccount): Vesting.PermanentLockedAccount {
    val builder = Vesting.PermanentLockedAccount.newBuilder()
    builder.setBaseVestingAccount(BaseVestingAccountJvmConverter.convert(obj.baseVestingAccount))
    return builder.build()
  }
}
