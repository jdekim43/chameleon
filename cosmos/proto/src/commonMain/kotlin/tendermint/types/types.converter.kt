// Transform from tendermint/types/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object PartSetHeaderConverter : ProtobufConverter<PartSetHeader>

public fun PartSetHeader.toAny(): Any = Any(PartSetHeader.TYPE_URL, with(PartSetHeaderConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PartSetHeader>): PartSetHeader {
  if (typeUrl != PartSetHeader.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PartConverter : ProtobufConverter<Part>

public fun Part.toAny(): Any = Any(Part.TYPE_URL, with(PartConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Part>): Part {
  if (typeUrl != Part.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BlockIDConverter : ProtobufConverter<BlockID>

public fun BlockID.toAny(): Any = Any(BlockID.TYPE_URL, with(BlockIDConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BlockID>): BlockID {
  if (typeUrl != BlockID.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object HeaderConverter : ProtobufConverter<Header>

public fun Header.toAny(): Any = Any(Header.TYPE_URL, with(HeaderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Header>): Header {
  if (typeUrl != Header.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DataConverter : ProtobufConverter<Data>

public fun Data.toAny(): Any = Any(Data.TYPE_URL, with(DataConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Data>): Data {
  if (typeUrl != Data.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VoteConverter : ProtobufConverter<Vote>

public fun Vote.toAny(): Any = Any(Vote.TYPE_URL, with(VoteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Vote>): Vote {
  if (typeUrl != Vote.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CommitConverter : ProtobufConverter<Commit>

public fun Commit.toAny(): Any = Any(Commit.TYPE_URL, with(CommitConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Commit>): Commit {
  if (typeUrl != Commit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CommitSigConverter : ProtobufConverter<CommitSig>

public fun CommitSig.toAny(): Any = Any(CommitSig.TYPE_URL, with(CommitSigConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<CommitSig>): CommitSig {
  if (typeUrl != CommitSig.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProposalConverter : ProtobufConverter<Proposal>

public fun Proposal.toAny(): Any = Any(Proposal.TYPE_URL, with(ProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Proposal>): Proposal {
  if (typeUrl != Proposal.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SignedHeaderConverter : ProtobufConverter<SignedHeader>

public fun SignedHeader.toAny(): Any = Any(SignedHeader.TYPE_URL, with(SignedHeaderConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SignedHeader>): SignedHeader {
  if (typeUrl != SignedHeader.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object LightBlockConverter : ProtobufConverter<LightBlock>

public fun LightBlock.toAny(): Any = Any(LightBlock.TYPE_URL, with(LightBlockConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<LightBlock>): LightBlock {
  if (typeUrl != LightBlock.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BlockMetaConverter : ProtobufConverter<BlockMeta>

public fun BlockMeta.toAny(): Any = Any(BlockMeta.TYPE_URL, with(BlockMetaConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<BlockMeta>): BlockMeta {
  if (typeUrl != BlockMeta.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxProofConverter : ProtobufConverter<TxProof>

public fun TxProof.toAny(): Any = Any(TxProof.TYPE_URL, with(TxProofConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxProof>): TxProof {
  if (typeUrl != TxProof.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
