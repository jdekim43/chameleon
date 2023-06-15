// Transform from cosmos/capability/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.capability.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisOwnersJvmConverter : ProtobufTypeMapper<GenesisOwners, Genesis.GenesisOwners> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisOwners.getDescriptor()

  public override val parser: Parser<Genesis.GenesisOwners> = Genesis.GenesisOwners.parser()

  public override fun convert(obj: Genesis.GenesisOwners): GenesisOwners = GenesisOwners(
  	index = obj.getIndex().asKotlinType,
  	indexOwners = CapabilityOwnersJvmConverter.convert(obj.getIndexOwners()),
  )

  public override fun convert(obj: GenesisOwners): Genesis.GenesisOwners {
    val builder = Genesis.GenesisOwners.newBuilder()
    builder.setIndex(obj.index.asJavaType)
    builder.setIndexOwners(CapabilityOwnersJvmConverter.convert(obj.indexOwners))
    return builder.build()
  }
}

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	index = obj.getIndex().asKotlinType,
  	owners = obj.getOwnersList().map { GenesisOwnersJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setIndex(obj.index.asJavaType)
    builder.addAllOwners(obj.owners.map { GenesisOwnersJvmConverter.convert(it) })
    return builder.build()
  }
}
