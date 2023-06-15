// Transform from cosmos/group/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgCreateGroupConverter : ProtobufConverter<MsgCreateGroup>

public fun MsgCreateGroup.toAny(): Any = Any(MsgCreateGroup.TYPE_URL, with(MsgCreateGroupConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateGroup>): MsgCreateGroup {
  if (typeUrl != MsgCreateGroup.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateGroupResponseConverter : ProtobufConverter<MsgCreateGroupResponse>

public fun MsgCreateGroupResponse.toAny(): Any = Any(MsgCreateGroupResponse.TYPE_URL,
    with(MsgCreateGroupResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateGroupResponse>): MsgCreateGroupResponse {
  if (typeUrl != MsgCreateGroupResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupMembersConverter : ProtobufConverter<MsgUpdateGroupMembers>

public fun MsgUpdateGroupMembers.toAny(): Any = Any(MsgUpdateGroupMembers.TYPE_URL,
    with(MsgUpdateGroupMembersConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupMembers>): MsgUpdateGroupMembers {
  if (typeUrl != MsgUpdateGroupMembers.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupMembersResponseConverter :
    ProtobufConverter<MsgUpdateGroupMembersResponse>

public fun MsgUpdateGroupMembersResponse.toAny(): Any = Any(MsgUpdateGroupMembersResponse.TYPE_URL,
    with(MsgUpdateGroupMembersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupMembersResponse>):
    MsgUpdateGroupMembersResponse {
  if (typeUrl != MsgUpdateGroupMembersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupAdminConverter : ProtobufConverter<MsgUpdateGroupAdmin>

public fun MsgUpdateGroupAdmin.toAny(): Any = Any(MsgUpdateGroupAdmin.TYPE_URL,
    with(MsgUpdateGroupAdminConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupAdmin>): MsgUpdateGroupAdmin {
  if (typeUrl != MsgUpdateGroupAdmin.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupAdminResponseConverter :
    ProtobufConverter<MsgUpdateGroupAdminResponse>

public fun MsgUpdateGroupAdminResponse.toAny(): Any = Any(MsgUpdateGroupAdminResponse.TYPE_URL,
    with(MsgUpdateGroupAdminResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupAdminResponse>):
    MsgUpdateGroupAdminResponse {
  if (typeUrl != MsgUpdateGroupAdminResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupMetadataConverter : ProtobufConverter<MsgUpdateGroupMetadata>

public fun MsgUpdateGroupMetadata.toAny(): Any = Any(MsgUpdateGroupMetadata.TYPE_URL,
    with(MsgUpdateGroupMetadataConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupMetadata>): MsgUpdateGroupMetadata {
  if (typeUrl != MsgUpdateGroupMetadata.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupMetadataResponseConverter :
    ProtobufConverter<MsgUpdateGroupMetadataResponse>

public fun MsgUpdateGroupMetadataResponse.toAny(): Any =
    Any(MsgUpdateGroupMetadataResponse.TYPE_URL, with(MsgUpdateGroupMetadataResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupMetadataResponse>):
    MsgUpdateGroupMetadataResponse {
  if (typeUrl != MsgUpdateGroupMetadataResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateGroupPolicyConverter : ProtobufConverter<MsgCreateGroupPolicy>

public fun MsgCreateGroupPolicy.toAny(): Any = Any(MsgCreateGroupPolicy.TYPE_URL,
    with(MsgCreateGroupPolicyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateGroupPolicy>): MsgCreateGroupPolicy {
  if (typeUrl != MsgCreateGroupPolicy.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateGroupPolicyResponseConverter :
    ProtobufConverter<MsgCreateGroupPolicyResponse>

public fun MsgCreateGroupPolicyResponse.toAny(): Any = Any(MsgCreateGroupPolicyResponse.TYPE_URL,
    with(MsgCreateGroupPolicyResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateGroupPolicyResponse>):
    MsgCreateGroupPolicyResponse {
  if (typeUrl != MsgCreateGroupPolicyResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupPolicyAdminConverter :
    ProtobufConverter<MsgUpdateGroupPolicyAdmin>

public fun MsgUpdateGroupPolicyAdmin.toAny(): Any = Any(MsgUpdateGroupPolicyAdmin.TYPE_URL,
    with(MsgUpdateGroupPolicyAdminConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupPolicyAdmin>):
    MsgUpdateGroupPolicyAdmin {
  if (typeUrl != MsgUpdateGroupPolicyAdmin.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupPolicyAdminResponseConverter :
    ProtobufConverter<MsgUpdateGroupPolicyAdminResponse>

public fun MsgUpdateGroupPolicyAdminResponse.toAny(): Any =
    Any(MsgUpdateGroupPolicyAdminResponse.TYPE_URL, with(MsgUpdateGroupPolicyAdminResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupPolicyAdminResponse>):
    MsgUpdateGroupPolicyAdminResponse {
  if (typeUrl != MsgUpdateGroupPolicyAdminResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateGroupWithPolicyConverter : ProtobufConverter<MsgCreateGroupWithPolicy>

public fun MsgCreateGroupWithPolicy.toAny(): Any = Any(MsgCreateGroupWithPolicy.TYPE_URL,
    with(MsgCreateGroupWithPolicyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateGroupWithPolicy>):
    MsgCreateGroupWithPolicy {
  if (typeUrl != MsgCreateGroupWithPolicy.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateGroupWithPolicyResponseConverter :
    ProtobufConverter<MsgCreateGroupWithPolicyResponse>

public fun MsgCreateGroupWithPolicyResponse.toAny(): Any =
    Any(MsgCreateGroupWithPolicyResponse.TYPE_URL, with(MsgCreateGroupWithPolicyResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateGroupWithPolicyResponse>):
    MsgCreateGroupWithPolicyResponse {
  if (typeUrl != MsgCreateGroupWithPolicyResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupPolicyDecisionPolicyConverter :
    ProtobufConverter<MsgUpdateGroupPolicyDecisionPolicy>

public fun MsgUpdateGroupPolicyDecisionPolicy.toAny(): Any =
    Any(MsgUpdateGroupPolicyDecisionPolicy.TYPE_URL,
    with(MsgUpdateGroupPolicyDecisionPolicyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupPolicyDecisionPolicy>):
    MsgUpdateGroupPolicyDecisionPolicy {
  if (typeUrl != MsgUpdateGroupPolicyDecisionPolicy.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupPolicyDecisionPolicyResponseConverter :
    ProtobufConverter<MsgUpdateGroupPolicyDecisionPolicyResponse>

public fun MsgUpdateGroupPolicyDecisionPolicyResponse.toAny(): Any =
    Any(MsgUpdateGroupPolicyDecisionPolicyResponse.TYPE_URL,
    with(MsgUpdateGroupPolicyDecisionPolicyResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupPolicyDecisionPolicyResponse>):
    MsgUpdateGroupPolicyDecisionPolicyResponse {
  if (typeUrl != MsgUpdateGroupPolicyDecisionPolicyResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupPolicyMetadataConverter :
    ProtobufConverter<MsgUpdateGroupPolicyMetadata>

public fun MsgUpdateGroupPolicyMetadata.toAny(): Any = Any(MsgUpdateGroupPolicyMetadata.TYPE_URL,
    with(MsgUpdateGroupPolicyMetadataConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupPolicyMetadata>):
    MsgUpdateGroupPolicyMetadata {
  if (typeUrl != MsgUpdateGroupPolicyMetadata.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateGroupPolicyMetadataResponseConverter :
    ProtobufConverter<MsgUpdateGroupPolicyMetadataResponse>

public fun MsgUpdateGroupPolicyMetadataResponse.toAny(): Any =
    Any(MsgUpdateGroupPolicyMetadataResponse.TYPE_URL,
    with(MsgUpdateGroupPolicyMetadataResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateGroupPolicyMetadataResponse>):
    MsgUpdateGroupPolicyMetadataResponse {
  if (typeUrl != MsgUpdateGroupPolicyMetadataResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSubmitProposalConverter : ProtobufConverter<MsgSubmitProposal>

public fun MsgSubmitProposal.toAny(): Any = Any(MsgSubmitProposal.TYPE_URL,
    with(MsgSubmitProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSubmitProposal>): MsgSubmitProposal {
  if (typeUrl != MsgSubmitProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSubmitProposalResponseConverter :
    ProtobufConverter<MsgSubmitProposalResponse>

public fun MsgSubmitProposalResponse.toAny(): Any = Any(MsgSubmitProposalResponse.TYPE_URL,
    with(MsgSubmitProposalResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSubmitProposalResponse>):
    MsgSubmitProposalResponse {
  if (typeUrl != MsgSubmitProposalResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawProposalConverter : ProtobufConverter<MsgWithdrawProposal>

public fun MsgWithdrawProposal.toAny(): Any = Any(MsgWithdrawProposal.TYPE_URL,
    with(MsgWithdrawProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdrawProposal>): MsgWithdrawProposal {
  if (typeUrl != MsgWithdrawProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawProposalResponseConverter :
    ProtobufConverter<MsgWithdrawProposalResponse>

public fun MsgWithdrawProposalResponse.toAny(): Any = Any(MsgWithdrawProposalResponse.TYPE_URL,
    with(MsgWithdrawProposalResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdrawProposalResponse>):
    MsgWithdrawProposalResponse {
  if (typeUrl != MsgWithdrawProposalResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgVoteConverter : ProtobufConverter<MsgVote>

public fun MsgVote.toAny(): Any = Any(MsgVote.TYPE_URL, with(MsgVoteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgVote>): MsgVote {
  if (typeUrl != MsgVote.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgVoteResponseConverter : ProtobufConverter<MsgVoteResponse>

public fun MsgVoteResponse.toAny(): Any = Any(MsgVoteResponse.TYPE_URL,
    with(MsgVoteResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgVoteResponse>): MsgVoteResponse {
  if (typeUrl != MsgVoteResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgExecConverter : ProtobufConverter<MsgExec>

public fun MsgExec.toAny(): Any = Any(MsgExec.TYPE_URL, with(MsgExecConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgExec>): MsgExec {
  if (typeUrl != MsgExec.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgExecResponseConverter : ProtobufConverter<MsgExecResponse>

public fun MsgExecResponse.toAny(): Any = Any(MsgExecResponse.TYPE_URL,
    with(MsgExecResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgExecResponse>): MsgExecResponse {
  if (typeUrl != MsgExecResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgLeaveGroupConverter : ProtobufConverter<MsgLeaveGroup>

public fun MsgLeaveGroup.toAny(): Any = Any(MsgLeaveGroup.TYPE_URL, with(MsgLeaveGroupConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgLeaveGroup>): MsgLeaveGroup {
  if (typeUrl != MsgLeaveGroup.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgLeaveGroupResponseConverter : ProtobufConverter<MsgLeaveGroupResponse>

public fun MsgLeaveGroupResponse.toAny(): Any = Any(MsgLeaveGroupResponse.TYPE_URL,
    with(MsgLeaveGroupResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgLeaveGroupResponse>): MsgLeaveGroupResponse {
  if (typeUrl != MsgLeaveGroupResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
