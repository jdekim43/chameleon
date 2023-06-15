// Transform from cosmos/base/tendermint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.tendermint.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType
import tendermint.p2p.DefaultNodeInfoJvmConverter
import tendermint.types.BlockIDJvmConverter

public object GetValidatorSetByHeightRequestJvmConverter :
    ProtobufTypeMapper<GetValidatorSetByHeightRequest, Query.GetValidatorSetByHeightRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetValidatorSetByHeightRequest.getDescriptor()

  public override val parser: Parser<Query.GetValidatorSetByHeightRequest> =
      Query.GetValidatorSetByHeightRequest.parser()

  public override fun convert(obj: Query.GetValidatorSetByHeightRequest):
      GetValidatorSetByHeightRequest = GetValidatorSetByHeightRequest(
  	height = obj.getHeight(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: GetValidatorSetByHeightRequest):
      Query.GetValidatorSetByHeightRequest {
    val builder = Query.GetValidatorSetByHeightRequest.newBuilder()
    builder.setHeight(obj.height)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object GetValidatorSetByHeightResponseJvmConverter :
    ProtobufTypeMapper<GetValidatorSetByHeightResponse, Query.GetValidatorSetByHeightResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetValidatorSetByHeightResponse.getDescriptor()

  public override val parser: Parser<Query.GetValidatorSetByHeightResponse> =
      Query.GetValidatorSetByHeightResponse.parser()

  public override fun convert(obj: Query.GetValidatorSetByHeightResponse):
      GetValidatorSetByHeightResponse = GetValidatorSetByHeightResponse(
  	blockHeight = obj.getBlockHeight(),
  	validators = obj.getValidatorsList().map { ValidatorJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: GetValidatorSetByHeightResponse):
      Query.GetValidatorSetByHeightResponse {
    val builder = Query.GetValidatorSetByHeightResponse.newBuilder()
    builder.setBlockHeight(obj.blockHeight)
    builder.addAllValidators(obj.validators.map { ValidatorJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object GetLatestValidatorSetRequestJvmConverter :
    ProtobufTypeMapper<GetLatestValidatorSetRequest, Query.GetLatestValidatorSetRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetLatestValidatorSetRequest.getDescriptor()

  public override val parser: Parser<Query.GetLatestValidatorSetRequest> =
      Query.GetLatestValidatorSetRequest.parser()

  public override fun convert(obj: Query.GetLatestValidatorSetRequest): GetLatestValidatorSetRequest
      = GetLatestValidatorSetRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: GetLatestValidatorSetRequest):
      Query.GetLatestValidatorSetRequest {
    val builder = Query.GetLatestValidatorSetRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object GetLatestValidatorSetResponseJvmConverter :
    ProtobufTypeMapper<GetLatestValidatorSetResponse, Query.GetLatestValidatorSetResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetLatestValidatorSetResponse.getDescriptor()

  public override val parser: Parser<Query.GetLatestValidatorSetResponse> =
      Query.GetLatestValidatorSetResponse.parser()

  public override fun convert(obj: Query.GetLatestValidatorSetResponse):
      GetLatestValidatorSetResponse = GetLatestValidatorSetResponse(
  	blockHeight = obj.getBlockHeight(),
  	validators = obj.getValidatorsList().map { ValidatorJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: GetLatestValidatorSetResponse):
      Query.GetLatestValidatorSetResponse {
    val builder = Query.GetLatestValidatorSetResponse.newBuilder()
    builder.setBlockHeight(obj.blockHeight)
    builder.addAllValidators(obj.validators.map { ValidatorJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object ValidatorJvmConverter : ProtobufTypeMapper<Validator, Query.Validator> {
  public override val descriptor: Descriptors.Descriptor = Query.Validator.getDescriptor()

  public override val parser: Parser<Query.Validator> = Query.Validator.parser()

  public override fun convert(obj: Query.Validator): Validator = Validator(
  	address = obj.getAddress(),
  	pubKey = AnyJvmConverter.convert(obj.getPubKey()),
  	votingPower = obj.getVotingPower(),
  	proposerPriority = obj.getProposerPriority(),
  )

  public override fun convert(obj: Validator): Query.Validator {
    val builder = Query.Validator.newBuilder()
    builder.setAddress(obj.address)
    builder.setPubKey(AnyJvmConverter.convert(obj.pubKey))
    builder.setVotingPower(obj.votingPower)
    builder.setProposerPriority(obj.proposerPriority)
    return builder.build()
  }
}

public object GetBlockByHeightRequestJvmConverter :
    ProtobufTypeMapper<GetBlockByHeightRequest, Query.GetBlockByHeightRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetBlockByHeightRequest.getDescriptor()

  public override val parser: Parser<Query.GetBlockByHeightRequest> =
      Query.GetBlockByHeightRequest.parser()

  public override fun convert(obj: Query.GetBlockByHeightRequest): GetBlockByHeightRequest =
      GetBlockByHeightRequest(
  	height = obj.getHeight(),
  )

  public override fun convert(obj: GetBlockByHeightRequest): Query.GetBlockByHeightRequest {
    val builder = Query.GetBlockByHeightRequest.newBuilder()
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object GetBlockByHeightResponseJvmConverter :
    ProtobufTypeMapper<GetBlockByHeightResponse, Query.GetBlockByHeightResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetBlockByHeightResponse.getDescriptor()

  public override val parser: Parser<Query.GetBlockByHeightResponse> =
      Query.GetBlockByHeightResponse.parser()

  public override fun convert(obj: Query.GetBlockByHeightResponse): GetBlockByHeightResponse =
      GetBlockByHeightResponse(
  	blockId = BlockIDJvmConverter.convert(obj.getBlockId()),
  	block = tendermint.types.BlockJvmConverter.convert(obj.getBlock()),
  	sdkBlock = BlockJvmConverter.convert(obj.getSdkBlock()),
  )

  public override fun convert(obj: GetBlockByHeightResponse): Query.GetBlockByHeightResponse {
    val builder = Query.GetBlockByHeightResponse.newBuilder()
    builder.setBlockId(BlockIDJvmConverter.convert(obj.blockId))
    builder.setBlock(tendermint.types.BlockJvmConverter.convert(obj.block))
    builder.setSdkBlock(BlockJvmConverter.convert(obj.sdkBlock))
    return builder.build()
  }
}

public object GetLatestBlockRequestJvmConverter :
    ProtobufTypeMapper<GetLatestBlockRequest, Query.GetLatestBlockRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetLatestBlockRequest.getDescriptor()

  public override val parser: Parser<Query.GetLatestBlockRequest> =
      Query.GetLatestBlockRequest.parser()

  public override fun convert(obj: Query.GetLatestBlockRequest): GetLatestBlockRequest =
      GetLatestBlockRequest(
  )

  public override fun convert(obj: GetLatestBlockRequest): Query.GetLatestBlockRequest {
    val builder = Query.GetLatestBlockRequest.newBuilder()
    return builder.build()
  }
}

public object GetLatestBlockResponseJvmConverter :
    ProtobufTypeMapper<GetLatestBlockResponse, Query.GetLatestBlockResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetLatestBlockResponse.getDescriptor()

  public override val parser: Parser<Query.GetLatestBlockResponse> =
      Query.GetLatestBlockResponse.parser()

  public override fun convert(obj: Query.GetLatestBlockResponse): GetLatestBlockResponse =
      GetLatestBlockResponse(
  	blockId = BlockIDJvmConverter.convert(obj.getBlockId()),
  	block = tendermint.types.BlockJvmConverter.convert(obj.getBlock()),
  	sdkBlock = BlockJvmConverter.convert(obj.getSdkBlock()),
  )

  public override fun convert(obj: GetLatestBlockResponse): Query.GetLatestBlockResponse {
    val builder = Query.GetLatestBlockResponse.newBuilder()
    builder.setBlockId(BlockIDJvmConverter.convert(obj.blockId))
    builder.setBlock(tendermint.types.BlockJvmConverter.convert(obj.block))
    builder.setSdkBlock(BlockJvmConverter.convert(obj.sdkBlock))
    return builder.build()
  }
}

public object GetSyncingRequestJvmConverter :
    ProtobufTypeMapper<GetSyncingRequest, Query.GetSyncingRequest> {
  public override val descriptor: Descriptors.Descriptor = Query.GetSyncingRequest.getDescriptor()

  public override val parser: Parser<Query.GetSyncingRequest> = Query.GetSyncingRequest.parser()

  public override fun convert(obj: Query.GetSyncingRequest): GetSyncingRequest = GetSyncingRequest(
  )

  public override fun convert(obj: GetSyncingRequest): Query.GetSyncingRequest {
    val builder = Query.GetSyncingRequest.newBuilder()
    return builder.build()
  }
}

public object GetSyncingResponseJvmConverter :
    ProtobufTypeMapper<GetSyncingResponse, Query.GetSyncingResponse> {
  public override val descriptor: Descriptors.Descriptor = Query.GetSyncingResponse.getDescriptor()

  public override val parser: Parser<Query.GetSyncingResponse> = Query.GetSyncingResponse.parser()

  public override fun convert(obj: Query.GetSyncingResponse): GetSyncingResponse =
      GetSyncingResponse(
  	syncing = obj.getSyncing(),
  )

  public override fun convert(obj: GetSyncingResponse): Query.GetSyncingResponse {
    val builder = Query.GetSyncingResponse.newBuilder()
    builder.setSyncing(obj.syncing)
    return builder.build()
  }
}

public object GetNodeInfoRequestJvmConverter :
    ProtobufTypeMapper<GetNodeInfoRequest, Query.GetNodeInfoRequest> {
  public override val descriptor: Descriptors.Descriptor = Query.GetNodeInfoRequest.getDescriptor()

  public override val parser: Parser<Query.GetNodeInfoRequest> = Query.GetNodeInfoRequest.parser()

  public override fun convert(obj: Query.GetNodeInfoRequest): GetNodeInfoRequest =
      GetNodeInfoRequest(
  )

  public override fun convert(obj: GetNodeInfoRequest): Query.GetNodeInfoRequest {
    val builder = Query.GetNodeInfoRequest.newBuilder()
    return builder.build()
  }
}

public object GetNodeInfoResponseJvmConverter :
    ProtobufTypeMapper<GetNodeInfoResponse, Query.GetNodeInfoResponse> {
  public override val descriptor: Descriptors.Descriptor = Query.GetNodeInfoResponse.getDescriptor()

  public override val parser: Parser<Query.GetNodeInfoResponse> = Query.GetNodeInfoResponse.parser()

  public override fun convert(obj: Query.GetNodeInfoResponse): GetNodeInfoResponse =
      GetNodeInfoResponse(
  	defaultNodeInfo = DefaultNodeInfoJvmConverter.convert(obj.getDefaultNodeInfo()),
  	applicationVersion = VersionInfoJvmConverter.convert(obj.getApplicationVersion()),
  )

  public override fun convert(obj: GetNodeInfoResponse): Query.GetNodeInfoResponse {
    val builder = Query.GetNodeInfoResponse.newBuilder()
    builder.setDefaultNodeInfo(DefaultNodeInfoJvmConverter.convert(obj.defaultNodeInfo))
    builder.setApplicationVersion(VersionInfoJvmConverter.convert(obj.applicationVersion))
    return builder.build()
  }
}

public object VersionInfoJvmConverter : ProtobufTypeMapper<VersionInfo, Query.VersionInfo> {
  public override val descriptor: Descriptors.Descriptor = Query.VersionInfo.getDescriptor()

  public override val parser: Parser<Query.VersionInfo> = Query.VersionInfo.parser()

  public override fun convert(obj: Query.VersionInfo): VersionInfo = VersionInfo(
  	name = obj.getName(),
  	appName = obj.getAppName(),
  	version = obj.getVersion(),
  	gitCommit = obj.getGitCommit(),
  	buildTags = obj.getBuildTags(),
  	goVersion = obj.getGoVersion(),
  	buildDeps = obj.getBuildDepsList().map { ModuleJvmConverter.convert(it) },
  	cosmosSdkVersion = obj.getCosmosSdkVersion(),
  )

  public override fun convert(obj: VersionInfo): Query.VersionInfo {
    val builder = Query.VersionInfo.newBuilder()
    builder.setName(obj.name)
    builder.setAppName(obj.appName)
    builder.setVersion(obj.version)
    builder.setGitCommit(obj.gitCommit)
    builder.setBuildTags(obj.buildTags)
    builder.setGoVersion(obj.goVersion)
    builder.addAllBuildDeps(obj.buildDeps.map { ModuleJvmConverter.convert(it) })
    builder.setCosmosSdkVersion(obj.cosmosSdkVersion)
    return builder.build()
  }
}

public object ModuleJvmConverter : ProtobufTypeMapper<Module, Query.Module> {
  public override val descriptor: Descriptors.Descriptor = Query.Module.getDescriptor()

  public override val parser: Parser<Query.Module> = Query.Module.parser()

  public override fun convert(obj: Query.Module): Module = Module(
  	path = obj.getPath(),
  	version = obj.getVersion(),
  	sum = obj.getSum(),
  )

  public override fun convert(obj: Module): Query.Module {
    val builder = Query.Module.newBuilder()
    builder.setPath(obj.path)
    builder.setVersion(obj.version)
    builder.setSum(obj.sum)
    return builder.build()
  }
}

public object ABCIQueryRequestJvmConverter :
    ProtobufTypeMapper<ABCIQueryRequest, Query.ABCIQueryRequest> {
  public override val descriptor: Descriptors.Descriptor = Query.ABCIQueryRequest.getDescriptor()

  public override val parser: Parser<Query.ABCIQueryRequest> = Query.ABCIQueryRequest.parser()

  public override fun convert(obj: Query.ABCIQueryRequest): ABCIQueryRequest = ABCIQueryRequest(
  	`data` = obj.getData().toByteArray(),
  	path = obj.getPath(),
  	height = obj.getHeight(),
  	prove = obj.getProve(),
  )

  public override fun convert(obj: ABCIQueryRequest): Query.ABCIQueryRequest {
    val builder = Query.ABCIQueryRequest.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setPath(obj.path)
    builder.setHeight(obj.height)
    builder.setProve(obj.prove)
    return builder.build()
  }
}

public object ABCIQueryResponseJvmConverter :
    ProtobufTypeMapper<ABCIQueryResponse, Query.ABCIQueryResponse> {
  public override val descriptor: Descriptors.Descriptor = Query.ABCIQueryResponse.getDescriptor()

  public override val parser: Parser<Query.ABCIQueryResponse> = Query.ABCIQueryResponse.parser()

  public override fun convert(obj: Query.ABCIQueryResponse): ABCIQueryResponse = ABCIQueryResponse(
  	code = obj.getCode().asKotlinType,
  	log = obj.getLog(),
  	info = obj.getInfo(),
  	index = obj.getIndex(),
  	key = obj.getKey().toByteArray(),
  	`value` = obj.getValue().toByteArray(),
  	proofOps = ProofOpsJvmConverter.convert(obj.getProofOps()),
  	height = obj.getHeight(),
  	codespace = obj.getCodespace(),
  )

  public override fun convert(obj: ABCIQueryResponse): Query.ABCIQueryResponse {
    val builder = Query.ABCIQueryResponse.newBuilder()
    builder.setCode(obj.code.asJavaType)
    builder.setLog(obj.log)
    builder.setInfo(obj.info)
    builder.setIndex(obj.index)
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    builder.setProofOps(ProofOpsJvmConverter.convert(obj.proofOps))
    builder.setHeight(obj.height)
    builder.setCodespace(obj.codespace)
    return builder.build()
  }
}

public object ProofOpJvmConverter : ProtobufTypeMapper<ProofOp, Query.ProofOp> {
  public override val descriptor: Descriptors.Descriptor = Query.ProofOp.getDescriptor()

  public override val parser: Parser<Query.ProofOp> = Query.ProofOp.parser()

  public override fun convert(obj: Query.ProofOp): ProofOp = ProofOp(
  	type = obj.getType(),
  	key = obj.getKey().toByteArray(),
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: ProofOp): Query.ProofOp {
    val builder = Query.ProofOp.newBuilder()
    builder.setType(obj.type)
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object ProofOpsJvmConverter : ProtobufTypeMapper<ProofOps, Query.ProofOps> {
  public override val descriptor: Descriptors.Descriptor = Query.ProofOps.getDescriptor()

  public override val parser: Parser<Query.ProofOps> = Query.ProofOps.parser()

  public override fun convert(obj: Query.ProofOps): ProofOps = ProofOps(
  	ops = obj.getOpsList().map { ProofOpJvmConverter.convert(it) },
  )

  public override fun convert(obj: ProofOps): Query.ProofOps {
    val builder = Query.ProofOps.newBuilder()
    builder.addAllOps(obj.ops.map { ProofOpJvmConverter.convert(it) })
    return builder.build()
  }
}
