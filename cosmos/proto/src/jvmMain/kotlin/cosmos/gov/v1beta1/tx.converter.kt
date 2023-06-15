// Transform from cosmos/gov/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgSubmitProposalConverter : ProtobufConverter<MsgSubmitProposal> by
    MsgSubmitProposalJvmConverter

public actual object MsgSubmitProposalResponseConverter :
    ProtobufConverter<MsgSubmitProposalResponse> by MsgSubmitProposalResponseJvmConverter

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
