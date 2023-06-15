// Transform from cosmos/base/tendermint/v1beta1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.tendermint.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.types.BlockIDJvmConverter
import tendermint.types.CommitJvmConverter
import tendermint.types.DataJvmConverter
import tendermint.types.EvidenceListJvmConverter
import tendermint.version.ConsensusJvmConverter

public object BlockJvmConverter : ProtobufTypeMapper<Block, Types.Block> {
  public override val descriptor: Descriptors.Descriptor = Types.Block.getDescriptor()

  public override val parser: Parser<Types.Block> = Types.Block.parser()

  public override fun convert(obj: Types.Block): Block = Block(
  	`header` = HeaderJvmConverter.convert(obj.getHeader()),
  	`data` = DataJvmConverter.convert(obj.getData()),
  	evidence = EvidenceListJvmConverter.convert(obj.getEvidence()),
  	lastCommit = CommitJvmConverter.convert(obj.getLastCommit()),
  )

  public override fun convert(obj: Block): Types.Block {
    val builder = Types.Block.newBuilder()
    builder.setHeader(HeaderJvmConverter.convert(obj.`header`))
    builder.setData(DataJvmConverter.convert(obj.`data`))
    builder.setEvidence(EvidenceListJvmConverter.convert(obj.evidence))
    builder.setLastCommit(CommitJvmConverter.convert(obj.lastCommit))
    return builder.build()
  }
}

public object HeaderJvmConverter : ProtobufTypeMapper<Header, Types.Header> {
  public override val descriptor: Descriptors.Descriptor = Types.Header.getDescriptor()

  public override val parser: Parser<Types.Header> = Types.Header.parser()

  public override fun convert(obj: Types.Header): Header = Header(
  	version = ConsensusJvmConverter.convert(obj.getVersion()),
  	chainId = obj.getChainId(),
  	height = obj.getHeight(),
  	time = TimestampJvmConverter.convert(obj.getTime()),
  	lastBlockId = BlockIDJvmConverter.convert(obj.getLastBlockId()),
  	lastCommitHash = obj.getLastCommitHash().toByteArray(),
  	dataHash = obj.getDataHash().toByteArray(),
  	validatorsHash = obj.getValidatorsHash().toByteArray(),
  	nextValidatorsHash = obj.getNextValidatorsHash().toByteArray(),
  	consensusHash = obj.getConsensusHash().toByteArray(),
  	appHash = obj.getAppHash().toByteArray(),
  	lastResultsHash = obj.getLastResultsHash().toByteArray(),
  	evidenceHash = obj.getEvidenceHash().toByteArray(),
  	proposerAddress = obj.getProposerAddress(),
  )

  public override fun convert(obj: Header): Types.Header {
    val builder = Types.Header.newBuilder()
    builder.setVersion(ConsensusJvmConverter.convert(obj.version))
    builder.setChainId(obj.chainId)
    builder.setHeight(obj.height)
    builder.setTime(TimestampJvmConverter.convert(obj.time))
    builder.setLastBlockId(BlockIDJvmConverter.convert(obj.lastBlockId))
    builder.setLastCommitHash(ByteString.copyFrom(obj.lastCommitHash))
    builder.setDataHash(ByteString.copyFrom(obj.dataHash))
    builder.setValidatorsHash(ByteString.copyFrom(obj.validatorsHash))
    builder.setNextValidatorsHash(ByteString.copyFrom(obj.nextValidatorsHash))
    builder.setConsensusHash(ByteString.copyFrom(obj.consensusHash))
    builder.setAppHash(ByteString.copyFrom(obj.appHash))
    builder.setLastResultsHash(ByteString.copyFrom(obj.lastResultsHash))
    builder.setEvidenceHash(ByteString.copyFrom(obj.evidenceHash))
    builder.setProposerAddress(obj.proposerAddress)
    return builder.build()
  }
}
