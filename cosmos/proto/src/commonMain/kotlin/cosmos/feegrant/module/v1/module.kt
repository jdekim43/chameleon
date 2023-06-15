// Transform from cosmos/feegrant/module/v1/module.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.module.v1

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.type.ProtobufMessage

@Serializable(with = Module.KotlinxSerializer::class)
@SerialName(value = Module.TYPE_URL)
public class Module() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.module.v1.Module"
  }

  public object KotlinxSerializer : KSerializer<Module> {
    private val delegator: KSerializer<Module> = Module.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Module): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModuleConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Module {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
