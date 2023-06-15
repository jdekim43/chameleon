// Transform from cosmos/feegrant/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgGrantAllowanceConverter : ProtobufConverter<MsgGrantAllowance> by
    MsgGrantAllowanceJvmConverter

public actual object MsgGrantAllowanceResponseConverter :
    ProtobufConverter<MsgGrantAllowanceResponse> by MsgGrantAllowanceResponseJvmConverter

public actual object MsgRevokeAllowanceConverter : ProtobufConverter<MsgRevokeAllowance> by
    MsgRevokeAllowanceJvmConverter

public actual object MsgRevokeAllowanceResponseConverter :
    ProtobufConverter<MsgRevokeAllowanceResponse> by MsgRevokeAllowanceResponseJvmConverter
