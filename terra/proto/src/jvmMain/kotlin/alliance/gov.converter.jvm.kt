// Transform from alliance/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.DurationJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgCreateAllianceProposalJvmConverter :
    ProtobufTypeMapper<MsgCreateAllianceProposal, Gov.MsgCreateAllianceProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Gov.MsgCreateAllianceProposal.getDescriptor()

  public override val parser: Parser<Gov.MsgCreateAllianceProposal> =
      Gov.MsgCreateAllianceProposal.parser()

  public override fun convert(obj: Gov.MsgCreateAllianceProposal): MsgCreateAllianceProposal =
      MsgCreateAllianceProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	denom = obj.getDenom(),
  	rewardWeight = obj.getRewardWeight(),
  	takeRate = obj.getTakeRate(),
  	rewardChangeRate = obj.getRewardChangeRate(),
  	rewardChangeInterval = DurationJvmConverter.convert(obj.getRewardChangeInterval()),
  	rewardWeightRange = RewardWeightRangeJvmConverter.convert(obj.getRewardWeightRange()),
  )

  public override fun convert(obj: MsgCreateAllianceProposal): Gov.MsgCreateAllianceProposal {
    val builder = Gov.MsgCreateAllianceProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setDenom(obj.denom)
    builder.setRewardWeight(obj.rewardWeight)
    builder.setTakeRate(obj.takeRate)
    builder.setRewardChangeRate(obj.rewardChangeRate)
    builder.setRewardChangeInterval(DurationJvmConverter.convert(obj.rewardChangeInterval))
    builder.setRewardWeightRange(RewardWeightRangeJvmConverter.convert(obj.rewardWeightRange))
    return builder.build()
  }
}

public object MsgUpdateAllianceProposalJvmConverter :
    ProtobufTypeMapper<MsgUpdateAllianceProposal, Gov.MsgUpdateAllianceProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Gov.MsgUpdateAllianceProposal.getDescriptor()

  public override val parser: Parser<Gov.MsgUpdateAllianceProposal> =
      Gov.MsgUpdateAllianceProposal.parser()

  public override fun convert(obj: Gov.MsgUpdateAllianceProposal): MsgUpdateAllianceProposal =
      MsgUpdateAllianceProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	denom = obj.getDenom(),
  	rewardWeight = obj.getRewardWeight(),
  	takeRate = obj.getTakeRate(),
  	rewardChangeRate = obj.getRewardChangeRate(),
  	rewardChangeInterval = DurationJvmConverter.convert(obj.getRewardChangeInterval()),
  )

  public override fun convert(obj: MsgUpdateAllianceProposal): Gov.MsgUpdateAllianceProposal {
    val builder = Gov.MsgUpdateAllianceProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setDenom(obj.denom)
    builder.setRewardWeight(obj.rewardWeight)
    builder.setTakeRate(obj.takeRate)
    builder.setRewardChangeRate(obj.rewardChangeRate)
    builder.setRewardChangeInterval(DurationJvmConverter.convert(obj.rewardChangeInterval))
    return builder.build()
  }
}

public object MsgDeleteAllianceProposalJvmConverter :
    ProtobufTypeMapper<MsgDeleteAllianceProposal, Gov.MsgDeleteAllianceProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Gov.MsgDeleteAllianceProposal.getDescriptor()

  public override val parser: Parser<Gov.MsgDeleteAllianceProposal> =
      Gov.MsgDeleteAllianceProposal.parser()

  public override fun convert(obj: Gov.MsgDeleteAllianceProposal): MsgDeleteAllianceProposal =
      MsgDeleteAllianceProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: MsgDeleteAllianceProposal): Gov.MsgDeleteAllianceProposal {
    val builder = Gov.MsgDeleteAllianceProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setDenom(obj.denom)
    return builder.build()
  }
}
