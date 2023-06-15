// Transform from cosmos/crypto/hd/v1/hd.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.hd.v1

import kotlin.Boolean
import kotlin.String
import kotlin.UInt
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

@Serializable(with = BIP44Params.KotlinxSerializer::class)
@SerialName(value = BIP44Params.TYPE_URL)
public data class BIP44Params(
  @ProtobufIndex(index = 1)
  public val purpose: UInt,
  @ProtobufIndex(index = 2)
  public val coinType: UInt,
  @ProtobufIndex(index = 3)
  public val account: UInt,
  @ProtobufIndex(index = 4)
  public val change: Boolean,
  @ProtobufIndex(index = 5)
  public val addressIndex: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.crypto.hd.v1.BIP44Params"
  }

  public object KotlinxSerializer : KSerializer<BIP44Params> {
    private val delegator: KSerializer<BIP44Params> = BIP44Params.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BIP44Params): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BIP44ParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BIP44Params {
      if (decoder is ProtobufMapperDecoder) {
        return BIP44ParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
