// Transform from cosmos/base/reflection/v2alpha1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v2alpha1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object AppDescriptorConverter : ProtobufConverter<AppDescriptor>

public fun AppDescriptor.toAny(): Any = Any(AppDescriptor.TYPE_URL, with(AppDescriptorConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AppDescriptor>): AppDescriptor {
  if (typeUrl != AppDescriptor.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxDescriptorConverter : ProtobufConverter<TxDescriptor>

public fun TxDescriptor.toAny(): Any = Any(TxDescriptor.TYPE_URL, with(TxDescriptorConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxDescriptor>): TxDescriptor {
  if (typeUrl != TxDescriptor.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AuthnDescriptorConverter : ProtobufConverter<AuthnDescriptor>

public fun AuthnDescriptor.toAny(): Any = Any(AuthnDescriptor.TYPE_URL,
    with(AuthnDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AuthnDescriptor>): AuthnDescriptor {
  if (typeUrl != AuthnDescriptor.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SigningModeDescriptorConverter : ProtobufConverter<SigningModeDescriptor>

public fun SigningModeDescriptor.toAny(): Any = Any(SigningModeDescriptor.TYPE_URL,
    with(SigningModeDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SigningModeDescriptor>): SigningModeDescriptor {
  if (typeUrl != SigningModeDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ChainDescriptorConverter : ProtobufConverter<ChainDescriptor>

public fun ChainDescriptor.toAny(): Any = Any(ChainDescriptor.TYPE_URL,
    with(ChainDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ChainDescriptor>): ChainDescriptor {
  if (typeUrl != ChainDescriptor.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CodecDescriptorConverter : ProtobufConverter<CodecDescriptor>

public fun CodecDescriptor.toAny(): Any = Any(CodecDescriptor.TYPE_URL,
    with(CodecDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CodecDescriptor>): CodecDescriptor {
  if (typeUrl != CodecDescriptor.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object InterfaceDescriptorConverter : ProtobufConverter<InterfaceDescriptor>

public fun InterfaceDescriptor.toAny(): Any = Any(InterfaceDescriptor.TYPE_URL,
    with(InterfaceDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<InterfaceDescriptor>): InterfaceDescriptor {
  if (typeUrl != InterfaceDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object InterfaceImplementerDescriptorConverter :
    ProtobufConverter<InterfaceImplementerDescriptor>

public fun InterfaceImplementerDescriptor.toAny(): Any =
    Any(InterfaceImplementerDescriptor.TYPE_URL, with(InterfaceImplementerDescriptorConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<InterfaceImplementerDescriptor>):
    InterfaceImplementerDescriptor {
  if (typeUrl != InterfaceImplementerDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object InterfaceAcceptingMessageDescriptorConverter :
    ProtobufConverter<InterfaceAcceptingMessageDescriptor>

public fun InterfaceAcceptingMessageDescriptor.toAny(): Any =
    Any(InterfaceAcceptingMessageDescriptor.TYPE_URL,
    with(InterfaceAcceptingMessageDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<InterfaceAcceptingMessageDescriptor>):
    InterfaceAcceptingMessageDescriptor {
  if (typeUrl != InterfaceAcceptingMessageDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ConfigurationDescriptorConverter : ProtobufConverter<ConfigurationDescriptor>

public fun ConfigurationDescriptor.toAny(): Any = Any(ConfigurationDescriptor.TYPE_URL,
    with(ConfigurationDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ConfigurationDescriptor>):
    ConfigurationDescriptor {
  if (typeUrl != ConfigurationDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDescriptorConverter : ProtobufConverter<MsgDescriptor>

public fun MsgDescriptor.toAny(): Any = Any(MsgDescriptor.TYPE_URL, with(MsgDescriptorConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDescriptor>): MsgDescriptor {
  if (typeUrl != MsgDescriptor.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetAuthnDescriptorRequestConverter :
    ProtobufConverter<GetAuthnDescriptorRequest>

public fun GetAuthnDescriptorRequest.toAny(): Any = Any(GetAuthnDescriptorRequest.TYPE_URL,
    with(GetAuthnDescriptorRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetAuthnDescriptorRequest>):
    GetAuthnDescriptorRequest {
  if (typeUrl != GetAuthnDescriptorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetAuthnDescriptorResponseConverter :
    ProtobufConverter<GetAuthnDescriptorResponse>

public fun GetAuthnDescriptorResponse.toAny(): Any = Any(GetAuthnDescriptorResponse.TYPE_URL,
    with(GetAuthnDescriptorResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetAuthnDescriptorResponse>):
    GetAuthnDescriptorResponse {
  if (typeUrl != GetAuthnDescriptorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetChainDescriptorRequestConverter :
    ProtobufConverter<GetChainDescriptorRequest>

public fun GetChainDescriptorRequest.toAny(): Any = Any(GetChainDescriptorRequest.TYPE_URL,
    with(GetChainDescriptorRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetChainDescriptorRequest>):
    GetChainDescriptorRequest {
  if (typeUrl != GetChainDescriptorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetChainDescriptorResponseConverter :
    ProtobufConverter<GetChainDescriptorResponse>

public fun GetChainDescriptorResponse.toAny(): Any = Any(GetChainDescriptorResponse.TYPE_URL,
    with(GetChainDescriptorResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetChainDescriptorResponse>):
    GetChainDescriptorResponse {
  if (typeUrl != GetChainDescriptorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetCodecDescriptorRequestConverter :
    ProtobufConverter<GetCodecDescriptorRequest>

public fun GetCodecDescriptorRequest.toAny(): Any = Any(GetCodecDescriptorRequest.TYPE_URL,
    with(GetCodecDescriptorRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetCodecDescriptorRequest>):
    GetCodecDescriptorRequest {
  if (typeUrl != GetCodecDescriptorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetCodecDescriptorResponseConverter :
    ProtobufConverter<GetCodecDescriptorResponse>

public fun GetCodecDescriptorResponse.toAny(): Any = Any(GetCodecDescriptorResponse.TYPE_URL,
    with(GetCodecDescriptorResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetCodecDescriptorResponse>):
    GetCodecDescriptorResponse {
  if (typeUrl != GetCodecDescriptorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetConfigurationDescriptorRequestConverter :
    ProtobufConverter<GetConfigurationDescriptorRequest>

public fun GetConfigurationDescriptorRequest.toAny(): Any =
    Any(GetConfigurationDescriptorRequest.TYPE_URL, with(GetConfigurationDescriptorRequestConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetConfigurationDescriptorRequest>):
    GetConfigurationDescriptorRequest {
  if (typeUrl != GetConfigurationDescriptorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetConfigurationDescriptorResponseConverter :
    ProtobufConverter<GetConfigurationDescriptorResponse>

public fun GetConfigurationDescriptorResponse.toAny(): Any =
    Any(GetConfigurationDescriptorResponse.TYPE_URL,
    with(GetConfigurationDescriptorResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetConfigurationDescriptorResponse>):
    GetConfigurationDescriptorResponse {
  if (typeUrl != GetConfigurationDescriptorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetQueryServicesDescriptorRequestConverter :
    ProtobufConverter<GetQueryServicesDescriptorRequest>

public fun GetQueryServicesDescriptorRequest.toAny(): Any =
    Any(GetQueryServicesDescriptorRequest.TYPE_URL, with(GetQueryServicesDescriptorRequestConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetQueryServicesDescriptorRequest>):
    GetQueryServicesDescriptorRequest {
  if (typeUrl != GetQueryServicesDescriptorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetQueryServicesDescriptorResponseConverter :
    ProtobufConverter<GetQueryServicesDescriptorResponse>

public fun GetQueryServicesDescriptorResponse.toAny(): Any =
    Any(GetQueryServicesDescriptorResponse.TYPE_URL,
    with(GetQueryServicesDescriptorResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetQueryServicesDescriptorResponse>):
    GetQueryServicesDescriptorResponse {
  if (typeUrl != GetQueryServicesDescriptorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetTxDescriptorRequestConverter : ProtobufConverter<GetTxDescriptorRequest>

public fun GetTxDescriptorRequest.toAny(): Any = Any(GetTxDescriptorRequest.TYPE_URL,
    with(GetTxDescriptorRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetTxDescriptorRequest>): GetTxDescriptorRequest {
  if (typeUrl != GetTxDescriptorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetTxDescriptorResponseConverter : ProtobufConverter<GetTxDescriptorResponse>

public fun GetTxDescriptorResponse.toAny(): Any = Any(GetTxDescriptorResponse.TYPE_URL,
    with(GetTxDescriptorResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetTxDescriptorResponse>):
    GetTxDescriptorResponse {
  if (typeUrl != GetTxDescriptorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryServicesDescriptorConverter : ProtobufConverter<QueryServicesDescriptor>

public fun QueryServicesDescriptor.toAny(): Any = Any(QueryServicesDescriptor.TYPE_URL,
    with(QueryServicesDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryServicesDescriptor>):
    QueryServicesDescriptor {
  if (typeUrl != QueryServicesDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryServiceDescriptorConverter : ProtobufConverter<QueryServiceDescriptor>

public fun QueryServiceDescriptor.toAny(): Any = Any(QueryServiceDescriptor.TYPE_URL,
    with(QueryServiceDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryServiceDescriptor>): QueryServiceDescriptor {
  if (typeUrl != QueryServiceDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryMethodDescriptorConverter : ProtobufConverter<QueryMethodDescriptor>

public fun QueryMethodDescriptor.toAny(): Any = Any(QueryMethodDescriptor.TYPE_URL,
    with(QueryMethodDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryMethodDescriptor>): QueryMethodDescriptor {
  if (typeUrl != QueryMethodDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
