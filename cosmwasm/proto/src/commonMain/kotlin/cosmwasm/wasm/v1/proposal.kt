// Transform from cosmwasm/wasm/v1/proposal.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import cosmos.base.v1beta1.Coin
import kotlin.Boolean
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

@Serializable(with = StoreCodeProposal.KotlinxSerializer::class)
@SerialName(value = StoreCodeProposal.TYPE_URL)
public data class StoreCodeProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val runAs: String,
  @ProtobufIndex(index = 4)
  public val wasmByteCode: ByteArray,
  @ProtobufIndex(index = 7)
  public val instantiatePermission: AccessConfig,
  @ProtobufIndex(index = 8)
  public val unpinCode: Boolean,
  @ProtobufIndex(index = 9)
  public val source: String,
  @ProtobufIndex(index = 10)
  public val builder: String,
  @ProtobufIndex(index = 11)
  public val codeHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.StoreCodeProposal"
  }

  public object KotlinxSerializer : KSerializer<StoreCodeProposal> {
    private val delegator: KSerializer<StoreCodeProposal> = StoreCodeProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StoreCodeProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(StoreCodeProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StoreCodeProposal {
      if (decoder is ProtobufMapperDecoder) {
        return StoreCodeProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = InstantiateContractProposal.KotlinxSerializer::class)
@SerialName(value = InstantiateContractProposal.TYPE_URL)
public data class InstantiateContractProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val runAs: String,
  @ProtobufIndex(index = 4)
  public val admin: String,
  @ProtobufIndex(index = 5)
  public val codeId: ULong,
  @ProtobufIndex(index = 6)
  public val label: String,
  @ProtobufIndex(index = 7)
  public val msg: ByteArray,
  @ProtobufIndex(index = 8)
  public val funds: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.InstantiateContractProposal"
  }

  public object KotlinxSerializer : KSerializer<InstantiateContractProposal> {
    private val delegator: KSerializer<InstantiateContractProposal> =
        InstantiateContractProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: InstantiateContractProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(InstantiateContractProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): InstantiateContractProposal {
      if (decoder is ProtobufMapperDecoder) {
        return InstantiateContractProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = InstantiateContract2Proposal.KotlinxSerializer::class)
@SerialName(value = InstantiateContract2Proposal.TYPE_URL)
public data class InstantiateContract2Proposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val runAs: String,
  @ProtobufIndex(index = 4)
  public val admin: String,
  @ProtobufIndex(index = 5)
  public val codeId: ULong,
  @ProtobufIndex(index = 6)
  public val label: String,
  @ProtobufIndex(index = 7)
  public val msg: ByteArray,
  @ProtobufIndex(index = 8)
  public val funds: List<Coin>,
  @ProtobufIndex(index = 9)
  public val salt: ByteArray,
  @ProtobufIndex(index = 10)
  public val fixMsg: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.InstantiateContract2Proposal"
  }

  public object KotlinxSerializer : KSerializer<InstantiateContract2Proposal> {
    private val delegator: KSerializer<InstantiateContract2Proposal> =
        InstantiateContract2Proposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: InstantiateContract2Proposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(InstantiateContract2ProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): InstantiateContract2Proposal {
      if (decoder is ProtobufMapperDecoder) {
        return InstantiateContract2ProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MigrateContractProposal.KotlinxSerializer::class)
@SerialName(value = MigrateContractProposal.TYPE_URL)
public data class MigrateContractProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 4)
  public val contract: String,
  @ProtobufIndex(index = 5)
  public val codeId: ULong,
  @ProtobufIndex(index = 6)
  public val msg: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MigrateContractProposal"
  }

  public object KotlinxSerializer : KSerializer<MigrateContractProposal> {
    private val delegator: KSerializer<MigrateContractProposal> =
        MigrateContractProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MigrateContractProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MigrateContractProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MigrateContractProposal {
      if (decoder is ProtobufMapperDecoder) {
        return MigrateContractProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SudoContractProposal.KotlinxSerializer::class)
@SerialName(value = SudoContractProposal.TYPE_URL)
public data class SudoContractProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val contract: String,
  @ProtobufIndex(index = 4)
  public val msg: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.SudoContractProposal"
  }

  public object KotlinxSerializer : KSerializer<SudoContractProposal> {
    private val delegator: KSerializer<SudoContractProposal> = SudoContractProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SudoContractProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SudoContractProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SudoContractProposal {
      if (decoder is ProtobufMapperDecoder) {
        return SudoContractProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ExecuteContractProposal.KotlinxSerializer::class)
@SerialName(value = ExecuteContractProposal.TYPE_URL)
public data class ExecuteContractProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val runAs: String,
  @ProtobufIndex(index = 4)
  public val contract: String,
  @ProtobufIndex(index = 5)
  public val msg: ByteArray,
  @ProtobufIndex(index = 6)
  public val funds: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.ExecuteContractProposal"
  }

  public object KotlinxSerializer : KSerializer<ExecuteContractProposal> {
    private val delegator: KSerializer<ExecuteContractProposal> =
        ExecuteContractProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ExecuteContractProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ExecuteContractProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ExecuteContractProposal {
      if (decoder is ProtobufMapperDecoder) {
        return ExecuteContractProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UpdateAdminProposal.KotlinxSerializer::class)
@SerialName(value = UpdateAdminProposal.TYPE_URL)
public data class UpdateAdminProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val newAdmin: String,
  @ProtobufIndex(index = 4)
  public val contract: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.UpdateAdminProposal"
  }

  public object KotlinxSerializer : KSerializer<UpdateAdminProposal> {
    private val delegator: KSerializer<UpdateAdminProposal> = UpdateAdminProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UpdateAdminProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UpdateAdminProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UpdateAdminProposal {
      if (decoder is ProtobufMapperDecoder) {
        return UpdateAdminProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ClearAdminProposal.KotlinxSerializer::class)
@SerialName(value = ClearAdminProposal.TYPE_URL)
public data class ClearAdminProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val contract: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.ClearAdminProposal"
  }

  public object KotlinxSerializer : KSerializer<ClearAdminProposal> {
    private val delegator: KSerializer<ClearAdminProposal> = ClearAdminProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ClearAdminProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ClearAdminProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ClearAdminProposal {
      if (decoder is ProtobufMapperDecoder) {
        return ClearAdminProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PinCodesProposal.KotlinxSerializer::class)
@SerialName(value = PinCodesProposal.TYPE_URL)
public data class PinCodesProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val codeIds: List<ULong>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.PinCodesProposal"
  }

  public object KotlinxSerializer : KSerializer<PinCodesProposal> {
    private val delegator: KSerializer<PinCodesProposal> = PinCodesProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PinCodesProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PinCodesProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PinCodesProposal {
      if (decoder is ProtobufMapperDecoder) {
        return PinCodesProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UnpinCodesProposal.KotlinxSerializer::class)
@SerialName(value = UnpinCodesProposal.TYPE_URL)
public data class UnpinCodesProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val codeIds: List<ULong>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.UnpinCodesProposal"
  }

  public object KotlinxSerializer : KSerializer<UnpinCodesProposal> {
    private val delegator: KSerializer<UnpinCodesProposal> = UnpinCodesProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UnpinCodesProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UnpinCodesProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UnpinCodesProposal {
      if (decoder is ProtobufMapperDecoder) {
        return UnpinCodesProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AccessConfigUpdate.KotlinxSerializer::class)
@SerialName(value = AccessConfigUpdate.TYPE_URL)
public data class AccessConfigUpdate(
  @ProtobufIndex(index = 1)
  public val codeId: ULong,
  @ProtobufIndex(index = 2)
  public val instantiatePermission: AccessConfig,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.AccessConfigUpdate"
  }

  public object KotlinxSerializer : KSerializer<AccessConfigUpdate> {
    private val delegator: KSerializer<AccessConfigUpdate> = AccessConfigUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AccessConfigUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AccessConfigUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AccessConfigUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return AccessConfigUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UpdateInstantiateConfigProposal.KotlinxSerializer::class)
@SerialName(value = UpdateInstantiateConfigProposal.TYPE_URL)
public data class UpdateInstantiateConfigProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val accessConfigUpdates: List<AccessConfigUpdate>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.UpdateInstantiateConfigProposal"
  }

  public object KotlinxSerializer : KSerializer<UpdateInstantiateConfigProposal> {
    private val delegator: KSerializer<UpdateInstantiateConfigProposal> =
        UpdateInstantiateConfigProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UpdateInstantiateConfigProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UpdateInstantiateConfigProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UpdateInstantiateConfigProposal {
      if (decoder is ProtobufMapperDecoder) {
        return UpdateInstantiateConfigProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = StoreAndInstantiateContractProposal.KotlinxSerializer::class)
@SerialName(value = StoreAndInstantiateContractProposal.TYPE_URL)
public data class StoreAndInstantiateContractProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val runAs: String,
  @ProtobufIndex(index = 4)
  public val wasmByteCode: ByteArray,
  @ProtobufIndex(index = 5)
  public val instantiatePermission: AccessConfig,
  @ProtobufIndex(index = 6)
  public val unpinCode: Boolean,
  @ProtobufIndex(index = 7)
  public val admin: String,
  @ProtobufIndex(index = 8)
  public val label: String,
  @ProtobufIndex(index = 9)
  public val msg: ByteArray,
  @ProtobufIndex(index = 10)
  public val funds: List<Coin>,
  @ProtobufIndex(index = 11)
  public val source: String,
  @ProtobufIndex(index = 12)
  public val builder: String,
  @ProtobufIndex(index = 13)
  public val codeHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.StoreAndInstantiateContractProposal"
  }

  public object KotlinxSerializer : KSerializer<StoreAndInstantiateContractProposal> {
    private val delegator: KSerializer<StoreAndInstantiateContractProposal> =
        StoreAndInstantiateContractProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StoreAndInstantiateContractProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(StoreAndInstantiateContractProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StoreAndInstantiateContractProposal {
      if (decoder is ProtobufMapperDecoder) {
        return StoreAndInstantiateContractProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
