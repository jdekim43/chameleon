// Transform from cosmos/vesting/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.vesting.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgCreateVestingAccountJvmConverter :
    ProtobufTypeMapper<MsgCreateVestingAccount, Tx.MsgCreateVestingAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateVestingAccount.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateVestingAccount> =
      Tx.MsgCreateVestingAccount.parser()

  public override fun convert(obj: Tx.MsgCreateVestingAccount): MsgCreateVestingAccount =
      MsgCreateVestingAccount(
  	fromAddress = obj.getFromAddress(),
  	toAddress = obj.getToAddress(),
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  	endTime = obj.getEndTime(),
  	delayed = obj.getDelayed(),
  )

  public override fun convert(obj: MsgCreateVestingAccount): Tx.MsgCreateVestingAccount {
    val builder = Tx.MsgCreateVestingAccount.newBuilder()
    builder.setFromAddress(obj.fromAddress)
    builder.setToAddress(obj.toAddress)
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    builder.setEndTime(obj.endTime)
    builder.setDelayed(obj.delayed)
    return builder.build()
  }
}

public object MsgCreateVestingAccountResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateVestingAccountResponse, Tx.MsgCreateVestingAccountResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateVestingAccountResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateVestingAccountResponse> =
      Tx.MsgCreateVestingAccountResponse.parser()

  public override fun convert(obj: Tx.MsgCreateVestingAccountResponse):
      MsgCreateVestingAccountResponse = MsgCreateVestingAccountResponse(
  )

  public override fun convert(obj: MsgCreateVestingAccountResponse):
      Tx.MsgCreateVestingAccountResponse {
    val builder = Tx.MsgCreateVestingAccountResponse.newBuilder()
    return builder.build()
  }
}

public object MsgCreatePermanentLockedAccountJvmConverter :
    ProtobufTypeMapper<MsgCreatePermanentLockedAccount, Tx.MsgCreatePermanentLockedAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreatePermanentLockedAccount.getDescriptor()

  public override val parser: Parser<Tx.MsgCreatePermanentLockedAccount> =
      Tx.MsgCreatePermanentLockedAccount.parser()

  public override fun convert(obj: Tx.MsgCreatePermanentLockedAccount):
      MsgCreatePermanentLockedAccount = MsgCreatePermanentLockedAccount(
  	fromAddress = obj.getFromAddress(),
  	toAddress = obj.getToAddress(),
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgCreatePermanentLockedAccount):
      Tx.MsgCreatePermanentLockedAccount {
    val builder = Tx.MsgCreatePermanentLockedAccount.newBuilder()
    builder.setFromAddress(obj.fromAddress)
    builder.setToAddress(obj.toAddress)
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgCreatePermanentLockedAccountResponseJvmConverter :
    ProtobufTypeMapper<MsgCreatePermanentLockedAccountResponse, Tx.MsgCreatePermanentLockedAccountResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreatePermanentLockedAccountResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreatePermanentLockedAccountResponse> =
      Tx.MsgCreatePermanentLockedAccountResponse.parser()

  public override fun convert(obj: Tx.MsgCreatePermanentLockedAccountResponse):
      MsgCreatePermanentLockedAccountResponse = MsgCreatePermanentLockedAccountResponse(
  )

  public override fun convert(obj: MsgCreatePermanentLockedAccountResponse):
      Tx.MsgCreatePermanentLockedAccountResponse {
    val builder = Tx.MsgCreatePermanentLockedAccountResponse.newBuilder()
    return builder.build()
  }
}

public object MsgCreatePeriodicVestingAccountJvmConverter :
    ProtobufTypeMapper<MsgCreatePeriodicVestingAccount, Tx.MsgCreatePeriodicVestingAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreatePeriodicVestingAccount.getDescriptor()

  public override val parser: Parser<Tx.MsgCreatePeriodicVestingAccount> =
      Tx.MsgCreatePeriodicVestingAccount.parser()

  public override fun convert(obj: Tx.MsgCreatePeriodicVestingAccount):
      MsgCreatePeriodicVestingAccount = MsgCreatePeriodicVestingAccount(
  	fromAddress = obj.getFromAddress(),
  	toAddress = obj.getToAddress(),
  	startTime = obj.getStartTime(),
  	vestingPeriods = obj.getVestingPeriodsList().map { PeriodJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgCreatePeriodicVestingAccount):
      Tx.MsgCreatePeriodicVestingAccount {
    val builder = Tx.MsgCreatePeriodicVestingAccount.newBuilder()
    builder.setFromAddress(obj.fromAddress)
    builder.setToAddress(obj.toAddress)
    builder.setStartTime(obj.startTime)
    builder.addAllVestingPeriods(obj.vestingPeriods.map { PeriodJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgCreatePeriodicVestingAccountResponseJvmConverter :
    ProtobufTypeMapper<MsgCreatePeriodicVestingAccountResponse, Tx.MsgCreatePeriodicVestingAccountResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreatePeriodicVestingAccountResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreatePeriodicVestingAccountResponse> =
      Tx.MsgCreatePeriodicVestingAccountResponse.parser()

  public override fun convert(obj: Tx.MsgCreatePeriodicVestingAccountResponse):
      MsgCreatePeriodicVestingAccountResponse = MsgCreatePeriodicVestingAccountResponse(
  )

  public override fun convert(obj: MsgCreatePeriodicVestingAccountResponse):
      Tx.MsgCreatePeriodicVestingAccountResponse {
    val builder = Tx.MsgCreatePeriodicVestingAccountResponse.newBuilder()
    return builder.build()
  }
}
