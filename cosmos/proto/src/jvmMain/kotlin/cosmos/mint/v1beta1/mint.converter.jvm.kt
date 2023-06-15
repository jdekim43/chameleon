// Transform from cosmos/mint/v1beta1/mint.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.mint.v1beta1

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
  	inflation = obj.getInflation(),
  	annualProvisions = obj.getAnnualProvisions(),
  )

  public override fun convert(obj: Minter): Mint.Minter {
    val builder = Mint.Minter.newBuilder()
    builder.setInflation(obj.inflation)
    builder.setAnnualProvisions(obj.annualProvisions)
    return builder.build()
  }
}

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Mint.Params> {
  public override val descriptor: Descriptors.Descriptor = Mint.Params.getDescriptor()

  public override val parser: Parser<Mint.Params> = Mint.Params.parser()

  public override fun convert(obj: Mint.Params): Params = Params(
  	mintDenom = obj.getMintDenom(),
  	inflationRateChange = obj.getInflationRateChange(),
  	inflationMax = obj.getInflationMax(),
  	inflationMin = obj.getInflationMin(),
  	goalBonded = obj.getGoalBonded(),
  	blocksPerYear = obj.getBlocksPerYear().asKotlinType,
  )

  public override fun convert(obj: Params): Mint.Params {
    val builder = Mint.Params.newBuilder()
    builder.setMintDenom(obj.mintDenom)
    builder.setInflationRateChange(obj.inflationRateChange)
    builder.setInflationMax(obj.inflationMax)
    builder.setInflationMin(obj.inflationMin)
    builder.setGoalBonded(obj.goalBonded)
    builder.setBlocksPerYear(obj.blocksPerYear.asJavaType)
    return builder.build()
  }
}
