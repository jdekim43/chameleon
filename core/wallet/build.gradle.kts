kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":chameleon-core:chameleon-core-crypto"))

            implementation(libs.kotlinx.coroutine.core)

            implementation(libs.jade.common.util)
            implementation(libs.jade.common.encoder)
            implementation(libs.jade.common.crypto)

            implementation(libs.doistx.normalize)
            implementation(libs.cryptography.core)
            implementation(libs.cryptography.provider.optimal)
        }
        commonTest.dependencies {
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
        }
        jvmTest.dependencies {
            implementation(libs.acinq.secp256k1.jni.jvm)
        }
    }
}