// Transform from cosmos/group/v1/events.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import kotlin.String
import kotlin.ULong
import kotlin.Unit
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

@Serializable(with = EventCreateGroup.KotlinxSerializer::class)
@SerialName(value = EventCreateGroup.TYPE_URL)
public data class EventCreateGroup(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.EventCreateGroup"
  }

  public object KotlinxSerializer : KSerializer<EventCreateGroup> {
    private val delegator: KSerializer<EventCreateGroup> = EventCreateGroup.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventCreateGroup): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventCreateGroupConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventCreateGroup {
      if (decoder is ProtobufMapperDecoder) {
        return EventCreateGroupConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventUpdateGroup.KotlinxSerializer::class)
@SerialName(value = EventUpdateGroup.TYPE_URL)
public data class EventUpdateGroup(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.EventUpdateGroup"
  }

  public object KotlinxSerializer : KSerializer<EventUpdateGroup> {
    private val delegator: KSerializer<EventUpdateGroup> = EventUpdateGroup.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventUpdateGroup): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventUpdateGroupConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventUpdateGroup {
      if (decoder is ProtobufMapperDecoder) {
        return EventUpdateGroupConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventCreateGroupPolicy.KotlinxSerializer::class)
@SerialName(value = EventCreateGroupPolicy.TYPE_URL)
public data class EventCreateGroupPolicy(
  @ProtobufIndex(index = 1)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.EventCreateGroupPolicy"
  }

  public object KotlinxSerializer : KSerializer<EventCreateGroupPolicy> {
    private val delegator: KSerializer<EventCreateGroupPolicy> = EventCreateGroupPolicy.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventCreateGroupPolicy): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventCreateGroupPolicyConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventCreateGroupPolicy {
      if (decoder is ProtobufMapperDecoder) {
        return EventCreateGroupPolicyConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventUpdateGroupPolicy.KotlinxSerializer::class)
@SerialName(value = EventUpdateGroupPolicy.TYPE_URL)
public data class EventUpdateGroupPolicy(
  @ProtobufIndex(index = 1)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.EventUpdateGroupPolicy"
  }

  public object KotlinxSerializer : KSerializer<EventUpdateGroupPolicy> {
    private val delegator: KSerializer<EventUpdateGroupPolicy> = EventUpdateGroupPolicy.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventUpdateGroupPolicy): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventUpdateGroupPolicyConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventUpdateGroupPolicy {
      if (decoder is ProtobufMapperDecoder) {
        return EventUpdateGroupPolicyConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventSubmitProposal.KotlinxSerializer::class)
@SerialName(value = EventSubmitProposal.TYPE_URL)
public data class EventSubmitProposal(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.EventSubmitProposal"
  }

  public object KotlinxSerializer : KSerializer<EventSubmitProposal> {
    private val delegator: KSerializer<EventSubmitProposal> = EventSubmitProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSubmitProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventSubmitProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSubmitProposal {
      if (decoder is ProtobufMapperDecoder) {
        return EventSubmitProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventWithdrawProposal.KotlinxSerializer::class)
@SerialName(value = EventWithdrawProposal.TYPE_URL)
public data class EventWithdrawProposal(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.EventWithdrawProposal"
  }

  public object KotlinxSerializer : KSerializer<EventWithdrawProposal> {
    private val delegator: KSerializer<EventWithdrawProposal> = EventWithdrawProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventWithdrawProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventWithdrawProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventWithdrawProposal {
      if (decoder is ProtobufMapperDecoder) {
        return EventWithdrawProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventVote.KotlinxSerializer::class)
@SerialName(value = EventVote.TYPE_URL)
public data class EventVote(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.EventVote"
  }

  public object KotlinxSerializer : KSerializer<EventVote> {
    private val delegator: KSerializer<EventVote> = EventVote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventVote): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventVoteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventVote {
      if (decoder is ProtobufMapperDecoder) {
        return EventVoteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventExec.KotlinxSerializer::class)
@SerialName(value = EventExec.TYPE_URL)
public data class EventExec(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val result: ProposalExecutorResult,
  @ProtobufIndex(index = 3)
  public val logs: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.EventExec"
  }

  public object KotlinxSerializer : KSerializer<EventExec> {
    private val delegator: KSerializer<EventExec> = EventExec.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventExec): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventExecConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventExec {
      if (decoder is ProtobufMapperDecoder) {
        return EventExecConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventLeaveGroup.KotlinxSerializer::class)
@SerialName(value = EventLeaveGroup.TYPE_URL)
public data class EventLeaveGroup(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
  @ProtobufIndex(index = 2)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.EventLeaveGroup"
  }

  public object KotlinxSerializer : KSerializer<EventLeaveGroup> {
    private val delegator: KSerializer<EventLeaveGroup> = EventLeaveGroup.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventLeaveGroup): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventLeaveGroupConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventLeaveGroup {
      if (decoder is ProtobufMapperDecoder) {
        return EventLeaveGroupConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventProposalPruned.KotlinxSerializer::class)
@SerialName(value = EventProposalPruned.TYPE_URL)
public data class EventProposalPruned(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val status: ProposalStatus,
  @ProtobufIndex(index = 3)
  public val tallyResult: TallyResult,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.EventProposalPruned"
  }

  public object KotlinxSerializer : KSerializer<EventProposalPruned> {
    private val delegator: KSerializer<EventProposalPruned> = EventProposalPruned.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventProposalPruned): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventProposalPrunedConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventProposalPruned {
      if (decoder is ProtobufMapperDecoder) {
        return EventProposalPrunedConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
