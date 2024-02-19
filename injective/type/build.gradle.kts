kotlin {
    sourceSets {
//        all {
//            languageSettings {
//                optIn("kotlin.RequiresOptIn")
//            }
//        }

        val commonMain by getting {
            dependencies {
                api("kr.jadekim:chameleon-proto-injective-core:1.12.1")
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}