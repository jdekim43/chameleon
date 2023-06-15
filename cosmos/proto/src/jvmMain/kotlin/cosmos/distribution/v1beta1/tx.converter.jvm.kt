// Transform from cosmos/distribution/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgSetWithdrawAddressJvmConverter :
    ProtobufTypeMapper<MsgSetWithdrawAddress, Tx.MsgSetWithdrawAddress> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSetWithdrawAddress.getDescriptor()

  public override val parser: Parser<Tx.MsgSetWithdrawAddress> = Tx.MsgSetWithdrawAddress.parser()

  public override fun convert(obj: Tx.MsgSetWithdrawAddress): MsgSetWithdrawAddress =
      MsgSetWithdrawAddress(
  	delegatorAddress = obj.getDelegatorAddress(),
  	withdrawAddress = obj.getWithdrawAddress(),
  )

  public override fun convert(obj: MsgSetWithdrawAddress): Tx.MsgSetWithdrawAddress {
    val builder = Tx.MsgSetWithdrawAddress.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setWithdrawAddress(obj.withdrawAddress)
    return builder.build()
  }
}

public object MsgSetWithdrawAddressResponseJvmConverter :
    ProtobufTypeMapper<MsgSetWithdrawAddressResponse, Tx.MsgSetWithdrawAddressResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgSetWithdrawAddressResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSetWithdrawAddressResponse> =
      Tx.MsgSetWithdrawAddressResponse.parser()

  public override fun convert(obj: Tx.MsgSetWithdrawAddressResponse): MsgSetWithdrawAddressResponse
      = MsgSetWithdrawAddressResponse(
  )

  public override fun convert(obj: MsgSetWithdrawAddressResponse):
      Tx.MsgSetWithdrawAddressResponse {
    val builder = Tx.MsgSetWithdrawAddressResponse.newBuilder()
    return builder.build()
  }
}

public object MsgWithdrawDelegatorRewardJvmConverter :
    ProtobufTypeMapper<MsgWithdrawDelegatorReward, Tx.MsgWithdrawDelegatorReward> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgWithdrawDelegatorReward.getDescriptor()

  public override val parser: Parser<Tx.MsgWithdrawDelegatorReward> =
      Tx.MsgWithdrawDelegatorReward.parser()

  public override fun convert(obj: Tx.MsgWithdrawDelegatorReward): MsgWithdrawDelegatorReward =
      MsgWithdrawDelegatorReward(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  )

  public override fun convert(obj: MsgWithdrawDelegatorReward): Tx.MsgWithdrawDelegatorReward {
    val builder = Tx.MsgWithdrawDelegatorReward.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    return builder.build()
  }
}

public object MsgWithdrawDelegatorRewardResponseJvmConverter :
    ProtobufTypeMapper<MsgWithdrawDelegatorRewardResponse, Tx.MsgWithdrawDelegatorRewardResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgWithdrawDelegatorRewardResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgWithdrawDelegatorRewardResponse> =
      Tx.MsgWithdrawDelegatorRewardResponse.parser()

  public override fun convert(obj: Tx.MsgWithdrawDelegatorRewardResponse):
      MsgWithdrawDelegatorRewardResponse = MsgWithdrawDelegatorRewardResponse(
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgWithdrawDelegatorRewardResponse):
      Tx.MsgWithdrawDelegatorRewardResponse {
    val builder = Tx.MsgWithdrawDelegatorRewardResponse.newBuilder()
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgWithdrawValidatorCommissionJvmConverter :
    ProtobufTypeMapper<MsgWithdrawValidatorCommission, Tx.MsgWithdrawValidatorCommission> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgWithdrawValidatorCommission.getDescriptor()

  public override val parser: Parser<Tx.MsgWithdrawValidatorCommission> =
      Tx.MsgWithdrawValidatorCommission.parser()

  public override fun convert(obj: Tx.MsgWithdrawValidatorCommission):
      MsgWithdrawValidatorCommission = MsgWithdrawValidatorCommission(
  	validatorAddress = obj.getValidatorAddress(),
  )

  public override fun convert(obj: MsgWithdrawValidatorCommission):
      Tx.MsgWithdrawValidatorCommission {
    val builder = Tx.MsgWithdrawValidatorCommission.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    return builder.build()
  }
}

