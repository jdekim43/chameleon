// Transform from epoch/epoch.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.epoch

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object EpochJvmConverter : ProtobufTypeMapper<Epoch, EpochOuterClass.Epoch> {
  public override val descriptor: Descriptors.Descriptor = EpochOuterClass.Epoch.getDescriptor()

  public override val parser: Parser<EpochOuterClass.Epoch> = EpochOuterClass.Epoch.parser()

  public override fun convert(obj: EpochOuterClass.Epoch): Epoch = Epoch(
  	genesisTime = TimestampJvmConverter.convert(obj.getGenesisTime()),
  	epochDuration = DurationJvmConverter.convert(obj.getEpochDuration()),
  	currentEpoch = obj.getCurrentEpoch().asKotlinType,
  	currentEpochStartTime = TimestampJvmConverter.convert(obj.getCurrentEpochStartTime()),
  	currentEpochHeight = obj.getCurrentEpochHeight(),
  )

  public override fun convert(obj: Epoch): EpochOuterClass.Epoch {
    val builder = EpochOuterClass.Epoch.newBuilder()
    builder.setGenesisTime(TimestampJvmConverter.convert(obj.genesisTime))
    builder.setEpochDuration(DurationJvmConverter.convert(obj.epochDuration))
    builder.setCurrentEpoch(obj.currentEpoch.asJavaType)
    builder.setCurrentEpochStartTime(TimestampJvmConverter.convert(obj.currentEpochStartTime))
    builder.setCurrentEpochHeight(obj.currentEpochHeight)
    return builder.build()
  }
}
