// Transform from cosmos/distribution/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgSetWithdrawAddressConverter : ProtobufConverter<MsgSetWithdrawAddress>

public fun MsgSetWithdrawAddress.toAny(): Any = Any(MsgSetWithdrawAddress.TYPE_URL,
    with(MsgSetWithdrawAddressConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSetWithdrawAddress>): MsgSetWithdrawAddress {
  if (typeUrl != MsgSetWithdrawAddress.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSetWithdrawAddressResponseConverter :
    ProtobufConverter<MsgSetWithdrawAddressResponse>

public fun MsgSetWithdrawAddressResponse.toAny(): Any = Any(MsgSetWithdrawAddressResponse.TYPE_URL,
    with(MsgSetWithdrawAddressResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSetWithdrawAddressResponse>):
    MsgSetWithdrawAddressResponse {
  if (typeUrl != MsgSetWithdrawAddressResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawDelegatorRewardConverter :
    ProtobufConverter<MsgWithdrawDelegatorReward>

public fun MsgWithdrawDelegatorReward.toAny(): Any = Any(MsgWithdrawDelegatorReward.TYPE_URL,
    with(MsgWithdrawDelegatorRewardConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdrawDelegatorReward>):
    MsgWithdrawDelegatorReward {
  if (typeUrl != MsgWithdrawDelegatorReward.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawDelegatorRewardResponseConverter :
    ProtobufConverter<MsgWithdrawDelegatorRewardResponse>

public fun MsgWithdrawDelegatorRewardResponse.toAny(): Any =
    Any(MsgWithdrawDelegatorRewardResponse.TYPE_URL,
    with(MsgWithdrawDelegatorRewardResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdrawDelegatorRewardResponse>):
    MsgWithdrawDelegatorRewardResponse {
  if (typeUrl != MsgWithdrawDelegatorRewardResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawValidatorCommissionConverter :
    ProtobufConverter<MsgWithdrawValidatorCommission>

public fun MsgWithdrawValidatorCommission.toAny(): Any =
    Any(MsgWithdrawValidatorCommission.TYPE_URL, with(MsgWithdrawValidatorCommissionConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdrawValidatorCommission>):
    MsgWithdrawValidatorCommission {
  if (typeUrl != MsgWithdrawValidatorCommission.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawValidatorCommissionResponseConverter :
    ProtobufConverter<MsgWithdrawValidatorCommissionResponse>

public fun MsgWithdrawValidatorCommissionResponse.toAny(): Any =
    Any(MsgWithdrawValidatorCommissionResponse.TYPE_URL,
    with(MsgWithdrawValidatorCommissionResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdrawValidatorCommissionResponse>):
    MsgWithdrawValidatorCommissionResponse {
  if (typeUrl != MsgWithdrawValidatorCommissionResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgFundCommunityPoolConverter : ProtobufConverter<MsgFundCommunityPool>

public fun MsgFundCommunityPool.toAny(): Any = Any(MsgFundCommunityPool.TYPE_URL,
    with(MsgFundCommunityPoolConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgFundCommunityPool>): MsgFundCommunityPool {
  if (typeUrl != MsgFundCommunityPool.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgFundCommunityPoolResponseConverter :
    ProtobufConverter<MsgFundCommunityPoolResponse>

public fun MsgFundCommunityPoolResponse.toAny(): Any = Any(MsgFundCommunityPoolResponse.TYPE_URL,
    with(MsgFundCommunityPoolResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgFundCommunityPoolResponse>):
    MsgFundCommunityPoolResponse {
  if (typeUrl != MsgFundCommunityPoolResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public fun MsgUpdateParams.toAny(): Any = Any(MsgUpdateParams.TYPE_URL,
    with(MsgUpdateParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParams>): MsgUpdateParams {
  if (typeUrl != MsgUpdateParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>

public fun MsgUpdateParamsResponse.toAny(): Any = Any(MsgUpdateParamsResponse.TYPE_URL,
    with(MsgUpdateParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParamsResponse>):
    MsgUpdateParamsResponse {
  if (typeUrl != MsgUpdateParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCommunityPoolSpendConverter : ProtobufConverter<MsgCommunityPoolSpend>

public fun MsgCommunityPoolSpend.toAny(): Any = Any(MsgCommunityPoolSpend.TYPE_URL,
    with(MsgCommunityPoolSpendConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCommunityPoolSpend>): MsgCommunityPoolSpend {
  if (typeUrl != MsgCommunityPoolSpend.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCommunityPoolSpendResponseConverter :
    ProtobufConverter<MsgCommunityPoolSpendResponse>

public fun MsgCommunityPoolSpendResponse.toAny(): Any = Any(MsgCommunityPoolSpendResponse.TYPE_URL,
    with(MsgCommunityPoolSpendResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCommunityPoolSpendResponse>):
    MsgCommunityPoolSpendResponse {
  if (typeUrl != MsgCommunityPoolSpendResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
