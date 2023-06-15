// Transform from cosmos/evidence/v1beta1/evidence.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object EquivocationJvmConverter : ProtobufTypeMapper<Equivocation, Evidence.Equivocation> {
  public override val descriptor: Descriptors.Descriptor = Evidence.Equivocation.getDescriptor()

  public override val parser: Parser<Evidence.Equivocation> = Evidence.Equivocation.parser()

  public override fun convert(obj: Evidence.Equivocation): Equivocation = Equivocation(
  	height = obj.getHeight(),
  	time = TimestampJvmConverter.convert(obj.getTime()),
  	power = obj.getPower(),
  	consensusAddress = obj.getConsensusAddress(),
  )

  public override fun convert(obj: Equivocation): Evidence.Equivocation {
    val builder = Evidence.Equivocation.newBuilder()
    builder.setHeight(obj.height)
    builder.setTime(TimestampJvmConverter.convert(obj.time))
    builder.setPower(obj.power)
    builder.setConsensusAddress(obj.consensusAddress)
    return builder.build()
  }
}
