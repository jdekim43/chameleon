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
                api(project(":chameleon-cosmos:chameleon-cosmos-proto"))
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}