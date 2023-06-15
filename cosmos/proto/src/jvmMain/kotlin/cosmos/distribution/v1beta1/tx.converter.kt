// Transform from cosmos/distribution/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgSetWithdrawAddressConverter : ProtobufConverter<MsgSetWithdrawAddress> by
    MsgSetWithdrawAddressJvmConverter

public actual object MsgSetWithdrawAddressResponseConverter :
    ProtobufConverter<MsgSetWithdrawAddressResponse> by MsgSetWithdrawAddressResponseJvmConverter

public actual object MsgWithdrawDelegatorRewardConverter :
    ProtobufConverter<MsgWithdrawDelegatorReward> by MsgWithdrawDelegatorRewardJvmConverter

public actual object MsgWithdrawDelegatorRewardResponseConverter :
    ProtobufConverter<MsgWithdrawDelegatorRewardResponse> by
    MsgWithdrawDelegatorRewardResponseJvmConverter

public actual object MsgWithdrawValidatorCommissionConverter :
    ProtobufConverter<MsgWithdrawValidatorCommission> by MsgWithdrawValidatorCommissionJvmConverter

public actual object MsgWithdrawValidatorCommissionResponseConverter :
    ProtobufConverter<MsgWithdrawValidatorCommissionResponse> by
    MsgWithdrawValidatorCommissionResponseJvmConverter

public actual object MsgFundCommunityPoolConverter : ProtobufConverter<MsgFundCommunityPool> by
    MsgFundCommunityPoolJvmConverter

public actual object MsgFundCommunityPoolResponseConverter :
    ProtobufConverter<MsgFundCommunityPoolResponse> by MsgFundCommunityPoolResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter

public actual object MsgCommunityPoolSpendConverter : ProtobufConverter<MsgCommunityPoolSpend> by
    MsgCommunityPoolSpendJvmConverter

public actual object MsgCommunityPoolSpendResponseConverter :
    ProtobufConverter<MsgCommunityPoolSpendResponse> by MsgCommunityPoolSpendResponseJvmConverter
