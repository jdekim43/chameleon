// Transform from cosmos/base/reflection/v2alpha1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v2alpha1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object AppDescriptorJvmConverter :
    ProtobufTypeMapper<AppDescriptor, Reflection.AppDescriptor> {
  public override val descriptor: Descriptors.Descriptor = Reflection.AppDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.AppDescriptor> = Reflection.AppDescriptor.parser()

  public override fun convert(obj: Reflection.AppDescriptor): AppDescriptor = AppDescriptor(
  	authn = AuthnDescriptorJvmConverter.convert(obj.getAuthn()),
  	chain = ChainDescriptorJvmConverter.convert(obj.getChain()),
  	codec = CodecDescriptorJvmConverter.convert(obj.getCodec()),
  	configuration = ConfigurationDescriptorJvmConverter.convert(obj.getConfiguration()),
  	queryServices = QueryServicesDescriptorJvmConverter.convert(obj.getQueryServices()),
  	tx = TxDescriptorJvmConverter.convert(obj.getTx()),
  )

  public override fun convert(obj: AppDescriptor): Reflection.AppDescriptor {
    val builder = Reflection.AppDescriptor.newBuilder()
    builder.setAuthn(AuthnDescriptorJvmConverter.convert(obj.authn))
    builder.setChain(ChainDescriptorJvmConverter.convert(obj.chain))
    builder.setCodec(CodecDescriptorJvmConverter.convert(obj.codec))
    builder.setConfiguration(ConfigurationDescriptorJvmConverter.convert(obj.configuration))
    builder.setQueryServices(QueryServicesDescriptorJvmConverter.convert(obj.queryServices))
    builder.setTx(TxDescriptorJvmConverter.convert(obj.tx))
    return builder.build()
  }
}

public object TxDescriptorJvmConverter : ProtobufTypeMapper<TxDescriptor, Reflection.TxDescriptor> {
  public override val descriptor: Descriptors.Descriptor = Reflection.TxDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.TxDescriptor> = Reflection.TxDescriptor.parser()

  public override fun convert(obj: Reflection.TxDescriptor): TxDescriptor = TxDescriptor(
  	fullname = obj.getFullname(),
  	msgs = obj.getMsgsList().map { MsgDescriptorJvmConverter.convert(it) },
  )

  public override fun convert(obj: TxDescriptor): Reflection.TxDescriptor {
    val builder = Reflection.TxDescriptor.newBuilder()
    builder.setFullname(obj.fullname)
    builder.addAllMsgs(obj.msgs.map { MsgDescriptorJvmConverter.convert(it) })
    return builder.build()
  }
}

public object AuthnDescriptorJvmConverter :
    ProtobufTypeMapper<AuthnDescriptor, Reflection.AuthnDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.AuthnDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.AuthnDescriptor> =
      Reflection.AuthnDescriptor.parser()

  public override fun convert(obj: Reflection.AuthnDescriptor): AuthnDescriptor = AuthnDescriptor(
  	signModes = obj.getSignModesList().map { SigningModeDescriptorJvmConverter.convert(it) },
  )

  public override fun convert(obj: AuthnDescriptor): Reflection.AuthnDescriptor {
    val builder = Reflection.AuthnDescriptor.newBuilder()
    builder.addAllSignModes(obj.signModes.map { SigningModeDescriptorJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SigningModeDescriptorJvmConverter :
    ProtobufTypeMapper<SigningModeDescriptor, Reflection.SigningModeDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.SigningModeDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.SigningModeDescriptor> =
      Reflection.SigningModeDescriptor.parser()

  public override fun convert(obj: Reflection.SigningModeDescriptor): SigningModeDescriptor =
      SigningModeDescriptor(
  	name = obj.getName(),
  	number = obj.getNumber(),
  	authnInfoProviderMethodFullname = obj.getAuthnInfoProviderMethodFullname(),
  )

  public override fun convert(obj: SigningModeDescriptor): Reflection.SigningModeDescriptor {
    val builder = Reflection.SigningModeDescriptor.newBuilder()
    builder.setName(obj.name)
    builder.setNumber(obj.number)
    builder.setAuthnInfoProviderMethodFullname(obj.authnInfoProviderMethodFullname)
    return builder.build()
  }
}

public object ChainDescriptorJvmConverter :
    ProtobufTypeMapper<ChainDescriptor, Reflection.ChainDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.ChainDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.ChainDescriptor> =
      Reflection.ChainDescriptor.parser()

  public override fun convert(obj: Reflection.ChainDescriptor): ChainDescriptor = ChainDescriptor(
  	id = obj.getId(),
  )

  public override fun convert(obj: ChainDescriptor): Reflection.ChainDescriptor {
    val builder = Reflection.ChainDescriptor.newBuilder()
    builder.setId(obj.id)
    return builder.build()
  }
}

public object CodecDescriptorJvmConverter :
    ProtobufTypeMapper<CodecDescriptor, Reflection.CodecDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.CodecDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.CodecDescriptor> =
      Reflection.CodecDescriptor.parser()

  public override fun convert(obj: Reflection.CodecDescriptor): CodecDescriptor = CodecDescriptor(
  	interfaces = obj.getInterfacesList().map { InterfaceDescriptorJvmConverter.convert(it) },
  )

  public override fun convert(obj: CodecDescriptor): Reflection.CodecDescriptor {
    val builder = Reflection.CodecDescriptor.newBuilder()
    builder.addAllInterfaces(obj.interfaces.map { InterfaceDescriptorJvmConverter.convert(it) })
    return builder.build()
  }
}

public object InterfaceDescriptorJvmConverter :
    ProtobufTypeMapper<InterfaceDescriptor, Reflection.InterfaceDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.InterfaceDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.InterfaceDescriptor> =
      Reflection.InterfaceDescriptor.parser()

  public override fun convert(obj: Reflection.InterfaceDescriptor): InterfaceDescriptor =
      InterfaceDescriptor(
  	fullname = obj.getFullname(),
  	interfaceAcceptingMessages = obj.getInterfaceAcceptingMessagesList().map {
      InterfaceAcceptingMessageDescriptorJvmConverter.convert(it) },
  	interfaceImplementers = obj.getInterfaceImplementersList().map {
      InterfaceImplementerDescriptorJvmConverter.convert(it) },
  )

  public override fun convert(obj: InterfaceDescriptor): Reflection.InterfaceDescriptor {
    val builder = Reflection.InterfaceDescriptor.newBuilder()
    builder.setFullname(obj.fullname)
    builder.addAllInterfaceAcceptingMessages(obj.interfaceAcceptingMessages.map {
        InterfaceAcceptingMessageDescriptorJvmConverter.convert(it) })
    builder.addAllInterfaceImplementers(obj.interfaceImplementers.map {
        InterfaceImplementerDescriptorJvmConverter.convert(it) })
    return builder.build()
  }
}

public object InterfaceImplementerDescriptorJvmConverter :
    ProtobufTypeMapper<InterfaceImplementerDescriptor, Reflection.InterfaceImplementerDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.InterfaceImplementerDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.InterfaceImplementerDescriptor> =
      Reflection.InterfaceImplementerDescriptor.parser()

  public override fun convert(obj: Reflection.InterfaceImplementerDescriptor):
      InterfaceImplementerDescriptor = InterfaceImplementerDescriptor(
  	fullname = obj.getFullname(),
  	typeUrl = obj.getTypeUrl(),
  )

  public override fun convert(obj: InterfaceImplementerDescriptor):
      Reflection.InterfaceImplementerDescriptor {
    val builder = Reflection.InterfaceImplementerDescriptor.newBuilder()
    builder.setFullname(obj.fullname)
    builder.setTypeUrl(obj.typeUrl)
    return builder.build()
  }
}

public object InterfaceAcceptingMessageDescriptorJvmConverter :
    ProtobufTypeMapper<InterfaceAcceptingMessageDescriptor, Reflection.InterfaceAcceptingMessageDescriptor>
    {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.InterfaceAcceptingMessageDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.InterfaceAcceptingMessageDescriptor> =
      Reflection.InterfaceAcceptingMessageDescriptor.parser()

  public override fun convert(obj: Reflection.InterfaceAcceptingMessageDescriptor):
      InterfaceAcceptingMessageDescriptor = InterfaceAcceptingMessageDescriptor(
  	fullname = obj.getFullname(),
  	fieldDescriptorNames = obj.getFieldDescriptorNamesList().map { it },
  )

  public override fun convert(obj: InterfaceAcceptingMessageDescriptor):
      Reflection.InterfaceAcceptingMessageDescriptor {
    val builder = Reflection.InterfaceAcceptingMessageDescriptor.newBuilder()
    builder.setFullname(obj.fullname)
    builder.addAllFieldDescriptorNames(obj.fieldDescriptorNames.map { it })
    return builder.build()
  }
}

