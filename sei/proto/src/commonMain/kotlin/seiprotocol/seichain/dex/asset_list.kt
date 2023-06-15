// Transform from dex/asset_list.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import cosmos.bank.v1beta1.Metadata
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

@Serializable(with = AssetIBCInfo.KotlinxSerializer::class)
@SerialName(value = AssetIBCInfo.TYPE_URL)
public data class AssetIBCInfo(
  @ProtobufIndex(index = 1)
  public val sourceChannel: String,
  @ProtobufIndex(index = 2)
  public val dstChannel: String,
  @ProtobufIndex(index = 3)
  public val sourceDenom: String,
  @ProtobufIndex(index = 4)
  public val sourceChainID: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.AssetIBCInfo"
  }

  public object KotlinxSerializer : KSerializer<AssetIBCInfo> {
    private val delegator: KSerializer<AssetIBCInfo> = AssetIBCInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AssetIBCInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AssetIBCInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AssetIBCInfo {
      if (decoder is ProtobufMapperDecoder) {
        return AssetIBCInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AssetMetadata.KotlinxSerializer::class)
@SerialName(value = AssetMetadata.TYPE_URL)
public data class AssetMetadata(
  @ProtobufIndex(index = 1)
  public val ibcInfo: AssetIBCInfo,
  @ProtobufIndex(index = 2)
  public val typeAsset: String,
  @ProtobufIndex(index = 3)
  public val metadata: Metadata,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.AssetMetadata"
  }

  public object KotlinxSerializer : KSerializer<AssetMetadata> {
    private val delegator: KSerializer<AssetMetadata> = AssetMetadata.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AssetMetadata): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AssetMetadataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AssetMetadata {
      if (decoder is ProtobufMapperDecoder) {
        return AssetMetadataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
