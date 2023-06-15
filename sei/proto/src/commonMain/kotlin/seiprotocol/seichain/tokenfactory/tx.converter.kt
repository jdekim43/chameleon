// Transform from tokenfactory/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgCreateDenomConverter : ProtobufConverter<MsgCreateDenom>

public fun MsgCreateDenom.toAny(): Any = Any(MsgCreateDenom.TYPE_URL, with(MsgCreateDenomConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateDenom>): MsgCreateDenom {
  if (typeUrl != MsgCreateDenom.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateDenomResponseConverter : ProtobufConverter<MsgCreateDenomResponse>

public fun MsgCreateDenomResponse.toAny(): Any = Any(MsgCreateDenomResponse.TYPE_URL,
    with(MsgCreateDenomResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateDenomResponse>): MsgCreateDenomResponse {
  if (typeUrl != MsgCreateDenomResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgMintConverter : ProtobufConverter<MsgMint>

public fun MsgMint.toAny(): Any = Any(MsgMint.TYPE_URL, with(MsgMintConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgMint>): MsgMint {
  if (typeUrl != MsgMint.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgMintResponseConverter : ProtobufConverter<MsgMintResponse>

public fun MsgMintResponse.toAny(): Any = Any(MsgMintResponse.TYPE_URL,
    with(MsgMintResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgMintResponse>): MsgMintResponse {
  if (typeUrl != MsgMintResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBurnConverter : ProtobufConverter<MsgBurn>

public fun MsgBurn.toAny(): Any = Any(MsgBurn.TYPE_URL, with(MsgBurnConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBurn>): MsgBurn {
  if (typeUrl != MsgBurn.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBurnResponseConverter : ProtobufConverter<MsgBurnResponse>

public fun MsgBurnResponse.toAny(): Any = Any(MsgBurnResponse.TYPE_URL,
    with(MsgBurnResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBurnResponse>): MsgBurnResponse {
  if (typeUrl != MsgBurnResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgChangeAdminConverter : ProtobufConverter<MsgChangeAdmin>

public fun MsgChangeAdmin.toAny(): Any = Any(MsgChangeAdmin.TYPE_URL, with(MsgChangeAdminConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgChangeAdmin>): MsgChangeAdmin {
  if (typeUrl != MsgChangeAdmin.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgChangeAdminResponseConverter : ProtobufConverter<MsgChangeAdminResponse>

public fun MsgChangeAdminResponse.toAny(): Any = Any(MsgChangeAdminResponse.TYPE_URL,
    with(MsgChangeAdminResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgChangeAdminResponse>): MsgChangeAdminResponse {
  if (typeUrl != MsgChangeAdminResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
