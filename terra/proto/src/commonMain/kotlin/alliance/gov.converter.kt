// Transform from alliance/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgCreateAllianceProposalConverter :
    ProtobufConverter<MsgCreateAllianceProposal>

public fun MsgCreateAllianceProposal.toAny(): Any = Any(MsgCreateAllianceProposal.TYPE_URL,
    with(MsgCreateAllianceProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateAllianceProposal>):
    MsgCreateAllianceProposal {
  if (typeUrl != MsgCreateAllianceProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateAllianceProposalConverter :
    ProtobufConverter<MsgUpdateAllianceProposal>

public fun MsgUpdateAllianceProposal.toAny(): Any = Any(MsgUpdateAllianceProposal.TYPE_URL,
    with(MsgUpdateAllianceProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateAllianceProposal>):
    MsgUpdateAllianceProposal {
  if (typeUrl != MsgUpdateAllianceProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDeleteAllianceProposalConverter :
    ProtobufConverter<MsgDeleteAllianceProposal>

public fun MsgDeleteAllianceProposal.toAny(): Any = Any(MsgDeleteAllianceProposal.TYPE_URL,
    with(MsgDeleteAllianceProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDeleteAllianceProposal>):
    MsgDeleteAllianceProposal {
  if (typeUrl != MsgDeleteAllianceProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
