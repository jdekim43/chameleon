// Transform from cosmos/crypto/keyring/v1/record.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.keyring.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.crypto.hd.v1.BIP44ParamsJvmConverter
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object RecordJvmConverter : ProtobufTypeMapper<Record, RecordOuterClass.Record> {
  public override val descriptor: Descriptors.Descriptor = RecordOuterClass.Record.getDescriptor()

  public override val parser: Parser<RecordOuterClass.Record> = RecordOuterClass.Record.parser()

  public override fun convert(obj: RecordOuterClass.Record): Record = Record(
  	name = obj.getName(),
  	pubKey = AnyJvmConverter.convert(obj.getPubKey()),
  	item = mapOf(
  3 to { Record.ItemOneOf.Local(LocalJvmConverter.convert(obj.getLocal())) },
  4 to { Record.ItemOneOf.Ledger(LedgerJvmConverter.convert(obj.getLedger())) },
  5 to { Record.ItemOneOf.Multi(MultiJvmConverter.convert(obj.getMulti())) },
  6 to { Record.ItemOneOf.Offline(OfflineJvmConverter.convert(obj.getOffline())) },
  ).getValue(obj.itemCase.number)(),
  )

  public override fun convert(obj: Record): RecordOuterClass.Record {
    val builder = RecordOuterClass.Record.newBuilder()
    builder.setName(obj.name)
    builder.setPubKey(AnyJvmConverter.convert(obj.pubKey))
    when (obj.item) {
      is Record.ItemOneOf.Local -> builder.setLocal(LocalJvmConverter.convert(obj.item.value))
      is Record.ItemOneOf.Ledger -> builder.setLedger(LedgerJvmConverter.convert(obj.item.value))
      is Record.ItemOneOf.Multi -> builder.setMulti(MultiJvmConverter.convert(obj.item.value))
      is Record.ItemOneOf.Offline -> builder.setOffline(OfflineJvmConverter.convert(obj.item.value))
    }
    return builder.build()
  }

  public object LocalJvmConverter : ProtobufTypeMapper<Record.Local, RecordOuterClass.Record.Local>
      {
    public override val descriptor: Descriptors.Descriptor =
        RecordOuterClass.Record.Local.getDescriptor()

    public override val parser: Parser<RecordOuterClass.Record.Local> =
        RecordOuterClass.Record.Local.parser()

    public override fun convert(obj: RecordOuterClass.Record.Local): Record.Local = Record.Local(
    	privKey = AnyJvmConverter.convert(obj.getPrivKey()),
    )

    public override fun convert(obj: Record.Local): RecordOuterClass.Record.Local {
      val builder = RecordOuterClass.Record.Local.newBuilder()
      builder.setPrivKey(AnyJvmConverter.convert(obj.privKey))
      return builder.build()
    }
  }

  public object LedgerJvmConverter :
      ProtobufTypeMapper<Record.Ledger, RecordOuterClass.Record.Ledger> {
    public override val descriptor: Descriptors.Descriptor =
        RecordOuterClass.Record.Ledger.getDescriptor()

    public override val parser: Parser<RecordOuterClass.Record.Ledger> =
        RecordOuterClass.Record.Ledger.parser()

    public override fun convert(obj: RecordOuterClass.Record.Ledger): Record.Ledger = Record.Ledger(
    	path = BIP44ParamsJvmConverter.convert(obj.getPath()),
    )

    public override fun convert(obj: Record.Ledger): RecordOuterClass.Record.Ledger {
      val builder = RecordOuterClass.Record.Ledger.newBuilder()
      builder.setPath(BIP44ParamsJvmConverter.convert(obj.path))
      return builder.build()
    }
  }

  public object MultiJvmConverter : ProtobufTypeMapper<Record.Multi, RecordOuterClass.Record.Multi>
      {
    public override val descriptor: Descriptors.Descriptor =
        RecordOuterClass.Record.Multi.getDescriptor()

    public override val parser: Parser<RecordOuterClass.Record.Multi> =
        RecordOuterClass.Record.Multi.parser()

    public override fun convert(obj: RecordOuterClass.Record.Multi): Record.Multi = Record.Multi(
    )

    public override fun convert(obj: Record.Multi): RecordOuterClass.Record.Multi {
      val builder = RecordOuterClass.Record.Multi.newBuilder()
      return builder.build()
    }
  }

  public object OfflineJvmConverter :
      ProtobufTypeMapper<Record.Offline, RecordOuterClass.Record.Offline> {
    public override val descriptor: Descriptors.Descriptor =
        RecordOuterClass.Record.Offline.getDescriptor()

    public override val parser: Parser<RecordOuterClass.Record.Offline> =
        RecordOuterClass.Record.Offline.parser()

    public override fun convert(obj: RecordOuterClass.Record.Offline): Record.Offline =
        Record.Offline(
    )

    public override fun convert(obj: Record.Offline): RecordOuterClass.Record.Offline {
      val builder = RecordOuterClass.Record.Offline.newBuilder()
      return builder.build()
    }
  }
}