public object MsgWithdrawValidatorCommissionResponseJvmConverter :
    ProtobufTypeMapper<MsgWithdrawValidatorCommissionResponse, Tx.MsgWithdrawValidatorCommissionResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgWithdrawValidatorCommissionResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgWithdrawValidatorCommissionResponse> =
      Tx.MsgWithdrawValidatorCommissionResponse.parser()

  public override fun convert(obj: Tx.MsgWithdrawValidatorCommissionResponse):
      MsgWithdrawValidatorCommissionResponse = MsgWithdrawValidatorCommissionResponse(
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgWithdrawValidatorCommissionResponse):
      Tx.MsgWithdrawValidatorCommissionResponse {
    val builder = Tx.MsgWithdrawValidatorCommissionResponse.newBuilder()
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgFundCommunityPoolJvmConverter :
    ProtobufTypeMapper<MsgFundCommunityPool, Tx.MsgFundCommunityPool> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgFundCommunityPool.getDescriptor()

  public override val parser: Parser<Tx.MsgFundCommunityPool> = Tx.MsgFundCommunityPool.parser()

  public override fun convert(obj: Tx.MsgFundCommunityPool): MsgFundCommunityPool =
      MsgFundCommunityPool(
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  	depositor = obj.getDepositor(),
  )

  public override fun convert(obj: MsgFundCommunityPool): Tx.MsgFundCommunityPool {
    val builder = Tx.MsgFundCommunityPool.newBuilder()
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    builder.setDepositor(obj.depositor)
    return builder.build()
  }
}

public object MsgFundCommunityPoolResponseJvmConverter :
    ProtobufTypeMapper<MsgFundCommunityPoolResponse, Tx.MsgFundCommunityPoolResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgFundCommunityPoolResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgFundCommunityPoolResponse> =
      Tx.MsgFundCommunityPoolResponse.parser()

  public override fun convert(obj: Tx.MsgFundCommunityPoolResponse): MsgFundCommunityPoolResponse =
      MsgFundCommunityPoolResponse(
  )

  public override fun convert(obj: MsgFundCommunityPoolResponse): Tx.MsgFundCommunityPoolResponse {
    val builder = Tx.MsgFundCommunityPoolResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateParamsJvmConverter : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.getAuthority(),
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Tx.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParamsResponse> =
      Tx.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Tx.MsgUpdateParamsResponse {
    val builder = Tx.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}

public object MsgCommunityPoolSpendJvmConverter :
    ProtobufTypeMapper<MsgCommunityPoolSpend, Tx.MsgCommunityPoolSpend> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCommunityPoolSpend.getDescriptor()

  public override val parser: Parser<Tx.MsgCommunityPoolSpend> = Tx.MsgCommunityPoolSpend.parser()

  public override fun convert(obj: Tx.MsgCommunityPoolSpend): MsgCommunityPoolSpend =
      MsgCommunityPoolSpend(
  	authority = obj.getAuthority(),
  	recipient = obj.getRecipient(),
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgCommunityPoolSpend): Tx.MsgCommunityPoolSpend {
    val builder = Tx.MsgCommunityPoolSpend.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setRecipient(obj.recipient)
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgCommunityPoolSpendResponseJvmConverter :
    ProtobufTypeMapper<MsgCommunityPoolSpendResponse, Tx.MsgCommunityPoolSpendResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCommunityPoolSpendResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCommunityPoolSpendResponse> =
      Tx.MsgCommunityPoolSpendResponse.parser()

  public override fun convert(obj: Tx.MsgCommunityPoolSpendResponse): MsgCommunityPoolSpendResponse
      = MsgCommunityPoolSpendResponse(
  )

  public override fun convert(obj: MsgCommunityPoolSpendResponse):
      Tx.MsgCommunityPoolSpendResponse {
    val builder = Tx.MsgCommunityPoolSpendResponse.newBuilder()
    return builder.build()
  }
}
