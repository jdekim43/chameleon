// Transform from cosmos/crypto/keyring/v1/record.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.keyring.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object RecordConverter : ProtobufConverter<Record> {
  public object LocalConverter : ProtobufConverter<Record.Local>

  public object LedgerConverter : ProtobufConverter<Record.Ledger>

  public object MultiConverter : ProtobufConverter<Record.Multi>

  public object OfflineConverter : ProtobufConverter<Record.Offline>
}

public fun Record.toAny(): Any = Any(Record.TYPE_URL, with(RecordConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Record>): Record {
  if (typeUrl != Record.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
