
plugins {
    java
    idea
}

group = "com.fulln"
version = "1.0-SNAPSHOT"


repositories {
    mavenLocal()
    mavenCentral()
}


dependencies {

    implementation(platform("org.springframework.shell:spring-shell-dependencies:3.1.2"))
    implementation("org.springframework.shell:spring-shell-starter")

}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}