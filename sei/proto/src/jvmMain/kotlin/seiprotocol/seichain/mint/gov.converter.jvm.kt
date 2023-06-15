// Transform from mint/v1beta1/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object UpdateMinterProposalJvmConverter :
    ProtobufTypeMapper<UpdateMinterProposal, Gov.UpdateMinterProposal> {
  public override val descriptor: Descriptors.Descriptor = Gov.UpdateMinterProposal.getDescriptor()

  public override val parser: Parser<Gov.UpdateMinterProposal> = Gov.UpdateMinterProposal.parser()

  public override fun convert(obj: Gov.UpdateMinterProposal): UpdateMinterProposal =
      UpdateMinterProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	minter = MinterJvmConverter.convert(obj.getMinter()),
  )

  public override fun convert(obj: UpdateMinterProposal): Gov.UpdateMinterProposal {
    val builder = Gov.UpdateMinterProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setMinter(MinterJvmConverter.convert(obj.minter))
    return builder.build()
  }
}
