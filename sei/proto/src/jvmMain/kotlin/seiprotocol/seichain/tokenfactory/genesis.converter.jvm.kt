// Transform from tokenfactory/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	factoryDenoms = obj.getFactoryDenomsList().map { GenesisDenomJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllFactoryDenoms(obj.factoryDenoms.map { GenesisDenomJvmConverter.convert(it) })
    return builder.build()
  }
}

public object GenesisDenomJvmConverter : ProtobufTypeMapper<GenesisDenom, Genesis.GenesisDenom> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisDenom.getDescriptor()

  public override val parser: Parser<Genesis.GenesisDenom> = Genesis.GenesisDenom.parser()

  public override fun convert(obj: Genesis.GenesisDenom): GenesisDenom = GenesisDenom(
  	denom = obj.getDenom(),
  	authorityMetadata = DenomAuthorityMetadataJvmConverter.convert(obj.getAuthorityMetadata()),
  )

  public override fun convert(obj: GenesisDenom): Genesis.GenesisDenom {
    val builder = Genesis.GenesisDenom.newBuilder()
    builder.setDenom(obj.denom)
    builder.setAuthorityMetadata(DenomAuthorityMetadataJvmConverter.convert(obj.authorityMetadata))
    return builder.build()
  }
}
