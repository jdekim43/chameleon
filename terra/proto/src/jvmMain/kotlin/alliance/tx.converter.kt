// Transform from alliance/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgDelegateConverter : ProtobufConverter<MsgDelegate> by
    MsgDelegateJvmConverter

public actual object MsgDelegateResponseConverter : ProtobufConverter<MsgDelegateResponse> by
    MsgDelegateResponseJvmConverter

public actual object MsgUndelegateConverter : ProtobufConverter<MsgUndelegate> by
    MsgUndelegateJvmConverter

public actual object MsgUndelegateResponseConverter : ProtobufConverter<MsgUndelegateResponse> by
    MsgUndelegateResponseJvmConverter

public actual object MsgRedelegateConverter : ProtobufConverter<MsgRedelegate> by
    MsgRedelegateJvmConverter

public actual object MsgRedelegateResponseConverter : ProtobufConverter<MsgRedelegateResponse> by
    MsgRedelegateResponseJvmConverter

public actual object MsgClaimDelegationRewardsConverter :
    ProtobufConverter<MsgClaimDelegationRewards> by MsgClaimDelegationRewardsJvmConverter

public actual object MsgClaimDelegationRewardsResponseConverter :
    ProtobufConverter<MsgClaimDelegationRewardsResponse> by
    MsgClaimDelegationRewardsResponseJvmConverter
