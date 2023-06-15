// Transform from dex/match_result.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.Long
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

@Serializable(with = MatchResult.KotlinxSerializer::class)
@SerialName(value = MatchResult.TYPE_URL)
public data class MatchResult(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val contractAddr: String,
  @ProtobufIndex(index = 3)
  public val orders: List<Order>,
  @ProtobufIndex(index = 4)
  public val settlements: List<SettlementEntry>,
  @ProtobufIndex(index = 5)
  public val cancellations: List<Cancellation>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MatchResult"
  }

  public object KotlinxSerializer : KSerializer<MatchResult> {
    private val delegator: KSerializer<MatchResult> = MatchResult.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MatchResult): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MatchResultConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MatchResult {
      if (decoder is ProtobufMapperDecoder) {
        return MatchResultConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
