// Transform from cosmos/nft/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	classes = obj.getClassesList().map { ClassJvmConverter.convert(it) },
  	entries = obj.getEntriesList().map { EntryJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.addAllClasses(obj.classes.map { ClassJvmConverter.convert(it) })
    builder.addAllEntries(obj.entries.map { EntryJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EntryJvmConverter : ProtobufTypeMapper<Entry, Genesis.Entry> {
  public override val descriptor: Descriptors.Descriptor = Genesis.Entry.getDescriptor()

  public override val parser: Parser<Genesis.Entry> = Genesis.Entry.parser()

  public override fun convert(obj: Genesis.Entry): Entry = Entry(
  	owner = obj.getOwner(),
  	nfts = obj.getNftsList().map { NFTJvmConverter.convert(it) },
  )

  public override fun convert(obj: Entry): Genesis.Entry {
    val builder = Genesis.Entry.newBuilder()
    builder.setOwner(obj.owner)
    builder.addAllNfts(obj.nfts.map { NFTJvmConverter.convert(it) })
    return builder.build()
  }
}
