// Transform from cosmwasm/wasm/v1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kotlin.Boolean
import kotlin.ByteArray
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

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = GenesisState.TYPE_URL)
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val params: Params,
  @ProtobufIndex(index = 2)
  public val codes: List<Code>,
  @ProtobufIndex(index = 3)
  public val contracts: List<Contract>,
  @ProtobufIndex(index = 4)
  public val sequences: List<Sequence>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.GenesisState"
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

@Serializable(with = Code.KotlinxSerializer::class)
@SerialName(value = Code.TYPE_URL)
public data class Code(
  @ProtobufIndex(index = 1)
  public val codeId: ULong,
  @ProtobufIndex(index = 2)
  public val codeInfo: CodeInfo,
  @ProtobufIndex(index = 3)
  public val codeBytes: ByteArray,
  @ProtobufIndex(index = 4)
  public val pinned: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.Code"
  }

  public object KotlinxSerializer : KSerializer<Code> {
    private val delegator: KSerializer<Code> = Code.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Code): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CodeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Code {
      if (decoder is ProtobufMapperDecoder) {
        return CodeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Contract.KotlinxSerializer::class)
@SerialName(value = Contract.TYPE_URL)
public data class Contract(
  @ProtobufIndex(index = 1)
  public val contractAddress: String,
  @ProtobufIndex(index = 2)
  public val contractInfo: ContractInfo,
  @ProtobufIndex(index = 3)
  public val contractState: List<Model>,
  @ProtobufIndex(index = 4)
  public val contractCodeHistory: List<ContractCodeHistoryEntry>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.Contract"
  }

  public object KotlinxSerializer : KSerializer<Contract> {
    private val delegator: KSerializer<Contract> = Contract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Contract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Contract {
      if (decoder is ProtobufMapperDecoder) {
        return ContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Sequence.KotlinxSerializer::class)
@SerialName(value = Sequence.TYPE_URL)
public data class Sequence(
  @ProtobufIndex(index = 1)
  public val idKey: ByteArray,
  @ProtobufIndex(index = 2)
  public val `value`: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.Sequence"
  }

  public object KotlinxSerializer : KSerializer<Sequence> {
    private val delegator: KSerializer<Sequence> = Sequence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Sequence): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SequenceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Sequence {
      if (decoder is ProtobufMapperDecoder) {
        return SequenceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
