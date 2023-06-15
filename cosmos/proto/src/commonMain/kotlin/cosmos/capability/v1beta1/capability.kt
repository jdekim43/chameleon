// Transform from cosmos/capability/v1beta1/capability.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.capability.v1beta1

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

@Serializable(with = Capability.KotlinxSerializer::class)
@SerialName(value = Capability.TYPE_URL)
public data class Capability(
  @ProtobufIndex(index = 1)
  public val index: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.capability.v1beta1.Capability"
  }

  public object KotlinxSerializer : KSerializer<Capability> {
    private val delegator: KSerializer<Capability> = Capability.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Capability): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CapabilityConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Capability {
      if (decoder is ProtobufMapperDecoder) {
        return CapabilityConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Owner.KotlinxSerializer::class)
@SerialName(value = Owner.TYPE_URL)
public data class Owner(
  @ProtobufIndex(index = 1)
  public val module: String,
  @ProtobufIndex(index = 2)
  public val name: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.capability.v1beta1.Owner"
  }

  public object KotlinxSerializer : KSerializer<Owner> {
    private val delegator: KSerializer<Owner> = Owner.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Owner): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OwnerConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Owner {
      if (decoder is ProtobufMapperDecoder) {
        return OwnerConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CapabilityOwners.KotlinxSerializer::class)
@SerialName(value = CapabilityOwners.TYPE_URL)
public data class CapabilityOwners(
  @ProtobufIndex(index = 1)
  public val owners: List<Owner>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.capability.v1beta1.CapabilityOwners"
  }

  public object KotlinxSerializer : KSerializer<CapabilityOwners> {
    private val delegator: KSerializer<CapabilityOwners> = CapabilityOwners.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CapabilityOwners): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CapabilityOwnersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CapabilityOwners {
      if (decoder is ProtobufMapperDecoder) {
        return CapabilityOwnersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
