// Transform from cosmos/group/v1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EventCreateGroupConverter : ProtobufConverter<EventCreateGroup>

public fun EventCreateGroup.toAny(): Any = Any(EventCreateGroup.TYPE_URL,
    with(EventCreateGroupConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventCreateGroup>): EventCreateGroup {
  if (typeUrl != EventCreateGroup.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventUpdateGroupConverter : ProtobufConverter<EventUpdateGroup>

public fun EventUpdateGroup.toAny(): Any = Any(EventUpdateGroup.TYPE_URL,
    with(EventUpdateGroupConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventUpdateGroup>): EventUpdateGroup {
  if (typeUrl != EventUpdateGroup.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventCreateGroupPolicyConverter : ProtobufConverter<EventCreateGroupPolicy>

public fun EventCreateGroupPolicy.toAny(): Any = Any(EventCreateGroupPolicy.TYPE_URL,
    with(EventCreateGroupPolicyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventCreateGroupPolicy>): EventCreateGroupPolicy {
  if (typeUrl != EventCreateGroupPolicy.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventUpdateGroupPolicyConverter : ProtobufConverter<EventUpdateGroupPolicy>

public fun EventUpdateGroupPolicy.toAny(): Any = Any(EventUpdateGroupPolicy.TYPE_URL,
    with(EventUpdateGroupPolicyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventUpdateGroupPolicy>): EventUpdateGroupPolicy {
  if (typeUrl != EventUpdateGroupPolicy.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventSubmitProposalConverter : ProtobufConverter<EventSubmitProposal>

public fun EventSubmitProposal.toAny(): Any = Any(EventSubmitProposal.TYPE_URL,
    with(EventSubmitProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventSubmitProposal>): EventSubmitProposal {
  if (typeUrl != EventSubmitProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventWithdrawProposalConverter : ProtobufConverter<EventWithdrawProposal>

public fun EventWithdrawProposal.toAny(): Any = Any(EventWithdrawProposal.TYPE_URL,
    with(EventWithdrawProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventWithdrawProposal>): EventWithdrawProposal {
  if (typeUrl != EventWithdrawProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventVoteConverter : ProtobufConverter<EventVote>

public fun EventVote.toAny(): Any = Any(EventVote.TYPE_URL, with(EventVoteConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<EventVote>): EventVote {
  if (typeUrl != EventVote.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventExecConverter : ProtobufConverter<EventExec>

public fun EventExec.toAny(): Any = Any(EventExec.TYPE_URL, with(EventExecConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<EventExec>): EventExec {
  if (typeUrl != EventExec.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventLeaveGroupConverter : ProtobufConverter<EventLeaveGroup>

public fun EventLeaveGroup.toAny(): Any = Any(EventLeaveGroup.TYPE_URL,
    with(EventLeaveGroupConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventLeaveGroup>): EventLeaveGroup {
  if (typeUrl != EventLeaveGroup.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventProposalPrunedConverter : ProtobufConverter<EventProposalPruned>

public fun EventProposalPruned.toAny(): Any = Any(EventProposalPruned.TYPE_URL,
    with(EventProposalPrunedConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventProposalPruned>): EventProposalPruned {
  if (typeUrl != EventProposalPruned.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
