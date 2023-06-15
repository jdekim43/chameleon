// Transform from cosmos/authz/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgGrantConverter : ProtobufConverter<MsgGrant> by MsgGrantJvmConverter

public actual object MsgExecResponseConverter : ProtobufConverter<MsgExecResponse> by
    MsgExecResponseJvmConverter

public actual object MsgExecConverter : ProtobufConverter<MsgExec> by MsgExecJvmConverter

public actual object MsgGrantResponseConverter : ProtobufConverter<MsgGrantResponse> by
    MsgGrantResponseJvmConverter

public actual object MsgRevokeConverter : ProtobufConverter<MsgRevoke> by MsgRevokeJvmConverter

public actual object MsgRevokeResponseConverter : ProtobufConverter<MsgRevokeResponse> by
    MsgRevokeResponseJvmConverter
