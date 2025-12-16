package kr.jadekim.chameleon.core.mnemonic

import doist.x.normalize.Form
import doist.x.normalize.normalize

internal fun String?.normalize(): String = (this ?: "").normalize(Form.NFKD)

internal fun salt(password: String?): String = "mnemonic" + (password ?: "")
