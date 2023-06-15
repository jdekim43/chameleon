// Transform from cosmos/crypto/multisig/v1beta1/multisig.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.multisig.v1beta1

import kotlin.ByteArray
import kotlin.String
import kotlin.UInt
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

@Serializable(with = MultiSignature.KotlinxSerializer::class)
@SerialName(value = MultiSignature.TYPE_URL)
public data class MultiSignature(
  @ProtobufIndex(index = 1)
  public val signatures: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.crypto.multisig.v1beta1.MultiSignature"
  }

  public object KotlinxSerializer : KSerializer<MultiSignature> {
    private val delegator: KSerializer<MultiSignature> = MultiSignature.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MultiSignature): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MultiSignatureConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MultiSignature {
      if (decoder is ProtobufMapperDecoder) {
        return MultiSignatureConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CompactBitArray.KotlinxSerializer::class)
@SerialName(value = CompactBitArray.TYPE_URL)
public data class CompactBitArray(
  @ProtobufIndex(index = 1)
  public val extraBitsStored: UInt,
  @ProtobufIndex(index = 2)
  public val elems: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.crypto.multisig.v1beta1.CompactBitArray"
  }

  public object KotlinxSerializer : KSerializer<CompactBitArray> {
    private val delegator: KSerializer<CompactBitArray> = CompactBitArray.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CompactBitArray): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CompactBitArrayConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CompactBitArray {
      if (decoder is ProtobufMapperDecoder) {
        return CompactBitArrayConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
