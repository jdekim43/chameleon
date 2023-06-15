// Transform from tendermint/p2p/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.p2p

import kotlin.ByteArray
import kotlin.String
import kotlin.UInt
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

@Serializable(with = NetAddress.KotlinxSerializer::class)
@SerialName(value = NetAddress.TYPE_URL)
public data class NetAddress(
  @ProtobufIndex(index = 1)
  public val id: String,
  @ProtobufIndex(index = 2)
  public val ip: String,
  @ProtobufIndex(index = 3)
  public val port: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.p2p.NetAddress"
  }

  public object KotlinxSerializer : KSerializer<NetAddress> {
    private val delegator: KSerializer<NetAddress> = NetAddress.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: NetAddress): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(NetAddressConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): NetAddress {
      if (decoder is ProtobufMapperDecoder) {
        return NetAddressConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProtocolVersion.KotlinxSerializer::class)
@SerialName(value = ProtocolVersion.TYPE_URL)
public data class ProtocolVersion(
  @ProtobufIndex(index = 1)
  public val p2P: ULong,
  @ProtobufIndex(index = 2)
  public val block: ULong,
  @ProtobufIndex(index = 3)
  public val app: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.p2p.ProtocolVersion"
  }

  public object KotlinxSerializer : KSerializer<ProtocolVersion> {
    private val delegator: KSerializer<ProtocolVersion> = ProtocolVersion.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProtocolVersion): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProtocolVersionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProtocolVersion {
      if (decoder is ProtobufMapperDecoder) {
        return ProtocolVersionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DefaultNodeInfo.KotlinxSerializer::class)
@SerialName(value = DefaultNodeInfo.TYPE_URL)
public data class DefaultNodeInfo(
  @ProtobufIndex(index = 1)
  public val protocolVersion: ProtocolVersion,
  @ProtobufIndex(index = 2)
  public val defaultNodeId: String,
  @ProtobufIndex(index = 3)
  public val listenAddr: String,
  @ProtobufIndex(index = 4)
  public val network: String,
  @ProtobufIndex(index = 5)
  public val version: String,
  @ProtobufIndex(index = 6)
  public val channels: ByteArray,
  @ProtobufIndex(index = 7)
  public val moniker: String,
  @ProtobufIndex(index = 8)
  public val other: DefaultNodeInfoOther,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.p2p.DefaultNodeInfo"
  }

  public object KotlinxSerializer : KSerializer<DefaultNodeInfo> {
    private val delegator: KSerializer<DefaultNodeInfo> = DefaultNodeInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DefaultNodeInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DefaultNodeInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DefaultNodeInfo {
      if (decoder is ProtobufMapperDecoder) {
        return DefaultNodeInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DefaultNodeInfoOther.KotlinxSerializer::class)
@SerialName(value = DefaultNodeInfoOther.TYPE_URL)
public data class DefaultNodeInfoOther(
  @ProtobufIndex(index = 1)
  public val txIndex: String,
  @ProtobufIndex(index = 2)
  public val rpcAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.p2p.DefaultNodeInfoOther"
  }

  public object KotlinxSerializer : KSerializer<DefaultNodeInfoOther> {
    private val delegator: KSerializer<DefaultNodeInfoOther> = DefaultNodeInfoOther.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DefaultNodeInfoOther): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DefaultNodeInfoOtherConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DefaultNodeInfoOther {
      if (decoder is ProtobufMapperDecoder) {
        return DefaultNodeInfoOtherConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
