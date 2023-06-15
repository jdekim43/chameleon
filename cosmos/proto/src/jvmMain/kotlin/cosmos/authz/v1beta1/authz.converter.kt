// Transform from cosmos/authz/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenericAuthorizationConverter : ProtobufConverter<GenericAuthorization> by
    GenericAuthorizationJvmConverter

public actual object GrantConverter : ProtobufConverter<Grant> by GrantJvmConverter

public actual object GrantAuthorizationConverter : ProtobufConverter<GrantAuthorization> by
    GrantAuthorizationJvmConverter

public actual object GrantQueueItemConverter : ProtobufConverter<GrantQueueItem> by
    GrantQueueItemJvmConverter
