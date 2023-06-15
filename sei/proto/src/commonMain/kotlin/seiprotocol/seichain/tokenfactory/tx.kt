// Transform from tokenfactory/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import cosmos.base.v1beta1.Coin
import kotlin.String
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

@Serializable(with = MsgCreateDenom.KotlinxSerializer::class)
@SerialName(value = MsgCreateDenom.TYPE_URL)
public data class MsgCreateDenom(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val subdenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.tokenfactory.MsgCreateDenom"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateDenom> {
    private val delegator: KSerializer<MsgCreateDenom> = MsgCreateDenom.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateDenom): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateDenomConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateDenom {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateDenomConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateDenomResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateDenomResponse.TYPE_URL)
public data class MsgCreateDenomResponse(
  @ProtobufIndex(index = 1)
  public val newTokenDenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.tokenfactory.MsgCreateDenomResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateDenomResponse> {
    private val delegator: KSerializer<MsgCreateDenomResponse> = MsgCreateDenomResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateDenomResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateDenomResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateDenomResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateDenomResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgMint.KotlinxSerializer::class)
@SerialName(value = MsgMint.TYPE_URL)
public data class MsgMint(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.tokenfactory.MsgMint"
  }

  public object KotlinxSerializer : KSerializer<MsgMint> {
    private val delegator: KSerializer<MsgMint> = MsgMint.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgMint): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgMintConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgMint {
      if (decoder is ProtobufMapperDecoder) {
        return MsgMintConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgMintResponse.KotlinxSerializer::class)
@SerialName(value = MsgMintResponse.TYPE_URL)
public class MsgMintResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.tokenfactory.MsgMintResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgMintResponse> {
    private val delegator: KSerializer<MsgMintResponse> = MsgMintResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgMintResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgMintResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgMintResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgMintResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBurn.KotlinxSerializer::class)
@SerialName(value = MsgBurn.TYPE_URL)
public data class MsgBurn(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.tokenfactory.MsgBurn"
  }

  public object KotlinxSerializer : KSerializer<MsgBurn> {
    private val delegator: KSerializer<MsgBurn> = MsgBurn.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBurn): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBurnConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBurn {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBurnConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBurnResponse.KotlinxSerializer::class)
@SerialName(value = MsgBurnResponse.TYPE_URL)
public class MsgBurnResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.tokenfactory.MsgBurnResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgBurnResponse> {
    private val delegator: KSerializer<MsgBurnResponse> = MsgBurnResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBurnResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBurnResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBurnResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBurnResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgChangeAdmin.KotlinxSerializer::class)
@SerialName(value = MsgChangeAdmin.TYPE_URL)
public data class MsgChangeAdmin(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
  @ProtobufIndex(index = 3)
  public val newAdmin: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.tokenfactory.MsgChangeAdmin"
  }

  public object KotlinxSerializer : KSerializer<MsgChangeAdmin> {
    private val delegator: KSerializer<MsgChangeAdmin> = MsgChangeAdmin.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgChangeAdmin): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgChangeAdminConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgChangeAdmin {
      if (decoder is ProtobufMapperDecoder) {
        return MsgChangeAdminConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgChangeAdminResponse.KotlinxSerializer::class)
@SerialName(value = MsgChangeAdminResponse.TYPE_URL)
public class MsgChangeAdminResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.tokenfactory.MsgChangeAdminResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgChangeAdminResponse> {
    private val delegator: KSerializer<MsgChangeAdminResponse> = MsgChangeAdminResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgChangeAdminResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgChangeAdminResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgChangeAdminResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgChangeAdminResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
