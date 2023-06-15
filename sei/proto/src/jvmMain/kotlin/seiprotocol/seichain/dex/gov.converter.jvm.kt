// Transform from dex/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object AddAssetMetadataProposalJvmConverter :
    ProtobufTypeMapper<AddAssetMetadataProposal, Gov.AddAssetMetadataProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Gov.AddAssetMetadataProposal.getDescriptor()

  public override val parser: Parser<Gov.AddAssetMetadataProposal> =
      Gov.AddAssetMetadataProposal.parser()

  public override fun convert(obj: Gov.AddAssetMetadataProposal): AddAssetMetadataProposal =
      AddAssetMetadataProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	assetList = obj.getAssetListList().map { AssetMetadataJvmConverter.convert(it) },
  )

  public override fun convert(obj: AddAssetMetadataProposal): Gov.AddAssetMetadataProposal {
    val builder = Gov.AddAssetMetadataProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllAssetList(obj.assetList.map { AssetMetadataJvmConverter.convert(it) })
    return builder.build()
  }
}
