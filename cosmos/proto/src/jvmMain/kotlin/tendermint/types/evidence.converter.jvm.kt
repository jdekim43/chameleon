// Transform from tendermint/types/evidence.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object EvidenceJvmConverter : ProtobufTypeMapper<Evidence, EvidenceOuterClass.Evidence> {
  public override val descriptor: Descriptors.Descriptor =
      EvidenceOuterClass.Evidence.getDescriptor()

  public override val parser: Parser<EvidenceOuterClass.Evidence> =
      EvidenceOuterClass.Evidence.parser()

  public override fun convert(obj: EvidenceOuterClass.Evidence): Evidence = Evidence(
  	sum = mapOf(
  1 to {
      Evidence.SumOneOf.DuplicateVoteEvidence(DuplicateVoteEvidenceJvmConverter.convert(obj.getDuplicateVoteEvidence()))
      },
  2 to {
      Evidence.SumOneOf.LightClientAttackEvidence(LightClientAttackEvidenceJvmConverter.convert(obj.getLightClientAttackEvidence()))
      },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: Evidence): EvidenceOuterClass.Evidence {
    val builder = EvidenceOuterClass.Evidence.newBuilder()
    when (obj.sum) {
      is Evidence.SumOneOf.DuplicateVoteEvidence ->
          builder.setDuplicateVoteEvidence(DuplicateVoteEvidenceJvmConverter.convert(obj.sum.value))
      is Evidence.SumOneOf.LightClientAttackEvidence ->
          builder.setLightClientAttackEvidence(LightClientAttackEvidenceJvmConverter.convert(obj.sum.value))
    }
    return builder.build()
  }
}

public object DuplicateVoteEvidenceJvmConverter :
    ProtobufTypeMapper<DuplicateVoteEvidence, EvidenceOuterClass.DuplicateVoteEvidence> {
  public override val descriptor: Descriptors.Descriptor =
      EvidenceOuterClass.DuplicateVoteEvidence.getDescriptor()

  public override val parser: Parser<EvidenceOuterClass.DuplicateVoteEvidence> =
      EvidenceOuterClass.DuplicateVoteEvidence.parser()

  public override fun convert(obj: EvidenceOuterClass.DuplicateVoteEvidence): DuplicateVoteEvidence
      = DuplicateVoteEvidence(
  	voteA = VoteJvmConverter.convert(obj.getVoteA()),
  	voteB = VoteJvmConverter.convert(obj.getVoteB()),
  	totalVotingPower = obj.getTotalVotingPower(),
  	validatorPower = obj.getValidatorPower(),
  	timestamp = TimestampJvmConverter.convert(obj.getTimestamp()),
  )

  public override fun convert(obj: DuplicateVoteEvidence):
      EvidenceOuterClass.DuplicateVoteEvidence {
    val builder = EvidenceOuterClass.DuplicateVoteEvidence.newBuilder()
    builder.setVoteA(VoteJvmConverter.convert(obj.voteA))
    builder.setVoteB(VoteJvmConverter.convert(obj.voteB))
    builder.setTotalVotingPower(obj.totalVotingPower)
    builder.setValidatorPower(obj.validatorPower)
    builder.setTimestamp(TimestampJvmConverter.convert(obj.timestamp))
    return builder.build()
  }
}

public object LightClientAttackEvidenceJvmConverter :
    ProtobufTypeMapper<LightClientAttackEvidence, EvidenceOuterClass.LightClientAttackEvidence> {
  public override val descriptor: Descriptors.Descriptor =
      EvidenceOuterClass.LightClientAttackEvidence.getDescriptor()

  public override val parser: Parser<EvidenceOuterClass.LightClientAttackEvidence> =
      EvidenceOuterClass.LightClientAttackEvidence.parser()

  public override fun convert(obj: EvidenceOuterClass.LightClientAttackEvidence):
      LightClientAttackEvidence = LightClientAttackEvidence(
  	conflictingBlock = LightBlockJvmConverter.convert(obj.getConflictingBlock()),
  	commonHeight = obj.getCommonHeight(),
  	byzantineValidators = obj.getByzantineValidatorsList().map { ValidatorJvmConverter.convert(it) },
  	totalVotingPower = obj.getTotalVotingPower(),
  	timestamp = TimestampJvmConverter.convert(obj.getTimestamp()),
  )

  public override fun convert(obj: LightClientAttackEvidence):
      EvidenceOuterClass.LightClientAttackEvidence {
    val builder = EvidenceOuterClass.LightClientAttackEvidence.newBuilder()
    builder.setConflictingBlock(LightBlockJvmConverter.convert(obj.conflictingBlock))
    builder.setCommonHeight(obj.commonHeight)
    builder.addAllByzantineValidators(obj.byzantineValidators.map {
        ValidatorJvmConverter.convert(it) })
    builder.setTotalVotingPower(obj.totalVotingPower)
    builder.setTimestamp(TimestampJvmConverter.convert(obj.timestamp))
    return builder.build()
  }
}

public object EvidenceListJvmConverter :
    ProtobufTypeMapper<EvidenceList, EvidenceOuterClass.EvidenceList> {
  public override val descriptor: Descriptors.Descriptor =
      EvidenceOuterClass.EvidenceList.getDescriptor()

  public override val parser: Parser<EvidenceOuterClass.EvidenceList> =
      EvidenceOuterClass.EvidenceList.parser()

  public override fun convert(obj: EvidenceOuterClass.EvidenceList): EvidenceList = EvidenceList(
  	evidence = obj.getEvidenceList().map { EvidenceJvmConverter.convert(it) },
  )

  public override fun convert(obj: EvidenceList): EvidenceOuterClass.EvidenceList {
    val builder = EvidenceOuterClass.EvidenceList.newBuilder()
    builder.addAllEvidence(obj.evidence.map { EvidenceJvmConverter.convert(it) })
    return builder.build()
  }
}
