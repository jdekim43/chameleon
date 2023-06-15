// Transform from cosmos/gov/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
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

@Serializable(with = QueryProposalRequest.KotlinxSerializer::class)
@SerialName(value = QueryProposalRequest.TYPE_URL)
public data class QueryProposalRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryProposalRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryProposalRequest> {
    private val delegator: KSerializer<QueryProposalRequest> = QueryProposalRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryProposalRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalResponse.KotlinxSerializer::class)
@SerialName(value = QueryProposalResponse.TYPE_URL)
public data class QueryProposalResponse(
  @ProtobufIndex(index = 1)
  public val proposal: Proposal,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryProposalResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryProposalResponse> {
    private val delegator: KSerializer<QueryProposalResponse> = QueryProposalResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryProposalResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalsRequest.KotlinxSerializer::class)
@SerialName(value = QueryProposalsRequest.TYPE_URL)
public data class QueryProposalsRequest(
  @ProtobufIndex(index = 1)
  public val proposalStatus: ProposalStatus,
  @ProtobufIndex(index = 2)
  public val voter: String,
  @ProtobufIndex(index = 3)
  public val depositor: String,
  @ProtobufIndex(index = 4)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryProposalsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryProposalsRequest> {
    private val delegator: KSerializer<QueryProposalsRequest> = QueryProposalsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryProposalsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalsResponse.KotlinxSerializer::class)
@SerialName(value = QueryProposalsResponse.TYPE_URL)
public data class QueryProposalsResponse(
  @ProtobufIndex(index = 1)
  public val proposals: List<Proposal>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryProposalsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryProposalsResponse> {
    private val delegator: KSerializer<QueryProposalsResponse> = QueryProposalsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryProposalsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVoteRequest.KotlinxSerializer::class)
@SerialName(value = QueryVoteRequest.TYPE_URL)
public data class QueryVoteRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val voter: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryVoteRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryVoteRequest> {
    private val delegator: KSerializer<QueryVoteRequest> = QueryVoteRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVoteRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVoteRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVoteRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVoteRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVoteResponse.KotlinxSerializer::class)
@SerialName(value = QueryVoteResponse.TYPE_URL)
public data class QueryVoteResponse(
  @ProtobufIndex(index = 1)
  public val vote: Vote,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryVoteResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryVoteResponse> {
    private val delegator: KSerializer<QueryVoteResponse> = QueryVoteResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVoteResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVoteResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVoteResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVoteResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesRequest.KotlinxSerializer::class)
@SerialName(value = QueryVotesRequest.TYPE_URL)
public data class QueryVotesRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryVotesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryVotesRequest> {
    private val delegator: KSerializer<QueryVotesRequest> = QueryVotesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVotesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesResponse.KotlinxSerializer::class)
@SerialName(value = QueryVotesResponse.TYPE_URL)
public data class QueryVotesResponse(
  @ProtobufIndex(index = 1)
  public val votes: List<Vote>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryVotesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryVotesResponse> {
    private val delegator: KSerializer<QueryVotesResponse> = QueryVotesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVotesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public data class QueryParamsRequest(
  @ProtobufIndex(index = 1)
  public val paramsType: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryParamsRequest"
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
  public val votingParams: VotingParams,
  @ProtobufIndex(index = 2)
  public val depositParams: DepositParams,
  @ProtobufIndex(index = 3)
  public val tallyParams: TallyParams,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryParamsResponse"
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

@Serializable(with = QueryDepositRequest.KotlinxSerializer::class)
@SerialName(value = QueryDepositRequest.TYPE_URL)
public data class QueryDepositRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val depositor: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryDepositRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDepositRequest> {
    private val delegator: KSerializer<QueryDepositRequest> = QueryDepositRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDepositRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDepositRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDepositRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDepositRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDepositResponse.KotlinxSerializer::class)
@SerialName(value = QueryDepositResponse.TYPE_URL)
public data class QueryDepositResponse(
  @ProtobufIndex(index = 1)
  public val deposit: Deposit,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryDepositResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDepositResponse> {
    private val delegator: KSerializer<QueryDepositResponse> = QueryDepositResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDepositResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDepositResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDepositResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDepositResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDepositsRequest.KotlinxSerializer::class)
@SerialName(value = QueryDepositsRequest.TYPE_URL)
public data class QueryDepositsRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryDepositsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDepositsRequest> {
    private val delegator: KSerializer<QueryDepositsRequest> = QueryDepositsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDepositsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDepositsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDepositsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDepositsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDepositsResponse.KotlinxSerializer::class)
@SerialName(value = QueryDepositsResponse.TYPE_URL)
public data class QueryDepositsResponse(
  @ProtobufIndex(index = 1)
  public val deposits: List<Deposit>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryDepositsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDepositsResponse> {
    private val delegator: KSerializer<QueryDepositsResponse> = QueryDepositsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDepositsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDepositsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDepositsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDepositsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTallyResultRequest.KotlinxSerializer::class)
@SerialName(value = QueryTallyResultRequest.TYPE_URL)
public data class QueryTallyResultRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryTallyResultRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTallyResultRequest> {
    private val delegator: KSerializer<QueryTallyResultRequest> =
        QueryTallyResultRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTallyResultRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTallyResultRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTallyResultRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTallyResultRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTallyResultResponse.KotlinxSerializer::class)
@SerialName(value = QueryTallyResultResponse.TYPE_URL)
public data class QueryTallyResultResponse(
  @ProtobufIndex(index = 1)
  public val tally: TallyResult,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.gov.v1beta1.QueryTallyResultResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTallyResultResponse> {
    private val delegator: KSerializer<QueryTallyResultResponse> =
        QueryTallyResultResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTallyResultResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTallyResultResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTallyResultResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTallyResultResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
