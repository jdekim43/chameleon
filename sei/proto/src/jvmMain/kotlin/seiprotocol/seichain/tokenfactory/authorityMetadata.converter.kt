// Transform from tokenfactory/authorityMetadata.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object DenomAuthorityMetadataConverter : ProtobufConverter<DenomAuthorityMetadata> by
    DenomAuthorityMetadataJvmConverter
