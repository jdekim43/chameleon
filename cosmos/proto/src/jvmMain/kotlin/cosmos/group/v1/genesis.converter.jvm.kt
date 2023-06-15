// Transform from cosmos/group/v1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	groupSeq = obj.getGroupSeq().asKotlinType,
  	groups = obj.getGroupsList().map { GroupInfoJvmConverter.convert(it) },
  	groupMembers = obj.getGroupMembersList().map { GroupMemberJvmConverter.convert(it) },
  	groupPolicySeq = obj.getGroupPolicySeq().asKotlinType,
  	groupPolicies = obj.getGroupPoliciesList().map { GroupPolicyInfoJvmConverter.convert(it) },
  	proposalSeq = obj.getProposalSeq().asKotlinType,
  	proposals = obj.getProposalsList().map { ProposalJvmConverter.convert(it) },
  	votes = obj.getVotesList().map { VoteJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setGroupSeq(obj.groupSeq.asJavaType)
    builder.addAllGroups(obj.groups.map { GroupInfoJvmConverter.convert(it) })
    builder.addAllGroupMembers(obj.groupMembers.map { GroupMemberJvmConverter.convert(it) })
    builder.setGroupPolicySeq(obj.groupPolicySeq.asJavaType)
    builder.addAllGroupPolicies(obj.groupPolicies.map { GroupPolicyInfoJvmConverter.convert(it) })
    builder.setProposalSeq(obj.proposalSeq.asJavaType)
    builder.addAllProposals(obj.proposals.map { ProposalJvmConverter.convert(it) })
    builder.addAllVotes(obj.votes.map { VoteJvmConverter.convert(it) })
    return builder.build()
  }
}
