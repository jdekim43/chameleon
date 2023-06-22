kotlin {
    sourceSets {
//        all {
//            languageSettings {
//                optIn("kotlin.RequiresOptIn")
//            }
//        }

        val commonMain by getting {
            dependencies {
                api(project(":chameleon-core:chameleon-core-type"))

                api("kr.jadekim:chameleon-proto-cosmos-sdk:0.47.3")
            }
        }
    }
}