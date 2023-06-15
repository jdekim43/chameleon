// Transform from cosmos/auth/v1beta1/auth.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object BaseAccountConverter : ProtobufConverter<BaseAccount> by
    BaseAccountJvmConverter

public actual object ModuleAccountConverter : ProtobufConverter<ModuleAccount> by
    ModuleAccountJvmConverter

public actual object ModuleCredentialConverter : ProtobufConverter<ModuleCredential> by
    ModuleCredentialJvmConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter
