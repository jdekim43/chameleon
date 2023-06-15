// Transform from tendermint/types/evidence.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import google.protobuf.Timestamp
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmInline
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

@Serializable(with = Evidence.KotlinxSerializer::class)
@SerialName(value = Evidence.TYPE_URL)
public data class Evidence(
  public val sum: SumOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.Evidence"
  }

  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class DuplicateVoteEvidence(
      @ProtobufIndex(index = 1)
      public val `value`: tendermint.types.DuplicateVoteEvidence,
    ) : SumOneOf

    @JvmInline
    public value class LightClientAttackEvidence(
      @ProtobufIndex(index = 2)
      public val `value`: tendermint.types.LightClientAttackEvidence,
    ) : SumOneOf
  }

  public object KotlinxSerializer : KSerializer<Evidence> {
    private val delegator: KSerializer<Evidence> = Evidence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Evidence): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EvidenceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Evidence {
      if (decoder is ProtobufMapperDecoder) {
        return EvidenceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DuplicateVoteEvidence.KotlinxSerializer::class)
@SerialName(value = DuplicateVoteEvidence.TYPE_URL)
public data class DuplicateVoteEvidence(
  @ProtobufIndex(index = 1)
  public val voteA: Vote,
  @ProtobufIndex(index = 2)
  public val voteB: Vote,
  @ProtobufIndex(index = 3)
  public val totalVotingPower: Long,
  @ProtobufIndex(index = 4)
  public val validatorPower: Long,
  @ProtobufIndex(index = 5)
  public val timestamp: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.DuplicateVoteEvidence"
  }

  public object KotlinxSerializer : KSerializer<DuplicateVoteEvidence> {
    private val delegator: KSerializer<DuplicateVoteEvidence> = DuplicateVoteEvidence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DuplicateVoteEvidence): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DuplicateVoteEvidenceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DuplicateVoteEvidence {
      if (decoder is ProtobufMapperDecoder) {
        return DuplicateVoteEvidenceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = LightClientAttackEvidence.KotlinxSerializer::class)
@SerialName(value = LightClientAttackEvidence.TYPE_URL)
public data class LightClientAttackEvidence(
  @ProtobufIndex(index = 1)
  public val conflictingBlock: LightBlock,
  @ProtobufIndex(index = 2)
  public val commonHeight: Long,
  @ProtobufIndex(index = 3)
  public val byzantineValidators: List<Validator>,
  @ProtobufIndex(index = 4)
  public val totalVotingPower: Long,
  @ProtobufIndex(index = 5)
  public val timestamp: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.LightClientAttackEvidence"
  }

  public object KotlinxSerializer : KSerializer<LightClientAttackEvidence> {
    private val delegator: KSerializer<LightClientAttackEvidence> =
        LightClientAttackEvidence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LightClientAttackEvidence): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(LightClientAttackEvidenceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LightClientAttackEvidence {
      if (decoder is ProtobufMapperDecoder) {
        return LightClientAttackEvidenceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EvidenceList.KotlinxSerializer::class)
@SerialName(value = EvidenceList.TYPE_URL)
public data class EvidenceList(
  @ProtobufIndex(index = 1)
  public val evidence: List<Evidence>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.EvidenceList"
  }

  public object KotlinxSerializer : KSerializer<EvidenceList> {
    private val delegator: KSerializer<EvidenceList> = EvidenceList.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EvidenceList): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EvidenceListConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EvidenceList {
      if (decoder is ProtobufMapperDecoder) {
        return EvidenceListConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
