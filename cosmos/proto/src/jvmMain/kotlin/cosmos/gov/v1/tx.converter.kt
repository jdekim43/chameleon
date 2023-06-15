// Transform from cosmos/gov/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgSubmitProposalConverter : ProtobufConverter<MsgSubmitProposal> by
    MsgSubmitProposalJvmConverter

public actual object MsgSubmitProposalResponseConverter :
    ProtobufConverter<MsgSubmitProposalResponse> by MsgSubmitProposalResponseJvmConverter

public actual object MsgExecLegacyContentConverter : ProtobufConverter<MsgExecLegacyContent> by
    MsgExecLegacyContentJvmConverter

public actual object MsgExecLegacyContentResponseConverter :
    ProtobufConverter<MsgExecLegacyContentResponse> by MsgExecLegacyContentResponseJvmConverter

public actual object MsgVoteConverter : ProtobufConverter<MsgVote> by MsgVoteJvmConverter

public actual object MsgVoteResponseConverter : ProtobufConverter<MsgVoteResponse> by
    MsgVoteResponseJvmConverter

public actual object MsgVoteWeightedConverter : ProtobufConverter<MsgVoteWeighted> by
    MsgVoteWeightedJvmConverter

public actual object MsgVoteWeightedResponseConverter : ProtobufConverter<MsgVoteWeightedResponse>
    by MsgVoteWeightedResponseJvmConverter

public actual object MsgDepositConverter : ProtobufConverter<MsgDeposit> by MsgDepositJvmConverter

public actual object MsgDepositResponseConverter : ProtobufConverter<MsgDepositResponse> by
    MsgDepositResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter
