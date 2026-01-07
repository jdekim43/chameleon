repositories {
    mavenCentral()
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.jade.common.crypto)
            implementation(libs.jade.common.encoder)
            implementation(libs.acinq.secp256k1)
        }
        jvmMain.dependencies {
//            implementation(libs.acinq.secp256k1.jni.jvm)
        }
//        androidMain.dependencies {
//            implementation(libs.acinq.secp256k1.jni.android)
//        }
    }
}
