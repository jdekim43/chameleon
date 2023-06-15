// Transform from cosmos/orm/v1/orm.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.orm.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object TableDescriptorJvmConverter : ProtobufTypeMapper<TableDescriptor, Orm.TableDescriptor>
    {
  public override val descriptor: Descriptors.Descriptor = Orm.TableDescriptor.getDescriptor()

  public override val parser: Parser<Orm.TableDescriptor> = Orm.TableDescriptor.parser()

  public override fun convert(obj: Orm.TableDescriptor): TableDescriptor = TableDescriptor(
  	primaryKey = PrimaryKeyDescriptorJvmConverter.convert(obj.getPrimaryKey()),
  	index = obj.getIndexList().map { SecondaryIndexDescriptorJvmConverter.convert(it) },
  	id = obj.getId().asKotlinType,
  )

  public override fun convert(obj: TableDescriptor): Orm.TableDescriptor {
    val builder = Orm.TableDescriptor.newBuilder()
    builder.setPrimaryKey(PrimaryKeyDescriptorJvmConverter.convert(obj.primaryKey))
    builder.addAllIndex(obj.index.map { SecondaryIndexDescriptorJvmConverter.convert(it) })
    builder.setId(obj.id.asJavaType)
    return builder.build()
  }
}

public object PrimaryKeyDescriptorJvmConverter :
    ProtobufTypeMapper<PrimaryKeyDescriptor, Orm.PrimaryKeyDescriptor> {
  public override val descriptor: Descriptors.Descriptor = Orm.PrimaryKeyDescriptor.getDescriptor()

  public override val parser: Parser<Orm.PrimaryKeyDescriptor> = Orm.PrimaryKeyDescriptor.parser()

  public override fun convert(obj: Orm.PrimaryKeyDescriptor): PrimaryKeyDescriptor =
      PrimaryKeyDescriptor(
  	fields = obj.getFields(),
  	autoIncrement = obj.getAutoIncrement(),
  )

  public override fun convert(obj: PrimaryKeyDescriptor): Orm.PrimaryKeyDescriptor {
    val builder = Orm.PrimaryKeyDescriptor.newBuilder()
    builder.setFields(obj.fields)
    builder.setAutoIncrement(obj.autoIncrement)
    return builder.build()
  }
}

public object SecondaryIndexDescriptorJvmConverter :
    ProtobufTypeMapper<SecondaryIndexDescriptor, Orm.SecondaryIndexDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Orm.SecondaryIndexDescriptor.getDescriptor()

  public override val parser: Parser<Orm.SecondaryIndexDescriptor> =
      Orm.SecondaryIndexDescriptor.parser()

  public override fun convert(obj: Orm.SecondaryIndexDescriptor): SecondaryIndexDescriptor =
      SecondaryIndexDescriptor(
  	fields = obj.getFields(),
  	id = obj.getId().asKotlinType,
  	unique = obj.getUnique(),
  )

  public override fun convert(obj: SecondaryIndexDescriptor): Orm.SecondaryIndexDescriptor {
    val builder = Orm.SecondaryIndexDescriptor.newBuilder()
    builder.setFields(obj.fields)
    builder.setId(obj.id.asJavaType)
    builder.setUnique(obj.unique)
    return builder.build()
  }
}

public object SingletonDescriptorJvmConverter :
    ProtobufTypeMapper<SingletonDescriptor, Orm.SingletonDescriptor> {
  public override val descriptor: Descriptors.Descriptor = Orm.SingletonDescriptor.getDescriptor()

  public override val parser: Parser<Orm.SingletonDescriptor> = Orm.SingletonDescriptor.parser()

  public override fun convert(obj: Orm.SingletonDescriptor): SingletonDescriptor =
      SingletonDescriptor(
  	id = obj.getId().asKotlinType,
  )

  public override fun convert(obj: SingletonDescriptor): Orm.SingletonDescriptor {
    val builder = Orm.SingletonDescriptor.newBuilder()
    builder.setId(obj.id.asJavaType)
    return builder.build()
  }
}
