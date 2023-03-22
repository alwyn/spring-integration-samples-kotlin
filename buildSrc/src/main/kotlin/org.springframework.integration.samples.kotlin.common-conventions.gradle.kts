import org.gradle.accessors.dm.LibrariesForLibs

// workaround for version catalog in buildSrc. See https://github.com/gradle/gradle/issues/15383
val libs = the<LibrariesForLibs>()

plugins {
    id("org.jetbrains.kotlin.jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(libs.spring.framework.bom))
    implementation(platform(libs.spring.integration.bom))
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
