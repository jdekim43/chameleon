// Transform from cosmwasm/wasm/v1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object AccessTypeParamJvmConverter :
    ProtobufTypeMapper<AccessTypeParam, Types.AccessTypeParam> {
  public override val descriptor: Descriptors.Descriptor = Types.AccessTypeParam.getDescriptor()

  public override val parser: Parser<Types.AccessTypeParam> = Types.AccessTypeParam.parser()

  public override fun convert(obj: Types.AccessTypeParam): AccessTypeParam = AccessTypeParam(
  	`value` = AccessType.forNumber(obj.getValue().number),
  )

  public override fun convert(obj: AccessTypeParam): Types.AccessTypeParam {
    val builder = Types.AccessTypeParam.newBuilder()
    builder.setValue(Types.AccessType.forNumber(obj.`value`.number))
    return builder.build()
  }
}

public object AccessConfigJvmConverter : ProtobufTypeMapper<AccessConfig, Types.AccessConfig> {
  public override val descriptor: Descriptors.Descriptor = Types.AccessConfig.getDescriptor()

  public override val parser: Parser<Types.AccessConfig> = Types.AccessConfig.parser()

  public override fun convert(obj: Types.AccessConfig): AccessConfig = AccessConfig(
  	permission = AccessType.forNumber(obj.getPermission().number),
  	address = obj.getAddress(),
  	addresses = obj.getAddressesList().map { it },
  )

  public override fun convert(obj: AccessConfig): Types.AccessConfig {
    val builder = Types.AccessConfig.newBuilder()
    builder.setPermission(Types.AccessType.forNumber(obj.permission.number))
    builder.setAddress(obj.address)
    builder.addAllAddresses(obj.addresses.map { it })
    return builder.build()
  }
}

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Types.Params> {
  public override val descriptor: Descriptors.Descriptor = Types.Params.getDescriptor()

  public override val parser: Parser<Types.Params> = Types.Params.parser()

  public override fun convert(obj: Types.Params): Params = Params(
  	codeUploadAccess = AccessConfigJvmConverter.convert(obj.getCodeUploadAccess()),
  	instantiateDefaultPermission =
      AccessType.forNumber(obj.getInstantiateDefaultPermission().number),
  )

  public override fun convert(obj: Params): Types.Params {
    val builder = Types.Params.newBuilder()
    builder.setCodeUploadAccess(AccessConfigJvmConverter.convert(obj.codeUploadAccess))
    builder.setInstantiateDefaultPermission(Types.AccessType.forNumber(obj.instantiateDefaultPermission.number))
    return builder.build()
  }
}

public object CodeInfoJvmConverter : ProtobufTypeMapper<CodeInfo, Types.CodeInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.CodeInfo.getDescriptor()

  public override val parser: Parser<Types.CodeInfo> = Types.CodeInfo.parser()

  public override fun convert(obj: Types.CodeInfo): CodeInfo = CodeInfo(
  	codeHash = obj.getCodeHash().toByteArray(),
  	creator = obj.getCreator(),
  	instantiateConfig = AccessConfigJvmConverter.convert(obj.getInstantiateConfig()),
  )

  public override fun convert(obj: CodeInfo): Types.CodeInfo {
    val builder = Types.CodeInfo.newBuilder()
    builder.setCodeHash(ByteString.copyFrom(obj.codeHash))
    builder.setCreator(obj.creator)
    builder.setInstantiateConfig(AccessConfigJvmConverter.convert(obj.instantiateConfig))
    return builder.build()
  }
}

public object ContractInfoJvmConverter : ProtobufTypeMapper<ContractInfo, Types.ContractInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.ContractInfo.getDescriptor()

  public override val parser: Parser<Types.ContractInfo> = Types.ContractInfo.parser()

  public override fun convert(obj: Types.ContractInfo): ContractInfo = ContractInfo(
  	codeId = obj.getCodeId().asKotlinType,
  	creator = obj.getCreator(),
  	admin = obj.getAdmin(),
  	label = obj.getLabel(),
  	created = AbsoluteTxPositionJvmConverter.convert(obj.getCreated()),
  	ibcPortId = obj.getIbcPortId(),
  	extension = AnyJvmConverter.convert(obj.getExtension()),
  )

  public override fun convert(obj: ContractInfo): Types.ContractInfo {
    val builder = Types.ContractInfo.newBuilder()
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setCreator(obj.creator)
    builder.setAdmin(obj.admin)
    builder.setLabel(obj.label)
    builder.setCreated(AbsoluteTxPositionJvmConverter.convert(obj.created))
    builder.setIbcPortId(obj.ibcPortId)
    builder.setExtension(AnyJvmConverter.convert(obj.extension))
    return builder.build()
  }
}

public object ContractCodeHistoryEntryJvmConverter :
    ProtobufTypeMapper<ContractCodeHistoryEntry, Types.ContractCodeHistoryEntry> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ContractCodeHistoryEntry.getDescriptor()

  public override val parser: Parser<Types.ContractCodeHistoryEntry> =
      Types.ContractCodeHistoryEntry.parser()

  public override fun convert(obj: Types.ContractCodeHistoryEntry): ContractCodeHistoryEntry =
      ContractCodeHistoryEntry(
  	operation = ContractCodeHistoryOperationType.forNumber(obj.getOperation().number),
  	codeId = obj.getCodeId().asKotlinType,
  	updated = AbsoluteTxPositionJvmConverter.convert(obj.getUpdated()),
  	msg = obj.getMsg().toByteArray(),
  )

  public override fun convert(obj: ContractCodeHistoryEntry): Types.ContractCodeHistoryEntry {
    val builder = Types.ContractCodeHistoryEntry.newBuilder()
    builder.setOperation(Types.ContractCodeHistoryOperationType.forNumber(obj.operation.number))
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setUpdated(AbsoluteTxPositionJvmConverter.convert(obj.updated))
    builder.setMsg(ByteString.copyFrom(obj.msg))
    return builder.build()
  }
}

public object AbsoluteTxPositionJvmConverter :
    ProtobufTypeMapper<AbsoluteTxPosition, Types.AbsoluteTxPosition> {
  public override val descriptor: Descriptors.Descriptor = Types.AbsoluteTxPosition.getDescriptor()

  public override val parser: Parser<Types.AbsoluteTxPosition> = Types.AbsoluteTxPosition.parser()

  public override fun convert(obj: Types.AbsoluteTxPosition): AbsoluteTxPosition =
      AbsoluteTxPosition(
  	blockHeight = obj.getBlockHeight().asKotlinType,
  	txIndex = obj.getTxIndex().asKotlinType,
  )

  public override fun convert(obj: AbsoluteTxPosition): Types.AbsoluteTxPosition {
    val builder = Types.AbsoluteTxPosition.newBuilder()
    builder.setBlockHeight(obj.blockHeight.asJavaType)
    builder.setTxIndex(obj.txIndex.asJavaType)
    return builder.build()
  }
}

public object ModelJvmConverter : ProtobufTypeMapper<Model, Types.Model> {
  public override val descriptor: Descriptors.Descriptor = Types.Model.getDescriptor()

  public override val parser: Parser<Types.Model> = Types.Model.parser()

  public override fun convert(obj: Types.Model): Model = Model(
  	key = obj.getKey().toByteArray(),
  	`value` = obj.getValue().toByteArray(),
  )

  public override fun convert(obj: Model): Types.Model {
    val builder = Types.Model.newBuilder()
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    return builder.build()
  }
}
