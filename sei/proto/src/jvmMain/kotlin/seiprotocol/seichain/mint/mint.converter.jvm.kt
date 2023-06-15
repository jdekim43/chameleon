// Transform from mint/v1beta1/mint.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MinterJvmConverter : ProtobufTypeMapper<Minter, Mint.Minter> {
  public override val descriptor: Descriptors.Descriptor = Mint.Minter.getDescriptor()

  public override val parser: Parser<Mint.Minter> = Mint.Minter.parser()

  public override fun convert(obj: Mint.Minter): Minter = Minter(
  	startDate = obj.getStartDate(),
  	endDate = obj.getEndDate(),
  	denom = obj.getDenom(),
  	totalMintAmount = obj.getTotalMintAmount().asKotlinType,
  	remainingMintAmount = obj.getRemainingMintAmount().asKotlinType,
  	lastMintAmount = obj.getLastMintAmount().asKotlinType,
  	lastMintDate = obj.getLastMintDate(),
  	lastMintHeight = obj.getLastMintHeight().asKotlinType,
  )

  public override fun convert(obj: Minter): Mint.Minter {
    val builder = Mint.Minter.newBuilder()
    builder.setStartDate(obj.startDate)
    builder.setEndDate(obj.endDate)
    builder.setDenom(obj.denom)
    builder.setTotalMintAmount(obj.totalMintAmount.asJavaType)
    builder.setRemainingMintAmount(obj.remainingMintAmount.asJavaType)
    builder.setLastMintAmount(obj.lastMintAmount.asJavaType)
    builder.setLastMintDate(obj.lastMintDate)
    builder.setLastMintHeight(obj.lastMintHeight.asJavaType)
    return builder.build()
  }
}

public object ScheduledTokenReleaseJvmConverter :
    ProtobufTypeMapper<ScheduledTokenRelease, Mint.ScheduledTokenRelease> {
  public override val descriptor: Descriptors.Descriptor =
      Mint.ScheduledTokenRelease.getDescriptor()

  public override val parser: Parser<Mint.ScheduledTokenRelease> =
      Mint.ScheduledTokenRelease.parser()

  public override fun convert(obj: Mint.ScheduledTokenRelease): ScheduledTokenRelease =
      ScheduledTokenRelease(
  	startDate = obj.getStartDate(),
  	endDate = obj.getEndDate(),
  	tokenReleaseAmount = obj.getTokenReleaseAmount().asKotlinType,
  )

  public override fun convert(obj: ScheduledTokenRelease): Mint.ScheduledTokenRelease {
    val builder = Mint.ScheduledTokenRelease.newBuilder()
    builder.setStartDate(obj.startDate)
    builder.setEndDate(obj.endDate)
    builder.setTokenReleaseAmount(obj.tokenReleaseAmount.asJavaType)
    return builder.build()
  }
}

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Mint.Params> {
  public override val descriptor: Descriptors.Descriptor = Mint.Params.getDescriptor()

  public override val parser: Parser<Mint.Params> = Mint.Params.parser()

  public override fun convert(obj: Mint.Params): Params = Params(
  	mintDenom = obj.getMintDenom(),
  	tokenReleaseSchedule = obj.getTokenReleaseScheduleList().map {
      ScheduledTokenReleaseJvmConverter.convert(it) },
  )

  public override fun convert(obj: Params): Mint.Params {
    val builder = Mint.Params.newBuilder()
    builder.setMintDenom(obj.mintDenom)
    builder.addAllTokenReleaseSchedule(obj.tokenReleaseSchedule.map {
        ScheduledTokenReleaseJvmConverter.convert(it) })
    return builder.build()
  }
}

public object Version2MinterJvmConverter : ProtobufTypeMapper<Version2Minter, Mint.Version2Minter> {
  public override val descriptor: Descriptors.Descriptor = Mint.Version2Minter.getDescriptor()

  public override val parser: Parser<Mint.Version2Minter> = Mint.Version2Minter.parser()

  public override fun convert(obj: Mint.Version2Minter): Version2Minter = Version2Minter(
  	lastMintAmount = obj.getLastMintAmount(),
  	lastMintDate = obj.getLastMintDate(),
  	lastMintHeight = obj.getLastMintHeight(),
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: Version2Minter): Mint.Version2Minter {
    val builder = Mint.Version2Minter.newBuilder()
    builder.setLastMintAmount(obj.lastMintAmount)
    builder.setLastMintDate(obj.lastMintDate)
    builder.setLastMintHeight(obj.lastMintHeight)
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object Version2ScheduledTokenReleaseJvmConverter :
    ProtobufTypeMapper<Version2ScheduledTokenRelease, Mint.Version2ScheduledTokenRelease> {
  public override val descriptor: Descriptors.Descriptor =
      Mint.Version2ScheduledTokenRelease.getDescriptor()

  public override val parser: Parser<Mint.Version2ScheduledTokenRelease> =
      Mint.Version2ScheduledTokenRelease.parser()

  public override fun convert(obj: Mint.Version2ScheduledTokenRelease):
      Version2ScheduledTokenRelease = Version2ScheduledTokenRelease(
  	date = obj.getDate(),
  	tokenReleaseAmount = obj.getTokenReleaseAmount(),
  )

  public override fun convert(obj: Version2ScheduledTokenRelease):
      Mint.Version2ScheduledTokenRelease {
    val builder = Mint.Version2ScheduledTokenRelease.newBuilder()
    builder.setDate(obj.date)
    builder.setTokenReleaseAmount(obj.tokenReleaseAmount)
    return builder.build()
  }
}

public object Version2ParamsJvmConverter : ProtobufTypeMapper<Version2Params, Mint.Version2Params> {
  public override val descriptor: Descriptors.Descriptor = Mint.Version2Params.getDescriptor()

  public override val parser: Parser<Mint.Version2Params> = Mint.Version2Params.parser()

  public override fun convert(obj: Mint.Version2Params): Version2Params = Version2Params(
  	mintDenom = obj.getMintDenom(),
  	tokenReleaseSchedule = obj.getTokenReleaseScheduleList().map {
      Version2ScheduledTokenReleaseJvmConverter.convert(it) },
  )

  public override fun convert(obj: Version2Params): Mint.Version2Params {
    val builder = Mint.Version2Params.newBuilder()
    builder.setMintDenom(obj.mintDenom)
    builder.addAllTokenReleaseSchedule(obj.tokenReleaseSchedule.map {
        Version2ScheduledTokenReleaseJvmConverter.convert(it) })
    return builder.build()
  }
}
