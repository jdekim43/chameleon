// Transform from cosmos/capability/v1beta1/genesis.proto
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

@Serializable(with = GenesisOwners.KotlinxSerializer::class)
@SerialName(value = GenesisOwners.TYPE_URL)
public data class GenesisOwners(
  @ProtobufIndex(index = 1)
  public val index: ULong,
  @ProtobufIndex(index = 2)
  public val indexOwners: CapabilityOwners,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.capability.v1beta1.GenesisOwners"
  }

  public object KotlinxSerializer : KSerializer<GenesisOwners> {
    private val delegator: KSerializer<GenesisOwners> = GenesisOwners.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenesisOwners): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GenesisOwnersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenesisOwners {
      if (decoder is ProtobufMapperDecoder) {
        return GenesisOwnersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = GenesisState.TYPE_URL)
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val index: ULong,
  @ProtobufIndex(index = 2)
  public val owners: List<GenesisOwners>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.capability.v1beta1.GenesisState"
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
