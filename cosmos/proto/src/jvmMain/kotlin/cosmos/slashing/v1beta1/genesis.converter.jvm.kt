// Transform from cosmos/slashing/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	signingInfos = obj.getSigningInfosList().map { SigningInfoJvmConverter.convert(it) },
  	missedBlocks = obj.getMissedBlocksList().map { ValidatorMissedBlocksJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllSigningInfos(obj.signingInfos.map { SigningInfoJvmConverter.convert(it) })
    builder.addAllMissedBlocks(obj.missedBlocks.map { ValidatorMissedBlocksJvmConverter.convert(it)
        })
    return builder.build()
  }
}

public object SigningInfoJvmConverter : ProtobufTypeMapper<SigningInfo, Genesis.SigningInfo> {
  public override val descriptor: Descriptors.Descriptor = Genesis.SigningInfo.getDescriptor()

  public override val parser: Parser<Genesis.SigningInfo> = Genesis.SigningInfo.parser()

  public override fun convert(obj: Genesis.SigningInfo): SigningInfo = SigningInfo(
  	address = obj.getAddress(),
  	validatorSigningInfo = ValidatorSigningInfoJvmConverter.convert(obj.getValidatorSigningInfo()),
  )

  public override fun convert(obj: SigningInfo): Genesis.SigningInfo {
    val builder = Genesis.SigningInfo.newBuilder()
    builder.setAddress(obj.address)
    builder.setValidatorSigningInfo(ValidatorSigningInfoJvmConverter.convert(obj.validatorSigningInfo))
    return builder.build()
  }
}

public object ValidatorMissedBlocksJvmConverter :
    ProtobufTypeMapper<ValidatorMissedBlocks, Genesis.ValidatorMissedBlocks> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorMissedBlocks.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorMissedBlocks> =
      Genesis.ValidatorMissedBlocks.parser()

  public override fun convert(obj: Genesis.ValidatorMissedBlocks): ValidatorMissedBlocks =
      ValidatorMissedBlocks(
  	address = obj.getAddress(),
  	missedBlocks = obj.getMissedBlocksList().map { MissedBlockJvmConverter.convert(it) },
  )

  public override fun convert(obj: ValidatorMissedBlocks): Genesis.ValidatorMissedBlocks {
    val builder = Genesis.ValidatorMissedBlocks.newBuilder()
    builder.setAddress(obj.address)
    builder.addAllMissedBlocks(obj.missedBlocks.map { MissedBlockJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MissedBlockJvmConverter : ProtobufTypeMapper<MissedBlock, Genesis.MissedBlock> {
  public override val descriptor: Descriptors.Descriptor = Genesis.MissedBlock.getDescriptor()

  public override val parser: Parser<Genesis.MissedBlock> = Genesis.MissedBlock.parser()

  public override fun convert(obj: Genesis.MissedBlock): MissedBlock = MissedBlock(
  	index = obj.getIndex(),
  	missed = obj.getMissed(),
  )

  public override fun convert(obj: MissedBlock): Genesis.MissedBlock {
    val builder = Genesis.MissedBlock.newBuilder()
    builder.setIndex(obj.index)
    builder.setMissed(obj.missed)
    return builder.build()
  }
}
