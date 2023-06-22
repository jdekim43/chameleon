package kr.jadekim.chameleon.cosmos

import cosmos.base.v1beta1.Coin
import cosmos.crypto.secp256k1.toAny
import cosmos.tx.signing.v1beta1.SignMode
import cosmos.tx.v1beta1.*
import google.protobuf.Any

class CosmosTransactionBuilder {

    private val messages: MutableList<Any> = mutableListOf()
    private var memo: String = ""
    private var timeoutHeight: ULong = 0u
    private val extensionOptions: MutableList<Any> = mutableListOf()
    private val nonCriticalExtensionOptions: MutableList<Any> = mutableListOf()
    private val signerInfos: MutableList<SignerInfo> = mutableListOf()
    private var fee: Fee = Fee(emptyList(), 0u, "", "")
    private var tip: Tip = Tip(emptyList(), "")
    private val signatures: MutableList<ByteArray> = mutableListOf()

    fun message(vararg message: Any): CosmosTransactionBuilder {
        this.messages.addAll(message)

        return this
    }

    fun memo(memo: String): CosmosTransactionBuilder {
        this.memo = memo

        return this
    }

    fun timeoutHeight(timeoutHeight: ULong): CosmosTransactionBuilder {
        this.timeoutHeight = timeoutHeight

        return this
    }

    fun extensionOption(vararg option: Any): CosmosTransactionBuilder {
        this.extensionOptions.addAll(option)

        return this
    }

    fun nonCriticalExtensionOption(vararg option: Any): CosmosTransactionBuilder {
        this.nonCriticalExtensionOptions.addAll(option)

        return this
    }

    fun signer(vararg signerInfo: SignerInfo): CosmosTransactionBuilder {
        this.signerInfos.addAll(signerInfo)

        return this
    }

    fun signer(publicKey: Any, sequence: ULong, signMode: SignMode = SignMode.SIGN_MODE_DIRECT) = signer(
        SignerInfo(
            publicKey,
            ModeInfo(ModeInfo.SumOneOf.Single(ModeInfo.Single(signMode))),
            sequence,
        )
    )

    fun signer(publicKey: ByteArray, sequence: ULong, signMode: SignMode = SignMode.SIGN_MODE_DIRECT) = signer(
        cosmos.crypto.secp256k1.PubKey(publicKey).toAny(),
        sequence,
        signMode,
    )

    fun fee(fee: Fee): CosmosTransactionBuilder {
        this.fee = fee

        return this
    }

    fun fee(gasLimit: ULong, vararg coin: Coin): CosmosTransactionBuilder {
        this.fee = fee.copy(amount = fee.amount + coin, gasLimit = gasLimit)

        return this
    }

    fun tip(tip: Tip): CosmosTransactionBuilder {
        this.tip = tip

        return this
    }

    fun signature(vararg signature: ByteArray): CosmosTransactionBuilder {
        this.signatures.addAll(signature)

        return this
    }

    fun build() = Tx(
        body = TxBody(
            messages = messages,
            memo = memo,
            timeoutHeight = timeoutHeight,
            extensionOptions = extensionOptions,
            nonCriticalExtensionOptions = nonCriticalExtensionOptions,
        ),
        authInfo = AuthInfo(
            signerInfos = signerInfos,
            fee = fee,
            tip = tip,
        ),
        signatures = signatures,
    )
}