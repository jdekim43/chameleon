// Transform from cosmos/base/store/v1beta1/listening.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.store.v1beta1

import kotlin.Boolean
import kotlin.ByteArray
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
import tendermint.abci.RequestBeginBlock
import tendermint.abci.RequestDeliverTx
import tendermint.abci.RequestEndBlock
import tendermint.abci.ResponseBeginBlock
import tendermint.abci.ResponseCommit
import tendermint.abci.ResponseDeliverTx
import tendermint.abci.ResponseEndBlock

@Serializable(with = StoreKVPair.KotlinxSerializer::class)
@SerialName(value = StoreKVPair.TYPE_URL)
public data class StoreKVPair(
  @ProtobufIndex(index = 1)
  public val storeKey: String,
  @ProtobufIndex(index = 2)
  public val delete: Boolean,
  @ProtobufIndex(index = 3)
  public val key: ByteArray,
  @ProtobufIndex(index = 4)
  public val `value`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.store.v1beta1.StoreKVPair"
  }

  public object KotlinxSerializer : KSerializer<StoreKVPair> {
    private val delegator: KSerializer<StoreKVPair> = StoreKVPair.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StoreKVPair): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(StoreKVPairConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StoreKVPair {
      if (decoder is ProtobufMapperDecoder) {
        return StoreKVPairConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BlockMetadata.KotlinxSerializer::class)
@SerialName(value = BlockMetadata.TYPE_URL)
public data class BlockMetadata(
  @ProtobufIndex(index = 1)
  public val requestBeginBlock: RequestBeginBlock,
  @ProtobufIndex(index = 2)
  public val responseBeginBlock: ResponseBeginBlock,
  @ProtobufIndex(index = 3)
  public val deliverTxs: List<DeliverTx>,
  @ProtobufIndex(index = 4)
  public val requestEndBlock: RequestEndBlock,
  @ProtobufIndex(index = 5)
  public val responseEndBlock: ResponseEndBlock,
  @ProtobufIndex(index = 6)
  public val responseCommit: ResponseCommit,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.store.v1beta1.BlockMetadata"
  }

  @Serializable(with = DeliverTx.KotlinxSerializer::class)
  @SerialName(value = DeliverTx.TYPE_URL)
  public data class DeliverTx(
    @ProtobufIndex(index = 1)
    public val request: RequestDeliverTx,
    @ProtobufIndex(index = 2)
    public val response: ResponseDeliverTx,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/cosmos.base.store.v1beta1.BlockMetadata.DeliverTx"
    }

    public object KotlinxSerializer : KSerializer<DeliverTx> {
      private val delegator: KSerializer<DeliverTx> = DeliverTx.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: DeliverTx): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(BlockMetadataConverter.DeliverTxConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): DeliverTx {
        if (decoder is ProtobufMapperDecoder) {
          return BlockMetadataConverter.DeliverTxConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<BlockMetadata> {
    private val delegator: KSerializer<BlockMetadata> = BlockMetadata.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockMetadata): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BlockMetadataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockMetadata {
      if (decoder is ProtobufMapperDecoder) {
        return BlockMetadataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
