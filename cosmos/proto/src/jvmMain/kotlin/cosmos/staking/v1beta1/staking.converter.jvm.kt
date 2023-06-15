// Transform from cosmos/staking/v1beta1/staking.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import google.protobuf.AnyJvmConverter
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType
import tendermint.abci.ValidatorUpdateJvmConverter
import tendermint.types.HeaderJvmConverter

public object HistoricalInfoJvmConverter :
    ProtobufTypeMapper<HistoricalInfo, Staking.HistoricalInfo> {
  public override val descriptor: Descriptors.Descriptor = Staking.HistoricalInfo.getDescriptor()

  public override val parser: Parser<Staking.HistoricalInfo> = Staking.HistoricalInfo.parser()

  public override fun convert(obj: Staking.HistoricalInfo): HistoricalInfo = HistoricalInfo(
  	`header` = HeaderJvmConverter.convert(obj.getHeader()),
  	valset = obj.getValsetList().map { ValidatorJvmConverter.convert(it) },
  )

  public override fun convert(obj: HistoricalInfo): Staking.HistoricalInfo {
    val builder = Staking.HistoricalInfo.newBuilder()
    builder.setHeader(HeaderJvmConverter.convert(obj.`header`))
    builder.addAllValset(obj.valset.map { ValidatorJvmConverter.convert(it) })
    return builder.build()
  }
}

public object CommissionRatesJvmConverter :
    ProtobufTypeMapper<CommissionRates, Staking.CommissionRates> {
  public override val descriptor: Descriptors.Descriptor = Staking.CommissionRates.getDescriptor()

  public override val parser: Parser<Staking.CommissionRates> = Staking.CommissionRates.parser()

  public override fun convert(obj: Staking.CommissionRates): CommissionRates = CommissionRates(
  	rate = obj.getRate(),
  	maxRate = obj.getMaxRate(),
  	maxChangeRate = obj.getMaxChangeRate(),
  )

  public override fun convert(obj: CommissionRates): Staking.CommissionRates {
    val builder = Staking.CommissionRates.newBuilder()
    builder.setRate(obj.rate)
    builder.setMaxRate(obj.maxRate)
    builder.setMaxChangeRate(obj.maxChangeRate)
    return builder.build()
  }
}

public object CommissionJvmConverter : ProtobufTypeMapper<Commission, Staking.Commission> {
  public override val descriptor: Descriptors.Descriptor = Staking.Commission.getDescriptor()

  public override val parser: Parser<Staking.Commission> = Staking.Commission.parser()

  public override fun convert(obj: Staking.Commission): Commission = Commission(
  	commissionRates = CommissionRatesJvmConverter.convert(obj.getCommissionRates()),
  	updateTime = TimestampJvmConverter.convert(obj.getUpdateTime()),
  )

  public override fun convert(obj: Commission): Staking.Commission {
    val builder = Staking.Commission.newBuilder()
    builder.setCommissionRates(CommissionRatesJvmConverter.convert(obj.commissionRates))
    builder.setUpdateTime(TimestampJvmConverter.convert(obj.updateTime))
    return builder.build()
  }
}

public object DescriptionJvmConverter : ProtobufTypeMapper<Description, Staking.Description> {
  public override val descriptor: Descriptors.Descriptor = Staking.Description.getDescriptor()

  public override val parser: Parser<Staking.Description> = Staking.Description.parser()

  public override fun convert(obj: Staking.Description): Description = Description(
  	moniker = obj.getMoniker(),
  	identity = obj.getIdentity(),
  	website = obj.getWebsite(),
  	securityContact = obj.getSecurityContact(),
  	details = obj.getDetails(),
  )

  public override fun convert(obj: Description): Staking.Description {
    val builder = Staking.Description.newBuilder()
    builder.setMoniker(obj.moniker)
    builder.setIdentity(obj.identity)
    builder.setWebsite(obj.website)
    builder.setSecurityContact(obj.securityContact)
    builder.setDetails(obj.details)
    return builder.build()
  }
}

public object ValidatorJvmConverter : ProtobufTypeMapper<Validator, Staking.Validator> {
  public override val descriptor: Descriptors.Descriptor = Staking.Validator.getDescriptor()

