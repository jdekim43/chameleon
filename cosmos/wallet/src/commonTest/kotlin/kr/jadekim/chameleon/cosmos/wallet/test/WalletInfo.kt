package kr.jadekim.chameleon.cosmos.wallet.test

data class WalletInfo(
    val address: String,
    val mnemonic: String,
    val privateKeyHex: String,
    val publicKeyHex: String,
    val publicKeyBech32: String,
)

val NORMAL = WalletInfo(
    address = "cosmos16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6kl7crp",
    mnemonic = "display ivory apology tenant interest coin rug garage spread among outside focus lizard grape layer corn hen zoo luxury human response betray cable damp",
    privateKeyHex = "002E3A81B72BABD3F935E7291030354FC26BA707E5F0BF93431F4423A79232C075",
    publicKeyHex = "032ABA17BE2BD796864FE5FD99AFC7F8A73A732540C93D773A9323D07F851FAB73",
    publicKeyBech32 = "cosmospub1addwnpepqv4t59a790tedpj0uh7ent78lznn5ue9gryn6ae6jv3aqlu9r74hxcwacwm",
)
