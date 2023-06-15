// Transform from tokenfactory/authorityMetadata.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object DenomAuthorityMetadataConverter : ProtobufConverter<DenomAuthorityMetadata>

public fun DenomAuthorityMetadata.toAny(): Any = Any(DenomAuthorityMetadata.TYPE_URL,
    with(DenomAuthorityMetadataConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DenomAuthorityMetadata>): DenomAuthorityMetadata {
  if (typeUrl != DenomAuthorityMetadata.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
