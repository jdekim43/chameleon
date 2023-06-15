// Transform from cosmos/base/tendermint/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.tendermint.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import google.protobuf.Any
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Long
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
import tendermint.p2p.DefaultNodeInfo
import tendermint.types.BlockID

@Serializable(with = GetValidatorSetByHeightRequest.KotlinxSerializer::class)
@SerialName(value = GetValidatorSetByHeightRequest.TYPE_URL)
public data class GetValidatorSetByHeightRequest(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequest"
  }

  public object KotlinxSerializer : KSerializer<GetValidatorSetByHeightRequest> {
    private val delegator: KSerializer<GetValidatorSetByHeightRequest> =
        GetValidatorSetByHeightRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetValidatorSetByHeightRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetValidatorSetByHeightRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetValidatorSetByHeightRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetValidatorSetByHeightRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetValidatorSetByHeightResponse.KotlinxSerializer::class)
@SerialName(value = GetValidatorSetByHeightResponse.TYPE_URL)
public data class GetValidatorSetByHeightResponse(
  @ProtobufIndex(index = 1)
  public val blockHeight: Long,
  @ProtobufIndex(index = 2)
  public val validators: List<Validator>,
  @ProtobufIndex(index = 3)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse"
  }

  public object KotlinxSerializer : KSerializer<GetValidatorSetByHeightResponse> {
    private val delegator: KSerializer<GetValidatorSetByHeightResponse> =
        GetValidatorSetByHeightResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetValidatorSetByHeightResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetValidatorSetByHeightResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetValidatorSetByHeightResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetValidatorSetByHeightResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetLatestValidatorSetRequest.KotlinxSerializer::class)
@SerialName(value = GetLatestValidatorSetRequest.TYPE_URL)
public data class GetLatestValidatorSetRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequest"
  }

  public object KotlinxSerializer : KSerializer<GetLatestValidatorSetRequest> {
    private val delegator: KSerializer<GetLatestValidatorSetRequest> =
        GetLatestValidatorSetRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetLatestValidatorSetRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetLatestValidatorSetRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetLatestValidatorSetRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetLatestValidatorSetRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetLatestValidatorSetResponse.KotlinxSerializer::class)
@SerialName(value = GetLatestValidatorSetResponse.TYPE_URL)
public data class GetLatestValidatorSetResponse(
  @ProtobufIndex(index = 1)
  public val blockHeight: Long,
  @ProtobufIndex(index = 2)
  public val validators: List<Validator>,
  @ProtobufIndex(index = 3)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponse"
  }

  public object KotlinxSerializer : KSerializer<GetLatestValidatorSetResponse> {
    private val delegator: KSerializer<GetLatestValidatorSetResponse> =
        GetLatestValidatorSetResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetLatestValidatorSetResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetLatestValidatorSetResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetLatestValidatorSetResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetLatestValidatorSetResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Validator.KotlinxSerializer::class)
@SerialName(value = Validator.TYPE_URL)
public data class Validator(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pubKey: Any,
  @ProtobufIndex(index = 3)
  public val votingPower: Long,
  @ProtobufIndex(index = 4)
  public val proposerPriority: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.Validator"
  }

  public object KotlinxSerializer : KSerializer<Validator> {
    private val delegator: KSerializer<Validator> = Validator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Validator): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Validator {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetBlockByHeightRequest.KotlinxSerializer::class)
@SerialName(value = GetBlockByHeightRequest.TYPE_URL)
public data class GetBlockByHeightRequest(
  @ProtobufIndex(index = 1)
  public val height: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.GetBlockByHeightRequest"
  }

  public object KotlinxSerializer : KSerializer<GetBlockByHeightRequest> {
    private val delegator: KSerializer<GetBlockByHeightRequest> =
        GetBlockByHeightRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetBlockByHeightRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetBlockByHeightRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetBlockByHeightRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetBlockByHeightRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetBlockByHeightResponse.KotlinxSerializer::class)
