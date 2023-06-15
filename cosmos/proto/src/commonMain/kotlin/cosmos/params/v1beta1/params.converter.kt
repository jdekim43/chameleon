// Transform from cosmos/params/v1beta1/params.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.params.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ParameterChangeProposalConverter : ProtobufConverter<ParameterChangeProposal>

public fun ParameterChangeProposal.toAny(): Any = Any(ParameterChangeProposal.TYPE_URL,
    with(ParameterChangeProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ParameterChangeProposal>):
    ParameterChangeProposal {
  if (typeUrl != ParameterChangeProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ParamChangeConverter : ProtobufConverter<ParamChange>

public fun ParamChange.toAny(): Any = Any(ParamChange.TYPE_URL, with(ParamChangeConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ParamChange>): ParamChange {
  if (typeUrl != ParamChange.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
