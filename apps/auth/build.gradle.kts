
group = "com.ratelimit"
version = "0.0.1-SNAPSHOT"

plugins {
    java
    id("org.springframework.boot") version "3.3.2"
    id("io.spring.dependency-management") version "1.1.6"
}



repositories {
    mavenCentral()
    gradlePluginPortal()

}

dependencies {

}


tasks.test {
    useJUnitPlatform()
}