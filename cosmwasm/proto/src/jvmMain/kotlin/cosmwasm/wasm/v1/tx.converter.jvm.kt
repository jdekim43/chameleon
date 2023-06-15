// Transform from cosmwasm/wasm/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MsgStoreCodeJvmConverter : ProtobufTypeMapper<MsgStoreCode, Tx.MsgStoreCode> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgStoreCode.getDescriptor()

  public override val parser: Parser<Tx.MsgStoreCode> = Tx.MsgStoreCode.parser()

  public override fun convert(obj: Tx.MsgStoreCode): MsgStoreCode = MsgStoreCode(
  	sender = obj.getSender(),
  	wasmByteCode = obj.getWasmByteCode().toByteArray(),
  	instantiatePermission = AccessConfigJvmConverter.convert(obj.getInstantiatePermission()),
  )

  public override fun convert(obj: MsgStoreCode): Tx.MsgStoreCode {
    val builder = Tx.MsgStoreCode.newBuilder()
    builder.setSender(obj.sender)
    builder.setWasmByteCode(ByteString.copyFrom(obj.wasmByteCode))
    builder.setInstantiatePermission(AccessConfigJvmConverter.convert(obj.instantiatePermission))
    return builder.build()
  }
}

public object MsgStoreCodeResponseJvmConverter :
    ProtobufTypeMapper<MsgStoreCodeResponse, Tx.MsgStoreCodeResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgStoreCodeResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgStoreCodeResponse> = Tx.MsgStoreCodeResponse.parser()

  public override fun convert(obj: Tx.MsgStoreCodeResponse): MsgStoreCodeResponse =
      MsgStoreCodeResponse(
  	codeId = obj.getCodeId().asKotlinType,
  	checksum = obj.getChecksum().toByteArray(),
  )

  public override fun convert(obj: MsgStoreCodeResponse): Tx.MsgStoreCodeResponse {
    val builder = Tx.MsgStoreCodeResponse.newBuilder()
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setChecksum(ByteString.copyFrom(obj.checksum))
    return builder.build()
  }
}

