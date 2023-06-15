// Transform from tendermint/types/block.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object BlockJvmConverter : ProtobufTypeMapper<Block, BlockOuterClass.Block> {
  public override val descriptor: Descriptors.Descriptor = BlockOuterClass.Block.getDescriptor()

  public override val parser: Parser<BlockOuterClass.Block> = BlockOuterClass.Block.parser()

  public override fun convert(obj: BlockOuterClass.Block): Block = Block(
  	`header` = HeaderJvmConverter.convert(obj.getHeader()),
  	`data` = DataJvmConverter.convert(obj.getData()),
  	evidence = EvidenceListJvmConverter.convert(obj.getEvidence()),
  	lastCommit = CommitJvmConverter.convert(obj.getLastCommit()),
  )

  public override fun convert(obj: Block): BlockOuterClass.Block {
    val builder = BlockOuterClass.Block.newBuilder()
    builder.setHeader(HeaderJvmConverter.convert(obj.`header`))
    builder.setData(DataJvmConverter.convert(obj.`data`))
    builder.setEvidence(EvidenceListJvmConverter.convert(obj.evidence))
    builder.setLastCommit(CommitJvmConverter.convert(obj.lastCommit))
    return builder.build()
  }
}
