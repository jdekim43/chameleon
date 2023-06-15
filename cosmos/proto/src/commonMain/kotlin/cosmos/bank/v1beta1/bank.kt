// Transform from cosmos/bank/v1beta1/bank.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.ReplaceWith
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

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val sendEnabled: List<SendEnabled>,
  @ProtobufIndex(index = 2)
  public val defaultSendEnabled: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.Params"
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

@Serializable(with = SendEnabled.KotlinxSerializer::class)
@SerialName(value = SendEnabled.TYPE_URL)
public data class SendEnabled(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val enabled: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.SendEnabled"
  }

  public object KotlinxSerializer : KSerializer<SendEnabled> {
    private val delegator: KSerializer<SendEnabled> = SendEnabled.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SendEnabled): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SendEnabledConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SendEnabled {
      if (decoder is ProtobufMapperDecoder) {
        return SendEnabledConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Input.KotlinxSerializer::class)
@SerialName(value = Input.TYPE_URL)
public data class Input(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val coins: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.Input"
  }

  public object KotlinxSerializer : KSerializer<Input> {
    private val delegator: KSerializer<Input> = Input.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Input): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(InputConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Input {
      if (decoder is ProtobufMapperDecoder) {
        return InputConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Output.KotlinxSerializer::class)
@SerialName(value = Output.TYPE_URL)
public data class Output(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val coins: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.Output"
  }

  public object KotlinxSerializer : KSerializer<Output> {
    private val delegator: KSerializer<Output> = Output.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Output): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OutputConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Output {
      if (decoder is ProtobufMapperDecoder) {
        return OutputConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Supply.KotlinxSerializer::class)
@SerialName(value = Supply.TYPE_URL)
public data class Supply(
  @ProtobufIndex(index = 1)
  public val total: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.Supply"
  }

  public object KotlinxSerializer : KSerializer<Supply> {
    private val delegator: KSerializer<Supply> = Supply.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Supply): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SupplyConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Supply {
      if (decoder is ProtobufMapperDecoder) {
        return SupplyConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DenomUnit.KotlinxSerializer::class)
@SerialName(value = DenomUnit.TYPE_URL)
public data class DenomUnit(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val exponent: UInt,
  @ProtobufIndex(index = 3)
  public val aliases: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.DenomUnit"
  }

  public object KotlinxSerializer : KSerializer<DenomUnit> {
    private val delegator: KSerializer<DenomUnit> = DenomUnit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DenomUnit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DenomUnitConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DenomUnit {
      if (decoder is ProtobufMapperDecoder) {
        return DenomUnitConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Metadata.KotlinxSerializer::class)
@SerialName(value = Metadata.TYPE_URL)
public data class Metadata(
  @ProtobufIndex(index = 1)
  public val description: String,
  @ProtobufIndex(index = 2)
  public val denomUnits: List<DenomUnit>,
  @ProtobufIndex(index = 3)
  public val base: String,
  @ProtobufIndex(index = 4)
  public val display: String,
  @ProtobufIndex(index = 5)
  public val name: String,
  @ProtobufIndex(index = 6)
  public val symbol: String,
  @ProtobufIndex(index = 7)
  public val uri: String,
  @ProtobufIndex(index = 8)
  public val uriHash: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.Metadata"
  }

  public object KotlinxSerializer : KSerializer<Metadata> {
    private val delegator: KSerializer<Metadata> = Metadata.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Metadata): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MetadataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Metadata {
      if (decoder is ProtobufMapperDecoder) {
        return MetadataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
