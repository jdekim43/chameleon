// Transform from cosmwasm/wasm/v1/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import google.protobuf.Any
import kotlin.ByteArray
import kotlin.Int
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

@Serializable
@SerialName(value = "/cosmwasm.wasm.v1.AccessType")
public enum class AccessType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  ACCESS_TYPE_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  ACCESS_TYPE_NOBODY(1),
  @ProtobufIndex(index = 2)
  ACCESS_TYPE_ONLY_ADDRESS(2),
  @ProtobufIndex(index = 3)
  ACCESS_TYPE_EVERYBODY(3),
  @ProtobufIndex(index = 4)
  ACCESS_TYPE_ANY_OF_ADDRESSES(4),
  ;

  public companion object {
    public fun forNumber(number: Int): AccessType = AccessType.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/cosmwasm.wasm.v1.ContractCodeHistoryOperationType")
public enum class ContractCodeHistoryOperationType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  CONTRACT_CODE_HISTORY_OPERATION_TYPE_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  CONTRACT_CODE_HISTORY_OPERATION_TYPE_INIT(1),
  @ProtobufIndex(index = 2)
  CONTRACT_CODE_HISTORY_OPERATION_TYPE_MIGRATE(2),
  @ProtobufIndex(index = 3)
  CONTRACT_CODE_HISTORY_OPERATION_TYPE_GENESIS(3),
  ;

  public companion object {
    public fun forNumber(number: Int): ContractCodeHistoryOperationType =
        ContractCodeHistoryOperationType.values()
    	.first { it.number == number }
  }
}

@Serializable(with = AccessTypeParam.KotlinxSerializer::class)
@SerialName(value = AccessTypeParam.TYPE_URL)
public data class AccessTypeParam(
  @ProtobufIndex(index = 1)
  public val `value`: AccessType,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.AccessTypeParam"
  }

  public object KotlinxSerializer : KSerializer<AccessTypeParam> {
    private val delegator: KSerializer<AccessTypeParam> = AccessTypeParam.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AccessTypeParam): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AccessTypeParamConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AccessTypeParam {
      if (decoder is ProtobufMapperDecoder) {
        return AccessTypeParamConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AccessConfig.KotlinxSerializer::class)
@SerialName(value = AccessConfig.TYPE_URL)
public data class AccessConfig(
  @ProtobufIndex(index = 1)
  public val permission: AccessType,
  @ProtobufIndex(index = 2)
  public val address: String,
  @ProtobufIndex(index = 3)
  public val addresses: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.AccessConfig"
  }

  public object KotlinxSerializer : KSerializer<AccessConfig> {
    private val delegator: KSerializer<AccessConfig> = AccessConfig.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AccessConfig): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AccessConfigConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AccessConfig {
      if (decoder is ProtobufMapperDecoder) {
        return AccessConfigConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val codeUploadAccess: AccessConfig,
  @ProtobufIndex(index = 2)
  public val instantiateDefaultPermission: AccessType,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.Params"
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

@Serializable(with = CodeInfo.KotlinxSerializer::class)
@SerialName(value = CodeInfo.TYPE_URL)
public data class CodeInfo(
  @ProtobufIndex(index = 1)
  public val codeHash: ByteArray,
  @ProtobufIndex(index = 2)
  public val creator: String,
  @ProtobufIndex(index = 5)
  public val instantiateConfig: AccessConfig,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.CodeInfo"
  }

  public object KotlinxSerializer : KSerializer<CodeInfo> {
    private val delegator: KSerializer<CodeInfo> = CodeInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CodeInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CodeInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CodeInfo {
      if (decoder is ProtobufMapperDecoder) {
        return CodeInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ContractInfo.KotlinxSerializer::class)
@SerialName(value = ContractInfo.TYPE_URL)
public data class ContractInfo(
  @ProtobufIndex(index = 1)
  public val codeId: ULong,
  @ProtobufIndex(index = 2)
  public val creator: String,
  @ProtobufIndex(index = 3)
  public val admin: String,
  @ProtobufIndex(index = 4)
  public val label: String,
  @ProtobufIndex(index = 5)
  public val created: AbsoluteTxPosition,
  @ProtobufIndex(index = 6)
  public val ibcPortId: String,
  @ProtobufIndex(index = 7)
  public val extension: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.ContractInfo"
  }

  public object KotlinxSerializer : KSerializer<ContractInfo> {
    private val delegator: KSerializer<ContractInfo> = ContractInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ContractInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ContractCodeHistoryEntry.KotlinxSerializer::class)
@SerialName(value = ContractCodeHistoryEntry.TYPE_URL)
public data class ContractCodeHistoryEntry(
  @ProtobufIndex(index = 1)
  public val operation: ContractCodeHistoryOperationType,
  @ProtobufIndex(index = 2)
  public val codeId: ULong,
  @ProtobufIndex(index = 3)
  public val updated: AbsoluteTxPosition,
  @ProtobufIndex(index = 4)
  public val msg: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.ContractCodeHistoryEntry"
  }

  public object KotlinxSerializer : KSerializer<ContractCodeHistoryEntry> {
    private val delegator: KSerializer<ContractCodeHistoryEntry> =
        ContractCodeHistoryEntry.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractCodeHistoryEntry): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractCodeHistoryEntryConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractCodeHistoryEntry {
      if (decoder is ProtobufMapperDecoder) {
        return ContractCodeHistoryEntryConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AbsoluteTxPosition.KotlinxSerializer::class)
@SerialName(value = AbsoluteTxPosition.TYPE_URL)
public data class AbsoluteTxPosition(
  @ProtobufIndex(index = 1)
  public val blockHeight: ULong,
  @ProtobufIndex(index = 2)
  public val txIndex: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.AbsoluteTxPosition"
  }

  public object KotlinxSerializer : KSerializer<AbsoluteTxPosition> {
    private val delegator: KSerializer<AbsoluteTxPosition> = AbsoluteTxPosition.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AbsoluteTxPosition): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AbsoluteTxPositionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AbsoluteTxPosition {
      if (decoder is ProtobufMapperDecoder) {
        return AbsoluteTxPositionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Model.KotlinxSerializer::class)
@SerialName(value = Model.TYPE_URL)
public data class Model(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
  @ProtobufIndex(index = 2)
  public val `value`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.Model"
  }

  public object KotlinxSerializer : KSerializer<Model> {
    private val delegator: KSerializer<Model> = Model.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Model): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModelConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Model {
      if (decoder is ProtobufMapperDecoder) {
        return ModelConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
