pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "testKmm"
include(":androidApp")
include(":shared")
//enableFeaturePreview("GRADLE_METADATA")