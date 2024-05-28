kotlin {
    sourceSets {
//        all {
//            languageSettings {
//                optIn("kotlin.RequiresOptIn")
//            }
//        }

        val commonMain by getting {
            dependencies {
                val cosmosSdkVersion: String by project
                val initiaVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-type")) {
                    exclude("kr.jadekim", "chameleon-proto-cosmos-sdk")
                }
                api("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion")
                api("kr.jadekim:chameleon-proto-initia:$initiaVersion")
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}