// Transform from cosmwasm/wasm/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgStoreCodeConverter : ProtobufConverter<MsgStoreCode> by
    MsgStoreCodeJvmConverter

public actual object MsgStoreCodeResponseConverter : ProtobufConverter<MsgStoreCodeResponse> by
    MsgStoreCodeResponseJvmConverter

public actual object MsgInstantiateContractConverter : ProtobufConverter<MsgInstantiateContract> by
    MsgInstantiateContractJvmConverter

public actual object MsgInstantiateContractResponseConverter :
    ProtobufConverter<MsgInstantiateContractResponse> by MsgInstantiateContractResponseJvmConverter

public actual object MsgInstantiateContract2Converter : ProtobufConverter<MsgInstantiateContract2>
    by MsgInstantiateContract2JvmConverter

public actual object MsgInstantiateContract2ResponseConverter :
    ProtobufConverter<MsgInstantiateContract2Response> by
    MsgInstantiateContract2ResponseJvmConverter

public actual object MsgExecuteContractConverter : ProtobufConverter<MsgExecuteContract> by
    MsgExecuteContractJvmConverter

public actual object MsgExecuteContractResponseConverter :
    ProtobufConverter<MsgExecuteContractResponse> by MsgExecuteContractResponseJvmConverter

public actual object MsgMigrateContractConverter : ProtobufConverter<MsgMigrateContract> by
    MsgMigrateContractJvmConverter

public actual object MsgMigrateContractResponseConverter :
    ProtobufConverter<MsgMigrateContractResponse> by MsgMigrateContractResponseJvmConverter

public actual object MsgUpdateAdminConverter : ProtobufConverter<MsgUpdateAdmin> by
    MsgUpdateAdminJvmConverter

public actual object MsgUpdateAdminResponseConverter : ProtobufConverter<MsgUpdateAdminResponse> by
    MsgUpdateAdminResponseJvmConverter

public actual object MsgClearAdminConverter : ProtobufConverter<MsgClearAdmin> by
    MsgClearAdminJvmConverter

public actual object MsgClearAdminResponseConverter : ProtobufConverter<MsgClearAdminResponse> by
    MsgClearAdminResponseJvmConverter

public actual object MsgUpdateInstantiateConfigConverter :
    ProtobufConverter<MsgUpdateInstantiateConfig> by MsgUpdateInstantiateConfigJvmConverter

public actual object MsgUpdateInstantiateConfigResponseConverter :
    ProtobufConverter<MsgUpdateInstantiateConfigResponse> by
    MsgUpdateInstantiateConfigResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter

public actual object MsgSudoContractConverter : ProtobufConverter<MsgSudoContract> by
    MsgSudoContractJvmConverter

public actual object MsgSudoContractResponseConverter : ProtobufConverter<MsgSudoContractResponse>
    by MsgSudoContractResponseJvmConverter

public actual object MsgPinCodesConverter : ProtobufConverter<MsgPinCodes> by
    MsgPinCodesJvmConverter

public actual object MsgPinCodesResponseConverter : ProtobufConverter<MsgPinCodesResponse> by
    MsgPinCodesResponseJvmConverter

public actual object MsgUnpinCodesConverter : ProtobufConverter<MsgUnpinCodes> by
    MsgUnpinCodesJvmConverter

public actual object MsgUnpinCodesResponseConverter : ProtobufConverter<MsgUnpinCodesResponse> by
    MsgUnpinCodesResponseJvmConverter

public actual object MsgStoreAndInstantiateContractConverter :
    ProtobufConverter<MsgStoreAndInstantiateContract> by MsgStoreAndInstantiateContractJvmConverter

public actual object MsgStoreAndInstantiateContractResponseConverter :
    ProtobufConverter<MsgStoreAndInstantiateContractResponse> by
    MsgStoreAndInstantiateContractResponseJvmConverter
