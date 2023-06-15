// Transform from tokenfactory/authorityMetadata.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object DenomAuthorityMetadataJvmConverter :
    ProtobufTypeMapper<DenomAuthorityMetadata, AuthorityMetadata.DenomAuthorityMetadata> {
  public override val descriptor: Descriptors.Descriptor =
      AuthorityMetadata.DenomAuthorityMetadata.getDescriptor()

  public override val parser: Parser<AuthorityMetadata.DenomAuthorityMetadata> =
      AuthorityMetadata.DenomAuthorityMetadata.parser()

  public override fun convert(obj: AuthorityMetadata.DenomAuthorityMetadata): DenomAuthorityMetadata
      = DenomAuthorityMetadata(
  	admin = obj.getAdmin(),
  )

  public override fun convert(obj: DenomAuthorityMetadata):
      AuthorityMetadata.DenomAuthorityMetadata {
    val builder = AuthorityMetadata.DenomAuthorityMetadata.newBuilder()
    builder.setAdmin(obj.admin)
    return builder.build()
  }
}
