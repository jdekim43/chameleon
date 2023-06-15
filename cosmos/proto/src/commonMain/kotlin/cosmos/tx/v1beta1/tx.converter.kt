// Transform from cosmos/tx/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object TxConverter : ProtobufConverter<Tx>

public fun Tx.toAny(): Any = Any(Tx.TYPE_URL, with(TxConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Tx>): Tx {
  if (typeUrl != Tx.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxRawConverter : ProtobufConverter<TxRaw>

public fun TxRaw.toAny(): Any = Any(TxRaw.TYPE_URL, with(TxRawConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxRaw>): TxRaw {
  if (typeUrl != TxRaw.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SignDocConverter : ProtobufConverter<SignDoc>

public fun SignDoc.toAny(): Any = Any(SignDoc.TYPE_URL, with(SignDocConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SignDoc>): SignDoc {
  if (typeUrl != SignDoc.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SignDocDirectAuxConverter : ProtobufConverter<SignDocDirectAux>

public fun SignDocDirectAux.toAny(): Any = Any(SignDocDirectAux.TYPE_URL,
    with(SignDocDirectAuxConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SignDocDirectAux>): SignDocDirectAux {
  if (typeUrl != SignDocDirectAux.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxBodyConverter : ProtobufConverter<TxBody>

public fun TxBody.toAny(): Any = Any(TxBody.TYPE_URL, with(TxBodyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxBody>): TxBody {
  if (typeUrl != TxBody.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AuthInfoConverter : ProtobufConverter<AuthInfo>

public fun AuthInfo.toAny(): Any = Any(AuthInfo.TYPE_URL, with(AuthInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AuthInfo>): AuthInfo {
  if (typeUrl != AuthInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SignerInfoConverter : ProtobufConverter<SignerInfo>

public fun SignerInfo.toAny(): Any = Any(SignerInfo.TYPE_URL, with(SignerInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SignerInfo>): SignerInfo {
  if (typeUrl != SignerInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ModeInfoConverter : ProtobufConverter<ModeInfo> {
  public object SingleConverter : ProtobufConverter<ModeInfo.Single>

  public object MultiConverter : ProtobufConverter<ModeInfo.Multi>
}

public fun ModeInfo.toAny(): Any = Any(ModeInfo.TYPE_URL, with(ModeInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ModeInfo>): ModeInfo {
  if (typeUrl != ModeInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeeConverter : ProtobufConverter<Fee>

public fun Fee.toAny(): Any = Any(Fee.TYPE_URL, with(FeeConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Fee>): Fee {
  if (typeUrl != Fee.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TipConverter : ProtobufConverter<Tip>

public fun Tip.toAny(): Any = Any(Tip.TYPE_URL, with(TipConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Tip>): Tip {
  if (typeUrl != Tip.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AuxSignerDataConverter : ProtobufConverter<AuxSignerData>

public fun AuxSignerData.toAny(): Any = Any(AuxSignerData.TYPE_URL, with(AuxSignerDataConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AuxSignerData>): AuxSignerData {
  if (typeUrl != AuxSignerData.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
