// Transform from cosmos/group/v1/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import google.protobuf.Any
import google.protobuf.Duration
import google.protobuf.Timestamp
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.type.ProtobufMessage

@Serializable
@SerialName(value = "/cosmos.group.v1.VoteOption")
public enum class VoteOption(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  VOTE_OPTION_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  VOTE_OPTION_YES(1),
  @ProtobufIndex(index = 2)
  VOTE_OPTION_ABSTAIN(2),
  @ProtobufIndex(index = 3)
  VOTE_OPTION_NO(3),
  @ProtobufIndex(index = 4)
  VOTE_OPTION_NO_WITH_VETO(4),
  ;

  public companion object {
    public fun forNumber(number: Int): VoteOption = VoteOption.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/cosmos.group.v1.ProposalStatus")
public enum class ProposalStatus(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  PROPOSAL_STATUS_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  PROPOSAL_STATUS_SUBMITTED(1),
  @ProtobufIndex(index = 2)
  PROPOSAL_STATUS_ACCEPTED(2),
  @ProtobufIndex(index = 3)
  PROPOSAL_STATUS_REJECTED(3),
  @ProtobufIndex(index = 4)
  PROPOSAL_STATUS_ABORTED(4),
  @ProtobufIndex(index = 5)
  PROPOSAL_STATUS_WITHDRAWN(5),
  ;

  public companion object {
    public fun forNumber(number: Int): ProposalStatus = ProposalStatus.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/cosmos.group.v1.ProposalExecutorResult")
public enum class ProposalExecutorResult(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  PROPOSAL_EXECUTOR_RESULT_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  PROPOSAL_EXECUTOR_RESULT_NOT_RUN(1),
  @ProtobufIndex(index = 2)
  PROPOSAL_EXECUTOR_RESULT_SUCCESS(2),
  @ProtobufIndex(index = 3)
  PROPOSAL_EXECUTOR_RESULT_FAILURE(3),
  ;

  public companion object {
    public fun forNumber(number: Int): ProposalExecutorResult = ProposalExecutorResult.values()
    	.first { it.number == number }
  }
}

@Serializable(with = Member.KotlinxSerializer::class)
@SerialName(value = Member.TYPE_URL)
public data class Member(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val weight: String,
  @ProtobufIndex(index = 3)
  public val metadata: String,
  @ProtobufIndex(index = 4)
  public val addedAt: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.Member"
  }

  public object KotlinxSerializer : KSerializer<Member> {
    private val delegator: KSerializer<Member> = Member.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Member): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MemberConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Member {
      if (decoder is ProtobufMapperDecoder) {
        return MemberConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MemberRequest.KotlinxSerializer::class)
@SerialName(value = MemberRequest.TYPE_URL)
public data class MemberRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val weight: String,
  @ProtobufIndex(index = 3)
  public val metadata: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.MemberRequest"
  }

  public object KotlinxSerializer : KSerializer<MemberRequest> {
    private val delegator: KSerializer<MemberRequest> = MemberRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MemberRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MemberRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MemberRequest {
      if (decoder is ProtobufMapperDecoder) {
        return MemberRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ThresholdDecisionPolicy.KotlinxSerializer::class)
@SerialName(value = ThresholdDecisionPolicy.TYPE_URL)
public data class ThresholdDecisionPolicy(
  @ProtobufIndex(index = 1)
  public val threshold: String,
  @ProtobufIndex(index = 2)
  public val windows: DecisionPolicyWindows,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.ThresholdDecisionPolicy"
  }

  public object KotlinxSerializer : KSerializer<ThresholdDecisionPolicy> {
    private val delegator: KSerializer<ThresholdDecisionPolicy> =
        ThresholdDecisionPolicy.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ThresholdDecisionPolicy): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ThresholdDecisionPolicyConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ThresholdDecisionPolicy {
      if (decoder is ProtobufMapperDecoder) {
        return ThresholdDecisionPolicyConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PercentageDecisionPolicy.KotlinxSerializer::class)
@SerialName(value = PercentageDecisionPolicy.TYPE_URL)
public data class PercentageDecisionPolicy(
  @ProtobufIndex(index = 1)
  public val percentage: String,
  @ProtobufIndex(index = 2)
  public val windows: DecisionPolicyWindows,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.PercentageDecisionPolicy"
  }

  public object KotlinxSerializer : KSerializer<PercentageDecisionPolicy> {
    private val delegator: KSerializer<PercentageDecisionPolicy> =
        PercentageDecisionPolicy.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PercentageDecisionPolicy): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PercentageDecisionPolicyConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PercentageDecisionPolicy {
      if (decoder is ProtobufMapperDecoder) {
        return PercentageDecisionPolicyConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DecisionPolicyWindows.KotlinxSerializer::class)
@SerialName(value = DecisionPolicyWindows.TYPE_URL)
public data class DecisionPolicyWindows(
  @ProtobufIndex(index = 1)
  public val votingPeriod: Duration,
  @ProtobufIndex(index = 2)
  public val minExecutionPeriod: Duration,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.DecisionPolicyWindows"
  }

  public object KotlinxSerializer : KSerializer<DecisionPolicyWindows> {
    private val delegator: KSerializer<DecisionPolicyWindows> = DecisionPolicyWindows.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DecisionPolicyWindows): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DecisionPolicyWindowsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DecisionPolicyWindows {
      if (decoder is ProtobufMapperDecoder) {
        return DecisionPolicyWindowsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GroupInfo.KotlinxSerializer::class)
@SerialName(value = GroupInfo.TYPE_URL)
public data class GroupInfo(
  @ProtobufIndex(index = 1)
  public val id: ULong,
  @ProtobufIndex(index = 2)
  public val admin: String,
  @ProtobufIndex(index = 3)
  public val metadata: String,
  @ProtobufIndex(index = 4)
  public val version: ULong,
  @ProtobufIndex(index = 5)
  public val totalWeight: String,
  @ProtobufIndex(index = 6)
  public val createdAt: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.GroupInfo"
  }

  public object KotlinxSerializer : KSerializer<GroupInfo> {
    private val delegator: KSerializer<GroupInfo> = GroupInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GroupInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GroupInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GroupInfo {
      if (decoder is ProtobufMapperDecoder) {
        return GroupInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GroupMember.KotlinxSerializer::class)
@SerialName(value = GroupMember.TYPE_URL)
public data class GroupMember(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
  @ProtobufIndex(index = 2)
  public val member: Member,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.GroupMember"
  }

  public object KotlinxSerializer : KSerializer<GroupMember> {
    private val delegator: KSerializer<GroupMember> = GroupMember.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GroupMember): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GroupMemberConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GroupMember {
      if (decoder is ProtobufMapperDecoder) {
        return GroupMemberConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GroupPolicyInfo.KotlinxSerializer::class)
@SerialName(value = GroupPolicyInfo.TYPE_URL)
public data class GroupPolicyInfo(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val groupId: ULong,
  @ProtobufIndex(index = 3)
  public val admin: String,
  @ProtobufIndex(index = 4)
  public val metadata: String,
  @ProtobufIndex(index = 5)
  public val version: ULong,
  @ProtobufIndex(index = 6)
  public val decisionPolicy: Any,
  @ProtobufIndex(index = 7)
  public val createdAt: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.GroupPolicyInfo"
  }

  public object KotlinxSerializer : KSerializer<GroupPolicyInfo> {
    private val delegator: KSerializer<GroupPolicyInfo> = GroupPolicyInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GroupPolicyInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GroupPolicyInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GroupPolicyInfo {
      if (decoder is ProtobufMapperDecoder) {
        return GroupPolicyInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Proposal.KotlinxSerializer::class)
@SerialName(value = Proposal.TYPE_URL)
public data class Proposal(
  @ProtobufIndex(index = 1)
  public val id: ULong,
  @ProtobufIndex(index = 2)
  public val groupPolicyAddress: String,
  @ProtobufIndex(index = 3)
  public val metadata: String,
  @ProtobufIndex(index = 4)
  public val proposers: List<String>,
  @ProtobufIndex(index = 5)
  public val submitTime: Timestamp,
  @ProtobufIndex(index = 6)
  public val groupVersion: ULong,
  @ProtobufIndex(index = 7)
  public val groupPolicyVersion: ULong,
  @ProtobufIndex(index = 8)
  public val status: ProposalStatus,
  @ProtobufIndex(index = 9)
  public val finalTallyResult: TallyResult,
  @ProtobufIndex(index = 10)
  public val votingPeriodEnd: Timestamp,
  @ProtobufIndex(index = 11)
  public val executorResult: ProposalExecutorResult,
  @ProtobufIndex(index = 12)
  public val messages: List<Any>,
  @ProtobufIndex(index = 13)
  public val title: String,
  @ProtobufIndex(index = 14)
  public val summary: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.Proposal"
  }

  public object KotlinxSerializer : KSerializer<Proposal> {
    private val delegator: KSerializer<Proposal> = Proposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Proposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Proposal {
      if (decoder is ProtobufMapperDecoder) {
        return ProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TallyResult.KotlinxSerializer::class)
@SerialName(value = TallyResult.TYPE_URL)
public data class TallyResult(
  @ProtobufIndex(index = 1)
  public val yesCount: String,
  @ProtobufIndex(index = 2)
  public val abstainCount: String,
  @ProtobufIndex(index = 3)
  public val noCount: String,
  @ProtobufIndex(index = 4)
  public val noWithVetoCount: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.TallyResult"
  }

  public object KotlinxSerializer : KSerializer<TallyResult> {
    private val delegator: KSerializer<TallyResult> = TallyResult.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TallyResult): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TallyResultConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TallyResult {
      if (decoder is ProtobufMapperDecoder) {
        return TallyResultConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Vote.KotlinxSerializer::class)
@SerialName(value = Vote.TYPE_URL)
public data class Vote(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val voter: String,
  @ProtobufIndex(index = 3)
  public val option: VoteOption,
  @ProtobufIndex(index = 4)
  public val metadata: String,
  @ProtobufIndex(index = 5)
  public val submitTime: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.Vote"
  }

  public object KotlinxSerializer : KSerializer<Vote> {
    private val delegator: KSerializer<Vote> = Vote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Vote): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VoteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Vote {
      if (decoder is ProtobufMapperDecoder) {
        return VoteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