@SerialName(value = GetBlockByHeightResponse.TYPE_URL)
public data class GetBlockByHeightResponse(
  @ProtobufIndex(index = 1)
  public val blockId: BlockID,
  @ProtobufIndex(index = 2)
  public val block: tendermint.types.Block,
  @ProtobufIndex(index = 3)
  public val sdkBlock: Block,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.GetBlockByHeightResponse"
  }

  public object KotlinxSerializer : KSerializer<GetBlockByHeightResponse> {
    private val delegator: KSerializer<GetBlockByHeightResponse> =
        GetBlockByHeightResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetBlockByHeightResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetBlockByHeightResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetBlockByHeightResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetBlockByHeightResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetLatestBlockRequest.KotlinxSerializer::class)
@SerialName(value = GetLatestBlockRequest.TYPE_URL)
public class GetLatestBlockRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.GetLatestBlockRequest"
  }

  public object KotlinxSerializer : KSerializer<GetLatestBlockRequest> {
    private val delegator: KSerializer<GetLatestBlockRequest> = GetLatestBlockRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetLatestBlockRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetLatestBlockRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetLatestBlockRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetLatestBlockRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetLatestBlockResponse.KotlinxSerializer::class)
@SerialName(value = GetLatestBlockResponse.TYPE_URL)
public data class GetLatestBlockResponse(
  @ProtobufIndex(index = 1)
  public val blockId: BlockID,
  @ProtobufIndex(index = 2)
  public val block: tendermint.types.Block,
  @ProtobufIndex(index = 3)
  public val sdkBlock: Block,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.GetLatestBlockResponse"
  }

  public object KotlinxSerializer : KSerializer<GetLatestBlockResponse> {
    private val delegator: KSerializer<GetLatestBlockResponse> = GetLatestBlockResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetLatestBlockResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetLatestBlockResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetLatestBlockResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetLatestBlockResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetSyncingRequest.KotlinxSerializer::class)
@SerialName(value = GetSyncingRequest.TYPE_URL)
public class GetSyncingRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.GetSyncingRequest"
  }

  public object KotlinxSerializer : KSerializer<GetSyncingRequest> {
    private val delegator: KSerializer<GetSyncingRequest> = GetSyncingRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetSyncingRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetSyncingRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetSyncingRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetSyncingRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetSyncingResponse.KotlinxSerializer::class)
@SerialName(value = GetSyncingResponse.TYPE_URL)
public data class GetSyncingResponse(
  @ProtobufIndex(index = 1)
  public val syncing: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.GetSyncingResponse"
  }

  public object KotlinxSerializer : KSerializer<GetSyncingResponse> {
    private val delegator: KSerializer<GetSyncingResponse> = GetSyncingResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetSyncingResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetSyncingResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetSyncingResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetSyncingResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetNodeInfoRequest.KotlinxSerializer::class)
@SerialName(value = GetNodeInfoRequest.TYPE_URL)
public class GetNodeInfoRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.GetNodeInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<GetNodeInfoRequest> {
    private val delegator: KSerializer<GetNodeInfoRequest> = GetNodeInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetNodeInfoRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetNodeInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetNodeInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetNodeInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetNodeInfoResponse.KotlinxSerializer::class)