  public override val parser: Parser<Staking.Validator> = Staking.Validator.parser()

  public override fun convert(obj: Staking.Validator): Validator = Validator(
  	operatorAddress = obj.getOperatorAddress(),
  	consensusPubkey = AnyJvmConverter.convert(obj.getConsensusPubkey()),
  	jailed = obj.getJailed(),
  	status = BondStatus.forNumber(obj.getStatus().number),
  	tokens = obj.getTokens(),
  	delegatorShares = obj.getDelegatorShares(),
  	description = DescriptionJvmConverter.convert(obj.getDescription()),
  	unbondingHeight = obj.getUnbondingHeight(),
  	unbondingTime = TimestampJvmConverter.convert(obj.getUnbondingTime()),
  	commission = CommissionJvmConverter.convert(obj.getCommission()),
  	minSelfDelegation = obj.getMinSelfDelegation(),
  	unbondingOnHoldRefCount = obj.getUnbondingOnHoldRefCount(),
  	unbondingIds = obj.getUnbondingIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: Validator): Staking.Validator {
    val builder = Staking.Validator.newBuilder()
    builder.setOperatorAddress(obj.operatorAddress)
    builder.setConsensusPubkey(AnyJvmConverter.convert(obj.consensusPubkey))
    builder.setJailed(obj.jailed)
    builder.setStatus(Staking.BondStatus.forNumber(obj.status.number))
    builder.setTokens(obj.tokens)
    builder.setDelegatorShares(obj.delegatorShares)
    builder.setDescription(DescriptionJvmConverter.convert(obj.description))
    builder.setUnbondingHeight(obj.unbondingHeight)
    builder.setUnbondingTime(TimestampJvmConverter.convert(obj.unbondingTime))
    builder.setCommission(CommissionJvmConverter.convert(obj.commission))
    builder.setMinSelfDelegation(obj.minSelfDelegation)
    builder.setUnbondingOnHoldRefCount(obj.unbondingOnHoldRefCount)
    builder.addAllUnbondingIds(obj.unbondingIds.map { it.asJavaType })
    return builder.build()
  }
}

public object ValAddressesJvmConverter : ProtobufTypeMapper<ValAddresses, Staking.ValAddresses> {
  public override val descriptor: Descriptors.Descriptor = Staking.ValAddresses.getDescriptor()

  public override val parser: Parser<Staking.ValAddresses> = Staking.ValAddresses.parser()

  public override fun convert(obj: Staking.ValAddresses): ValAddresses = ValAddresses(
  	addresses = obj.getAddressesList().map { it },
  )

  public override fun convert(obj: ValAddresses): Staking.ValAddresses {
    val builder = Staking.ValAddresses.newBuilder()
    builder.addAllAddresses(obj.addresses.map { it })
    return builder.build()
  }
}

public object DVPairJvmConverter : ProtobufTypeMapper<DVPair, Staking.DVPair> {
  public override val descriptor: Descriptors.Descriptor = Staking.DVPair.getDescriptor()

  public override val parser: Parser<Staking.DVPair> = Staking.DVPair.parser()

  public override fun convert(obj: Staking.DVPair): DVPair = DVPair(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  )

  public override fun convert(obj: DVPair): Staking.DVPair {
    val builder = Staking.DVPair.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    return builder.build()
  }
}

public object DVPairsJvmConverter : ProtobufTypeMapper<DVPairs, Staking.DVPairs> {
  public override val descriptor: Descriptors.Descriptor = Staking.DVPairs.getDescriptor()

  public override val parser: Parser<Staking.DVPairs> = Staking.DVPairs.parser()

  public override fun convert(obj: Staking.DVPairs): DVPairs = DVPairs(
  	pairs = obj.getPairsList().map { DVPairJvmConverter.convert(it) },
  )

  public override fun convert(obj: DVPairs): Staking.DVPairs {
    val builder = Staking.DVPairs.newBuilder()
    builder.addAllPairs(obj.pairs.map { DVPairJvmConverter.convert(it) })
    return builder.build()
  }
}

public object DVVTripletJvmConverter : ProtobufTypeMapper<DVVTriplet, Staking.DVVTriplet> {
  public override val descriptor: Descriptors.Descriptor = Staking.DVVTriplet.getDescriptor()

