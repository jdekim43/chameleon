// Transform from cosmos/group/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

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

@Serializable(with = QueryGroupInfoRequest.KotlinxSerializer::class)
@SerialName(value = QueryGroupInfoRequest.TYPE_URL)
public data class QueryGroupInfoRequest(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupInfoRequest> {
    private val delegator: KSerializer<QueryGroupInfoRequest> = QueryGroupInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupInfoRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupInfoResponse.KotlinxSerializer::class)
@SerialName(value = QueryGroupInfoResponse.TYPE_URL)
public data class QueryGroupInfoResponse(
  @ProtobufIndex(index = 1)
  public val info: GroupInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupInfoResponse> {
    private val delegator: KSerializer<QueryGroupInfoResponse> = QueryGroupInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupInfoResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPolicyInfoRequest.KotlinxSerializer::class)
@SerialName(value = QueryGroupPolicyInfoRequest.TYPE_URL)
public data class QueryGroupPolicyInfoRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupPolicyInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupPolicyInfoRequest> {
    private val delegator: KSerializer<QueryGroupPolicyInfoRequest> =
        QueryGroupPolicyInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPolicyInfoRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupPolicyInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPolicyInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPolicyInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPolicyInfoResponse.KotlinxSerializer::class)
@SerialName(value = QueryGroupPolicyInfoResponse.TYPE_URL)
public data class QueryGroupPolicyInfoResponse(
  @ProtobufIndex(index = 1)
  public val info: GroupPolicyInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupPolicyInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupPolicyInfoResponse> {
    private val delegator: KSerializer<QueryGroupPolicyInfoResponse> =
        QueryGroupPolicyInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPolicyInfoResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupPolicyInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPolicyInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPolicyInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupMembersRequest.KotlinxSerializer::class)
@SerialName(value = QueryGroupMembersRequest.TYPE_URL)
public data class QueryGroupMembersRequest(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupMembersRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupMembersRequest> {
    private val delegator: KSerializer<QueryGroupMembersRequest> =
        QueryGroupMembersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupMembersRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupMembersRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupMembersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupMembersRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupMembersResponse.KotlinxSerializer::class)
@SerialName(value = QueryGroupMembersResponse.TYPE_URL)
public data class QueryGroupMembersResponse(
  @ProtobufIndex(index = 1)
  public val members: List<GroupMember>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupMembersResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupMembersResponse> {
    private val delegator: KSerializer<QueryGroupMembersResponse> =
        QueryGroupMembersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupMembersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupMembersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupMembersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupMembersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupsByAdminRequest.KotlinxSerializer::class)
@SerialName(value = QueryGroupsByAdminRequest.TYPE_URL)
public data class QueryGroupsByAdminRequest(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupsByAdminRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupsByAdminRequest> {
    private val delegator: KSerializer<QueryGroupsByAdminRequest> =
        QueryGroupsByAdminRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsByAdminRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupsByAdminRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsByAdminRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsByAdminRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupsByAdminResponse.KotlinxSerializer::class)
@SerialName(value = QueryGroupsByAdminResponse.TYPE_URL)
public data class QueryGroupsByAdminResponse(
  @ProtobufIndex(index = 1)
  public val groups: List<GroupInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupsByAdminResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupsByAdminResponse> {
    private val delegator: KSerializer<QueryGroupsByAdminResponse> =
        QueryGroupsByAdminResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsByAdminResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupsByAdminResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsByAdminResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsByAdminResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPoliciesByGroupRequest.KotlinxSerializer::class)
@SerialName(value = QueryGroupPoliciesByGroupRequest.TYPE_URL)
public data class QueryGroupPoliciesByGroupRequest(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupPoliciesByGroupRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupPoliciesByGroupRequest> {
    private val delegator: KSerializer<QueryGroupPoliciesByGroupRequest> =
        QueryGroupPoliciesByGroupRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPoliciesByGroupRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupPoliciesByGroupRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPoliciesByGroupRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPoliciesByGroupRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPoliciesByGroupResponse.KotlinxSerializer::class)
@SerialName(value = QueryGroupPoliciesByGroupResponse.TYPE_URL)
public data class QueryGroupPoliciesByGroupResponse(
  @ProtobufIndex(index = 1)
  public val groupPolicies: List<GroupPolicyInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupPoliciesByGroupResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupPoliciesByGroupResponse> {
    private val delegator: KSerializer<QueryGroupPoliciesByGroupResponse> =
        QueryGroupPoliciesByGroupResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPoliciesByGroupResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupPoliciesByGroupResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPoliciesByGroupResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPoliciesByGroupResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPoliciesByAdminRequest.KotlinxSerializer::class)
@SerialName(value = QueryGroupPoliciesByAdminRequest.TYPE_URL)
public data class QueryGroupPoliciesByAdminRequest(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupPoliciesByAdminRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupPoliciesByAdminRequest> {
    private val delegator: KSerializer<QueryGroupPoliciesByAdminRequest> =
        QueryGroupPoliciesByAdminRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPoliciesByAdminRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupPoliciesByAdminRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPoliciesByAdminRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPoliciesByAdminRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPoliciesByAdminResponse.KotlinxSerializer::class)
@SerialName(value = QueryGroupPoliciesByAdminResponse.TYPE_URL)
public data class QueryGroupPoliciesByAdminResponse(
  @ProtobufIndex(index = 1)
  public val groupPolicies: List<GroupPolicyInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupPoliciesByAdminResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupPoliciesByAdminResponse> {
    private val delegator: KSerializer<QueryGroupPoliciesByAdminResponse> =
        QueryGroupPoliciesByAdminResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPoliciesByAdminResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupPoliciesByAdminResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPoliciesByAdminResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPoliciesByAdminResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalRequest.KotlinxSerializer::class)
@SerialName(value = QueryProposalRequest.TYPE_URL)
public data class QueryProposalRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryProposalRequest"
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
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryProposalResponse"
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

@Serializable(with = QueryProposalsByGroupPolicyRequest.KotlinxSerializer::class)
@SerialName(value = QueryProposalsByGroupPolicyRequest.TYPE_URL)
public data class QueryProposalsByGroupPolicyRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryProposalsByGroupPolicyRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryProposalsByGroupPolicyRequest> {
    private val delegator: KSerializer<QueryProposalsByGroupPolicyRequest> =
        QueryProposalsByGroupPolicyRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalsByGroupPolicyRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryProposalsByGroupPolicyRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalsByGroupPolicyRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalsByGroupPolicyRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalsByGroupPolicyResponse.KotlinxSerializer::class)
@SerialName(value = QueryProposalsByGroupPolicyResponse.TYPE_URL)
public data class QueryProposalsByGroupPolicyResponse(
  @ProtobufIndex(index = 1)
  public val proposals: List<Proposal>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryProposalsByGroupPolicyResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryProposalsByGroupPolicyResponse> {
    private val delegator: KSerializer<QueryProposalsByGroupPolicyResponse> =
        QueryProposalsByGroupPolicyResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalsByGroupPolicyResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryProposalsByGroupPolicyResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalsByGroupPolicyResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalsByGroupPolicyResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVoteByProposalVoterRequest.KotlinxSerializer::class)
@SerialName(value = QueryVoteByProposalVoterRequest.TYPE_URL)
public data class QueryVoteByProposalVoterRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val voter: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryVoteByProposalVoterRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryVoteByProposalVoterRequest> {
    private val delegator: KSerializer<QueryVoteByProposalVoterRequest> =
        QueryVoteByProposalVoterRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVoteByProposalVoterRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVoteByProposalVoterRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVoteByProposalVoterRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVoteByProposalVoterRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVoteByProposalVoterResponse.KotlinxSerializer::class)
@SerialName(value = QueryVoteByProposalVoterResponse.TYPE_URL)
public data class QueryVoteByProposalVoterResponse(
  @ProtobufIndex(index = 1)
  public val vote: Vote,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryVoteByProposalVoterResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryVoteByProposalVoterResponse> {
    private val delegator: KSerializer<QueryVoteByProposalVoterResponse> =
        QueryVoteByProposalVoterResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVoteByProposalVoterResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVoteByProposalVoterResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVoteByProposalVoterResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVoteByProposalVoterResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesByProposalRequest.KotlinxSerializer::class)
@SerialName(value = QueryVotesByProposalRequest.TYPE_URL)
public data class QueryVotesByProposalRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryVotesByProposalRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryVotesByProposalRequest> {
    private val delegator: KSerializer<QueryVotesByProposalRequest> =
        QueryVotesByProposalRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesByProposalRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVotesByProposalRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesByProposalRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesByProposalRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesByProposalResponse.KotlinxSerializer::class)
@SerialName(value = QueryVotesByProposalResponse.TYPE_URL)
public data class QueryVotesByProposalResponse(
  @ProtobufIndex(index = 1)
  public val votes: List<Vote>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryVotesByProposalResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryVotesByProposalResponse> {
    private val delegator: KSerializer<QueryVotesByProposalResponse> =
        QueryVotesByProposalResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesByProposalResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVotesByProposalResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesByProposalResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesByProposalResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesByVoterRequest.KotlinxSerializer::class)
@SerialName(value = QueryVotesByVoterRequest.TYPE_URL)
public data class QueryVotesByVoterRequest(
  @ProtobufIndex(index = 1)
  public val voter: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryVotesByVoterRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryVotesByVoterRequest> {
    private val delegator: KSerializer<QueryVotesByVoterRequest> =
        QueryVotesByVoterRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesByVoterRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVotesByVoterRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesByVoterRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesByVoterRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesByVoterResponse.KotlinxSerializer::class)
@SerialName(value = QueryVotesByVoterResponse.TYPE_URL)
public data class QueryVotesByVoterResponse(
  @ProtobufIndex(index = 1)
  public val votes: List<Vote>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryVotesByVoterResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryVotesByVoterResponse> {
    private val delegator: KSerializer<QueryVotesByVoterResponse> =
        QueryVotesByVoterResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesByVoterResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVotesByVoterResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesByVoterResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesByVoterResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupsByMemberRequest.KotlinxSerializer::class)
@SerialName(value = QueryGroupsByMemberRequest.TYPE_URL)
public data class QueryGroupsByMemberRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupsByMemberRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupsByMemberRequest> {
    private val delegator: KSerializer<QueryGroupsByMemberRequest> =
        QueryGroupsByMemberRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsByMemberRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupsByMemberRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsByMemberRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsByMemberRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupsByMemberResponse.KotlinxSerializer::class)
@SerialName(value = QueryGroupsByMemberResponse.TYPE_URL)
public data class QueryGroupsByMemberResponse(
  @ProtobufIndex(index = 1)
  public val groups: List<GroupInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupsByMemberResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupsByMemberResponse> {
    private val delegator: KSerializer<QueryGroupsByMemberResponse> =
        QueryGroupsByMemberResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsByMemberResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupsByMemberResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsByMemberResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsByMemberResponseConverter.deserialize(decoder.decodeByteArray())
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
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryTallyResultRequest"
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
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryTallyResultResponse"
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

@Serializable(with = QueryGroupsRequest.KotlinxSerializer::class)
@SerialName(value = QueryGroupsRequest.TYPE_URL)
public data class QueryGroupsRequest(
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupsRequest> {
    private val delegator: KSerializer<QueryGroupsRequest> = QueryGroupsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupsResponse.KotlinxSerializer::class)
@SerialName(value = QueryGroupsResponse.TYPE_URL)
public data class QueryGroupsResponse(
  @ProtobufIndex(index = 1)
  public val groups: List<GroupInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.group.v1.QueryGroupsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGroupsResponse> {
    private val delegator: KSerializer<QueryGroupsResponse> = QueryGroupsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGroupsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
