// Transform from cosmos/tx/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object TxConverter : ProtobufConverter<Tx> by TxJvmConverter

public actual object TxRawConverter : ProtobufConverter<TxRaw> by TxRawJvmConverter

public actual object SignDocConverter : ProtobufConverter<SignDoc> by SignDocJvmConverter

public actual object SignDocDirectAuxConverter : ProtobufConverter<SignDocDirectAux> by
    SignDocDirectAuxJvmConverter

public actual object TxBodyConverter : ProtobufConverter<TxBody> by TxBodyJvmConverter

public actual object AuthInfoConverter : ProtobufConverter<AuthInfo> by AuthInfoJvmConverter

public actual object SignerInfoConverter : ProtobufConverter<SignerInfo> by SignerInfoJvmConverter

public actual object ModeInfoConverter : ProtobufConverter<ModeInfo> by ModeInfoJvmConverter {
  public actual object SingleConverter : ProtobufConverter<ModeInfo.Single> by
      ModeInfoJvmConverter.SingleJvmConverter

  public actual object MultiConverter : ProtobufConverter<ModeInfo.Multi> by
      ModeInfoJvmConverter.MultiJvmConverter
}

public actual object FeeConverter : ProtobufConverter<Fee> by FeeJvmConverter

public actual object TipConverter : ProtobufConverter<Tip> by TipJvmConverter

public actual object AuxSignerDataConverter : ProtobufConverter<AuxSignerData> by
    AuxSignerDataJvmConverter
