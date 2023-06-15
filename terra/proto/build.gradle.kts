import com.google.protobuf.gradle.id
import java.io.BufferedReader
import java.io.InputStreamReader

plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization") version "1.8.20"
    id("com.google.protobuf") version "0.9.3"
    `java-library`
}

fun resolveTerraVersion(): String {
    val directory = File(projectDir, "dependencies/core")
    val process = ProcessBuilder("git", "describe", "--tags")
        .directory(directory)
        .start()
    val input = BufferedReader(InputStreamReader(process.inputStream))
    val noTimeout = process.waitFor(5, TimeUnit.SECONDS)
    if (!noTimeout || process.exitValue() != 0) {
        throw IllegalStateException("timeout or illegal exit value ${process.exitValue()}")
    }

    return input.use { it.readLine() }.removePrefix("v")
        .also { println("Resolved terra version : $it") }
}

version = project.version.toString() + "-" + resolveTerraVersion()

kotlin {
    jvm {
        withJava()
        jvmToolchain(11)
    }

    sourceSets {
        val commonMain by getting {
            resources.srcDir(File(buildDir, "extracted-protos/main"))

            dependencies {
                val kotlinProtobufVersion: String by project
                val kotlinxSerializationVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-proto"))

                api("kr.jadekim:kotlin-protobuf-prebuilt-kotlinx:$kotlinProtobufVersion")
                api("kr.jadekim:kotlin-protobuf-core:$kotlinProtobufVersion")
                implementation("kr.jadekim:kotlin-protobuf-kotlinx:$kotlinProtobufVersion")
                implementation("kr.jadekim:kotlin-protobuf-grpc:$kotlinProtobufVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$kotlinxSerializationVersion")
            }
        }

        val jvmMain by getting {
            dependencies {
                val protobufVersion: String by project
                val grpcVersion: String by project
                val grpcKotlinVersion: String by project

                implementation("com.google.protobuf:protobuf-java:$protobufVersion")
                implementation("io.grpc:grpc-protobuf:$grpcVersion")
                implementation("io.grpc:grpc-stub:$grpcVersion")
                implementation("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
            }
        }
    }
}

dependencies {
    val protobufVersion: String by project
    val grpcVersion: String by project

    protobuf(files("dependencies/alliance/proto"))

    implementation(project(":chameleon-cosmos:chameleon-cosmos-proto"))

    implementation("com.google.protobuf:protobuf-java:$protobufVersion")
    implementation("io.grpc:grpc-protobuf:$grpcVersion")
}

protobuf {
    protoc {
        val protobufVersion: String by project

        artifact = "com.google.protobuf:protoc:$protobufVersion"
    }

    plugins {
        val kotlinProtobufVersion: String by project

        id("kotlin-protobuf-kotlinx") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-kotlinx:$kotlinProtobufVersion:jdk8@jar"
        }
        id("kotlin-protobuf-converter-multiplatform") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-converter-multiplatform:$kotlinProtobufVersion:jdk8@jar"
        }
        id("kotlin-protobuf-converter-multiplatform-jvm") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-converter-multiplatform-jvm:$kotlinProtobufVersion:jdk8@jar"
        }

        id("grpc") {
            val grpcVersion: String by project
            artifact = "io.grpc:protoc-gen-grpc-java:$grpcVersion"
        }
        id("kotlin-protobuf-grpc-multiplatform") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-grpc-multiplatform:$kotlinProtobufVersion:jdk8@jar"
        }
        id("kotlin-protobuf-grpc-multiplatform-jvm") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-grpc-multiplatform-jvm:$kotlinProtobufVersion:jdk8@jar"
        }
    }

    generateProtoTasks {
        all().forEach {
            it.builtins {
                get("java").outputSubDir = "jvmMain/java"
            }
            it.plugins {
                id("kotlin-protobuf-kotlinx") {
                    outputSubDir = "commonMain/kotlin"
                }
                id("kotlin-protobuf-converter-multiplatform") {
                    outputSubDir = "commonMain/kotlin"
                }
                id("kotlin-protobuf-converter-multiplatform-jvm") {
                    outputSubDir = "jvmMain/kotlin"
                }

                id("grpc") {
                    outputSubDir = "jvmMain/java"
                }
                id("kotlin-protobuf-grpc-multiplatform") {
                    outputSubDir = "commonMain/kotlin"
                }
                id("kotlin-protobuf-grpc-multiplatform-jvm") {
                    outputSubDir = "jvmMain/kotlin"
                }
            }
        }
    }
}

val copyTask = tasks.register<Copy>("moveProtoResults") {
    from(File(buildDir, "generated/source/proto/main"))
    into(File(projectDir, "src"))
}

val cleanProtoTask = tasks.create("cleanProto") {
    group = "other"

    doLast {
        delete(File(projectDir, "src/commonMain"))
        delete(File(projectDir, "src/jvmMain"))
    }
}

tasks.getByName("generateProto") {
    dependsOn(cleanProtoTask)
    finalizedBy(copyTask)
}

gradle.taskGraph.whenReady {
    allTasks.filter { it.name.contains("proto", true) }
        .forEach { it.outputs.upToDateWhen { false } }
}