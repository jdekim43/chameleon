// Transform from cosmwasm/wasm/v1/proposal.proto
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

public object StoreCodeProposalJvmConverter :
    ProtobufTypeMapper<StoreCodeProposal, Proposal.StoreCodeProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.StoreCodeProposal.getDescriptor()

  public override val parser: Parser<Proposal.StoreCodeProposal> =
      Proposal.StoreCodeProposal.parser()

  public override fun convert(obj: Proposal.StoreCodeProposal): StoreCodeProposal =
      StoreCodeProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	runAs = obj.getRunAs(),
  	wasmByteCode = obj.getWasmByteCode().toByteArray(),
  	instantiatePermission = AccessConfigJvmConverter.convert(obj.getInstantiatePermission()),
  	unpinCode = obj.getUnpinCode(),
  	source = obj.getSource(),
  	builder = obj.getBuilder(),
  	codeHash = obj.getCodeHash().toByteArray(),
  )

  public override fun convert(obj: StoreCodeProposal): Proposal.StoreCodeProposal {
    val builder = Proposal.StoreCodeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRunAs(obj.runAs)
    builder.setWasmByteCode(ByteString.copyFrom(obj.wasmByteCode))
    builder.setInstantiatePermission(AccessConfigJvmConverter.convert(obj.instantiatePermission))
    builder.setUnpinCode(obj.unpinCode)
    builder.setSource(obj.source)
    builder.setBuilder(obj.builder)
    builder.setCodeHash(ByteString.copyFrom(obj.codeHash))
    return builder.build()
  }
}

public object InstantiateContractProposalJvmConverter :
    ProtobufTypeMapper<InstantiateContractProposal, Proposal.InstantiateContractProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.InstantiateContractProposal.getDescriptor()

  public override val parser: Parser<Proposal.InstantiateContractProposal> =
      Proposal.InstantiateContractProposal.parser()

  public override fun convert(obj: Proposal.InstantiateContractProposal):
      InstantiateContractProposal = InstantiateContractProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	runAs = obj.getRunAs(),
  	admin = obj.getAdmin(),
  	codeId = obj.getCodeId().asKotlinType,
  	label = obj.getLabel(),
  	msg = obj.getMsg().toByteArray(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: InstantiateContractProposal):
      Proposal.InstantiateContractProposal {
    val builder = Proposal.InstantiateContractProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRunAs(obj.runAs)
    builder.setAdmin(obj.admin)
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setLabel(obj.label)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    builder.addAllFunds(obj.funds.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object InstantiateContract2ProposalJvmConverter :
    ProtobufTypeMapper<InstantiateContract2Proposal, Proposal.InstantiateContract2Proposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.InstantiateContract2Proposal.getDescriptor()

  public override val parser: Parser<Proposal.InstantiateContract2Proposal> =
      Proposal.InstantiateContract2Proposal.parser()

  public override fun convert(obj: Proposal.InstantiateContract2Proposal):
      InstantiateContract2Proposal = InstantiateContract2Proposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	runAs = obj.getRunAs(),
  	admin = obj.getAdmin(),
  	codeId = obj.getCodeId().asKotlinType,
  	label = obj.getLabel(),
  	msg = obj.getMsg().toByteArray(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  	salt = obj.getSalt().toByteArray(),
  	fixMsg = obj.getFixMsg(),
  )

  public override fun convert(obj: InstantiateContract2Proposal):
      Proposal.InstantiateContract2Proposal {
    val builder = Proposal.InstantiateContract2Proposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRunAs(obj.runAs)
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

public object MigrateContractProposalJvmConverter :
    ProtobufTypeMapper<MigrateContractProposal, Proposal.MigrateContractProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.MigrateContractProposal.getDescriptor()

  public override val parser: Parser<Proposal.MigrateContractProposal> =
      Proposal.MigrateContractProposal.parser()

  public override fun convert(obj: Proposal.MigrateContractProposal): MigrateContractProposal =
      MigrateContractProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	contract = obj.getContract(),
  	codeId = obj.getCodeId().asKotlinType,
  	msg = obj.getMsg().toByteArray(),
  )

  public override fun convert(obj: MigrateContractProposal): Proposal.MigrateContractProposal {
    val builder = Proposal.MigrateContractProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setContract(obj.contract)
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    return builder.build()
  }
}

public object SudoContractProposalJvmConverter :
    ProtobufTypeMapper<SudoContractProposal, Proposal.SudoContractProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.SudoContractProposal.getDescriptor()

  public override val parser: Parser<Proposal.SudoContractProposal> =
      Proposal.SudoContractProposal.parser()

  public override fun convert(obj: Proposal.SudoContractProposal): SudoContractProposal =
      SudoContractProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	contract = obj.getContract(),
  	msg = obj.getMsg().toByteArray(),
  )

  public override fun convert(obj: SudoContractProposal): Proposal.SudoContractProposal {
    val builder = Proposal.SudoContractProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setContract(obj.contract)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    return builder.build()
  }
}

