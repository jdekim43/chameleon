// Transform from alliance/unbonding.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object UnbondingDelegationJvmConverter :
    ProtobufTypeMapper<UnbondingDelegation, Unbonding.UnbondingDelegation> {
  public override val descriptor: Descriptors.Descriptor =
      Unbonding.UnbondingDelegation.getDescriptor()

  public override val parser: Parser<Unbonding.UnbondingDelegation> =
      Unbonding.UnbondingDelegation.parser()

  public override fun convert(obj: Unbonding.UnbondingDelegation): UnbondingDelegation =
      UnbondingDelegation(
  	completionTime = TimestampJvmConverter.convert(obj.getCompletionTime()),
  	validatorAddress = obj.getValidatorAddress(),
  	amount = obj.getAmount(),
  )

  public override fun convert(obj: UnbondingDelegation): Unbonding.UnbondingDelegation {
    val builder = Unbonding.UnbondingDelegation.newBuilder()
    builder.setCompletionTime(TimestampJvmConverter.convert(obj.completionTime))
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setAmount(obj.amount)
    return builder.build()
  }
}
