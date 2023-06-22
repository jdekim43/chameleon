kotlin {
    sourceSets {
//        all {
//            languageSettings {
//                optIn("kotlin.RequiresOptIn")
//            }
//        }

        val commonMain by getting {
            dependencies {
                api(project(":chameleon-cosmos:chameleon-cosmos-type")) {
                    exclude("kr.jadekim", "chameleon-proto-cosmos-sdk")
                }
                api("kr.jadekim:chameleon-proto-cosmos-sdk:0.46.11")
                api("kr.jadekim:chameleon-proto-cosmwasm-wasmd:0.27.0") {
                    exclude("kr.jadekim", "chameleon-proto-cosmos-sdk")
                }
                api("kr.jadekim:chameleon-proto-terra-alliance:0.1.1") {
                    exclude("kr.jadekim", "chameleon-proto-cosmos-sdk")
                }
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}