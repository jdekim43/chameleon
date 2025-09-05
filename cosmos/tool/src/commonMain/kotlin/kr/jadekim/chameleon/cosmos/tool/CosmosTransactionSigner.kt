package kr.jadekim.chameleon.cosmos.tool

import cosmos.crypto.secp256k1.toAny
import cosmos.tx.signing.v1beta1.SignMode
import cosmos.tx.v1beta1.AuthInfoConverter.toByteArray
import cosmos.tx.v1beta1.ModeInfo
import cosmos.tx.v1beta1.SignDoc
import cosmos.tx.v1beta1.SignDocConverter.toByteArray
import cosmos.tx.v1beta1.SignerInfo
import cosmos.tx.v1beta1.Tx
import cosmos.tx.v1beta1.TxBodyConverter.toByteArray
import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.key.SignableKey
import kr.jadekim.chameleon.core.tool.TransactionSigner
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.cosmos.wallet.CosmosWallet

data class CosmosSignature(
    val address: String,
    val signerInfo: SignerInfo,
    val signature: ByteArray,
)

interface CosmosTransactionSigner : TransactionSigner<Tx> {

    val signMode: SignMode
}

open class CosmosTransactionDirectSigner(
    val accountInfoProvider: AccountInfoProvider,
) : CosmosTransactionSigner {

    override val signMode: SignMode = SignMode.SIGN_MODE_DIRECT

    override suspend fun invoke(
        transaction: Tx,
        wallet: Wallet,
        chainId: String,
    ): Tx = sign(transaction, wallet, chainId).second

    suspend fun sign(transaction: Tx, wallet: Wallet, chainId: String): Pair<CosmosSignature, Tx> {
        val key = wallet.key as? SignableKey ?: throw IllegalArgumentException("Wallet is not a signable key")
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

    protected open fun List<SignerInfo>.findByAddress(address: String): SignerInfo? = find {
        it.publicKey.typeUrl == cosmos.crypto.secp256k1.PubKey.TYPE_URL
                && CosmosWallet(cosmos.crypto.secp256k1.PubKeyConverter.deserialize(it.publicKey.value).key).address.text == address
    }

    protected open fun createSignerInfo(key: Key, accountInfo: AccountInfo) = SignerInfo(
        cosmos.crypto.secp256k1.PubKey(key.publicKey).toAny(),
        ModeInfo(ModeInfo.SumOneOf.Single(ModeInfo.Single(SignMode.SIGN_MODE_DIRECT))),
        accountInfo.sequence,
    )
}
