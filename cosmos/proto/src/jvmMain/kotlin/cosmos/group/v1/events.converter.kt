// Transform from cosmos/group/v1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object EventCreateGroupConverter : ProtobufConverter<EventCreateGroup> by
    EventCreateGroupJvmConverter

public actual object EventUpdateGroupConverter : ProtobufConverter<EventUpdateGroup> by
    EventUpdateGroupJvmConverter

public actual object EventCreateGroupPolicyConverter : ProtobufConverter<EventCreateGroupPolicy> by
    EventCreateGroupPolicyJvmConverter

public actual object EventUpdateGroupPolicyConverter : ProtobufConverter<EventUpdateGroupPolicy> by
    EventUpdateGroupPolicyJvmConverter

public actual object EventSubmitProposalConverter : ProtobufConverter<EventSubmitProposal> by
    EventSubmitProposalJvmConverter

public actual object EventWithdrawProposalConverter : ProtobufConverter<EventWithdrawProposal> by
    EventWithdrawProposalJvmConverter

public actual object EventVoteConverter : ProtobufConverter<EventVote> by EventVoteJvmConverter

public actual object EventExecConverter : ProtobufConverter<EventExec> by EventExecJvmConverter

public actual object EventLeaveGroupConverter : ProtobufConverter<EventLeaveGroup> by
    EventLeaveGroupJvmConverter

public actual object EventProposalPrunedConverter : ProtobufConverter<EventProposalPruned> by
    EventProposalPrunedJvmConverter
