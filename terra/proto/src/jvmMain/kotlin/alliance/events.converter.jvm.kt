// Transform from alliance/events.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object DelegateAllianceEventJvmConverter :
    ProtobufTypeMapper<DelegateAllianceEvent, Events.DelegateAllianceEvent> {
  public override val descriptor: Descriptors.Descriptor =
      Events.DelegateAllianceEvent.getDescriptor()

  public override val parser: Parser<Events.DelegateAllianceEvent> =
      Events.DelegateAllianceEvent.parser()

  public override fun convert(obj: Events.DelegateAllianceEvent): DelegateAllianceEvent =
      DelegateAllianceEvent(
  	allianceSender = obj.getAllianceSender(),
  	validator = obj.getValidator(),
  	coin = CoinJvmConverter.convert(obj.getCoin()),
  	newShares = obj.getNewShares(),
  )

  public override fun convert(obj: DelegateAllianceEvent): Events.DelegateAllianceEvent {
    val builder = Events.DelegateAllianceEvent.newBuilder()
    builder.setAllianceSender(obj.allianceSender)
    builder.setValidator(obj.validator)
    builder.setCoin(CoinJvmConverter.convert(obj.coin))
    builder.setNewShares(obj.newShares)
    return builder.build()
  }
}

public object UndelegateAllianceEventJvmConverter :
    ProtobufTypeMapper<UndelegateAllianceEvent, Events.UndelegateAllianceEvent> {
  public override val descriptor: Descriptors.Descriptor =
      Events.UndelegateAllianceEvent.getDescriptor()

  public override val parser: Parser<Events.UndelegateAllianceEvent> =
      Events.UndelegateAllianceEvent.parser()

  public override fun convert(obj: Events.UndelegateAllianceEvent): UndelegateAllianceEvent =
      UndelegateAllianceEvent(
  	allianceSender = obj.getAllianceSender(),
  	validator = obj.getValidator(),
  	coin = CoinJvmConverter.convert(obj.getCoin()),
  	completionTime = TimestampJvmConverter.convert(obj.getCompletionTime()),
  )

  public override fun convert(obj: UndelegateAllianceEvent): Events.UndelegateAllianceEvent {
    val builder = Events.UndelegateAllianceEvent.newBuilder()
    builder.setAllianceSender(obj.allianceSender)
    builder.setValidator(obj.validator)
    builder.setCoin(CoinJvmConverter.convert(obj.coin))
    builder.setCompletionTime(TimestampJvmConverter.convert(obj.completionTime))
    return builder.build()
  }
}

public object RedelegateAllianceEventJvmConverter :
    ProtobufTypeMapper<RedelegateAllianceEvent, Events.RedelegateAllianceEvent> {
  public override val descriptor: Descriptors.Descriptor =
      Events.RedelegateAllianceEvent.getDescriptor()

  public override val parser: Parser<Events.RedelegateAllianceEvent> =
      Events.RedelegateAllianceEvent.parser()

  public override fun convert(obj: Events.RedelegateAllianceEvent): RedelegateAllianceEvent =
      RedelegateAllianceEvent(
  	allianceSender = obj.getAllianceSender(),
  	sourceValidator = obj.getSourceValidator(),
  	destinationValidator = obj.getDestinationValidator(),
  	coin = CoinJvmConverter.convert(obj.getCoin()),
  	completionTime = TimestampJvmConverter.convert(obj.getCompletionTime()),
  )

  public override fun convert(obj: RedelegateAllianceEvent): Events.RedelegateAllianceEvent {
    val builder = Events.RedelegateAllianceEvent.newBuilder()
    builder.setAllianceSender(obj.allianceSender)
    builder.setSourceValidator(obj.sourceValidator)
    builder.setDestinationValidator(obj.destinationValidator)
    builder.setCoin(CoinJvmConverter.convert(obj.coin))
    builder.setCompletionTime(TimestampJvmConverter.convert(obj.completionTime))
    return builder.build()
  }
}

public object ClaimAllianceRewardsEventJvmConverter :
    ProtobufTypeMapper<ClaimAllianceRewardsEvent, Events.ClaimAllianceRewardsEvent> {
  public override val descriptor: Descriptors.Descriptor =
      Events.ClaimAllianceRewardsEvent.getDescriptor()

  public override val parser: Parser<Events.ClaimAllianceRewardsEvent> =
      Events.ClaimAllianceRewardsEvent.parser()

  public override fun convert(obj: Events.ClaimAllianceRewardsEvent): ClaimAllianceRewardsEvent =
      ClaimAllianceRewardsEvent(
  	allianceSender = obj.getAllianceSender(),
  	validator = obj.getValidator(),
  	coins = obj.getCoinsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: ClaimAllianceRewardsEvent): Events.ClaimAllianceRewardsEvent {
    val builder = Events.ClaimAllianceRewardsEvent.newBuilder()
    builder.setAllianceSender(obj.allianceSender)
    builder.setValidator(obj.validator)
    builder.addAllCoins(obj.coins.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}
