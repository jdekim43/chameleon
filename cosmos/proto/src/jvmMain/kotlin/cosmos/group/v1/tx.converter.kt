// Transform from cosmos/group/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgCreateGroupConverter : ProtobufConverter<MsgCreateGroup> by
    MsgCreateGroupJvmConverter

public actual object MsgCreateGroupResponseConverter : ProtobufConverter<MsgCreateGroupResponse> by
    MsgCreateGroupResponseJvmConverter

public actual object MsgUpdateGroupMembersConverter : ProtobufConverter<MsgUpdateGroupMembers> by
    MsgUpdateGroupMembersJvmConverter

public actual object MsgUpdateGroupMembersResponseConverter :
    ProtobufConverter<MsgUpdateGroupMembersResponse> by MsgUpdateGroupMembersResponseJvmConverter

public actual object MsgUpdateGroupAdminConverter : ProtobufConverter<MsgUpdateGroupAdmin> by
    MsgUpdateGroupAdminJvmConverter

public actual object MsgUpdateGroupAdminResponseConverter :
    ProtobufConverter<MsgUpdateGroupAdminResponse> by MsgUpdateGroupAdminResponseJvmConverter

public actual object MsgUpdateGroupMetadataConverter : ProtobufConverter<MsgUpdateGroupMetadata> by
    MsgUpdateGroupMetadataJvmConverter

public actual object MsgUpdateGroupMetadataResponseConverter :
    ProtobufConverter<MsgUpdateGroupMetadataResponse> by MsgUpdateGroupMetadataResponseJvmConverter

public actual object MsgCreateGroupPolicyConverter : ProtobufConverter<MsgCreateGroupPolicy> by
    MsgCreateGroupPolicyJvmConverter

public actual object MsgCreateGroupPolicyResponseConverter :
    ProtobufConverter<MsgCreateGroupPolicyResponse> by MsgCreateGroupPolicyResponseJvmConverter

public actual object MsgUpdateGroupPolicyAdminConverter :
    ProtobufConverter<MsgUpdateGroupPolicyAdmin> by MsgUpdateGroupPolicyAdminJvmConverter

public actual object MsgUpdateGroupPolicyAdminResponseConverter :
    ProtobufConverter<MsgUpdateGroupPolicyAdminResponse> by
    MsgUpdateGroupPolicyAdminResponseJvmConverter

public actual object MsgCreateGroupWithPolicyConverter : ProtobufConverter<MsgCreateGroupWithPolicy>
    by MsgCreateGroupWithPolicyJvmConverter

public actual object MsgCreateGroupWithPolicyResponseConverter :
    ProtobufConverter<MsgCreateGroupWithPolicyResponse> by
    MsgCreateGroupWithPolicyResponseJvmConverter

public actual object MsgUpdateGroupPolicyDecisionPolicyConverter :
    ProtobufConverter<MsgUpdateGroupPolicyDecisionPolicy> by
    MsgUpdateGroupPolicyDecisionPolicyJvmConverter

public actual object MsgUpdateGroupPolicyDecisionPolicyResponseConverter :
    ProtobufConverter<MsgUpdateGroupPolicyDecisionPolicyResponse> by
    MsgUpdateGroupPolicyDecisionPolicyResponseJvmConverter

public actual object MsgUpdateGroupPolicyMetadataConverter :
    ProtobufConverter<MsgUpdateGroupPolicyMetadata> by MsgUpdateGroupPolicyMetadataJvmConverter

public actual object MsgUpdateGroupPolicyMetadataResponseConverter :
    ProtobufConverter<MsgUpdateGroupPolicyMetadataResponse> by
    MsgUpdateGroupPolicyMetadataResponseJvmConverter

public actual object MsgSubmitProposalConverter : ProtobufConverter<MsgSubmitProposal> by
    MsgSubmitProposalJvmConverter

public actual object MsgSubmitProposalResponseConverter :
    ProtobufConverter<MsgSubmitProposalResponse> by MsgSubmitProposalResponseJvmConverter

public actual object MsgWithdrawProposalConverter : ProtobufConverter<MsgWithdrawProposal> by
    MsgWithdrawProposalJvmConverter

public actual object MsgWithdrawProposalResponseConverter :
    ProtobufConverter<MsgWithdrawProposalResponse> by MsgWithdrawProposalResponseJvmConverter

public actual object MsgVoteConverter : ProtobufConverter<MsgVote> by MsgVoteJvmConverter

public actual object MsgVoteResponseConverter : ProtobufConverter<MsgVoteResponse> by
    MsgVoteResponseJvmConverter

public actual object MsgExecConverter : ProtobufConverter<MsgExec> by MsgExecJvmConverter

public actual object MsgExecResponseConverter : ProtobufConverter<MsgExecResponse> by
    MsgExecResponseJvmConverter

public actual object MsgLeaveGroupConverter : ProtobufConverter<MsgLeaveGroup> by
    MsgLeaveGroupJvmConverter

public actual object MsgLeaveGroupResponseConverter : ProtobufConverter<MsgLeaveGroupResponse> by
    MsgLeaveGroupResponseJvmConverter
