// Transform from cosmos/tx/config/v1/config.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.config.v1

import kotlin.Boolean
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

@Serializable(with = Config.KotlinxSerializer::class)
@SerialName(value = Config.TYPE_URL)
public data class Config(
  @ProtobufIndex(index = 1)
  public val skipAnteHandler: Boolean,
  @ProtobufIndex(index = 2)
  public val skipPostHandler: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.config.v1.Config"
  }

  public object KotlinxSerializer : KSerializer<Config> {
    private val delegator: KSerializer<Config> = Config.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Config): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ConfigConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Config {
      if (decoder is ProtobufMapperDecoder) {
        return ConfigConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
