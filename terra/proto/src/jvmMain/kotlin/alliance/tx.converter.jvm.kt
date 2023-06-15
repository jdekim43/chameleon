// Transform from alliance/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgDelegateJvmConverter : ProtobufTypeMapper<MsgDelegate, Tx.MsgDelegate> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgDelegate.getDescriptor()

  public override val parser: Parser<Tx.MsgDelegate> = Tx.MsgDelegate.parser()

  public override fun convert(obj: Tx.MsgDelegate): MsgDelegate = MsgDelegate(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgDelegate): Tx.MsgDelegate {
    val builder = Tx.MsgDelegate.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgDelegateResponseJvmConverter :
    ProtobufTypeMapper<MsgDelegateResponse, Tx.MsgDelegateResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgDelegateResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgDelegateResponse> = Tx.MsgDelegateResponse.parser()

  public override fun convert(obj: Tx.MsgDelegateResponse): MsgDelegateResponse =
      MsgDelegateResponse(
  )

  public override fun convert(obj: MsgDelegateResponse): Tx.MsgDelegateResponse {
    val builder = Tx.MsgDelegateResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUndelegateJvmConverter : ProtobufTypeMapper<MsgUndelegate, Tx.MsgUndelegate> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUndelegate.getDescriptor()

  public override val parser: Parser<Tx.MsgUndelegate> = Tx.MsgUndelegate.parser()

  public override fun convert(obj: Tx.MsgUndelegate): MsgUndelegate = MsgUndelegate(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgUndelegate): Tx.MsgUndelegate {
    val builder = Tx.MsgUndelegate.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgUndelegateResponseJvmConverter :
    ProtobufTypeMapper<MsgUndelegateResponse, Tx.MsgUndelegateResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUndelegateResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUndelegateResponse> = Tx.MsgUndelegateResponse.parser()

  public override fun convert(obj: Tx.MsgUndelegateResponse): MsgUndelegateResponse =
      MsgUndelegateResponse(
  )

  public override fun convert(obj: MsgUndelegateResponse): Tx.MsgUndelegateResponse {
    val builder = Tx.MsgUndelegateResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRedelegateJvmConverter : ProtobufTypeMapper<MsgRedelegate, Tx.MsgRedelegate> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRedelegate.getDescriptor()

  public override val parser: Parser<Tx.MsgRedelegate> = Tx.MsgRedelegate.parser()

  public override fun convert(obj: Tx.MsgRedelegate): MsgRedelegate = MsgRedelegate(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorSrcAddress = obj.getValidatorSrcAddress(),
  	validatorDstAddress = obj.getValidatorDstAddress(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgRedelegate): Tx.MsgRedelegate {
    val builder = Tx.MsgRedelegate.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorSrcAddress(obj.validatorSrcAddress)
    builder.setValidatorDstAddress(obj.validatorDstAddress)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgRedelegateResponseJvmConverter :
    ProtobufTypeMapper<MsgRedelegateResponse, Tx.MsgRedelegateResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRedelegateResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRedelegateResponse> = Tx.MsgRedelegateResponse.parser()

  public override fun convert(obj: Tx.MsgRedelegateResponse): MsgRedelegateResponse =
      MsgRedelegateResponse(
  )

  public override fun convert(obj: MsgRedelegateResponse): Tx.MsgRedelegateResponse {
    val builder = Tx.MsgRedelegateResponse.newBuilder()
    return builder.build()
  }
}

public object MsgClaimDelegationRewardsJvmConverter :
    ProtobufTypeMapper<MsgClaimDelegationRewards, Tx.MsgClaimDelegationRewards> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgClaimDelegationRewards.getDescriptor()

  public override val parser: Parser<Tx.MsgClaimDelegationRewards> =
      Tx.MsgClaimDelegationRewards.parser()

  public override fun convert(obj: Tx.MsgClaimDelegationRewards): MsgClaimDelegationRewards =
      MsgClaimDelegationRewards(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: MsgClaimDelegationRewards): Tx.MsgClaimDelegationRewards {
    val builder = Tx.MsgClaimDelegationRewards.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object MsgClaimDelegationRewardsResponseJvmConverter :
    ProtobufTypeMapper<MsgClaimDelegationRewardsResponse, Tx.MsgClaimDelegationRewardsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgClaimDelegationRewardsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgClaimDelegationRewardsResponse> =
      Tx.MsgClaimDelegationRewardsResponse.parser()

  public override fun convert(obj: Tx.MsgClaimDelegationRewardsResponse):
      MsgClaimDelegationRewardsResponse = MsgClaimDelegationRewardsResponse(
  )

  public override fun convert(obj: MsgClaimDelegationRewardsResponse):
      Tx.MsgClaimDelegationRewardsResponse {
    val builder = Tx.MsgClaimDelegationRewardsResponse.newBuilder()
    return builder.build()
  }
}