public object ConfigurationDescriptorJvmConverter :
    ProtobufTypeMapper<ConfigurationDescriptor, Reflection.ConfigurationDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.ConfigurationDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.ConfigurationDescriptor> =
      Reflection.ConfigurationDescriptor.parser()

  public override fun convert(obj: Reflection.ConfigurationDescriptor): ConfigurationDescriptor =
      ConfigurationDescriptor(
  	bech32AccountAddressPrefix = obj.getBech32AccountAddressPrefix(),
  )

  public override fun convert(obj: ConfigurationDescriptor): Reflection.ConfigurationDescriptor {
    val builder = Reflection.ConfigurationDescriptor.newBuilder()
    builder.setBech32AccountAddressPrefix(obj.bech32AccountAddressPrefix)
    return builder.build()
  }
}

public object MsgDescriptorJvmConverter :
    ProtobufTypeMapper<MsgDescriptor, Reflection.MsgDescriptor> {
  public override val descriptor: Descriptors.Descriptor = Reflection.MsgDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.MsgDescriptor> = Reflection.MsgDescriptor.parser()

  public override fun convert(obj: Reflection.MsgDescriptor): MsgDescriptor = MsgDescriptor(
  	msgTypeUrl = obj.getMsgTypeUrl(),
  )

  public override fun convert(obj: MsgDescriptor): Reflection.MsgDescriptor {
    val builder = Reflection.MsgDescriptor.newBuilder()
    builder.setMsgTypeUrl(obj.msgTypeUrl)
    return builder.build()
  }
}

public object GetAuthnDescriptorRequestJvmConverter :
    ProtobufTypeMapper<GetAuthnDescriptorRequest, Reflection.GetAuthnDescriptorRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetAuthnDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetAuthnDescriptorRequest> =
      Reflection.GetAuthnDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetAuthnDescriptorRequest): GetAuthnDescriptorRequest
      = GetAuthnDescriptorRequest(
  )

  public override fun convert(obj: GetAuthnDescriptorRequest):
      Reflection.GetAuthnDescriptorRequest {
    val builder = Reflection.GetAuthnDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetAuthnDescriptorResponseJvmConverter :
    ProtobufTypeMapper<GetAuthnDescriptorResponse, Reflection.GetAuthnDescriptorResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetAuthnDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetAuthnDescriptorResponse> =
      Reflection.GetAuthnDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetAuthnDescriptorResponse):
      GetAuthnDescriptorResponse = GetAuthnDescriptorResponse(
  	authn = AuthnDescriptorJvmConverter.convert(obj.getAuthn()),
  )

  public override fun convert(obj: GetAuthnDescriptorResponse):
      Reflection.GetAuthnDescriptorResponse {
    val builder = Reflection.GetAuthnDescriptorResponse.newBuilder()
    builder.setAuthn(AuthnDescriptorJvmConverter.convert(obj.authn))
    return builder.build()
  }
}

public object GetChainDescriptorRequestJvmConverter :
    ProtobufTypeMapper<GetChainDescriptorRequest, Reflection.GetChainDescriptorRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetChainDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetChainDescriptorRequest> =
      Reflection.GetChainDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetChainDescriptorRequest): GetChainDescriptorRequest
      = GetChainDescriptorRequest(
  )

  public override fun convert(obj: GetChainDescriptorRequest):
      Reflection.GetChainDescriptorRequest {
    val builder = Reflection.GetChainDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetChainDescriptorResponseJvmConverter :
    ProtobufTypeMapper<GetChainDescriptorResponse, Reflection.GetChainDescriptorResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetChainDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetChainDescriptorResponse> =
      Reflection.GetChainDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetChainDescriptorResponse):
      GetChainDescriptorResponse = GetChainDescriptorResponse(
  	chain = ChainDescriptorJvmConverter.convert(obj.getChain()),
  )

  public override fun convert(obj: GetChainDescriptorResponse):
      Reflection.GetChainDescriptorResponse {
    val builder = Reflection.GetChainDescriptorResponse.newBuilder()
    builder.setChain(ChainDescriptorJvmConverter.convert(obj.chain))
    return builder.build()
  }
}

