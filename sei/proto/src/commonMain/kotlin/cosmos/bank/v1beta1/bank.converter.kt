// Transform from cosmos/bank/v1beta1/bank.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

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

public expect object SendEnabledConverter : ProtobufConverter<SendEnabled>

public fun SendEnabled.toAny(): Any = Any(SendEnabled.TYPE_URL, with(SendEnabledConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SendEnabled>): SendEnabled {
  if (typeUrl != SendEnabled.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object InputConverter : ProtobufConverter<Input>

public fun Input.toAny(): Any = Any(Input.TYPE_URL, with(InputConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Input>): Input {
  if (typeUrl != Input.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OutputConverter : ProtobufConverter<Output>

public fun Output.toAny(): Any = Any(Output.TYPE_URL, with(OutputConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Output>): Output {
  if (typeUrl != Output.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SupplyConverter : ProtobufConverter<Supply>

public fun Supply.toAny(): Any = Any(Supply.TYPE_URL, with(SupplyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Supply>): Supply {
  if (typeUrl != Supply.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DenomUnitConverter : ProtobufConverter<DenomUnit>

public fun DenomUnit.toAny(): Any = Any(DenomUnit.TYPE_URL, with(DenomUnitConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<DenomUnit>): DenomUnit {
  if (typeUrl != DenomUnit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MetadataConverter : ProtobufConverter<Metadata>

public fun Metadata.toAny(): Any = Any(Metadata.TYPE_URL, with(MetadataConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Metadata>): Metadata {
  if (typeUrl != Metadata.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
