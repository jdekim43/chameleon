// Transform from cosmos/slashing/v1beta1/slashing.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ValidatorSigningInfoJvmConverter :
    ProtobufTypeMapper<ValidatorSigningInfo, Slashing.ValidatorSigningInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Slashing.ValidatorSigningInfo.getDescriptor()

  public override val parser: Parser<Slashing.ValidatorSigningInfo> =
      Slashing.ValidatorSigningInfo.parser()

  public override fun convert(obj: Slashing.ValidatorSigningInfo): ValidatorSigningInfo =
      ValidatorSigningInfo(
  	address = obj.getAddress(),
  	startHeight = obj.getStartHeight(),
  	indexOffset = obj.getIndexOffset(),
  	jailedUntil = TimestampJvmConverter.convert(obj.getJailedUntil()),
  	tombstoned = obj.getTombstoned(),
  	missedBlocksCounter = obj.getMissedBlocksCounter(),
  )

  public override fun convert(obj: ValidatorSigningInfo): Slashing.ValidatorSigningInfo {
    val builder = Slashing.ValidatorSigningInfo.newBuilder()
    builder.setAddress(obj.address)
    builder.setStartHeight(obj.startHeight)
    builder.setIndexOffset(obj.indexOffset)
    builder.setJailedUntil(TimestampJvmConverter.convert(obj.jailedUntil))
    builder.setTombstoned(obj.tombstoned)
    builder.setMissedBlocksCounter(obj.missedBlocksCounter)
    return builder.build()
  }
}

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Slashing.Params> {
  public override val descriptor: Descriptors.Descriptor = Slashing.Params.getDescriptor()

  public override val parser: Parser<Slashing.Params> = Slashing.Params.parser()

  public override fun convert(obj: Slashing.Params): Params = Params(
  	signedBlocksWindow = obj.getSignedBlocksWindow(),
  	minSignedPerWindow = obj.getMinSignedPerWindow().toByteArray(),
  	downtimeJailDuration = DurationJvmConverter.convert(obj.getDowntimeJailDuration()),
  	slashFractionDoubleSign = obj.getSlashFractionDoubleSign().toByteArray(),
  	slashFractionDowntime = obj.getSlashFractionDowntime().toByteArray(),
  )

  public override fun convert(obj: Params): Slashing.Params {
    val builder = Slashing.Params.newBuilder()
    builder.setSignedBlocksWindow(obj.signedBlocksWindow)
    builder.setMinSignedPerWindow(ByteString.copyFrom(obj.minSignedPerWindow))
    builder.setDowntimeJailDuration(DurationJvmConverter.convert(obj.downtimeJailDuration))
    builder.setSlashFractionDoubleSign(ByteString.copyFrom(obj.slashFractionDoubleSign))
    builder.setSlashFractionDowntime(ByteString.copyFrom(obj.slashFractionDowntime))
    return builder.build()
  }
}
