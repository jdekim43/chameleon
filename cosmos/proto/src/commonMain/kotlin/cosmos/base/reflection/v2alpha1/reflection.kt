// Transform from cosmos/base/reflection/v2alpha1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v2alpha1

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.type.ProtobufMessage

@Serializable(with = AppDescriptor.KotlinxSerializer::class)
@SerialName(value = AppDescriptor.TYPE_URL)
public data class AppDescriptor(
  @ProtobufIndex(index = 1)
  public val authn: AuthnDescriptor,
  @ProtobufIndex(index = 2)
  public val chain: ChainDescriptor,
  @ProtobufIndex(index = 3)
  public val codec: CodecDescriptor,
  @ProtobufIndex(index = 4)
  public val configuration: ConfigurationDescriptor,
  @ProtobufIndex(index = 5)
  public val queryServices: QueryServicesDescriptor,
  @ProtobufIndex(index = 6)
  public val tx: TxDescriptor,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.AppDescriptor"
  }

  public object KotlinxSerializer : KSerializer<AppDescriptor> {
    private val delegator: KSerializer<AppDescriptor> = AppDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AppDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AppDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AppDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return AppDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxDescriptor.KotlinxSerializer::class)
@SerialName(value = TxDescriptor.TYPE_URL)
public data class TxDescriptor(
  @ProtobufIndex(index = 1)
  public val fullname: String,
  @ProtobufIndex(index = 2)
  public val msgs: List<MsgDescriptor>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.TxDescriptor"
  }

  public object KotlinxSerializer : KSerializer<TxDescriptor> {
    private val delegator: KSerializer<TxDescriptor> = TxDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return TxDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AuthnDescriptor.KotlinxSerializer::class)
@SerialName(value = AuthnDescriptor.TYPE_URL)
public data class AuthnDescriptor(
  @ProtobufIndex(index = 1)
  public val signModes: List<SigningModeDescriptor>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.AuthnDescriptor"
  }

  public object KotlinxSerializer : KSerializer<AuthnDescriptor> {
    private val delegator: KSerializer<AuthnDescriptor> = AuthnDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AuthnDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AuthnDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AuthnDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return AuthnDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SigningModeDescriptor.KotlinxSerializer::class)
@SerialName(value = SigningModeDescriptor.TYPE_URL)
public data class SigningModeDescriptor(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val number: Int,
  @ProtobufIndex(index = 3)
  public val authnInfoProviderMethodFullname: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.SigningModeDescriptor"
  }

  public object KotlinxSerializer : KSerializer<SigningModeDescriptor> {
    private val delegator: KSerializer<SigningModeDescriptor> = SigningModeDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SigningModeDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SigningModeDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SigningModeDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return SigningModeDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ChainDescriptor.KotlinxSerializer::class)
@SerialName(value = ChainDescriptor.TYPE_URL)
public data class ChainDescriptor(
  @ProtobufIndex(index = 1)
  public val id: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.ChainDescriptor"
  }

  public object KotlinxSerializer : KSerializer<ChainDescriptor> {
    private val delegator: KSerializer<ChainDescriptor> = ChainDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ChainDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ChainDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ChainDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return ChainDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CodecDescriptor.KotlinxSerializer::class)
@SerialName(value = CodecDescriptor.TYPE_URL)
public data class CodecDescriptor(
  @ProtobufIndex(index = 1)
  public val interfaces: List<InterfaceDescriptor>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.CodecDescriptor"
  }

  public object KotlinxSerializer : KSerializer<CodecDescriptor> {
    private val delegator: KSerializer<CodecDescriptor> = CodecDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CodecDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CodecDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CodecDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return CodecDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = InterfaceDescriptor.KotlinxSerializer::class)
@SerialName(value = InterfaceDescriptor.TYPE_URL)
public data class InterfaceDescriptor(
  @ProtobufIndex(index = 1)
  public val fullname: String,
  @ProtobufIndex(index = 2)
  public val interfaceAcceptingMessages: List<InterfaceAcceptingMessageDescriptor>,
  @ProtobufIndex(index = 3)
  public val interfaceImplementers: List<InterfaceImplementerDescriptor>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.InterfaceDescriptor"
  }

  public object KotlinxSerializer : KSerializer<InterfaceDescriptor> {
    private val delegator: KSerializer<InterfaceDescriptor> = InterfaceDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: InterfaceDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(InterfaceDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): InterfaceDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return InterfaceDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = InterfaceImplementerDescriptor.KotlinxSerializer::class)