public object ExecuteContractProposalJvmConverter :
    ProtobufTypeMapper<ExecuteContractProposal, Proposal.ExecuteContractProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.ExecuteContractProposal.getDescriptor()

  public override val parser: Parser<Proposal.ExecuteContractProposal> =
      Proposal.ExecuteContractProposal.parser()

  public override fun convert(obj: Proposal.ExecuteContractProposal): ExecuteContractProposal =
      ExecuteContractProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	runAs = obj.getRunAs(),
  	contract = obj.getContract(),
  	msg = obj.getMsg().toByteArray(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: ExecuteContractProposal): Proposal.ExecuteContractProposal {
    val builder = Proposal.ExecuteContractProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRunAs(obj.runAs)
    builder.setContract(obj.contract)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    builder.addAllFunds(obj.funds.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object UpdateAdminProposalJvmConverter :
    ProtobufTypeMapper<UpdateAdminProposal, Proposal.UpdateAdminProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.UpdateAdminProposal.getDescriptor()

  public override val parser: Parser<Proposal.UpdateAdminProposal> =
      Proposal.UpdateAdminProposal.parser()

  public override fun convert(obj: Proposal.UpdateAdminProposal): UpdateAdminProposal =
      UpdateAdminProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	newAdmin = obj.getNewAdmin(),
  	contract = obj.getContract(),
  )

  public override fun convert(obj: UpdateAdminProposal): Proposal.UpdateAdminProposal {
    val builder = Proposal.UpdateAdminProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setNewAdmin(obj.newAdmin)
    builder.setContract(obj.contract)
    return builder.build()
  }
}

public object ClearAdminProposalJvmConverter :
    ProtobufTypeMapper<ClearAdminProposal, Proposal.ClearAdminProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.ClearAdminProposal.getDescriptor()

  public override val parser: Parser<Proposal.ClearAdminProposal> =
      Proposal.ClearAdminProposal.parser()

  public override fun convert(obj: Proposal.ClearAdminProposal): ClearAdminProposal =
      ClearAdminProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	contract = obj.getContract(),
  )

  public override fun convert(obj: ClearAdminProposal): Proposal.ClearAdminProposal {
    val builder = Proposal.ClearAdminProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setContract(obj.contract)
    return builder.build()
  }
}

public object PinCodesProposalJvmConverter :
    ProtobufTypeMapper<PinCodesProposal, Proposal.PinCodesProposal> {
  public override val descriptor: Descriptors.Descriptor = Proposal.PinCodesProposal.getDescriptor()

  public override val parser: Parser<Proposal.PinCodesProposal> = Proposal.PinCodesProposal.parser()

  public override fun convert(obj: Proposal.PinCodesProposal): PinCodesProposal = PinCodesProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	codeIds = obj.getCodeIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: PinCodesProposal): Proposal.PinCodesProposal {
    val builder = Proposal.PinCodesProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllCodeIds(obj.codeIds.map { it.asJavaType })
    return builder.build()
  }
}

public object UnpinCodesProposalJvmConverter :
    ProtobufTypeMapper<UnpinCodesProposal, Proposal.UnpinCodesProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.UnpinCodesProposal.getDescriptor()

  public override val parser: Parser<Proposal.UnpinCodesProposal> =
      Proposal.UnpinCodesProposal.parser()

  public override fun convert(obj: Proposal.UnpinCodesProposal): UnpinCodesProposal =
      UnpinCodesProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	codeIds = obj.getCodeIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: UnpinCodesProposal): Proposal.UnpinCodesProposal {
    val builder = Proposal.UnpinCodesProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllCodeIds(obj.codeIds.map { it.asJavaType })
    return builder.build()
  }
}

public object AccessConfigUpdateJvmConverter :
    ProtobufTypeMapper<AccessConfigUpdate, Proposal.AccessConfigUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.AccessConfigUpdate.getDescriptor()

  public override val parser: Parser<Proposal.AccessConfigUpdate> =
      Proposal.AccessConfigUpdate.parser()

  public override fun convert(obj: Proposal.AccessConfigUpdate): AccessConfigUpdate =
      AccessConfigUpdate(
  	codeId = obj.getCodeId().asKotlinType,
  	instantiatePermission = AccessConfigJvmConverter.convert(obj.getInstantiatePermission()),
  )

  public override fun convert(obj: AccessConfigUpdate): Proposal.AccessConfigUpdate {
    val builder = Proposal.AccessConfigUpdate.newBuilder()
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setInstantiatePermission(AccessConfigJvmConverter.convert(obj.instantiatePermission))
    return builder.build()
  }
}

public object UpdateInstantiateConfigProposalJvmConverter :
    ProtobufTypeMapper<UpdateInstantiateConfigProposal, Proposal.UpdateInstantiateConfigProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.UpdateInstantiateConfigProposal.getDescriptor()

  public override val parser: Parser<Proposal.UpdateInstantiateConfigProposal> =
      Proposal.UpdateInstantiateConfigProposal.parser()

  public override fun convert(obj: Proposal.UpdateInstantiateConfigProposal):
      UpdateInstantiateConfigProposal = UpdateInstantiateConfigProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	accessConfigUpdates = obj.getAccessConfigUpdatesList().map {
      AccessConfigUpdateJvmConverter.convert(it) },
  )

  public override fun convert(obj: UpdateInstantiateConfigProposal):
      Proposal.UpdateInstantiateConfigProposal {
    val builder = Proposal.UpdateInstantiateConfigProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllAccessConfigUpdates(obj.accessConfigUpdates.map {
        AccessConfigUpdateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object StoreAndInstantiateContractProposalJvmConverter :
    ProtobufTypeMapper<StoreAndInstantiateContractProposal, Proposal.StoreAndInstantiateContractProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.StoreAndInstantiateContractProposal.getDescriptor()

  public override val parser: Parser<Proposal.StoreAndInstantiateContractProposal> =
      Proposal.StoreAndInstantiateContractProposal.parser()

  public override fun convert(obj: Proposal.StoreAndInstantiateContractProposal):
      StoreAndInstantiateContractProposal = StoreAndInstantiateContractProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	runAs = obj.getRunAs(),
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

  public override fun convert(obj: StoreAndInstantiateContractProposal):
      Proposal.StoreAndInstantiateContractProposal {
    val builder = Proposal.StoreAndInstantiateContractProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRunAs(obj.runAs)
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
