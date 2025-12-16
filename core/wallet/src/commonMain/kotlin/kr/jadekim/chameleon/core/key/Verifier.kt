package kr.jadekim.chameleon.core.key

import kr.jadekim.common.encoder.Encoder
import kr.jadekim.common.encoder.decode
import kr.jadekim.common.extension.utf8

interface Verifier {

    fun verify(message: ByteArray, signature: ByteArray): Boolean
}

fun Verifier.verify(message: String, signature: ByteArray) = verify(message.utf8(), signature)

fun Verifier.verify(message: ByteArray, signature: String, signatureEncoder: Encoder<ByteArray, String>) =
    verify(message, signature.decode(signatureEncoder))

fun Verifier.verify(message: String, signature: String, signatureEncoder: Encoder<ByteArray, String>) =
    verify(message.utf8(), signature.decode(signatureEncoder))