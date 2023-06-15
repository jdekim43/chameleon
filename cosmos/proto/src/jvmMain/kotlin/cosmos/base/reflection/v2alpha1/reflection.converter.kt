// Transform from cosmos/base/reflection/v2alpha1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v2alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object AppDescriptorConverter : ProtobufConverter<AppDescriptor> by
    AppDescriptorJvmConverter

public actual object TxDescriptorConverter : ProtobufConverter<TxDescriptor> by
    TxDescriptorJvmConverter

public actual object AuthnDescriptorConverter : ProtobufConverter<AuthnDescriptor> by
    AuthnDescriptorJvmConverter

public actual object SigningModeDescriptorConverter : ProtobufConverter<SigningModeDescriptor> by
    SigningModeDescriptorJvmConverter

public actual object ChainDescriptorConverter : ProtobufConverter<ChainDescriptor> by
    ChainDescriptorJvmConverter

public actual object CodecDescriptorConverter : ProtobufConverter<CodecDescriptor> by
    CodecDescriptorJvmConverter

public actual object InterfaceDescriptorConverter : ProtobufConverter<InterfaceDescriptor> by
    InterfaceDescriptorJvmConverter

public actual object InterfaceImplementerDescriptorConverter :
    ProtobufConverter<InterfaceImplementerDescriptor> by InterfaceImplementerDescriptorJvmConverter

public actual object InterfaceAcceptingMessageDescriptorConverter :
    ProtobufConverter<InterfaceAcceptingMessageDescriptor> by
    InterfaceAcceptingMessageDescriptorJvmConverter

public actual object ConfigurationDescriptorConverter : ProtobufConverter<ConfigurationDescriptor>
    by ConfigurationDescriptorJvmConverter

public actual object MsgDescriptorConverter : ProtobufConverter<MsgDescriptor> by
    MsgDescriptorJvmConverter

public actual object GetAuthnDescriptorRequestConverter :
    ProtobufConverter<GetAuthnDescriptorRequest> by GetAuthnDescriptorRequestJvmConverter

public actual object GetAuthnDescriptorResponseConverter :
    ProtobufConverter<GetAuthnDescriptorResponse> by GetAuthnDescriptorResponseJvmConverter

public actual object GetChainDescriptorRequestConverter :
    ProtobufConverter<GetChainDescriptorRequest> by GetChainDescriptorRequestJvmConverter

public actual object GetChainDescriptorResponseConverter :
    ProtobufConverter<GetChainDescriptorResponse> by GetChainDescriptorResponseJvmConverter

public actual object GetCodecDescriptorRequestConverter :
    ProtobufConverter<GetCodecDescriptorRequest> by GetCodecDescriptorRequestJvmConverter

public actual object GetCodecDescriptorResponseConverter :
    ProtobufConverter<GetCodecDescriptorResponse> by GetCodecDescriptorResponseJvmConverter

public actual object GetConfigurationDescriptorRequestConverter :
    ProtobufConverter<GetConfigurationDescriptorRequest> by
    GetConfigurationDescriptorRequestJvmConverter

public actual object GetConfigurationDescriptorResponseConverter :
    ProtobufConverter<GetConfigurationDescriptorResponse> by
    GetConfigurationDescriptorResponseJvmConverter

public actual object GetQueryServicesDescriptorRequestConverter :
    ProtobufConverter<GetQueryServicesDescriptorRequest> by
    GetQueryServicesDescriptorRequestJvmConverter

public actual object GetQueryServicesDescriptorResponseConverter :
    ProtobufConverter<GetQueryServicesDescriptorResponse> by
    GetQueryServicesDescriptorResponseJvmConverter

public actual object GetTxDescriptorRequestConverter : ProtobufConverter<GetTxDescriptorRequest> by
    GetTxDescriptorRequestJvmConverter

public actual object GetTxDescriptorResponseConverter : ProtobufConverter<GetTxDescriptorResponse>
    by GetTxDescriptorResponseJvmConverter

public actual object QueryServicesDescriptorConverter : ProtobufConverter<QueryServicesDescriptor>
    by QueryServicesDescriptorJvmConverter

public actual object QueryServiceDescriptorConverter : ProtobufConverter<QueryServiceDescriptor> by
    QueryServiceDescriptorJvmConverter

public actual object QueryMethodDescriptorConverter : ProtobufConverter<QueryMethodDescriptor> by
    QueryMethodDescriptorJvmConverter
