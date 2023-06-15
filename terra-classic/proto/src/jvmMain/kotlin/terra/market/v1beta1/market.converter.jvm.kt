// Transform from terra/market/v1beta1/market.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.market.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Market.Params> {
  public override val descriptor: Descriptors.Descriptor = Market.Params.getDescriptor()

  public override val parser: Parser<Market.Params> = Market.Params.parser()

  public override fun convert(obj: Market.Params): Params = Params(
  	basePool = obj.getBasePool().toByteArray(),
  	poolRecoveryPeriod = obj.getPoolRecoveryPeriod().asKotlinType,
  	minStabilitySpread = obj.getMinStabilitySpread().toByteArray(),
  )

  public override fun convert(obj: Params): Market.Params {
    val builder = Market.Params.newBuilder()
    builder.setBasePool(ByteString.copyFrom(obj.basePool))
    builder.setPoolRecoveryPeriod(obj.poolRecoveryPeriod.asJavaType)
    builder.setMinStabilitySpread(ByteString.copyFrom(obj.minStabilitySpread))
    return builder.build()
  }
}
