// Transform from dex/contract.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.Boolean
import kotlin.Long
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

@Serializable(with = ContractInfo.KotlinxSerializer::class)
@SerialName(value = ContractInfo.TYPE_URL)
public data class ContractInfo(
  @ProtobufIndex(index = 1)
  public val codeId: ULong,
  @ProtobufIndex(index = 2)
  public val contractAddr: String,
  @ProtobufIndex(index = 3)
  public val needHook: Boolean,
  @ProtobufIndex(index = 4)
  public val needOrderMatching: Boolean,
  @ProtobufIndex(index = 5)
  public val dependencies: List<ContractDependencyInfo>,
  @ProtobufIndex(index = 6)
  public val numIncomingDependencies: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.ContractInfo"
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

@Serializable(with = ContractInfoV2.KotlinxSerializer::class)
@SerialName(value = ContractInfoV2.TYPE_URL)
public data class ContractInfoV2(
  @ProtobufIndex(index = 1)
  public val codeId: ULong,
  @ProtobufIndex(index = 2)
  public val contractAddr: String,
  @ProtobufIndex(index = 3)
  public val needHook: Boolean,
  @ProtobufIndex(index = 4)
  public val needOrderMatching: Boolean,
  @ProtobufIndex(index = 5)
  public val dependencies: List<ContractDependencyInfo>,
  @ProtobufIndex(index = 6)
  public val numIncomingDependencies: Long,
  @ProtobufIndex(index = 7)
  public val creator: String,
  @ProtobufIndex(index = 8)
  public val rentBalance: ULong,
  @ProtobufIndex(index = 9)
  public val suspended: Boolean,
  @ProtobufIndex(index = 10)
  public val suspensionReason: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.ContractInfoV2"
  }

  public object KotlinxSerializer : KSerializer<ContractInfoV2> {
    private val delegator: KSerializer<ContractInfoV2> = ContractInfoV2.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractInfoV2): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractInfoV2Converter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractInfoV2 {
      if (decoder is ProtobufMapperDecoder) {
        return ContractInfoV2Converter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ContractDependencyInfo.KotlinxSerializer::class)
@SerialName(value = ContractDependencyInfo.TYPE_URL)
public data class ContractDependencyInfo(
  @ProtobufIndex(index = 1)
  public val dependency: String,
  @ProtobufIndex(index = 2)
  public val immediateElderSibling: String,
  @ProtobufIndex(index = 3)
  public val immediateYoungerSibling: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.ContractDependencyInfo"
  }

  public object KotlinxSerializer : KSerializer<ContractDependencyInfo> {
    private val delegator: KSerializer<ContractDependencyInfo> = ContractDependencyInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractDependencyInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractDependencyInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractDependencyInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ContractDependencyInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = LegacyContractInfo.KotlinxSerializer::class)
@SerialName(value = LegacyContractInfo.TYPE_URL)
public data class LegacyContractInfo(
  @ProtobufIndex(index = 1)
  public val codeId: ULong,
  @ProtobufIndex(index = 2)
  public val contractAddr: String,
  @ProtobufIndex(index = 3)
  public val needHook: Boolean,
  @ProtobufIndex(index = 4)
  public val needOrderMatching: Boolean,
  @ProtobufIndex(index = 5)
  public val dependentContractAddrs: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.LegacyContractInfo"
  }

  public object KotlinxSerializer : KSerializer<LegacyContractInfo> {
    private val delegator: KSerializer<LegacyContractInfo> = LegacyContractInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LegacyContractInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(LegacyContractInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LegacyContractInfo {
      if (decoder is ProtobufMapperDecoder) {
        return LegacyContractInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
