// Transform from cosmos/autocli/v1/options.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.autocli.v1

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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

@Serializable(with = ModuleOptions.KotlinxSerializer::class)
@SerialName(value = ModuleOptions.TYPE_URL)
public data class ModuleOptions(
  @ProtobufIndex(index = 1)
  public val tx: ServiceCommandDescriptor,
  @ProtobufIndex(index = 2)
  public val query: ServiceCommandDescriptor,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.autocli.v1.ModuleOptions"
  }

  public object KotlinxSerializer : KSerializer<ModuleOptions> {
    private val delegator: KSerializer<ModuleOptions> = ModuleOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModuleOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModuleOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModuleOptions {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ServiceCommandDescriptor.KotlinxSerializer::class)
@SerialName(value = ServiceCommandDescriptor.TYPE_URL)
public data class ServiceCommandDescriptor(
  @ProtobufIndex(index = 1)
  public val service: String,
  @ProtobufIndex(index = 2)
  public val rpcCommandOptions: List<RpcCommandOptions>,
  @ProtobufIndex(index = 3)
  public val subCommands: Map<String, ServiceCommandDescriptor>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.autocli.v1.ServiceCommandDescriptor"
  }

  public object KotlinxSerializer : KSerializer<ServiceCommandDescriptor> {
    private val delegator: KSerializer<ServiceCommandDescriptor> =
        ServiceCommandDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ServiceCommandDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ServiceCommandDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ServiceCommandDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return ServiceCommandDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RpcCommandOptions.KotlinxSerializer::class)
@SerialName(value = RpcCommandOptions.TYPE_URL)
public data class RpcCommandOptions(
  @ProtobufIndex(index = 1)
  public val rpcMethod: String,
  @ProtobufIndex(index = 2)
  public val use: String,
  @ProtobufIndex(index = 3)
  public val long: String,
  @ProtobufIndex(index = 4)
  public val short: String,
  @ProtobufIndex(index = 5)
  public val example: String,
  @ProtobufIndex(index = 6)
  public val alias: List<String>,
  @ProtobufIndex(index = 7)
  public val suggestFor: List<String>,
  @ProtobufIndex(index = 8)
  public val deprecated: String,
  @ProtobufIndex(index = 9)
  public val version: String,
  @ProtobufIndex(index = 10)
  public val flagOptions: Map<String, FlagOptions>,
  @ProtobufIndex(index = 11)
  public val positionalArgs: List<PositionalArgDescriptor>,
  @ProtobufIndex(index = 12)
  public val skip: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.autocli.v1.RpcCommandOptions"
  }

  public object KotlinxSerializer : KSerializer<RpcCommandOptions> {
    private val delegator: KSerializer<RpcCommandOptions> = RpcCommandOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RpcCommandOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RpcCommandOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RpcCommandOptions {
      if (decoder is ProtobufMapperDecoder) {
        return RpcCommandOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FlagOptions.KotlinxSerializer::class)
@SerialName(value = FlagOptions.TYPE_URL)
public data class FlagOptions(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val shorthand: String,
  @ProtobufIndex(index = 3)
  public val usage: String,
  @ProtobufIndex(index = 4)
  public val defaultValue: String,
  @ProtobufIndex(index = 5)
  public val noOptDefaultValue: String,
  @ProtobufIndex(index = 6)
  public val deprecated: String,
  @ProtobufIndex(index = 7)
  public val shorthandDeprecated: String,
  @ProtobufIndex(index = 8)
  public val hidden: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.autocli.v1.FlagOptions"
  }

  public object KotlinxSerializer : KSerializer<FlagOptions> {
    private val delegator: KSerializer<FlagOptions> = FlagOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FlagOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FlagOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FlagOptions {
      if (decoder is ProtobufMapperDecoder) {
        return FlagOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PositionalArgDescriptor.KotlinxSerializer::class)
@SerialName(value = PositionalArgDescriptor.TYPE_URL)
public data class PositionalArgDescriptor(
  @ProtobufIndex(index = 1)
  public val protoField: String,
  @ProtobufIndex(index = 2)
  public val varargs: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.autocli.v1.PositionalArgDescriptor"
  }

  public object KotlinxSerializer : KSerializer<PositionalArgDescriptor> {
    private val delegator: KSerializer<PositionalArgDescriptor> =
        PositionalArgDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PositionalArgDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PositionalArgDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PositionalArgDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return PositionalArgDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
