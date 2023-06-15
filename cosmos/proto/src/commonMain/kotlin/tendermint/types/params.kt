// Transform from tendermint/types/params.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import google.protobuf.Duration
import kotlin.Long
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

@Serializable(with = ConsensusParams.KotlinxSerializer::class)
@SerialName(value = ConsensusParams.TYPE_URL)
public data class ConsensusParams(
  @ProtobufIndex(index = 1)
  public val block: BlockParams,
  @ProtobufIndex(index = 2)
  public val evidence: EvidenceParams,
  @ProtobufIndex(index = 3)
  public val validator: ValidatorParams,
  @ProtobufIndex(index = 4)
  public val version: VersionParams,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.ConsensusParams"
  }

  public object KotlinxSerializer : KSerializer<ConsensusParams> {
    private val delegator: KSerializer<ConsensusParams> = ConsensusParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ConsensusParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ConsensusParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ConsensusParams {
      if (decoder is ProtobufMapperDecoder) {
        return ConsensusParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BlockParams.KotlinxSerializer::class)
@SerialName(value = BlockParams.TYPE_URL)
public data class BlockParams(
  @ProtobufIndex(index = 1)
  public val maxBytes: Long,
  @ProtobufIndex(index = 2)
  public val maxGas: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.BlockParams"
  }

  public object KotlinxSerializer : KSerializer<BlockParams> {
    private val delegator: KSerializer<BlockParams> = BlockParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BlockParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockParams {
      if (decoder is ProtobufMapperDecoder) {
        return BlockParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EvidenceParams.KotlinxSerializer::class)
@SerialName(value = EvidenceParams.TYPE_URL)
public data class EvidenceParams(
  @ProtobufIndex(index = 1)
  public val maxAgeNumBlocks: Long,
  @ProtobufIndex(index = 2)
  public val maxAgeDuration: Duration,
  @ProtobufIndex(index = 3)
  public val maxBytes: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.EvidenceParams"
  }

  public object KotlinxSerializer : KSerializer<EvidenceParams> {
    private val delegator: KSerializer<EvidenceParams> = EvidenceParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EvidenceParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EvidenceParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EvidenceParams {
      if (decoder is ProtobufMapperDecoder) {
        return EvidenceParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorParams.KotlinxSerializer::class)
@SerialName(value = ValidatorParams.TYPE_URL)
public data class ValidatorParams(
  @ProtobufIndex(index = 1)
  public val pubKeyTypes: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.ValidatorParams"
  }

  public object KotlinxSerializer : KSerializer<ValidatorParams> {
    private val delegator: KSerializer<ValidatorParams> = ValidatorParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorParams {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = VersionParams.KotlinxSerializer::class)
@SerialName(value = VersionParams.TYPE_URL)
public data class VersionParams(
  @ProtobufIndex(index = 1)
  public val app: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.VersionParams"
  }

  public object KotlinxSerializer : KSerializer<VersionParams> {
    private val delegator: KSerializer<VersionParams> = VersionParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: VersionParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VersionParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): VersionParams {
      if (decoder is ProtobufMapperDecoder) {
        return VersionParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = HashedParams.KotlinxSerializer::class)
@SerialName(value = HashedParams.TYPE_URL)
public data class HashedParams(
  @ProtobufIndex(index = 1)
  public val blockMaxBytes: Long,
  @ProtobufIndex(index = 2)
  public val blockMaxGas: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.HashedParams"
  }

  public object KotlinxSerializer : KSerializer<HashedParams> {
    private val delegator: KSerializer<HashedParams> = HashedParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: HashedParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(HashedParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): HashedParams {
      if (decoder is ProtobufMapperDecoder) {
        return HashedParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
