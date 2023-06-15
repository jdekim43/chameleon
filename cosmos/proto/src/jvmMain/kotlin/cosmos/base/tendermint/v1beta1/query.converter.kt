// Transform from cosmos/base/tendermint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.tendermint.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GetValidatorSetByHeightRequestConverter :
    ProtobufConverter<GetValidatorSetByHeightRequest> by GetValidatorSetByHeightRequestJvmConverter

public actual object GetValidatorSetByHeightResponseConverter :
    ProtobufConverter<GetValidatorSetByHeightResponse> by
    GetValidatorSetByHeightResponseJvmConverter

public actual object GetLatestValidatorSetRequestConverter :
    ProtobufConverter<GetLatestValidatorSetRequest> by GetLatestValidatorSetRequestJvmConverter

public actual object GetLatestValidatorSetResponseConverter :
    ProtobufConverter<GetLatestValidatorSetResponse> by GetLatestValidatorSetResponseJvmConverter

public actual object ValidatorConverter : ProtobufConverter<Validator> by ValidatorJvmConverter

public actual object GetBlockByHeightRequestConverter : ProtobufConverter<GetBlockByHeightRequest>
    by GetBlockByHeightRequestJvmConverter

public actual object GetBlockByHeightResponseConverter : ProtobufConverter<GetBlockByHeightResponse>
    by GetBlockByHeightResponseJvmConverter

public actual object GetLatestBlockRequestConverter : ProtobufConverter<GetLatestBlockRequest> by
    GetLatestBlockRequestJvmConverter

public actual object GetLatestBlockResponseConverter : ProtobufConverter<GetLatestBlockResponse> by
    GetLatestBlockResponseJvmConverter

public actual object GetSyncingRequestConverter : ProtobufConverter<GetSyncingRequest> by
    GetSyncingRequestJvmConverter

public actual object GetSyncingResponseConverter : ProtobufConverter<GetSyncingResponse> by
    GetSyncingResponseJvmConverter

public actual object GetNodeInfoRequestConverter : ProtobufConverter<GetNodeInfoRequest> by
    GetNodeInfoRequestJvmConverter

public actual object GetNodeInfoResponseConverter : ProtobufConverter<GetNodeInfoResponse> by
    GetNodeInfoResponseJvmConverter

public actual object VersionInfoConverter : ProtobufConverter<VersionInfo> by
    VersionInfoJvmConverter

public actual object ModuleConverter : ProtobufConverter<Module> by ModuleJvmConverter

public actual object ABCIQueryRequestConverter : ProtobufConverter<ABCIQueryRequest> by
    ABCIQueryRequestJvmConverter

public actual object ABCIQueryResponseConverter : ProtobufConverter<ABCIQueryResponse> by
    ABCIQueryResponseJvmConverter

public actual object ProofOpConverter : ProtobufConverter<ProofOp> by ProofOpJvmConverter

public actual object ProofOpsConverter : ProtobufConverter<ProofOps> by ProofOpsJvmConverter
