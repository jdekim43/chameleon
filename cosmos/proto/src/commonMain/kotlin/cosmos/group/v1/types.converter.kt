// Transform from cosmos/group/v1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MemberConverter : ProtobufConverter<Member>

public fun Member.toAny(): Any = Any(Member.TYPE_URL, with(MemberConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Member>): Member {
  if (typeUrl != Member.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MemberRequestConverter : ProtobufConverter<MemberRequest>

public fun MemberRequest.toAny(): Any = Any(MemberRequest.TYPE_URL, with(MemberRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MemberRequest>): MemberRequest {
  if (typeUrl != MemberRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ThresholdDecisionPolicyConverter : ProtobufConverter<ThresholdDecisionPolicy>

public fun ThresholdDecisionPolicy.toAny(): Any = Any(ThresholdDecisionPolicy.TYPE_URL,
    with(ThresholdDecisionPolicyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ThresholdDecisionPolicy>):
    ThresholdDecisionPolicy {
  if (typeUrl != ThresholdDecisionPolicy.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PercentageDecisionPolicyConverter : ProtobufConverter<PercentageDecisionPolicy>

public fun PercentageDecisionPolicy.toAny(): Any = Any(PercentageDecisionPolicy.TYPE_URL,
    with(PercentageDecisionPolicyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PercentageDecisionPolicy>):
    PercentageDecisionPolicy {
  if (typeUrl != PercentageDecisionPolicy.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DecisionPolicyWindowsConverter : ProtobufConverter<DecisionPolicyWindows>

public fun DecisionPolicyWindows.toAny(): Any = Any(DecisionPolicyWindows.TYPE_URL,
    with(DecisionPolicyWindowsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DecisionPolicyWindows>): DecisionPolicyWindows {
  if (typeUrl != DecisionPolicyWindows.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GroupInfoConverter : ProtobufConverter<GroupInfo>

public fun GroupInfo.toAny(): Any = Any(GroupInfo.TYPE_URL, with(GroupInfoConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<GroupInfo>): GroupInfo {
  if (typeUrl != GroupInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GroupMemberConverter : ProtobufConverter<GroupMember>

public fun GroupMember.toAny(): Any = Any(GroupMember.TYPE_URL, with(GroupMemberConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GroupMember>): GroupMember {
  if (typeUrl != GroupMember.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GroupPolicyInfoConverter : ProtobufConverter<GroupPolicyInfo>

public fun GroupPolicyInfo.toAny(): Any = Any(GroupPolicyInfo.TYPE_URL,
    with(GroupPolicyInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GroupPolicyInfo>): GroupPolicyInfo {
  if (typeUrl != GroupPolicyInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProposalConverter : ProtobufConverter<Proposal>

public fun Proposal.toAny(): Any = Any(Proposal.TYPE_URL, with(ProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Proposal>): Proposal {
  if (typeUrl != Proposal.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TallyResultConverter : ProtobufConverter<TallyResult>

public fun TallyResult.toAny(): Any = Any(TallyResult.TYPE_URL, with(TallyResultConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TallyResult>): TallyResult {
  if (typeUrl != TallyResult.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VoteConverter : ProtobufConverter<Vote>

public fun Vote.toAny(): Any = Any(Vote.TYPE_URL, with(VoteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Vote>): Vote {
  if (typeUrl != Vote.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
