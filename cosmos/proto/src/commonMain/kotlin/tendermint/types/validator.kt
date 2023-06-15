// Transform from tendermint/types/validator.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import kotlin.ByteArray
import kotlin.Long
import kotlin.String
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
import tendermint.crypto.PublicKey

@Serializable(with = ValidatorSet.KotlinxSerializer::class)
@SerialName(value = ValidatorSet.TYPE_URL)
public data class ValidatorSet(
  @ProtobufIndex(index = 1)
  public val validators: List<Validator>,
  @ProtobufIndex(index = 2)
  public val proposer: Validator,
  @ProtobufIndex(index = 3)
  public val totalVotingPower: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.ValidatorSet"
  }

  public object KotlinxSerializer : KSerializer<ValidatorSet> {
    private val delegator: KSerializer<ValidatorSet> = ValidatorSet.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorSet): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorSetConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorSet {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorSetConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Validator.KotlinxSerializer::class)
@SerialName(value = Validator.TYPE_URL)
public data class Validator(
  @ProtobufIndex(index = 1)
  public val address: ByteArray,
  @ProtobufIndex(index = 2)
  public val pubKey: PublicKey,
  @ProtobufIndex(index = 3)
  public val votingPower: Long,
  @ProtobufIndex(index = 4)
  public val proposerPriority: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.Validator"
  }

  public object KotlinxSerializer : KSerializer<Validator> {
    private val delegator: KSerializer<Validator> = Validator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Validator): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Validator {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SimpleValidator.KotlinxSerializer::class)
@SerialName(value = SimpleValidator.TYPE_URL)
public data class SimpleValidator(
  @ProtobufIndex(index = 1)
  public val pubKey: PublicKey,
  @ProtobufIndex(index = 2)
  public val votingPower: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.SimpleValidator"
  }

  public object KotlinxSerializer : KSerializer<SimpleValidator> {
    private val delegator: KSerializer<SimpleValidator> = SimpleValidator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SimpleValidator): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SimpleValidatorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SimpleValidator {
      if (decoder is ProtobufMapperDecoder) {
        return SimpleValidatorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
