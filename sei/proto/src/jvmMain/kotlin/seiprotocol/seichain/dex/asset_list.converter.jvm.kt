// Transform from dex/asset_list.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.bank.v1beta1.MetadataJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object AssetIBCInfoJvmConverter : ProtobufTypeMapper<AssetIBCInfo, AssetList.AssetIBCInfo> {
  public override val descriptor: Descriptors.Descriptor = AssetList.AssetIBCInfo.getDescriptor()

  public override val parser: Parser<AssetList.AssetIBCInfo> = AssetList.AssetIBCInfo.parser()

  public override fun convert(obj: AssetList.AssetIBCInfo): AssetIBCInfo = AssetIBCInfo(
  	sourceChannel = obj.getSourceChannel(),
  	dstChannel = obj.getDstChannel(),
  	sourceDenom = obj.getSourceDenom(),
  	sourceChainID = obj.getSourceChainID(),
  )

  public override fun convert(obj: AssetIBCInfo): AssetList.AssetIBCInfo {
    val builder = AssetList.AssetIBCInfo.newBuilder()
    builder.setSourceChannel(obj.sourceChannel)
    builder.setDstChannel(obj.dstChannel)
    builder.setSourceDenom(obj.sourceDenom)
    builder.setSourceChainID(obj.sourceChainID)
    return builder.build()
  }
}

public object AssetMetadataJvmConverter : ProtobufTypeMapper<AssetMetadata, AssetList.AssetMetadata>
    {
  public override val descriptor: Descriptors.Descriptor = AssetList.AssetMetadata.getDescriptor()

  public override val parser: Parser<AssetList.AssetMetadata> = AssetList.AssetMetadata.parser()

  public override fun convert(obj: AssetList.AssetMetadata): AssetMetadata = AssetMetadata(
  	ibcInfo = AssetIBCInfoJvmConverter.convert(obj.getIbcInfo()),
  	typeAsset = obj.getTypeAsset(),
  	metadata = MetadataJvmConverter.convert(obj.getMetadata()),
  )

  public override fun convert(obj: AssetMetadata): AssetList.AssetMetadata {
    val builder = AssetList.AssetMetadata.newBuilder()
    builder.setIbcInfo(AssetIBCInfoJvmConverter.convert(obj.ibcInfo))
    builder.setTypeAsset(obj.typeAsset)
    builder.setMetadata(MetadataJvmConverter.convert(obj.metadata))
    return builder.build()
  }
}
