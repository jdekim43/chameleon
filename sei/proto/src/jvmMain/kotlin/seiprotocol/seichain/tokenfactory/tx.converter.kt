// Transform from tokenfactory/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgCreateDenomConverter : ProtobufConverter<MsgCreateDenom> by
    MsgCreateDenomJvmConverter

public actual object MsgCreateDenomResponseConverter : ProtobufConverter<MsgCreateDenomResponse> by
    MsgCreateDenomResponseJvmConverter

public actual object MsgMintConverter : ProtobufConverter<MsgMint> by MsgMintJvmConverter

public actual object MsgMintResponseConverter : ProtobufConverter<MsgMintResponse> by
    MsgMintResponseJvmConverter

public actual object MsgBurnConverter : ProtobufConverter<MsgBurn> by MsgBurnJvmConverter

public actual object MsgBurnResponseConverter : ProtobufConverter<MsgBurnResponse> by
    MsgBurnResponseJvmConverter

public actual object MsgChangeAdminConverter : ProtobufConverter<MsgChangeAdmin> by
    MsgChangeAdminJvmConverter

public actual object MsgChangeAdminResponseConverter : ProtobufConverter<MsgChangeAdminResponse> by
    MsgChangeAdminResponseJvmConverter
