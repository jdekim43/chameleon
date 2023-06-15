// Transform from cosmos/group/v1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MemberConverter : ProtobufConverter<Member> by MemberJvmConverter

public actual object MemberRequestConverter : ProtobufConverter<MemberRequest> by
    MemberRequestJvmConverter

public actual object ThresholdDecisionPolicyConverter : ProtobufConverter<ThresholdDecisionPolicy>
    by ThresholdDecisionPolicyJvmConverter

public actual object PercentageDecisionPolicyConverter : ProtobufConverter<PercentageDecisionPolicy>
    by PercentageDecisionPolicyJvmConverter

public actual object DecisionPolicyWindowsConverter : ProtobufConverter<DecisionPolicyWindows> by
    DecisionPolicyWindowsJvmConverter

public actual object GroupInfoConverter : ProtobufConverter<GroupInfo> by GroupInfoJvmConverter

public actual object GroupMemberConverter : ProtobufConverter<GroupMember> by
    GroupMemberJvmConverter

public actual object GroupPolicyInfoConverter : ProtobufConverter<GroupPolicyInfo> by
    GroupPolicyInfoJvmConverter

public actual object ProposalConverter : ProtobufConverter<Proposal> by ProposalJvmConverter

public actual object TallyResultConverter : ProtobufConverter<TallyResult> by
    TallyResultJvmConverter

public actual object VoteConverter : ProtobufConverter<Vote> by VoteJvmConverter
