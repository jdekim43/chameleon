// Transform from cosmos/app/v1alpha1/module.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.v1alpha1

import kotlin.String
import kotlin.UInt
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

@Serializable(with = ModuleDescriptor.KotlinxSerializer::class)
@SerialName(value = ModuleDescriptor.TYPE_URL)
public data class ModuleDescriptor(
  @ProtobufIndex(index = 1)
  public val goImport: String,
  @ProtobufIndex(index = 2)
  public val usePackage: List<PackageReference>,
  @ProtobufIndex(index = 3)
  public val canMigrateFrom: List<MigrateFromInfo>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.app.v1alpha1.ModuleDescriptor"
  }

  public object KotlinxSerializer : KSerializer<ModuleDescriptor> {
    private val delegator: KSerializer<ModuleDescriptor> = ModuleDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModuleDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModuleDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModuleDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PackageReference.KotlinxSerializer::class)
@SerialName(value = PackageReference.TYPE_URL)
public data class PackageReference(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val revision: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.app.v1alpha1.PackageReference"
  }

  public object KotlinxSerializer : KSerializer<PackageReference> {
    private val delegator: KSerializer<PackageReference> = PackageReference.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PackageReference): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PackageReferenceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PackageReference {
      if (decoder is ProtobufMapperDecoder) {
        return PackageReferenceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MigrateFromInfo.KotlinxSerializer::class)
@SerialName(value = MigrateFromInfo.TYPE_URL)
public data class MigrateFromInfo(
  @ProtobufIndex(index = 1)
  public val module: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.app.v1alpha1.MigrateFromInfo"
  }

  public object KotlinxSerializer : KSerializer<MigrateFromInfo> {
    private val delegator: KSerializer<MigrateFromInfo> = MigrateFromInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MigrateFromInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MigrateFromInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MigrateFromInfo {
      if (decoder is ProtobufMapperDecoder) {
        return MigrateFromInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
