// Transform from cosmos/auth/v1beta1/auth.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.v1beta1

import google.protobuf.Any
import kotlin.ByteArray
import kotlin.String
import kotlin.ULong
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

@Serializable(with = BaseAccount.KotlinxSerializer::class)
@SerialName(value = BaseAccount.TYPE_URL)
public data class BaseAccount(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pubKey: Any,
  @ProtobufIndex(index = 3)
  public val accountNumber: ULong,
  @ProtobufIndex(index = 4)
  public val sequence: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.BaseAccount"
  }

  public object KotlinxSerializer : KSerializer<BaseAccount> {
    private val delegator: KSerializer<BaseAccount> = BaseAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BaseAccount): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BaseAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BaseAccount {
      if (decoder is ProtobufMapperDecoder) {
        return BaseAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ModuleAccount.KotlinxSerializer::class)
@SerialName(value = ModuleAccount.TYPE_URL)
public data class ModuleAccount(
  @ProtobufIndex(index = 1)
  public val baseAccount: BaseAccount,
  @ProtobufIndex(index = 2)
  public val name: String,
  @ProtobufIndex(index = 3)
  public val permissions: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.ModuleAccount"
  }

  public object KotlinxSerializer : KSerializer<ModuleAccount> {
    private val delegator: KSerializer<ModuleAccount> = ModuleAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModuleAccount): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModuleAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModuleAccount {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ModuleCredential.KotlinxSerializer::class)
@SerialName(value = ModuleCredential.TYPE_URL)
public data class ModuleCredential(
  @ProtobufIndex(index = 1)
  public val moduleName: String,
  @ProtobufIndex(index = 2)
  public val derivationKeys: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.ModuleCredential"
  }

  public object KotlinxSerializer : KSerializer<ModuleCredential> {
    private val delegator: KSerializer<ModuleCredential> = ModuleCredential.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModuleCredential): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModuleCredentialConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModuleCredential {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleCredentialConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val maxMemoCharacters: ULong,
  @ProtobufIndex(index = 2)
  public val txSigLimit: ULong,
  @ProtobufIndex(index = 3)
  public val txSizeCostPerByte: ULong,
  @ProtobufIndex(index = 4)
  public val sigVerifyCostEd25519: ULong,
  @ProtobufIndex(index = 5)
  public val sigVerifyCostSecp256K1: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.Params"
  }

  public object KotlinxSerializer : KSerializer<Params> {
    private val delegator: KSerializer<Params> = Params.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Params): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Params {
      if (decoder is ProtobufMapperDecoder) {
        return ParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
