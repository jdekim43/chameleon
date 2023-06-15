// Transform from cosmos/auth/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import google.protobuf.Any
import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Long
import kotlin.ReplaceWith
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

@Serializable(with = QueryAccountsRequest.KotlinxSerializer::class)
@SerialName(value = QueryAccountsRequest.TYPE_URL)
public data class QueryAccountsRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryAccountsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountsRequest> {
    private val delegator: KSerializer<QueryAccountsRequest> = QueryAccountsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountsResponse.KotlinxSerializer::class)
@SerialName(value = QueryAccountsResponse.TYPE_URL)
public data class QueryAccountsResponse(
  @ProtobufIndex(index = 1)
  public val accounts: List<Any>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryAccountsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountsResponse> {
    private val delegator: KSerializer<QueryAccountsResponse> = QueryAccountsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountRequest.KotlinxSerializer::class)
@SerialName(value = QueryAccountRequest.TYPE_URL)
public data class QueryAccountRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryAccountRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountRequest> {
    private val delegator: KSerializer<QueryAccountRequest> = QueryAccountRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountResponse.KotlinxSerializer::class)
@SerialName(value = QueryAccountResponse.TYPE_URL)
public data class QueryAccountResponse(
  @ProtobufIndex(index = 1)
  public val account: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryAccountResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountResponse> {
    private val delegator: KSerializer<QueryAccountResponse> = QueryAccountResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryParamsResponse"
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

@Serializable(with = QueryModuleAccountsRequest.KotlinxSerializer::class)
@SerialName(value = QueryModuleAccountsRequest.TYPE_URL)
public class QueryModuleAccountsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryModuleAccountsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryModuleAccountsRequest> {
    private val delegator: KSerializer<QueryModuleAccountsRequest> =
        QueryModuleAccountsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleAccountsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryModuleAccountsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleAccountsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleAccountsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleAccountsResponse.KotlinxSerializer::class)
@SerialName(value = QueryModuleAccountsResponse.TYPE_URL)
public data class QueryModuleAccountsResponse(
  @ProtobufIndex(index = 1)
  public val accounts: List<Any>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryModuleAccountsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryModuleAccountsResponse> {
    private val delegator: KSerializer<QueryModuleAccountsResponse> =
        QueryModuleAccountsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleAccountsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryModuleAccountsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleAccountsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleAccountsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleAccountByNameRequest.KotlinxSerializer::class)
@SerialName(value = QueryModuleAccountByNameRequest.TYPE_URL)
public data class QueryModuleAccountByNameRequest(
  @ProtobufIndex(index = 1)
  public val name: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryModuleAccountByNameRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryModuleAccountByNameRequest> {
    private val delegator: KSerializer<QueryModuleAccountByNameRequest> =
        QueryModuleAccountByNameRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleAccountByNameRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryModuleAccountByNameRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleAccountByNameRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleAccountByNameRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleAccountByNameResponse.KotlinxSerializer::class)
@SerialName(value = QueryModuleAccountByNameResponse.TYPE_URL)
public data class QueryModuleAccountByNameResponse(
  @ProtobufIndex(index = 1)
  public val account: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryModuleAccountByNameResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryModuleAccountByNameResponse> {
    private val delegator: KSerializer<QueryModuleAccountByNameResponse> =
        QueryModuleAccountByNameResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleAccountByNameResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryModuleAccountByNameResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleAccountByNameResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleAccountByNameResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Bech32PrefixRequest.KotlinxSerializer::class)
@SerialName(value = Bech32PrefixRequest.TYPE_URL)
public class Bech32PrefixRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.Bech32PrefixRequest"
  }

  public object KotlinxSerializer : KSerializer<Bech32PrefixRequest> {
    private val delegator: KSerializer<Bech32PrefixRequest> = Bech32PrefixRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Bech32PrefixRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(Bech32PrefixRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Bech32PrefixRequest {
      if (decoder is ProtobufMapperDecoder) {
        return Bech32PrefixRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Bech32PrefixResponse.KotlinxSerializer::class)
@SerialName(value = Bech32PrefixResponse.TYPE_URL)
public data class Bech32PrefixResponse(
  @ProtobufIndex(index = 1)
  public val bech32Prefix: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.Bech32PrefixResponse"
  }

  public object KotlinxSerializer : KSerializer<Bech32PrefixResponse> {
    private val delegator: KSerializer<Bech32PrefixResponse> = Bech32PrefixResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Bech32PrefixResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(Bech32PrefixResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Bech32PrefixResponse {
      if (decoder is ProtobufMapperDecoder) {
        return Bech32PrefixResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AddressBytesToStringRequest.KotlinxSerializer::class)
@SerialName(value = AddressBytesToStringRequest.TYPE_URL)
public data class AddressBytesToStringRequest(
  @ProtobufIndex(index = 1)
  public val addressBytes: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.AddressBytesToStringRequest"
  }

  public object KotlinxSerializer : KSerializer<AddressBytesToStringRequest> {
    private val delegator: KSerializer<AddressBytesToStringRequest> =
        AddressBytesToStringRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AddressBytesToStringRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AddressBytesToStringRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AddressBytesToStringRequest {
      if (decoder is ProtobufMapperDecoder) {
        return AddressBytesToStringRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AddressBytesToStringResponse.KotlinxSerializer::class)
@SerialName(value = AddressBytesToStringResponse.TYPE_URL)
public data class AddressBytesToStringResponse(
  @ProtobufIndex(index = 1)
  public val addressString: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.AddressBytesToStringResponse"
  }

  public object KotlinxSerializer : KSerializer<AddressBytesToStringResponse> {
    private val delegator: KSerializer<AddressBytesToStringResponse> =
        AddressBytesToStringResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AddressBytesToStringResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AddressBytesToStringResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AddressBytesToStringResponse {
      if (decoder is ProtobufMapperDecoder) {
        return AddressBytesToStringResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AddressStringToBytesRequest.KotlinxSerializer::class)
@SerialName(value = AddressStringToBytesRequest.TYPE_URL)
public data class AddressStringToBytesRequest(
  @ProtobufIndex(index = 1)
  public val addressString: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.AddressStringToBytesRequest"
  }

  public object KotlinxSerializer : KSerializer<AddressStringToBytesRequest> {
    private val delegator: KSerializer<AddressStringToBytesRequest> =
        AddressStringToBytesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AddressStringToBytesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AddressStringToBytesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AddressStringToBytesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return AddressStringToBytesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AddressStringToBytesResponse.KotlinxSerializer::class)
@SerialName(value = AddressStringToBytesResponse.TYPE_URL)
public data class AddressStringToBytesResponse(
  @ProtobufIndex(index = 1)
  public val addressBytes: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.AddressStringToBytesResponse"
  }

  public object KotlinxSerializer : KSerializer<AddressStringToBytesResponse> {
    private val delegator: KSerializer<AddressStringToBytesResponse> =
        AddressStringToBytesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AddressStringToBytesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AddressStringToBytesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AddressStringToBytesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return AddressStringToBytesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountAddressByIDRequest.KotlinxSerializer::class)
@SerialName(value = QueryAccountAddressByIDRequest.TYPE_URL)
public data class QueryAccountAddressByIDRequest(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val id: Long,
  @ProtobufIndex(index = 2)
  public val accountId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryAccountAddressByIDRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountAddressByIDRequest> {
    private val delegator: KSerializer<QueryAccountAddressByIDRequest> =
        QueryAccountAddressByIDRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountAddressByIDRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountAddressByIDRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountAddressByIDRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountAddressByIDRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountAddressByIDResponse.KotlinxSerializer::class)
@SerialName(value = QueryAccountAddressByIDResponse.TYPE_URL)
public data class QueryAccountAddressByIDResponse(
  @ProtobufIndex(index = 1)
  public val accountAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryAccountAddressByIDResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountAddressByIDResponse> {
    private val delegator: KSerializer<QueryAccountAddressByIDResponse> =
        QueryAccountAddressByIDResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountAddressByIDResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountAddressByIDResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountAddressByIDResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountAddressByIDResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountInfoRequest.KotlinxSerializer::class)
@SerialName(value = QueryAccountInfoRequest.TYPE_URL)
public data class QueryAccountInfoRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryAccountInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountInfoRequest> {
    private val delegator: KSerializer<QueryAccountInfoRequest> =
        QueryAccountInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountInfoRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountInfoResponse.KotlinxSerializer::class)
@SerialName(value = QueryAccountInfoResponse.TYPE_URL)
public data class QueryAccountInfoResponse(
  @ProtobufIndex(index = 1)
  public val info: BaseAccount,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.auth.v1beta1.QueryAccountInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountInfoResponse> {
    private val delegator: KSerializer<QueryAccountInfoResponse> =
        QueryAccountInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountInfoResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
