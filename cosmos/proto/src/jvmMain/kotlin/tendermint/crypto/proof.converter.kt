// Transform from tendermint/crypto/proof.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.crypto

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ProofConverter : ProtobufConverter<Proof> by ProofJvmConverter

public actual object ValueOpConverter : ProtobufConverter<ValueOp> by ValueOpJvmConverter

public actual object DominoOpConverter : ProtobufConverter<DominoOp> by DominoOpJvmConverter

public actual object ProofOpConverter : ProtobufConverter<ProofOp> by ProofOpJvmConverter

public actual object ProofOpsConverter : ProtobufConverter<ProofOps> by ProofOpsJvmConverter
