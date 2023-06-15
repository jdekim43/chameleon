// Transform from mint/v1beta1/mint.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

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

@Serializable(with = Minter.KotlinxSerializer::class)
@SerialName(value = Minter.TYPE_URL)
public data class Minter(
  @ProtobufIndex(index = 1)
  public val startDate: String,
  @ProtobufIndex(index = 2)
  public val endDate: String,
  @ProtobufIndex(index = 3)
  public val denom: String,
  @ProtobufIndex(index = 4)
  public val totalMintAmount: ULong,
  @ProtobufIndex(index = 5)
  public val remainingMintAmount: ULong,
  @ProtobufIndex(index = 6)
  public val lastMintAmount: ULong,
  @ProtobufIndex(index = 7)
  public val lastMintDate: String,
  @ProtobufIndex(index = 8)
  public val lastMintHeight: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.mint.Minter"
  }

  public object KotlinxSerializer : KSerializer<Minter> {
    private val delegator: KSerializer<Minter> = Minter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Minter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MinterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Minter {
      if (decoder is ProtobufMapperDecoder) {
        return MinterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ScheduledTokenRelease.KotlinxSerializer::class)
@SerialName(value = ScheduledTokenRelease.TYPE_URL)
public data class ScheduledTokenRelease(
  @ProtobufIndex(index = 1)
  public val startDate: String,
  @ProtobufIndex(index = 2)
  public val endDate: String,
  @ProtobufIndex(index = 3)
  public val tokenReleaseAmount: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.mint.ScheduledTokenRelease"
  }

  public object KotlinxSerializer : KSerializer<ScheduledTokenRelease> {
    private val delegator: KSerializer<ScheduledTokenRelease> = ScheduledTokenRelease.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ScheduledTokenRelease): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ScheduledTokenReleaseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ScheduledTokenRelease {
      if (decoder is ProtobufMapperDecoder) {
        return ScheduledTokenReleaseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val mintDenom: String,
  @ProtobufIndex(index = 2)
  public val tokenReleaseSchedule: List<ScheduledTokenRelease>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.mint.Params"
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

@Serializable(with = Version2Minter.KotlinxSerializer::class)
@SerialName(value = Version2Minter.TYPE_URL)
public data class Version2Minter(
  @ProtobufIndex(index = 1)
  public val lastMintAmount: String,
  @ProtobufIndex(index = 2)
  public val lastMintDate: String,
  @ProtobufIndex(index = 3)
  public val lastMintHeight: Long,
  @ProtobufIndex(index = 4)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.mint.Version2Minter"
  }

  public object KotlinxSerializer : KSerializer<Version2Minter> {
    private val delegator: KSerializer<Version2Minter> = Version2Minter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Version2Minter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(Version2MinterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Version2Minter {
      if (decoder is ProtobufMapperDecoder) {
        return Version2MinterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Version2ScheduledTokenRelease.KotlinxSerializer::class)
@SerialName(value = Version2ScheduledTokenRelease.TYPE_URL)
public data class Version2ScheduledTokenRelease(
  @ProtobufIndex(index = 1)
  public val date: String,
  @ProtobufIndex(index = 2)
  public val tokenReleaseAmount: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.mint.Version2ScheduledTokenRelease"
  }

  public object KotlinxSerializer : KSerializer<Version2ScheduledTokenRelease> {
    private val delegator: KSerializer<Version2ScheduledTokenRelease> =
        Version2ScheduledTokenRelease.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Version2ScheduledTokenRelease): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(Version2ScheduledTokenReleaseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Version2ScheduledTokenRelease {
      if (decoder is ProtobufMapperDecoder) {
        return Version2ScheduledTokenReleaseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Version2Params.KotlinxSerializer::class)
@SerialName(value = Version2Params.TYPE_URL)
public data class Version2Params(
  @ProtobufIndex(index = 1)
  public val mintDenom: String,
  @ProtobufIndex(index = 2)
  public val tokenReleaseSchedule: List<Version2ScheduledTokenRelease>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.mint.Version2Params"
  }

  public object KotlinxSerializer : KSerializer<Version2Params> {
    private val delegator: KSerializer<Version2Params> = Version2Params.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Version2Params): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(Version2ParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Version2Params {
      if (decoder is ProtobufMapperDecoder) {
        return Version2ParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
