import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version ("2.7.13")
    id("io.spring.dependency-management") version ("1.1.0")
    kotlin("jvm") version "1.8.22"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.core:jackson-core") {
        version {
            strictly("2.15.1")
        }
}


