// Transform from cosmos/group/v1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MemberJvmConverter : ProtobufTypeMapper<Member, Types.Member> {
  public override val descriptor: Descriptors.Descriptor = Types.Member.getDescriptor()

  public override val parser: Parser<Types.Member> = Types.Member.parser()

  public override fun convert(obj: Types.Member): Member = Member(
  	address = obj.getAddress(),
  	weight = obj.getWeight(),
  	metadata = obj.getMetadata(),
  	addedAt = TimestampJvmConverter.convert(obj.getAddedAt()),
  )

  public override fun convert(obj: Member): Types.Member {
    val builder = Types.Member.newBuilder()
    builder.setAddress(obj.address)
    builder.setWeight(obj.weight)
    builder.setMetadata(obj.metadata)
    builder.setAddedAt(TimestampJvmConverter.convert(obj.addedAt))
    return builder.build()
  }
}

public object MemberRequestJvmConverter : ProtobufTypeMapper<MemberRequest, Types.MemberRequest> {
  public override val descriptor: Descriptors.Descriptor = Types.MemberRequest.getDescriptor()

  public override val parser: Parser<Types.MemberRequest> = Types.MemberRequest.parser()

  public override fun convert(obj: Types.MemberRequest): MemberRequest = MemberRequest(
  	address = obj.getAddress(),
  	weight = obj.getWeight(),
  	metadata = obj.getMetadata(),
  )

  public override fun convert(obj: MemberRequest): Types.MemberRequest {
    val builder = Types.MemberRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setWeight(obj.weight)
    builder.setMetadata(obj.metadata)
    return builder.build()
  }
}

public object ThresholdDecisionPolicyJvmConverter :
    ProtobufTypeMapper<ThresholdDecisionPolicy, Types.ThresholdDecisionPolicy> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ThresholdDecisionPolicy.getDescriptor()

  public override val parser: Parser<Types.ThresholdDecisionPolicy> =
      Types.ThresholdDecisionPolicy.parser()

  public override fun convert(obj: Types.ThresholdDecisionPolicy): ThresholdDecisionPolicy =
      ThresholdDecisionPolicy(
  	threshold = obj.getThreshold(),
  	windows = DecisionPolicyWindowsJvmConverter.convert(obj.getWindows()),
  )

  public override fun convert(obj: ThresholdDecisionPolicy): Types.ThresholdDecisionPolicy {
    val builder = Types.ThresholdDecisionPolicy.newBuilder()
    builder.setThreshold(obj.threshold)
    builder.setWindows(DecisionPolicyWindowsJvmConverter.convert(obj.windows))
    return builder.build()
  }
}

public object PercentageDecisionPolicyJvmConverter :
    ProtobufTypeMapper<PercentageDecisionPolicy, Types.PercentageDecisionPolicy> {
  public override val descriptor: Descriptors.Descriptor =
      Types.PercentageDecisionPolicy.getDescriptor()

  public override val parser: Parser<Types.PercentageDecisionPolicy> =
      Types.PercentageDecisionPolicy.parser()

  public override fun convert(obj: Types.PercentageDecisionPolicy): PercentageDecisionPolicy =
      PercentageDecisionPolicy(
  	percentage = obj.getPercentage(),
  	windows = DecisionPolicyWindowsJvmConverter.convert(obj.getWindows()),
  )

  public override fun convert(obj: PercentageDecisionPolicy): Types.PercentageDecisionPolicy {
    val builder = Types.PercentageDecisionPolicy.newBuilder()
    builder.setPercentage(obj.percentage)
    builder.setWindows(DecisionPolicyWindowsJvmConverter.convert(obj.windows))
    return builder.build()
  }
}

