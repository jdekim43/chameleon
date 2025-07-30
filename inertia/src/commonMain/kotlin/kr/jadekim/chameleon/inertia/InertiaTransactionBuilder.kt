package kr.jadekim.chameleon.inertia

import cosmos.base.v1beta1.Coin
import cosmos.crypto.secp256k1.toAny
import cosmos.tx.signing.v1beta1.SignMode
import cosmos.tx.v1beta1.*
import google.protobuf.Any

class InertiaTransactionBuilder {

    private val messages: MutableList<Any> = mutableListOf()
    private var memo: String = ""
    private var timeoutHeight: ULong = 0u
    private val extensionOptions: MutableList<Any> = mutableListOf()
    private val nonCriticalExtensionOptions: MutableList<Any> = mutableListOf()
    private val signerInfos: MutableList<SignerInfo> = mutableListOf()
    private var fee: Fee = Fee(emptyList(), 0u, "", "")
    private val signatures: MutableList<ByteArray> = mutableListOf()

    fun message(vararg message: Any): InertiaTransactionBuilder {
        this.messages.addAll(message)

        return this
    }

    fun memo(memo: String): InertiaTransactionBuilder {
        this.memo = memo

        return this
    }

    fun timeoutHeight(timeoutHeight: ULong): InertiaTransactionBuilder {
        this.timeoutHeight = timeoutHeight

        return this
    }

    fun extensionOption(vararg option: Any): InertiaTransactionBuilder {
        this.extensionOptions.addAll(option)

        return this
    }

    fun nonCriticalExtensionOption(vararg option: Any): InertiaTransactionBuilder {
        this.nonCriticalExtensionOptions.addAll(option)

        return this
    }

    fun signer(vararg signerInfo: SignerInfo): InertiaTransactionBuilder {
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

    fun fee(fee: Fee): InertiaTransactionBuilder {
        this.fee = fee

        return this
    }

    fun fee(gasLimit: ULong, vararg coin: Coin): InertiaTransactionBuilder {
        this.fee = fee.copy(amount = fee.amount + coin, gasLimit = gasLimit)

        return this
    }

    fun signature(vararg signature: ByteArray): InertiaTransactionBuilder {
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
        ),
        signatures = signatures,
    )
}