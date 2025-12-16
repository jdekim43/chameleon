kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.jade.common.crypto)
            implementation(libs.jade.common.encoder)
            implementation(libs.acinq.secp256k1)
        }
    }
}
