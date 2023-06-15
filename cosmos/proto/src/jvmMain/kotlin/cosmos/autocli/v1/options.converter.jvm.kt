// Transform from cosmos/autocli/v1/options.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.autocli.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ModuleOptionsJvmConverter : ProtobufTypeMapper<ModuleOptions, Options.ModuleOptions> {
  public override val descriptor: Descriptors.Descriptor = Options.ModuleOptions.getDescriptor()

  public override val parser: Parser<Options.ModuleOptions> = Options.ModuleOptions.parser()

  public override fun convert(obj: Options.ModuleOptions): ModuleOptions = ModuleOptions(
  	tx = ServiceCommandDescriptorJvmConverter.convert(obj.getTx()),
  	query = ServiceCommandDescriptorJvmConverter.convert(obj.getQuery()),
  )

  public override fun convert(obj: ModuleOptions): Options.ModuleOptions {
    val builder = Options.ModuleOptions.newBuilder()
    builder.setTx(ServiceCommandDescriptorJvmConverter.convert(obj.tx))
    builder.setQuery(ServiceCommandDescriptorJvmConverter.convert(obj.query))
    return builder.build()
  }
}

public object ServiceCommandDescriptorJvmConverter :
    ProtobufTypeMapper<ServiceCommandDescriptor, Options.ServiceCommandDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Options.ServiceCommandDescriptor.getDescriptor()

  public override val parser: Parser<Options.ServiceCommandDescriptor> =
      Options.ServiceCommandDescriptor.parser()

  public override fun convert(obj: Options.ServiceCommandDescriptor): ServiceCommandDescriptor =
      ServiceCommandDescriptor(
  	service = obj.getService(),
  	rpcCommandOptions = obj.getRpcCommandOptionsList().map {
      RpcCommandOptionsJvmConverter.convert(it) },
  	subCommands = obj.getSubCommandsMap().map { it.key to
      ServiceCommandDescriptorJvmConverter.convert(it.value) }.toMap(),
  )

  public override fun convert(obj: ServiceCommandDescriptor): Options.ServiceCommandDescriptor {
    val builder = Options.ServiceCommandDescriptor.newBuilder()
    builder.setService(obj.service)
    builder.addAllRpcCommandOptions(obj.rpcCommandOptions.map {
        RpcCommandOptionsJvmConverter.convert(it) })
    builder.putAllSubCommands(obj.subCommands.map { it.key to
        ServiceCommandDescriptorJvmConverter.convert(it.value) }.toMap())
    return builder.build()
  }
}

public object RpcCommandOptionsJvmConverter :
    ProtobufTypeMapper<RpcCommandOptions, Options.RpcCommandOptions> {
  public override val descriptor: Descriptors.Descriptor = Options.RpcCommandOptions.getDescriptor()

  public override val parser: Parser<Options.RpcCommandOptions> = Options.RpcCommandOptions.parser()

  public override fun convert(obj: Options.RpcCommandOptions): RpcCommandOptions =
      RpcCommandOptions(
  	rpcMethod = obj.getRpcMethod(),
  	use = obj.getUse(),
  	long = obj.getLong(),
  	short = obj.getShort(),
  	example = obj.getExample(),
  	alias = obj.getAliasList().map { it },
  	suggestFor = obj.getSuggestForList().map { it },
  	deprecated = obj.getDeprecated(),
  	version = obj.getVersion(),
  	flagOptions = obj.getFlagOptionsMap().map { it.key to FlagOptionsJvmConverter.convert(it.value)
      }.toMap(),
  	positionalArgs = obj.getPositionalArgsList().map {
      PositionalArgDescriptorJvmConverter.convert(it) },
  	skip = obj.getSkip(),
  )

  public override fun convert(obj: RpcCommandOptions): Options.RpcCommandOptions {
    val builder = Options.RpcCommandOptions.newBuilder()
    builder.setRpcMethod(obj.rpcMethod)
    builder.setUse(obj.use)
    builder.setLong(obj.long)
    builder.setShort(obj.short)
    builder.setExample(obj.example)
    builder.addAllAlias(obj.alias.map { it })
    builder.addAllSuggestFor(obj.suggestFor.map { it })
    builder.setDeprecated(obj.deprecated)
    builder.setVersion(obj.version)
    builder.putAllFlagOptions(obj.flagOptions.map { it.key to
        FlagOptionsJvmConverter.convert(it.value) }.toMap())
    builder.addAllPositionalArgs(obj.positionalArgs.map {
        PositionalArgDescriptorJvmConverter.convert(it) })
    builder.setSkip(obj.skip)
    return builder.build()
  }
}

public object FlagOptionsJvmConverter : ProtobufTypeMapper<FlagOptions, Options.FlagOptions> {
  public override val descriptor: Descriptors.Descriptor = Options.FlagOptions.getDescriptor()

  public override val parser: Parser<Options.FlagOptions> = Options.FlagOptions.parser()

  public override fun convert(obj: Options.FlagOptions): FlagOptions = FlagOptions(
  	name = obj.getName(),
  	shorthand = obj.getShorthand(),
  	usage = obj.getUsage(),
  	defaultValue = obj.getDefaultValue(),
  	noOptDefaultValue = obj.getNoOptDefaultValue(),
  	deprecated = obj.getDeprecated(),
  	shorthandDeprecated = obj.getShorthandDeprecated(),
  	hidden = obj.getHidden(),
  )

  public override fun convert(obj: FlagOptions): Options.FlagOptions {
    val builder = Options.FlagOptions.newBuilder()
    builder.setName(obj.name)
    builder.setShorthand(obj.shorthand)
    builder.setUsage(obj.usage)
    builder.setDefaultValue(obj.defaultValue)
    builder.setNoOptDefaultValue(obj.noOptDefaultValue)
    builder.setDeprecated(obj.deprecated)
    builder.setShorthandDeprecated(obj.shorthandDeprecated)
    builder.setHidden(obj.hidden)
    return builder.build()
  }
}

public object PositionalArgDescriptorJvmConverter :
    ProtobufTypeMapper<PositionalArgDescriptor, Options.PositionalArgDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Options.PositionalArgDescriptor.getDescriptor()

  public override val parser: Parser<Options.PositionalArgDescriptor> =
      Options.PositionalArgDescriptor.parser()

  public override fun convert(obj: Options.PositionalArgDescriptor): PositionalArgDescriptor =
      PositionalArgDescriptor(
  	protoField = obj.getProtoField(),
  	varargs = obj.getVarargs(),
  )

  public override fun convert(obj: PositionalArgDescriptor): Options.PositionalArgDescriptor {
    val builder = Options.PositionalArgDescriptor.newBuilder()
    builder.setProtoField(obj.protoField)
    builder.setVarargs(obj.varargs)
    return builder.build()
  }
}
