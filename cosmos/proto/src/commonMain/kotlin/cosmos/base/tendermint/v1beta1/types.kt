// Transform from cosmos/base/tendermint/v1beta1/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.tendermint.v1beta1

import google.protobuf.Timestamp
import kotlin.ByteArray
import kotlin.Long
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
import tendermint.types.BlockID
import tendermint.types.Commit
import tendermint.types.Data
import tendermint.types.EvidenceList
import tendermint.version.Consensus

@Serializable(with = Block.KotlinxSerializer::class)
@SerialName(value = Block.TYPE_URL)
public data class Block(
  @ProtobufIndex(index = 1)
  public val `header`: Header,
  @ProtobufIndex(index = 2)
  public val `data`: Data,
  @ProtobufIndex(index = 3)
  public val evidence: EvidenceList,
  @ProtobufIndex(index = 4)
  public val lastCommit: Commit,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.Block"
  }

  public object KotlinxSerializer : KSerializer<Block> {
    private val delegator: KSerializer<Block> = Block.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Block): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BlockConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Block {
      if (decoder is ProtobufMapperDecoder) {
        return BlockConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Header.KotlinxSerializer::class)
@SerialName(value = Header.TYPE_URL)
public data class Header(
  @ProtobufIndex(index = 1)
  public val version: Consensus,
  @ProtobufIndex(index = 2)
  public val chainId: String,
  @ProtobufIndex(index = 3)
  public val height: Long,
  @ProtobufIndex(index = 4)
  public val time: Timestamp,
  @ProtobufIndex(index = 5)
  public val lastBlockId: BlockID,
  @ProtobufIndex(index = 6)
  public val lastCommitHash: ByteArray,
  @ProtobufIndex(index = 7)
  public val dataHash: ByteArray,
  @ProtobufIndex(index = 8)
  public val validatorsHash: ByteArray,
  @ProtobufIndex(index = 9)
  public val nextValidatorsHash: ByteArray,
  @ProtobufIndex(index = 10)
  public val consensusHash: ByteArray,
  @ProtobufIndex(index = 11)
  public val appHash: ByteArray,
  @ProtobufIndex(index = 12)
  public val lastResultsHash: ByteArray,
  @ProtobufIndex(index = 13)
  public val evidenceHash: ByteArray,
  @ProtobufIndex(index = 14)
  public val proposerAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.Header"
  }

  public object KotlinxSerializer : KSerializer<Header> {
    private val delegator: KSerializer<Header> = Header.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Header): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(HeaderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Header {
      if (decoder is ProtobufMapperDecoder) {
        return HeaderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
