// Transform from tendermint/crypto/proof.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.crypto

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

@Serializable(with = Proof.KotlinxSerializer::class)
@SerialName(value = Proof.TYPE_URL)
public data class Proof(
  @ProtobufIndex(index = 1)
  public val total: Long,
  @ProtobufIndex(index = 2)
  public val index: Long,
  @ProtobufIndex(index = 3)
  public val leafHash: ByteArray,
  @ProtobufIndex(index = 4)
  public val aunts: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.crypto.Proof"
  }

  public object KotlinxSerializer : KSerializer<Proof> {
    private val delegator: KSerializer<Proof> = Proof.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Proof): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProofConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Proof {
      if (decoder is ProtobufMapperDecoder) {
        return ProofConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValueOp.KotlinxSerializer::class)
@SerialName(value = ValueOp.TYPE_URL)
public data class ValueOp(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
  @ProtobufIndex(index = 2)
  public val proof: Proof,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.crypto.ValueOp"
  }

  public object KotlinxSerializer : KSerializer<ValueOp> {
    private val delegator: KSerializer<ValueOp> = ValueOp.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValueOp): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValueOpConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValueOp {
      if (decoder is ProtobufMapperDecoder) {
        return ValueOpConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DominoOp.KotlinxSerializer::class)
@SerialName(value = DominoOp.TYPE_URL)
public data class DominoOp(
  @ProtobufIndex(index = 1)
  public val key: String,
  @ProtobufIndex(index = 2)
  public val input: String,
  @ProtobufIndex(index = 3)
  public val output: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.crypto.DominoOp"
  }

  public object KotlinxSerializer : KSerializer<DominoOp> {
    private val delegator: KSerializer<DominoOp> = DominoOp.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DominoOp): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DominoOpConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DominoOp {
      if (decoder is ProtobufMapperDecoder) {
        return DominoOpConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProofOp.KotlinxSerializer::class)
@SerialName(value = ProofOp.TYPE_URL)
public data class ProofOp(
  @ProtobufIndex(index = 1)
  public val type: String,
  @ProtobufIndex(index = 2)
  public val key: ByteArray,
  @ProtobufIndex(index = 3)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.crypto.ProofOp"
  }

  public object KotlinxSerializer : KSerializer<ProofOp> {
    private val delegator: KSerializer<ProofOp> = ProofOp.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProofOp): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProofOpConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProofOp {
      if (decoder is ProtobufMapperDecoder) {
        return ProofOpConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProofOps.KotlinxSerializer::class)
@SerialName(value = ProofOps.TYPE_URL)
public data class ProofOps(
  @ProtobufIndex(index = 1)
  public val ops: List<ProofOp>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.crypto.ProofOps"
  }

  public object KotlinxSerializer : KSerializer<ProofOps> {
    private val delegator: KSerializer<ProofOps> = ProofOps.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProofOps): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProofOpsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProofOps {
      if (decoder is ProtobufMapperDecoder) {
        return ProofOpsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
