// Transform from cosmos/auth/v1beta1/auth.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object BaseAccountConverter : ProtobufConverter<BaseAccount>

public fun BaseAccount.toAny(): Any = Any(BaseAccount.TYPE_URL, with(BaseAccountConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BaseAccount>): BaseAccount {
  if (typeUrl != BaseAccount.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ModuleAccountConverter : ProtobufConverter<ModuleAccount>

public fun ModuleAccount.toAny(): Any = Any(ModuleAccount.TYPE_URL, with(ModuleAccountConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ModuleAccount>): ModuleAccount {
  if (typeUrl != ModuleAccount.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ModuleCredentialConverter : ProtobufConverter<ModuleCredential>

public fun ModuleCredential.toAny(): Any = Any(ModuleCredential.TYPE_URL,
    with(ModuleCredentialConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ModuleCredential>): ModuleCredential {
  if (typeUrl != ModuleCredential.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