public object MsgInstantiateContractJvmConverter :
    ProtobufTypeMapper<MsgInstantiateContract, Tx.MsgInstantiateContract> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgInstantiateContract.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantiateContract> = Tx.MsgInstantiateContract.parser()

  public override fun convert(obj: Tx.MsgInstantiateContract): MsgInstantiateContract =
      MsgInstantiateContract(
  	sender = obj.getSender(),
  	admin = obj.getAdmin(),
  	codeId = obj.getCodeId().asKotlinType,
  	label = obj.getLabel(),
  	msg = obj.getMsg().toByteArray(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgInstantiateContract): Tx.MsgInstantiateContract {
    val builder = Tx.MsgInstantiateContract.newBuilder()
    builder.setSender(obj.sender)
    builder.setAdmin(obj.admin)
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setLabel(obj.label)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    builder.addAllFunds(obj.funds.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgInstantiateContractResponseJvmConverter :
    ProtobufTypeMapper<MsgInstantiateContractResponse, Tx.MsgInstantiateContractResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgInstantiateContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantiateContractResponse> =
      Tx.MsgInstantiateContractResponse.parser()

  public override fun convert(obj: Tx.MsgInstantiateContractResponse):
      MsgInstantiateContractResponse = MsgInstantiateContractResponse(
  	address = obj.getAddress(),
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: MsgInstantiateContractResponse):
      Tx.MsgInstantiateContractResponse {
    val builder = Tx.MsgInstantiateContractResponse.newBuilder()
    builder.setAddress(obj.address)
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object MsgInstantiateContract2JvmConverter :
    ProtobufTypeMapper<MsgInstantiateContract2, Tx.MsgInstantiateContract2> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgInstantiateContract2.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantiateContract2> =
      Tx.MsgInstantiateContract2.parser()

  public override fun convert(obj: Tx.MsgInstantiateContract2): MsgInstantiateContract2 =
      MsgInstantiateContract2(
  	sender = obj.getSender(),
  	admin = obj.getAdmin(),
  	codeId = obj.getCodeId().asKotlinType,
  	label = obj.getLabel(),
  	msg = obj.getMsg().toByteArray(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  	salt = obj.getSalt().toByteArray(),
  	fixMsg = obj.getFixMsg(),
  )

  public override fun convert(obj: MsgInstantiateContract2): Tx.MsgInstantiateContract2 {
    val builder = Tx.MsgInstantiateContract2.newBuilder()
    builder.setSender(obj.sender)
    builder.setAdmin(obj.admin)
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setLabel(obj.label)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    builder.addAllFunds(obj.funds.map { CoinJvmConverter.convert(it) })
    builder.setSalt(ByteString.copyFrom(obj.salt))
    builder.setFixMsg(obj.fixMsg)
    return builder.build()
  }
}

public object MsgInstantiateContract2ResponseJvmConverter :
    ProtobufTypeMapper<MsgInstantiateContract2Response, Tx.MsgInstantiateContract2Response> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgInstantiateContract2Response.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantiateContract2Response> =
      Tx.MsgInstantiateContract2Response.parser()

  public override fun convert(obj: Tx.MsgInstantiateContract2Response):
      MsgInstantiateContract2Response = MsgInstantiateContract2Response(
  	address = obj.getAddress(),
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: MsgInstantiateContract2Response):
      Tx.MsgInstantiateContract2Response {
    val builder = Tx.MsgInstantiateContract2Response.newBuilder()
    builder.setAddress(obj.address)
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object MsgExecuteContractJvmConverter :
    ProtobufTypeMapper<MsgExecuteContract, Tx.MsgExecuteContract> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgExecuteContract.getDescriptor()

  public override val parser: Parser<Tx.MsgExecuteContract> = Tx.MsgExecuteContract.parser()

  public override fun convert(obj: Tx.MsgExecuteContract): MsgExecuteContract = MsgExecuteContract(
  	sender = obj.getSender(),
  	contract = obj.getContract(),
  	msg = obj.getMsg().toByteArray(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgExecuteContract): Tx.MsgExecuteContract {
    val builder = Tx.MsgExecuteContract.newBuilder()
    builder.setSender(obj.sender)
    builder.setContract(obj.contract)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    builder.addAllFunds(obj.funds.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgExecuteContractResponseJvmConverter :
    ProtobufTypeMapper<MsgExecuteContractResponse, Tx.MsgExecuteContractResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgExecuteContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgExecuteContractResponse> =
      Tx.MsgExecuteContractResponse.parser()

  public override fun convert(obj: Tx.MsgExecuteContractResponse): MsgExecuteContractResponse =
      MsgExecuteContractResponse(
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: MsgExecuteContractResponse): Tx.MsgExecuteContractResponse {
    val builder = Tx.MsgExecuteContractResponse.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object MsgMigrateContractJvmConverter :
    ProtobufTypeMapper<MsgMigrateContract, Tx.MsgMigrateContract> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgMigrateContract.getDescriptor()

  public override val parser: Parser<Tx.MsgMigrateContract> = Tx.MsgMigrateContract.parser()

  public override fun convert(obj: Tx.MsgMigrateContract): MsgMigrateContract = MsgMigrateContract(
  	sender = obj.getSender(),
  	contract = obj.getContract(),
  	codeId = obj.getCodeId().asKotlinType,
  	msg = obj.getMsg().toByteArray(),
  )

  public override fun convert(obj: MsgMigrateContract): Tx.MsgMigrateContract {
    val builder = Tx.MsgMigrateContract.newBuilder()
    builder.setSender(obj.sender)
    builder.setContract(obj.contract)
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    return builder.build()
  }
}

public object MsgMigrateContractResponseJvmConverter :
    ProtobufTypeMapper<MsgMigrateContractResponse, Tx.MsgMigrateContractResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgMigrateContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgMigrateContractResponse> =
      Tx.MsgMigrateContractResponse.parser()

  public override fun convert(obj: Tx.MsgMigrateContractResponse): MsgMigrateContractResponse =
      MsgMigrateContractResponse(
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: MsgMigrateContractResponse): Tx.MsgMigrateContractResponse {
    val builder = Tx.MsgMigrateContractResponse.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object MsgUpdateAdminJvmConverter : ProtobufTypeMapper<MsgUpdateAdmin, Tx.MsgUpdateAdmin> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateAdmin.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateAdmin> = Tx.MsgUpdateAdmin.parser()

  public override fun convert(obj: Tx.MsgUpdateAdmin): MsgUpdateAdmin = MsgUpdateAdmin(
  	sender = obj.getSender(),
  	newAdmin = obj.getNewAdmin(),
  	contract = obj.getContract(),
  )

  public override fun convert(obj: MsgUpdateAdmin): Tx.MsgUpdateAdmin {
    val builder = Tx.MsgUpdateAdmin.newBuilder()
    builder.setSender(obj.sender)
    builder.setNewAdmin(obj.newAdmin)
    builder.setContract(obj.contract)
    return builder.build()
  }
}

public object MsgUpdateAdminResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateAdminResponse, Tx.MsgUpdateAdminResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateAdminResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateAdminResponse> = Tx.MsgUpdateAdminResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateAdminResponse): MsgUpdateAdminResponse =
      MsgUpdateAdminResponse(
  )

  public override fun convert(obj: MsgUpdateAdminResponse): Tx.MsgUpdateAdminResponse {
    val builder = Tx.MsgUpdateAdminResponse.newBuilder()
    return builder.build()
  }
}

public object MsgClearAdminJvmConverter : ProtobufTypeMapper<MsgClearAdmin, Tx.MsgClearAdmin> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgClearAdmin.getDescriptor()

  public override val parser: Parser<Tx.MsgClearAdmin> = Tx.MsgClearAdmin.parser()

  public override fun convert(obj: Tx.MsgClearAdmin): MsgClearAdmin = MsgClearAdmin(
  	sender = obj.getSender(),
  	contract = obj.getContract(),
  )

  public override fun convert(obj: MsgClearAdmin): Tx.MsgClearAdmin {
    val builder = Tx.MsgClearAdmin.newBuilder()
    builder.setSender(obj.sender)
    builder.setContract(obj.contract)
    return builder.build()
  }
}

public object MsgClearAdminResponseJvmConverter :
    ProtobufTypeMapper<MsgClearAdminResponse, Tx.MsgClearAdminResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgClearAdminResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgClearAdminResponse> = Tx.MsgClearAdminResponse.parser()

  public override fun convert(obj: Tx.MsgClearAdminResponse): MsgClearAdminResponse =
      MsgClearAdminResponse(
  )

  public override fun convert(obj: MsgClearAdminResponse): Tx.MsgClearAdminResponse {
    val builder = Tx.MsgClearAdminResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateInstantiateConfigJvmConverter :
    ProtobufTypeMapper<MsgUpdateInstantiateConfig, Tx.MsgUpdateInstantiateConfig> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateInstantiateConfig.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateInstantiateConfig> =
      Tx.MsgUpdateInstantiateConfig.parser()

  public override fun convert(obj: Tx.MsgUpdateInstantiateConfig): MsgUpdateInstantiateConfig =
      MsgUpdateInstantiateConfig(
  	sender = obj.getSender(),
  	codeId = obj.getCodeId().asKotlinType,
  	newInstantiatePermission = AccessConfigJvmConverter.convert(obj.getNewInstantiatePermission()),
  )

  public override fun convert(obj: MsgUpdateInstantiateConfig): Tx.MsgUpdateInstantiateConfig {
    val builder = Tx.MsgUpdateInstantiateConfig.newBuilder()
    builder.setSender(obj.sender)
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setNewInstantiatePermission(AccessConfigJvmConverter.convert(obj.newInstantiatePermission))
    return builder.build()
  }
}

public object MsgUpdateInstantiateConfigResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateInstantiateConfigResponse, Tx.MsgUpdateInstantiateConfigResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateInstantiateConfigResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateInstantiateConfigResponse> =
      Tx.MsgUpdateInstantiateConfigResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateInstantiateConfigResponse):
      MsgUpdateInstantiateConfigResponse = MsgUpdateInstantiateConfigResponse(
  )

  public override fun convert(obj: MsgUpdateInstantiateConfigResponse):
      Tx.MsgUpdateInstantiateConfigResponse {
    val builder = Tx.MsgUpdateInstantiateConfigResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateParamsJvmConverter : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.getAuthority(),
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Tx.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParamsResponse> =
      Tx.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Tx.MsgUpdateParamsResponse {
    val builder = Tx.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}

public object MsgSudoContractJvmConverter : ProtobufTypeMapper<MsgSudoContract, Tx.MsgSudoContract>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSudoContract.getDescriptor()

  public override val parser: Parser<Tx.MsgSudoContract> = Tx.MsgSudoContract.parser()

  public override fun convert(obj: Tx.MsgSudoContract): MsgSudoContract = MsgSudoContract(
  	authority = obj.getAuthority(),
  	contract = obj.getContract(),
  	msg = obj.getMsg().toByteArray(),
  )

  public override fun convert(obj: MsgSudoContract): Tx.MsgSudoContract {
    val builder = Tx.MsgSudoContract.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setContract(obj.contract)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    return builder.build()
  }
}

public object MsgSudoContractResponseJvmConverter :
    ProtobufTypeMapper<MsgSudoContractResponse, Tx.MsgSudoContractResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgSudoContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSudoContractResponse> =
      Tx.MsgSudoContractResponse.parser()

  public override fun convert(obj: Tx.MsgSudoContractResponse): MsgSudoContractResponse =
      MsgSudoContractResponse(
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: MsgSudoContractResponse): Tx.MsgSudoContractResponse {
    val builder = Tx.MsgSudoContractResponse.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object MsgPinCodesJvmConverter : ProtobufTypeMapper<MsgPinCodes, Tx.MsgPinCodes> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgPinCodes.getDescriptor()

  public override val parser: Parser<Tx.MsgPinCodes> = Tx.MsgPinCodes.parser()

  public override fun convert(obj: Tx.MsgPinCodes): MsgPinCodes = MsgPinCodes(
  	authority = obj.getAuthority(),
  	codeIds = obj.getCodeIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: MsgPinCodes): Tx.MsgPinCodes {
    val builder = Tx.MsgPinCodes.newBuilder()
    builder.setAuthority(obj.authority)
    builder.addAllCodeIds(obj.codeIds.map { it.asJavaType })
    return builder.build()
  }
}

public object MsgPinCodesResponseJvmConverter :
    ProtobufTypeMapper<MsgPinCodesResponse, Tx.MsgPinCodesResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgPinCodesResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgPinCodesResponse> = Tx.MsgPinCodesResponse.parser()

  public override fun convert(obj: Tx.MsgPinCodesResponse): MsgPinCodesResponse =
      MsgPinCodesResponse(
  )

  public override fun convert(obj: MsgPinCodesResponse): Tx.MsgPinCodesResponse {
    val builder = Tx.MsgPinCodesResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUnpinCodesJvmConverter : ProtobufTypeMapper<MsgUnpinCodes, Tx.MsgUnpinCodes> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUnpinCodes.getDescriptor()

  public override val parser: Parser<Tx.MsgUnpinCodes> = Tx.MsgUnpinCodes.parser()

  public override fun convert(obj: Tx.MsgUnpinCodes): MsgUnpinCodes = MsgUnpinCodes(
  	authority = obj.getAuthority(),
  	codeIds = obj.getCodeIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: MsgUnpinCodes): Tx.MsgUnpinCodes {
    val builder = Tx.MsgUnpinCodes.newBuilder()
    builder.setAuthority(obj.authority)
    builder.addAllCodeIds(obj.codeIds.map { it.asJavaType })
    return builder.build()
  }
}

public object MsgUnpinCodesResponseJvmConverter :
    ProtobufTypeMapper<MsgUnpinCodesResponse, Tx.MsgUnpinCodesResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUnpinCodesResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUnpinCodesResponse> = Tx.MsgUnpinCodesResponse.parser()

  public override fun convert(obj: Tx.MsgUnpinCodesResponse): MsgUnpinCodesResponse =
      MsgUnpinCodesResponse(
  )

  public override fun convert(obj: MsgUnpinCodesResponse): Tx.MsgUnpinCodesResponse {
    val builder = Tx.MsgUnpinCodesResponse.newBuilder()
    return builder.build()
  }
}

public object MsgStoreAndInstantiateContractJvmConverter :
    ProtobufTypeMapper<MsgStoreAndInstantiateContract, Tx.MsgStoreAndInstantiateContract> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgStoreAndInstantiateContract.getDescriptor()

  public override val parser: Parser<Tx.MsgStoreAndInstantiateContract> =
      Tx.MsgStoreAndInstantiateContract.parser()

  public override fun convert(obj: Tx.MsgStoreAndInstantiateContract):
      MsgStoreAndInstantiateContract = MsgStoreAndInstantiateContract(
  	authority = obj.getAuthority(),
  	wasmByteCode = obj.getWasmByteCode().toByteArray(),
  	instantiatePermission = AccessConfigJvmConverter.convert(obj.getInstantiatePermission()),
  	unpinCode = obj.getUnpinCode(),
  	admin = obj.getAdmin(),
  	label = obj.getLabel(),
  	msg = obj.getMsg().toByteArray(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  	source = obj.getSource(),
  	builder = obj.getBuilder(),
  	codeHash = obj.getCodeHash().toByteArray(),
  )

  public override fun convert(obj: MsgStoreAndInstantiateContract):
      Tx.MsgStoreAndInstantiateContract {
    val builder = Tx.MsgStoreAndInstantiateContract.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setWasmByteCode(ByteString.copyFrom(obj.wasmByteCode))
    builder.setInstantiatePermission(AccessConfigJvmConverter.convert(obj.instantiatePermission))
    builder.setUnpinCode(obj.unpinCode)
    builder.setAdmin(obj.admin)
    builder.setLabel(obj.label)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    builder.addAllFunds(obj.funds.map { CoinJvmConverter.convert(it) })
    builder.setSource(obj.source)
    builder.setBuilder(obj.builder)
    builder.setCodeHash(ByteString.copyFrom(obj.codeHash))
    return builder.build()
  }
}

public object MsgStoreAndInstantiateContractResponseJvmConverter :
    ProtobufTypeMapper<MsgStoreAndInstantiateContractResponse, Tx.MsgStoreAndInstantiateContractResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgStoreAndInstantiateContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgStoreAndInstantiateContractResponse> =
      Tx.MsgStoreAndInstantiateContractResponse.parser()

  public override fun convert(obj: Tx.MsgStoreAndInstantiateContractResponse):
      MsgStoreAndInstantiateContractResponse = MsgStoreAndInstantiateContractResponse(
  	address = obj.getAddress(),
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: MsgStoreAndInstantiateContractResponse):
      Tx.MsgStoreAndInstantiateContractResponse {
    val builder = Tx.MsgStoreAndInstantiateContractResponse.newBuilder()
    builder.setAddress(obj.address)
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}