@SerialName(value = GetNodeInfoResponse.TYPE_URL)
public data class GetNodeInfoResponse(
  @ProtobufIndex(index = 1)
  public val defaultNodeInfo: DefaultNodeInfo,
  @ProtobufIndex(index = 2)
  public val applicationVersion: VersionInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.GetNodeInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<GetNodeInfoResponse> {
    private val delegator: KSerializer<GetNodeInfoResponse> = GetNodeInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetNodeInfoResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetNodeInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetNodeInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetNodeInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = VersionInfo.KotlinxSerializer::class)
@SerialName(value = VersionInfo.TYPE_URL)
public data class VersionInfo(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val appName: String,
  @ProtobufIndex(index = 3)
  public val version: String,
  @ProtobufIndex(index = 4)
  public val gitCommit: String,
  @ProtobufIndex(index = 5)
  public val buildTags: String,
  @ProtobufIndex(index = 6)
  public val goVersion: String,
  @ProtobufIndex(index = 7)
  public val buildDeps: List<Module>,
  @ProtobufIndex(index = 8)
  public val cosmosSdkVersion: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.VersionInfo"
  }

  public object KotlinxSerializer : KSerializer<VersionInfo> {
    private val delegator: KSerializer<VersionInfo> = VersionInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: VersionInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VersionInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): VersionInfo {
      if (decoder is ProtobufMapperDecoder) {
        return VersionInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Module.KotlinxSerializer::class)
@SerialName(value = Module.TYPE_URL)
public data class Module(
  @ProtobufIndex(index = 1)
  public val path: String,
  @ProtobufIndex(index = 2)
  public val version: String,
  @ProtobufIndex(index = 3)
  public val sum: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.Module"
  }

  public object KotlinxSerializer : KSerializer<Module> {
    private val delegator: KSerializer<Module> = Module.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Module): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModuleConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Module {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ABCIQueryRequest.KotlinxSerializer::class)
@SerialName(value = ABCIQueryRequest.TYPE_URL)
public data class ABCIQueryRequest(
  @ProtobufIndex(index = 1)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 2)
  public val path: String,
  @ProtobufIndex(index = 3)
  public val height: Long,
  @ProtobufIndex(index = 4)
  public val prove: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.ABCIQueryRequest"
  }

  public object KotlinxSerializer : KSerializer<ABCIQueryRequest> {
    private val delegator: KSerializer<ABCIQueryRequest> = ABCIQueryRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ABCIQueryRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ABCIQueryRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ABCIQueryRequest {
      if (decoder is ProtobufMapperDecoder) {
        return ABCIQueryRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ABCIQueryResponse.KotlinxSerializer::class)
@SerialName(value = ABCIQueryResponse.TYPE_URL)
public data class ABCIQueryResponse(
  @ProtobufIndex(index = 1)
  public val code: UInt,
  @ProtobufIndex(index = 3)
  public val log: String,
  @ProtobufIndex(index = 4)
  public val info: String,
  @ProtobufIndex(index = 5)
  public val index: Long,
  @ProtobufIndex(index = 6)
  public val key: ByteArray,
  @ProtobufIndex(index = 7)
  public val `value`: ByteArray,
  @ProtobufIndex(index = 8)
  public val proofOps: ProofOps,
  @ProtobufIndex(index = 9)
  public val height: Long,
  @ProtobufIndex(index = 10)
  public val codespace: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.ABCIQueryResponse"
  }

  public object KotlinxSerializer : KSerializer<ABCIQueryResponse> {
    private val delegator: KSerializer<ABCIQueryResponse> = ABCIQueryResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ABCIQueryResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ABCIQueryResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ABCIQueryResponse {
      if (decoder is ProtobufMapperDecoder) {
        return ABCIQueryResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProofOp.KotlinxSerializer::class)
@SerialName(value = ProofOp.TYPE_URL)
public data class ProofOp(
  @ProtobufIndex(index = 1)
  public val type: String,
  @ProtobufIndex(index = 2)
  public val key: ByteArray,
  @ProtobufIndex(index = 3)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.ProofOp"
  }

  public object KotlinxSerializer : KSerializer<ProofOp> {
    private val delegator: KSerializer<ProofOp> = ProofOp.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProofOp): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProofOpConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProofOp {
      if (decoder is ProtobufMapperDecoder) {
        return ProofOpConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProofOps.KotlinxSerializer::class)
@SerialName(value = ProofOps.TYPE_URL)
public data class ProofOps(
  @ProtobufIndex(index = 1)
  public val ops: List<ProofOp>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.tendermint.v1beta1.ProofOps"
  }

  public object KotlinxSerializer : KSerializer<ProofOps> {
    private val delegator: KSerializer<ProofOps> = ProofOps.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProofOps): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProofOpsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProofOps {
      if (decoder is ProtobufMapperDecoder) {
        return ProofOpsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
