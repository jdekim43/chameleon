// Transform from cosmos/nft/v1beta1/nft.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ClassJvmConverter : ProtobufTypeMapper<Class, Nft.Class> {
  public override val descriptor: Descriptors.Descriptor = Nft.Class.getDescriptor()

  public override val parser: Parser<Nft.Class> = Nft.Class.parser()

  public override fun convert(obj: Nft.Class): Class = Class(
  	id = obj.getId(),
  	name = obj.getName(),
  	symbol = obj.getSymbol(),
  	description = obj.getDescription(),
  	uri = obj.getUri(),
  	uriHash = obj.getUriHash(),
  	`data` = AnyJvmConverter.convert(obj.getData()),
  )

  public override fun convert(obj: Class): Nft.Class {
    val builder = Nft.Class.newBuilder()
    builder.setId(obj.id)
    builder.setName(obj.name)
    builder.setSymbol(obj.symbol)
    builder.setDescription(obj.description)
    builder.setUri(obj.uri)
    builder.setUriHash(obj.uriHash)
    builder.setData(AnyJvmConverter.convert(obj.`data`))
    return builder.build()
  }
}

public object NFTJvmConverter : ProtobufTypeMapper<NFT, Nft.NFT> {
  public override val descriptor: Descriptors.Descriptor = Nft.NFT.getDescriptor()

  public override val parser: Parser<Nft.NFT> = Nft.NFT.parser()

  public override fun convert(obj: Nft.NFT): NFT = NFT(
  	classId = obj.getClassId(),
  	id = obj.getId(),
  	uri = obj.getUri(),
  	uriHash = obj.getUriHash(),
  	`data` = AnyJvmConverter.convert(obj.getData()),
  )

  public override fun convert(obj: NFT): Nft.NFT {
    val builder = Nft.NFT.newBuilder()
    builder.setClassId(obj.classId)
    builder.setId(obj.id)
    builder.setUri(obj.uri)
    builder.setUriHash(obj.uriHash)
    builder.setData(AnyJvmConverter.convert(obj.`data`))
    return builder.build()
  }
}
