// Transform from tendermint/crypto/proof.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.crypto

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ProofConverter : ProtobufConverter<Proof>

public fun Proof.toAny(): Any = Any(Proof.TYPE_URL, with(ProofConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Proof>): Proof {
  if (typeUrl != Proof.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValueOpConverter : ProtobufConverter<ValueOp>

public fun ValueOp.toAny(): Any = Any(ValueOp.TYPE_URL, with(ValueOpConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValueOp>): ValueOp {
  if (typeUrl != ValueOp.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DominoOpConverter : ProtobufConverter<DominoOp>

public fun DominoOp.toAny(): Any = Any(DominoOp.TYPE_URL, with(DominoOpConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DominoOp>): DominoOp {
  if (typeUrl != DominoOp.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProofOpConverter : ProtobufConverter<ProofOp>

public fun ProofOp.toAny(): Any = Any(ProofOp.TYPE_URL, with(ProofOpConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ProofOp>): ProofOp {
  if (typeUrl != ProofOp.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProofOpsConverter : ProtobufConverter<ProofOps>

public fun ProofOps.toAny(): Any = Any(ProofOps.TYPE_URL, with(ProofOpsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ProofOps>): ProofOps {
  if (typeUrl != ProofOps.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
