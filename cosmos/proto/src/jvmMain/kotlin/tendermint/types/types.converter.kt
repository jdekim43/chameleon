// Transform from tendermint/types/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object PartSetHeaderConverter : ProtobufConverter<PartSetHeader> by
    PartSetHeaderJvmConverter

public actual object PartConverter : ProtobufConverter<Part> by PartJvmConverter

public actual object BlockIDConverter : ProtobufConverter<BlockID> by BlockIDJvmConverter

public actual object HeaderConverter : ProtobufConverter<Header> by HeaderJvmConverter

public actual object DataConverter : ProtobufConverter<Data> by DataJvmConverter

public actual object VoteConverter : ProtobufConverter<Vote> by VoteJvmConverter

public actual object CommitConverter : ProtobufConverter<Commit> by CommitJvmConverter

public actual object CommitSigConverter : ProtobufConverter<CommitSig> by CommitSigJvmConverter

public actual object ProposalConverter : ProtobufConverter<Proposal> by ProposalJvmConverter

public actual object SignedHeaderConverter : ProtobufConverter<SignedHeader> by
    SignedHeaderJvmConverter

public actual object LightBlockConverter : ProtobufConverter<LightBlock> by LightBlockJvmConverter

public actual object BlockMetaConverter : ProtobufConverter<BlockMeta> by BlockMetaJvmConverter

public actual object TxProofConverter : ProtobufConverter<TxProof> by TxProofJvmConverter
