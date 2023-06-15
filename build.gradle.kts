plugins {
    kotlin("multiplatform") version "1.8.20"
    id("org.jetbrains.dokka") version "1.8.10"
    id("maven-publish")
    id("signing")
}

group = "kr.jadekim"
version = "0.1.0"

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
    }
}

configure(allprojects.filter { !it.hasProperty("IGNORE_GLOBAL_CONFIGURATION") }) {
    apply {
        plugin("kotlin-multiplatform")
        plugin("org.jetbrains.dokka")
        plugin("maven-publish")
        plugin("signing")
    }

    kotlin {
        jvm {
            jvmToolchain(11)
            testRuns["test"].executionTask.configure {
                useJUnitPlatform()
            }
        }

        sourceSets {
            val commonMain by getting
            val commonTest by getting {
                dependencies {
                    implementation(kotlin("test"))
                }
            }
//            val jvmMain by getting
//            val jvmTest by getting {
//                dependencies {
//                    val junitVersion: String by project
//
//                    implementation(kotlin("test-junit5"))
//
//                    runtimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
//                    compileOnly("org.junit.jupiter:junit-jupiter-api:$junitVersion")
//                    compileOnly("org.junit.jupiter:junit-jupiter-params:$junitVersion")
//                }
//            }
        }
    }

    val dokkaHtml by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class)
    val javadocJar: TaskProvider<Jar> by tasks.registering(Jar::class) {
        dependsOn(dokkaHtml)
        archiveClassifier.set("javadoc")
        from(dokkaHtml.outputDirectory)
    }

    publishing {
        publications.withType<MavenPublication> {
            artifact(javadocJar)
            pom {
                name.set(project.name)
                description.set("Crypto Wallet SDK for multiple blockchains")
                url.set("https://github.com/jdekim43/chameleon")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("jdekim43")
                        name.set("Jade Kim")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/jdekim43/chameleon.git")
                    developerConnection.set("scm:git:git://github.com/jdekim43/chameleon.git")
                    url.set("https://github.com/jdekim43/chameleon")
                }
            }
        }

        repositories {
            val ossrhUsername: String by project
            val ossrhPassword: String by project

            if (version.toString().endsWith("-SNAPSHOT", true)) {
                maven {
                    name = "mavenCentralSnapshot"
                    setUrl("https://s01.oss.sonatype.org/content/repositories/snapshots/")
                    credentials {
                        username = ossrhUsername
                        password = ossrhPassword
                    }
                }
            } else {
                maven {
                    name = "mavenCentral"
                    setUrl("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
                    credentials {
                        username = ossrhUsername
                        password = ossrhPassword
                    }
                }
            }
        }
    }

    signing {
        sign(publishing.publications)
    }
}

subprojects {
    group = rootProject.group
    version = rootProject.version
}