public object DecisionPolicyWindowsJvmConverter :
    ProtobufTypeMapper<DecisionPolicyWindows, Types.DecisionPolicyWindows> {
  public override val descriptor: Descriptors.Descriptor =
      Types.DecisionPolicyWindows.getDescriptor()

  public override val parser: Parser<Types.DecisionPolicyWindows> =
      Types.DecisionPolicyWindows.parser()

  public override fun convert(obj: Types.DecisionPolicyWindows): DecisionPolicyWindows =
      DecisionPolicyWindows(
  	votingPeriod = DurationJvmConverter.convert(obj.getVotingPeriod()),
  	minExecutionPeriod = DurationJvmConverter.convert(obj.getMinExecutionPeriod()),
  )

  public override fun convert(obj: DecisionPolicyWindows): Types.DecisionPolicyWindows {
    val builder = Types.DecisionPolicyWindows.newBuilder()
    builder.setVotingPeriod(DurationJvmConverter.convert(obj.votingPeriod))
    builder.setMinExecutionPeriod(DurationJvmConverter.convert(obj.minExecutionPeriod))
    return builder.build()
  }
}

public object GroupInfoJvmConverter : ProtobufTypeMapper<GroupInfo, Types.GroupInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.GroupInfo.getDescriptor()

  public override val parser: Parser<Types.GroupInfo> = Types.GroupInfo.parser()

  public override fun convert(obj: Types.GroupInfo): GroupInfo = GroupInfo(
  	id = obj.getId().asKotlinType,
  	admin = obj.getAdmin(),
  	metadata = obj.getMetadata(),
  	version = obj.getVersion().asKotlinType,
  	totalWeight = obj.getTotalWeight(),
  	createdAt = TimestampJvmConverter.convert(obj.getCreatedAt()),
  )

  public override fun convert(obj: GroupInfo): Types.GroupInfo {
    val builder = Types.GroupInfo.newBuilder()
    builder.setId(obj.id.asJavaType)
    builder.setAdmin(obj.admin)
    builder.setMetadata(obj.metadata)
    builder.setVersion(obj.version.asJavaType)
    builder.setTotalWeight(obj.totalWeight)
    builder.setCreatedAt(TimestampJvmConverter.convert(obj.createdAt))
    return builder.build()
  }
}

public object GroupMemberJvmConverter : ProtobufTypeMapper<GroupMember, Types.GroupMember> {
  public override val descriptor: Descriptors.Descriptor = Types.GroupMember.getDescriptor()

  public override val parser: Parser<Types.GroupMember> = Types.GroupMember.parser()

  public override fun convert(obj: Types.GroupMember): GroupMember = GroupMember(
  	groupId = obj.getGroupId().asKotlinType,
  	member = MemberJvmConverter.convert(obj.getMember()),
  )

  public override fun convert(obj: GroupMember): Types.GroupMember {
    val builder = Types.GroupMember.newBuilder()
    builder.setGroupId(obj.groupId.asJavaType)
    builder.setMember(MemberJvmConverter.convert(obj.member))
    return builder.build()
  }
}

public object GroupPolicyInfoJvmConverter :
    ProtobufTypeMapper<GroupPolicyInfo, Types.GroupPolicyInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.GroupPolicyInfo.getDescriptor()

  public override val parser: Parser<Types.GroupPolicyInfo> = Types.GroupPolicyInfo.parser()

  public override fun convert(obj: Types.GroupPolicyInfo): GroupPolicyInfo = GroupPolicyInfo(
  	address = obj.getAddress(),
  	groupId = obj.getGroupId().asKotlinType,
  	admin = obj.getAdmin(),
  	metadata = obj.getMetadata(),
  	version = obj.getVersion().asKotlinType,
  	decisionPolicy = AnyJvmConverter.convert(obj.getDecisionPolicy()),
  	createdAt = TimestampJvmConverter.convert(obj.getCreatedAt()),
  )

  public override fun convert(obj: GroupPolicyInfo): Types.GroupPolicyInfo {
    val builder = Types.GroupPolicyInfo.newBuilder()
    builder.setAddress(obj.address)
    builder.setGroupId(obj.groupId.asJavaType)
    builder.setAdmin(obj.admin)
    builder.setMetadata(obj.metadata)
    builder.setVersion(obj.version.asJavaType)
    builder.setDecisionPolicy(AnyJvmConverter.convert(obj.decisionPolicy))
    builder.setCreatedAt(TimestampJvmConverter.convert(obj.createdAt))
    return builder.build()
  }
}

public object ProposalJvmConverter : ProtobufTypeMapper<Proposal, Types.Proposal> {
  public override val descriptor: Descriptors.Descriptor = Types.Proposal.getDescriptor()

  public override val parser: Parser<Types.Proposal> = Types.Proposal.parser()

