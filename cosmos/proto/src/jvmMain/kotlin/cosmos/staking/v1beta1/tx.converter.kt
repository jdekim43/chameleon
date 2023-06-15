// Transform from cosmos/staking/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgCreateValidatorConverter : ProtobufConverter<MsgCreateValidator> by
    MsgCreateValidatorJvmConverter

public actual object MsgCreateValidatorResponseConverter :
    ProtobufConverter<MsgCreateValidatorResponse> by MsgCreateValidatorResponseJvmConverter

public actual object MsgEditValidatorConverter : ProtobufConverter<MsgEditValidator> by
    MsgEditValidatorJvmConverter

public actual object MsgEditValidatorResponseConverter : ProtobufConverter<MsgEditValidatorResponse>
    by MsgEditValidatorResponseJvmConverter

public actual object MsgDelegateConverter : ProtobufConverter<MsgDelegate> by
    MsgDelegateJvmConverter

public actual object MsgDelegateResponseConverter : ProtobufConverter<MsgDelegateResponse> by
    MsgDelegateResponseJvmConverter

public actual object MsgBeginRedelegateConverter : ProtobufConverter<MsgBeginRedelegate> by
    MsgBeginRedelegateJvmConverter

public actual object MsgBeginRedelegateResponseConverter :
    ProtobufConverter<MsgBeginRedelegateResponse> by MsgBeginRedelegateResponseJvmConverter

public actual object MsgUndelegateConverter : ProtobufConverter<MsgUndelegate> by
    MsgUndelegateJvmConverter

public actual object MsgUndelegateResponseConverter : ProtobufConverter<MsgUndelegateResponse> by
    MsgUndelegateResponseJvmConverter

public actual object MsgCancelUnbondingDelegationConverter :
    ProtobufConverter<MsgCancelUnbondingDelegation> by MsgCancelUnbondingDelegationJvmConverter

public actual object MsgCancelUnbondingDelegationResponseConverter :
    ProtobufConverter<MsgCancelUnbondingDelegationResponse> by
    MsgCancelUnbondingDelegationResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter
