// Transform from cosmos/group/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MsgCreateGroupJvmConverter : ProtobufTypeMapper<MsgCreateGroup, Tx.MsgCreateGroup> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateGroup.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateGroup> = Tx.MsgCreateGroup.parser()

  public override fun convert(obj: Tx.MsgCreateGroup): MsgCreateGroup = MsgCreateGroup(
  	admin = obj.getAdmin(),
  	members = obj.getMembersList().map { MemberRequestJvmConverter.convert(it) },
  	metadata = obj.getMetadata(),
  )

  public override fun convert(obj: MsgCreateGroup): Tx.MsgCreateGroup {
    val builder = Tx.MsgCreateGroup.newBuilder()
    builder.setAdmin(obj.admin)
    builder.addAllMembers(obj.members.map { MemberRequestJvmConverter.convert(it) })
    builder.setMetadata(obj.metadata)
    return builder.build()
  }
}

public object MsgCreateGroupResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateGroupResponse, Tx.MsgCreateGroupResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateGroupResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateGroupResponse> = Tx.MsgCreateGroupResponse.parser()

  public override fun convert(obj: Tx.MsgCreateGroupResponse): MsgCreateGroupResponse =
      MsgCreateGroupResponse(
  	groupId = obj.getGroupId().asKotlinType,
  )

  public override fun convert(obj: MsgCreateGroupResponse): Tx.MsgCreateGroupResponse {
    val builder = Tx.MsgCreateGroupResponse.newBuilder()
    builder.setGroupId(obj.groupId.asJavaType)
    return builder.build()
  }
}

public object MsgUpdateGroupMembersJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupMembers, Tx.MsgUpdateGroupMembers> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateGroupMembers.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupMembers> = Tx.MsgUpdateGroupMembers.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupMembers): MsgUpdateGroupMembers =
      MsgUpdateGroupMembers(
  	admin = obj.getAdmin(),
  	groupId = obj.getGroupId().asKotlinType,
  	memberUpdates = obj.getMemberUpdatesList().map { MemberRequestJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgUpdateGroupMembers): Tx.MsgUpdateGroupMembers {
    val builder = Tx.MsgUpdateGroupMembers.newBuilder()
    builder.setAdmin(obj.admin)
    builder.setGroupId(obj.groupId.asJavaType)
    builder.addAllMemberUpdates(obj.memberUpdates.map { MemberRequestJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgUpdateGroupMembersResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupMembersResponse, Tx.MsgUpdateGroupMembersResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateGroupMembersResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupMembersResponse> =
      Tx.MsgUpdateGroupMembersResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupMembersResponse): MsgUpdateGroupMembersResponse
      = MsgUpdateGroupMembersResponse(
  )

  public override fun convert(obj: MsgUpdateGroupMembersResponse):
      Tx.MsgUpdateGroupMembersResponse {
    val builder = Tx.MsgUpdateGroupMembersResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateGroupAdminJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupAdmin, Tx.MsgUpdateGroupAdmin> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateGroupAdmin.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupAdmin> = Tx.MsgUpdateGroupAdmin.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupAdmin): MsgUpdateGroupAdmin =
      MsgUpdateGroupAdmin(
  	admin = obj.getAdmin(),
  	groupId = obj.getGroupId().asKotlinType,
  	newAdmin = obj.getNewAdmin(),
  )

  public override fun convert(obj: MsgUpdateGroupAdmin): Tx.MsgUpdateGroupAdmin {
    val builder = Tx.MsgUpdateGroupAdmin.newBuilder()
    builder.setAdmin(obj.admin)
    builder.setGroupId(obj.groupId.asJavaType)
    builder.setNewAdmin(obj.newAdmin)
    return builder.build()
  }
}

public object MsgUpdateGroupAdminResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupAdminResponse, Tx.MsgUpdateGroupAdminResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateGroupAdminResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupAdminResponse> =
      Tx.MsgUpdateGroupAdminResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupAdminResponse): MsgUpdateGroupAdminResponse =
      MsgUpdateGroupAdminResponse(
  )

  public override fun convert(obj: MsgUpdateGroupAdminResponse): Tx.MsgUpdateGroupAdminResponse {
    val builder = Tx.MsgUpdateGroupAdminResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateGroupMetadataJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupMetadata, Tx.MsgUpdateGroupMetadata> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateGroupMetadata.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupMetadata> = Tx.MsgUpdateGroupMetadata.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupMetadata): MsgUpdateGroupMetadata =
      MsgUpdateGroupMetadata(
  	admin = obj.getAdmin(),
  	groupId = obj.getGroupId().asKotlinType,
  	metadata = obj.getMetadata(),
  )

  public override fun convert(obj: MsgUpdateGroupMetadata): Tx.MsgUpdateGroupMetadata {
    val builder = Tx.MsgUpdateGroupMetadata.newBuilder()
    builder.setAdmin(obj.admin)
    builder.setGroupId(obj.groupId.asJavaType)
    builder.setMetadata(obj.metadata)
    return builder.build()
  }
}

public object MsgUpdateGroupMetadataResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupMetadataResponse, Tx.MsgUpdateGroupMetadataResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateGroupMetadataResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupMetadataResponse> =
      Tx.MsgUpdateGroupMetadataResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupMetadataResponse):
      MsgUpdateGroupMetadataResponse = MsgUpdateGroupMetadataResponse(
  )

  public override fun convert(obj: MsgUpdateGroupMetadataResponse):
      Tx.MsgUpdateGroupMetadataResponse {
    val builder = Tx.MsgUpdateGroupMetadataResponse.newBuilder()
    return builder.build()
  }
}

public object MsgCreateGroupPolicyJvmConverter :
    ProtobufTypeMapper<MsgCreateGroupPolicy, Tx.MsgCreateGroupPolicy> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateGroupPolicy.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateGroupPolicy> = Tx.MsgCreateGroupPolicy.parser()

  public override fun convert(obj: Tx.MsgCreateGroupPolicy): MsgCreateGroupPolicy =
      MsgCreateGroupPolicy(
  	admin = obj.getAdmin(),
  	groupId = obj.getGroupId().asKotlinType,
  	metadata = obj.getMetadata(),
  	decisionPolicy = AnyJvmConverter.convert(obj.getDecisionPolicy()),
  )

  public override fun convert(obj: MsgCreateGroupPolicy): Tx.MsgCreateGroupPolicy {
    val builder = Tx.MsgCreateGroupPolicy.newBuilder()
    builder.setAdmin(obj.admin)
    builder.setGroupId(obj.groupId.asJavaType)
    builder.setMetadata(obj.metadata)
    builder.setDecisionPolicy(AnyJvmConverter.convert(obj.decisionPolicy))
    return builder.build()
  }
}

public object MsgCreateGroupPolicyResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateGroupPolicyResponse, Tx.MsgCreateGroupPolicyResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateGroupPolicyResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateGroupPolicyResponse> =
      Tx.MsgCreateGroupPolicyResponse.parser()

  public override fun convert(obj: Tx.MsgCreateGroupPolicyResponse): MsgCreateGroupPolicyResponse =
      MsgCreateGroupPolicyResponse(
  	address = obj.getAddress(),
  )

  public override fun convert(obj: MsgCreateGroupPolicyResponse): Tx.MsgCreateGroupPolicyResponse {
    val builder = Tx.MsgCreateGroupPolicyResponse.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object MsgUpdateGroupPolicyAdminJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupPolicyAdmin, Tx.MsgUpdateGroupPolicyAdmin> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateGroupPolicyAdmin.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupPolicyAdmin> =
      Tx.MsgUpdateGroupPolicyAdmin.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupPolicyAdmin): MsgUpdateGroupPolicyAdmin =
      MsgUpdateGroupPolicyAdmin(
  	admin = obj.getAdmin(),
  	groupPolicyAddress = obj.getGroupPolicyAddress(),
  	newAdmin = obj.getNewAdmin(),
  )

  public override fun convert(obj: MsgUpdateGroupPolicyAdmin): Tx.MsgUpdateGroupPolicyAdmin {
    val builder = Tx.MsgUpdateGroupPolicyAdmin.newBuilder()
    builder.setAdmin(obj.admin)
    builder.setGroupPolicyAddress(obj.groupPolicyAddress)
    builder.setNewAdmin(obj.newAdmin)
    return builder.build()
  }
}

public object MsgUpdateGroupPolicyAdminResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupPolicyAdminResponse, Tx.MsgUpdateGroupPolicyAdminResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateGroupPolicyAdminResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupPolicyAdminResponse> =
      Tx.MsgUpdateGroupPolicyAdminResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupPolicyAdminResponse):
      MsgUpdateGroupPolicyAdminResponse = MsgUpdateGroupPolicyAdminResponse(
  )

  public override fun convert(obj: MsgUpdateGroupPolicyAdminResponse):
      Tx.MsgUpdateGroupPolicyAdminResponse {
    val builder = Tx.MsgUpdateGroupPolicyAdminResponse.newBuilder()
    return builder.build()
  }
}

public object MsgCreateGroupWithPolicyJvmConverter :
    ProtobufTypeMapper<MsgCreateGroupWithPolicy, Tx.MsgCreateGroupWithPolicy> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateGroupWithPolicy.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateGroupWithPolicy> =
      Tx.MsgCreateGroupWithPolicy.parser()

  public override fun convert(obj: Tx.MsgCreateGroupWithPolicy): MsgCreateGroupWithPolicy =
      MsgCreateGroupWithPolicy(
  	admin = obj.getAdmin(),
  	members = obj.getMembersList().map { MemberRequestJvmConverter.convert(it) },
  	groupMetadata = obj.getGroupMetadata(),
  	groupPolicyMetadata = obj.getGroupPolicyMetadata(),
  	groupPolicyAsAdmin = obj.getGroupPolicyAsAdmin(),
  	decisionPolicy = AnyJvmConverter.convert(obj.getDecisionPolicy()),
  )

  public override fun convert(obj: MsgCreateGroupWithPolicy): Tx.MsgCreateGroupWithPolicy {
    val builder = Tx.MsgCreateGroupWithPolicy.newBuilder()
    builder.setAdmin(obj.admin)
    builder.addAllMembers(obj.members.map { MemberRequestJvmConverter.convert(it) })
    builder.setGroupMetadata(obj.groupMetadata)
    builder.setGroupPolicyMetadata(obj.groupPolicyMetadata)
    builder.setGroupPolicyAsAdmin(obj.groupPolicyAsAdmin)
    builder.setDecisionPolicy(AnyJvmConverter.convert(obj.decisionPolicy))
    return builder.build()
  }
}

public object MsgCreateGroupWithPolicyResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateGroupWithPolicyResponse, Tx.MsgCreateGroupWithPolicyResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateGroupWithPolicyResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateGroupWithPolicyResponse> =
      Tx.MsgCreateGroupWithPolicyResponse.parser()

  public override fun convert(obj: Tx.MsgCreateGroupWithPolicyResponse):
      MsgCreateGroupWithPolicyResponse = MsgCreateGroupWithPolicyResponse(
  	groupId = obj.getGroupId().asKotlinType,
  	groupPolicyAddress = obj.getGroupPolicyAddress(),
  )

  public override fun convert(obj: MsgCreateGroupWithPolicyResponse):
      Tx.MsgCreateGroupWithPolicyResponse {
    val builder = Tx.MsgCreateGroupWithPolicyResponse.newBuilder()
    builder.setGroupId(obj.groupId.asJavaType)
    builder.setGroupPolicyAddress(obj.groupPolicyAddress)
    return builder.build()
  }
}

public object MsgUpdateGroupPolicyDecisionPolicyJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupPolicyDecisionPolicy, Tx.MsgUpdateGroupPolicyDecisionPolicy> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateGroupPolicyDecisionPolicy.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupPolicyDecisionPolicy> =
      Tx.MsgUpdateGroupPolicyDecisionPolicy.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupPolicyDecisionPolicy):
      MsgUpdateGroupPolicyDecisionPolicy = MsgUpdateGroupPolicyDecisionPolicy(
  	admin = obj.getAdmin(),
  	groupPolicyAddress = obj.getGroupPolicyAddress(),
  	decisionPolicy = AnyJvmConverter.convert(obj.getDecisionPolicy()),
  )

  public override fun convert(obj: MsgUpdateGroupPolicyDecisionPolicy):
      Tx.MsgUpdateGroupPolicyDecisionPolicy {
    val builder = Tx.MsgUpdateGroupPolicyDecisionPolicy.newBuilder()
    builder.setAdmin(obj.admin)
    builder.setGroupPolicyAddress(obj.groupPolicyAddress)
    builder.setDecisionPolicy(AnyJvmConverter.convert(obj.decisionPolicy))
    return builder.build()
  }
}

public object MsgUpdateGroupPolicyDecisionPolicyResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupPolicyDecisionPolicyResponse, Tx.MsgUpdateGroupPolicyDecisionPolicyResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateGroupPolicyDecisionPolicyResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupPolicyDecisionPolicyResponse> =
      Tx.MsgUpdateGroupPolicyDecisionPolicyResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupPolicyDecisionPolicyResponse):
      MsgUpdateGroupPolicyDecisionPolicyResponse = MsgUpdateGroupPolicyDecisionPolicyResponse(
  )

  public override fun convert(obj: MsgUpdateGroupPolicyDecisionPolicyResponse):
      Tx.MsgUpdateGroupPolicyDecisionPolicyResponse {
    val builder = Tx.MsgUpdateGroupPolicyDecisionPolicyResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateGroupPolicyMetadataJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupPolicyMetadata, Tx.MsgUpdateGroupPolicyMetadata> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateGroupPolicyMetadata.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupPolicyMetadata> =
      Tx.MsgUpdateGroupPolicyMetadata.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupPolicyMetadata): MsgUpdateGroupPolicyMetadata =
      MsgUpdateGroupPolicyMetadata(
  	admin = obj.getAdmin(),
  	groupPolicyAddress = obj.getGroupPolicyAddress(),
  	metadata = obj.getMetadata(),
  )

  public override fun convert(obj: MsgUpdateGroupPolicyMetadata): Tx.MsgUpdateGroupPolicyMetadata {
    val builder = Tx.MsgUpdateGroupPolicyMetadata.newBuilder()
    builder.setAdmin(obj.admin)
    builder.setGroupPolicyAddress(obj.groupPolicyAddress)
    builder.setMetadata(obj.metadata)
    return builder.build()
  }
}

public object MsgUpdateGroupPolicyMetadataResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateGroupPolicyMetadataResponse, Tx.MsgUpdateGroupPolicyMetadataResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateGroupPolicyMetadataResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateGroupPolicyMetadataResponse> =
      Tx.MsgUpdateGroupPolicyMetadataResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateGroupPolicyMetadataResponse):
      MsgUpdateGroupPolicyMetadataResponse = MsgUpdateGroupPolicyMetadataResponse(
  )

  public override fun convert(obj: MsgUpdateGroupPolicyMetadataResponse):
      Tx.MsgUpdateGroupPolicyMetadataResponse {
    val builder = Tx.MsgUpdateGroupPolicyMetadataResponse.newBuilder()
    return builder.build()
  }
}

public object MsgSubmitProposalJvmConverter :
    ProtobufTypeMapper<MsgSubmitProposal, Tx.MsgSubmitProposal> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSubmitProposal.getDescriptor()

  public override val parser: Parser<Tx.MsgSubmitProposal> = Tx.MsgSubmitProposal.parser()

  public override fun convert(obj: Tx.MsgSubmitProposal): MsgSubmitProposal = MsgSubmitProposal(
  	groupPolicyAddress = obj.getGroupPolicyAddress(),
  	proposers = obj.getProposersList().map { it },
  	metadata = obj.getMetadata(),
  	messages = obj.getMessagesList().map { AnyJvmConverter.convert(it) },
  	exec = Exec.forNumber(obj.getExec().number),
  	title = obj.getTitle(),
  	summary = obj.getSummary(),
  )

  public override fun convert(obj: MsgSubmitProposal): Tx.MsgSubmitProposal {
    val builder = Tx.MsgSubmitProposal.newBuilder()
    builder.setGroupPolicyAddress(obj.groupPolicyAddress)
    builder.addAllProposers(obj.proposers.map { it })
    builder.setMetadata(obj.metadata)
    builder.addAllMessages(obj.messages.map { AnyJvmConverter.convert(it) })
    builder.setExec(Tx.Exec.forNumber(obj.exec.number))
    builder.setTitle(obj.title)
    builder.setSummary(obj.summary)
    return builder.build()
  }
}

public object MsgSubmitProposalResponseJvmConverter :
    ProtobufTypeMapper<MsgSubmitProposalResponse, Tx.MsgSubmitProposalResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgSubmitProposalResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSubmitProposalResponse> =
      Tx.MsgSubmitProposalResponse.parser()

  public override fun convert(obj: Tx.MsgSubmitProposalResponse): MsgSubmitProposalResponse =
      MsgSubmitProposalResponse(
  	proposalId = obj.getProposalId().asKotlinType,
  )

  public override fun convert(obj: MsgSubmitProposalResponse): Tx.MsgSubmitProposalResponse {
    val builder = Tx.MsgSubmitProposalResponse.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    return builder.build()
  }
}

public object MsgWithdrawProposalJvmConverter :
    ProtobufTypeMapper<MsgWithdrawProposal, Tx.MsgWithdrawProposal> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgWithdrawProposal.getDescriptor()

  public override val parser: Parser<Tx.MsgWithdrawProposal> = Tx.MsgWithdrawProposal.parser()

  public override fun convert(obj: Tx.MsgWithdrawProposal): MsgWithdrawProposal =
      MsgWithdrawProposal(
  	proposalId = obj.getProposalId().asKotlinType,
  	address = obj.getAddress(),
  )

  public override fun convert(obj: MsgWithdrawProposal): Tx.MsgWithdrawProposal {
    val builder = Tx.MsgWithdrawProposal.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object MsgWithdrawProposalResponseJvmConverter :
    ProtobufTypeMapper<MsgWithdrawProposalResponse, Tx.MsgWithdrawProposalResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgWithdrawProposalResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgWithdrawProposalResponse> =
      Tx.MsgWithdrawProposalResponse.parser()

  public override fun convert(obj: Tx.MsgWithdrawProposalResponse): MsgWithdrawProposalResponse =
      MsgWithdrawProposalResponse(
  )

  public override fun convert(obj: MsgWithdrawProposalResponse): Tx.MsgWithdrawProposalResponse {
    val builder = Tx.MsgWithdrawProposalResponse.newBuilder()
    return builder.build()
  }
}

public object MsgVoteJvmConverter : ProtobufTypeMapper<MsgVote, Tx.MsgVote> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgVote.getDescriptor()

  public override val parser: Parser<Tx.MsgVote> = Tx.MsgVote.parser()

  public override fun convert(obj: Tx.MsgVote): MsgVote = MsgVote(
  	proposalId = obj.getProposalId().asKotlinType,
  	voter = obj.getVoter(),
  	option = VoteOption.forNumber(obj.getOption().number),
  	metadata = obj.getMetadata(),
  	exec = Exec.forNumber(obj.getExec().number),
  )

  public override fun convert(obj: MsgVote): Tx.MsgVote {
    val builder = Tx.MsgVote.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setVoter(obj.voter)
    builder.setOption(Types.VoteOption.forNumber(obj.option.number))
    builder.setMetadata(obj.metadata)
    builder.setExec(Tx.Exec.forNumber(obj.exec.number))
    return builder.build()
  }
}

public object MsgVoteResponseJvmConverter : ProtobufTypeMapper<MsgVoteResponse, Tx.MsgVoteResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgVoteResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgVoteResponse> = Tx.MsgVoteResponse.parser()

  public override fun convert(obj: Tx.MsgVoteResponse): MsgVoteResponse = MsgVoteResponse(
  )

  public override fun convert(obj: MsgVoteResponse): Tx.MsgVoteResponse {
    val builder = Tx.MsgVoteResponse.newBuilder()
    return builder.build()
  }
}

public object MsgExecJvmConverter : ProtobufTypeMapper<MsgExec, Tx.MsgExec> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgExec.getDescriptor()

  public override val parser: Parser<Tx.MsgExec> = Tx.MsgExec.parser()

  public override fun convert(obj: Tx.MsgExec): MsgExec = MsgExec(
  	proposalId = obj.getProposalId().asKotlinType,
  	executor = obj.getExecutor(),
  )

  public override fun convert(obj: MsgExec): Tx.MsgExec {
    val builder = Tx.MsgExec.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setExecutor(obj.executor)
    return builder.build()
  }
}

public object MsgExecResponseJvmConverter : ProtobufTypeMapper<MsgExecResponse, Tx.MsgExecResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgExecResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgExecResponse> = Tx.MsgExecResponse.parser()

  public override fun convert(obj: Tx.MsgExecResponse): MsgExecResponse = MsgExecResponse(
  	result = ProposalExecutorResult.forNumber(obj.getResult().number),
  )

  public override fun convert(obj: MsgExecResponse): Tx.MsgExecResponse {
    val builder = Tx.MsgExecResponse.newBuilder()
    builder.setResult(Types.ProposalExecutorResult.forNumber(obj.result.number))
    return builder.build()
  }
}

public object MsgLeaveGroupJvmConverter : ProtobufTypeMapper<MsgLeaveGroup, Tx.MsgLeaveGroup> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgLeaveGroup.getDescriptor()

  public override val parser: Parser<Tx.MsgLeaveGroup> = Tx.MsgLeaveGroup.parser()

  public override fun convert(obj: Tx.MsgLeaveGroup): MsgLeaveGroup = MsgLeaveGroup(
  	address = obj.getAddress(),
  	groupId = obj.getGroupId().asKotlinType,
  )

  public override fun convert(obj: MsgLeaveGroup): Tx.MsgLeaveGroup {
    val builder = Tx.MsgLeaveGroup.newBuilder()
    builder.setAddress(obj.address)
    builder.setGroupId(obj.groupId.asJavaType)
    return builder.build()
  }
}

public object MsgLeaveGroupResponseJvmConverter :
    ProtobufTypeMapper<MsgLeaveGroupResponse, Tx.MsgLeaveGroupResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgLeaveGroupResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgLeaveGroupResponse> = Tx.MsgLeaveGroupResponse.parser()

  public override fun convert(obj: Tx.MsgLeaveGroupResponse): MsgLeaveGroupResponse =
      MsgLeaveGroupResponse(
  )

  public override fun convert(obj: MsgLeaveGroupResponse): Tx.MsgLeaveGroupResponse {
    val builder = Tx.MsgLeaveGroupResponse.newBuilder()
    return builder.build()
  }
}
