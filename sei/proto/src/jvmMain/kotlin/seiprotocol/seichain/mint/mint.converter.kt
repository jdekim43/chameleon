// Transform from mint/v1beta1/mint.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MinterConverter : ProtobufConverter<Minter> by MinterJvmConverter

public actual object ScheduledTokenReleaseConverter : ProtobufConverter<ScheduledTokenRelease> by
    ScheduledTokenReleaseJvmConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object Version2MinterConverter : ProtobufConverter<Version2Minter> by
    Version2MinterJvmConverter

public actual object Version2ScheduledTokenReleaseConverter :
    ProtobufConverter<Version2ScheduledTokenRelease> by Version2ScheduledTokenReleaseJvmConverter

public actual object Version2ParamsConverter : ProtobufConverter<Version2Params> by
    Version2ParamsJvmConverter
