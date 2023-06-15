// Transform from cosmos/base/store/v1beta1/commit_info.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.store.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object CommitInfoConverter : ProtobufConverter<CommitInfo> by CommitInfoJvmConverter

public actual object StoreInfoConverter : ProtobufConverter<StoreInfo> by StoreInfoJvmConverter

public actual object CommitIDConverter : ProtobufConverter<CommitID> by CommitIDJvmConverter
