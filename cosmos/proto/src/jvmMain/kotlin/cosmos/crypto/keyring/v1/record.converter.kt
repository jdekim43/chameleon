// Transform from cosmos/crypto/keyring/v1/record.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.keyring.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object RecordConverter : ProtobufConverter<Record> by RecordJvmConverter {
  public actual object LocalConverter : ProtobufConverter<Record.Local> by
      RecordJvmConverter.LocalJvmConverter

  public actual object LedgerConverter : ProtobufConverter<Record.Ledger> by
      RecordJvmConverter.LedgerJvmConverter

  public actual object MultiConverter : ProtobufConverter<Record.Multi> by
      RecordJvmConverter.MultiJvmConverter

  public actual object OfflineConverter : ProtobufConverter<Record.Offline> by
      RecordJvmConverter.OfflineJvmConverter
}