public object GetCodecDescriptorRequestJvmConverter :
    ProtobufTypeMapper<GetCodecDescriptorRequest, Reflection.GetCodecDescriptorRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetCodecDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetCodecDescriptorRequest> =
      Reflection.GetCodecDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetCodecDescriptorRequest): GetCodecDescriptorRequest
      = GetCodecDescriptorRequest(
  )

  public override fun convert(obj: GetCodecDescriptorRequest):
      Reflection.GetCodecDescriptorRequest {
    val builder = Reflection.GetCodecDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetCodecDescriptorResponseJvmConverter :
    ProtobufTypeMapper<GetCodecDescriptorResponse, Reflection.GetCodecDescriptorResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetCodecDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetCodecDescriptorResponse> =
      Reflection.GetCodecDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetCodecDescriptorResponse):
      GetCodecDescriptorResponse = GetCodecDescriptorResponse(
  	codec = CodecDescriptorJvmConverter.convert(obj.getCodec()),
  )

  public override fun convert(obj: GetCodecDescriptorResponse):
      Reflection.GetCodecDescriptorResponse {
    val builder = Reflection.GetCodecDescriptorResponse.newBuilder()
    builder.setCodec(CodecDescriptorJvmConverter.convert(obj.codec))
    return builder.build()
  }
}

public object GetConfigurationDescriptorRequestJvmConverter :
    ProtobufTypeMapper<GetConfigurationDescriptorRequest, Reflection.GetConfigurationDescriptorRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetConfigurationDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetConfigurationDescriptorRequest> =
      Reflection.GetConfigurationDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetConfigurationDescriptorRequest):
      GetConfigurationDescriptorRequest = GetConfigurationDescriptorRequest(
  )

  public override fun convert(obj: GetConfigurationDescriptorRequest):
      Reflection.GetConfigurationDescriptorRequest {
    val builder = Reflection.GetConfigurationDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetConfigurationDescriptorResponseJvmConverter :
    ProtobufTypeMapper<GetConfigurationDescriptorResponse, Reflection.GetConfigurationDescriptorResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetConfigurationDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetConfigurationDescriptorResponse> =
      Reflection.GetConfigurationDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetConfigurationDescriptorResponse):
      GetConfigurationDescriptorResponse = GetConfigurationDescriptorResponse(
  	config = ConfigurationDescriptorJvmConverter.convert(obj.getConfig()),
  )

  public override fun convert(obj: GetConfigurationDescriptorResponse):
      Reflection.GetConfigurationDescriptorResponse {
    val builder = Reflection.GetConfigurationDescriptorResponse.newBuilder()
    builder.setConfig(ConfigurationDescriptorJvmConverter.convert(obj.config))
    return builder.build()
  }
}

public object GetQueryServicesDescriptorRequestJvmConverter :
    ProtobufTypeMapper<GetQueryServicesDescriptorRequest, Reflection.GetQueryServicesDescriptorRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetQueryServicesDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetQueryServicesDescriptorRequest> =
      Reflection.GetQueryServicesDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetQueryServicesDescriptorRequest):
      GetQueryServicesDescriptorRequest = GetQueryServicesDescriptorRequest(
  )

  public override fun convert(obj: GetQueryServicesDescriptorRequest):
      Reflection.GetQueryServicesDescriptorRequest {
    val builder = Reflection.GetQueryServicesDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetQueryServicesDescriptorResponseJvmConverter :
    ProtobufTypeMapper<GetQueryServicesDescriptorResponse, Reflection.GetQueryServicesDescriptorResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetQueryServicesDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetQueryServicesDescriptorResponse> =
      Reflection.GetQueryServicesDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetQueryServicesDescriptorResponse):
      GetQueryServicesDescriptorResponse = GetQueryServicesDescriptorResponse(
  	queries = QueryServicesDescriptorJvmConverter.convert(obj.getQueries()),
  )

  public override fun convert(obj: GetQueryServicesDescriptorResponse):
      Reflection.GetQueryServicesDescriptorResponse {
    val builder = Reflection.GetQueryServicesDescriptorResponse.newBuilder()
    builder.setQueries(QueryServicesDescriptorJvmConverter.convert(obj.queries))
    return builder.build()
  }
}

