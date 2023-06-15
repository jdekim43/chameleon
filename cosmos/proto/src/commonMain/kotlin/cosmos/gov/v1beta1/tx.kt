// Transform from cosmos/gov/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1beta1

import cosmos.base.v1beta1.Coin
import google.protobuf.Any
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

@Serializable(with = MsgSubmitProposal.KotlinxSerializer::class)
@SerialName(value = MsgSubmitProposal.TYPE_URL)
public data class MsgSubmitProposal(
  @ProtobufIndex(index = 1)
  public val content: Any,
  @ProtobufIndex(index = 2)
  public val initialDeposit: List<Coin>,
  @ProtobufIndex(index = 3)
  public val proposer: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.MsgSubmitProposal"
  }

  public object KotlinxSerializer : KSerializer<MsgSubmitProposal> {
    private val delegator: KSerializer<MsgSubmitProposal> = MsgSubmitProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubmitProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSubmitProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubmitProposal {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubmitProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSubmitProposalResponse.KotlinxSerializer::class)
@SerialName(value = MsgSubmitProposalResponse.TYPE_URL)
public data class MsgSubmitProposalResponse(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.MsgSubmitProposalResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSubmitProposalResponse> {
    private val delegator: KSerializer<MsgSubmitProposalResponse> =
        MsgSubmitProposalResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubmitProposalResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSubmitProposalResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubmitProposalResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubmitProposalResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVote.KotlinxSerializer::class)
@SerialName(value = MsgVote.TYPE_URL)
public data class MsgVote(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val voter: String,
  @ProtobufIndex(index = 3)
  public val option: VoteOption,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.MsgVote"
  }

  public object KotlinxSerializer : KSerializer<MsgVote> {
    private val delegator: KSerializer<MsgVote> = MsgVote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVote): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgVoteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVote {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVoteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVoteResponse.KotlinxSerializer::class)
@SerialName(value = MsgVoteResponse.TYPE_URL)
public class MsgVoteResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.MsgVoteResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgVoteResponse> {
    private val delegator: KSerializer<MsgVoteResponse> = MsgVoteResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVoteResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgVoteResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVoteResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVoteResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVoteWeighted.KotlinxSerializer::class)
@SerialName(value = MsgVoteWeighted.TYPE_URL)
public data class MsgVoteWeighted(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val voter: String,
  @ProtobufIndex(index = 3)
  public val options: List<WeightedVoteOption>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.MsgVoteWeighted"
  }

  public object KotlinxSerializer : KSerializer<MsgVoteWeighted> {
    private val delegator: KSerializer<MsgVoteWeighted> = MsgVoteWeighted.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVoteWeighted): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgVoteWeightedConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVoteWeighted {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVoteWeightedConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVoteWeightedResponse.KotlinxSerializer::class)
@SerialName(value = MsgVoteWeightedResponse.TYPE_URL)
public class MsgVoteWeightedResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.MsgVoteWeightedResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgVoteWeightedResponse> {
    private val delegator: KSerializer<MsgVoteWeightedResponse> =
        MsgVoteWeightedResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVoteWeightedResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgVoteWeightedResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVoteWeightedResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVoteWeightedResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDeposit.KotlinxSerializer::class)
@SerialName(value = MsgDeposit.TYPE_URL)
public data class MsgDeposit(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val depositor: String,
  @ProtobufIndex(index = 3)
  public val amount: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.MsgDeposit"
  }

  public object KotlinxSerializer : KSerializer<MsgDeposit> {
    private val delegator: KSerializer<MsgDeposit> = MsgDeposit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDeposit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDepositConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDeposit {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDepositConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDepositResponse.KotlinxSerializer::class)
@SerialName(value = MsgDepositResponse.TYPE_URL)
public class MsgDepositResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.MsgDepositResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgDepositResponse> {
    private val delegator: KSerializer<MsgDepositResponse> = MsgDepositResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDepositResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDepositResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDepositResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDepositResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
