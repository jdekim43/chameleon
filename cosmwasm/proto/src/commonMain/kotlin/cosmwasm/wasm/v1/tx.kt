// Transform from cosmwasm/wasm/v1/tx.proto
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

@Serializable(with = MsgStoreCode.KotlinxSerializer::class)
@SerialName(value = MsgStoreCode.TYPE_URL)
public data class MsgStoreCode(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val wasmByteCode: ByteArray,
  @ProtobufIndex(index = 5)
  public val instantiatePermission: AccessConfig,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgStoreCode"
  }

  public object KotlinxSerializer : KSerializer<MsgStoreCode> {
    private val delegator: KSerializer<MsgStoreCode> = MsgStoreCode.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgStoreCode): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgStoreCodeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgStoreCode {
      if (decoder is ProtobufMapperDecoder) {
        return MsgStoreCodeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgStoreCodeResponse.KotlinxSerializer::class)
@SerialName(value = MsgStoreCodeResponse.TYPE_URL)
public data class MsgStoreCodeResponse(
  @ProtobufIndex(index = 1)
  public val codeId: ULong,
  @ProtobufIndex(index = 2)
  public val checksum: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgStoreCodeResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgStoreCodeResponse> {
    private val delegator: KSerializer<MsgStoreCodeResponse> = MsgStoreCodeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgStoreCodeResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgStoreCodeResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgStoreCodeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgStoreCodeResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantiateContract.KotlinxSerializer::class)
@SerialName(value = MsgInstantiateContract.TYPE_URL)
public data class MsgInstantiateContract(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val admin: String,
  @ProtobufIndex(index = 3)
  public val codeId: ULong,
  @ProtobufIndex(index = 4)
  public val label: String,
  @ProtobufIndex(index = 5)
  public val msg: ByteArray,
  @ProtobufIndex(index = 6)
  public val funds: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgInstantiateContract"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantiateContract> {
    private val delegator: KSerializer<MsgInstantiateContract> = MsgInstantiateContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgInstantiateContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantiateContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantiateContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantiateContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantiateContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgInstantiateContractResponse.TYPE_URL)
public data class MsgInstantiateContractResponse(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgInstantiateContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantiateContractResponse> {
    private val delegator: KSerializer<MsgInstantiateContractResponse> =
        MsgInstantiateContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgInstantiateContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantiateContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantiateContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantiateContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantiateContract2.KotlinxSerializer::class)
@SerialName(value = MsgInstantiateContract2.TYPE_URL)
public data class MsgInstantiateContract2(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val admin: String,
  @ProtobufIndex(index = 3)
  public val codeId: ULong,
  @ProtobufIndex(index = 4)
  public val label: String,
  @ProtobufIndex(index = 5)
  public val msg: ByteArray,
  @ProtobufIndex(index = 6)
  public val funds: List<Coin>,
  @ProtobufIndex(index = 7)
  public val salt: ByteArray,
  @ProtobufIndex(index = 8)
  public val fixMsg: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgInstantiateContract2"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantiateContract2> {
    private val delegator: KSerializer<MsgInstantiateContract2> =
        MsgInstantiateContract2.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgInstantiateContract2): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantiateContract2Converter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantiateContract2 {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantiateContract2Converter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantiateContract2Response.KotlinxSerializer::class)
@SerialName(value = MsgInstantiateContract2Response.TYPE_URL)
public data class MsgInstantiateContract2Response(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgInstantiateContract2Response"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantiateContract2Response> {
    private val delegator: KSerializer<MsgInstantiateContract2Response> =
        MsgInstantiateContract2Response.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgInstantiateContract2Response):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantiateContract2ResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantiateContract2Response {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantiateContract2ResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExecuteContract.KotlinxSerializer::class)
@SerialName(value = MsgExecuteContract.TYPE_URL)
public data class MsgExecuteContract(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val contract: String,
  @ProtobufIndex(index = 3)
  public val msg: ByteArray,
  @ProtobufIndex(index = 5)
  public val funds: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgExecuteContract"
  }

  public object KotlinxSerializer : KSerializer<MsgExecuteContract> {
    private val delegator: KSerializer<MsgExecuteContract> = MsgExecuteContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExecuteContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgExecuteContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExecuteContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecuteContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExecuteContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgExecuteContractResponse.TYPE_URL)
public data class MsgExecuteContractResponse(
  @ProtobufIndex(index = 1)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgExecuteContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgExecuteContractResponse> {
    private val delegator: KSerializer<MsgExecuteContractResponse> =
        MsgExecuteContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExecuteContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgExecuteContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExecuteContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecuteContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgMigrateContract.KotlinxSerializer::class)
@SerialName(value = MsgMigrateContract.TYPE_URL)
public data class MsgMigrateContract(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val contract: String,
  @ProtobufIndex(index = 3)
  public val codeId: ULong,
  @ProtobufIndex(index = 4)
  public val msg: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgMigrateContract"
  }

  public object KotlinxSerializer : KSerializer<MsgMigrateContract> {
    private val delegator: KSerializer<MsgMigrateContract> = MsgMigrateContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgMigrateContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgMigrateContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgMigrateContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgMigrateContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgMigrateContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgMigrateContractResponse.TYPE_URL)
public data class MsgMigrateContractResponse(
  @ProtobufIndex(index = 1)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgMigrateContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgMigrateContractResponse> {
    private val delegator: KSerializer<MsgMigrateContractResponse> =
        MsgMigrateContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgMigrateContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgMigrateContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgMigrateContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgMigrateContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateAdmin.KotlinxSerializer::class)
@SerialName(value = MsgUpdateAdmin.TYPE_URL)
public data class MsgUpdateAdmin(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val newAdmin: String,
  @ProtobufIndex(index = 3)
  public val contract: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgUpdateAdmin"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateAdmin> {
    private val delegator: KSerializer<MsgUpdateAdmin> = MsgUpdateAdmin.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateAdmin): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateAdminConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateAdmin {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateAdminConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateAdminResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateAdminResponse.TYPE_URL)
public class MsgUpdateAdminResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgUpdateAdminResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateAdminResponse> {
    private val delegator: KSerializer<MsgUpdateAdminResponse> = MsgUpdateAdminResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateAdminResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateAdminResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateAdminResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateAdminResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgClearAdmin.KotlinxSerializer::class)
@SerialName(value = MsgClearAdmin.TYPE_URL)
public data class MsgClearAdmin(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 3)
  public val contract: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgClearAdmin"
  }

  public object KotlinxSerializer : KSerializer<MsgClearAdmin> {
    private val delegator: KSerializer<MsgClearAdmin> = MsgClearAdmin.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgClearAdmin): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgClearAdminConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgClearAdmin {
      if (decoder is ProtobufMapperDecoder) {
        return MsgClearAdminConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgClearAdminResponse.KotlinxSerializer::class)
@SerialName(value = MsgClearAdminResponse.TYPE_URL)
public class MsgClearAdminResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgClearAdminResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgClearAdminResponse> {
    private val delegator: KSerializer<MsgClearAdminResponse> = MsgClearAdminResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgClearAdminResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgClearAdminResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgClearAdminResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgClearAdminResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateInstantiateConfig.KotlinxSerializer::class)
@SerialName(value = MsgUpdateInstantiateConfig.TYPE_URL)
public data class MsgUpdateInstantiateConfig(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val codeId: ULong,
  @ProtobufIndex(index = 3)
  public val newInstantiatePermission: AccessConfig,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgUpdateInstantiateConfig"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateInstantiateConfig> {
    private val delegator: KSerializer<MsgUpdateInstantiateConfig> =
        MsgUpdateInstantiateConfig.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateInstantiateConfig): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateInstantiateConfigConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateInstantiateConfig {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateInstantiateConfigConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateInstantiateConfigResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateInstantiateConfigResponse.TYPE_URL)
public class MsgUpdateInstantiateConfigResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgUpdateInstantiateConfigResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateInstantiateConfigResponse> {
    private val delegator: KSerializer<MsgUpdateInstantiateConfigResponse> =
        MsgUpdateInstantiateConfigResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateInstantiateConfigResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateInstantiateConfigResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateInstantiateConfigResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateInstantiateConfigResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParams.TYPE_URL)
public data class MsgUpdateParams(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgUpdateParams"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateParams> {
    private val delegator: KSerializer<MsgUpdateParams> = MsgUpdateParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParams {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParamsResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParamsResponse.TYPE_URL)
public class MsgUpdateParamsResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgUpdateParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateParamsResponse> {
    private val delegator: KSerializer<MsgUpdateParamsResponse> =
        MsgUpdateParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSudoContract.KotlinxSerializer::class)
@SerialName(value = MsgSudoContract.TYPE_URL)
public data class MsgSudoContract(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val contract: String,
  @ProtobufIndex(index = 3)
  public val msg: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgSudoContract"
  }

  public object KotlinxSerializer : KSerializer<MsgSudoContract> {
    private val delegator: KSerializer<MsgSudoContract> = MsgSudoContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSudoContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSudoContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSudoContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSudoContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSudoContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgSudoContractResponse.TYPE_URL)
public data class MsgSudoContractResponse(
  @ProtobufIndex(index = 1)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgSudoContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSudoContractResponse> {
    private val delegator: KSerializer<MsgSudoContractResponse> =
        MsgSudoContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSudoContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSudoContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSudoContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSudoContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgPinCodes.KotlinxSerializer::class)
@SerialName(value = MsgPinCodes.TYPE_URL)
public data class MsgPinCodes(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val codeIds: List<ULong>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgPinCodes"
  }

  public object KotlinxSerializer : KSerializer<MsgPinCodes> {
    private val delegator: KSerializer<MsgPinCodes> = MsgPinCodes.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgPinCodes): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgPinCodesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgPinCodes {
      if (decoder is ProtobufMapperDecoder) {
        return MsgPinCodesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgPinCodesResponse.KotlinxSerializer::class)
@SerialName(value = MsgPinCodesResponse.TYPE_URL)
public class MsgPinCodesResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgPinCodesResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgPinCodesResponse> {
    private val delegator: KSerializer<MsgPinCodesResponse> = MsgPinCodesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgPinCodesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgPinCodesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgPinCodesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgPinCodesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUnpinCodes.KotlinxSerializer::class)
@SerialName(value = MsgUnpinCodes.TYPE_URL)
public data class MsgUnpinCodes(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val codeIds: List<ULong>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgUnpinCodes"
  }

  public object KotlinxSerializer : KSerializer<MsgUnpinCodes> {
    private val delegator: KSerializer<MsgUnpinCodes> = MsgUnpinCodes.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnpinCodes): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUnpinCodesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnpinCodes {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnpinCodesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUnpinCodesResponse.KotlinxSerializer::class)
@SerialName(value = MsgUnpinCodesResponse.TYPE_URL)
public class MsgUnpinCodesResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgUnpinCodesResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUnpinCodesResponse> {
    private val delegator: KSerializer<MsgUnpinCodesResponse> = MsgUnpinCodesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnpinCodesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUnpinCodesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnpinCodesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnpinCodesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgStoreAndInstantiateContract.KotlinxSerializer::class)
@SerialName(value = MsgStoreAndInstantiateContract.TYPE_URL)
public data class MsgStoreAndInstantiateContract(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 3)
  public val wasmByteCode: ByteArray,
  @ProtobufIndex(index = 4)
  public val instantiatePermission: AccessConfig,
  @ProtobufIndex(index = 5)
  public val unpinCode: Boolean,
  @ProtobufIndex(index = 6)
  public val admin: String,
  @ProtobufIndex(index = 7)
  public val label: String,
  @ProtobufIndex(index = 8)
  public val msg: ByteArray,
  @ProtobufIndex(index = 9)
  public val funds: List<Coin>,
  @ProtobufIndex(index = 10)
  public val source: String,
  @ProtobufIndex(index = 11)
  public val builder: String,
  @ProtobufIndex(index = 12)
  public val codeHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgStoreAndInstantiateContract"
  }

  public object KotlinxSerializer : KSerializer<MsgStoreAndInstantiateContract> {
    private val delegator: KSerializer<MsgStoreAndInstantiateContract> =
        MsgStoreAndInstantiateContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgStoreAndInstantiateContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgStoreAndInstantiateContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgStoreAndInstantiateContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgStoreAndInstantiateContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgStoreAndInstantiateContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgStoreAndInstantiateContractResponse.TYPE_URL)
public data class MsgStoreAndInstantiateContractResponse(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MsgStoreAndInstantiateContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgStoreAndInstantiateContractResponse> {
    private val delegator: KSerializer<MsgStoreAndInstantiateContractResponse> =
        MsgStoreAndInstantiateContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgStoreAndInstantiateContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgStoreAndInstantiateContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgStoreAndInstantiateContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgStoreAndInstantiateContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
