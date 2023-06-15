// Transform from dex/deposit.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

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

@Serializable(with = DepositInfoEntry.KotlinxSerializer::class)
@SerialName(value = DepositInfoEntry.TYPE_URL)
public data class DepositInfoEntry(
  @ProtobufIndex(index = 1)
  public val creator: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
  @ProtobufIndex(index = 3)
  public val amount: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.DepositInfoEntry"
  }

  public object KotlinxSerializer : KSerializer<DepositInfoEntry> {
    private val delegator: KSerializer<DepositInfoEntry> = DepositInfoEntry.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DepositInfoEntry): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DepositInfoEntryConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DepositInfoEntry {
      if (decoder is ProtobufMapperDecoder) {
        return DepositInfoEntryConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
