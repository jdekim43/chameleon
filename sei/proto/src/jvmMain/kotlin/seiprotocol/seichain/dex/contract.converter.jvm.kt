// Transform from dex/contract.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ContractInfoJvmConverter : ProtobufTypeMapper<ContractInfo, Contract.ContractInfo> {
  public override val descriptor: Descriptors.Descriptor = Contract.ContractInfo.getDescriptor()

  public override val parser: Parser<Contract.ContractInfo> = Contract.ContractInfo.parser()

  public override fun convert(obj: Contract.ContractInfo): ContractInfo = ContractInfo(
  	codeId = obj.getCodeId().asKotlinType,
  	contractAddr = obj.getContractAddr(),
  	needHook = obj.getNeedHook(),
  	needOrderMatching = obj.getNeedOrderMatching(),
  	dependencies = obj.getDependenciesList().map { ContractDependencyInfoJvmConverter.convert(it) },
  	numIncomingDependencies = obj.getNumIncomingDependencies(),
  )

  public override fun convert(obj: ContractInfo): Contract.ContractInfo {
    val builder = Contract.ContractInfo.newBuilder()
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setContractAddr(obj.contractAddr)
    builder.setNeedHook(obj.needHook)
    builder.setNeedOrderMatching(obj.needOrderMatching)
    builder.addAllDependencies(obj.dependencies.map { ContractDependencyInfoJvmConverter.convert(it)
        })
    builder.setNumIncomingDependencies(obj.numIncomingDependencies)
    return builder.build()
  }
}

public object ContractInfoV2JvmConverter :
    ProtobufTypeMapper<ContractInfoV2, Contract.ContractInfoV2> {
  public override val descriptor: Descriptors.Descriptor = Contract.ContractInfoV2.getDescriptor()

  public override val parser: Parser<Contract.ContractInfoV2> = Contract.ContractInfoV2.parser()

  public override fun convert(obj: Contract.ContractInfoV2): ContractInfoV2 = ContractInfoV2(
  	codeId = obj.getCodeId().asKotlinType,
  	contractAddr = obj.getContractAddr(),
  	needHook = obj.getNeedHook(),
  	needOrderMatching = obj.getNeedOrderMatching(),
  	dependencies = obj.getDependenciesList().map { ContractDependencyInfoJvmConverter.convert(it) },
  	numIncomingDependencies = obj.getNumIncomingDependencies(),
  	creator = obj.getCreator(),
  	rentBalance = obj.getRentBalance().asKotlinType,
  	suspended = obj.getSuspended(),
  	suspensionReason = obj.getSuspensionReason(),
  )

  public override fun convert(obj: ContractInfoV2): Contract.ContractInfoV2 {
    val builder = Contract.ContractInfoV2.newBuilder()
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setContractAddr(obj.contractAddr)
    builder.setNeedHook(obj.needHook)
    builder.setNeedOrderMatching(obj.needOrderMatching)
    builder.addAllDependencies(obj.dependencies.map { ContractDependencyInfoJvmConverter.convert(it)
        })
    builder.setNumIncomingDependencies(obj.numIncomingDependencies)
    builder.setCreator(obj.creator)
    builder.setRentBalance(obj.rentBalance.asJavaType)
    builder.setSuspended(obj.suspended)
    builder.setSuspensionReason(obj.suspensionReason)
    return builder.build()
  }
}

public object ContractDependencyInfoJvmConverter :
    ProtobufTypeMapper<ContractDependencyInfo, Contract.ContractDependencyInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Contract.ContractDependencyInfo.getDescriptor()

  public override val parser: Parser<Contract.ContractDependencyInfo> =
      Contract.ContractDependencyInfo.parser()

  public override fun convert(obj: Contract.ContractDependencyInfo): ContractDependencyInfo =
      ContractDependencyInfo(
  	dependency = obj.getDependency(),
  	immediateElderSibling = obj.getImmediateElderSibling(),
  	immediateYoungerSibling = obj.getImmediateYoungerSibling(),
  )

  public override fun convert(obj: ContractDependencyInfo): Contract.ContractDependencyInfo {
    val builder = Contract.ContractDependencyInfo.newBuilder()
    builder.setDependency(obj.dependency)
    builder.setImmediateElderSibling(obj.immediateElderSibling)
    builder.setImmediateYoungerSibling(obj.immediateYoungerSibling)
    return builder.build()
  }
}

public object LegacyContractInfoJvmConverter :
    ProtobufTypeMapper<LegacyContractInfo, Contract.LegacyContractInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Contract.LegacyContractInfo.getDescriptor()

  public override val parser: Parser<Contract.LegacyContractInfo> =
      Contract.LegacyContractInfo.parser()

  public override fun convert(obj: Contract.LegacyContractInfo): LegacyContractInfo =
      LegacyContractInfo(
  	codeId = obj.getCodeId().asKotlinType,
  	contractAddr = obj.getContractAddr(),
  	needHook = obj.getNeedHook(),
  	needOrderMatching = obj.getNeedOrderMatching(),
  	dependentContractAddrs = obj.getDependentContractAddrsList().map { it },
  )

  public override fun convert(obj: LegacyContractInfo): Contract.LegacyContractInfo {
    val builder = Contract.LegacyContractInfo.newBuilder()
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setContractAddr(obj.contractAddr)
    builder.setNeedHook(obj.needHook)
    builder.setNeedOrderMatching(obj.needOrderMatching)
    builder.addAllDependentContractAddrs(obj.dependentContractAddrs.map { it })
    return builder.build()
  }
}
