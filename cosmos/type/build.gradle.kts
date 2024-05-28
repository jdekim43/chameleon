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
                val cosmosProtoVersion: String by project

                api(project(":chameleon-core:chameleon-core-type"))

                api("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion")

                implementation("kr.jadekim:chameleon-proto-cosmos-proto:$cosmosProtoVersion")
            }
        }
    }
}
