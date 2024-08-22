

group = "com.ratelimit"
version = "0.0.1-SNAPSHOT"

plugins {
    java
    id("org.springframework.boot") version "3.3.2"
    id("io.spring.dependency-management") version "1.1.6"
    id("repo-common")

}

repositories {
    mavenCentral()
    gradlePluginPortal()


}

dependencies {
    implementation("io.github.resilience4j:resilience4j-spring-boot3:2.2.0")
    implementation("org.springframework.boot:spring-boot-starter-aop:3.2.2")

}

tasks.test {
    useJUnitPlatform()
}