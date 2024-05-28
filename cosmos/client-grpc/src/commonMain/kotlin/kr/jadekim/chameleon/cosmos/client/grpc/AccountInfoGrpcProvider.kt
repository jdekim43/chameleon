package kr.jadekim.chameleon.cosmos.client.grpc

import cosmos.auth.v1beta1.QueryAccountRequest
import io.grpc.Status
import io.grpc.StatusException
import kr.jadekim.chameleon.cosmos.tool.AccountInfo
import kr.jadekim.chameleon.cosmos.tool.AccountInfoProvider

class AlwaysFetchAccountInfoProvider(client: CosmosGrpcClient) : AccountInfoProvider {

    private val service = client.service(cosmos.auth.v1beta1.grpc.QueryGrpc)

    override suspend fun get(walletAddress: String): AccountInfo? {
        val account = try {
            service.account(QueryAccountRequest(walletAddress)).account
        } catch (e: StatusException) {
            if (e.status == Status.NOT_FOUND) {
                return null
            }

            throw e
        }

        //todo: replace to service.accountInfo (It is supported at cosmos-sdk v0.47)
        val baseAccount = when (account.typeUrl) {
            cosmos.auth.v1beta1.BaseAccount.TYPE_URL -> cosmos.auth.v1beta1.BaseAccountConverter.deserialize(account.value)
            cosmos.vesting.v1beta1.PeriodicVestingAccount.TYPE_URL -> cosmos.vesting.v1beta1.PeriodicVestingAccountConverter
                .deserialize(account.value).baseVestingAccount.baseAccount

            else -> throw IllegalArgumentException("Cannot acceptable account type (${account.typeUrl})")
        }

        return AccountInfo(
            baseAccount.address,
            baseAccount.accountNumber,
            baseAccount.sequence,
        )
    }

    override suspend fun increaseSequence(walletAddress: String) {
        //do nothing
    }

    override suspend fun refreshSequence(walletAddress: String) {
        //do nothing
    }
}

abstract class CachedAccountInfoProvider(
    private val provider: AccountInfoProvider,
) : AccountInfoProvider {

    constructor(client: CosmosGrpcClient) : this(AlwaysFetchAccountInfoProvider(client))

    abstract suspend fun getCached(walletAddress: String): AccountInfo?

    abstract suspend fun setCache(walletAddress: String, accountInfo: AccountInfo)

    override suspend fun get(walletAddress: String): AccountInfo? {
        var cached = getCached(walletAddress)

        if (cached == null) {
            cached = provider.get(walletAddress) ?: return null
            setCache(walletAddress, cached)
        }

        return cached
    }

    override suspend fun increaseSequence(walletAddress: String) {
        getCached(walletAddress)?.let {
            setCache(walletAddress, it.copy(sequence = it.sequence + 1u))
        }
    }
}

class LocalCachedAccountInfoProvider(
    provider: AccountInfoProvider,
) : CachedAccountInfoProvider(provider) {

    constructor(client: CosmosGrpcClient) : this(AlwaysFetchAccountInfoProvider(client))

    private val data = mutableMapOf<String, AccountInfo>()

    override suspend fun getCached(walletAddress: String): AccountInfo? = data[walletAddress]

    override suspend fun setCache(walletAddress: String, accountInfo: AccountInfo) {
        data[walletAddress] = accountInfo
    }

    override suspend fun refreshSequence(walletAddress: String) {
        data.clear()
    }
}