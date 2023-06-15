// Transform from cosmos/tx/signing/v1beta1/signing.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.signing.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object SignatureDescriptorsConverter : ProtobufConverter<SignatureDescriptors> by
    SignatureDescriptorsJvmConverter

public actual object SignatureDescriptorConverter : ProtobufConverter<SignatureDescriptor> by
    SignatureDescriptorJvmConverter {
  public actual object DataConverter : ProtobufConverter<SignatureDescriptor.Data> by
      SignatureDescriptorJvmConverter.DataJvmConverter {
    public actual object SingleConverter : ProtobufConverter<SignatureDescriptor.Data.Single> by
        SignatureDescriptorJvmConverter.DataJvmConverter.SingleJvmConverter

    public actual object MultiConverter : ProtobufConverter<SignatureDescriptor.Data.Multi> by
        SignatureDescriptorJvmConverter.DataJvmConverter.MultiJvmConverter
  }
}
