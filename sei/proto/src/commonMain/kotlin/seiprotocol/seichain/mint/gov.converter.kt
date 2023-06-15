// Transform from mint/v1beta1/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object UpdateMinterProposalConverter : ProtobufConverter<UpdateMinterProposal>

public fun UpdateMinterProposal.toAny(): Any = Any(UpdateMinterProposal.TYPE_URL,
    with(UpdateMinterProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UpdateMinterProposal>): UpdateMinterProposal {
  if (typeUrl != UpdateMinterProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
