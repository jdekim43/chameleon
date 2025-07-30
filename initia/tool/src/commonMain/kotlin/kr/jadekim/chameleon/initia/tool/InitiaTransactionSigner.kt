package kr.jadekim.chameleon.initia.tool

import cosmos.crypto.secp256k1.toAny
import cosmos.tx.signing.v1beta1.SignMode
import cosmos.tx.v1beta1.ModeInfo
import cosmos.tx.v1beta1.SignerInfo
import initia.crypto.v1beta1.ethsecp256k1.toAny
import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.cosmos.tool.AccountInfo
import kr.jadekim.chameleon.cosmos.tool.AccountInfoProvider
import kr.jadekim.chameleon.cosmos.tool.CosmosTransactionDirectSigner
import kr.jadekim.chameleon.cosmos.tool.CosmosTransactionSigner
import kr.jadekim.chameleon.initia.key.InitiaCosmosPublicKey
import kr.jadekim.chameleon.initia.key.InitiaEthPublicKey
import kr.jadekim.chameleon.initia.wallet.InitiaAddress

interface InitiaTransactionSigner : CosmosTransactionSigner

class InitiaTransactionDirectSigner(
    accountInfoProvider: AccountInfoProvider,
) : InitiaTransactionSigner, CosmosTransactionDirectSigner(accountInfoProvider) {

    private val supportPublicKeyTypes = listOf(
        initia.crypto.v1beta1.ethsecp256k1.PubKey.TYPE_URL,
        cosmos.crypto.secp256k1.PubKey.TYPE_URL,
    )

    override fun List<SignerInfo>.findByAddress(address: String): SignerInfo? = find {
        val publicKey = when (it.publicKey.typeUrl) {
            cosmos.crypto.secp256k1.PubKey.TYPE_URL -> InitiaCosmosPublicKey(
                cosmos.crypto.secp256k1.PubKeyConverter.deserialize(it.publicKey.value).key
            )

            initia.crypto.v1beta1.ethsecp256k1.PubKey.TYPE_URL -> InitiaEthPublicKey(
                initia.crypto.v1beta1.ethsecp256k1.PubKeyConverter.deserialize(it.publicKey.value).key
            )

            else -> return@find false
        }

        return@find InitiaAddress.createAccountAddress(publicKey).text == address
    }

    override fun createSignerInfo(key: Key, accountInfo: AccountInfo): SignerInfo {
        val publicKeyAny = when (key) {
            is InitiaCosmosPublicKey -> cosmos.crypto.secp256k1.PubKey(key.publicKey).toAny()
            is InitiaEthPublicKey -> initia.crypto.v1beta1.ethsecp256k1.PubKey(key.publicKey).toAny()
            else -> cosmos.crypto.secp256k1.PubKey(key.publicKey).toAny()
        }
        return SignerInfo(
            publicKeyAny,
            ModeInfo(ModeInfo.SumOneOf.Single(ModeInfo.Single(SignMode.SIGN_MODE_DIRECT))),
            accountInfo.sequence,
        )
    }
}
