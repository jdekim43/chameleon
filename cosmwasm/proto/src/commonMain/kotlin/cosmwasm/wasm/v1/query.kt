// Transform from cosmwasm/wasm/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
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

@Serializable(with = QueryContractInfoRequest.KotlinxSerializer::class)
@SerialName(value = QueryContractInfoRequest.TYPE_URL)
public data class QueryContractInfoRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryContractInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryContractInfoRequest> {
    private val delegator: KSerializer<QueryContractInfoRequest> =
        QueryContractInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryContractInfoRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryContractInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryContractInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryContractInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryContractInfoResponse.KotlinxSerializer::class)
@SerialName(value = QueryContractInfoResponse.TYPE_URL)
public data class QueryContractInfoResponse(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val contractInfo: ContractInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryContractInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryContractInfoResponse> {
    private val delegator: KSerializer<QueryContractInfoResponse> =
        QueryContractInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryContractInfoResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryContractInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryContractInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryContractInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryContractHistoryRequest.KotlinxSerializer::class)
@SerialName(value = QueryContractHistoryRequest.TYPE_URL)
public data class QueryContractHistoryRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryContractHistoryRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryContractHistoryRequest> {
    private val delegator: KSerializer<QueryContractHistoryRequest> =
        QueryContractHistoryRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryContractHistoryRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryContractHistoryRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryContractHistoryRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryContractHistoryRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryContractHistoryResponse.KotlinxSerializer::class)
@SerialName(value = QueryContractHistoryResponse.TYPE_URL)
public data class QueryContractHistoryResponse(
  @ProtobufIndex(index = 1)
  public val entries: List<ContractCodeHistoryEntry>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryContractHistoryResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryContractHistoryResponse> {
    private val delegator: KSerializer<QueryContractHistoryResponse> =
        QueryContractHistoryResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryContractHistoryResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryContractHistoryResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryContractHistoryResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryContractHistoryResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryContractsByCodeRequest.KotlinxSerializer::class)
@SerialName(value = QueryContractsByCodeRequest.TYPE_URL)
public data class QueryContractsByCodeRequest(
  @ProtobufIndex(index = 1)
  public val codeId: ULong,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryContractsByCodeRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryContractsByCodeRequest> {
    private val delegator: KSerializer<QueryContractsByCodeRequest> =
        QueryContractsByCodeRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryContractsByCodeRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryContractsByCodeRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryContractsByCodeRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryContractsByCodeRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryContractsByCodeResponse.KotlinxSerializer::class)
@SerialName(value = QueryContractsByCodeResponse.TYPE_URL)
public data class QueryContractsByCodeResponse(
  @ProtobufIndex(index = 1)
  public val contracts: List<String>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryContractsByCodeResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryContractsByCodeResponse> {
    private val delegator: KSerializer<QueryContractsByCodeResponse> =
        QueryContractsByCodeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryContractsByCodeResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryContractsByCodeResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryContractsByCodeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryContractsByCodeResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllContractStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllContractStateRequest.TYPE_URL)
public data class QueryAllContractStateRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryAllContractStateRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllContractStateRequest> {
    private val delegator: KSerializer<QueryAllContractStateRequest> =
        QueryAllContractStateRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllContractStateRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllContractStateRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllContractStateRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllContractStateRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllContractStateResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllContractStateResponse.TYPE_URL)
public data class QueryAllContractStateResponse(
  @ProtobufIndex(index = 1)
  public val models: List<Model>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryAllContractStateResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllContractStateResponse> {
    private val delegator: KSerializer<QueryAllContractStateResponse> =
        QueryAllContractStateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllContractStateResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllContractStateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllContractStateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllContractStateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryRawContractStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryRawContractStateRequest.TYPE_URL)
public data class QueryRawContractStateRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val queryData: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryRawContractStateRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryRawContractStateRequest> {
    private val delegator: KSerializer<QueryRawContractStateRequest> =
        QueryRawContractStateRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryRawContractStateRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryRawContractStateRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryRawContractStateRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryRawContractStateRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryRawContractStateResponse.KotlinxSerializer::class)
@SerialName(value = QueryRawContractStateResponse.TYPE_URL)
public data class QueryRawContractStateResponse(
  @ProtobufIndex(index = 1)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryRawContractStateResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryRawContractStateResponse> {
    private val delegator: KSerializer<QueryRawContractStateResponse> =
        QueryRawContractStateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryRawContractStateResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryRawContractStateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryRawContractStateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryRawContractStateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySmartContractStateRequest.KotlinxSerializer::class)
@SerialName(value = QuerySmartContractStateRequest.TYPE_URL)
public data class QuerySmartContractStateRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val queryData: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QuerySmartContractStateRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySmartContractStateRequest> {
    private val delegator: KSerializer<QuerySmartContractStateRequest> =
        QuerySmartContractStateRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySmartContractStateRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySmartContractStateRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySmartContractStateRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySmartContractStateRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySmartContractStateResponse.KotlinxSerializer::class)
@SerialName(value = QuerySmartContractStateResponse.TYPE_URL)
public data class QuerySmartContractStateResponse(
  @ProtobufIndex(index = 1)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QuerySmartContractStateResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySmartContractStateResponse> {
    private val delegator: KSerializer<QuerySmartContractStateResponse> =
        QuerySmartContractStateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySmartContractStateResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySmartContractStateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySmartContractStateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySmartContractStateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCodeRequest.KotlinxSerializer::class)
@SerialName(value = QueryCodeRequest.TYPE_URL)
public data class QueryCodeRequest(
  @ProtobufIndex(index = 1)
  public val codeId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryCodeRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryCodeRequest> {
    private val delegator: KSerializer<QueryCodeRequest> = QueryCodeRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCodeRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCodeRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCodeRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCodeRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CodeInfoResponse.KotlinxSerializer::class)
@SerialName(value = CodeInfoResponse.TYPE_URL)
public data class CodeInfoResponse(
  @ProtobufIndex(index = 1)
  public val codeId: ULong,
  @ProtobufIndex(index = 2)
  public val creator: String,
  @ProtobufIndex(index = 3)
  public val dataHash: ByteArray,
  @ProtobufIndex(index = 6)
  public val instantiatePermission: AccessConfig,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.CodeInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<CodeInfoResponse> {
    private val delegator: KSerializer<CodeInfoResponse> = CodeInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CodeInfoResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CodeInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CodeInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return CodeInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCodeResponse.KotlinxSerializer::class)
@SerialName(value = QueryCodeResponse.TYPE_URL)
public data class QueryCodeResponse(
  @ProtobufIndex(index = 1)
  public val codeInfo: CodeInfoResponse,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryCodeResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryCodeResponse> {
    private val delegator: KSerializer<QueryCodeResponse> = QueryCodeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCodeResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCodeResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCodeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCodeResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCodesRequest.KotlinxSerializer::class)
@SerialName(value = QueryCodesRequest.TYPE_URL)
public data class QueryCodesRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryCodesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryCodesRequest> {
    private val delegator: KSerializer<QueryCodesRequest> = QueryCodesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCodesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCodesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCodesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCodesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCodesResponse.KotlinxSerializer::class)
@SerialName(value = QueryCodesResponse.TYPE_URL)
public data class QueryCodesResponse(
  @ProtobufIndex(index = 1)
  public val codeInfos: List<CodeInfoResponse>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryCodesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryCodesResponse> {
    private val delegator: KSerializer<QueryCodesResponse> = QueryCodesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCodesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCodesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCodesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCodesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPinnedCodesRequest.KotlinxSerializer::class)
@SerialName(value = QueryPinnedCodesRequest.TYPE_URL)
public data class QueryPinnedCodesRequest(
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryPinnedCodesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryPinnedCodesRequest> {
    private val delegator: KSerializer<QueryPinnedCodesRequest> =
        QueryPinnedCodesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPinnedCodesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPinnedCodesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPinnedCodesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPinnedCodesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPinnedCodesResponse.KotlinxSerializer::class)
@SerialName(value = QueryPinnedCodesResponse.TYPE_URL)
public data class QueryPinnedCodesResponse(
  @ProtobufIndex(index = 1)
  public val codeIds: List<ULong>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryPinnedCodesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryPinnedCodesResponse> {
    private val delegator: KSerializer<QueryPinnedCodesResponse> =
        QueryPinnedCodesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPinnedCodesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPinnedCodesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPinnedCodesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPinnedCodesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryParamsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryParamsRequest> {
    private val delegator: KSerializer<QueryParamsRequest> = QueryParamsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryParamsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryParamsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryParamsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryParamsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsResponse.KotlinxSerializer::class)
@SerialName(value = QueryParamsResponse.TYPE_URL)
public data class QueryParamsResponse(
  @ProtobufIndex(index = 1)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryParamsResponse> {
    private val delegator: KSerializer<QueryParamsResponse> = QueryParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryContractsByCreatorRequest.KotlinxSerializer::class)
@SerialName(value = QueryContractsByCreatorRequest.TYPE_URL)
public data class QueryContractsByCreatorRequest(
  @ProtobufIndex(index = 1)
  public val creatorAddress: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryContractsByCreatorRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryContractsByCreatorRequest> {
    private val delegator: KSerializer<QueryContractsByCreatorRequest> =
        QueryContractsByCreatorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryContractsByCreatorRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryContractsByCreatorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryContractsByCreatorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryContractsByCreatorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryContractsByCreatorResponse.KotlinxSerializer::class)
@SerialName(value = QueryContractsByCreatorResponse.TYPE_URL)
public data class QueryContractsByCreatorResponse(
  @ProtobufIndex(index = 1)
  public val contractAddresses: List<String>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.QueryContractsByCreatorResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryContractsByCreatorResponse> {
    private val delegator: KSerializer<QueryContractsByCreatorResponse> =
        QueryContractsByCreatorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryContractsByCreatorResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryContractsByCreatorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryContractsByCreatorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryContractsByCreatorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
