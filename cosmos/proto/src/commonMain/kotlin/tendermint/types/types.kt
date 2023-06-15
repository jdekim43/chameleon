// Transform from tendermint/types/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import google.protobuf.Timestamp
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
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
import tendermint.crypto.Proof
import tendermint.version.Consensus

@Serializable
@SerialName(value = "/tendermint.types.BlockIDFlag")
public enum class BlockIDFlag(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  BLOCK_ID_FLAG_UNKNOWN(0),
  @ProtobufIndex(index = 1)
  BLOCK_ID_FLAG_ABSENT(1),
  @ProtobufIndex(index = 2)
  BLOCK_ID_FLAG_COMMIT(2),
  @ProtobufIndex(index = 3)
  BLOCK_ID_FLAG_NIL(3),
  ;

  public companion object {
    public fun forNumber(number: Int): BlockIDFlag = BlockIDFlag.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/tendermint.types.SignedMsgType")
public enum class SignedMsgType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  SIGNED_MSG_TYPE_UNKNOWN(0),
  @ProtobufIndex(index = 1)
  SIGNED_MSG_TYPE_PREVOTE(1),
  @ProtobufIndex(index = 2)
  SIGNED_MSG_TYPE_PRECOMMIT(2),
  @ProtobufIndex(index = 32)
  SIGNED_MSG_TYPE_PROPOSAL(32),
  ;

  public companion object {
    public fun forNumber(number: Int): SignedMsgType = SignedMsgType.values()
    	.first { it.number == number }
  }
}

@Serializable(with = PartSetHeader.KotlinxSerializer::class)
@SerialName(value = PartSetHeader.TYPE_URL)
public data class PartSetHeader(
  @ProtobufIndex(index = 1)
  public val total: UInt,
  @ProtobufIndex(index = 2)
  public val hash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.PartSetHeader"
  }

  public object KotlinxSerializer : KSerializer<PartSetHeader> {
    private val delegator: KSerializer<PartSetHeader> = PartSetHeader.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PartSetHeader): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PartSetHeaderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PartSetHeader {
      if (decoder is ProtobufMapperDecoder) {
        return PartSetHeaderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Part.KotlinxSerializer::class)
@SerialName(value = Part.TYPE_URL)
public data class Part(
  @ProtobufIndex(index = 1)
  public val index: UInt,
  @ProtobufIndex(index = 2)
  public val bytes: ByteArray,
  @ProtobufIndex(index = 3)
  public val proof: Proof,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.Part"
  }

  public object KotlinxSerializer : KSerializer<Part> {
    private val delegator: KSerializer<Part> = Part.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Part): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PartConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Part {
      if (decoder is ProtobufMapperDecoder) {
        return PartConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BlockID.KotlinxSerializer::class)
@SerialName(value = BlockID.TYPE_URL)
public data class BlockID(
  @ProtobufIndex(index = 1)
  public val hash: ByteArray,
  @ProtobufIndex(index = 2)
  public val partSetHeader: PartSetHeader,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.BlockID"
  }

  public object KotlinxSerializer : KSerializer<BlockID> {
    private val delegator: KSerializer<BlockID> = BlockID.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockID): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BlockIDConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockID {
      if (decoder is ProtobufMapperDecoder) {
        return BlockIDConverter.deserialize(decoder.decodeByteArray())
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
  public val proposerAddress: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.Header"
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

@Serializable(with = Data.KotlinxSerializer::class)
@SerialName(value = Data.TYPE_URL)
public data class Data(
  @ProtobufIndex(index = 1)
  public val txs: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.Data"
  }

  public object KotlinxSerializer : KSerializer<Data> {
    private val delegator: KSerializer<Data> = Data.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Data): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Data {
      if (decoder is ProtobufMapperDecoder) {
        return DataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Vote.KotlinxSerializer::class)
@SerialName(value = Vote.TYPE_URL)
public data class Vote(
  @ProtobufIndex(index = 1)
  public val type: SignedMsgType,
  @ProtobufIndex(index = 2)
  public val height: Long,
  @ProtobufIndex(index = 3)
  public val round: Int,
  @ProtobufIndex(index = 4)
  public val blockId: BlockID,
  @ProtobufIndex(index = 5)
  public val timestamp: Timestamp,
  @ProtobufIndex(index = 6)
  public val validatorAddress: ByteArray,
  @ProtobufIndex(index = 7)
  public val validatorIndex: Int,
  @ProtobufIndex(index = 8)
  public val signature: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.Vote"
  }

  public object KotlinxSerializer : KSerializer<Vote> {
    private val delegator: KSerializer<Vote> = Vote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Vote): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VoteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Vote {
      if (decoder is ProtobufMapperDecoder) {
        return VoteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Commit.KotlinxSerializer::class)
@SerialName(value = Commit.TYPE_URL)
public data class Commit(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val round: Int,
  @ProtobufIndex(index = 3)
  public val blockId: BlockID,
  @ProtobufIndex(index = 4)
  public val signatures: List<CommitSig>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.Commit"
  }

  public object KotlinxSerializer : KSerializer<Commit> {
    private val delegator: KSerializer<Commit> = Commit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Commit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CommitConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Commit {
      if (decoder is ProtobufMapperDecoder) {
        return CommitConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CommitSig.KotlinxSerializer::class)
@SerialName(value = CommitSig.TYPE_URL)
public data class CommitSig(
  @ProtobufIndex(index = 1)
  public val blockIdFlag: BlockIDFlag,
  @ProtobufIndex(index = 2)
  public val validatorAddress: ByteArray,
  @ProtobufIndex(index = 3)
  public val timestamp: Timestamp,
  @ProtobufIndex(index = 4)
  public val signature: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.CommitSig"
  }

  public object KotlinxSerializer : KSerializer<CommitSig> {
    private val delegator: KSerializer<CommitSig> = CommitSig.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CommitSig): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CommitSigConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CommitSig {
      if (decoder is ProtobufMapperDecoder) {
        return CommitSigConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Proposal.KotlinxSerializer::class)
@SerialName(value = Proposal.TYPE_URL)
public data class Proposal(
  @ProtobufIndex(index = 1)
  public val type: SignedMsgType,
  @ProtobufIndex(index = 2)
  public val height: Long,
  @ProtobufIndex(index = 3)
  public val round: Int,
  @ProtobufIndex(index = 4)
  public val polRound: Int,
  @ProtobufIndex(index = 5)
  public val blockId: BlockID,
  @ProtobufIndex(index = 6)
  public val timestamp: Timestamp,
  @ProtobufIndex(index = 7)
  public val signature: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.Proposal"
  }

  public object KotlinxSerializer : KSerializer<Proposal> {
    private val delegator: KSerializer<Proposal> = Proposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Proposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Proposal {
      if (decoder is ProtobufMapperDecoder) {
        return ProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SignedHeader.KotlinxSerializer::class)
@SerialName(value = SignedHeader.TYPE_URL)
public data class SignedHeader(
  @ProtobufIndex(index = 1)
  public val `header`: Header,
  @ProtobufIndex(index = 2)
  public val commit: Commit,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.SignedHeader"
  }

  public object KotlinxSerializer : KSerializer<SignedHeader> {
    private val delegator: KSerializer<SignedHeader> = SignedHeader.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SignedHeader): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SignedHeaderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SignedHeader {
      if (decoder is ProtobufMapperDecoder) {
        return SignedHeaderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = LightBlock.KotlinxSerializer::class)
@SerialName(value = LightBlock.TYPE_URL)
public data class LightBlock(
  @ProtobufIndex(index = 1)
  public val signedHeader: SignedHeader,
  @ProtobufIndex(index = 2)
  public val validatorSet: ValidatorSet,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.LightBlock"
  }

  public object KotlinxSerializer : KSerializer<LightBlock> {
    private val delegator: KSerializer<LightBlock> = LightBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LightBlock): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(LightBlockConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LightBlock {
      if (decoder is ProtobufMapperDecoder) {
        return LightBlockConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BlockMeta.KotlinxSerializer::class)
@SerialName(value = BlockMeta.TYPE_URL)
public data class BlockMeta(
  @ProtobufIndex(index = 1)
  public val blockId: BlockID,
  @ProtobufIndex(index = 2)
  public val blockSize: Long,
  @ProtobufIndex(index = 3)
  public val `header`: Header,
  @ProtobufIndex(index = 4)
  public val numTxs: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.BlockMeta"
  }

  public object KotlinxSerializer : KSerializer<BlockMeta> {
    private val delegator: KSerializer<BlockMeta> = BlockMeta.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockMeta): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BlockMetaConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockMeta {
      if (decoder is ProtobufMapperDecoder) {
        return BlockMetaConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxProof.KotlinxSerializer::class)
@SerialName(value = TxProof.TYPE_URL)
public data class TxProof(
  @ProtobufIndex(index = 1)
  public val rootHash: ByteArray,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 3)
  public val proof: Proof,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.TxProof"
  }

  public object KotlinxSerializer : KSerializer<TxProof> {
    private val delegator: KSerializer<TxProof> = TxProof.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxProof): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxProofConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxProof {
      if (decoder is ProtobufMapperDecoder) {
        return TxProofConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
