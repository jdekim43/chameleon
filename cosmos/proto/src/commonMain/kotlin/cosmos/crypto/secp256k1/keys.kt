// Transform from cosmos/crypto/secp256k1/keys.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.secp256k1

import kotlin.ByteArray
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

@Serializable(with = PubKey.KotlinxSerializer::class)
@SerialName(value = PubKey.TYPE_URL)
public data class PubKey(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.crypto.secp256k1.PubKey"
  }

  public object KotlinxSerializer : KSerializer<PubKey> {
    private val delegator: KSerializer<PubKey> = PubKey.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PubKey): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PubKeyConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PubKey {
      if (decoder is ProtobufMapperDecoder) {
        return PubKeyConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PrivKey.KotlinxSerializer::class)
@SerialName(value = PrivKey.TYPE_URL)
public data class PrivKey(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.crypto.secp256k1.PrivKey"
  }

  public object KotlinxSerializer : KSerializer<PrivKey> {
    private val delegator: KSerializer<PrivKey> = PrivKey.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PrivKey): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PrivKeyConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PrivKey {
      if (decoder is ProtobufMapperDecoder) {
        return PrivKeyConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
