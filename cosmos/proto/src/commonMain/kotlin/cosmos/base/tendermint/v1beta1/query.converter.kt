// Transform from cosmos/base/tendermint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.tendermint.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object GetValidatorSetByHeightRequestConverter :
    ProtobufConverter<GetValidatorSetByHeightRequest>

public fun GetValidatorSetByHeightRequest.toAny(): Any =
    Any(GetValidatorSetByHeightRequest.TYPE_URL, with(GetValidatorSetByHeightRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetValidatorSetByHeightRequest>):
    GetValidatorSetByHeightRequest {
  if (typeUrl != GetValidatorSetByHeightRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetValidatorSetByHeightResponseConverter :
    ProtobufConverter<GetValidatorSetByHeightResponse>

public fun GetValidatorSetByHeightResponse.toAny(): Any =
    Any(GetValidatorSetByHeightResponse.TYPE_URL, with(GetValidatorSetByHeightResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetValidatorSetByHeightResponse>):
    GetValidatorSetByHeightResponse {
  if (typeUrl != GetValidatorSetByHeightResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetLatestValidatorSetRequestConverter :
    ProtobufConverter<GetLatestValidatorSetRequest>

public fun GetLatestValidatorSetRequest.toAny(): Any = Any(GetLatestValidatorSetRequest.TYPE_URL,
    with(GetLatestValidatorSetRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetLatestValidatorSetRequest>):
    GetLatestValidatorSetRequest {
  if (typeUrl != GetLatestValidatorSetRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetLatestValidatorSetResponseConverter :
    ProtobufConverter<GetLatestValidatorSetResponse>

public fun GetLatestValidatorSetResponse.toAny(): Any = Any(GetLatestValidatorSetResponse.TYPE_URL,
    with(GetLatestValidatorSetResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetLatestValidatorSetResponse>):
    GetLatestValidatorSetResponse {
  if (typeUrl != GetLatestValidatorSetResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorConverter : ProtobufConverter<Validator>

public fun Validator.toAny(): Any = Any(Validator.TYPE_URL, with(ValidatorConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<Validator>): Validator {
  if (typeUrl != Validator.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetBlockByHeightRequestConverter : ProtobufConverter<GetBlockByHeightRequest>

public fun GetBlockByHeightRequest.toAny(): Any = Any(GetBlockByHeightRequest.TYPE_URL,
    with(GetBlockByHeightRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetBlockByHeightRequest>):
    GetBlockByHeightRequest {
  if (typeUrl != GetBlockByHeightRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetBlockByHeightResponseConverter : ProtobufConverter<GetBlockByHeightResponse>

public fun GetBlockByHeightResponse.toAny(): Any = Any(GetBlockByHeightResponse.TYPE_URL,
    with(GetBlockByHeightResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetBlockByHeightResponse>):
    GetBlockByHeightResponse {
  if (typeUrl != GetBlockByHeightResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetLatestBlockRequestConverter : ProtobufConverter<GetLatestBlockRequest>

public fun GetLatestBlockRequest.toAny(): Any = Any(GetLatestBlockRequest.TYPE_URL,
    with(GetLatestBlockRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetLatestBlockRequest>): GetLatestBlockRequest {
  if (typeUrl != GetLatestBlockRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetLatestBlockResponseConverter : ProtobufConverter<GetLatestBlockResponse>

public fun GetLatestBlockResponse.toAny(): Any = Any(GetLatestBlockResponse.TYPE_URL,
    with(GetLatestBlockResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetLatestBlockResponse>): GetLatestBlockResponse {
  if (typeUrl != GetLatestBlockResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetSyncingRequestConverter : ProtobufConverter<GetSyncingRequest>

public fun GetSyncingRequest.toAny(): Any = Any(GetSyncingRequest.TYPE_URL,
    with(GetSyncingRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetSyncingRequest>): GetSyncingRequest {
  if (typeUrl != GetSyncingRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetSyncingResponseConverter : ProtobufConverter<GetSyncingResponse>

public fun GetSyncingResponse.toAny(): Any = Any(GetSyncingResponse.TYPE_URL,
    with(GetSyncingResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetSyncingResponse>): GetSyncingResponse {
  if (typeUrl != GetSyncingResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetNodeInfoRequestConverter : ProtobufConverter<GetNodeInfoRequest>

public fun GetNodeInfoRequest.toAny(): Any = Any(GetNodeInfoRequest.TYPE_URL,
    with(GetNodeInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetNodeInfoRequest>): GetNodeInfoRequest {
  if (typeUrl != GetNodeInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetNodeInfoResponseConverter : ProtobufConverter<GetNodeInfoResponse>

public fun GetNodeInfoResponse.toAny(): Any = Any(GetNodeInfoResponse.TYPE_URL,
    with(GetNodeInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetNodeInfoResponse>): GetNodeInfoResponse {
  if (typeUrl != GetNodeInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VersionInfoConverter : ProtobufConverter<VersionInfo>

public fun VersionInfo.toAny(): Any = Any(VersionInfo.TYPE_URL, with(VersionInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<VersionInfo>): VersionInfo {
  if (typeUrl != VersionInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ModuleConverter : ProtobufConverter<Module>

public fun Module.toAny(): Any = Any(Module.TYPE_URL, with(ModuleConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Module>): Module {
  if (typeUrl != Module.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ABCIQueryRequestConverter : ProtobufConverter<ABCIQueryRequest>

public fun ABCIQueryRequest.toAny(): Any = Any(ABCIQueryRequest.TYPE_URL,
    with(ABCIQueryRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ABCIQueryRequest>): ABCIQueryRequest {
  if (typeUrl != ABCIQueryRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ABCIQueryResponseConverter : ProtobufConverter<ABCIQueryResponse>

public fun ABCIQueryResponse.toAny(): Any = Any(ABCIQueryResponse.TYPE_URL,
    with(ABCIQueryResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ABCIQueryResponse>): ABCIQueryResponse {
  if (typeUrl != ABCIQueryResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProofOpConverter : ProtobufConverter<ProofOp>

public fun ProofOp.toAny(): Any = Any(ProofOp.TYPE_URL, with(ProofOpConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ProofOp>): ProofOp {
  if (typeUrl != ProofOp.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProofOpsConverter : ProtobufConverter<ProofOps>

public fun ProofOps.toAny(): Any = Any(ProofOps.TYPE_URL, with(ProofOpsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ProofOps>): ProofOps {
  if (typeUrl != ProofOps.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
