// Transform from alliance/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgCreateAllianceProposalConverter :
    ProtobufConverter<MsgCreateAllianceProposal> by MsgCreateAllianceProposalJvmConverter

public actual object MsgUpdateAllianceProposalConverter :
    ProtobufConverter<MsgUpdateAllianceProposal> by MsgUpdateAllianceProposalJvmConverter

public actual object MsgDeleteAllianceProposalConverter :
    ProtobufConverter<MsgDeleteAllianceProposal> by MsgDeleteAllianceProposalJvmConverter
