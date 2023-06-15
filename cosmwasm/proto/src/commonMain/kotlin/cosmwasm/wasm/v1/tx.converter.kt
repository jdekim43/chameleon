// Transform from cosmwasm/wasm/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgStoreCodeConverter : ProtobufConverter<MsgStoreCode>

public fun MsgStoreCode.toAny(): Any = Any(MsgStoreCode.TYPE_URL, with(MsgStoreCodeConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgStoreCode>): MsgStoreCode {
  if (typeUrl != MsgStoreCode.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgStoreCodeResponseConverter : ProtobufConverter<MsgStoreCodeResponse>

public fun MsgStoreCodeResponse.toAny(): Any = Any(MsgStoreCodeResponse.TYPE_URL,
    with(MsgStoreCodeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgStoreCodeResponse>): MsgStoreCodeResponse {
  if (typeUrl != MsgStoreCodeResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantiateContractConverter : ProtobufConverter<MsgInstantiateContract>

public fun MsgInstantiateContract.toAny(): Any = Any(MsgInstantiateContract.TYPE_URL,
    with(MsgInstantiateContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantiateContract>): MsgInstantiateContract {
  if (typeUrl != MsgInstantiateContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantiateContractResponseConverter :
    ProtobufConverter<MsgInstantiateContractResponse>

public fun MsgInstantiateContractResponse.toAny(): Any =
    Any(MsgInstantiateContractResponse.TYPE_URL, with(MsgInstantiateContractResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantiateContractResponse>):
    MsgInstantiateContractResponse {
  if (typeUrl != MsgInstantiateContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantiateContract2Converter : ProtobufConverter<MsgInstantiateContract2>

public fun MsgInstantiateContract2.toAny(): Any = Any(MsgInstantiateContract2.TYPE_URL,
    with(MsgInstantiateContract2Converter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantiateContract2>):
    MsgInstantiateContract2 {
  if (typeUrl != MsgInstantiateContract2.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantiateContract2ResponseConverter :
    ProtobufConverter<MsgInstantiateContract2Response>

public fun MsgInstantiateContract2Response.toAny(): Any =
    Any(MsgInstantiateContract2Response.TYPE_URL, with(MsgInstantiateContract2ResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantiateContract2Response>):
    MsgInstantiateContract2Response {
  if (typeUrl != MsgInstantiateContract2Response.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgExecuteContractConverter : ProtobufConverter<MsgExecuteContract>

public fun MsgExecuteContract.toAny(): Any = Any(MsgExecuteContract.TYPE_URL,
    with(MsgExecuteContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgExecuteContract>): MsgExecuteContract {
  if (typeUrl != MsgExecuteContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgExecuteContractResponseConverter :
    ProtobufConverter<MsgExecuteContractResponse>

public fun MsgExecuteContractResponse.toAny(): Any = Any(MsgExecuteContractResponse.TYPE_URL,
    with(MsgExecuteContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgExecuteContractResponse>):
    MsgExecuteContractResponse {
  if (typeUrl != MsgExecuteContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgMigrateContractConverter : ProtobufConverter<MsgMigrateContract>

public fun MsgMigrateContract.toAny(): Any = Any(MsgMigrateContract.TYPE_URL,
    with(MsgMigrateContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgMigrateContract>): MsgMigrateContract {
  if (typeUrl != MsgMigrateContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgMigrateContractResponseConverter :
    ProtobufConverter<MsgMigrateContractResponse>

public fun MsgMigrateContractResponse.toAny(): Any = Any(MsgMigrateContractResponse.TYPE_URL,
    with(MsgMigrateContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgMigrateContractResponse>):
    MsgMigrateContractResponse {
  if (typeUrl != MsgMigrateContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateAdminConverter : ProtobufConverter<MsgUpdateAdmin>

public fun MsgUpdateAdmin.toAny(): Any = Any(MsgUpdateAdmin.TYPE_URL, with(MsgUpdateAdminConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateAdmin>): MsgUpdateAdmin {
  if (typeUrl != MsgUpdateAdmin.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateAdminResponseConverter : ProtobufConverter<MsgUpdateAdminResponse>

public fun MsgUpdateAdminResponse.toAny(): Any = Any(MsgUpdateAdminResponse.TYPE_URL,
    with(MsgUpdateAdminResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateAdminResponse>): MsgUpdateAdminResponse {
  if (typeUrl != MsgUpdateAdminResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgClearAdminConverter : ProtobufConverter<MsgClearAdmin>

public fun MsgClearAdmin.toAny(): Any = Any(MsgClearAdmin.TYPE_URL, with(MsgClearAdminConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgClearAdmin>): MsgClearAdmin {
  if (typeUrl != MsgClearAdmin.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgClearAdminResponseConverter : ProtobufConverter<MsgClearAdminResponse>

public fun MsgClearAdminResponse.toAny(): Any = Any(MsgClearAdminResponse.TYPE_URL,
    with(MsgClearAdminResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgClearAdminResponse>): MsgClearAdminResponse {
  if (typeUrl != MsgClearAdminResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateInstantiateConfigConverter :
    ProtobufConverter<MsgUpdateInstantiateConfig>

public fun MsgUpdateInstantiateConfig.toAny(): Any = Any(MsgUpdateInstantiateConfig.TYPE_URL,
    with(MsgUpdateInstantiateConfigConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateInstantiateConfig>):
    MsgUpdateInstantiateConfig {
  if (typeUrl != MsgUpdateInstantiateConfig.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateInstantiateConfigResponseConverter :
    ProtobufConverter<MsgUpdateInstantiateConfigResponse>

public fun MsgUpdateInstantiateConfigResponse.toAny(): Any =
    Any(MsgUpdateInstantiateConfigResponse.TYPE_URL,
    with(MsgUpdateInstantiateConfigResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateInstantiateConfigResponse>):
    MsgUpdateInstantiateConfigResponse {
  if (typeUrl != MsgUpdateInstantiateConfigResponse.TYPE_URL) throw
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

public expect object MsgSudoContractConverter : ProtobufConverter<MsgSudoContract>

public fun MsgSudoContract.toAny(): Any = Any(MsgSudoContract.TYPE_URL,
    with(MsgSudoContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSudoContract>): MsgSudoContract {
  if (typeUrl != MsgSudoContract.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSudoContractResponseConverter : ProtobufConverter<MsgSudoContractResponse>

public fun MsgSudoContractResponse.toAny(): Any = Any(MsgSudoContractResponse.TYPE_URL,
    with(MsgSudoContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSudoContractResponse>):
    MsgSudoContractResponse {
  if (typeUrl != MsgSudoContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgPinCodesConverter : ProtobufConverter<MsgPinCodes>

public fun MsgPinCodes.toAny(): Any = Any(MsgPinCodes.TYPE_URL, with(MsgPinCodesConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgPinCodes>): MsgPinCodes {
  if (typeUrl != MsgPinCodes.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgPinCodesResponseConverter : ProtobufConverter<MsgPinCodesResponse>

public fun MsgPinCodesResponse.toAny(): Any = Any(MsgPinCodesResponse.TYPE_URL,
    with(MsgPinCodesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgPinCodesResponse>): MsgPinCodesResponse {
  if (typeUrl != MsgPinCodesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUnpinCodesConverter : ProtobufConverter<MsgUnpinCodes>

public fun MsgUnpinCodes.toAny(): Any = Any(MsgUnpinCodes.TYPE_URL, with(MsgUnpinCodesConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUnpinCodes>): MsgUnpinCodes {
  if (typeUrl != MsgUnpinCodes.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUnpinCodesResponseConverter : ProtobufConverter<MsgUnpinCodesResponse>

public fun MsgUnpinCodesResponse.toAny(): Any = Any(MsgUnpinCodesResponse.TYPE_URL,
    with(MsgUnpinCodesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUnpinCodesResponse>): MsgUnpinCodesResponse {
  if (typeUrl != MsgUnpinCodesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgStoreAndInstantiateContractConverter :
    ProtobufConverter<MsgStoreAndInstantiateContract>

public fun MsgStoreAndInstantiateContract.toAny(): Any =
    Any(MsgStoreAndInstantiateContract.TYPE_URL, with(MsgStoreAndInstantiateContractConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgStoreAndInstantiateContract>):
    MsgStoreAndInstantiateContract {
  if (typeUrl != MsgStoreAndInstantiateContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgStoreAndInstantiateContractResponseConverter :
    ProtobufConverter<MsgStoreAndInstantiateContractResponse>

public fun MsgStoreAndInstantiateContractResponse.toAny(): Any =
    Any(MsgStoreAndInstantiateContractResponse.TYPE_URL,
    with(MsgStoreAndInstantiateContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgStoreAndInstantiateContractResponse>):
    MsgStoreAndInstantiateContractResponse {
  if (typeUrl != MsgStoreAndInstantiateContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
