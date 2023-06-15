// Transform from cosmos/auth/module/v1/module.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.module.v1

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

@Serializable(with = Module.KotlinxSerializer::class)
@SerialName(value = Module.TYPE_URL)
public data class Module(
  @ProtobufIndex(index = 1)
  public val bech32Prefix: String,
  @ProtobufIndex(index = 2)
  public val moduleAccountPermissions: List<ModuleAccountPermission>,
  @ProtobufIndex(index = 3)
  public val authority: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.module.v1.Module"
  }

  public object KotlinxSerializer : KSerializer<Module> {
    private val delegator: KSerializer<Module> = Module.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Module): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModuleConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Module {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ModuleAccountPermission.KotlinxSerializer::class)
@SerialName(value = ModuleAccountPermission.TYPE_URL)
public data class ModuleAccountPermission(
  @ProtobufIndex(index = 1)
  public val account: String,
  @ProtobufIndex(index = 2)
  public val permissions: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.module.v1.ModuleAccountPermission"
  }

  public object KotlinxSerializer : KSerializer<ModuleAccountPermission> {
    private val delegator: KSerializer<ModuleAccountPermission> =
        ModuleAccountPermission.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModuleAccountPermission): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModuleAccountPermissionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModuleAccountPermission {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleAccountPermissionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
