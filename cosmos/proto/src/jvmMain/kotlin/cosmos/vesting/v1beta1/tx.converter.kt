// Transform from cosmos/vesting/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.vesting.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgCreateVestingAccountConverter : ProtobufConverter<MsgCreateVestingAccount>
    by MsgCreateVestingAccountJvmConverter

public actual object MsgCreateVestingAccountResponseConverter :
    ProtobufConverter<MsgCreateVestingAccountResponse> by
    MsgCreateVestingAccountResponseJvmConverter

public actual object MsgCreatePermanentLockedAccountConverter :
    ProtobufConverter<MsgCreatePermanentLockedAccount> by
    MsgCreatePermanentLockedAccountJvmConverter

public actual object MsgCreatePermanentLockedAccountResponseConverter :
    ProtobufConverter<MsgCreatePermanentLockedAccountResponse> by
    MsgCreatePermanentLockedAccountResponseJvmConverter

public actual object MsgCreatePeriodicVestingAccountConverter :
    ProtobufConverter<MsgCreatePeriodicVestingAccount> by
    MsgCreatePeriodicVestingAccountJvmConverter

public actual object MsgCreatePeriodicVestingAccountResponseConverter :
    ProtobufConverter<MsgCreatePeriodicVestingAccountResponse> by
    MsgCreatePeriodicVestingAccountResponseJvmConverter
