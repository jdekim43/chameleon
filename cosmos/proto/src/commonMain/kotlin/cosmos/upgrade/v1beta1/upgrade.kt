// Transform from cosmos/upgrade/v1beta1/upgrade.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import google.protobuf.Any
import google.protobuf.Timestamp
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Long
import kotlin.ReplaceWith
import kotlin.String
import kotlin.ULong
import kotlin.Unit
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

@Serializable(with = Plan.KotlinxSerializer::class)
@SerialName(value = Plan.TYPE_URL)
public data class Plan(
  @ProtobufIndex(index = 1)
  public val name: String,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 2)
  public val time: Timestamp,
  @ProtobufIndex(index = 3)
  public val height: Long,
  @ProtobufIndex(index = 4)
  public val info: String,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 5)
  public val upgradedClientState: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.Plan"
  }

  public object KotlinxSerializer : KSerializer<Plan> {
    private val delegator: KSerializer<Plan> = Plan.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Plan): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PlanConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Plan {
      if (decoder is ProtobufMapperDecoder) {
        return PlanConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SoftwareUpgradeProposal.KotlinxSerializer::class)
@SerialName(value = SoftwareUpgradeProposal.TYPE_URL)
public data class SoftwareUpgradeProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val plan: Plan,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.SoftwareUpgradeProposal"
  }

  public object KotlinxSerializer : KSerializer<SoftwareUpgradeProposal> {
    private val delegator: KSerializer<SoftwareUpgradeProposal> =
        SoftwareUpgradeProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SoftwareUpgradeProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SoftwareUpgradeProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SoftwareUpgradeProposal {
      if (decoder is ProtobufMapperDecoder) {
        return SoftwareUpgradeProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CancelSoftwareUpgradeProposal.KotlinxSerializer::class)
@SerialName(value = CancelSoftwareUpgradeProposal.TYPE_URL)
public data class CancelSoftwareUpgradeProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.CancelSoftwareUpgradeProposal"
  }

  public object KotlinxSerializer : KSerializer<CancelSoftwareUpgradeProposal> {
    private val delegator: KSerializer<CancelSoftwareUpgradeProposal> =
        CancelSoftwareUpgradeProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CancelSoftwareUpgradeProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CancelSoftwareUpgradeProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CancelSoftwareUpgradeProposal {
      if (decoder is ProtobufMapperDecoder) {
        return CancelSoftwareUpgradeProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ModuleVersion.KotlinxSerializer::class)
@SerialName(value = ModuleVersion.TYPE_URL)
public data class ModuleVersion(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val version: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.upgrade.v1beta1.ModuleVersion"
  }

  public object KotlinxSerializer : KSerializer<ModuleVersion> {
    private val delegator: KSerializer<ModuleVersion> = ModuleVersion.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModuleVersion): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModuleVersionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModuleVersion {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleVersionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
