// Transform from tendermint/types/params.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.DurationJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ConsensusParamsJvmConverter :
    ProtobufTypeMapper<ConsensusParams, Params.ConsensusParams> {
  public override val descriptor: Descriptors.Descriptor = Params.ConsensusParams.getDescriptor()

  public override val parser: Parser<Params.ConsensusParams> = Params.ConsensusParams.parser()

  public override fun convert(obj: Params.ConsensusParams): ConsensusParams = ConsensusParams(
  	block = BlockParamsJvmConverter.convert(obj.getBlock()),
  	evidence = EvidenceParamsJvmConverter.convert(obj.getEvidence()),
  	validator = ValidatorParamsJvmConverter.convert(obj.getValidator()),
  	version = VersionParamsJvmConverter.convert(obj.getVersion()),
  )

  public override fun convert(obj: ConsensusParams): Params.ConsensusParams {
    val builder = Params.ConsensusParams.newBuilder()
    builder.setBlock(BlockParamsJvmConverter.convert(obj.block))
    builder.setEvidence(EvidenceParamsJvmConverter.convert(obj.evidence))
    builder.setValidator(ValidatorParamsJvmConverter.convert(obj.validator))
    builder.setVersion(VersionParamsJvmConverter.convert(obj.version))
    return builder.build()
  }
}

public object BlockParamsJvmConverter : ProtobufTypeMapper<BlockParams, Params.BlockParams> {
  public override val descriptor: Descriptors.Descriptor = Params.BlockParams.getDescriptor()

  public override val parser: Parser<Params.BlockParams> = Params.BlockParams.parser()

  public override fun convert(obj: Params.BlockParams): BlockParams = BlockParams(
  	maxBytes = obj.getMaxBytes(),
  	maxGas = obj.getMaxGas(),
  )

  public override fun convert(obj: BlockParams): Params.BlockParams {
    val builder = Params.BlockParams.newBuilder()
    builder.setMaxBytes(obj.maxBytes)
    builder.setMaxGas(obj.maxGas)
    return builder.build()
  }
}

public object EvidenceParamsJvmConverter : ProtobufTypeMapper<EvidenceParams, Params.EvidenceParams>
    {
  public override val descriptor: Descriptors.Descriptor = Params.EvidenceParams.getDescriptor()

  public override val parser: Parser<Params.EvidenceParams> = Params.EvidenceParams.parser()

  public override fun convert(obj: Params.EvidenceParams): EvidenceParams = EvidenceParams(
  	maxAgeNumBlocks = obj.getMaxAgeNumBlocks(),
  	maxAgeDuration = DurationJvmConverter.convert(obj.getMaxAgeDuration()),
  	maxBytes = obj.getMaxBytes(),
  )

  public override fun convert(obj: EvidenceParams): Params.EvidenceParams {
    val builder = Params.EvidenceParams.newBuilder()
    builder.setMaxAgeNumBlocks(obj.maxAgeNumBlocks)
    builder.setMaxAgeDuration(DurationJvmConverter.convert(obj.maxAgeDuration))
    builder.setMaxBytes(obj.maxBytes)
    return builder.build()
  }
}

public object ValidatorParamsJvmConverter :
    ProtobufTypeMapper<ValidatorParams, Params.ValidatorParams> {
  public override val descriptor: Descriptors.Descriptor = Params.ValidatorParams.getDescriptor()

  public override val parser: Parser<Params.ValidatorParams> = Params.ValidatorParams.parser()

  public override fun convert(obj: Params.ValidatorParams): ValidatorParams = ValidatorParams(
  	pubKeyTypes = obj.getPubKeyTypesList().map { it },
  )

  public override fun convert(obj: ValidatorParams): Params.ValidatorParams {
    val builder = Params.ValidatorParams.newBuilder()
    builder.addAllPubKeyTypes(obj.pubKeyTypes.map { it })
    return builder.build()
  }
}

public object VersionParamsJvmConverter : ProtobufTypeMapper<VersionParams, Params.VersionParams> {
  public override val descriptor: Descriptors.Descriptor = Params.VersionParams.getDescriptor()

  public override val parser: Parser<Params.VersionParams> = Params.VersionParams.parser()

  public override fun convert(obj: Params.VersionParams): VersionParams = VersionParams(
  	app = obj.getApp().asKotlinType,
  )

  public override fun convert(obj: VersionParams): Params.VersionParams {
    val builder = Params.VersionParams.newBuilder()
    builder.setApp(obj.app.asJavaType)
    return builder.build()
  }
}

public object HashedParamsJvmConverter : ProtobufTypeMapper<HashedParams, Params.HashedParams> {
  public override val descriptor: Descriptors.Descriptor = Params.HashedParams.getDescriptor()

  public override val parser: Parser<Params.HashedParams> = Params.HashedParams.parser()

  public override fun convert(obj: Params.HashedParams): HashedParams = HashedParams(
  	blockMaxBytes = obj.getBlockMaxBytes(),
  	blockMaxGas = obj.getBlockMaxGas(),
  )

  public override fun convert(obj: HashedParams): Params.HashedParams {
    val builder = Params.HashedParams.newBuilder()
    builder.setBlockMaxBytes(obj.blockMaxBytes)
    builder.setBlockMaxGas(obj.blockMaxGas)
    return builder.build()
  }
}
