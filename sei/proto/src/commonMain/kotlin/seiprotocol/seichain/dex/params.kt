// Transform from dex/params.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

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

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val priceSnapshotRetention: ULong,
  @ProtobufIndex(index = 2)
  public val sudoCallGasPrice: String,
  @ProtobufIndex(index = 3)
  public val beginBlockGasLimit: ULong,
  @ProtobufIndex(index = 4)
  public val endBlockGasLimit: ULong,
  @ProtobufIndex(index = 5)
  public val defaultGasPerOrder: ULong,
  @ProtobufIndex(index = 6)
  public val defaultGasPerCancel: ULong,
  @ProtobufIndex(index = 7)
  public val minRentDeposit: ULong,
  @ProtobufIndex(index = 8)
  public val gasAllowancePerSettlement: ULong,
  @ProtobufIndex(index = 9)
  public val minProcessableRent: ULong,
  @ProtobufIndex(index = 10)
  public val orderBookEntriesPerLoad: ULong,
  @ProtobufIndex(index = 11)
  public val contractUnsuspendCost: ULong,
  @ProtobufIndex(index = 12)
  public val maxOrderPerPrice: ULong,
  @ProtobufIndex(index = 13)
  public val maxPairsPerContract: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.Params"
  }

  public object KotlinxSerializer : KSerializer<Params> {
    private val delegator: KSerializer<Params> = Params.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Params): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Params {
      if (decoder is ProtobufMapperDecoder) {
        return ParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
