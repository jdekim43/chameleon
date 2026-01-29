kotlin {
    sourceSets {
        commonMain.dependencies {
            api(project(":chameleon-core:chameleon-core-wallet"))

            implementation(project(":chameleon-core:chameleon-core-crypto"))

            implementation(libs.kotlinx.coroutine.core)

            implementation(libs.jade.common.util)
            implementation(libs.jade.common.encoder)
            implementation(libs.jade.common.crypto)
        }
        jvmTest.dependencies {
            implementation(libs.acinq.secp256k1.jni.jvm)
        }
    }
}