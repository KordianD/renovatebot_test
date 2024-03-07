import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version ("2.7.18")
    id("io.spring.dependency-management") version ("1.1.4")
    kotlin("jvm") version "1.9.23"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.core:jackson-core") {
        version {
            strictly("2.15.1")
        }
    }
}