public object GetTxDescriptorRequestJvmConverter :
    ProtobufTypeMapper<GetTxDescriptorRequest, Reflection.GetTxDescriptorRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetTxDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetTxDescriptorRequest> =
      Reflection.GetTxDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetTxDescriptorRequest): GetTxDescriptorRequest =
      GetTxDescriptorRequest(
  )

  public override fun convert(obj: GetTxDescriptorRequest): Reflection.GetTxDescriptorRequest {
    val builder = Reflection.GetTxDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetTxDescriptorResponseJvmConverter :
    ProtobufTypeMapper<GetTxDescriptorResponse, Reflection.GetTxDescriptorResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetTxDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetTxDescriptorResponse> =
      Reflection.GetTxDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetTxDescriptorResponse): GetTxDescriptorResponse =
      GetTxDescriptorResponse(
  	tx = TxDescriptorJvmConverter.convert(obj.getTx()),
  )

  public override fun convert(obj: GetTxDescriptorResponse): Reflection.GetTxDescriptorResponse {
    val builder = Reflection.GetTxDescriptorResponse.newBuilder()
    builder.setTx(TxDescriptorJvmConverter.convert(obj.tx))
    return builder.build()
  }
}

public object QueryServicesDescriptorJvmConverter :
    ProtobufTypeMapper<QueryServicesDescriptor, Reflection.QueryServicesDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.QueryServicesDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.QueryServicesDescriptor> =
      Reflection.QueryServicesDescriptor.parser()

  public override fun convert(obj: Reflection.QueryServicesDescriptor): QueryServicesDescriptor =
      QueryServicesDescriptor(
  	queryServices = obj.getQueryServicesList().map { QueryServiceDescriptorJvmConverter.convert(it)
      },
  )

  public override fun convert(obj: QueryServicesDescriptor): Reflection.QueryServicesDescriptor {
    val builder = Reflection.QueryServicesDescriptor.newBuilder()
    builder.addAllQueryServices(obj.queryServices.map {
        QueryServiceDescriptorJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryServiceDescriptorJvmConverter :
    ProtobufTypeMapper<QueryServiceDescriptor, Reflection.QueryServiceDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.QueryServiceDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.QueryServiceDescriptor> =
      Reflection.QueryServiceDescriptor.parser()

  public override fun convert(obj: Reflection.QueryServiceDescriptor): QueryServiceDescriptor =
      QueryServiceDescriptor(
  	fullname = obj.getFullname(),
  	isModule = obj.getIsModule(),
  	methods = obj.getMethodsList().map { QueryMethodDescriptorJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryServiceDescriptor): Reflection.QueryServiceDescriptor {
    val builder = Reflection.QueryServiceDescriptor.newBuilder()
    builder.setFullname(obj.fullname)
    builder.setIsModule(obj.isModule)
    builder.addAllMethods(obj.methods.map { QueryMethodDescriptorJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryMethodDescriptorJvmConverter :
    ProtobufTypeMapper<QueryMethodDescriptor, Reflection.QueryMethodDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.QueryMethodDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.QueryMethodDescriptor> =
      Reflection.QueryMethodDescriptor.parser()

  public override fun convert(obj: Reflection.QueryMethodDescriptor): QueryMethodDescriptor =
      QueryMethodDescriptor(
  	name = obj.getName(),
  	fullQueryPath = obj.getFullQueryPath(),
  )

  public override fun convert(obj: QueryMethodDescriptor): Reflection.QueryMethodDescriptor {
    val builder = Reflection.QueryMethodDescriptor.newBuilder()
    builder.setName(obj.name)
    builder.setFullQueryPath(obj.fullQueryPath)
    return builder.build()
  }
}
