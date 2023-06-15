// Transform from cosmos/slashing/v1beta1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import kotlin.Boolean
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

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = GenesisState.TYPE_URL)
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val params: Params,
  @ProtobufIndex(index = 2)
  public val signingInfos: List<SigningInfo>,
  @ProtobufIndex(index = 3)
  public val missedBlocks: List<ValidatorMissedBlocks>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.GenesisState"
  }

  public object KotlinxSerializer : KSerializer<GenesisState> {
    private val delegator: KSerializer<GenesisState> = GenesisState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenesisState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GenesisStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenesisState {
      if (decoder is ProtobufMapperDecoder) {
        return GenesisStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SigningInfo.KotlinxSerializer::class)
@SerialName(value = SigningInfo.TYPE_URL)
public data class SigningInfo(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val validatorSigningInfo: ValidatorSigningInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.SigningInfo"
  }

  public object KotlinxSerializer : KSerializer<SigningInfo> {
    private val delegator: KSerializer<SigningInfo> = SigningInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SigningInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SigningInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SigningInfo {
      if (decoder is ProtobufMapperDecoder) {
        return SigningInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorMissedBlocks.KotlinxSerializer::class)
@SerialName(value = ValidatorMissedBlocks.TYPE_URL)
public data class ValidatorMissedBlocks(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val missedBlocks: List<MissedBlock>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.ValidatorMissedBlocks"
  }

  public object KotlinxSerializer : KSerializer<ValidatorMissedBlocks> {
    private val delegator: KSerializer<ValidatorMissedBlocks> = ValidatorMissedBlocks.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorMissedBlocks): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorMissedBlocksConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorMissedBlocks {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorMissedBlocksConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MissedBlock.KotlinxSerializer::class)
@SerialName(value = MissedBlock.TYPE_URL)
public data class MissedBlock(
  @ProtobufIndex(index = 1)
  public val index: Long,
  @ProtobufIndex(index = 2)
  public val missed: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.slashing.v1beta1.MissedBlock"
  }

  public object KotlinxSerializer : KSerializer<MissedBlock> {
    private val delegator: KSerializer<MissedBlock> = MissedBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MissedBlock): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MissedBlockConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MissedBlock {
      if (decoder is ProtobufMapperDecoder) {
        return MissedBlockConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
