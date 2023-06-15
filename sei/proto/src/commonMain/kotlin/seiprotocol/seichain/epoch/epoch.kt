// Transform from epoch/epoch.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.epoch

import google.protobuf.Duration
import google.protobuf.Timestamp
import kotlin.Long
import kotlin.String
import kotlin.ULong
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

@Serializable(with = Epoch.KotlinxSerializer::class)
@SerialName(value = Epoch.TYPE_URL)
public data class Epoch(
  @ProtobufIndex(index = 1)
  public val genesisTime: Timestamp,
  @ProtobufIndex(index = 2)
  public val epochDuration: Duration,
  @ProtobufIndex(index = 3)
  public val currentEpoch: ULong,
  @ProtobufIndex(index = 4)
  public val currentEpochStartTime: Timestamp,
  @ProtobufIndex(index = 5)
  public val currentEpochHeight: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.epoch.Epoch"
  }

  public object KotlinxSerializer : KSerializer<Epoch> {
    private val delegator: KSerializer<Epoch> = Epoch.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Epoch): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EpochConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Epoch {
      if (decoder is ProtobufMapperDecoder) {
        return EpochConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
