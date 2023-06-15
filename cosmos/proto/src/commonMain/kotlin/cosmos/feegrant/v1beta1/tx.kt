// Transform from cosmos/feegrant/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

import google.protobuf.Any
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

@Serializable(with = MsgGrantAllowance.KotlinxSerializer::class)
@SerialName(value = MsgGrantAllowance.TYPE_URL)
public data class MsgGrantAllowance(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
  @ProtobufIndex(index = 3)
  public val allowance: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.MsgGrantAllowance"
  }

  public object KotlinxSerializer : KSerializer<MsgGrantAllowance> {
    private val delegator: KSerializer<MsgGrantAllowance> = MsgGrantAllowance.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgGrantAllowance): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgGrantAllowanceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgGrantAllowance {
      if (decoder is ProtobufMapperDecoder) {
        return MsgGrantAllowanceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgGrantAllowanceResponse.KotlinxSerializer::class)
@SerialName(value = MsgGrantAllowanceResponse.TYPE_URL)
public class MsgGrantAllowanceResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.MsgGrantAllowanceResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgGrantAllowanceResponse> {
    private val delegator: KSerializer<MsgGrantAllowanceResponse> =
        MsgGrantAllowanceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgGrantAllowanceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgGrantAllowanceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgGrantAllowanceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgGrantAllowanceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRevokeAllowance.KotlinxSerializer::class)
@SerialName(value = MsgRevokeAllowance.TYPE_URL)
public data class MsgRevokeAllowance(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.MsgRevokeAllowance"
  }

  public object KotlinxSerializer : KSerializer<MsgRevokeAllowance> {
    private val delegator: KSerializer<MsgRevokeAllowance> = MsgRevokeAllowance.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRevokeAllowance): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRevokeAllowanceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRevokeAllowance {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRevokeAllowanceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRevokeAllowanceResponse.KotlinxSerializer::class)
@SerialName(value = MsgRevokeAllowanceResponse.TYPE_URL)
public class MsgRevokeAllowanceResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.feegrant.v1beta1.MsgRevokeAllowanceResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRevokeAllowanceResponse> {
    private val delegator: KSerializer<MsgRevokeAllowanceResponse> =
        MsgRevokeAllowanceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRevokeAllowanceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRevokeAllowanceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRevokeAllowanceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRevokeAllowanceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
