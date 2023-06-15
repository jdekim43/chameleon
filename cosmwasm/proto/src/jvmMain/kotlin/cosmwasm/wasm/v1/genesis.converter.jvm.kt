// Transform from cosmwasm/wasm/v1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	codes = obj.getCodesList().map { CodeJvmConverter.convert(it) },
  	contracts = obj.getContractsList().map { ContractJvmConverter.convert(it) },
  	sequences = obj.getSequencesList().map { SequenceJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllCodes(obj.codes.map { CodeJvmConverter.convert(it) })
    builder.addAllContracts(obj.contracts.map { ContractJvmConverter.convert(it) })
    builder.addAllSequences(obj.sequences.map { SequenceJvmConverter.convert(it) })
    return builder.build()
  }
}

public object CodeJvmConverter : ProtobufTypeMapper<Code, Genesis.Code> {
  public override val descriptor: Descriptors.Descriptor = Genesis.Code.getDescriptor()

  public override val parser: Parser<Genesis.Code> = Genesis.Code.parser()

  public override fun convert(obj: Genesis.Code): Code = Code(
  	codeId = obj.getCodeId().asKotlinType,
  	codeInfo = CodeInfoJvmConverter.convert(obj.getCodeInfo()),
  	codeBytes = obj.getCodeBytes().toByteArray(),
  	pinned = obj.getPinned(),
  )

  public override fun convert(obj: Code): Genesis.Code {
    val builder = Genesis.Code.newBuilder()
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setCodeInfo(CodeInfoJvmConverter.convert(obj.codeInfo))
    builder.setCodeBytes(ByteString.copyFrom(obj.codeBytes))
    builder.setPinned(obj.pinned)
    return builder.build()
  }
}

public object ContractJvmConverter : ProtobufTypeMapper<Contract, Genesis.Contract> {
  public override val descriptor: Descriptors.Descriptor = Genesis.Contract.getDescriptor()

  public override val parser: Parser<Genesis.Contract> = Genesis.Contract.parser()

  public override fun convert(obj: Genesis.Contract): Contract = Contract(
  	contractAddress = obj.getContractAddress(),
  	contractInfo = ContractInfoJvmConverter.convert(obj.getContractInfo()),
  	contractState = obj.getContractStateList().map { ModelJvmConverter.convert(it) },
  	contractCodeHistory = obj.getContractCodeHistoryList().map {
      ContractCodeHistoryEntryJvmConverter.convert(it) },
  )

  public override fun convert(obj: Contract): Genesis.Contract {
    val builder = Genesis.Contract.newBuilder()
    builder.setContractAddress(obj.contractAddress)
    builder.setContractInfo(ContractInfoJvmConverter.convert(obj.contractInfo))
    builder.addAllContractState(obj.contractState.map { ModelJvmConverter.convert(it) })
    builder.addAllContractCodeHistory(obj.contractCodeHistory.map {
        ContractCodeHistoryEntryJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SequenceJvmConverter : ProtobufTypeMapper<Sequence, Genesis.Sequence> {
  public override val descriptor: Descriptors.Descriptor = Genesis.Sequence.getDescriptor()

  public override val parser: Parser<Genesis.Sequence> = Genesis.Sequence.parser()

  public override fun convert(obj: Genesis.Sequence): Sequence = Sequence(
  	idKey = obj.getIdKey().toByteArray(),
  	`value` = obj.getValue().asKotlinType,
  )

  public override fun convert(obj: Sequence): Genesis.Sequence {
    val builder = Genesis.Sequence.newBuilder()
    builder.setIdKey(ByteString.copyFrom(obj.idKey))
    builder.setValue(obj.`value`.asJavaType)
    return builder.build()
  }
}