  public override fun convert(obj: Types.Proposal): Proposal = Proposal(
  	id = obj.getId().asKotlinType,
  	groupPolicyAddress = obj.getGroupPolicyAddress(),
  	metadata = obj.getMetadata(),
  	proposers = obj.getProposersList().map { it },
  	submitTime = TimestampJvmConverter.convert(obj.getSubmitTime()),
  	groupVersion = obj.getGroupVersion().asKotlinType,
  	groupPolicyVersion = obj.getGroupPolicyVersion().asKotlinType,
  	status = ProposalStatus.forNumber(obj.getStatus().number),
  	finalTallyResult = TallyResultJvmConverter.convert(obj.getFinalTallyResult()),
  	votingPeriodEnd = TimestampJvmConverter.convert(obj.getVotingPeriodEnd()),
  	executorResult = ProposalExecutorResult.forNumber(obj.getExecutorResult().number),
  	messages = obj.getMessagesList().map { AnyJvmConverter.convert(it) },
  	title = obj.getTitle(),
  	summary = obj.getSummary(),
  )

  public override fun convert(obj: Proposal): Types.Proposal {
    val builder = Types.Proposal.newBuilder()
    builder.setId(obj.id.asJavaType)
    builder.setGroupPolicyAddress(obj.groupPolicyAddress)
    builder.setMetadata(obj.metadata)
    builder.addAllProposers(obj.proposers.map { it })
    builder.setSubmitTime(TimestampJvmConverter.convert(obj.submitTime))
    builder.setGroupVersion(obj.groupVersion.asJavaType)
    builder.setGroupPolicyVersion(obj.groupPolicyVersion.asJavaType)
    builder.setStatus(Types.ProposalStatus.forNumber(obj.status.number))
    builder.setFinalTallyResult(TallyResultJvmConverter.convert(obj.finalTallyResult))
    builder.setVotingPeriodEnd(TimestampJvmConverter.convert(obj.votingPeriodEnd))
    builder.setExecutorResult(Types.ProposalExecutorResult.forNumber(obj.executorResult.number))
    builder.addAllMessages(obj.messages.map { AnyJvmConverter.convert(it) })
    builder.setTitle(obj.title)
    builder.setSummary(obj.summary)
    return builder.build()
  }
}

public object TallyResultJvmConverter : ProtobufTypeMapper<TallyResult, Types.TallyResult> {
  public override val descriptor: Descriptors.Descriptor = Types.TallyResult.getDescriptor()

  public override val parser: Parser<Types.TallyResult> = Types.TallyResult.parser()

  public override fun convert(obj: Types.TallyResult): TallyResult = TallyResult(
  	yesCount = obj.getYesCount(),
  	abstainCount = obj.getAbstainCount(),
  	noCount = obj.getNoCount(),
  	noWithVetoCount = obj.getNoWithVetoCount(),
  )

  public override fun convert(obj: TallyResult): Types.TallyResult {
    val builder = Types.TallyResult.newBuilder()
    builder.setYesCount(obj.yesCount)
    builder.setAbstainCount(obj.abstainCount)
    builder.setNoCount(obj.noCount)
    builder.setNoWithVetoCount(obj.noWithVetoCount)
    return builder.build()
  }
}

public object VoteJvmConverter : ProtobufTypeMapper<Vote, Types.Vote> {
  public override val descriptor: Descriptors.Descriptor = Types.Vote.getDescriptor()

  public override val parser: Parser<Types.Vote> = Types.Vote.parser()

  public override fun convert(obj: Types.Vote): Vote = Vote(
  	proposalId = obj.getProposalId().asKotlinType,
  	voter = obj.getVoter(),
  	option = VoteOption.forNumber(obj.getOption().number),
  	metadata = obj.getMetadata(),
  	submitTime = TimestampJvmConverter.convert(obj.getSubmitTime()),
  )

  public override fun convert(obj: Vote): Types.Vote {
    val builder = Types.Vote.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setVoter(obj.voter)
    builder.setOption(Types.VoteOption.forNumber(obj.option.number))
    builder.setMetadata(obj.metadata)
    builder.setSubmitTime(TimestampJvmConverter.convert(obj.submitTime))
    return builder.build()
  }
}
