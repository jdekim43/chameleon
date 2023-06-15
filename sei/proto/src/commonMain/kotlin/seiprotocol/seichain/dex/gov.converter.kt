// Transform from dex/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object AddAssetMetadataProposalConverter : ProtobufConverter<AddAssetMetadataProposal>

public fun AddAssetMetadataProposal.toAny(): Any = Any(AddAssetMetadataProposal.TYPE_URL,
    with(AddAssetMetadataProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AddAssetMetadataProposal>):
    AddAssetMetadataProposal {
  if (typeUrl != AddAssetMetadataProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
