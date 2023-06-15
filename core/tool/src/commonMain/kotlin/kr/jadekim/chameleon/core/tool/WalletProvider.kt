package kr.jadekim.chameleon.core.tool

import kr.jadekim.chameleon.core.wallet.Wallet

/**
 * TODO:
 * There is use-case that transaction requires sign with multiple wallet not multisig (e.g. pay transaction fee by proxy)
 * But current architecture is optimized for single wallet signing.
 * Because when you call the 'broadcast' function, you should pass an wallet.
 * If exist wallet provider, It will be able to pass only transaction parameter with signer info.
 * This makes able to use multiple wallet in broadcaster.
 */
@Deprecated("Not Implemented", level = DeprecationLevel.ERROR)
interface WalletProvider {
    
    suspend fun get(address: String, chainId: String): Wallet
}