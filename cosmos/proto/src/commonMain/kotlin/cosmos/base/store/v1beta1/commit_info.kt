// Transform from cosmos/base/store/v1beta1/commit_info.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.store.v1beta1

import google.protobuf.Timestamp
import kotlin.ByteArray
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

@Serializable(with = CommitInfo.KotlinxSerializer::class)
@SerialName(value = CommitInfo.TYPE_URL)
public data class CommitInfo(
  @ProtobufIndex(index = 1)
  public val version: Long,
  @ProtobufIndex(index = 2)
  public val storeInfos: List<StoreInfo>,
  @ProtobufIndex(index = 3)
  public val timestamp: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.store.v1beta1.CommitInfo"
  }

  public object KotlinxSerializer : KSerializer<CommitInfo> {
    private val delegator: KSerializer<CommitInfo> = CommitInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CommitInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CommitInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CommitInfo {
      if (decoder is ProtobufMapperDecoder) {
        return CommitInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = StoreInfo.KotlinxSerializer::class)
@SerialName(value = StoreInfo.TYPE_URL)
public data class StoreInfo(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val commitId: CommitID,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.store.v1beta1.StoreInfo"
  }

  public object KotlinxSerializer : KSerializer<StoreInfo> {
    private val delegator: KSerializer<StoreInfo> = StoreInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StoreInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(StoreInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StoreInfo {
      if (decoder is ProtobufMapperDecoder) {
        return StoreInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CommitID.KotlinxSerializer::class)
@SerialName(value = CommitID.TYPE_URL)
public data class CommitID(
  @ProtobufIndex(index = 1)
  public val version: Long,
  @ProtobufIndex(index = 2)
  public val hash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.store.v1beta1.CommitID"
  }

  public object KotlinxSerializer : KSerializer<CommitID> {
    private val delegator: KSerializer<CommitID> = CommitID.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CommitID): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CommitIDConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CommitID {
      if (decoder is ProtobufMapperDecoder) {
        return CommitIDConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