@SerialName(value = InterfaceImplementerDescriptor.TYPE_URL)
public data class InterfaceImplementerDescriptor(
  @ProtobufIndex(index = 1)
  public val fullname: String,
  @ProtobufIndex(index = 2)
  public val typeUrl: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptor"
  }

  public object KotlinxSerializer : KSerializer<InterfaceImplementerDescriptor> {
    private val delegator: KSerializer<InterfaceImplementerDescriptor> =
        InterfaceImplementerDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: InterfaceImplementerDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(InterfaceImplementerDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): InterfaceImplementerDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return InterfaceImplementerDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = InterfaceAcceptingMessageDescriptor.KotlinxSerializer::class)
@SerialName(value = InterfaceAcceptingMessageDescriptor.TYPE_URL)
public data class InterfaceAcceptingMessageDescriptor(
  @ProtobufIndex(index = 1)
  public val fullname: String,
  @ProtobufIndex(index = 2)
  public val fieldDescriptorNames: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.reflection.v2alpha1.InterfaceAcceptingMessageDescriptor"
  }

  public object KotlinxSerializer : KSerializer<InterfaceAcceptingMessageDescriptor> {
    private val delegator: KSerializer<InterfaceAcceptingMessageDescriptor> =
        InterfaceAcceptingMessageDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: InterfaceAcceptingMessageDescriptor):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(InterfaceAcceptingMessageDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): InterfaceAcceptingMessageDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return InterfaceAcceptingMessageDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ConfigurationDescriptor.KotlinxSerializer::class)
@SerialName(value = ConfigurationDescriptor.TYPE_URL)
public data class ConfigurationDescriptor(
  @ProtobufIndex(index = 1)
  public val bech32AccountAddressPrefix: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.ConfigurationDescriptor"
  }

  public object KotlinxSerializer : KSerializer<ConfigurationDescriptor> {
    private val delegator: KSerializer<ConfigurationDescriptor> =
        ConfigurationDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ConfigurationDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ConfigurationDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ConfigurationDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return ConfigurationDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDescriptor.KotlinxSerializer::class)
@SerialName(value = MsgDescriptor.TYPE_URL)
public data class MsgDescriptor(
  @ProtobufIndex(index = 1)
  public val msgTypeUrl: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.MsgDescriptor"
  }

  public object KotlinxSerializer : KSerializer<MsgDescriptor> {
    private val delegator: KSerializer<MsgDescriptor> = MsgDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetAuthnDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = GetAuthnDescriptorRequest.TYPE_URL)
public class GetAuthnDescriptorRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.GetAuthnDescriptorRequest"
  }

  public object KotlinxSerializer : KSerializer<GetAuthnDescriptorRequest> {
    private val delegator: KSerializer<GetAuthnDescriptorRequest> =
        GetAuthnDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetAuthnDescriptorRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetAuthnDescriptorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetAuthnDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetAuthnDescriptorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetAuthnDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = GetAuthnDescriptorResponse.TYPE_URL)
public data class GetAuthnDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val authn: AuthnDescriptor,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.reflection.v2alpha1.GetAuthnDescriptorResponse"
  }

  public object KotlinxSerializer : KSerializer<GetAuthnDescriptorResponse> {
    private val delegator: KSerializer<GetAuthnDescriptorResponse> =
        GetAuthnDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetAuthnDescriptorResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetAuthnDescriptorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetAuthnDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetAuthnDescriptorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetChainDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = GetChainDescriptorRequest.TYPE_URL)
public class GetChainDescriptorRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.GetChainDescriptorRequest"
  }

  public object KotlinxSerializer : KSerializer<GetChainDescriptorRequest> {
    private val delegator: KSerializer<GetChainDescriptorRequest> =
        GetChainDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetChainDescriptorRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetChainDescriptorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetChainDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetChainDescriptorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetChainDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = GetChainDescriptorResponse.TYPE_URL)
public data class GetChainDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val chain: ChainDescriptor,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse"
  }

  public object KotlinxSerializer : KSerializer<GetChainDescriptorResponse> {
    private val delegator: KSerializer<GetChainDescriptorResponse> =
        GetChainDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetChainDescriptorResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetChainDescriptorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetChainDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetChainDescriptorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetCodecDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = GetCodecDescriptorRequest.TYPE_URL)
public class GetCodecDescriptorRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.GetCodecDescriptorRequest"
  }

  public object KotlinxSerializer : KSerializer<GetCodecDescriptorRequest> {
    private val delegator: KSerializer<GetCodecDescriptorRequest> =
        GetCodecDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetCodecDescriptorRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetCodecDescriptorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetCodecDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetCodecDescriptorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetCodecDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = GetCodecDescriptorResponse.TYPE_URL)
public data class GetCodecDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val codec: CodecDescriptor,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.reflection.v2alpha1.GetCodecDescriptorResponse"
  }

  public object KotlinxSerializer : KSerializer<GetCodecDescriptorResponse> {
    private val delegator: KSerializer<GetCodecDescriptorResponse> =
        GetCodecDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetCodecDescriptorResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetCodecDescriptorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetCodecDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetCodecDescriptorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetConfigurationDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = GetConfigurationDescriptorRequest.TYPE_URL)
public class GetConfigurationDescriptorRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.reflection.v2alpha1.GetConfigurationDescriptorRequest"
  }

  public object KotlinxSerializer : KSerializer<GetConfigurationDescriptorRequest> {
    private val delegator: KSerializer<GetConfigurationDescriptorRequest> =
        GetConfigurationDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetConfigurationDescriptorRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetConfigurationDescriptorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetConfigurationDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetConfigurationDescriptorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetConfigurationDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = GetConfigurationDescriptorResponse.TYPE_URL)
public data class GetConfigurationDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val config: ConfigurationDescriptor,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.reflection.v2alpha1.GetConfigurationDescriptorResponse"
  }

  public object KotlinxSerializer : KSerializer<GetConfigurationDescriptorResponse> {
    private val delegator: KSerializer<GetConfigurationDescriptorResponse> =
        GetConfigurationDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetConfigurationDescriptorResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetConfigurationDescriptorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetConfigurationDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetConfigurationDescriptorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetQueryServicesDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = GetQueryServicesDescriptorRequest.TYPE_URL)
public class GetQueryServicesDescriptorRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorRequest"
  }

  public object KotlinxSerializer : KSerializer<GetQueryServicesDescriptorRequest> {
    private val delegator: KSerializer<GetQueryServicesDescriptorRequest> =
        GetQueryServicesDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetQueryServicesDescriptorRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetQueryServicesDescriptorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetQueryServicesDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetQueryServicesDescriptorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetQueryServicesDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = GetQueryServicesDescriptorResponse.TYPE_URL)
public data class GetQueryServicesDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val queries: QueryServicesDescriptor,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorResponse"
  }

  public object KotlinxSerializer : KSerializer<GetQueryServicesDescriptorResponse> {
    private val delegator: KSerializer<GetQueryServicesDescriptorResponse> =
        GetQueryServicesDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetQueryServicesDescriptorResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetQueryServicesDescriptorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetQueryServicesDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetQueryServicesDescriptorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetTxDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = GetTxDescriptorRequest.TYPE_URL)
public class GetTxDescriptorRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.GetTxDescriptorRequest"
  }

  public object KotlinxSerializer : KSerializer<GetTxDescriptorRequest> {
    private val delegator: KSerializer<GetTxDescriptorRequest> = GetTxDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetTxDescriptorRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetTxDescriptorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetTxDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetTxDescriptorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetTxDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = GetTxDescriptorResponse.TYPE_URL)
public data class GetTxDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val tx: TxDescriptor,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.GetTxDescriptorResponse"
  }

  public object KotlinxSerializer : KSerializer<GetTxDescriptorResponse> {
    private val delegator: KSerializer<GetTxDescriptorResponse> =
        GetTxDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetTxDescriptorResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetTxDescriptorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetTxDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetTxDescriptorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryServicesDescriptor.KotlinxSerializer::class)
@SerialName(value = QueryServicesDescriptor.TYPE_URL)
public data class QueryServicesDescriptor(
  @ProtobufIndex(index = 1)
  public val queryServices: List<QueryServiceDescriptor>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.QueryServicesDescriptor"
  }

  public object KotlinxSerializer : KSerializer<QueryServicesDescriptor> {
    private val delegator: KSerializer<QueryServicesDescriptor> =
        QueryServicesDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryServicesDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryServicesDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryServicesDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return QueryServicesDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryServiceDescriptor.KotlinxSerializer::class)
@SerialName(value = QueryServiceDescriptor.TYPE_URL)
public data class QueryServiceDescriptor(
  @ProtobufIndex(index = 1)
  public val fullname: String,
  @ProtobufIndex(index = 2)
  public val isModule: Boolean,
  @ProtobufIndex(index = 3)
  public val methods: List<QueryMethodDescriptor>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.QueryServiceDescriptor"
  }

  public object KotlinxSerializer : KSerializer<QueryServiceDescriptor> {
    private val delegator: KSerializer<QueryServiceDescriptor> = QueryServiceDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryServiceDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryServiceDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryServiceDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return QueryServiceDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryMethodDescriptor.KotlinxSerializer::class)
@SerialName(value = QueryMethodDescriptor.TYPE_URL)
public data class QueryMethodDescriptor(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val fullQueryPath: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v2alpha1.QueryMethodDescriptor"
  }

  public object KotlinxSerializer : KSerializer<QueryMethodDescriptor> {
    private val delegator: KSerializer<QueryMethodDescriptor> = QueryMethodDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryMethodDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryMethodDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryMethodDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMethodDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
