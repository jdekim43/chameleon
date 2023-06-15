// Transform from cosmos/feegrant/v1beta1/feegrant.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object BasicAllowanceConverter : ProtobufConverter<BasicAllowance>

public fun BasicAllowance.toAny(): Any = Any(BasicAllowance.TYPE_URL, with(BasicAllowanceConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BasicAllowance>): BasicAllowance {
  if (typeUrl != BasicAllowance.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PeriodicAllowanceConverter : ProtobufConverter<PeriodicAllowance>

public fun PeriodicAllowance.toAny(): Any = Any(PeriodicAllowance.TYPE_URL,
    with(PeriodicAllowanceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PeriodicAllowance>): PeriodicAllowance {
  if (typeUrl != PeriodicAllowance.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AllowedMsgAllowanceConverter : ProtobufConverter<AllowedMsgAllowance>

public fun AllowedMsgAllowance.toAny(): Any = Any(AllowedMsgAllowance.TYPE_URL,
    with(AllowedMsgAllowanceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AllowedMsgAllowance>): AllowedMsgAllowance {
  if (typeUrl != AllowedMsgAllowance.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GrantConverter : ProtobufConverter<Grant>

public fun Grant.toAny(): Any = Any(Grant.TYPE_URL, with(GrantConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Grant>): Grant {
  if (typeUrl != Grant.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
