package kr.jadekim.chameleon.core.crypto.secp256r1

import com.carterharrison.ecdsa.EcPoint
import com.ionspin.kotlin.bignum.integer.BigInteger
import com.ionspin.kotlin.bignum.integer.Sign
import kotlin.random.Random
import com.carterharrison.ecdsa.curves.Secp256r1 as Secp256r1Curve

object Secp256r1 {
    // secp256r1 (P-256) 곡선
    private val curve = Secp256r1Curve
    private val n = curve.n
    private val p = curve.p

    fun verify(signature: ByteArray, message: ByteArray, publicKey: ByteArray): Boolean {
        require(signature.size == 64) { "Signature must be 64 bytes" }
        require(message.size == 32) { "Message must be 32 bytes (hash)" }

        val r = BigInteger.fromByteArray(signature.copyOfRange(0, 32), Sign.POSITIVE)
        val s = BigInteger.fromByteArray(signature.copyOfRange(32, 64), Sign.POSITIVE)

        // Verify r and s are in valid range
        if (r < BigInteger.ONE || r >= n || s < BigInteger.ONE || s >= n) {
            return false
        }

        val e = BigInteger.fromByteArray(message, Sign.POSITIVE)
        val point = try {
            decodePublicKey(publicKey)
        } catch (e: Exception) {
            return false
        }

        // w = s^-1 mod n
        val w = s.modInverse(n)

        // u1 = e*w mod n
        val u1 = (e * w).mod(n)

        // u2 = r*w mod n
        val u2 = (r * w).mod(n)

        // (x, y) = u1*G + u2*Q
        val point1 = curve.g * u1
        val point2 = point * u2
        val result = point1 + point2

        // Verify r == x mod n
        return result.x.mod(n) == r
    }

    fun isValidPrivateKey(privateKey: ByteArray): Boolean {
        if (privateKey.size != 32) return false
        val key = BigInteger.fromByteArray(privateKey, Sign.POSITIVE)
        return key > BigInteger.ZERO && key < n
    }

    fun isValidPublicKey(publicKey: ByteArray): Boolean {
        return try {
            when (publicKey.size) {
                33 -> publicKey[0] == 0x02.toByte() || publicKey[0] == 0x03.toByte()
                65 -> publicKey[0] == 0x04.toByte()
                else -> false
            }
        } catch (e: Exception) {
            false
        }
    }

    fun privateKeyTweakAdd(privateKey: ByteArray, tweak: ByteArray): ByteArray {
        val key = BigInteger.fromByteArray(privateKey, Sign.POSITIVE)
        val tweakValue = BigInteger.fromByteArray(tweak, Sign.POSITIVE)
        val result = (key + tweakValue).mod(n)
        require(result != BigInteger.ZERO) { "Invalid tweak: result is zero" }
        return result.toByteArray().padOrTrim(32)
    }

    fun privateKeyNegate(privateKey: ByteArray): ByteArray {
        val key = BigInteger.fromByteArray(privateKey, Sign.POSITIVE)
        val result = (n - key).mod(n)
        return result.toByteArray().padOrTrim(32)
    }

    fun privateKeyTweakMul(privateKey: ByteArray, tweak: ByteArray): ByteArray {
        val key = BigInteger.fromByteArray(privateKey, Sign.POSITIVE)
        val tweakValue = BigInteger.fromByteArray(tweak, Sign.POSITIVE)
        val result = (key * tweakValue).mod(n)
        require(result != BigInteger.ZERO) { "Invalid tweak: result is zero" }
        return result.toByteArray().padOrTrim(32)
    }

    fun createPublicKey(privateKey: ByteArray): ByteArray {
        val key = BigInteger.fromByteArray(privateKey, Sign.POSITIVE)
        val point = curve * key
        return encodePublicKey(point, compressed = true)
    }

    fun publicKeyNegate(publicKey: ByteArray): ByteArray {
        val point = decodePublicKey(publicKey)
        val negated = EcPoint(point.x, (p - point.y).mod(p), curve)
        return encodePublicKey(negated, compressed = publicKey.size == 33)
    }

    fun publicKeyTweakMul(publicKey: ByteArray, tweak: ByteArray): ByteArray {
        val point = decodePublicKey(publicKey)
        val tweakValue = BigInteger.fromByteArray(tweak, Sign.POSITIVE)
        val result = point * tweakValue
        return encodePublicKey(result, compressed = publicKey.size == 33)
    }

    fun combinePublicKey(publicKeys: Array<ByteArray>): ByteArray {
        require(publicKeys.isNotEmpty()) { "No public keys to combine" }

        var result = decodePublicKey(publicKeys[0])
        for (i in 1 until publicKeys.size) {
            val point = decodePublicKey(publicKeys[i])
            result += point
        }

        return encodePublicKey(result, compressed = true)
    }

    fun compressPublicKey(uncompressed: ByteArray): ByteArray {
        require(uncompressed.size == 65 && uncompressed[0] == 0x04.toByte()) {
            "Invalid uncompressed public key"
        }
        val point = decodePublicKey(uncompressed)
        return encodePublicKey(point, compressed = true)
    }

    fun decompressPublicKey(compressed: ByteArray): ByteArray {
        require(compressed.size == 33 && (compressed[0] == 0x02.toByte() || compressed[0] == 0x03.toByte())) {
            "Invalid compressed public key"
        }
        val point = decodePublicKey(compressed)
        return encodePublicKey(point, compressed = false)
    }

    fun recoveryPublicKey(signature: ByteArray, message: ByteArray, recoveryId: Int): ByteArray {
        require(signature.size == 64) { "Signature must be 64 bytes" }
        require(recoveryId in 0..3) { "Recovery ID must be 0-3" }

        val r = BigInteger.fromByteArray(signature.copyOfRange(0, 32), Sign.POSITIVE)
        val s = BigInteger.fromByteArray(signature.copyOfRange(32, 64), Sign.POSITIVE)
        val e = BigInteger.fromByteArray(message, Sign.POSITIVE)

        // Calculate x coordinate based on recovery ID
        val x = if (recoveryId >= 2) r + n else r

        // Calculate y from x (y^2 = x^3 + ax + b mod p)
        val three = BigInteger.fromInt(3)
        val ySquared = (x.pow(three) + curve.a * x + curve.b).mod(p)

        // Use modular exponentiation: y = ySquared^((p+1)/4) mod p
        val exponent = (p + BigInteger.ONE) / BigInteger.fromInt(4)
        val y = modPow(ySquared, exponent, p)

        // Select y based on parity
        val yActual = if ((recoveryId and 1) == (if (y.isOdd()) 1 else 0)) y else p - y

        val R = EcPoint(x, yActual, curve)
        val rInv = r.modInverse(n)

        // Q = rInv * (s*R - e*G)
        val sR = R * s
        val eG = curve.g * e
        val negEG = EcPoint(eG.x, (p - eG.y).mod(p), curve)
        val point = (sR + negEG) * rInv

        return encodePublicKey(point, compressed = true)
    }

    fun sign(message: ByteArray, privateKey: ByteArray): ByteArray {
        require(message.size == 32) { "Message must be 32 bytes (hash)" }
        require(isValidPrivateKey(privateKey)) { "Invalid private key" }

        val key = BigInteger.fromByteArray(privateKey, Sign.POSITIVE)
        val e = BigInteger.fromByteArray(message, Sign.POSITIVE)

        // RFC 6979 deterministic k generation would be ideal, but for simplicity using random
        var r = BigInteger.ZERO
        var s = BigInteger.ZERO

        while (r == BigInteger.ZERO || s == BigInteger.ZERO) {
            // Generate random k
            val k = generateK()

            // r = (k*G).x mod n
            val point = curve.g * k
            r = point.x.mod(n)

            if (r == BigInteger.ZERO) continue

            // s = k^-1 * (e + r*key) mod n
            val kInv = k.modInverse(n)
            s = (kInv * (e + r * key)).mod(n)
        }

        // Ensure low S value (BIP 62)
        val halfN = n shr 1
        if (s > halfN) {
            s = n - s
        }

        return r.toByteArray().padOrTrim(32) + s.toByteArray().padOrTrim(32)
    }

    private fun generateK(): BigInteger {
        val bytes = ByteArray(32)
        do {
            Random.nextBytes(bytes)
            val k = BigInteger.fromByteArray(bytes, Sign.POSITIVE)
            if (k > BigInteger.ZERO && k < n) return k
        } while (true)
    }

    private fun decodePublicKey(publicKey: ByteArray): EcPoint {
        return when (publicKey.size) {
            33 -> {
                // Compressed format: 0x02 or 0x03 + x
                val prefix = publicKey[0]
                require(prefix == 0x02.toByte() || prefix == 0x03.toByte()) {
                    "Invalid compressed public key prefix"
                }
                val x = BigInteger.fromByteArray(publicKey.copyOfRange(1, 33), Sign.POSITIVE)

                // Calculate y from x (y^2 = x^3 + ax + b mod p)
                val three = BigInteger.fromInt(3)
                val ySquared = (x.pow(three) + curve.a * x + curve.b).mod(p)
                val exponent = (p + BigInteger.ONE) / BigInteger.fromInt(4)
                val y = modPow(ySquared, exponent, p)

                // Select y based on prefix
                val yActual = if ((prefix.toInt() and 1) == (if (y.isOdd()) 1 else 0)) y else p - y

                EcPoint(x, yActual, curve)
            }
            65 -> {
                // Uncompressed format: 0x04 + x + y
                require(publicKey[0] == 0x04.toByte()) { "Invalid uncompressed public key prefix" }
                val x = BigInteger.fromByteArray(publicKey.copyOfRange(1, 33), Sign.POSITIVE)
                val y = BigInteger.fromByteArray(publicKey.copyOfRange(33, 65), Sign.POSITIVE)
                EcPoint(x, y, curve)
            }
            else -> throw IllegalArgumentException("Invalid public key size: ${publicKey.size}")
        }
    }

    private fun encodePublicKey(point: EcPoint, compressed: Boolean): ByteArray {
        return if (compressed) {
            val prefix = if (point.y.isOdd()) 0x03.toByte() else 0x02.toByte()
            byteArrayOf(prefix) + point.x.toByteArray().padOrTrim(32)
        } else {
            byteArrayOf(0x04.toByte()) + point.x.toByteArray().padOrTrim(32) + point.y.toByteArray().padOrTrim(32)
        }
    }

    private fun ByteArray.padOrTrim(size: Int): ByteArray {
        return when {
            this.size == size -> this
            this.size > size -> this.copyOfRange(this.size - size, this.size)
            else -> ByteArray(size - this.size) + this
        }
    }

    private fun BigInteger.isOdd(): Boolean = (this and BigInteger.ONE) == BigInteger.ONE

    private fun modPow(base: BigInteger, exponent: BigInteger, modulus: BigInteger): BigInteger {
        return base.toModularBigInteger(modulus).pow(exponent).residue
    }
}