  public override val parser: Parser<Staking.DVVTriplet> = Staking.DVVTriplet.parser()

  public override fun convert(obj: Staking.DVVTriplet): DVVTriplet = DVVTriplet(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorSrcAddress = obj.getValidatorSrcAddress(),
  	validatorDstAddress = obj.getValidatorDstAddress(),
  )

  public override fun convert(obj: DVVTriplet): Staking.DVVTriplet {
    val builder = Staking.DVVTriplet.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorSrcAddress(obj.validatorSrcAddress)
    builder.setValidatorDstAddress(obj.validatorDstAddress)
    return builder.build()
  }
}

public object DVVTripletsJvmConverter : ProtobufTypeMapper<DVVTriplets, Staking.DVVTriplets> {
  public override val descriptor: Descriptors.Descriptor = Staking.DVVTriplets.getDescriptor()

  public override val parser: Parser<Staking.DVVTriplets> = Staking.DVVTriplets.parser()

  public override fun convert(obj: Staking.DVVTriplets): DVVTriplets = DVVTriplets(
  	triplets = obj.getTripletsList().map { DVVTripletJvmConverter.convert(it) },
  )

  public override fun convert(obj: DVVTriplets): Staking.DVVTriplets {
    val builder = Staking.DVVTriplets.newBuilder()
    builder.addAllTriplets(obj.triplets.map { DVVTripletJvmConverter.convert(it) })
    return builder.build()
  }
}

public object DelegationJvmConverter : ProtobufTypeMapper<Delegation, Staking.Delegation> {
  public override val descriptor: Descriptors.Descriptor = Staking.Delegation.getDescriptor()

  public override val parser: Parser<Staking.Delegation> = Staking.Delegation.parser()

  public override fun convert(obj: Staking.Delegation): Delegation = Delegation(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  	shares = obj.getShares(),
  )

  public override fun convert(obj: Delegation): Staking.Delegation {
    val builder = Staking.Delegation.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setShares(obj.shares)
    return builder.build()
  }
}

public object UnbondingDelegationJvmConverter :
    ProtobufTypeMapper<UnbondingDelegation, Staking.UnbondingDelegation> {
  public override val descriptor: Descriptors.Descriptor =
      Staking.UnbondingDelegation.getDescriptor()

  public override val parser: Parser<Staking.UnbondingDelegation> =
      Staking.UnbondingDelegation.parser()

  public override fun convert(obj: Staking.UnbondingDelegation): UnbondingDelegation =
      UnbondingDelegation(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  	entries = obj.getEntriesList().map { UnbondingDelegationEntryJvmConverter.convert(it) },
  )

  public override fun convert(obj: UnbondingDelegation): Staking.UnbondingDelegation {
    val builder = Staking.UnbondingDelegation.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.addAllEntries(obj.entries.map { UnbondingDelegationEntryJvmConverter.convert(it) })
    return builder.build()
  }
}

public object UnbondingDelegationEntryJvmConverter :
    ProtobufTypeMapper<UnbondingDelegationEntry, Staking.UnbondingDelegationEntry> {
  public override val descriptor: Descriptors.Descriptor =
      Staking.UnbondingDelegationEntry.getDescriptor()

  public override val parser: Parser<Staking.UnbondingDelegationEntry> =
      Staking.UnbondingDelegationEntry.parser()

  public override fun convert(obj: Staking.UnbondingDelegationEntry): UnbondingDelegationEntry =
      UnbondingDelegationEntry(
  	creationHeight = obj.getCreationHeight(),
  	completionTime = TimestampJvmConverter.convert(obj.getCompletionTime()),
  	initialBalance = obj.getInitialBalance(),
  	balance = obj.getBalance(),
  	unbondingId = obj.getUnbondingId().asKotlinType,
  	unbondingOnHoldRefCount = obj.getUnbondingOnHoldRefCount(),
  )

  public override fun convert(obj: UnbondingDelegationEntry): Staking.UnbondingDelegationEntry {
    val builder = Staking.UnbondingDelegationEntry.newBuilder()
    builder.setCreationHeight(obj.creationHeight)
    builder.setCompletionTime(TimestampJvmConverter.convert(obj.completionTime))
    builder.setInitialBalance(obj.initialBalance)
    builder.setBalance(obj.balance)
    builder.setUnbondingId(obj.unbondingId.asJavaType)
    builder.setUnbondingOnHoldRefCount(obj.unbondingOnHoldRefCount)
    return builder.build()
  }
}

