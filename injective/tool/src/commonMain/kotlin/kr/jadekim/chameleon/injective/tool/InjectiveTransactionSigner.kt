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
import kr.jadekim.chameleon.cosmos.tool.*
import kr.jadekim.chameleon.injective.key.InjectivePublicKey
import kr.jadekim.chameleon.injective.wallet.InjectiveAddress

interface InjectiveTransactionSigner : CosmosTransactionSigner

class InjectiveTransactionDirectSigner(
    accountInfoProvider: AccountInfoProvider,
) : InjectiveTransactionSigner, CosmosTransactionDirectSigner(accountInfoProvider) {

    override fun List<SignerInfo>.findByAddress(address: String): SignerInfo? = find {
        if (it.publicKey.typeUrl != injective.crypto.v1beta1.ethsecp256k1.PubKey.TYPE_URL) {
            return@find false
        }

        val publicKey = InjectivePublicKey(PubKeyConverter.deserialize(it.publicKey.value).key)

        return@find InjectiveAddress.createAccountAddress(publicKey).text == address
    }

    override fun createSignerInfo(key: Key, accountInfo: AccountInfo) = SignerInfo(
        injective.crypto.v1beta1.ethsecp256k1.PubKey(key.publicKey).toAny(),
        ModeInfo(ModeInfo.SumOneOf.Single(ModeInfo.Single(SignMode.SIGN_MODE_DIRECT))),
        accountInfo.sequence,
    )
}
