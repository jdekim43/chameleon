// Transform from cosmos/authz/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import google.protobuf.Any
import kotlin.ByteArray
import kotlin.String
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

@Serializable(with = MsgGrant.KotlinxSerializer::class)
@SerialName(value = MsgGrant.TYPE_URL)
public data class MsgGrant(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
  @ProtobufIndex(index = 3)
  public val grant: Grant,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.authz.v1beta1.MsgGrant"
  }

  public object KotlinxSerializer : KSerializer<MsgGrant> {
    private val delegator: KSerializer<MsgGrant> = MsgGrant.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgGrant): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgGrantConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgGrant {
      if (decoder is ProtobufMapperDecoder) {
        return MsgGrantConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExecResponse.KotlinxSerializer::class)
@SerialName(value = MsgExecResponse.TYPE_URL)
public data class MsgExecResponse(
  @ProtobufIndex(index = 1)
  public val results: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.authz.v1beta1.MsgExecResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgExecResponse> {
    private val delegator: KSerializer<MsgExecResponse> = MsgExecResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExecResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgExecResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExecResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExec.KotlinxSerializer::class)
@SerialName(value = MsgExec.TYPE_URL)
public data class MsgExec(
  @ProtobufIndex(index = 1)
  public val grantee: String,
  @ProtobufIndex(index = 2)
  public val msgs: List<Any>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.authz.v1beta1.MsgExec"
  }

  public object KotlinxSerializer : KSerializer<MsgExec> {
    private val delegator: KSerializer<MsgExec> = MsgExec.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExec): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgExecConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExec {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgGrantResponse.KotlinxSerializer::class)
@SerialName(value = MsgGrantResponse.TYPE_URL)
public class MsgGrantResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.authz.v1beta1.MsgGrantResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgGrantResponse> {
    private val delegator: KSerializer<MsgGrantResponse> = MsgGrantResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgGrantResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgGrantResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgGrantResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgGrantResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRevoke.KotlinxSerializer::class)
@SerialName(value = MsgRevoke.TYPE_URL)
public data class MsgRevoke(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
  @ProtobufIndex(index = 3)
  public val msgTypeUrl: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.authz.v1beta1.MsgRevoke"
  }

  public object KotlinxSerializer : KSerializer<MsgRevoke> {
    private val delegator: KSerializer<MsgRevoke> = MsgRevoke.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRevoke): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRevokeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRevoke {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRevokeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRevokeResponse.KotlinxSerializer::class)
@SerialName(value = MsgRevokeResponse.TYPE_URL)
public class MsgRevokeResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.authz.v1beta1.MsgRevokeResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRevokeResponse> {
    private val delegator: KSerializer<MsgRevokeResponse> = MsgRevokeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRevokeResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRevokeResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRevokeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRevokeResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
