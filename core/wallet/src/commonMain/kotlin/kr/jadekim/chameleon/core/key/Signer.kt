package kr.jadekim.chameleon.core.key

import kotlinx.coroutines.Deferred
import kr.jadekim.common.extension.utf8

interface Signer {

    fun sign(message: ByteArray): Deferred<ByteArray>
}

fun Signer.sign(message: String): Deferred<ByteArray> = sign(message.utf8())