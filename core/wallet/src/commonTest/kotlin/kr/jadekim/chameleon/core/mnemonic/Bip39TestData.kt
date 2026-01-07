package kr.jadekim.chameleon.core.mnemonic

import com.goncalossilva.resources.Resource
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

object Bip39TestData {
    data class Item(
        val entropy: String,
        val mnemonic: String,
        val seed: String,
        val extendedPrivateKey: String,
        val passphrase: String?,
    )

    fun load(): Map<String, List<Item>> {
        val json = Json.parseToJsonElement(Resource("bip39_test_vectors.json").readText())

        return json.jsonObject.toMap().mapValues {
            it.value.jsonArray.map { item ->
                val values = item.jsonArray
                Item(
                    entropy = values[0].jsonPrimitive.content,
                    mnemonic = values[1].jsonPrimitive.content,
                    seed = values[2].jsonPrimitive.content,
                    extendedPrivateKey = values[3].jsonPrimitive.content,
                    passphrase = "TREZOR"
                )
            }
        }
    }
}
