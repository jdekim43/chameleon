// Transform from cosmos_proto/cosmos.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos_proto

import kotlin.Int
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

@Serializable
@SerialName(value = "/cosmos_proto.ScalarType")
public enum class ScalarType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  SCALAR_TYPE_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  SCALAR_TYPE_STRING(1),
  @ProtobufIndex(index = 2)
  SCALAR_TYPE_BYTES(2),
  ;

  public companion object {
    public fun forNumber(number: Int): ScalarType = ScalarType.values()
    	.first { it.number == number }
  }
}

@Serializable(with = InterfaceDescriptor.KotlinxSerializer::class)
@SerialName(value = InterfaceDescriptor.TYPE_URL)
public data class InterfaceDescriptor(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val description: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos_proto.InterfaceDescriptor"
  }

  public object KotlinxSerializer : KSerializer<InterfaceDescriptor> {
    private val delegator: KSerializer<InterfaceDescriptor> = InterfaceDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: InterfaceDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(InterfaceDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): InterfaceDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return InterfaceDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ScalarDescriptor.KotlinxSerializer::class)
@SerialName(value = ScalarDescriptor.TYPE_URL)
public data class ScalarDescriptor(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val fieldType: List<ScalarType>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos_proto.ScalarDescriptor"
  }

  public object KotlinxSerializer : KSerializer<ScalarDescriptor> {
    private val delegator: KSerializer<ScalarDescriptor> = ScalarDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ScalarDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ScalarDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ScalarDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return ScalarDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
