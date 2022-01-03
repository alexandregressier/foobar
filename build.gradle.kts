// Versions ----------------------------------------------------------------------------------------

val versionGradle by extra("7.3.3")

// Plugins -----------------------------------------------------------------------------------------

plugins {
    kotlin("android") apply false
    id("com.android.application") apply false
}

// Tasks -------------------------------------------------------------------------------------------

tasks {
    wrapper {
        gradleVersion = versionGradle
    }
    register<Delete>("clean") {
        delete(rootProject.buildDir)
    }
}