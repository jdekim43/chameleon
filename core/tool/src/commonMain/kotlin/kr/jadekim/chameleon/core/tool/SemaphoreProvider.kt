package kr.jadekim.chameleon.core.tool

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import kr.jadekim.chameleon.core.tool.broadcaster.BroadcastEventHandler
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet

interface SemaphoreProvider {

    suspend fun acquire(vararg key: String)

    suspend fun acquire(keys: List<String>)

    suspend fun release(vararg key: String)

    suspend fun release(keys: List<String>)
}

open class TransactionSenderLockHandler<Transaction : Any, TransactionResult : Any>(
    private val semaphore: SemaphoreProvider,
) : BroadcastEventHandler<Transaction, TransactionResult> {

    override suspend fun onStart(chainId: String, sender: Wallet, transaction: Transaction) {
        semaphore.acquire(key(chainId, sender))
    }

    override suspend fun onFinish(
        chainId: String,
        sender: Wallet,
        transaction: Transaction,
        result: TransactionResult
    ) {
        semaphore.release(key(chainId, sender))
    }

    override suspend fun onError(chainId: String, sender: Wallet, transaction: Transaction, reason: Throwable) {
        semaphore.release(key(chainId, sender))
    }

    protected fun key(chainId: String, sender: Wallet) = "$chainId:${sender.address.text}"
}

suspend fun <T> SemaphoreProvider.use(chainId: String, addresses: List<Address>, block: suspend () -> T): T {
    val keys = addresses.map { "$chainId:$it" }

    acquire(keys)

    try {
        return block()
    } finally {
        release(keys)
    }
}

suspend fun <T> SemaphoreProvider.use(
    chainId: String,
    vararg address: Address,
    block: suspend () -> T,
): T = this.use(chainId, address.toList(), block)

suspend fun <T> SemaphoreProvider?.useIfAble(
    chainId: String,
    address: List<Address>,
    block: suspend () -> T,
): T {
    if (this == null) {
        return block()
    }

    return use(chainId, address, block)
}

suspend fun <T> SemaphoreProvider?.useIfAble(
    chainId: String,
    vararg address: Address,
    block: suspend () -> T,
): T {
    if (this == null) {
        return block()
    }

    return use(chainId, address.toList(), block)
}

object LocalSemaphoreProvider : SemaphoreProvider {

    private val acquireSemaphore = Semaphore(1)
    private val semaphores = mutableMapOf<String, Semaphore>()

    var retryDelayMillis: Long = 50

    override suspend fun acquire(vararg key: String) = acquire(key.toList())

    override suspend fun acquire(keys: List<String>) = coroutineScope {
        while (isActive) {
            try {
                acquireSemaphore.withPermit {
                    val semaphores = keys.map { semaphores.getOrPut(it) { Semaphore(1) } }

                    if (semaphores.any { it.availablePermits == 0 }) {
                        delay(retryDelayMillis)
                        return@withPermit
                    }

                    semaphores.forEach { it.acquire() }
                }
            } catch (e: CancellationException) {
                release(keys)
            } catch (e: kotlinx.coroutines.CancellationException) {
                release(keys)
            }
        }
    }

    override suspend fun release(vararg key: String) = release(key.toList())

    override suspend fun release(keys: List<String>) {
        withContext(NonCancellable) {
            acquireSemaphore.withPermit {
                keys.forEach { semaphores.remove(it)?.release() }
            }
        }
    }
}
