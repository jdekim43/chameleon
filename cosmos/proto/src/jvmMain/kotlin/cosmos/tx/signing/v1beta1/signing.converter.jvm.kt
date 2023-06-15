// Transform from cosmos/tx/signing/v1beta1/signing.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.signing.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.crypto.multisig.v1beta1.CompactBitArrayJvmConverter
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object SignatureDescriptorsJvmConverter :
    ProtobufTypeMapper<SignatureDescriptors, Signing.SignatureDescriptors> {
  public override val descriptor: Descriptors.Descriptor =
      Signing.SignatureDescriptors.getDescriptor()

  public override val parser: Parser<Signing.SignatureDescriptors> =
      Signing.SignatureDescriptors.parser()

  public override fun convert(obj: Signing.SignatureDescriptors): SignatureDescriptors =
      SignatureDescriptors(
  	signatures = obj.getSignaturesList().map { SignatureDescriptorJvmConverter.convert(it) },
  )

  public override fun convert(obj: SignatureDescriptors): Signing.SignatureDescriptors {
    val builder = Signing.SignatureDescriptors.newBuilder()
    builder.addAllSignatures(obj.signatures.map { SignatureDescriptorJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SignatureDescriptorJvmConverter :
    ProtobufTypeMapper<SignatureDescriptor, Signing.SignatureDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Signing.SignatureDescriptor.getDescriptor()

  public override val parser: Parser<Signing.SignatureDescriptor> =
      Signing.SignatureDescriptor.parser()

  public override fun convert(obj: Signing.SignatureDescriptor): SignatureDescriptor =
      SignatureDescriptor(
  	publicKey = AnyJvmConverter.convert(obj.getPublicKey()),
  	`data` = DataJvmConverter.convert(obj.getData()),
  	sequence = obj.getSequence().asKotlinType,
  )

  public override fun convert(obj: SignatureDescriptor): Signing.SignatureDescriptor {
    val builder = Signing.SignatureDescriptor.newBuilder()
    builder.setPublicKey(AnyJvmConverter.convert(obj.publicKey))
    builder.setData(DataJvmConverter.convert(obj.`data`))
    builder.setSequence(obj.sequence.asJavaType)
    return builder.build()
  }

  public object DataJvmConverter :
      ProtobufTypeMapper<SignatureDescriptor.Data, Signing.SignatureDescriptor.Data> {
    public override val descriptor: Descriptors.Descriptor =
        Signing.SignatureDescriptor.Data.getDescriptor()

    public override val parser: Parser<Signing.SignatureDescriptor.Data> =
        Signing.SignatureDescriptor.Data.parser()

    public override fun convert(obj: Signing.SignatureDescriptor.Data): SignatureDescriptor.Data =
        SignatureDescriptor.Data(
    	sum = mapOf(
    1 to { SignatureDescriptor.Data.SumOneOf.Single(SingleJvmConverter.convert(obj.getSingle())) },
    2 to { SignatureDescriptor.Data.SumOneOf.Multi(MultiJvmConverter.convert(obj.getMulti())) },
    ).getValue(obj.sumCase.number)(),
    )

    public override fun convert(obj: SignatureDescriptor.Data): Signing.SignatureDescriptor.Data {
      val builder = Signing.SignatureDescriptor.Data.newBuilder()
      when (obj.sum) {
        is SignatureDescriptor.Data.SumOneOf.Single ->
            builder.setSingle(SingleJvmConverter.convert(obj.sum.value))
        is SignatureDescriptor.Data.SumOneOf.Multi ->
            builder.setMulti(MultiJvmConverter.convert(obj.sum.value))
      }
      return builder.build()
    }

    public object SingleJvmConverter :
        ProtobufTypeMapper<SignatureDescriptor.Data.Single, Signing.SignatureDescriptor.Data.Single>
        {
      public override val descriptor: Descriptors.Descriptor =
          Signing.SignatureDescriptor.Data.Single.getDescriptor()

      public override val parser: Parser<Signing.SignatureDescriptor.Data.Single> =
          Signing.SignatureDescriptor.Data.Single.parser()

      public override fun convert(obj: Signing.SignatureDescriptor.Data.Single):
          SignatureDescriptor.Data.Single = SignatureDescriptor.Data.Single(
      	mode = SignMode.forNumber(obj.getMode().number),
      	signature = obj.getSignature().toByteArray(),
      )

      public override fun convert(obj: SignatureDescriptor.Data.Single):
          Signing.SignatureDescriptor.Data.Single {
        val builder = Signing.SignatureDescriptor.Data.Single.newBuilder()
        builder.setMode(Signing.SignMode.forNumber(obj.mode.number))
        builder.setSignature(ByteString.copyFrom(obj.signature))
        return builder.build()
      }
    }

    public object MultiJvmConverter :
        ProtobufTypeMapper<SignatureDescriptor.Data.Multi, Signing.SignatureDescriptor.Data.Multi> {
      public override val descriptor: Descriptors.Descriptor =
          Signing.SignatureDescriptor.Data.Multi.getDescriptor()

      public override val parser: Parser<Signing.SignatureDescriptor.Data.Multi> =
          Signing.SignatureDescriptor.Data.Multi.parser()

      public override fun convert(obj: Signing.SignatureDescriptor.Data.Multi):
          SignatureDescriptor.Data.Multi = SignatureDescriptor.Data.Multi(
      	bitarray = CompactBitArrayJvmConverter.convert(obj.getBitarray()),
      	signatures = obj.getSignaturesList().map { DataJvmConverter.convert(it) },
      )

      public override fun convert(obj: SignatureDescriptor.Data.Multi):
          Signing.SignatureDescriptor.Data.Multi {
        val builder = Signing.SignatureDescriptor.Data.Multi.newBuilder()
        builder.setBitarray(CompactBitArrayJvmConverter.convert(obj.bitarray))
        builder.addAllSignatures(obj.signatures.map { DataJvmConverter.convert(it) })
        return builder.build()
      }
    }
  }
}
