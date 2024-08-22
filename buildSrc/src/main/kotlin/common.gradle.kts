plugins {
    id("java")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-redis-reactive")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

repositories {
    mavenCentral()

    maven {
        url = uri("https://maven.pkg.github.com/Adaptavant/*")
        /*
            You can either set env variables or store credentials in global gradle.properties file
            On Windows: C:\Users\<you>\.gradle\gradle.properties
            On Mac/Linux: /Users/<you>/.gradle/gradle.properties

            Properties file content:

            GITHUB_USERNAME=<your-github-username>
            GITHUB_TOKEN_FULL_AUTH=<generated-github-token>

            Generate GH token here:
            https://github.com/settings/tokens/new?description=AW%20Backend%20Monorepo%20Project&scopes=read:packages
        */
        credentials {
            username = project.findProperty("GITHUB_USERNAME") as String? ?: System.getenv("GITHUB_USERNAME")
            password = project.findProperty("GITHUB_TOKEN_FULL_AUTH") as String? ?: System.getenv("GITHUB_TOKEN_FULL_AUTH")
        }
    }
}

tasks.test {
    useJUnitPlatform()
}