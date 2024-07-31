package kr.jadekim.chameleon.injective.tool

import cosmos.tx.signing.v1beta1.SignMode
import cosmos.tx.v1beta1.AuthInfoConverter.toByteArray
import cosmos.tx.v1beta1.ModeInfo
import cosmos.tx.v1beta1.SignDoc
import cosmos.tx.v1beta1.SignDocConverter.toByteArray
import cosmos.tx.v1beta1.SignerInfo
import cosmos.tx.v1beta1.Tx
import cosmos.tx.v1beta1.TxBodyConverter.toByteArray
import injective.crypto.v1beta1.ethsecp256k1.PubKeyConverter
import injective.crypto.v1beta1.ethsecp256k1.toAny
import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.cosmos.tool.AccountInfo
import kr.jadekim.chameleon.cosmos.tool.AccountInfoProvider
import kr.jadekim.chameleon.cosmos.tool.CosmosSignature
import kr.jadekim.chameleon.cosmos.tool.CosmosTransactionSigner
import kr.jadekim.chameleon.injective.key.InjectivePublicKey
import kr.jadekim.chameleon.injective.wallet.InjectiveAddress

interface InjectiveTransactionSigner : CosmosTransactionSigner

class InjectiveTransactionDirectSigner(
    val accountInfoProvider: AccountInfoProvider,
) : InjectiveTransactionSigner {

    override val signMode: SignMode = SignMode.SIGN_MODE_DIRECT

    override suspend fun invoke(
        transaction: Tx,
        wallet: Wallet,
        chainId: String,
    ): Tx = sign(transaction, wallet, chainId).second

    suspend fun sign(transaction: Tx, wallet: Wallet, chainId: String): Pair<CosmosSignature, Tx> {
        val key = wallet.key ?: throw IllegalArgumentException("Wallet must have a key")
        var signerInfo = transaction.authInfo.signerInfos.findByAddress(wallet.address.text)
        val isProvidedSignerInfo = signerInfo != null
        val accountInfo = accountInfoProvider.get(wallet.address.text) ?: AccountInfo(wallet)

        if (signerInfo == null) {
            signerInfo = createSignerInfo(key, accountInfo)
        }

        if (signerInfo.sequence == 0uL && accountInfo.sequence != 0uL) {
            signerInfo = signerInfo.copy(sequence = accountInfo.sequence)
        }

        val document = SignDoc(
            transaction.body.toByteArray(),
            transaction.authInfo.copy(signerInfos = listOf(signerInfo)).toByteArray(),
            chainId,
            accountInfo.accountNumber,
        )
        val signature = key.sign(document.toByteArray()).await()

        val authInfo = if (isProvidedSignerInfo) {
            transaction.authInfo
        } else {
            transaction.authInfo.copy(signerInfos = transaction.authInfo.signerInfos + signerInfo)
        }
        val signedTransaction = transaction.copy(
            authInfo = authInfo,
            signatures = transaction.signatures + signature,
        )

        return CosmosSignature(wallet.address.text, signerInfo, signature) to signedTransaction
    }

    private fun List<SignerInfo>.findByAddress(address: String): SignerInfo? = find {
        if (it.publicKey.typeUrl != injective.crypto.v1beta1.ethsecp256k1.PubKey.TYPE_URL) {
            return@find false
        }

        val publicKey = InjectivePublicKey(PubKeyConverter.deserialize(it.publicKey.value).key)

        return@find InjectiveAddress.createAccountAddress(publicKey).text == address
    }

    private fun createSignerInfo(key: Key, accountInfo: AccountInfo) = SignerInfo(
        injective.crypto.v1beta1.ethsecp256k1.PubKey(key.publicKey).toAny(),
        ModeInfo(ModeInfo.SumOneOf.Single(ModeInfo.Single(SignMode.SIGN_MODE_DIRECT))),
        accountInfo.sequence,
    )
}
