// Transform from alliance/gov.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Duration
import kotlin.String
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

@Serializable(with = MsgCreateAllianceProposal.KotlinxSerializer::class)
@SerialName(value = MsgCreateAllianceProposal.TYPE_URL)
public data class MsgCreateAllianceProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val denom: String,
  @ProtobufIndex(index = 4)
  public val rewardWeight: String,
  @ProtobufIndex(index = 5)
  public val takeRate: String,
  @ProtobufIndex(index = 6)
  public val rewardChangeRate: String,
  @ProtobufIndex(index = 7)
  public val rewardChangeInterval: Duration,
  @ProtobufIndex(index = 8)
  public val rewardWeightRange: RewardWeightRange,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.MsgCreateAllianceProposal"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateAllianceProposal> {
    private val delegator: KSerializer<MsgCreateAllianceProposal> =
        MsgCreateAllianceProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateAllianceProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateAllianceProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateAllianceProposal {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateAllianceProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateAllianceProposal.KotlinxSerializer::class)
@SerialName(value = MsgUpdateAllianceProposal.TYPE_URL)
public data class MsgUpdateAllianceProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val denom: String,
  @ProtobufIndex(index = 4)
  public val rewardWeight: String,
  @ProtobufIndex(index = 5)
  public val takeRate: String,
  @ProtobufIndex(index = 6)
  public val rewardChangeRate: String,
  @ProtobufIndex(index = 7)
  public val rewardChangeInterval: Duration,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.MsgUpdateAllianceProposal"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateAllianceProposal> {
    private val delegator: KSerializer<MsgUpdateAllianceProposal> =
        MsgUpdateAllianceProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateAllianceProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateAllianceProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateAllianceProposal {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateAllianceProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDeleteAllianceProposal.KotlinxSerializer::class)
@SerialName(value = MsgDeleteAllianceProposal.TYPE_URL)
public data class MsgDeleteAllianceProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.MsgDeleteAllianceProposal"
  }

  public object KotlinxSerializer : KSerializer<MsgDeleteAllianceProposal> {
    private val delegator: KSerializer<MsgDeleteAllianceProposal> =
        MsgDeleteAllianceProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDeleteAllianceProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDeleteAllianceProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDeleteAllianceProposal {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDeleteAllianceProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
