// Transform from cosmos/base/store/v1beta1/commit_info.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.store.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object CommitInfoJvmConverter :
    ProtobufTypeMapper<CommitInfo, CommitInfoOuterClass.CommitInfo> {
  public override val descriptor: Descriptors.Descriptor =
      CommitInfoOuterClass.CommitInfo.getDescriptor()

  public override val parser: Parser<CommitInfoOuterClass.CommitInfo> =
      CommitInfoOuterClass.CommitInfo.parser()

  public override fun convert(obj: CommitInfoOuterClass.CommitInfo): CommitInfo = CommitInfo(
  	version = obj.getVersion(),
  	storeInfos = obj.getStoreInfosList().map { StoreInfoJvmConverter.convert(it) },
  	timestamp = TimestampJvmConverter.convert(obj.getTimestamp()),
  )

  public override fun convert(obj: CommitInfo): CommitInfoOuterClass.CommitInfo {
    val builder = CommitInfoOuterClass.CommitInfo.newBuilder()
    builder.setVersion(obj.version)
    builder.addAllStoreInfos(obj.storeInfos.map { StoreInfoJvmConverter.convert(it) })
    builder.setTimestamp(TimestampJvmConverter.convert(obj.timestamp))
    return builder.build()
  }
}

public object StoreInfoJvmConverter : ProtobufTypeMapper<StoreInfo, CommitInfoOuterClass.StoreInfo>
    {
  public override val descriptor: Descriptors.Descriptor =
      CommitInfoOuterClass.StoreInfo.getDescriptor()

  public override val parser: Parser<CommitInfoOuterClass.StoreInfo> =
      CommitInfoOuterClass.StoreInfo.parser()

  public override fun convert(obj: CommitInfoOuterClass.StoreInfo): StoreInfo = StoreInfo(
  	name = obj.getName(),
  	commitId = CommitIDJvmConverter.convert(obj.getCommitId()),
  )

  public override fun convert(obj: StoreInfo): CommitInfoOuterClass.StoreInfo {
    val builder = CommitInfoOuterClass.StoreInfo.newBuilder()
    builder.setName(obj.name)
    builder.setCommitId(CommitIDJvmConverter.convert(obj.commitId))
    return builder.build()
  }
}

public object CommitIDJvmConverter : ProtobufTypeMapper<CommitID, CommitInfoOuterClass.CommitID> {
  public override val descriptor: Descriptors.Descriptor =
      CommitInfoOuterClass.CommitID.getDescriptor()

  public override val parser: Parser<CommitInfoOuterClass.CommitID> =
      CommitInfoOuterClass.CommitID.parser()

  public override fun convert(obj: CommitInfoOuterClass.CommitID): CommitID = CommitID(
  	version = obj.getVersion(),
  	hash = obj.getHash().toByteArray(),
  )

  public override fun convert(obj: CommitID): CommitInfoOuterClass.CommitID {
    val builder = CommitInfoOuterClass.CommitID.newBuilder()
    builder.setVersion(obj.version)
    builder.setHash(ByteString.copyFrom(obj.hash))
    return builder.build()
  }
}