public object RedelegationEntryJvmConverter :
    ProtobufTypeMapper<RedelegationEntry, Staking.RedelegationEntry> {
  public override val descriptor: Descriptors.Descriptor = Staking.RedelegationEntry.getDescriptor()

  public override val parser: Parser<Staking.RedelegationEntry> = Staking.RedelegationEntry.parser()

  public override fun convert(obj: Staking.RedelegationEntry): RedelegationEntry =
      RedelegationEntry(
  	creationHeight = obj.getCreationHeight(),
  	completionTime = TimestampJvmConverter.convert(obj.getCompletionTime()),
  	initialBalance = obj.getInitialBalance(),
  	sharesDst = obj.getSharesDst(),
  	unbondingId = obj.getUnbondingId().asKotlinType,
  	unbondingOnHoldRefCount = obj.getUnbondingOnHoldRefCount(),
  )

  public override fun convert(obj: RedelegationEntry): Staking.RedelegationEntry {
    val builder = Staking.RedelegationEntry.newBuilder()
    builder.setCreationHeight(obj.creationHeight)
    builder.setCompletionTime(TimestampJvmConverter.convert(obj.completionTime))
    builder.setInitialBalance(obj.initialBalance)
    builder.setSharesDst(obj.sharesDst)
    builder.setUnbondingId(obj.unbondingId.asJavaType)
    builder.setUnbondingOnHoldRefCount(obj.unbondingOnHoldRefCount)
    return builder.build()
  }
}

public object RedelegationJvmConverter : ProtobufTypeMapper<Redelegation, Staking.Redelegation> {
  public override val descriptor: Descriptors.Descriptor = Staking.Redelegation.getDescriptor()

  public override val parser: Parser<Staking.Redelegation> = Staking.Redelegation.parser()

  public override fun convert(obj: Staking.Redelegation): Redelegation = Redelegation(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorSrcAddress = obj.getValidatorSrcAddress(),
  	validatorDstAddress = obj.getValidatorDstAddress(),
  	entries = obj.getEntriesList().map { RedelegationEntryJvmConverter.convert(it) },
  )

