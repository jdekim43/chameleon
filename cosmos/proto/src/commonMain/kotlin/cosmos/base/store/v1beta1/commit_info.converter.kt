// Transform from cosmos/base/store/v1beta1/commit_info.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.store.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object CommitInfoConverter : ProtobufConverter<CommitInfo>

public fun CommitInfo.toAny(): Any = Any(CommitInfo.TYPE_URL, with(CommitInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CommitInfo>): CommitInfo {
  if (typeUrl != CommitInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object StoreInfoConverter : ProtobufConverter<StoreInfo>

public fun StoreInfo.toAny(): Any = Any(StoreInfo.TYPE_URL, with(StoreInfoConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<StoreInfo>): StoreInfo {
  if (typeUrl != StoreInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CommitIDConverter : ProtobufConverter<CommitID>

public fun CommitID.toAny(): Any = Any(CommitID.TYPE_URL, with(CommitIDConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CommitID>): CommitID {
  if (typeUrl != CommitID.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
