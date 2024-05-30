package kr.jadekim.chameleon.cosmos.tool

import kr.jadekim.chameleon.core.wallet.Wallet

data class AccountInfo(
    val address: String,
    val accountNumber: ULong,
    val sequence: ULong,
) {

    constructor(wallet: Wallet) : this(wallet.address.text, 0u, 0u)
}

interface AccountInfoProvider {

    suspend fun get(walletAddress: String): AccountInfo?

    suspend fun increaseSequence(walletAddress: String)

    suspend fun refreshSequence(walletAddress: String)
}

abstract class CachedAccountInfoProvider(
    private val provider: AccountInfoProvider,
) : AccountInfoProvider {

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

    private val data = mutableMapOf<String, AccountInfo>()

    override suspend fun getCached(walletAddress: String): AccountInfo? = data[walletAddress]

    override suspend fun setCache(walletAddress: String, accountInfo: AccountInfo) {
        data[walletAddress] = accountInfo
    }

    override suspend fun refreshSequence(walletAddress: String) {
        data.clear()
    }
}
