package kr.jadekim.chameleon.injective.tool

import cosmos.tx.signing.v1beta1.SignMode
import cosmos.tx.v1beta1.ModeInfo
import cosmos.tx.v1beta1.SignerInfo
import injective.crypto.v1beta1.ethsecp256k1.PubKeyConverter
import injective.crypto.v1beta1.ethsecp256k1.toAny
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.chameleon.cosmos.tool.AccountInfo
import kr.jadekim.chameleon.cosmos.tool.AccountInfoProvider
import kr.jadekim.chameleon.cosmos.tool.CosmosTransactionDirectSigner
import kr.jadekim.chameleon.cosmos.tool.CosmosTransactionSigner
import kr.jadekim.chameleon.injective.key.InjectiveSecp256k1PublicKey
import kr.jadekim.chameleon.injective.wallet.InjectiveAddress

interface InjectiveTransactionSigner : CosmosTransactionSigner

class InjectiveTransactionDirectSigner(
    accountInfoProvider: AccountInfoProvider,
) : InjectiveTransactionSigner, CosmosTransactionDirectSigner(accountInfoProvider) {

    override fun List<SignerInfo>.findByAddress(address: String): SignerInfo? = find {
        if (it.publicKey.typeUrl != injective.crypto.v1beta1.ethsecp256k1.PubKey.TYPE_URL) {
            return@find false
        }

        val publicKey = InjectiveSecp256k1PublicKey(PubKeyConverter.deserialize(it.publicKey.value).key)

        return@find InjectiveAddress.createAccountAddress(publicKey).text == address
    }

    override fun createSignerInfo(key: PublicKey, accountInfo: AccountInfo) = SignerInfo(
        injective.crypto.v1beta1.ethsecp256k1.PubKey(key.publicKey).toAny(),
        ModeInfo(ModeInfo.SumOneOf.Single(ModeInfo.Single(SignMode.SIGN_MODE_DIRECT))),
        accountInfo.sequence,
    )
}