  public override fun convert(obj: Redelegation): Staking.Redelegation {
    val builder = Staking.Redelegation.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorSrcAddress(obj.validatorSrcAddress)
    builder.setValidatorDstAddress(obj.validatorDstAddress)
    builder.addAllEntries(obj.entries.map { RedelegationEntryJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Staking.Params> {
  public override val descriptor: Descriptors.Descriptor = Staking.Params.getDescriptor()

  public override val parser: Parser<Staking.Params> = Staking.Params.parser()

  public override fun convert(obj: Staking.Params): Params = Params(
  	unbondingTime = DurationJvmConverter.convert(obj.getUnbondingTime()),
  	maxValidators = obj.getMaxValidators().asKotlinType,
  	maxEntries = obj.getMaxEntries().asKotlinType,
  	historicalEntries = obj.getHistoricalEntries().asKotlinType,
  	bondDenom = obj.getBondDenom(),
  	minCommissionRate = obj.getMinCommissionRate(),
  )

  public override fun convert(obj: Params): Staking.Params {
    val builder = Staking.Params.newBuilder()
    builder.setUnbondingTime(DurationJvmConverter.convert(obj.unbondingTime))
    builder.setMaxValidators(obj.maxValidators.asJavaType)
    builder.setMaxEntries(obj.maxEntries.asJavaType)
    builder.setHistoricalEntries(obj.historicalEntries.asJavaType)
    builder.setBondDenom(obj.bondDenom)
    builder.setMinCommissionRate(obj.minCommissionRate)
    return builder.build()
  }
}

public object DelegationResponseJvmConverter :
    ProtobufTypeMapper<DelegationResponse, Staking.DelegationResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Staking.DelegationResponse.getDescriptor()

  public override val parser: Parser<Staking.DelegationResponse> =
      Staking.DelegationResponse.parser()

  public override fun convert(obj: Staking.DelegationResponse): DelegationResponse =
      DelegationResponse(
  	delegation = DelegationJvmConverter.convert(obj.getDelegation()),
  	balance = CoinJvmConverter.convert(obj.getBalance()),
  )

  public override fun convert(obj: DelegationResponse): Staking.DelegationResponse {
    val builder = Staking.DelegationResponse.newBuilder()
    builder.setDelegation(DelegationJvmConverter.convert(obj.delegation))
    builder.setBalance(CoinJvmConverter.convert(obj.balance))
    return builder.build()
  }
}

public object RedelegationEntryResponseJvmConverter :
    ProtobufTypeMapper<RedelegationEntryResponse, Staking.RedelegationEntryResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Staking.RedelegationEntryResponse.getDescriptor()

  public override val parser: Parser<Staking.RedelegationEntryResponse> =
      Staking.RedelegationEntryResponse.parser()

  public override fun convert(obj: Staking.RedelegationEntryResponse): RedelegationEntryResponse =
      RedelegationEntryResponse(
  	redelegationEntry = RedelegationEntryJvmConverter.convert(obj.getRedelegationEntry()),
  	balance = obj.getBalance(),
  )

  public override fun convert(obj: RedelegationEntryResponse): Staking.RedelegationEntryResponse {
    val builder = Staking.RedelegationEntryResponse.newBuilder()
    builder.setRedelegationEntry(RedelegationEntryJvmConverter.convert(obj.redelegationEntry))
    builder.setBalance(obj.balance)
    return builder.build()
  }
}

public object RedelegationResponseJvmConverter :
    ProtobufTypeMapper<RedelegationResponse, Staking.RedelegationResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Staking.RedelegationResponse.getDescriptor()

  public override val parser: Parser<Staking.RedelegationResponse> =
      Staking.RedelegationResponse.parser()

  public override fun convert(obj: Staking.RedelegationResponse): RedelegationResponse =
      RedelegationResponse(
  	redelegation = RedelegationJvmConverter.convert(obj.getRedelegation()),
  	entries = obj.getEntriesList().map { RedelegationEntryResponseJvmConverter.convert(it) },
  )

  public override fun convert(obj: RedelegationResponse): Staking.RedelegationResponse {
    val builder = Staking.RedelegationResponse.newBuilder()
    builder.setRedelegation(RedelegationJvmConverter.convert(obj.redelegation))
    builder.addAllEntries(obj.entries.map { RedelegationEntryResponseJvmConverter.convert(it) })
    return builder.build()
  }
}

public object PoolJvmConverter : ProtobufTypeMapper<Pool, Staking.Pool> {
  public override val descriptor: Descriptors.Descriptor = Staking.Pool.getDescriptor()

  public override val parser: Parser<Staking.Pool> = Staking.Pool.parser()

  public override fun convert(obj: Staking.Pool): Pool = Pool(
  	notBondedTokens = obj.getNotBondedTokens(),
  	bondedTokens = obj.getBondedTokens(),
  )

  public override fun convert(obj: Pool): Staking.Pool {
    val builder = Staking.Pool.newBuilder()
    builder.setNotBondedTokens(obj.notBondedTokens)
    builder.setBondedTokens(obj.bondedTokens)
    return builder.build()
  }
}

public object ValidatorUpdatesJvmConverter :
    ProtobufTypeMapper<ValidatorUpdates, Staking.ValidatorUpdates> {
  public override val descriptor: Descriptors.Descriptor = Staking.ValidatorUpdates.getDescriptor()

  public override val parser: Parser<Staking.ValidatorUpdates> = Staking.ValidatorUpdates.parser()

  public override fun convert(obj: Staking.ValidatorUpdates): ValidatorUpdates = ValidatorUpdates(
  	updates = obj.getUpdatesList().map { ValidatorUpdateJvmConverter.convert(it) },
  )

  public override fun convert(obj: ValidatorUpdates): Staking.ValidatorUpdates {
    val builder = Staking.ValidatorUpdates.newBuilder()
    builder.addAllUpdates(obj.updates.map { ValidatorUpdateJvmConverter.convert(it) })
    return builder.build()
  }
}
