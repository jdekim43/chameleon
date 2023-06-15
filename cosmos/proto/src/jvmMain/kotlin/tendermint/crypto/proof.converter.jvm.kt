// Transform from tendermint/crypto/proof.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.crypto

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ProofJvmConverter : ProtobufTypeMapper<Proof, ProofOuterClass.Proof> {
  public override val descriptor: Descriptors.Descriptor = ProofOuterClass.Proof.getDescriptor()

  public override val parser: Parser<ProofOuterClass.Proof> = ProofOuterClass.Proof.parser()

  public override fun convert(obj: ProofOuterClass.Proof): Proof = Proof(
  	total = obj.getTotal(),
  	index = obj.getIndex(),
  	leafHash = obj.getLeafHash().toByteArray(),
  	aunts = obj.getAuntsList().map { it.toByteArray() },
  )

  public override fun convert(obj: Proof): ProofOuterClass.Proof {
    val builder = ProofOuterClass.Proof.newBuilder()
    builder.setTotal(obj.total)
    builder.setIndex(obj.index)
    builder.setLeafHash(ByteString.copyFrom(obj.leafHash))
    builder.addAllAunts(obj.aunts.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object ValueOpJvmConverter : ProtobufTypeMapper<ValueOp, ProofOuterClass.ValueOp> {
  public override val descriptor: Descriptors.Descriptor = ProofOuterClass.ValueOp.getDescriptor()

  public override val parser: Parser<ProofOuterClass.ValueOp> = ProofOuterClass.ValueOp.parser()

  public override fun convert(obj: ProofOuterClass.ValueOp): ValueOp = ValueOp(
  	key = obj.getKey().toByteArray(),
  	proof = ProofJvmConverter.convert(obj.getProof()),
  )

  public override fun convert(obj: ValueOp): ProofOuterClass.ValueOp {
    val builder = ProofOuterClass.ValueOp.newBuilder()
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setProof(ProofJvmConverter.convert(obj.proof))
    return builder.build()
  }
}

public object DominoOpJvmConverter : ProtobufTypeMapper<DominoOp, ProofOuterClass.DominoOp> {
  public override val descriptor: Descriptors.Descriptor = ProofOuterClass.DominoOp.getDescriptor()

  public override val parser: Parser<ProofOuterClass.DominoOp> = ProofOuterClass.DominoOp.parser()

  public override fun convert(obj: ProofOuterClass.DominoOp): DominoOp = DominoOp(
  	key = obj.getKey(),
  	input = obj.getInput(),
  	output = obj.getOutput(),
  )

  public override fun convert(obj: DominoOp): ProofOuterClass.DominoOp {
    val builder = ProofOuterClass.DominoOp.newBuilder()
    builder.setKey(obj.key)
    builder.setInput(obj.input)
    builder.setOutput(obj.output)
    return builder.build()
  }
}

public object ProofOpJvmConverter : ProtobufTypeMapper<ProofOp, ProofOuterClass.ProofOp> {
  public override val descriptor: Descriptors.Descriptor = ProofOuterClass.ProofOp.getDescriptor()

  public override val parser: Parser<ProofOuterClass.ProofOp> = ProofOuterClass.ProofOp.parser()

  public override fun convert(obj: ProofOuterClass.ProofOp): ProofOp = ProofOp(
  	type = obj.getType(),
  	key = obj.getKey().toByteArray(),
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: ProofOp): ProofOuterClass.ProofOp {
    val builder = ProofOuterClass.ProofOp.newBuilder()
    builder.setType(obj.type)
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object ProofOpsJvmConverter : ProtobufTypeMapper<ProofOps, ProofOuterClass.ProofOps> {
  public override val descriptor: Descriptors.Descriptor = ProofOuterClass.ProofOps.getDescriptor()

  public override val parser: Parser<ProofOuterClass.ProofOps> = ProofOuterClass.ProofOps.parser()

  public override fun convert(obj: ProofOuterClass.ProofOps): ProofOps = ProofOps(
  	ops = obj.getOpsList().map { ProofOpJvmConverter.convert(it) },
  )

  public override fun convert(obj: ProofOps): ProofOuterClass.ProofOps {
    val builder = ProofOuterClass.ProofOps.newBuilder()
    builder.addAllOps(obj.ops.map { ProofOpJvmConverter.convert(it) })
    return builder.build()
  }
}
