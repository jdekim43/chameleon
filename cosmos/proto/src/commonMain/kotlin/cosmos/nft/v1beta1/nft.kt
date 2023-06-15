// Transform from cosmos/nft/v1beta1/nft.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import google.protobuf.Any
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

@Serializable(with = Class.KotlinxSerializer::class)
@SerialName(value = Class.TYPE_URL)
public data class Class(
  @ProtobufIndex(index = 1)
  public val id: String,
  @ProtobufIndex(index = 2)
  public val name: String,
  @ProtobufIndex(index = 3)
  public val symbol: String,
  @ProtobufIndex(index = 4)
  public val description: String,
  @ProtobufIndex(index = 5)
  public val uri: String,
  @ProtobufIndex(index = 6)
  public val uriHash: String,
  @ProtobufIndex(index = 7)
  public val `data`: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.nft.v1beta1.Class"
  }

  public object KotlinxSerializer : KSerializer<Class> {
    private val delegator: KSerializer<Class> = Class.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Class): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ClassConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Class {
      if (decoder is ProtobufMapperDecoder) {
        return ClassConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = NFT.KotlinxSerializer::class)
@SerialName(value = NFT.TYPE_URL)
public data class NFT(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val id: String,
  @ProtobufIndex(index = 3)
  public val uri: String,
  @ProtobufIndex(index = 4)
  public val uriHash: String,
  @ProtobufIndex(index = 10)
  public val `data`: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.nft.v1beta1.NFT"
  }

  public object KotlinxSerializer : KSerializer<NFT> {
    private val delegator: KSerializer<NFT> = NFT.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: NFT): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(NFTConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): NFT {
      if (decoder is ProtobufMapperDecoder) {
        return NFTConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
