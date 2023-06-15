// Transform from cosmwasm/wasm/v1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object StoreCodeProposalConverter : ProtobufConverter<StoreCodeProposal> by
    StoreCodeProposalJvmConverter

public actual object InstantiateContractProposalConverter :
    ProtobufConverter<InstantiateContractProposal> by InstantiateContractProposalJvmConverter

public actual object InstantiateContract2ProposalConverter :
    ProtobufConverter<InstantiateContract2Proposal> by InstantiateContract2ProposalJvmConverter

public actual object MigrateContractProposalConverter : ProtobufConverter<MigrateContractProposal>
    by MigrateContractProposalJvmConverter

public actual object SudoContractProposalConverter : ProtobufConverter<SudoContractProposal> by
    SudoContractProposalJvmConverter

public actual object ExecuteContractProposalConverter : ProtobufConverter<ExecuteContractProposal>
    by ExecuteContractProposalJvmConverter

public actual object UpdateAdminProposalConverter : ProtobufConverter<UpdateAdminProposal> by
    UpdateAdminProposalJvmConverter

public actual object ClearAdminProposalConverter : ProtobufConverter<ClearAdminProposal> by
    ClearAdminProposalJvmConverter

public actual object PinCodesProposalConverter : ProtobufConverter<PinCodesProposal> by
    PinCodesProposalJvmConverter

public actual object UnpinCodesProposalConverter : ProtobufConverter<UnpinCodesProposal> by
    UnpinCodesProposalJvmConverter

public actual object AccessConfigUpdateConverter : ProtobufConverter<AccessConfigUpdate> by
    AccessConfigUpdateJvmConverter

public actual object UpdateInstantiateConfigProposalConverter :
    ProtobufConverter<UpdateInstantiateConfigProposal> by
    UpdateInstantiateConfigProposalJvmConverter

public actual object StoreAndInstantiateContractProposalConverter :
    ProtobufConverter<StoreAndInstantiateContractProposal> by
    StoreAndInstantiateContractProposalJvmConverter
