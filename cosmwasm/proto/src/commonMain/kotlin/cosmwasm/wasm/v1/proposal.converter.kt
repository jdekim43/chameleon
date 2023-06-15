// Transform from cosmwasm/wasm/v1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object StoreCodeProposalConverter : ProtobufConverter<StoreCodeProposal>

public fun StoreCodeProposal.toAny(): Any = Any(StoreCodeProposal.TYPE_URL,
    with(StoreCodeProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<StoreCodeProposal>): StoreCodeProposal {
  if (typeUrl != StoreCodeProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object InstantiateContractProposalConverter :
    ProtobufConverter<InstantiateContractProposal>

public fun InstantiateContractProposal.toAny(): Any = Any(InstantiateContractProposal.TYPE_URL,
    with(InstantiateContractProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<InstantiateContractProposal>):
    InstantiateContractProposal {
  if (typeUrl != InstantiateContractProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object InstantiateContract2ProposalConverter :
    ProtobufConverter<InstantiateContract2Proposal>

public fun InstantiateContract2Proposal.toAny(): Any = Any(InstantiateContract2Proposal.TYPE_URL,
    with(InstantiateContract2ProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<InstantiateContract2Proposal>):
    InstantiateContract2Proposal {
  if (typeUrl != InstantiateContract2Proposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MigrateContractProposalConverter : ProtobufConverter<MigrateContractProposal>

public fun MigrateContractProposal.toAny(): Any = Any(MigrateContractProposal.TYPE_URL,
    with(MigrateContractProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MigrateContractProposal>):
    MigrateContractProposal {
  if (typeUrl != MigrateContractProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SudoContractProposalConverter : ProtobufConverter<SudoContractProposal>

public fun SudoContractProposal.toAny(): Any = Any(SudoContractProposal.TYPE_URL,
    with(SudoContractProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SudoContractProposal>): SudoContractProposal {
  if (typeUrl != SudoContractProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ExecuteContractProposalConverter : ProtobufConverter<ExecuteContractProposal>

public fun ExecuteContractProposal.toAny(): Any = Any(ExecuteContractProposal.TYPE_URL,
    with(ExecuteContractProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ExecuteContractProposal>):
    ExecuteContractProposal {
  if (typeUrl != ExecuteContractProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object UpdateAdminProposalConverter : ProtobufConverter<UpdateAdminProposal>

public fun UpdateAdminProposal.toAny(): Any = Any(UpdateAdminProposal.TYPE_URL,
    with(UpdateAdminProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UpdateAdminProposal>): UpdateAdminProposal {
  if (typeUrl != UpdateAdminProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ClearAdminProposalConverter : ProtobufConverter<ClearAdminProposal>

public fun ClearAdminProposal.toAny(): Any = Any(ClearAdminProposal.TYPE_URL,
    with(ClearAdminProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ClearAdminProposal>): ClearAdminProposal {
  if (typeUrl != ClearAdminProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PinCodesProposalConverter : ProtobufConverter<PinCodesProposal>

public fun PinCodesProposal.toAny(): Any = Any(PinCodesProposal.TYPE_URL,
    with(PinCodesProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PinCodesProposal>): PinCodesProposal {
  if (typeUrl != PinCodesProposal.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object UnpinCodesProposalConverter : ProtobufConverter<UnpinCodesProposal>

public fun UnpinCodesProposal.toAny(): Any = Any(UnpinCodesProposal.TYPE_URL,
    with(UnpinCodesProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UnpinCodesProposal>): UnpinCodesProposal {
  if (typeUrl != UnpinCodesProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AccessConfigUpdateConverter : ProtobufConverter<AccessConfigUpdate>

public fun AccessConfigUpdate.toAny(): Any = Any(AccessConfigUpdate.TYPE_URL,
    with(AccessConfigUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AccessConfigUpdate>): AccessConfigUpdate {
  if (typeUrl != AccessConfigUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object UpdateInstantiateConfigProposalConverter :
    ProtobufConverter<UpdateInstantiateConfigProposal>

public fun UpdateInstantiateConfigProposal.toAny(): Any =
    Any(UpdateInstantiateConfigProposal.TYPE_URL, with(UpdateInstantiateConfigProposalConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UpdateInstantiateConfigProposal>):
    UpdateInstantiateConfigProposal {
  if (typeUrl != UpdateInstantiateConfigProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object StoreAndInstantiateContractProposalConverter :
    ProtobufConverter<StoreAndInstantiateContractProposal>

public fun StoreAndInstantiateContractProposal.toAny(): Any =
    Any(StoreAndInstantiateContractProposal.TYPE_URL,
    with(StoreAndInstantiateContractProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<StoreAndInstantiateContractProposal>):
    StoreAndInstantiateContractProposal {
  if (typeUrl != StoreAndInstantiateContractProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
