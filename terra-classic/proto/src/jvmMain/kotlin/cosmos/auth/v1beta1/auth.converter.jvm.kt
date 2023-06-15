// Transform from cosmos/auth/v1beta1/auth.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object BaseAccountJvmConverter : ProtobufTypeMapper<BaseAccount, Auth.BaseAccount> {
  public override val descriptor: Descriptors.Descriptor = Auth.BaseAccount.getDescriptor()

  public override val parser: Parser<Auth.BaseAccount> = Auth.BaseAccount.parser()

  public override fun convert(obj: Auth.BaseAccount): BaseAccount = BaseAccount(
  	address = obj.getAddress(),
  	pubKey = AnyJvmConverter.convert(obj.getPubKey()),
  	accountNumber = obj.getAccountNumber().asKotlinType,
  	sequence = obj.getSequence().asKotlinType,
  )

  public override fun convert(obj: BaseAccount): Auth.BaseAccount {
    val builder = Auth.BaseAccount.newBuilder()
    builder.setAddress(obj.address)
    builder.setPubKey(AnyJvmConverter.convert(obj.pubKey))
    builder.setAccountNumber(obj.accountNumber.asJavaType)
    builder.setSequence(obj.sequence.asJavaType)
    return builder.build()
  }
}

public object ModuleAccountJvmConverter : ProtobufTypeMapper<ModuleAccount, Auth.ModuleAccount> {
  public override val descriptor: Descriptors.Descriptor = Auth.ModuleAccount.getDescriptor()

  public override val parser: Parser<Auth.ModuleAccount> = Auth.ModuleAccount.parser()

  public override fun convert(obj: Auth.ModuleAccount): ModuleAccount = ModuleAccount(
  	baseAccount = BaseAccountJvmConverter.convert(obj.getBaseAccount()),
  	name = obj.getName(),
  	permissions = obj.getPermissionsList().map { it },
  )

  public override fun convert(obj: ModuleAccount): Auth.ModuleAccount {
    val builder = Auth.ModuleAccount.newBuilder()
    builder.setBaseAccount(BaseAccountJvmConverter.convert(obj.baseAccount))
    builder.setName(obj.name)
    builder.addAllPermissions(obj.permissions.map { it })
    return builder.build()
  }
}

public object ModuleCredentialJvmConverter :
    ProtobufTypeMapper<ModuleCredential, Auth.ModuleCredential> {
  public override val descriptor: Descriptors.Descriptor = Auth.ModuleCredential.getDescriptor()

  public override val parser: Parser<Auth.ModuleCredential> = Auth.ModuleCredential.parser()

  public override fun convert(obj: Auth.ModuleCredential): ModuleCredential = ModuleCredential(
  	moduleName = obj.getModuleName(),
  	derivationKeys = obj.getDerivationKeysList().map { it.toByteArray() },
  )

  public override fun convert(obj: ModuleCredential): Auth.ModuleCredential {
    val builder = Auth.ModuleCredential.newBuilder()
    builder.setModuleName(obj.moduleName)
    builder.addAllDerivationKeys(obj.derivationKeys.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Auth.Params> {
  public override val descriptor: Descriptors.Descriptor = Auth.Params.getDescriptor()

  public override val parser: Parser<Auth.Params> = Auth.Params.parser()

  public override fun convert(obj: Auth.Params): Params = Params(
  	maxMemoCharacters = obj.getMaxMemoCharacters().asKotlinType,
  	txSigLimit = obj.getTxSigLimit().asKotlinType,
  	txSizeCostPerByte = obj.getTxSizeCostPerByte().asKotlinType,
  	sigVerifyCostEd25519 = obj.getSigVerifyCostEd25519().asKotlinType,
  	sigVerifyCostSecp256K1 = obj.getSigVerifyCostSecp256K1().asKotlinType,
  )

  public override fun convert(obj: Params): Auth.Params {
    val builder = Auth.Params.newBuilder()
    builder.setMaxMemoCharacters(obj.maxMemoCharacters.asJavaType)
    builder.setTxSigLimit(obj.txSigLimit.asJavaType)
    builder.setTxSizeCostPerByte(obj.txSizeCostPerByte.asJavaType)
    builder.setSigVerifyCostEd25519(obj.sigVerifyCostEd25519.asJavaType)
    builder.setSigVerifyCostSecp256K1(obj.sigVerifyCostSecp256K1.asJavaType)
    return builder.build()
  }
}
