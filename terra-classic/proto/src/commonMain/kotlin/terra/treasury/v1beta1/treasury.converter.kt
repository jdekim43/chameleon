// Transform from terra/treasury/v1beta1/treasury.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PolicyConstraintsConverter : ProtobufConverter<PolicyConstraints>

public fun PolicyConstraints.toAny(): Any = Any(PolicyConstraints.TYPE_URL,
    with(PolicyConstraintsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PolicyConstraints>): PolicyConstraints {
  if (typeUrl != PolicyConstraints.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EpochTaxProceedsConverter : ProtobufConverter<EpochTaxProceeds>

public fun EpochTaxProceeds.toAny(): Any = Any(EpochTaxProceeds.TYPE_URL,
    with(EpochTaxProceedsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EpochTaxProceeds>): EpochTaxProceeds {
  if (typeUrl != EpochTaxProceeds.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EpochInitialIssuanceConverter : ProtobufConverter<EpochInitialIssuance>

public fun EpochInitialIssuance.toAny(): Any = Any(EpochInitialIssuance.TYPE_URL,
    with(EpochInitialIssuanceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EpochInitialIssuance>): EpochInitialIssuance {
  if (typeUrl != EpochInitialIssuance.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
